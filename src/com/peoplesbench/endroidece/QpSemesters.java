package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class QpSemesters extends Activity {
	
	public void qpsem1(View View){
		Intent myIntent = new Intent(View.getContext(),QpSubjects1.class);
		startActivityForResult(myIntent,0);
		
	}
	
	public void qpsem2(View View){
		Intent myIntent = new Intent(View.getContext(),QpSubjects2.class);
		startActivityForResult(myIntent,0);
		
	}
	
	public void qpsem3(View View){
		Intent myIntent = new Intent(View.getContext(),QpSubjects3.class);
		startActivityForResult(myIntent,0);
		
	}
	
	public void qpsem4(View View){
		Intent myIntent = new Intent(View.getContext(),QpSubjects4.class);
		startActivityForResult(myIntent,0);
		
	}
	
	public void qpsem5(View View){
		Intent myIntent = new Intent(View.getContext(),QpSubjects5.class);
		startActivityForResult(myIntent,0);
		
	}
	
	public void qpsem6(View View){
		Intent myIntent = new Intent(View.getContext(),QpSubjects6.class);
		startActivityForResult(myIntent,0);
		
	}
	
	public void qpsem7(View View){
		Intent myIntent = new Intent(View.getContext(),QpSubjects7.class);
		startActivityForResult(myIntent,0);
		
	}
	
	public void qpsem8(View View){
		Intent myIntent = new Intent(View.getContext(),QpSubjects8.class);
		startActivityForResult(myIntent,0);
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.qp_semesters);
		
		
		
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
