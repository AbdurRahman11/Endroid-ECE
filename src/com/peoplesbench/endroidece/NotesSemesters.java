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

public class NotesSemesters extends Activity {
	
	
	public void notsem1(View View){
		
		Intent myIntent = new Intent(View.getContext(),NotesSubjects.class);
		startActivityForResult(myIntent,0);
		
	}
	
public void notsem2(View View){
		
		Intent myIntent = new Intent(View.getContext(),NotesSubjects2.class);
		startActivityForResult(myIntent,0);
		
	}

public void notsem3(View View){
	
	Intent myIntent = new Intent(View.getContext(),NotesSubjects3.class);
	startActivityForResult(myIntent,0);
	
}

public void notsem4(View View){
	
	Intent myIntent = new Intent(View.getContext(),NotesSubjects4.class);
	startActivityForResult(myIntent,0);
	
}

public void notsem5(View View){
	
	Intent myIntent = new Intent(View.getContext(),NotesSubjects5.class);
	startActivityForResult(myIntent,0);
	
}

public void notsem6(View View){
	
	Intent myIntent = new Intent(View.getContext(),NotesSubjects6.class);
	startActivityForResult(myIntent,0);
	
}

public void notsem7(View View){
	
	Intent myIntent = new Intent(View.getContext(),NotesSubjects7.class);
	startActivityForResult(myIntent,0);
	
}

public void notsem8(View View){
	
	Intent myIntent = new Intent(View.getContext(),NotesSubjects8.class);
	startActivityForResult(myIntent,0);
	
}

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.notes_semesters);
		
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
