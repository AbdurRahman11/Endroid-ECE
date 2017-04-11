package com.peoplesbench.endroidece;




import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Index extends Activity  {
	
	
	
	public static class RateItDialogFragment extends DialogFragment {
	    private static final int LAUNCHES_UNTIL_PROMPT = 5;
	    private static final int DAYS_UNTIL_PROMPT = 1;
	    private static final int MILLIS_UNTIL_PROMPT = DAYS_UNTIL_PROMPT ;//* 24 * 60 * 60 * 1000;
	    private static final String PREF_NAME = "APP_RATER";
	    private static final String LAST_PROMPT = "LAST_PROMPT";
	    private static final String LAUNCHES = "LAUNCHES";
	    private static final String DISABLED = "DISABLED";

	    public static  void show(Context context, FragmentManager fragmentManager) {
	        boolean shouldShow = false;
	        SharedPreferences sharedPreferences = getSharedPreferences(context);
	        SharedPreferences.Editor editor = sharedPreferences.edit();
	        long currentTime = System.currentTimeMillis();
	        long lastPromptTime = sharedPreferences.getLong(LAST_PROMPT, 0);
	        if (lastPromptTime == 0) {
	            lastPromptTime = currentTime;
	            editor.putLong(LAST_PROMPT, lastPromptTime);
	        }

	        if (!sharedPreferences.getBoolean(DISABLED, false)) {
	            int launches = sharedPreferences.getInt(LAUNCHES, 0) + 1;
	            if (launches > LAUNCHES_UNTIL_PROMPT) {
	                if (currentTime > lastPromptTime + MILLIS_UNTIL_PROMPT) {
	                    shouldShow = true;
	                }
	            }
	            editor.putInt(LAUNCHES, launches);
	        }

	        if (shouldShow) {
	            editor.putInt(LAUNCHES, 0).putLong(LAST_PROMPT, System.currentTimeMillis()).commit();
	            new RateItDialogFragment().show(fragmentManager, null);
	        } else {
	            editor.commit();
	        }
	    }

	    private static SharedPreferences getSharedPreferences(Context context) {
	        return context.getSharedPreferences(PREF_NAME, 0);
	    }

	    @Override
	    public Dialog onCreateDialog(Bundle savedInstanceState) {
	        return new AlertDialog.Builder(getActivity())
	                
	                .setTitle(R.string.rate_title)
	                .setMessage(R.string.rate_message)
	                .setPositiveButton(R.string.rate_positive, new DialogInterface.OnClickListener() {
	                	public void onClick(DialogInterface dialog, int which) {
	                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getActivity().getPackageName())));
	                        getSharedPreferences(getActivity()).edit().putBoolean(DISABLED, true).commit();
	                        dismiss();
	                    }
	                })
	                .setNeutralButton(R.string.rate_remind_later, new DialogInterface.OnClickListener() {
	                    @Override
	                    public void onClick(DialogInterface dialog, int which) {
	                        dismiss();
	                    }
	                })
	                .setNegativeButton(R.string.rate_never, new DialogInterface.OnClickListener() {
	                    @Override
	                    public void onClick(DialogInterface dialog, int which) {
	                        getSharedPreferences(getActivity()).edit().putBoolean(DISABLED, true).commit();
	                        dismiss();
	                    }
	                    
	                })
	                
	                .create();
	         }
	    
	   
	   
		public void onStart() {
	        super.onStart();
	        
	        //((AlertDialog) getDialog()).getWindow().setBackgroundDrawableResource(android.R.color.transparent);	
	    
	       
	        
	    Button positive = ((AlertDialog) getDialog()).getButton(AlertDialog.BUTTON_POSITIVE);
	    positive.setTextColor(Color.parseColor("#4db1e3"));
	  
	    
	    Button negative = ((AlertDialog) getDialog()).getButton(AlertDialog.BUTTON_NEGATIVE);
		negative.setTextColor(Color.parseColor("#4db1e3"));
	    
	    
	    Button neutral = ((AlertDialog) getDialog()).getButton(AlertDialog.BUTTON_NEUTRAL);
		neutral.setTextColor(Color.parseColor("#4db1e3"));
	   
		((AlertDialog) getDialog()).setInverseBackgroundForced(true);
	    
	}
	}

	
	

	private boolean doubleBackToExitPressedOnce = false;
	
	//for press back again to exit
	
	@Override
	protected void onResume() {
	    super.onResume();
	    // .... other stuff in my onResume ....
	    this.doubleBackToExitPressedOnce = false;
	}

	@Override
	public void onBackPressed() {
	    if (doubleBackToExitPressedOnce) {
	        super.onBackPressed();
	        return;
	    }
	    this.doubleBackToExitPressedOnce = true;
	    RateItDialogFragment.show(this, getFragmentManager());
	    Toast.makeText(this, R.string.exittwice, Toast.LENGTH_SHORT).show();
	}
	
	
	
	
	
	
	public void onsubclick(View View){
	
		Intent myIntent = new Intent(View.getContext(),Cgpa.class);
		startActivityForResult(myIntent,0);
		
	}
	
	public void onqpclick(View View){
		
		Intent myIntent = new Intent(View.getContext(),QpSemesters.class);
		startActivityForResult(myIntent,0);
		
	}
	
	public void onnotclick(View View){
		
		Intent myIntent = new Intent(View.getContext(),NotesSemesters.class);
		startActivityForResult(myIntent,0);
		
	}
	
	public void onsylclick(View View){
		
		Intent myIntent = new Intent(View.getContext(),Syllabus.class);
		startActivityForResult(myIntent,0);
		
		
		
	}
	
public void onabclick(View View){
		
		Intent myIntent = new Intent(View.getContext(),Aboutus.class);
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
		this.setContentView(R.layout.index);
		TextView tv = (TextView)findViewById(R.id.textView1);     
		tv.setTypeface(Typeface.createFromAsset(getAssets(),"Neon.ttf"));
	
		
		
		 
		
		
		/*	android.app.ActionBar mActionBar = getActionBar();
		mActionBar.setDisplayShowHomeEnabled(false);
		mActionBar.setDisplayShowTitleEnabled(false);
		LayoutInflater mInflater = LayoutInflater.from(this);
		
		View mCustomView = mInflater.inflate(R.layout.custom_actionbar, null);
		TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.title_text);
		mTitleTextView.setText("HANDBOOK ECE");
		

		mActionBar.setCustomView(mCustomView);
		mActionBar.setDisplayShowCustomEnabled(true); */
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	//	getMenuInflater().inflate(R.menu.index, menu);
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
