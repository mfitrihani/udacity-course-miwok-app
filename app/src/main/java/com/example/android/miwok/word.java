package com.example.android.miwok;

import java.util.ArrayList;

public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
}