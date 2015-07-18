package com.dm.utkarsh;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;




public class EventsByCategory extends Activity {

	ImageView cultural,technical,literary,finearts,sports,informal;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	      setContentView(R.layout.events_by_category);
	}
	
	public void imageClick_technical(View view){
		Intent i1 = new Intent(EventsByCategory.this,TechnicalEvents.class);  
		startActivity(i1);
	     // setContentView(R.layout.technical);
	    
        }
	
	
	public void imageClick_sports(View view){
	      
		Intent i1 = new Intent(EventsByCategory.this,SportsEvent.class);  
		startActivity(i1);
		//setContentView(R.layout.sports);
	    
      }
	
	
	public void imageClick_management(View view){
	      
		Intent i2 = new Intent(EventsByCategory.this,FineArts.class);  
		startActivity(i2);
		//setContentView(R.layout.finearts);
	    
      }
	
    /*
      public void imageClick(View view){
	  setContentView(R.layout.about_us);
	    
      }
    */
	public void imageClick_informal(View view)
	{  
	  Intent i1 = new Intent(EventsByCategory.this,InformalEvents.class);  
	  startActivity(i1);
	
	}
	
	public void imageClick_cultural(View view){
	    Intent i1 = new Intent(EventsByCategory.this,CulturalEvents.class);  
		startActivity(i1);
	    
      }
	
	public void imageClick_literary(View view){
		Intent i = new Intent(EventsByCategory.this, LiteraryEvents.class);
		startActivity(i);
	    
     }
	
	
	
}
	
