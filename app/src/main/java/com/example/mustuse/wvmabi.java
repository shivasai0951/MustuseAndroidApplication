package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wvmabi extends AppCompatActivity {
    private WebView webview11;

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
        setContentView(R.layout.activity_wvmabi);
        WebView webView = (WebView) findViewById(R.id.webview11);
        this.webview11 = webView;
        webView.setWebViewClient(new MyWebViewClient());
        this.webview11.getSettings().setJavaScriptEnabled(true);
        this.webview11.loadUrl("http://www.manabadi.co.in/");
    }

    public void onBackPressed() {
        if (this.webview11.canGoBack()) {
            this.webview11.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
