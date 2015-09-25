/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.airpush;

import com.codename1.system.NativeLookup;

/**
 * Utility class to use the Airpush API
 *
 * @author Chen
 */
public class AirpushManager {
    
    private AirpushNative airpush = null;

    /**
     * Creates a AirpushManager instance
     *
     */
    public AirpushManager() {
        airpush = (AirpushNative) NativeLookup.create(AirpushNative.class);
    }

    public void setAdsListener(AdsListener l) {
        Callback.setListener(l);
    }
    
    public void showAd() {
        airpush.showAd();
    }
    
}
