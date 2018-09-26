package com.example.android.arrayadaptersimpleapp;

class Word {
    private String mPalabraCastellano;
    private String mPalabraIngles;

    Word(String palabraCastellano, String palabraIngles){
        mPalabraCastellano=palabraCastellano;
        mPalabraIngles=palabraIngles;
    }

    String getPalabraCastellano(){
        return mPalabraCastellano;
    }

    String getPalabraIngles(){
        return mPalabraIngles;
    }
}
