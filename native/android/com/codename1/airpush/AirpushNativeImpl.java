package com.codename1.airpush;

import com.codename1.ui.Dialog;
import com.codename1.impl.android.*;

import com.pbqs.iely223126.AdListener;  //Add import statements
import com.pbqs.iely223126.MA;

public class AirpushNativeImpl {

    private MA ma; //Declare Airpush here
    
    public void showAd() {
        if (ma == null) {
            ma = new MA(AndroidNativeUtil.getActivity(), adCallbackListener, true);
            ma.callSmartWallAd();
            Dialog.show("Title", "ma null starting ad", "Ok", null);
        }else {
            Dialog.show("Title", "ma not nill", "Ok", null);            
        }       
    }
    
    public boolean isSupported() {
        return true;
    }
    AdListener adCallbackListener = new AdListener() {
        
        @Override
        public void onSDKIntegrationError(String message) {
            //Here you will receive message from SDK if it detects any integration issue.
            Callback.onSDKIntegrationError(message);
        }
        
        public void onSmartWallAdShowing() {
            // This will be called by SDK when it's showing any of the SmartWall ad.
            Callback.onSmartWallAdShowing();
        }
        
        @Override
        public void onSmartWallAdClosed() {
            // This will be called by SDK when the SmartWall ad is closed.
            Callback.onSmartWallAdClosed();
        }
        
        @Override
        public void onAdError(String message) {
            //This will get called if any error occurred during ad serving.
            Callback.onAdError(message);
        }

        @Override
        public void onAdCached(AdType arg0) {
            //This will get called when an ad is cached. 
            Dialog.show("onAdCached", "Body", "Ok", "Cancel");
            Callback.onAdCached("Ad cached type "+arg0);
        }

        @Override
        public void noAdAvailableListener() {
            //this will get called when ad is not available 
            Callback.noAdAvailableListener();
        }
    };
    
}
