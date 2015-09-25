/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.airpush;

import com.codename1.ui.Display;

/**
 *
 * @author Chen
 */
public class Callback {
    
    private static AdsListener l;
    
    public static void onSDKIntegrationError(final String message){
        if(l != null){
            Display.getInstance().callSerially(new Runnable(){

                public void run() {
                    l.onSDKIntegrationError(message);
                }
            });
        }
    }

    public static void onSmartWallAdShowing(){
        if(l != null){
            Display.getInstance().callSerially(new Runnable(){

                public void run() {
                    l.onSmartWallAdShowing();
                }
            });
        }    
    }

    public static void onSmartWallAdClosed(){
        if(l != null){
            Display.getInstance().callSerially(new Runnable(){

                public void run() {
                    l.onSmartWallAdClosed();
                }
            });
        }        
    }

    public static void onAdError(final String message){
        if(l != null){
            Display.getInstance().callSerially(new Runnable(){

                public void run() {
                    l.onAdError(message);
                }
            });
        }            
    }

    public static void onAdCached(final String message){
        if(l != null){
            Display.getInstance().callSerially(new Runnable(){

                public void run() {
                    l.onAdCached(message);
                }
            });
        }            
    }
    public static void noAdAvailableListener(){
        if(l != null){
            Display.getInstance().callSerially(new Runnable(){

                public void run() {
                    l.noAdAvailableListener();
                }
            });
        }                
    }

    static void setListener(AdsListener listener){
        l = listener;
    }
    
}
