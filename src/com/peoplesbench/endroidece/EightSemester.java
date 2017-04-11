package com.peoplesbench.endroidece;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class EightSemester extends Activity {
	
	
	public void onSubClick(View View){
		
		Spinner et1 = (Spinner)findViewById(R.id.spinner1);
		Spinner et2 = (Spinner)findViewById(R.id.spinner2);
		Spinner et3 = (Spinner)findViewById(R.id.spinner5);
		Spinner et4 = (Spinner)findViewById(R.id.spinner6);
		Spinner et5 = (Spinner)findViewById(R.id.spinner7);
		
		String a1 = et1.getSelectedItem().toString();
		String a2 = et2.getSelectedItem().toString();
		String a3 = et3.getSelectedItem().toString();
		String a4 = et4.getSelectedItem().toString();
		String a5 = et5.getSelectedItem().toString();
		
		int b1 = gradeCheck(a1);
		int b2 = gradeCheck(a2);
		int b3 = gradeCheck(a3);
		int b4 = gradeCheck(a4);
		int b5 = gradeCheck(a5);
		
		//Multiplying Grade Points
				int c1 = b1*3;
				int c2 = b2*3;
				int c3 = b3*3;
				int c4 = b4*3;
				int c5 = b5*6;
				
				int d[] = {c1,c2,c3,c4,c5};
				
				List<Integer> listA = new ArrayList();
				List<Integer> listB = new ArrayList();
				

				for(int i =0;i<=3;i++){
					if(d[i]!=0){
						listA.add(d[i]);
						}
				}
				for(int i =4;i<5;i++){
					if(d[i]!=0){
						listB.add(d[i]);
						}
				}
				
				HashMap<Integer,List<Integer>> nmap = new HashMap<Integer, List<Integer>>();
				
				nmap.put(3,listA);
				nmap.put(6,listB);
				
				int sum1 = 0;
				int sum2 = 0;
				
				int mul = 0;
				int size1 = 0;
				
				for(Integer key : nmap.keySet()){
					 
					 size1=nmap.get(key).size();
						int new1 = size1*key;
						mul+=new1;
					}
				
					 for(Integer value : nmap.get(3)){
							
					    	sum1+=value;
					    	 
							}
					 for(Integer value : nmap.get(6)){
							
					    	sum2+=value;
					    	 
							}
					 double sum = sum1+sum2;
						
					 double result = sum/mul;
					 
					 String gpa = String.format ("%.3f", result);
					 
					 
					 SharedPreferences settingsfile = PreferenceManager.getDefaultSharedPreferences(this);
						SharedPreferences.Editor editor = settingsfile.edit();
						
						editor.putString("eightsum", String.valueOf(sum));
						editor.putString("eightmul", String.valueOf(mul));
						
						editor.putString("es1", a1);
						editor.putString("es2", a2);
						editor.putString("es3", a3);
						editor.putString("es4", a4);
						editor.putString("es5", a5);
						
						editor.commit();
					 
					 
					 Intent myIntent = new Intent(View.getContext(),Results.class);
						myIntent.putExtra("gpa", gpa);
						startActivityForResult(myIntent,0);
				
		
	}
	
	
	public int gradeCheck(String a){
		int m1 = 0;
		if(a.equals("S")||a.equals("s")){
			
			 m1 = 10;
			
		}else if(a.equals("A")||a.equals("a")){
			
			 m1 = 9;
			
		}else if(a.equals("B")||a.equals("b")){
			
			 m1 = 8;
			
		}else if(a.equals("C")||a.equals("c")){
			
			 m1 = 7;
			
		}else if(a.equals("D")||a.equals("d")){
			
			 m1 = 6;
			
		}else if(a.equals("E")||a.equals("e")){
			
			 m1 = 5;
			
		}
		/* else if(a.equals("NA")||a.equals("na")){
			
			AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
			builder1.setMessage("Please select ant Grade for Subjects");
			builder1.setCancelable(true);
			
			builder1.setPositiveButton("OK", 
					new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int id) {
							// TODO Auto-generated method stub
							dialog.cancel();
						}
					}
					);
			builder1.setNegativeButton("Cancel", 
					new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int id) {
							// TODO Auto-generated method stub
							dialog.cancel();
						}
					}
					);
			
			AlertDialog alert11 = builder1.create();
			alert11.show();
			
		}*/
		else{
		
			m1 = 0;
		}
		
		return m1;
		}
	
	
	private TextView button;
	
public void onelclick(View View){
		
		button = (TextView)findViewById(R.id.textView11);
		
		final String[] items = {"RF SYSTEM DESIGN","AD HOC SENSOR NETWORKS","INDIAN CONSTITUTION SOCIETY","MULTIMEDIA COMPRESSION AND COMMN.","PROFESSIONAL ETHICS"};
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		
		builder.setTitle("Choose a Subject");
		builder.setItems(items,new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
			
				button.setText(items[which]);
				
			}
		});
		builder
		.setCancelable(false)
		.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		}); 
				AlertDialog alert = builder.create();
				
				alert.show();

		}

public void twolclick(View View){
	
	button = (TextView)findViewById(R.id.textView13);
	
	final String[] items = {"DATA CONVERTERS","CRYPTOGRAPHY AND NETWORK SECURITY","TOTAL QUALITY MANAGEMENT","ENTREPRENEURSHIP DEVELOPMENT","SOFTWARE PROJECT MANAGEMENT"};
	
	AlertDialog.Builder builder = new AlertDialog.Builder(this);
	
	builder.setTitle("Choose a Subject");
	builder.setItems(items,new DialogInterface.OnClickListener() {
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
		
			button.setText(items[which]);
			
		}
	});
	builder
	.setCancelable(false)
	.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
			// TODO Auto-generated method stub
			dialog.dismiss();
		}
	}); 
			AlertDialog alert = builder.create();
			
			alert.show();

	}



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eight_semester);
		
		 TextView tv = (TextView)findViewById(R.id.textView1);     
			tv.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
			
			TextView tv1 = (TextView)findViewById(R.id.button1);     
			tv1.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
		
		Spinner et1 = (Spinner)findViewById(R.id.spinner1);
		Spinner et2 = (Spinner)findViewById(R.id.spinner2);
		Spinner et3 = (Spinner)findViewById(R.id.spinner5);
		Spinner et4 = (Spinner)findViewById(R.id.spinner6);
		Spinner et5 = (Spinner)findViewById(R.id.spinner7);
	    	
	    	SharedPreferences settingsfile = PreferenceManager.getDefaultSharedPreferences(this);
	        
	        String fs1 = settingsfile.getString("es1","0");
	        String fs2 = settingsfile.getString("es2","0");
	        String fs3 = settingsfile.getString("es3","0");
	        String fs4 = settingsfile.getString("es4","0");
	        String fs5 = settingsfile.getString("es5","0");
	        
	        int b1 = Check(fs1);
			int b2 = Check(fs2);
			int b3 = Check(fs3);
			int b4 = Check(fs4);
			int b5 = Check(fs5);
			
			et1.setSelection(b1);
		       et2.setSelection(b2);
		       et3.setSelection(b3);
		       et4.setSelection(b4);
		       et5.setSelection(b5);
		
	}
	
	 public int Check(String a){
	    	
	    	int m1 = 0;
	    	
	    	if(a.equals("S")||a.equals("s")){
	    		
	   		 m1 = 1;
	   		
	   	}else if(a.equals("A")||a.equals("a")){
	   		
	   		 m1 = 2;
	   		
	   	}else if(a.equals("B")||a.equals("b")){
	   		
	   		 m1 = 3;
	   		
	   	}else if(a.equals("C")||a.equals("c")){
			
			 m1 = 4;
			
		}else if(a.equals("D")||a.equals("d")){
			
			 m1 = 5;
			
		}else if(a.equals("E")||a.equals("e")){
			
			 m1 = 6;
			
		}else if(a.equals("U")||a.equals("u")){
			
			 m1 = 7;
			
		}
	    	
	    	else{
	    		
	    		m1 = 0;
	    	}
	    	
	    	return m1;
	    	}
	    	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eight_semester, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			
			Spinner et1 = (Spinner)findViewById(R.id.spinner1);
			Spinner et2 = (Spinner)findViewById(R.id.spinner2);
			Spinner et3 = (Spinner)findViewById(R.id.spinner5);
			Spinner et4 = (Spinner)findViewById(R.id.spinner6);
			Spinner et5 = (Spinner)findViewById(R.id.spinner7);
	    
	    	et1.setSelection(0);
	        et2.setSelection(0);
	        et3.setSelection(0);
	        et4.setSelection(0);
	        et5.setSelection(0);
			
			SharedPreferences settingsfile = PreferenceManager.getDefaultSharedPreferences(this);
			SharedPreferences.Editor editor = settingsfile.edit();
			
			editor.putString("eightsum", "0");
			editor.putString("eightmul", "0");
			
			editor.commit();
			
			Toast.makeText(this, "cleared",Toast.LENGTH_SHORT).show(); 
			
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
