package com.dm.utkarsh;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StartingPoint extends Activity {

	// Splash screen timer
	private static int SPLASH_TIME_OUT = 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable() {

			/*
			 * Showing splash screen with a timer. This will be useful when you
			 * want to show case your app logo / company
			 */

			
        	@Override
			public void run() {
				// This method will be executed once the timer is over
				// Start your app main activity
				Intent i = new Intent("android.intent.action.NEW");//StartingPoint.this, MainActivity.class);
				startActivity(i);
				
	//			setResult(Activity.RESULT_OK);

				// close this activity
			}
		}, SPLASH_TIME_OUT);
	}

}
