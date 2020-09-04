#ifndef __JWCTRL_POWER_H__
#define __JWCTRL_POWER_H__

//#define JWPWR_DEV	"/dev/jwgatectrl"
#define JWPWR_DEV	"/dev/jwpwrctrl"

#define CMD_REBOOT		0xFF
#define CMD_SHUTDOWN	0xFE

#if 0
#define PORT_RELAY		0xED	// GPIO7_B5	237 0xED
#define PORT_RED		0xB3	// GPIO5_C3	179 0xB3
#define PORT_GREEN		0xB2	// GPIO5_C2	178 0xB2
#define PORT_BLUE		0xEB	// GPIO7_B3	235 0xEB
#define LED_OFF			0x00
#define LED_ON			0x01
#define GATE_CLOSE		0x00
#define GATE_OPEN		0x01
#else
#define PORT_LED_PWR	0x3e            // 2_A6 LED LIGHT_POWER_Control
#define PORT_LED_R		0xab            // 5_C3 灯板供电接口 (J21 pin1)

#define PORT_SHARP_IR	0x02            // 0_A1 人体感应
#define PORT_J3_GPIO1	0x9a            // 5_C2 GPIO_UART_SPI0 (J3 pin2)
#define PORT_J3_GPIO2	0x99            // 5_C1 GPIO_UART_SPI0 (J3 pin3)
#define PORT_CON30		0x30            // 7_A6 HOST USB1 CON30_USB_PWR
#define PORT_OPENDOOR	0xe3            // 7_B3 开门按钮
#define PORT_RING		0xe4            // 7_B4 门铃接口 (J5 pin1)
#define PORT_OPENDOOR_CON	0xe5        // 7_B5 用于门口机开锁,检测门磁 (J8 pin4)
#define PORT_NOT_CLOSE_TEST		0xe8    // 7_C0 用于门口机开锁,检测门磁 Not close-test (J8 pin3)
#define PORT_J8_P2		0xfb            // 8_A3 用于门口机开锁,检测门磁 Opendoor-con (J8 pin2)

#define PORT_J24_P2		0xcb            // 6_C3 安防接口 (J24 pin2)
#define PORT_J24_P3		0xc8            // 6_C0 安防接口 (J24 pin3)
#define PORT_J24_P4		0xc9            // 6_C1 安防接口 (J24 pin4)
#define PORT_J24_P5		0xca            // 6_C2 安防接口 (J24 pin5)

#define PORT_J14_P2		0xe1            // 7_B1 安防接口 (J14 pin2)
#define PORT_J14_P3		0xf9            // 8_A7 安防接口 (J14 pin3)
#define PORT_J14_P4		0xec            // 6_C5 安防接口 (J14 pin4)
#define PORT_J14_P5		0xed            // 6_C6 安防接口 (J14 pin5)
#endif

#define POWER_OFF	0x00
#define POWER_ON	0x01

int pwrBoot(int cmd);
int portPwrReset(int port);
int portPwrCtrl(int port, int onoff);
int portPwrRead(int port);
#endif /* __JWCTRL_POWER_H__ */
