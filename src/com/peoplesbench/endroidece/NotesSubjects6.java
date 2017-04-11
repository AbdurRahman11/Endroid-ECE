package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NotesSubjects6 extends Activity {
	
public void onca(View View){
		
		Intent myIntent = new Intent(View.getContext(),SixthCa.class);
		startActivityForResult(myIntent,0);
		
	}

public void oncn(View View){
	
	Intent myIntent = new Intent(View.getContext(),SixthCn.class);
	startActivityForResult(myIntent,0);
	
}

public void onvlsi(View View){
	
	Intent myIntent = new Intent(View.getContext(),SixthVlsi.class);
	startActivityForResult(myIntent,0);
	
}

public void onawp(View View){
	
	Intent myIntent = new Intent(View.getContext(),SixthAwp.class);
	startActivityForResult(myIntent,0);
	
}

public void onpom(View View){
	
	Intent myIntent = new Intent(View.getContext(),SixthPom.class);
	startActivityForResult(myIntent,0);
	
}

public void onme(View View){
	
	Intent myIntent = new Intent(View.getContext(),SixthMe.class);
	startActivityForResult(myIntent,0);
	
}

public void onadsp(View View){
	
	Intent myIntent = new Intent(View.getContext(),SixthAdsp.class);
	startActivityForResult(myIntent,0);
	
}

public void onos(View View){
	
	Intent myIntent = new Intent(View.getContext(),SixthOs.class);
	startActivityForResult(myIntent,0);
	
}

public void onra(View View){
	
	Intent myIntent = new Intent(View.getContext(),SixthRa.class);
	startActivityForResult(myIntent,0);
	
}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes_subjects6);
		
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
