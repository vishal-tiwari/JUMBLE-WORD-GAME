package com.infinity.jumbleword;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class UserActivity extends Activity {

	TextView tv;
	String n,l;
	RadioGroup rg;
	Intent intent;
	RadioButton a,b,c;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user);
		tv=(TextView) findViewById(R.id.textView1);
		rg=(RadioGroup) findViewById(R.id.radioGroup1);
		a=(RadioButton) findViewById(R.id.radio0);
		b=(RadioButton) findViewById(R.id.radio1);
		c=(RadioButton) findViewById(R.id.radio2);
		Intent i=getIntent();
		n=i.getStringExtra("name");
		tv.setText("Welcome "+n);
	}
	 protected void onResume() {
			// TODO Auto-generated method stub
			   super.onResume();
			   intent=new Intent(this,jumbleService.class);
			   startService(intent);
		   }
		   protected void onPause() {
			   // TODO Auto-generated method stub
			   super.onPause();
			   stopService(intent);
		   }
	public void play(View v){
		Intent i=new Intent(this,GameActivity.class);
		if(a.isChecked()){
			l="1";
			i.putExtra("name", n);
			i.putExtra("level", "1");
			startActivity(i);
		}
		if(b.isChecked()){
			i.putExtra("name", n);
			i.putExtra("level", "2");
			startActivity(i);
		}
		if(c.isChecked()){
			i.putExtra("name", n);
			i.putExtra("level", "3");
			startActivity(i);
		}
		
		
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.user, menu);
		return true;
	}

}
