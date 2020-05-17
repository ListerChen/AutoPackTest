
package com.lister.autopacktest;

import android.content.Context;
import android.webkit.JavascriptInterface;

public class CommonJSApi {

    public CommonJSApi(Context context) {
    }

    @JavascriptInterface
    public String getVersion() {
        return "1";
    }

}
