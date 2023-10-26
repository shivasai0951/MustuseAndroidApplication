package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wvdplama extends AppCompatActivity {
    private WebView webview10;

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
        setContentView(R.layout.activity_wvdplama);
        WebView webView = (WebView) findViewById(R.id.webview10);
        this.webview10 = webView;
        webView.setWebViewClient(new MyWebViewClient());
        this.webview10.getSettings().setJavaScriptEnabled(true);
        this.webview10.loadUrl("https://www.sbtet.telangana.gov.in/");
    }

    public void onBackPressed() {
        if (this.webview10.canGoBack()) {
            this.webview10.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
