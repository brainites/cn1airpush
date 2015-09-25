/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.airpush;

/**
 *
 * @author Chen
 */
public interface AdsListener {

    public void onSDKIntegrationError(String message);

    public void onSmartWallAdShowing();

    public void onSmartWallAdClosed();

    public void onAdError(String message);

    public void onAdCached(String message);

    public void noAdAvailableListener();
}
