package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wvel extends AppCompatActivity {
    private WebView webview4;

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
        setContentView(R.layout.activity_wvel);
        WebView webView = (WebView) findViewById(R.id.webview4);
        this.webview4 = webView;
        webView.setWebViewClient(new MyWebViewClient());
        this.webview4.getSettings().setJavaScriptEnabled(true);
        this.webview4.loadUrl("https://mail.google.com/mail/u/0/#inbox");
    }

    public void onBackPressed() {
        if (this.webview4.canGoBack()) {
            this.webview4.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
