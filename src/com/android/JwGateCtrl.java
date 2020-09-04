package com.android;

public class JwGateCtrl {
	public final int CMD_REBOOT = 0xFF;//
	public final int CMD_SHUTDOWN = 0xFE;//
	public final int PORT_RELAY	= 0xED;	// GPIO7_B5	237 0xED 
	public final int PORT_RED =	0xB3;	// GPIO5_C3	179 0xB3
	public final int PORT_GREEN = 0xB2;	// GPIO5_C2	178 0xB2
	public final int PORT_BLUE	= 0xEB;	// GPIO7_B3	235 0xEB
	
	public final int PORT_LED_PWR = 0x3e; // 2_A6 LED LIGHT_POWER_Control
	public final int PORT_LED_R = 0xab;  // 5_C3 灯板供电接口 (J21 pin1)
	public final int PORT_SHARP_IR = 0x02; // 0_A1 人体感应
	public final int PORT_J3_GPIO1 = 0x9a;  // 5_C2 GPIO_UART_SPI0 (J3 pin2)
	public final int PORT_J3_GPIO2 = 0x99;   // 5_C1 GPIO_UART_SPI0 (J3 pin3)
	public final int PORT_CON30 = 0x30; // 7_A6 HOST USB1 CON30_USB_PWR
	public final int PORT_OPENDOOR = 0xe3;  // 7_B3 开门按钮
	public final int PORT_RING = 0xe4; // 7_B4 门铃接口 (J5 pin1)
	public final int PORT_OPENDOOR_CON = 0xe5; // 7_B5 用于门口机开锁,检测门磁 (J8 pin4)
	public final int PORT_NOT_CLOSE_TEST = 0xe8;// 7_C0 用于门口机开锁,检测门磁 Not close-test (J8 pin3)
	public final int PORT_J8_P2 = 0xfb; // 8_A3 用于门口机开锁,检测门磁 Opendoor-con (J8 pin2)
	
	public final int PORT_J24_P2 = 0xcb; // 6_C3 安防接口 (J24 pin2)
	public final int PORT_J24_P3 = 0xc8; // 6_C0 安防接口 (J24 pin3)
	public final int PORT_J24_P4 = 0xc9; // 6_C1 安防接口 (J24 pin4)
	public final int PORT_J24_P5 = 0xca; // 6_C2 安防接口 (J24 pin5)
	
	public final int PORT_J14_P2 = 0xe1;// 7_B1 安防接口 (J14 pin2)
	public final int PORT_J14_P3 = 0xf9; // 8_A7 安防接口 (J14 pin3)
	public final int PORT_J14_P4 = 0xec; // 6_C5 安防接口 (J14 pin4)
	public final int PORT_J14_P5 = 0xed;// 6_C6 安防接口 (J14 pin5) 
	
	public final int POWER_OFF = 0x00; 
	public final int POWER_ON = 0x01;
	public native int pwrBoot(int cmd);// 重启和关机
	public native int portPwrCtrl(int port, int onoff);// 控制io拉高拉低
	public native int portPwrReset(int port);// 控制io复位
	public native int portPwrRead(int port);// 读取io的值，1是高，0是低
	static {
		System.loadLibrary("gatectrl");
	}
}