package com.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MichActivity extends Activity{
	JwGateCtrl api;
	
	
 @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_mich);
	api = new JwGateCtrl();
	initView();
	
}

 //设备重启
 public  void control_open(View view) {
int position=	api.portPwrReset(api.CMD_REBOOT);
	Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}
//设备关机
 public void control_close(View view) {
	int position=	api.portPwrReset(api.CMD_SHUTDOWN);
	Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}
//2_A6 LED LIGHT_POWER_Control
 public void led_control_open(View view) {
	int position=	  api.portPwrCtrl(api.PORT_LED_PWR, api.POWER_ON);
	Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}

 public void led_control_close(View view) {
	int position= api.portPwrCtrl(api.PORT_LED_PWR, api.POWER_OFF);
	Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}
 public void get_led_control(View view) {
	int position= api.portPwrRead(api.PORT_LED_PWR);
	tv_led_data.setText(position+"");
	Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}

// 5_C3 灯板供电接口 (J21 pin1)
 public void j21_pin1_control_open(View view) {
	int position=   api.portPwrCtrl(api.PORT_LED_R, api.POWER_ON);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}

 public void j21_pin1_control_close(View view) {
	int position=   api.portPwrCtrl(api.PORT_LED_R, api.POWER_OFF);
	Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}

 public void get_j21_pin1_control(View view) {
	int position= api.portPwrRead(api.PORT_LED_R);
	tv_j21_pin1_data.setText(position+"");
	 
}

//0_A1 人体感应
 public void A1_control_open(View view) {
	int position=   api.portPwrCtrl(api.PORT_SHARP_IR, api.POWER_ON);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}

 public void A1_control_close(View view) {
	int position=   api.portPwrCtrl(api.PORT_SHARP_IR, api.POWER_OFF);
	 Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}
 public void get_A1_control(View view) {
	int position= api.portPwrRead(api.PORT_SHARP_IR);
	tv_A1_data.setText(position+"");
	 
}
//5_C2 GPIO_UART_SPI0 (J3 pin2)
 public void J3_pin2_control_open(View view) {
	int position=    api.portPwrCtrl(api.PORT_J3_GPIO1, api.POWER_ON);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}

 public void J3_pin2_control_close(View view) {
	int position=    api.portPwrCtrl(api.PORT_J3_GPIO1, api.POWER_OFF);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}
 public void get_J3_pin2_control(View view) {
	int position= api.portPwrRead(api.PORT_J3_GPIO1);
	tv_J3_pin2_data.setText(position+"");
	 
}

//5_C1 GPIO_UART_SPI0 (J3 pin3)
 public void J3_pin3_control_open(View view) {
	int position=    api.portPwrCtrl(api.PORT_J3_GPIO2, api.POWER_ON);
	 Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}

 public void J3_pin3_control_close(View view) {
	int position=    api.portPwrCtrl(api.PORT_J3_GPIO2, api.POWER_OFF);
	 Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}
 public void get_J3_pin3_control(View view) {
	int position= api.portPwrRead(api.PORT_J3_GPIO2);
	tv_J3_pin3_data.setText(position+"");
	 
}
//7_A6 HOST USB1 CON30_USB_PWR
 public void CON30_USB_control_open(View view) {
	int position=  api.portPwrCtrl(api.PORT_CON30, api.POWER_ON);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();
}

 public void CON30_USB_control_close(View view) {
	int position=  api.portPwrCtrl(api.PORT_CON30, api.POWER_OFF);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();  
}
 public void get_CON30_USB_control(View view) {
	int position= api.portPwrRead(api.PORT_CON30);
	tv_CON30_USB_data.setText(position+"");
	 
}
// 7_B3 开门按钮
 public void door7_B3_control_open(View view) {
	int position=  api.portPwrCtrl(api.PORT_OPENDOOR, api.POWER_ON);
	 Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();  
}

 public void door7_B3_control_close(View view) {
	int position=  api.portPwrCtrl(api.PORT_OPENDOOR, api.POWER_OFF);
	 Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();  
}
 public void get_7_B3_control(View view) {
	int position= api.portPwrRead(api.PORT_OPENDOOR);
	tv_7_B3_data.setText(position+"");
	 
}
// 7_B4 门铃接口 (J5 pin1)
 public void J5_pin1_control_open(View view) {
	int position=  api.portPwrCtrl(api.PORT_RING, api.POWER_ON);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();  
}

 public void J5_pin1_control_close(View view) {
	int position=   api.portPwrCtrl(api.PORT_RING, api.POWER_OFF);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();  
}
 public void get_J5_pin1_control(View view) {
	int position= api.portPwrRead(api.PORT_RING);
	tv_J5_pin1_data.setText(position+"");
	 
}

//7_B5 用于门口机开锁,检测门磁 (J8 pin4)
 public void J8_pin4_control_open(View view) {
	int position=   api.portPwrCtrl(api.PORT_OPENDOOR_CON, api.POWER_ON);
	Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();  
}

 public void J8_pin4_control_close(View view) {
	int position=   api.portPwrCtrl(api.PORT_OPENDOOR_CON, api.POWER_OFF);
	Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();   
}
 public void get_J8_pin4_control(View view) {
	int position= api.portPwrRead(api.PORT_OPENDOOR_CON);
	tv_J8_pin4_data.setText(position+"");
	 
}
//7_C0 用于门口机开锁,检测门磁 Not close-test (J8 pin3)
 public void J8_pin3_control_open(View view) {
	int position=  api.portPwrCtrl(api.PORT_NOT_CLOSE_TEST, api.POWER_ON);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();  
}

 public void J8_pin3_control_close(View view) {
	int position=  api.portPwrCtrl(api.PORT_NOT_CLOSE_TEST, api.POWER_OFF);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();  
}
 public void get_J8_pin3_control(View view) {
	int position= api.portPwrRead(api.PORT_NOT_CLOSE_TEST);
	tv_J8_pin3_data.setText(position+"");
	 
}
// 8_A3 用于门口机开锁,检测门磁 Opendoor-con (J8 pin2)
 public void J8_pin2_control_open(View view) {
	int position=  api.portPwrCtrl(api.PORT_J8_P2, api.POWER_ON);
	 Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}

 public void J8_pin2_control_close(View view) {
	int position=  api.portPwrCtrl(api.PORT_J8_P2, api.POWER_OFF);
	 Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();   
}
 public void get_J8_pin2_control(View view) {
	int position= api.portPwrRead(api.PORT_J8_P2);
	tv_J8_pin2_data.setText(position+"");
	 
}
//6_C3 安防接口 (J24 pin2)
 public void J24_pin2_control_open(View view) {
	int position=   api.portPwrCtrl(api.PORT_J24_P2, api.POWER_ON);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}

 public void J24_pin2_control_close(View view) {
	int position=   api.portPwrCtrl(api.PORT_J24_P2, api.POWER_OFF);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}
 public void get_J24_pin2_control(View view) {
	int position= api.portPwrRead(api.PORT_J24_P2);
	tv_J24_pin2_data.setText(position+"");
	 
}
//6_C0 安防接口 (J24 pin3)
 public void J24_pin3_control_open(View view) {
	int position=   api.portPwrCtrl(api.PORT_J24_P3, api.POWER_ON);
	Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}

 public void J24_pin3_control_close(View view) {
	int position=   api.portPwrCtrl(api.PORT_J24_P3, api.POWER_OFF);
	Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}
 public void get_J24_pin3_control(View view) {
	int position= api.portPwrRead(api.PORT_J24_P3);
	tv_J24_pin3_data.setText(position+"");
	 
}
// 6_C1 安防接口 (J24 pin4)
 public void J24_pin4_control_open(View view) {
	int position=  api.portPwrCtrl(api.PORT_J24_P4, api.POWER_ON);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}

 public void J24_pin4_control_close(View view) {
	int position= api.portPwrCtrl(api.PORT_J24_P4, api.POWER_OFF);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show();   
}
 public void get_J24_pin4_control(View view) {
	int position= api.portPwrRead(api.PORT_J24_P4);
	tv_J24_pin4_data.setText(position+"");
	 
}
// 6_C2 安防接口 (J24 pin5)
 public void J24_pin5_control_open(View view) {
	 int position= api.portPwrCtrl(api.PORT_J24_P5, api.POWER_ON);
	 Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}

 public void J24_pin5_control_close(View view) {
	 int position=  api.portPwrCtrl(api.PORT_J24_P5, api.POWER_OFF);
	 Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}
 public void get_J24_pin5_control(View view) {
	int position= api.portPwrRead(api.PORT_J24_P5);
	tv_J24_pin5_data.setText(position+"");
	 
}
// 7_B1 安防接口 (J14 pin2)
 public void J14_pin2_control_open(View view) {
	int position=  api.portPwrCtrl(api.PORT_J14_P2, api.POWER_ON);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}

 public void J14_pin2_control_close(View view) {
	int position= api.portPwrCtrl(api.PORT_J14_P2, api.POWER_OFF);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}
 public void get_J14_pin2_control(View view) {
	int position= api.portPwrRead(api.PORT_J14_P2);
	tv_J14_pin2_data.setText(position+"");
	 
}
// 8_A7 安防接口 (J14 pin3)
 public void J14_pin3_control_open(View view) {
	int position= api.portPwrCtrl(api.PORT_J14_P3, api.POWER_ON);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 

}

 public void J14_pin3_control_close(View view) {
	int position=  api.portPwrCtrl(api.PORT_J14_P3, api.POWER_OFF);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
 
}
 public void get_J14_pin3_control(View view) {
	int position= api.portPwrRead(api.PORT_J14_P3);
	tv_J14_pin3_data.setText(position+"");
	 
}
// 6_C5 安防接口 (J14 pin4)
 public void J14_pin4_control_open(View view) {
	int position=  api.portPwrCtrl(api.PORT_J14_P4, api.POWER_ON);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 

}

 public void J14_pin4_control_close(View view) {
	int position=  api.portPwrCtrl(api.PORT_J14_P4, api.POWER_OFF);
	  Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
 
}
 public void get_J14_pin4_control(View view) {
	int position= api.portPwrRead(api.PORT_J14_P4);
	tv_J14_pin4_data.setText(position+"");
	 
}
// 6_C6 安防接口 (J14 pin5)
 public void J14_pin5_control_open(View view) {
	int position=  api.portPwrCtrl(api.PORT_J14_P5, api.POWER_ON);
	Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}

 public void J14_pin5_control_close(View view) {
	int position=  api.portPwrCtrl(api.PORT_J14_P5, api.POWER_OFF);
	Toast.makeText(MichActivity.this, position+"", Toast.LENGTH_SHORT).show(); 
}
 public void get_J14_pin5_control(View view) {
	int position= api.portPwrRead(api.PORT_J14_P5);
	tv_J14_pin5_data.setText(position+"");
	 
}
private TextView tv_led_data;
private TextView tv_j21_pin1_data;
private TextView tv_A1_data;
private TextView tv_J3_pin2_data;
private TextView tv_J3_pin3_data;
private TextView tv_CON30_USB_data;
private TextView tv_7_B3_data;
private TextView tv_J5_pin1_data;
private TextView tv_J8_pin4_data;
private TextView tv_J8_pin3_data;
private TextView tv_J8_pin2_data;
private TextView tv_J24_pin2_data;
private TextView tv_J24_pin3_data;
private TextView tv_J24_pin4_data;
private TextView tv_J24_pin5_data;
private TextView tv_J14_pin2_data;
private TextView tv_J14_pin3_data;
private TextView tv_J14_pin4_data;
private TextView tv_J14_pin5_data;



private void initView() {
	

	tv_led_data=(TextView)findViewById(R.id.tv_led_data);
	tv_j21_pin1_data=(TextView)findViewById(R.id.tv_j21_pin1_data);
	tv_A1_data=(TextView)findViewById(R.id.tv_A1_data);
	tv_J3_pin2_data=(TextView)findViewById(R.id.tv_J3_pin2_data);
	tv_J3_pin3_data=(TextView)findViewById(R.id.tv_J3_pin3_data);
	tv_CON30_USB_data=(TextView)findViewById(R.id.tv_CON30_USB_data);
	tv_7_B3_data=(TextView)findViewById(R.id.tv_7_B3_data);
	tv_J5_pin1_data=(TextView)findViewById(R.id.tv_J5_pin1_data);
	tv_J8_pin4_data=(TextView)findViewById(R.id.tv_J8_pin4_data);
	tv_J8_pin3_data=(TextView)findViewById(R.id.tv_J8_pin3_data);
	tv_J8_pin2_data=(TextView)findViewById(R.id.tv_J8_pin2_data);
	tv_J24_pin2_data=(TextView)findViewById(R.id.tv_J24_pin2_data);
	tv_J24_pin3_data=(TextView)findViewById(R.id.tv_J24_pin3_data);
	tv_J24_pin4_data=(TextView)findViewById(R.id.tv_J24_pin4_data);
	tv_J24_pin5_data=(TextView)findViewById(R.id.tv_J24_pin5_data);
	tv_J14_pin2_data=(TextView)findViewById(R.id.tv_J14_pin2_data);
	tv_J14_pin3_data=(TextView)findViewById(R.id.tv_J14_pin3_data);

	tv_J14_pin4_data=(TextView)findViewById(R.id.tv_J14_pin4_data);
	tv_J14_pin5_data=(TextView)findViewById(R.id.tv_J14_pin5_data);

	
	
}

}
