package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wvptm extends AppCompatActivity {
    private WebView webview12;

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
        setContentView(R.layout.activity_wvptm);
        WebView webView = (WebView) findViewById(R.id.webview12);
        this.webview12 = webView;
        webView.setWebViewClient(new MyWebViewClient());
        this.webview12.getSettings().setJavaScriptEnabled(true);
        this.webview12.loadUrl("https://paytm.com/");
    }

    public void onBackPressed() {
        if (this.webview12.canGoBack()) {
            this.webview12.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
