/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
#include <unistd.h>
#include <sys/stat.h>
#include <sys/time.h>
#include <stdlib.h>
#include <stdio.h>
#include <fcntl.h>
#include <sys/types.h>
#include <jwctrl_power.h>

int pwrBoot(int cmd) {
	int ret = 0;
	int fd = -1;
	char ctl_data[2];

	memset(ctl_data, 0x00, 2);
	ctl_data[0] = cmd;

	ret = open(JWPWR_DEV, O_RDWR);
	if (ret) {
		fd = ret;
	} else {
		printf("open jwpwr faild\n");
	}

	sync();

	ret = write(fd, ctl_data, 2);
	if(ret < 0) {
		printf("write jwpwr cmd faild\n");
	}

	close(fd);

	return ret;
}

int portPwrReset(int port) {
	int ret = 0;
	int fd = -1;
	char ctl_data[2];
	
	memset(ctl_data, 0x00, 2);
	ctl_data[0] = port;

	ret = open(JWPWR_DEV, O_RDWR);

	if (ret) {
		fd = ret;
	} else {
		printf("open jwpwr faild\n");
	}

	ctl_data[1] = POWER_OFF;
	printf("ctl_data[0] = %d ctl_data[1] = %d\n", ctl_data[0], ctl_data[1]);
	ret = write(fd, ctl_data, 2);
	if(ret < 0) {
		printf("write jwpwr POWER_OFF faild\n");
	}

	ctl_data[1] = POWER_ON;
	printf("ctl_data[0] = %d ctl_data[1] = %d\n", ctl_data[0], ctl_data[1]);
	ret = write(fd, ctl_data, 2);
	if(ret < 0) {
		printf("write jwpwr POWER_OFF faild\n");
	}

	close(fd);

	return ret;
}

int portPwrCtrl(int port, int onoff) {
	int ret = 0;
	int fd = -1;
	char ctl_data[2];
	memset(ctl_data, 0x00, 2);
	ctl_data[0] = port;
	ret = open(JWPWR_DEV, O_RDWR);
	if (ret) {
		fd = ret;
	} else {
		printf("open jwpwr faild\n");
	}
	ctl_data[1] = onoff;
	ret = write(fd, ctl_data, 2);
	if(ret < 0) {
		printf("write jwpwr onoff faild\n");
	}
	close(fd);
	return ret;
}

int portPwrRead(int port) {
	int ret = 0;
	int fd = -1;
	char ctl_data[2];
	memset(ctl_data, 0x00, 2);
	ctl_data[0] = port;
	ret = open(JWPWR_DEV, O_RDWR);
	if (ret) {
		fd = ret;
	} else {
		printf("open jwpwr faild\n");
	}
	ret = read(fd, ctl_data, 2);
	if(ret < 0) {
		printf("read jwpwr status faild\n");
	}
	close(fd);
	return ctl_data[1];
}
