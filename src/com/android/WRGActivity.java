package com.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.FlagToString;
import android.widget.Button;
import android.widget.Toast;

public class WRGActivity extends Activity {

	// private Button btn_b;
	// private Boolean flagBoolean = true;
	JwGateCtrl api;
	private Button btn_red;
	private Button btn_green;
	private Button btn_white;
	private Button btn_close;
	
	private boolean isColse = false;
	private boolean isRed=false;
	private boolean isGreen=false;
	private boolean isWhite=false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wrg);
		api = new JwGateCtrl();

		initView();
		initListener();
		
	}

	private void initListener() {
		
		btn_red.setOnClickListener(new MyClickListener());
		btn_green.setOnClickListener(new MyClickListener());
		btn_white.setOnClickListener(new MyClickListener());
		btn_close.setOnClickListener(new MyClickListener());
	}

	class MyClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {

			switch (v.getId()) {
			case R.id.btn_red://亮红灯
				if (isRed==false) {
					api.portPwrCtrl(api.PORT_RED, api.POWER_ON);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
					btn_red.setText("红灯打开");
					btn_white.setText("白灯关闭");
					btn_green.setText("绿灯关闭");
					isRed=true;
				}else {
					api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
					btn_red.setText("红灯关闭");
					btn_white.setText("白灯关闭");
					btn_green.setText("绿灯关闭");
					isRed=false;
				}
				
				break;
			
			case R.id.btn_green://亮绿灯
				if (isGreen==false) {
					api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_ON);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
					btn_green.setText("绿灯打开");
					btn_red.setText("红灯关闭");
					btn_white.setText("白灯关闭");
					
					isGreen=true;
				}else {
					api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);	
					btn_green.setText("绿灯关闭");
					btn_red.setText("红灯关闭");
					btn_white.setText("白灯关闭");
					isGreen=false;
				}
				
				
				break;
			case R.id.btn_white://亮白灯
				if (isWhite==false) {
					api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_ON);
					btn_white.setText("白灯打开");
					btn_red.setText("红灯关闭");
					
					btn_green.setText("绿灯关闭");
					isWhite=true;
				}else {
					api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
					btn_white.setText("白灯关闭");
					btn_red.setText("红灯关闭");
				
					btn_green.setText("绿灯关闭");
					isWhite=false;
				}
				
				break;
			case R.id.btn_close://关灯
				
					api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
					btn_red.setText("红灯关闭");
					btn_white.setText("白灯关闭");
					btn_green.setText("绿灯关闭");
					isGreen=false;
					isRed=false;
					isWhite=false;
				
				break;
			

			}

		}

	}

	private void initView() {
		
		btn_red = (Button) findViewById(R.id.btn_red);
		
		btn_green = (Button) findViewById(R.id.btn_green);
		btn_white = (Button) findViewById(R.id.btn_white);
		btn_close = (Button) findViewById(R.id.btn_close);
		
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
		api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
		api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
	}
}
