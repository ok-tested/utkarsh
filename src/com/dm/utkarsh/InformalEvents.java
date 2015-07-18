package com.dm.utkarsh;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class InformalEvents extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.informal);
	}
	
	public void fbutkarsh(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://bbd-utkarsh.org"));
		startActivity(i2);
	}
	
	public void Desikalakar(View view)
	{
		 Intent i = new Intent(InformalEvents.this,desikalakar.class);
		 startActivity(i);
	}
	public void hitthepot(View view)
	{
		 Intent i = new Intent(InformalEvents.this,hitthepot.class);
		 startActivity(i);
	}
	public void goonj(View view)
	{
		 Intent i = new Intent(InformalEvents.this,goonj.class);
		 startActivity(i);
	}
	public void thesurvivors1(View view)
	{
		 Intent i = new Intent(InformalEvents.this,thesurvivors.class);
		 startActivity(i);
	}
	public void BBB(View view)
	{
		 Intent i = new Intent(InformalEvents.this,bandbajabaraat.class);
		 startActivity(i);
	}
	public void IMG(View view)
	{
		 Intent i = new Intent(InformalEvents.this,iamgenius.class);
		 startActivity(i);
	}
	public void BTN(View view)
	{
		 Intent i = new Intent(InformalEvents.this,bethenucleus.class);
		 startActivity(i);
	}
	public void TS2(View view)
	{
		 Intent i = new Intent(InformalEvents.this,thesurvivors2.class);
		 startActivity(i);
	}
	public void CF1(View view)
	{
		 Intent i = new Intent(InformalEvents.this,catfight.class);
		 startActivity(i);
	}
	public void RR(View view)
	{
		 Intent i = new Intent(InformalEvents.this,raprattle.class);
		 startActivity(i);
	}
	public void AF1(View view)
	{
		 Intent i = new Intent(InformalEvents.this,amorfecha.class);
		 startActivity(i);
	}
	public void Alfaaz(View view)
	{
		 Intent i = new Intent(InformalEvents.this,alfaaz.class);
		 startActivity(i);
	}
	public void Autobuzz(View view)
	{
		 Intent i = new Intent(InformalEvents.this,Autobuzz.class);
		 startActivity(i);
	}
	public void Bollywoodmania(View view)
	{
		 Intent i = new Intent(InformalEvents.this,bollywoodmania.class);
		 startActivity(i);
	}
	public void GadgetGuru(View view)
	{
		 Intent i = new Intent(InformalEvents.this,gadgetguru.class);
		 startActivity(i);
	}
	public void Hitthepot(View view)
	{
		 Intent i = new Intent(InformalEvents.this,hitthepot1.class);
		 startActivity(i);
	}
	public void TheSurvivors2(View view)
	{
		 Intent i = new Intent(InformalEvents.this,thesurvivors2.class);
		 startActivity(i);
	}
	public void AmorFecha2(View view)
	{
		 Intent i = new Intent(InformalEvents.this,amorfecha2.class);
		 startActivity(i);
	}
	
	public void CatFight(View view)
	{
		 Intent i = new Intent(InformalEvents.this,catfight1.class);
		 startActivity(i);
	}
	

	public void BetheNucleus(View view)
	{
		 Intent i = new Intent(InformalEvents.this,bethenucleus1.class);
		 startActivity(i);
	}
	public void RapRattle(View view)
	{
		 Intent i = new Intent(InformalEvents.this,raprattle1.class);
		 startActivity(i);
	}
	public void AmorFecha3(View view)
	{
		 Intent i = new Intent(InformalEvents.this,amorfecha3.class);
		 startActivity(i);
	}

	
	public void CatFight3(View view)
	{
		 Intent i = new Intent(InformalEvents.this,catfight2.class);
		 startActivity(i);
	}
	public void TheSurvivors3(View view)
	{
		 Intent i = new Intent(InformalEvents.this,thesurvivors3.class);
		 startActivity(i);
	}
	

	public void Felicitation(View view)
	{
		 Intent i = new Intent(InformalEvents.this,felicitation.class);
		 startActivity(i);
	}
	
	public void BattleofBands(View view)
	{
		 Intent i = new Intent(InformalEvents.this,battleofbands.class);
		 startActivity(i);
	}
	
	
	
	
		

}

