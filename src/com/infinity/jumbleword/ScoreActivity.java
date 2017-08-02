package com.infinity.jumbleword;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class ScoreActivity extends Activity {

	TextView tv,v,vt;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_score);
		
		tv=(TextView) findViewById(R.id.textView2);
		v=(TextView) findViewById(R.id.textView3);
		vt=(TextView) findViewById(R.id.textView1);
		Intent i=getIntent();
		int score=i.getIntExtra("s", 0);
		String result=i.getStringExtra("result");
		tv.setText("Score = "+score);
		v.setText(result);
		v.startAnimation((Animation)AnimationUtils.loadAnimation(this, R.anim.translate));
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.score, menu);
		return true;
	}

}
