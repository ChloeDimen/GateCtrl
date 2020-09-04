#include <stdio.h>
#include <stdlib.h>
#include <dlfcn.h>
#include <string.h>
#include <stdint.h>
#include <unistd.h>
#include <fcntl.h>
#include <errno.h>

#include <jwctrl_power.h>

int main(void) {
	int ret =0;

	ret = usbPower(1, POWER_ON);
	ret = uartPower(1, POWER_ON);

	return ret;
}
