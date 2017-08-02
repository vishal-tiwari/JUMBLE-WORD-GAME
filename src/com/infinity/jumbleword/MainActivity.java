package com.infinity.jumbleword;



import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends Activity {

	EditText et;
    SQLiteDatabase db;
    Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText) findViewById(R.id.editText1);
     
		db=openOrCreateDatabase("jumbleword", MODE_PRIVATE, null);
		try{
			db.execSQL("create table jumble(word varchar(20),level varchar(20))");
			db.execSQL("insert into jumble values ('seven','1')");
			db.execSQL("insert into jumble values ('world','1')");
			db.execSQL("insert into jumble values ('about','1')");
			db.execSQL("insert into jumble values ('again','1')");
			db.execSQL("insert into jumble values ('heart','1')");
			db.execSQL("insert into jumble values ('pizza','1')");
			db.execSQL("insert into jumble values ('water','1')");
			db.execSQL("insert into jumble values ('happy','1')");
			db.execSQL("insert into jumble values ('sixty','1')");
			db.execSQL("insert into jumble values ('board','1')");
			db.execSQL("insert into jumble values ('month','1')");
			db.execSQL("insert into jumble values ('angel','1')");
			db.execSQL("insert into jumble values ('green','1')");
			db.execSQL("insert into jumble values ('death','1')");
			db.execSQL("insert into jumble values ('music','1')");
			db.execSQL("insert into jumble values ('fifty','1')");
			db.execSQL("insert into jumble values ('party','1')");
			db.execSQL("insert into jumble values ('kelly','1')");
			db.execSQL("insert into jumble values ('mouth','1')");
			db.execSQL("insert into jumble values ('three','1')");
			db.execSQL("insert into jumble values ('piano','1')");
			db.execSQL("insert into jumble values ('woman','1')");
			db.execSQL("insert into jumble values ('sugar','1')");
			db.execSQL("insert into jumble values ('dream','1')");
			db.execSQL("insert into jumble values ('laugh','1')");
			db.execSQL("insert into jumble values ('apple','1')");
			db.execSQL("insert into jumble values ('amber','1')");
			db.execSQL("insert into jumble values ('tiger','1')");
			db.execSQL("insert into jumble values ('faith','1')");
			db.execSQL("insert into jumble values ('earth','1')");
			db.execSQL("insert into jumble values ('money','1')");
			db.execSQL("insert into jumble values ('rever','1')");
			db.execSQL("insert into jumble values ('words','1')");
			db.execSQL("insert into jumble values ('peace','1')");
			db.execSQL("insert into jumble values ('smile','1')");
			db.execSQL("insert into jumble values ('forty','1')");
			db.execSQL("insert into jumble values ('watch','1')");
			db.execSQL("insert into jumble values ('alone','1')");
			db.execSQL("insert into jumble values ('house','1')");
			db.execSQL("insert into jumble values ('south','1')");
			db.execSQL("insert into jumble values ('after','1')");
			db.execSQL("insert into jumble values ('stone','1')");
			db.execSQL("insert into jumble values ('lemon','1')");
			db.execSQL("insert into jumble values ('light','1')");
			db.execSQL("insert into jumble values ('power','1')");
			db.execSQL("insert into jumble values ('today','1')");
			db.execSQL("insert into jumble values ('india','1')");
			db.execSQL("insert into jumble values ('night','1')");
			db.execSQL("insert into jumble values ('april','1')");
			db.execSQL("insert into jumble values ('birth','1')");
			db.execSQL("insert into jumble values ('plant','1')");
			db.execSQL("insert into jumble values ('orange','2')");
			db.execSQL("insert into jumble values ('silver','2')");
			db.execSQL("insert into jumble values ('family','2')");
			db.execSQL("insert into jumble values ('twelve','2')");
			db.execSQL("insert into jumble values ('thirty','2')");
			db.execSQL("insert into jumble values ('donate','2')");
			db.execSQL("insert into jumble values ('people','2')");
			db.execSQL("insert into jumble values ('future','2')");
			db.execSQL("insert into jumble values ('banana','2')");
			db.execSQL("insert into jumble values ('office','2')");
			db.execSQL("insert into jumble values ('monday','2')");
			db.execSQL("insert into jumble values ('mumbai','2')");
			db.execSQL("insert into jumble values ('animal','2')");
			db.execSQL("insert into jumble values ('eleven','2')");
			db.execSQL("insert into jumble values ('nature','2')");
			db.execSQL("insert into jumble values ('twenty','2')");
			db.execSQL("insert into jumble values ('father','2')");
			db.execSQL("insert into jumble values ('mother','2')");
			db.execSQL("insert into jumble values ('sister','2')");
			db.execSQL("insert into jumble values ('friday','2')");
			db.execSQL("insert into jumble values ('school','2')");
			db.execSQL("insert into jumble values ('potato','2')");
			db.execSQL("insert into jumble values ('tomato','2')");
			db.execSQL("insert into jumble values ('energy','2')");
			db.execSQL("insert into jumble values ('monkey','2')");
			db.execSQL("insert into jumble values ('donkey','2')");
			db.execSQL("insert into jumble values ('winter','2')");
			db.execSQL("insert into jumble values ('search','2')");
			db.execSQL("insert into jumble values ('forest','2')");
			db.execSQL("insert into jumble values ('doctor','2')");
			db.execSQL("insert into jumble values ('friend','2')");
			db.execSQL("insert into jumble values ('memory','2')");
			db.execSQL("insert into jumble values ('talent','2')");
			db.execSQL("insert into jumble values ('silent','2')");
			db.execSQL("insert into jumble values ('bottle','2')");
			db.execSQL("insert into jumble values ('better','2')");
			db.execSQL("insert into jumble values ('happen','2')");
			db.execSQL("insert into jumble values ('number','2')");
			db.execSQL("insert into jumble values ('little','2')");
			db.execSQL("insert into jumble values ('melody','2')");
			db.execSQL("insert into jumble values ('lovely','2')");
			db.execSQL("insert into jumble values ('lonely','2')");
			db.execSQL("insert into jumble values ('simple','2')");
			db.execSQL("insert into jumble values ('beauty','2')");
			db.execSQL("insert into jumble values ('health','2')");
			db.execSQL("insert into jumble values ('market','2')");
			db.execSQL("insert into jumble values ('dragon','2')");
			db.execSQL("insert into jumble values ('mobile','2')");
			db.execSQL("insert into jumble values ('jumble','2')");
			db.execSQL("insert into jumble values ('oxygen','2')");
			db.execSQL("insert into jumble values ('branch','2')");
			db.execSQL("insert into jumble values ('purpose','3')");
			db.execSQL("insert into jumble values ('working','3')");
			db.execSQL("insert into jumble values ('project','3')");
			db.execSQL("insert into jumble values ('program','3')");
			db.execSQL("insert into jumble values ('gravity','3')");
			db.execSQL("insert into jumble values ('promise','3')");
			db.execSQL("insert into jumble values ('volcano','3')");
			db.execSQL("insert into jumble values ('element','3')");
			db.execSQL("insert into jumble values ('respect','3')");
			db.execSQL("insert into jumble values ('soldier','3')");
			db.execSQL("insert into jumble values ('because','3')");
			db.execSQL("insert into jumble values ('thirsty','3')");
			db.execSQL("insert into jumble values ('cooking','3')");
			db.execSQL("insert into jumble values ('success','3')");
			db.execSQL("insert into jumble values ('flowers','3')");
			db.execSQL("insert into jumble values ('station','3')");
			db.execSQL("insert into jumble values ('victory','3')");
			db.execSQL("insert into jumble values ('college','3')");
			db.execSQL("insert into jumble values ('english','3')");
			db.execSQL("insert into jumble values ('promote','3')");
			db.execSQL("insert into jumble values ('october','3')");
			db.execSQL("insert into jumble values ('imagine','3')");
			db.execSQL("insert into jumble values ('youtube','3')");
			db.execSQL("insert into jumble values ('student','3')");
			db.execSQL("insert into jumble values ('mercury','3')");
			db.execSQL("insert into jumble values ('captain','3')");
			db.execSQL("insert into jumble values ('natural','3')");
			db.execSQL("insert into jumble values ('healthy','3')");
			db.execSQL("insert into jumble values ('library','3')");
			db.execSQL("insert into jumble values ('message','3')");
			db.execSQL("insert into jumble values ('forward','3')");
			db.execSQL("insert into jumble values ('popcorn','3')");
			db.execSQL("insert into jumble values ('stomach','3')");
			db.execSQL("insert into jumble values ('friends','3')");
			db.execSQL("insert into jumble values ('fashion','3')");
			db.execSQL("insert into jumble values ('chicken','3')");
			db.execSQL("insert into jumble values ('company','3')");
			db.execSQL("insert into jumble values ('manager','3')");
			db.execSQL("insert into jumble values ('culture','3')");
			db.execSQL("insert into jumble values ('general','3')");
			db.execSQL("insert into jumble values ('climate','3')");
			db.execSQL("insert into jumble values ('capital','3')");
			db.execSQL("insert into jumble values ('alcohol','3')");
			db.execSQL("insert into jumble values ('balance','3')");
			db.execSQL("insert into jumble values ('example','3')");
			db.execSQL("insert into jumble values ('braless','3')");
			db.execSQL("insert into jumble values ('village','3')");
			db.execSQL("insert into jumble values ('brother','3')");
			db.execSQL("insert into jumble values ('peacock','3')");
			db.execSQL("insert into jumble values ('weather','3')");
		}
		catch(Exception e){
			
		}
		
    }
   public void start(View v){
	   String s=et.getText().toString().trim();
	   if(s.equals("")){
		   Toast.makeText(this, "Enter your Name",Toast.LENGTH_SHORT).show();
	   }
	   else{
		   Intent i= new Intent(this,UserActivity.class);
		   i.putExtra("name", s);
		   startActivity(i);
	   }
   }
   @Override
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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
