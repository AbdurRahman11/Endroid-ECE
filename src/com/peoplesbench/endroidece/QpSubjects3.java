package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class QpSubjects3 extends Activity {
	
public void qpec1(View View){
		
		Intent myIntent = new Intent(View.getContext(),QpEc1.class);
		startActivityForResult(myIntent,0);
		
	}

public void qpm3(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpTpde.class);
	startActivityForResult(myIntent,0);
	
}

public void qpde(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpDe.class);
	startActivityForResult(myIntent,0);
	
}

public void qpss(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpSs.class);
	startActivityForResult(myIntent,0);
	
}

public void qpeei(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpEei.class);
	startActivityForResult(myIntent,0);
	
}

public void qpoops(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpOops.class);
	startActivityForResult(myIntent,0);
	
}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.qp_subjects3);
		
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
