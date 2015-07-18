package com.dm.utkarsh;


import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("NewApi")
public class Home_Fragment extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//setContentView(R.layout.home_fragment);
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		 View rootView = inflater.inflate(R.layout.home_fragment, container, false);
         
	        return rootView;	}
	
/*	public void onBackPressed(){
	  	 android.os.Process.killProcess(android.os.Process.myPid()); //startActivity(new Intent("android.intent.action.NEW"));
	  	  System.exit(1);
	   }
		*/
	

	}

	


