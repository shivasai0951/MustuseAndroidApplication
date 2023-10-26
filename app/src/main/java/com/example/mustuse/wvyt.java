package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wvyt extends AppCompatActivity {
    private WebView webview6;

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
        setContentView(R.layout.activity_wvyt);
        WebView webView = (WebView) findViewById(R.id.webview6);
        this.webview6 = webView;
        webView.setWebViewClient(new MyWebViewClient());
        this.webview6.getSettings().setJavaScriptEnabled(true);
        this.webview6.loadUrl("https://www.youtube.com/");
    }

    public void onBackPressed() {
        if (this.webview6.canGoBack()) {
            this.webview6.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
