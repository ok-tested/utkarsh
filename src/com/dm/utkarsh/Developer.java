package com.dm.utkarsh;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Developer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.developers);
	}
	
	
	public void dev_profile_fb(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/Devanshu9999?fref=ts"));
		startActivity(i2);
	}
	
	public void dev_profile_tw(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/devanshu_9999"));
		startActivity(i2);
	}
	public void dev_profile_g(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/Devanshu9999?fref=ts"));
		startActivity(i2);
	}
	
	public void amit_profile_fb(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://facebook.com/kushwahamit2012"));
		startActivity(i2);
	}
	
	public void amit_profile_tw(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/kushwahamit2016"));
		startActivity(i2);
	}
	public void amit_profile_g(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://plus.google.com/u/1/110634821213638278827"));
		startActivity(i2);
	}
	

}
