package com.peoplesbench.endroidece;

import java.io.File;


import android.app.Activity;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SecEd extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sec_ed);
		
		WebView webview = (WebView) findViewById(R.id.seced);
		webview.getSettings().setJavaScriptEnabled(true); 
		webview.setWebViewClient(new WebViewClient());
		webview.clearCache(true);
		String pdf = "http://bigboxtest.byethost7.com/ece/ed.html";
		webview.loadUrl(pdf);
		

webview.setDownloadListener(new DownloadListener() {
            @Override
			public void onDownloadStart(String url, String userAgent,
                    String contentDisposition, String mimetype,
                    long contentLength) {
     Request request = new Request(Uri.parse(url));
                        request.allowScanningByMediaScanner();
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                     
                     
                        String newString ="download.rar";
                     
                     
                   
                       
                        File sdCard = Environment.getExternalStorageDirectory();
                        String folder = sdCard.getAbsolutePath() ;
                   
                     
                       request.setDestinationInExternalPublicDir(folder, newString);
                     
                     
                        DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                     
                     
                        dm.enqueue(request);
                     
                     

            }
        });


		
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
