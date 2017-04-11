package com.peoplesbench.endroidece;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



import android.app.Activity;
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

public class ThirdSemester extends Activity {

	public void onSubClick(View View){
	
		Spinner et1 = (Spinner)findViewById(R.id.spinner1);
		Spinner et2 = (Spinner)findViewById(R.id.spinner2);
		Spinner et3 = (Spinner)findViewById(R.id.spinner3);
		Spinner et4 = (Spinner)findViewById(R.id.spinner4);
		Spinner et5 = (Spinner)findViewById(R.id.spinner5);
		Spinner et6 = (Spinner)findViewById(R.id.spinner6);
		Spinner et7 = (Spinner)findViewById(R.id.spinner7);
		Spinner et8 = (Spinner)findViewById(R.id.spinner8);
		
		
		String a1 = et1.getSelectedItem().toString();
		String a2 = et2.getSelectedItem().toString();
		String a3 = et3.getSelectedItem().toString();
		String a4 = et4.getSelectedItem().toString();
		String a5 = et5.getSelectedItem().toString();
		String a6 = et6.getSelectedItem().toString();
		String a7 = et7.getSelectedItem().toString();
		String a8 = et8.getSelectedItem().toString();
		
		int b1 = gradeCheck(a1);
		int b2 = gradeCheck(a2);
		int b3 = gradeCheck(a3);
		int b4 = gradeCheck(a4);
		int b5 = gradeCheck(a5);
		int b6 = gradeCheck(a6);
		int b7 = gradeCheck(a7);
		int b8 = gradeCheck(a8);
		
		//Multiplying Grade Points
				int c1 = b1*3;
				int c2 = b2*3;
				int c3 = b3*4;
				int c4 = b4*4;
				int c5 = b5*4;
				int c6 = b6*4;
				int c7 = b7*2;
				int c8 = b8*2;
				
				
				int d[] = {c1,c2,c3,c4,c5,c6,c7,c8};
				
				List<Integer> listA = new ArrayList();
				List<Integer> listB = new ArrayList();
				List<Integer> listC = new ArrayList();
				
				
				for(int i =0;i<=1;i++){
					if(d[i]!=0){
						listA.add(d[i]);
						}
				}
				for(int i =2;i<=5;i++){
					if(d[i]!=0){
						listB.add(d[i]);
						}
				}
				for(int i =6;i<=7;i++){
					if(d[i]!=0){
						listC.add(d[i]);
						}
				}
				
				HashMap<Integer,List<Integer>> nmap = new HashMap<Integer, List<Integer>>();
				
				nmap.put(3,listA);
				nmap.put(4,listB);
				nmap.put(2,listC);
				
				int sum1 = 0;
				int sum2 = 0;
				int sum3 = 0;
				double mul = 0;
				int size1 = 0;
				
				for(Integer key : nmap.keySet()){
					 
					 size1=nmap.get(key).size();
						int new1 = size1*key;
						mul+=new1;
					}
				
					 for(Integer value : nmap.get(3)){
							
					    	sum1+=value;
					    	 
							}
					 for(Integer value : nmap.get(4)){
							
					    	sum2+=value;
					    	 
							}
					 for(Integer value : nmap.get(2)){
							
					    	sum3+=value;
					    	 
							}
					 double sum = sum1+sum2+sum3;
						
					 double result = sum/mul;
					 
					 String gpa = String.format ("%.3f", result);
					 
					 
					 SharedPreferences settingsfile = PreferenceManager.getDefaultSharedPreferences(this);
						SharedPreferences.Editor editor = settingsfile.edit();
						
						editor.putString("thirdsum", String.valueOf(sum));
						editor.putString("thirdmul", String.valueOf(mul));
						
						editor.putString("ts1", a1);
						editor.putString("ts2", a2);
						editor.putString("ts3", a3);
						editor.putString("ts4", a4);
						editor.putString("ts5", a5);
						editor.putString("ts6", a6);
						editor.putString("ts7", a7);
						editor.putString("ts8", a8);
						
						
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


	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third_semester);
		
		
		 TextView tv = (TextView)findViewById(R.id.textView1);     
			tv.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
			
			TextView tv1 = (TextView)findViewById(R.id.button1);     
			tv1.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
		
		Spinner et1 = (Spinner)findViewById(R.id.spinner1);
    	Spinner et2 = (Spinner)findViewById(R.id.spinner2);
    	Spinner et3 = (Spinner)findViewById(R.id.spinner3);
    	Spinner et4 = (Spinner)findViewById(R.id.spinner4);
    	Spinner et5 = (Spinner)findViewById(R.id.spinner5);
    	Spinner et6 = (Spinner)findViewById(R.id.spinner6);
    	Spinner et7 = (Spinner)findViewById(R.id.spinner7);
    	Spinner et8 = (Spinner)findViewById(R.id.spinner8);
    	
    	SharedPreferences settingsfile = PreferenceManager.getDefaultSharedPreferences(this);
        
        String fs1 = settingsfile.getString("ts1","0");
        String fs2 = settingsfile.getString("ts2","0");
        String fs3 = settingsfile.getString("ts3","0");
        String fs4 = settingsfile.getString("ts4","0");
        String fs5 = settingsfile.getString("ts5","0");
        String fs6 = settingsfile.getString("ts6","0");
        String fs7 = settingsfile.getString("ts7","0");
        String fs8 = settingsfile.getString("ts8","0");
        
        int b1 = Check(fs1);
		int b2 = Check(fs2);
		int b3 = Check(fs3);
		int b4 = Check(fs4);
		int b5 = Check(fs5);
		int b6 = Check(fs6);
		int b7 = Check(fs7);
		int b8 = Check(fs8);
		
		   et1.setSelection(b1);
	       et2.setSelection(b2);
	       et3.setSelection(b3);
	       et4.setSelection(b4);
	       et5.setSelection(b5);
	       et6.setSelection(b6);
	       et7.setSelection(b7);
	       et8.setSelection(b8);
		
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
		getMenuInflater().inflate(R.menu.third_semester, menu);
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
		    	Spinner et3 = (Spinner)findViewById(R.id.spinner3);
		    	Spinner et4 = (Spinner)findViewById(R.id.spinner4);
		    	Spinner et5 = (Spinner)findViewById(R.id.spinner5);
		    	Spinner et6 = (Spinner)findViewById(R.id.spinner6);
		    	Spinner et7 = (Spinner)findViewById(R.id.spinner7);
		    	Spinner et8 = (Spinner)findViewById(R.id.spinner8);
		    	
		    	et1.setSelection(0);
		        et2.setSelection(0);
		        et3.setSelection(0);
		        et4.setSelection(0);
		        et5.setSelection(0);
		        et6.setSelection(0);
		        et7.setSelection(0);
		        et8.setSelection(0);
		    
			
			
			
			
			SharedPreferences settingsfile = PreferenceManager.getDefaultSharedPreferences(this);
			SharedPreferences.Editor editor = settingsfile.edit();
			
			editor.putString("thirdsum", "0");
			editor.putString("thirdmul", "0");
			
			editor.commit();
			
			Toast.makeText(this, "cleared",Toast.LENGTH_SHORT).show(); 
			
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
