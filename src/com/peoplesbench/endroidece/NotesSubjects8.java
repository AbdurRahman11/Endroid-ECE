package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NotesSubjects8 extends Activity {
	
public void onwc(View View){
		
		Intent myIntent = new Intent(View.getContext(),EightWc.class);
		startActivityForResult(myIntent,0);
		
	}

public void onwn(View View){
	
	Intent myIntent = new Intent(View.getContext(),EightWn.class);
	startActivityForResult(myIntent,0);
	
}

public void onrfd(View View){
	
	Intent myIntent = new Intent(View.getContext(),EightRfd.class);
	startActivityForResult(myIntent,0);
	
}

public void onadh(View View){
	
	Intent myIntent = new Intent(View.getContext(),EightAdh.class);
	startActivityForResult(myIntent,0);
	
}

public void onic(View View){
	
	Intent myIntent = new Intent(View.getContext(),EightIc.class);
	startActivityForResult(myIntent,0);
	
}

public void onmc(View View){
	
	Intent myIntent = new Intent(View.getContext(),EightMc.class);
	startActivityForResult(myIntent,0);
	
}


public void onpe(View View){
	
	Intent myIntent = new Intent(View.getContext(),EightPE.class);
	startActivityForResult(myIntent,0);
	
}

public void ondcv(View View){
	
	Intent myIntent = new Intent(View.getContext(),EightDcv.class);
	startActivityForResult(myIntent,0);
	
}

public void oncrp(View View){
	
	Intent myIntent = new Intent(View.getContext(),EightCrp.class);
	startActivityForResult(myIntent,0);
	
}

public void ontqm(View View){
	
	Intent myIntent = new Intent(View.getContext(),EightTqm.class);
	startActivityForResult(myIntent,0);
	
}


public void onspm(View View){
	
	Intent myIntent = new Intent(View.getContext(),EightSpm.class);
	startActivityForResult(myIntent,0);
	
}

public void onesp(View View){
	
	Intent myIntent = new Intent(View.getContext(),EightEsp.class);
	startActivityForResult(myIntent,0);
	
}



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes_subjects8);
		
		 TextView tv = (TextView)findViewById(R.id.textView1);     
		 tv.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
