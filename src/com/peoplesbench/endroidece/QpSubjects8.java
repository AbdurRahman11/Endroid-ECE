package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class QpSubjects8 extends Activity {
	
public void qpwc(View View){
		
		Intent myIntent = new Intent(View.getContext(),QpWc.class);
		startActivityForResult(myIntent,0);
		
	}

public void qpwn(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpWn.class);
	startActivityForResult(myIntent,0);
	
}

public void qprfd(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpRfd.class);
	startActivityForResult(myIntent,0);
	
}

public void qpadh(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpAdh.class);
	startActivityForResult(myIntent,0);
	
}

public void qpic(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpIc.class);
	startActivityForResult(myIntent,0);
	
}

public void qpmc(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpMc.class);
	startActivityForResult(myIntent,0);
	
}

public void qppe(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpPe.class);
	startActivityForResult(myIntent,0);
	
}

public void qpdcv(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpDcv.class);
	startActivityForResult(myIntent,0);
	
}


public void qpcrp(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpCrp.class);
	startActivityForResult(myIntent,0);
	
}

public void qptqm(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpTqm.class);
	startActivityForResult(myIntent,0);
	
}

public void qpesp(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpEsp.class);
	startActivityForResult(myIntent,0);
	
}

public void qpspm(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpSpm.class);
	startActivityForResult(myIntent,0);
	
}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.qp_subjects8);
		
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
