package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wvggl extends AppCompatActivity {
    private WebView webview7;

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
        setContentView(R.layout.activity_wvggl);
        WebView webView = (WebView) findViewById(R.id.webview7);
        this.webview7 = webView;
        webView.setWebViewClient(new MyWebViewClient());
        this.webview7.getSettings().setJavaScriptEnabled(true);
        this.webview7.loadUrl("https://www.google.com/");
    }

    public void onBackPressed() {
        if (this.webview7.canGoBack()) {
            this.webview7.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
