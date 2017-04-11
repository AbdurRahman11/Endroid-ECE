package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class QpSubjects6 extends Activity {

public void qpca(View View){
		
		Intent myIntent = new Intent(View.getContext(),QpCa.class);
		startActivityForResult(myIntent,0);
		
	}

public void qpcn(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpCn.class);
	startActivityForResult(myIntent,0);
	
}


public void qpvlsi(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpVlsi.class);
	startActivityForResult(myIntent,0);
	
}


public void qpawp(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpAwp.class);
	startActivityForResult(myIntent,0);
	
}


public void qppom(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpPom.class);
	startActivityForResult(myIntent,0);
	
}

public void qpme(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpMe.class);
	startActivityForResult(myIntent,0);
	
}


public void qpadsp(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpAdsp.class);
	startActivityForResult(myIntent,0);
	
}

public void qpos(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpOs.class);
	startActivityForResult(myIntent,0);
	
}

public void qpra(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpRa.class);
	startActivityForResult(myIntent,0);
	
}


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.qp_subjects6);
		
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
