package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NotesSubjects5 extends Activity {

	
public void ondc(View View){
		
		Intent myIntent = new Intent(View.getContext(),FifthDc.class);
		startActivityForResult(myIntent,0);
		
	}

public void onmpmc(View View){
	
	Intent myIntent = new Intent(View.getContext(),FifthMpmc.class);
	startActivityForResult(myIntent,0);
	
}

public void onevs(View View){
	
	Intent myIntent = new Intent(View.getContext(),FifthEvs.class);
	startActivityForResult(myIntent,0);
	
}
	
public void ontlw(View View){
	
	Intent myIntent = new Intent(View.getContext(),FifthTlw.class);
	startActivityForResult(myIntent,0);
	
}

public void ondsp(View View){
	
	Intent myIntent = new Intent(View.getContext(),FifthDsp.class);
	startActivityForResult(myIntent,0);
	
}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes_subjects5);
		
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
