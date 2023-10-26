package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wvis extends AppCompatActivity {
    private WebView webview2;

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
        setContentView(R.layout.activity_wvis);
        WebView webView = (WebView) findViewById(R.id.webview2);
        this.webview2 = webView;
        webView.setWebViewClient(new MyWebViewClient());
        this.webview2.getSettings().setJavaScriptEnabled(true);
        this.webview2.loadUrl("https://www.instagram.com/");
    }

    public void onBackPressed() {
        if (this.webview2.canGoBack()) {
            this.webview2.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
