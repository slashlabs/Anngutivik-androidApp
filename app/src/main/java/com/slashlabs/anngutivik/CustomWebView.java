package com.slashlabs.anngutivik;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.TextView;

public class CustomWebView extends WebView {

    public CustomWebView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomWebView(Context context) {
        super(context);
        init();
    }

    private void init() {
        WebView myWebView = (WebView) findViewById(R.id.infoWebView);
        myWebView.setBackgroundColor(0xffffff);
    }

}
