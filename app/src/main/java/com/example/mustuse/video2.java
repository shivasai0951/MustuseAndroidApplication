package com.example.mustuse;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class video2 extends AppCompatActivity {
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
        setContentView(R.layout.activity_video2);
        WebView webView = (WebView) findViewById(R.id.webview13);
        this.webview13 = webView;
        webView.setWebViewClient(new MyWebViewClient());
        this.webview13.getSettings().setJavaScriptEnabled(true);
        this.webview13.loadUrl("https://www.voot.com/");
    }

    public void onBackPressed() {
        if (this.webview13.canGoBack()) {
            this.webview13.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
