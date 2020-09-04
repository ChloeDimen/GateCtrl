package com.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.FlagToString;
import android.widget.Button;
import android.widget.Toast;

public class WRBActivity extends Activity {

	// private Button btn_b;
	// private Boolean flagBoolean = true;
	JwGateCtrl api;
	private Button btn_red;
	private Button btn_blue;
	private Button btn_white;
	private Button btn_close;
	
	private boolean isColse = false;
	private boolean isRed=false;
	private boolean isBlue=false;
	private boolean isWhite=false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wrb);
		api = new JwGateCtrl();

		initView();
		initListener();
		
	}

	private void initListener() {
		
		btn_red.setOnClickListener(new MyClickListener());
		btn_blue.setOnClickListener(new MyClickListener());
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
					btn_blue.setText("蓝灯关闭");
					isRed=true;
				}else {
					api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
					btn_red.setText("红灯关闭");
					btn_white.setText("白灯关闭");
					btn_blue.setText("蓝灯关闭");
					isRed=false;
				}
				
				break;
			
			case R.id.btn_blue://亮蓝灯
				if (isBlue==false) {
					api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_ON);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
					btn_blue.setText("蓝灯打开");
					btn_red.setText("红灯关闭");
					btn_white.setText("白灯关闭");
					
					isBlue=true;
				}else {
					api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);	
					btn_blue.setText("蓝灯关闭");
					btn_red.setText("红灯关闭");
					btn_white.setText("白灯关闭");
					isBlue=false;
				}
				
				
				break;
			case R.id.btn_white://亮白灯
				if (isWhite==false) {
					api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_ON);
					btn_white.setText("白灯打开");
					btn_red.setText("红灯关闭");
					
					btn_blue.setText("蓝灯关闭");
					isWhite=true;
				}else {
					api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
					btn_white.setText("白灯关闭");
					btn_red.setText("红灯关闭");
				
					btn_blue.setText("蓝灯关闭");
					isWhite=false;
				}
				
				break;
			case R.id.btn_close://关灯
				
					api.portPwrCtrl(api.PORT_RED, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_GREEN, api.POWER_OFF);
					api.portPwrCtrl(api.PORT_BLUE, api.POWER_OFF);
					btn_red.setText("红灯关闭");
					btn_white.setText("白灯关闭");
					btn_blue.setText("蓝灯关闭");
					isBlue=false;
					isRed=false;
					isWhite=false;
				
				break;
			

			}

		}

	}

	private void initView() {
		
		btn_red = (Button) findViewById(R.id.btn_red);
		
		btn_blue = (Button) findViewById(R.id.btn_blue);
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
