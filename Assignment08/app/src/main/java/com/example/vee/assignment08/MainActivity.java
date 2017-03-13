package com.example.vee.assignment08;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtMsg;
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMsg = (TextView) findViewById(R.id.txt_header);

        demo1TrySpecificUrl();



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; add items to the action bar
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.back_page) {
            webView.goBack();

            return true;
        }
        else if (id == R.id.forward_page) {

            webView.goForward();
            return true;
        }
        else if (id == R.id.reload_page) {
            webView.reload();

            return true;
        }
        else if (id == R.id.zoom_in) {
            webView.zoomIn();
            return true;
        }
        else if (id == R.id.zoom_out) {
          webView.zoomOut();
            return true;
        }
        return false;
    }


    @SuppressLint("SetJavaScriptEnabled")
    private  void demo1TrySpecificUrl() {
        webView = (WebView) findViewById(R.id.firstPage);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new MyWebViewClient());

        webView.loadUrl("https://www.google.com");
    }
}
