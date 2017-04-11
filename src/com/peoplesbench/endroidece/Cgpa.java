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

public class Cgpa extends Activity {
	
	
	public void onsem1(View View){
		
		Intent myIntent = new Intent(View.getContext(),FirstSemester.class);
		startActivityForResult(myIntent,0);
		
	}
	
public void onsem2(View View){
		
		Intent myIntent = new Intent(View.getContext(),SecondSemester.class);
		startActivityForResult(myIntent,0);
		
	}

public void onsem3(View View){
	
	Intent myIntent = new Intent(View.getContext(),ThirdSemester.class);
	startActivityForResult(myIntent,0);
	
}

public void onsem4(View View){
	
	Intent myIntent = new Intent(View.getContext(),FourthSemester.class);
	startActivityForResult(myIntent,0);
	
}

public void onsem5(View View){
	
	Intent myIntent = new Intent(View.getContext(),FifthSemester.class);
	startActivityForResult(myIntent,0);
	
}

public void onsem6(View View){
	
	Intent myIntent = new Intent(View.getContext(),SixthSemester.class);
	startActivityForResult(myIntent,0);
	
}

public void onsem7(View View){
	
	Intent myIntent = new Intent(View.getContext(),SeventhSemester.class);
	startActivityForResult(myIntent,0);
	
}

public void onsem8(View View){
	
	Intent myIntent = new Intent(View.getContext(),EightSemester.class);
	startActivityForResult(myIntent,0);
	
}

public void cgpa(View View){
	
	Intent myIntent = new Intent(View.getContext(),Cgparesults.class);
	startActivityForResult(myIntent,0);
	
}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		//setContentView(R.layout.index);//Remove title bar
				this.requestWindowFeature(Window.FEATURE_NO_TITLE);

				//Remove notification bar
				//this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

				//set content view AFTER ABOVE sequence (to avoid crash)
				setContentView(R.layout.cgpa);
				
				TextView tv = (TextView)findViewById(R.id.textView1);     
				tv.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
				
				TextView tv1 = (TextView)findViewById(R.id.button1);     
				tv1.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cgpa, menu);
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
