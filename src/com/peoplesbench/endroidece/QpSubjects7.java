package com.peoplesbench.endroidece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class QpSubjects7 extends Activity {
	
public void qprf(View View){
		
		Intent myIntent = new Intent(View.getContext(),QpRf.class);
		startActivityForResult(myIntent,0);
		
	}

public void qpocn(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpOcn.class);
	startActivityForResult(myIntent,0);
	
}

public void qpert(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpErt.class);
	startActivityForResult(myIntent,0);
	
}

public void qpsc(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpScn.class);
	startActivityForResult(myIntent,0);
	
}

public void qpet(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpEt.class);
	startActivityForResult(myIntent,0);
	
}

public void qpsoc(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpSoc.class);
	startActivityForResult(myIntent,0);
	
}

public void qpdip(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpDip.class);
	startActivityForResult(myIntent,0);
	
}

public void qpsp(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpSp.class);
	startActivityForResult(myIntent,0);
	
} 

public void qpwt(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpWt.class);
	startActivityForResult(myIntent,0);
	
} 

public void qpaca(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpAca.class);
	startActivityForResult(myIntent,0);
	
} 

public void qpep(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpEp.class);
	startActivityForResult(myIntent,0);
	
} 


public void qpemic(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpEmic.class);
	startActivityForResult(myIntent,0);
	
} 

public void qpcmos(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpCmos.class);
	startActivityForResult(myIntent,0);
	
} 

public void qpampmc(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpAmpmc.class);
	startActivityForResult(myIntent,0);
	
} 

public void qpcr(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpCr.class);
	startActivityForResult(myIntent,0);
	
} 

public void qprn(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpRn.class);
	startActivityForResult(myIntent,0);
	
} 

public void qpoed(View View){
	
	Intent myIntent = new Intent(View.getContext(),QpOed.class);
	startActivityForResult(myIntent,0);
	
} 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.qp_subjects7);
		
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
