package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wvaz extends AppCompatActivity {
    private WebView webview13;

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
        setContentView(R.layout.activity_wvaz);
        WebView webView = (WebView) findViewById(R.id.webview13);
        this.webview13 = webView;
        webView.setWebViewClient(new MyWebViewClient());
        this.webview13.getSettings().setJavaScriptEnabled(true);
        this.webview13.loadUrl("https://www.amazon.in/?ref=icp_country_us_t1");
    }

    public void onBackPressed() {
        if (this.webview13.canGoBack()) {
            this.webview13.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
