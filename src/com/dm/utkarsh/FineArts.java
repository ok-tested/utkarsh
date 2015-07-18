package com.dm.utkarsh;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FineArts extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.finearts);
	}
	public void fbutkarsh(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://bbd-utkarsh.org"));
		startActivity(i2);
	}
public void schedios(View view){
    	
    	Intent i = new Intent(FineArts.this,schedios.class);
    	startActivity(i);
    }

public void muralista(View view){
	
	Intent i = new Intent(FineArts.this,muralista.class);
	startActivity(i);
}
public void consillium(View view){
	
	Intent i = new Intent(FineArts.this,consillium.class);
	startActivity(i);
}
public void vestisornatus(View view){
	
	Intent i = new Intent(FineArts.this,vestisornatus.class);
	startActivity(i);
}
public void sculpturae(View view){
	
	Intent i = new Intent(FineArts.this,sculpturae.class);
	startActivity(i);
}
public void mehendika(View view){
	
	Intent i = new Intent(FineArts.this,mehendika.class);
	startActivity(i);
}
public void masquerade(View view){
	
	Intent i = new Intent(FineArts.this,masquerade.class);
	startActivity(i);
}
public void masquer(View view){
	
	Intent i = new Intent(FineArts.this,masquer.class);
	startActivity(i);
}
public void vicumart(View view){
	
	Intent i = new Intent(FineArts.this,vicumart.class);
	startActivity(i);
}
public void patangbazi(View view){
	
	Intent i = new Intent(FineArts.this,patangbazi.class);
	startActivity(i);
}
public void picturaecavea(View view){
	
	Intent i = new Intent(FineArts.this,picturaecavea.class);
	startActivity(i);
}
public void perfectclick(View view){
	
	Intent i = new Intent(FineArts.this,perfectclick.class);
	startActivity(i);
}
public void alpana(View view){
	
	Intent i = new Intent(FineArts.this,alpana.class);
	startActivity(i);
}
public void call_organiser_1(View view)
{
	
	  Intent i = new Intent(Intent.ACTION_CALL);//, Uri.parse("8564845988"));
	  i.setData(Uri.parse("tel:8564845988"));	
	  startActivity(i);
	   
}
}

	
	