package com.example.android.miwok;


public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private final static int no_image_value = -1;
    private int mImageAssetId = no_image_value;
    private int audioAssetId = no_image_value;

    public word(String mDefaultTranslation, String mMiwokTranslation, int mImageAssetId, int audioAssetId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageAssetId = mImageAssetId;
        this.audioAssetId = audioAssetId;
    }

    public word(String defaultTranslation, String miwokTranslation, int audioAssetId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.audioAssetId = audioAssetId;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getEnglishTranslation(){
        return mDefaultTranslation;
    }

    public int getImageAssetId(){ return mImageAssetId; }

    public Boolean hasImage(){ return mImageAssetId != -1;
    }

    public int getAudioAssetId(){ return audioAssetId; }

    public Boolean hasAudio(){
        return audioAssetId != -1;
    }
}
