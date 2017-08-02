package com.infinity.jumbleword;

import java.util.ArrayList;
import java.util.Collections;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends Activity {

	TextView t,v,tv;
	EditText et;
	String n,l,a,s;
	Intent intent;
	int i=0;
	int score=0,attempt=3,total=20;
	SQLiteDatabase db;
	AlertDialog.Builder adb;
	Intent p;
	ArrayList<String> st=new ArrayList<String>();
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		t=(TextView) findViewById(R.id.textView1);
		v=(TextView) findViewById(R.id.textView2);
		et=(EditText) findViewById(R.id.editText1);
		tv=(TextView) findViewById(R.id.textView3);
		intent=getIntent();
		n=intent.getStringExtra("name");
		l=intent.getStringExtra("level").toString().trim();
		t.setText("Score = "+score);
	
		tv.setText("Life = "+attempt+" ");
		db=openOrCreateDatabase("jumbleword", MODE_PRIVATE, null);
		try{
			Cursor c=db.rawQuery("select word from jumble where level = '"+l+"' order by random() limit 20", null);
			
			while(c.moveToNext()){
				st.add(c.getString(0));
				
			}
			
		}
		catch(Exception e){
			Toast.makeText(this, "No record Found", Toast.LENGTH_LONG).show();
		}
		suff();
    }
	 protected void onResume() {
			// TODO Auto-generated method stub
			   super.onResume();
			   p=new Intent(this,jumbleService.class);
			   startService(p);
		   }
		   protected void onPause() {
			   // TODO Auto-generated method stub
			   super.onPause();
			   stopService(p);
		   }
	public void suff(){
		if(i<20){
			ArrayList<Character> al = new ArrayList<Character>();
		       s=st.get(i).toString();
		        for(int j=0; j<s.length(); j++){
		        	al.add(s.charAt(j));
		        }
		        Collections.shuffle(al);
		        v.setText(al.toString());
		        String result = "";
		        for (Character character : al) {
		            result += character;
		        }
		        v.setText(result.toString());
		        i++;
		}
		else{
			Intent i=new Intent(this,ScoreActivity.class);
			i.putExtra("s", score);
			i.putExtra("result", "Hurray !!! You won the game");
			startActivity(i);
			finish();
		}
	}
	public void next(View v){
		String r=et.getText().toString().trim();
		if(r.equals(s)){
			et.setText("");
			score+=10;
			t.setText("Score = "+score);
			suff();
		}
		
		else if(!r.equals(s)){
			attempt--;
			et.setText("");
			Toast toast=Toast.makeText(this, "Wrong attempt", Toast.LENGTH_SHORT);
			
			toast.show();
			if(attempt>=0){
				tv.setText("Life = "+attempt+" ");
				suff();
			}
			else{
				Intent i=new Intent(this,ScoreActivity.class);
				i.putExtra("s", score);
				i.putExtra("result", "Sorry !!! You lost the game");
				startActivity(i);
				finish();
			}
		}
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game, menu);
		return true;
	}

}
