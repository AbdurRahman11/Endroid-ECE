package com.peoplesbench.endroidece;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;


import android.app.Activity;
import android.content.Context;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;



public class Syllabus extends Activity  {


	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_syllabus);
		
		CopyReadAssets();	    
		/*Intent intent = new Intent(Intent.ACTION_VIEW,
		        Uri.parse("android.resource://com.hugetrunk.handbookece/raw/semesters.pdf"));
		intent.setType("application/pdf");
		PackageManager pm = getPackageManager();
		List<ResolveInfo> activities = pm.queryIntentActivities(intent, 0);
		if (activities.size() > 0) {
		    startActivity(intent);
		} else {
			WebView webview = (WebView) findViewById(R.id.webweb);
			webview.getSettings().setJavaScriptEnabled(true); 
			String pdf = "https://drive.google.com/file/d/0BzFBMYepdT82Y0dHcmEyZ05WdGM/view?usp=sharing";
			webview.loadUrl(pdf);
		}
		
		
		*/
		

	}

	
	 @SuppressWarnings("deprecation")
	private void CopyReadAssets()
     {
         AssetManager assetManager = getAssets();

         InputStream in = null;
         OutputStream out = null;
         File file = new File(getFilesDir(), "semesters.pdf");
         try
         {
             in = assetManager.open("semesters.pdf");
             out = openFileOutput(file.getName(),Context.MODE_WORLD_READABLE);

             copyFile(in, out);
             in.close();
             in = null;
             out.flush();
             out.close();
             out = null;
         } catch (Exception e)
         {
             Log.e("tag", e.getMessage());
         }

         Intent intent = new Intent(Intent.ACTION_VIEW);
         intent.setDataAndType(
                 Uri.parse("file://" + getFilesDir() + "/semesters.pdf"),
                 "application/pdf");
         PackageManager pm = getPackageManager();
 		List<ResolveInfo> activities = pm.queryIntentActivities(intent, 0);
 		if (activities.size() > 0) {
 		    startActivity(intent);
 		} else {
 			WebView webview = (WebView) findViewById(R.id.webweb);
 			webview.getSettings().setJavaScriptEnabled(true); 
 			String pdf = "https://drive.google.com/file/d/0BzFBMYepdT82Y0dHcmEyZ05WdGM/view?usp=sharing";
 			webview.loadUrl(pdf);
 		}
         
     }

     private void copyFile(InputStream in, OutputStream out) throws IOException
     {
         byte[] buffer = new byte[1024];
         int read;
         while ((read = in.read(buffer)) != -1)
         {
             out.write(buffer, 0, read);
         }
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
