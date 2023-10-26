package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wvfb extends AppCompatActivity {
    private WebView webview1;

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
        setContentView(R.layout.activity_wvfb);
        WebView webView = (WebView) findViewById(R.id.webview1);
        this.webview1 = webView;
        webView.setWebViewClient(new MyWebViewClient());
        this.webview1.getSettings().setJavaScriptEnabled(true);
        this.webview1.loadUrl("https://www.facebook.com/");
    }

    public void onBackPressed() {
        if (this.webview1.canGoBack()) {
            this.webview1.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
