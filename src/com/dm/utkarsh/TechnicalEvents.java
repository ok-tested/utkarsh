package com.dm.utkarsh;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class TechnicalEvents extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.technical);
	}
	public void fbutkarsh(View view)
	{
		Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://bbd-utkarsh.org"));
		startActivity(i2);
	}
public void expoquiz(View view){
    	
    	Intent i = new Intent(TechnicalEvents.this,expoquiz.class);
    	startActivity(i);
    }
public void megabucks(View view){
	
	Intent i = new Intent(TechnicalEvents.this,megabucks.class);
	startActivity(i);
}
public void dicodifica(View view){
	
	Intent i = new Intent(TechnicalEvents.this,dicodifica.class);
	startActivity(i);
}
public void minirobowars(View view){
	
	Intent i = new Intent(TechnicalEvents.this,minirobowars.class);
	startActivity(i);
}
public void robosoccer(View view){
	
	Intent i = new Intent(TechnicalEvents.this,robosoccer.class);
	startActivity(i);
}
public void linefollower(View view){
	
	Intent i = new Intent(TechnicalEvents.this,linefollower.class);
	startActivity(i);
}
public void roborace(View view){
	
	Intent i = new Intent(TechnicalEvents.this,roborace.class);
	startActivity(i);
}

public void robowarsreloaded(View view){
	
	Intent i = new Intent(TechnicalEvents.this,robowarsreloaded.class);
	startActivity(i);
}
public void utkarshtechexpo(View view){
	
	Intent i = new Intent(TechnicalEvents.this,utkarshtechexpo.class);
	startActivity(i);
}
public void bazarelectrino(View view){
	
	Intent i = new Intent(TechnicalEvents.this,bazarelectronico.class);
	startActivity(i);
}
public void lightfollower(View view){
	
	Intent i = new Intent(TechnicalEvents.this,lightfollowe.class);
	startActivity(i);
}
public void spidersearch(View view){
	
	Intent i = new Intent(TechnicalEvents.this,searchspider.class);
	startActivity(i);
}
public void junkyardwars(View view){
	
	Intent i = new Intent(TechnicalEvents.this,junkyardwars.class);
	startActivity(i);
}
public void braintornado(View view){
	
	Intent i = new Intent(TechnicalEvents.this,braintornado.class);
	startActivity(i);
}
public void quizsociale(View view){
	
	Intent i = new Intent(TechnicalEvents.this,quizsociale.class);
	startActivity(i);
}
public void searchspider_final(View view){
	
	Intent i = new Intent(TechnicalEvents.this,searchspiderfinal.class);
	startActivity(i);
}
public void junkyardwarsfinal(View view){
	
	Intent i = new Intent(TechnicalEvents.this,junkyardwarsfinal.class);
	startActivity(i);
}
public void knowwid(View view){
	
	Intent i = new Intent(TechnicalEvents.this,knowwid.class);
	startActivity(i);
}
public void quizsocialefinal(View view){
	
	Intent i = new Intent(TechnicalEvents.this,quizsocalfinale.class);
	startActivity(i);
}
public void minirobowarsfinal(View view){
	
	Intent i = new Intent(TechnicalEvents.this,minirobowarsfinal.class);
	startActivity(i);
}
public void linefollowerfinal(View view){
	
	Intent i = new Intent(TechnicalEvents.this,linefolloerfinal.class);
	startActivity(i);
}
public void dicodificafinal(View view){
	
	Intent i = new Intent(TechnicalEvents.this,dicodificafinal.class);
	startActivity(i);
}
public void knowwidfinal(View view){
	
	Intent i = new Intent(TechnicalEvents.this,knowwidfinal.class);
	startActivity(i);
}
public void braintornadofinal(View view){
	
	Intent i = new Intent(TechnicalEvents.this,braintornadofinal.class);
	startActivity(i);
}
public void blueprint(View view){
	
	Intent i = new Intent(TechnicalEvents.this,blueprint.class);
	startActivity(i);
}
public void technicoquiz(View view){
	Intent i = new Intent(TechnicalEvents.this,technicoquiz.class);
	startActivity(i);
}
public void call_organiser_1(View view)
{
	
	  Intent i = new Intent(Intent.ACTION_CALL);//, Uri.parse("8564845988"));
	  i.setData(Uri.parse("tel:8564845988"));	
	  startActivity(i);
	   
}

		

}
