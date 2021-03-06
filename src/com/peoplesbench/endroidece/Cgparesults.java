package com.peoplesbench.endroidece;



import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Cgparesults extends Activity {

	
	public static final String PREFERENCES_FILE_NAME = "MyPrefs";	
		
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cgparesults);
		
		SharedPreferences settingsfile = PreferenceManager.getDefaultSharedPreferences(this);
		
		String sum1 = settingsfile.getString("firstsum","0");
		String sum2 = settingsfile.getString("secondsum","0");
		String sum3 = settingsfile.getString("thirdsum","0");
		String sum4 = settingsfile.getString("fourthsum","0");
		String sum5 = settingsfile.getString("fifthsum","0");
		String sum6 = settingsfile.getString("sixthsum","0");
		String sum7 = settingsfile.getString("seventhsum","0");
		String sum8 = settingsfile.getString("eightsum","0");
		
		String mul1 = settingsfile.getString("firstmul","0");
		String mul2 = settingsfile.getString("secondmul","0");
		String mul3 = settingsfile.getString("thirdmul","0");
		String mul4 = settingsfile.getString("fourthmul","0");
		String mul5 = settingsfile.getString("fifthmul","0");
		String mul6 = settingsfile.getString("sixthmul","0");
		String mul7 = settingsfile.getString("seventhmul","0");
		String mul8 = settingsfile.getString("eightmul","0");
		
		double fsum1 = Double.parseDouble(sum1);  
		double fsum2 = Double.parseDouble(sum2);
		double fsum3 = Double.parseDouble(sum3);
		double fsum4 = Double.parseDouble(sum4);
		double fsum5 = Double.parseDouble(sum5);
		double fsum6 = Double.parseDouble(sum6);
		double fsum7 = Double.parseDouble(sum7);
		double fsum8 = Double.parseDouble(sum8);
		
		double fmul1 = Double.parseDouble(mul1);  
		double fmul2 = Double.parseDouble(mul2);
		double fmul3 = Double.parseDouble(mul3);
		double fmul4 = Double.parseDouble(mul4);
		double fmul5 = Double.parseDouble(mul5);
		double fmul6 = Double.parseDouble(mul6);
		double fmul7 = Double.parseDouble(mul7);
		double fmul8 = Double.parseDouble(mul8);
		
		
		double sum = fsum1+fsum2+fsum3+fsum4+fsum5+fsum6+fsum7+fsum8;
		double mul = fmul1+fmul2+fmul3+fmul4+fmul5+fmul6+fmul7+fmul8;
		
		
		
		double result = sum/mul;

		String  cgpa = String.format ("%.3f", result);
		
		 TextView textv1=(TextView)findViewById(R.id.textView20);
		 
			textv1.setText(cgpa);
			textv1.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
			
		 TextView tv = (TextView)findViewById(R.id.textView1);     
		 tv.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
		
		 TextView tv1 = (TextView)findViewById(R.id.textView19);     
			tv1.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cgparesults, menu);
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
