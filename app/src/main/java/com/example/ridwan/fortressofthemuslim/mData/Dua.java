package com.example.ridwan.fortressofthemuslim.mData;

/**
 * Created by Ridwan on 01/01/2017.
 */

public class Dua {

    String name;
    String duaTransliteration;
    String arabicD;
    int image;

    public Dua() {
    }

    public String getArabicD() {return arabicD;}

    public void setArabicD(String arabicD) {this.arabicD = arabicD;}

    public String getDuaTransliteration() {return duaTransliteration;}

    public void setDuaTransliteration(String duaTransliteration) {this.duaTransliteration = duaTransliteration;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

