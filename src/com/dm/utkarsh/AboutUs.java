package com.dm.utkarsh;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class AboutUs extends Activity {


	/*@Override
	/*public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView = inflater.inflate(R.layout.about_us, container, false);
		//R.id.lt.setMovementMethod(new ScrollingMovementMethod());

        return rootView;	}*/

   @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_us);
	}

/*public void onBackPressed(){
  	  startActivity(new Intent("android.intent.action.NEW"));

   }
	*/
public void web(View view)
{
	Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://bbd-utkarsh.org"));
	startActivity(i2);
}

public void fb(View view)
{
	Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://m.facebook.com/UtkarshBBDGEI?_rdr"));
	startActivity(i2);
}

public boolean onOptionsItemSelected(MenuItem item){
    Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
    startActivityForResult(myIntent, 0);
	finish();
    return true;
}

}
