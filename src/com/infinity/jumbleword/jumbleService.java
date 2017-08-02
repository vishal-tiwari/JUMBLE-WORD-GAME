package com.infinity.jumbleword;



import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class jumbleService extends Service{

	MediaPlayer mp;
	public int onStartCommand(Intent intent, int flags, int startId) {
		if(mp==null){
			mp=MediaPlayer.create(getApplicationContext(), R.raw.jumble);
			mp.start();
			mp.setLooping(true);
		}
		else{
			mp.start();
		}
		return super.onStartCommand(intent, flags, startId);
	}
	
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
@Override
public void onDestroy() {
	// TODO Auto-generated method stub
	super.onDestroy();
	mp.stop();
}
}
