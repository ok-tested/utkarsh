package com.dm.utkarsh;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class CulturalEvents extends Activity {
	
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cultural);
		}
	

public void fbutkarsh(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://bbd-utkarsh.org"));
		startActivity(i2);
	}
	
		
    public void openingceremony(View view){
    	
    	Intent i = new Intent(CulturalEvents.this,openingceremony.class);
    	startActivity(i);
    }
    public void rockafaire(View view){
    	Intent i = new Intent(CulturalEvents.this,rockafire.class);
    	startActivity(i);
    }
    public void glamfiestaintro(View view){
    	Intent i = new Intent(CulturalEvents.this,glamfiestaintro.class);
    	startActivity(i);
    }
    public void carnivaldance(View view){
    	
    	Intent i = new Intent(CulturalEvents.this,carnivaldance.class);
    	startActivity(i);
    }
    public void mimosarto(View view){
    	Intent i = new Intent(CulturalEvents.this,mimosarto.class);
    	startActivity(i);
    }
    public void bbdidol(View view){
    	Intent i = new Intent(CulturalEvents.this,bbdidol.class);
    	startActivity(i);
    }
    public void actitorial(View view){
    	Intent i = new Intent(CulturalEvents.this,actitorial.class);
    	startActivity(i);
    }
    public void glamfiesta(View view){
    	Intent i = new Intent(CulturalEvents.this,glamfiesta.class);
    	startActivity(i);
    }
    public void bonzerround1(View view){//bonzerround1(View view){
    	Intent i = new Intent(CulturalEvents.this,bonzeround1.class);
    	startActivity(i);
    }
    public void groovearmada(View view){
    	Intent i = new Intent(CulturalEvents.this,groovearmada.class);
    	startActivity(i);
    }
    public void lavolta(View view){
    	Intent i = new Intent(CulturalEvents.this,lavolta.class);
    	startActivity(i);
    }
    public void glamfiestatalent(View view){
    	Intent i = new Intent(CulturalEvents.this,glamfiestatalent.class);
    	startActivity(i);
    }
    public void sonicals(View view){
    	Intent i = new Intent(CulturalEvents.this,sonicals.class);
    	startActivity(i);
    }
    public void singchronised(View view){
    	Intent i = new Intent(CulturalEvents.this,singchronised.class);
    	startActivity(i);
    }
    public void histronics(View view){
    	Intent i = new Intent(CulturalEvents.this,histronics.class);
    	startActivity(i);
    }
    public void faceoff(View view){
    	Intent i = new Intent(CulturalEvents.this,faceoff.class);
    	startActivity(i);
    }
    public void footoflaire(View view){
    	Intent i = new Intent(CulturalEvents.this,footofflaire.class);
    	startActivity(i);
    }
    public void spoofdecreato(View view){
    	Intent i = new Intent(CulturalEvents.this,spoofdecreato.class);
    	startActivity(i);
    }
    public void reverb(View view){
    	Intent i = new Intent(CulturalEvents.this,reverb.class);
    	startActivity(i);
    }
    public void stepnsynchro(View view){
    	Intent i = new Intent(CulturalEvents.this,stepsynchro.class);
    	startActivity(i);
    }
    public void publicito(View view){
    	Intent i = new Intent(CulturalEvents.this,publicitio.class);
    	startActivity(i);
    }
    public void utkarshunplugged(View view){
    	Intent i = new Intent(CulturalEvents.this,utkarshunplugged.class);
    	startActivity(i);
    }
    public void folkomania(View view){
    	Intent i = new Intent(CulturalEvents.this,folkomania.class);
    	startActivity(i);
    }
    public void indistortion(View view){
    	Intent i = new Intent(CulturalEvents.this,indistortion.class);
    	startActivity(i);
    }
    public void streeteldrama(View view){
    	Intent i = new Intent(CulturalEvents.this,streetldrama.class);
    	startActivity(i);
    }
    public void bonzerround2(View view){
    	Intent i = new Intent(CulturalEvents.this,bonzerround2.class);
    	startActivity(i);
    }
    public void soloeldanza(View view){
    	Intent i = new Intent(CulturalEvents.this,soloeldanza.class);
    	startActivity(i);
    }
    public void raprimande(View view){
    	Intent i = new Intent(CulturalEvents.this,raprimanda.class);
    	startActivity(i);
    }
    public void glamfiestaqanda(View view){
    	Intent i = new Intent(CulturalEvents.this,glamfiestaqanda.class);
    	startActivity(i);
    }
    public void comicradle(View view){
    	Intent i = new Intent(CulturalEvents.this,comicradle.class);
    	startActivity(i);
    }
    public void closingceremony(View view){
    	Intent i = new Intent(CulturalEvents.this,closingceremony.class);
    	startActivity(i);
    }
    
    
    
    public void call_organiser_1(View view)
    {
    	
  	  Intent i = new Intent(Intent.ACTION_CALL);//, Uri.parse("8564845988"));
  	  i.setData(Uri.parse("tel:8564845988"));	
  	  startActivity(i);
  	   
    }
    
}
