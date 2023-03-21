package com.beancurd.network;

public class NativeLib {

    // Used to load the 'network' library on application startup.
    static {
        System.loadLibrary("network");
    }

    /**
     * A native method that is implemented by the 'network' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}