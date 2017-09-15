package com.bignerdranch.android.beatbox;

import android.util.Log;

import java.util.List;

/**
 * Created by hh on 2017/9/12.
 */

public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound (String assetPath){
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");//"2:3:4:5".split(":")	//将返回["2", "3", "4", "5"]
        String filename = components[components.length - 1];
        Log.d("huierjkahgvbuieqhrtguih",filename);
        mName = filename.replace(".wav","");
    }

    public String getmAssetPath() {
        return mAssetPath;
    }

    public String getmName() {
        return mName;
    }

    public Integer getmSoundId() {
        return mSoundId;
    }

    public void setmSoundId(Integer mSoundId) {
        this.mSoundId = mSoundId;
    }
}
