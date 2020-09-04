package com.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.FlagToString;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	// private Button btn_b;
	// private Boolean flagBoolean = true;
	JwGateCtrl api;
	private Button btn_red;
	private Button btn_green;
	private Button btn_blue;
	private Button btn_white;
	private Button btn_close;
	private Button btn_turn_on;
	private Button btn_turn_off;
	private boolean flagTurn = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		api = new JwGateCtrl();

		initView();
		initListener();
		/*
		 * btn_b = (Button) findViewById(R.id.btn_b);
		 * btn_b.setOnClickListener(new View.OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub // api.pwrBoot(api.CMD_REBOOT); //
		 * api.pwrBoot(api.CMD_SHUTDOWN);
		 * 
		 * if (flagBoolean) { api.portPwrCtrl(api.PORT_RELAY, api.POWER_OFF);
		 * flagBoolean = false; } else { api.portPwrCtrl(api.PORT_RELAY,
		 * api.POWER_ON); flagBoolean = true; } } });
		 */
	}

	private void initListener() {
		
		btn_red.setOnClickListener(new MyClickListener());
		btn_green.setOnClickListener(new MyClickListener());
		btn_blue.setOnClickListener(new MyClickListener());
		btn_white.setOnClickListener(new MyClickListener());
		btn_close.setOnClickListener(new MyClickListener());
		btn_turn_on.setOnClickListener(new MyClickListener());
		btn_turn_off.setOnClickListener(new MyClickListener());
	}

	class MyClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {

			switch (v.getId()) {
			case R.id.btn_red://亮红灯
				api.portPwrCtrl(api.PORT_RED, api.POWER_ON);
				api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
				api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
				break;
			case R.id.btn_green://亮绿灯
				api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
				api.portPwrCtrl(api.PORT_GREEN, api.POWER_ON);
				api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
				break;
			case R.id.btn_blue://亮蓝灯
				api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
				api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
				api.portPwrCtrl(api.PORT_BLUE, api.POWER_ON);
				break;
			case R.id.btn_white://亮白灯
				api.portPwrCtrl(api.PORT_RED, api.POWER_ON);
				api.portPwrCtrl(api.PORT_GREEN, api.POWER_ON);
				api.portPwrCtrl(api.PORT_BLUE, api.POWER_ON);
				break;
			case R.id.btn_close://关灯
				api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
				api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
				api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
				break;
			case R.id.btn_turn_on://继电器控制开门
					api.portPwrCtrl(api.PORT_RELAY, api.POWER_ON);
				
				break;
			case R.id.btn_turn_off://继电器控制关门
					api.portPwrCtrl(api.PORT_RELAY, api.POWER_OFF);
					
				break;

			}

		}

	}

	private void initView() {
		
		btn_red = (Button) findViewById(R.id.btn_red);
		btn_green = (Button) findViewById(R.id.btn_green);
		btn_blue = (Button) findViewById(R.id.btn_blue);
		btn_white = (Button) findViewById(R.id.btn_white);
		btn_close = (Button) findViewById(R.id.btn_close);
		btn_turn_on = (Button) findViewById(R.id.btn_turn_on);
		btn_turn_off = (Button) findViewById(R.id.btn_turn_off);
	}
}
