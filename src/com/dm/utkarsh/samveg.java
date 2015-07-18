package com.dm.utkarsh;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class samveg extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.samveg);
		 }
	public void fbutkarsh(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/UtkarshBBDGEI"));
		startActivity(i2);
	}
	
	public void web(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://bbd-utkarsh.org/"));
		startActivity(i2);
	}
	public void Alarm(View view)
	{
		String str = "Samveg";
		Intent it = new Intent("android.intent.action.SETNOTIFICATION");
		it.putExtra("event", str);
		it.putExtra("address", "android.intent.action.SAMVEG");
		startActivity(it);
	}

}
