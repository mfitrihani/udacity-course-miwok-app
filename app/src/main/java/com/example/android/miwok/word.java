package com.example.android.miwok;


public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageAssetId;

    public word(String defaultTranslation, String miwokTranslation, int imageAssetId){
        mImageAssetId = imageAssetId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getEnglishTranslation(){
        return mDefaultTranslation;
    }

    public int getImageAssetId(){ return mImageAssetId; }
}
