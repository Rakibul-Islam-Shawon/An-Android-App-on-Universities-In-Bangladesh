package com.gdm.bduvguide.PrivateUniversity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.gdm.bduvguide.R;

public class BRACU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracu);
        WebView webView =(WebView)findViewById(R.id.webView) ;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        webView.loadUrl("file:///android_asset/html_directory/private_html/BRACU.html");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }



    //back button method
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
