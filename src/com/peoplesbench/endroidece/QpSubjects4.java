package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class QpSubjects4 extends Activity {
	
public void qpec2(View View){
		
		Intent myIntent = new Intent(View.getContext(),QpEc2.class);
		startActivityForResult(myIntent,0);
		
	}

public void qpcomt(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpComt.class);
	startActivityForResult(myIntent,0);
	
}

public void qpcs(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpCs.class);
	startActivityForResult(myIntent,0);
	
}

public void qpemf(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpEmf.class);
	startActivityForResult(myIntent,0);
	
}

public void qplic(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpLic.class);
	startActivityForResult(myIntent,0);
	
}

public void qpprp(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpPrp.class);
	startActivityForResult(myIntent,0);
	
}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.qp_subjects4);
		
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
