package com.example.android.miwok;


public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageAssetId = no_image_value;
    private final static int no_image_value = -1;

    public word(String defaultTranslation, String miwokTranslation, int imageAssetId){
        mImageAssetId = imageAssetId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public word(String defaultTranslation, String miwokTranslation){
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

    public Boolean hasImage(){
        if (mImageAssetId==-1){
            return false;
        }
        else return true;
    }
}
