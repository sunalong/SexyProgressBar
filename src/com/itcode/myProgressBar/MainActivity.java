package com.itcode.myProgressBar;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.itcode.myself.R;

/**
 * ��һ��Ϊ����IOS�ľջ���ʽ��progressBar
 * �ڶ��ִ�github�ͻ������ҵ���
 * @author sunalong
 *
 */
public class MainActivity extends Activity {

	private TextView custom_pb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		custom_pb = (TextView) findViewById(R.id.custom_pb);
		AnimationDrawable backgroundAnimation = (AnimationDrawable) custom_pb.getBackground();
		backgroundAnimation.start();

	}

}
