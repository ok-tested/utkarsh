package com.dm.utkarsh;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SportsEvent extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sports);
	}
	
	public void fbutkarsh(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://bbd-utkarsh.org"));
		startActivity(i2);
	}
	
	public void mtr1500final(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,final1500.class);
	startActivity(i);
	
	}
	
	public void mtr800final(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,final800girls.class);//of girl
	startActivity(i);
	
	}
	public void mtr100heats(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,heats100boys.class);
	startActivity(i);
	
	}
	public void mtr100heat(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,heats100girls.class);
	startActivity(i);
	
	}
	public void triplejumpfinal(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,triplejumpfinal.class);
	startActivity(i);
	
	}
	public void mtr200heatsgirl(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,heats200girls.class);//final1500.class);
	startActivity(i);
	
	}
	public void mtr200heatboys(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,heats200boys.class);//final1500.class);
	startActivity(i);
	
	}
	public void shotputfinal(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,shotputfinal.class);//1500.class);
	startActivity(i);
	
	}
	public void triplejumpfinalgirls(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,triplejumpfinalgirls.class);
	startActivity(i);
	
	}
	
	public void mtr400heats(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,heats400boys.class);
	startActivity(i);
	
	}
	public void mtr800finalboys(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,final800.class);
	startActivity(i);
	
	}
	public void mtr400heatsgirls(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,heats400girls.class);
	startActivity(i);
	
	}public void longjumpfinal(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,longjumpfinalboys.class);
	startActivity(i);
	
	}public void longjumpfinalgirls(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,longjumpfinalgirls.class);
	startActivity(i);
	
	}public void mtr200finalgirl(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,girls200final.class);
	startActivity(i);
	
	}public void mtr200finalboys(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,boys200final.class);
	startActivity(i);
	
	}public void mtr400final(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,girls400final.class);
	startActivity(i);
	
	}public void javelineboys(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,javelinboys.class);
	startActivity(i);
	
	}public void javelinegirls(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,javelingirls.class);
	startActivity(i);
	
	}public void shotputboys(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,shotputboys.class);
	startActivity(i);
	
	}
	
	
	
	public void discussgirls(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,discussgirls.class);
	startActivity(i);
	
	}
	
	public void discussboys(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,discussboys.class);
	startActivity(i);
	
	}
	
	public void fourby100mtrfinalgirls(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,relay400finalgirls.class);
	startActivity(i);
	
	}
	
	public void fourby100mtrfinalboys(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,relay400finalboys.class);
	startActivity(i);
	
	}
	
	
	public void mtr400finalgirls(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,girls400final.class);
	startActivity(i);
	
	}
	
	
	
	public void mtr100finalgirls(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,mtr100girlfinal.class);//girls100final.class);
	startActivity(i);
	
	}
	
	
	
	public void mtr100finalboys(View view)
	{
		
	Intent i = new Intent(SportsEvent.this,mtr100boysfinal.class);
	startActivity(i);
	
	}
	
	
	
	
	

}
