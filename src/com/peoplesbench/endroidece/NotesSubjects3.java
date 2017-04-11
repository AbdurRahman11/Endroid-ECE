package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NotesSubjects3 extends Activity {
	
public void onec1(View View){
		
		Intent myIntent = new Intent(View.getContext(),ThirdEc1.class);
		startActivityForResult(myIntent,0);
		
	}

public void onm3(View View){
	
	Intent myIntent = new Intent(View.getContext(),ThirdTpde.class);
	startActivityForResult(myIntent,0);
	
}

public void onde(View View){
	
	Intent myIntent = new Intent(View.getContext(),ThirdDe.class);
	startActivityForResult(myIntent,0);
	
}
	
public void onss(View View){
	
	Intent myIntent = new Intent(View.getContext(),ThirdSs.class);
	startActivityForResult(myIntent,0);
	
}

public void oneei(View View){
	
	Intent myIntent = new Intent(View.getContext(),ThirdEei.class);
	startActivityForResult(myIntent,0);
	
}

public void onoops(View View){
	
	Intent myIntent = new Intent(View.getContext(),ThirdEei.class);
	startActivityForResult(myIntent,0);
	
}
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes_subjects3);
		
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
