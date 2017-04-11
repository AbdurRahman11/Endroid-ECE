package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NotesSubjects4 extends Activity {
	
	
	public void onec2(View View){
		
		Intent myIntent = new Intent(View.getContext(),FourEc2.class);
		startActivityForResult(myIntent,0);
		
	}
	
public void oncomt(View View){
		
		Intent myIntent = new Intent(View.getContext(),FourCt.class);
		startActivityForResult(myIntent,0);
		
	}

public void oncs(View View){
	
	Intent myIntent = new Intent(View.getContext(),FourCs.class);
	startActivityForResult(myIntent,0);
	
}

public void onemf(View View){
	
	Intent myIntent = new Intent(View.getContext(),FourEmf.class);
	startActivityForResult(myIntent,0);
	
}

public void onlic(View View){
	
	Intent myIntent = new Intent(View.getContext(),FourLic.class);
	startActivityForResult(myIntent,0);
	
}

public void onprp(View View){
	
	Intent myIntent = new Intent(View.getContext(),FourPrp.class);
	startActivityForResult(myIntent,0);
	
}
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes_subjects4);
		
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
