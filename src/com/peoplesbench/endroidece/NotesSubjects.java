package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NotesSubjects extends Activity {

	public void onchem1(View View){
		
		Intent myIntent = new Intent(View.getContext(),FisrtChemistry.class);
		startActivityForResult(myIntent,0);
		
	}
	
public void onm1(View View){
		
		Intent myIntent = new Intent(View.getContext(),FirstMaths.class);
		startActivityForResult(myIntent,0);
		
	}

public void onphy1(View View){
	
	Intent myIntent = new Intent(View.getContext(),FirstPhysics.class);
	startActivityForResult(myIntent,0);
	
}

public void oncp(View View){
	
	Intent myIntent = new Intent(View.getContext(),FirstCp.class);
	startActivityForResult(myIntent,0);
	
}

public void oneng1(View View){
	
	Intent myIntent = new Intent(View.getContext(),FirstEng.class);
	startActivityForResult(myIntent,0);
	
}

public void oneg(View View){
	
	Intent myIntent = new Intent(View.getContext(),FirstEg.class);
	startActivityForResult(myIntent,0);
	
}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes_subjects);
		
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
