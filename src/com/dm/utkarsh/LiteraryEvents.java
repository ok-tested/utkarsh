package com.dm.utkarsh;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class LiteraryEvents extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	      setContentView(R.layout.literary);}
	
	
	public void fbutkarsh(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://bbd-utkarsh.org"));
		startActivity(i2);
	}
	public void graymatter(View view){
  	  Intent i = new Intent(LiteraryEvents.this,graymatter.class);
  	  startActivity(i);
    }
	public void mobihasa(View view){
  	  Intent i = new Intent(LiteraryEvents.this,mobihasa.class);
  	  startActivity(i);
    }
	      
	     
	     
	      public void theomachy(View view)
	      {   
	    	  Intent i = new Intent("android.intent.action.THEOMACHY");// you can call intent by both methods(see wordemort!!)Also don't forget to put every activity in android manifest 
	    	  startActivity(i);
	    	 // 
	      }
	      public void shabdrang(View view){
	    	  Intent i = new Intent("android.intent.action.SHABDRANG");
	    	  startActivity(i);
	    	  //setContentView(R.layout.shabdrang);
	      }
	      public void wordemort(View view){
	    	  Intent i = new Intent(LiteraryEvents.this,wordemort.class);//("android.intent.action.WORDEMORT");
	    	  startActivity(i);
	    	 // setContentView(R.layout.wordemort);
	      }
	      public void samveg(View view){
	    	  Intent i = new Intent(LiteraryEvents.this,samveg.class);//"android.intent.action.SAMVEG");
	    	  startActivity(i);
	    	 
	      }
	      public void grammarnazi(View view){
	    	  Intent i = new Intent(LiteraryEvents.this,grammernazi.class);//"android.intent.action.GRAMMARNAZI");
	    	  startActivity(i);
	      }
	      public void consiliumprincipis(View view){
	    	  Intent i = new Intent(LiteraryEvents.this,consiliumprincipis.class);//"android.intent.action.CONSILIUM");
	    	  startActivity(i);
	      }
	      public void visiondecritique(View view){
	    	  Intent i = new Intent(LiteraryEvents.this,visiondecritique.class);//"android.intent.action.VISIONCTITIQUE");
	    	  startActivity(i);
	    	 // setContentView(R.layout.visiondecritique);
	      }
	      public void mehfileutkarsh(View view){
	    	  Intent i = new Intent(LiteraryEvents.this,mehfileutkarsh.class);//"android.intent.action.MEHFILEUTKARSH");
	    	  startActivity(i);
	      }
	      public void shamsheeretaqreer(View view){
	    	  Intent i = new Intent(LiteraryEvents.this,shamsheeretaqreer.class);//"android.intent.action.SHAMSHEERTAQREER");
	    	  startActivity(i);
	      }
	      public void declarationofresults(View view){
	    	  Intent i = new Intent(LiteraryEvents.this,declarationofres.class);//"android.intent.action.DECLARATIONOFRES");
	    	  startActivity(i);
	      }
	      public void mushairra(View view){
	    	  Intent i = new Intent(LiteraryEvents.this,mushairra.class);//"android.intent.action.MUSHAIRRA");
	    	  startActivity(i);
	      }
	      
	      public void call_organiser_1(View view)
	      {
	    	  Intent i = new Intent(Intent.ACTION_CALL);//, Uri.parse("8564845988"));
	    		i.setData(Uri.parse("tel:8564845988"));	
	    	  startActivity(i);
	    	   
	      }
	}
	
