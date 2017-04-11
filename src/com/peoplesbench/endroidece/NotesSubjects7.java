package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NotesSubjects7 extends Activity {
	
public void onrf(View View){
		
		Intent myIntent = new Intent(View.getContext(),SevRf.class);
		startActivityForResult(myIntent,0);
		
	}

public void onocn(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevOcn.class);
	startActivityForResult(myIntent,0);
	
}

public void onert(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevErt.class);
	startActivityForResult(myIntent,0);
	
}

public void onsc(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevSc.class);
	startActivityForResult(myIntent,0);
	
}

public void onet(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevEt.class);
	startActivityForResult(myIntent,0);
	
}

public void onsoc(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevSoc.class);
	startActivityForResult(myIntent,0);
	
}

public void ondip(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevDip.class);
	startActivityForResult(myIntent,0);
	
}

public void onsp(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevSp.class);
	startActivityForResult(myIntent,0);
	
}

public void onwt(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevWt.class);
	startActivityForResult(myIntent,0);
	
}

public void onaca(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevAca.class);
	startActivityForResult(myIntent,0);
	
}

public void onep(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevEp.class);
	startActivityForResult(myIntent,0);
	
}

public void onemic(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevEmic.class);
	startActivityForResult(myIntent,0);
	
}


public void oncmos(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevCmos.class);
	startActivityForResult(myIntent,0);
	
}

public void onampmc(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevAmpmc.class);
	startActivityForResult(myIntent,0);
	
}

public void oncr(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevCr.class);
	startActivityForResult(myIntent,0);
	
}

public void onrn(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevRn.class);
	startActivityForResult(myIntent,0);
	
}

public void onoed(View View){
	
	Intent myIntent = new Intent(View.getContext(),SevOed.class);
	startActivityForResult(myIntent,0);
	
}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes_subjects7);
		
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
