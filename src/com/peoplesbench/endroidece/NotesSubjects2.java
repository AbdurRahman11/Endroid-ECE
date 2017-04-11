package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NotesSubjects2 extends Activity {
	
	
public void onchem2(View View){
		
		Intent myIntent = new Intent(View.getContext(),SecChemistry.class);
		startActivityForResult(myIntent,0);
		
	}

public void onm2(View View){
	
	Intent myIntent = new Intent(View.getContext(),SecMaths2.class);
	startActivityForResult(myIntent,0);
	
}

public void onphy2(View View){
	
	Intent myIntent = new Intent(View.getContext(),SecPhysics.class);
	startActivityForResult(myIntent,0);
	
}

public void onct(View View){
	
	Intent myIntent = new Intent(View.getContext(),SecCt.class);
	startActivityForResult(myIntent,0);
	
}

public void oneng2(View View){
	
	Intent myIntent = new Intent(View.getContext(),SecEng.class);
	startActivityForResult(myIntent,0);
	
}

public void oned(View View){
	
	Intent myIntent = new Intent(View.getContext(),SecEd.class);
	startActivityForResult(myIntent,0);
	
}
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes_subjects2);
		
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
