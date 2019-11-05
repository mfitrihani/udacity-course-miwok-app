package com.example.android.miwok;


public class word<Object> {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

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
}
