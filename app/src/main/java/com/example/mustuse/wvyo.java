package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wvyo extends AppCompatActivity {
    private WebView webview5;

    protected class MyWebViewClient extends WebViewClient {
        protected MyWebViewClient() {
        }

        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wvyo);
        WebView webView = (WebView) findViewById(R.id.webview5);
        this.webview5 = webView;
        webView.setWebViewClient(new MyWebViewClient());
        this.webview5.getSettings().setJavaScriptEnabled(true);
        this.webview5.loadUrl("https://www.yahoo.com/");
    }

    public void onBackPressed() {
        if (this.webview5.canGoBack()) {
            this.webview5.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
