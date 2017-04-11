package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Results extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 setContentView(R.layout. results);
		    
		    Intent intent = getIntent();
		    Bundle bundle = intent.getExtras();
		    String gpa = bundle.getString("gpa");
		    
		    TextView textv1=(TextView)findViewById(R.id.textView20);
			 
			textv1.setText(gpa);
			textv1.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
			
		 TextView tv = (TextView)findViewById(R.id.textView1);     
		 tv.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
		
		 TextView tv1 = (TextView)findViewById(R.id.textView19);     
			tv1.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.results, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			
			SharedPreferences settingsfile = PreferenceManager.getDefaultSharedPreferences(this);
			SharedPreferences.Editor editor = settingsfile.edit();
			
			editor.putString("firstsum", "0");
			editor.putString("firstmul", "0");
			
			editor.putString("secondsum", "0");
			editor.putString("secondmul", "0");
			
			editor.putString("thirdsum", "0");
			editor.putString("thirdmul", "0");
			
			editor.putString("fourthsum", "0");
			editor.putString("fourthmul", "0");
			
			editor.putString("fifthsum", "0");
			editor.putString("fifthmul", "0");
			
			editor.putString("sixthsum", "0");
			editor.putString("sixthmul", "0");
			
			editor.putString("seventhsum", "0");
			editor.putString("seventhmul", "0");
			
			editor.putString("eighthsum", "0");
			editor.putString("eighthmul", "0");
			
			editor.putString("fs1", "0");
			editor.putString("fs2", "0");
			editor.putString("fs3", "0");
			editor.putString("fs4", "0");
			editor.putString("fs5", "0");
			editor.putString("fs6", "0");
			editor.putString("fs7", "0");
			editor.putString("fs8", "0");
			editor.putString("fs9", "0");
			
			editor.putString("secs1", "0");
			editor.putString("secs2", "0");
			editor.putString("secs3", "0");
			editor.putString("secs4", "0");
			editor.putString("secs5", "0");
			editor.putString("secs6", "0");
			editor.putString("secs7", "0");
			editor.putString("secs8", "0");
			
			editor.putString("ts1", "0");
			editor.putString("ts2", "0");
			editor.putString("ts3", "0");
			editor.putString("ts4", "0");
			editor.putString("ts5", "0");
			editor.putString("ts6", "0");
			editor.putString("ts7", "0");
			editor.putString("ts8", "0");
			
			editor.putString("frs1", "0");
			editor.putString("frs2", "0");
			editor.putString("frs3", "0");
			editor.putString("frs4", "0");
			editor.putString("frs5", "0");
			editor.putString("frs6", "0");
			editor.putString("frs7", "0");
			editor.putString("frs8", "0");
			editor.putString("frs9", "0");
			
			editor.putString("fifs1", "0");
			editor.putString("fifs2", "0");
			editor.putString("fifs3", "0");
			editor.putString("fifs4", "0");
			editor.putString("fifs5", "0");
			editor.putString("fifs6", "0");
			editor.putString("fifs7", "0");
			editor.putString("fifs8", "0");

			editor.putString("sixs1", "0");
			editor.putString("sixs2", "0");
			editor.putString("sixs3", "0");
			editor.putString("sixs4", "0");
			editor.putString("sixs5", "0");
			editor.putString("sixs6", "0");
			editor.putString("sixs7", "0");
			editor.putString("sixs8", "0");
			editor.putString("sixs9", "0");
			
			editor.putString("sevs1", "0");
			editor.putString("sevs2", "0");
			editor.putString("sevs3", "0");
			editor.putString("sevs4", "0");
			editor.putString("sevs5", "0");
			editor.putString("sevs6", "0");
			editor.putString("sevs7", "0");
			editor.putString("sevs8", "0");
			
			editor.putString("es1", "0");
			editor.putString("es2", "0");
			editor.putString("es3", "0");
			editor.putString("es4", "0");
			editor.putString("es5", "0");
			
			editor.commit();
			
			Toast.makeText(this, "cleared all",Toast.LENGTH_SHORT).show();
			
			TextView tv = (TextView)findViewById(R.id.textView20);
			tv.setText(" "+0.00);
			
			
			
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
