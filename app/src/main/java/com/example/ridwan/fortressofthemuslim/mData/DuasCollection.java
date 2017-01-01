package com.example.ridwan.fortressofthemuslim.mData;

import com.example.ridwan.fortressofthemuslim.R;

import java.util.ArrayList;

/**
 * Created by Ridwan on 01/01/2017.
 */

public class DuasCollection {

    public static ArrayList<Dua> getDuas()
    {
        ArrayList<Dua> duas=new ArrayList<>();
        Dua dua=null;


        //ADD DATA TO COLLECTION
        dua=new Dua();
        dua.setName("When you wake up");
        dua.setDuaTransliteration("Alhamdu lillaahil-lathee 'ahyaanaa ba'da maa 'amaatanaa wa'ilayhin-nushoor.");
        dua.setArabicD("الْحَمْدُ للهِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ");
        dua.setImage(R.mipmap.ic_launcher);
        duas.add(dua);


        dua=new Dua();
        dua.setName("Getting Dressed");
        dua.setDuaTransliteration("Alhamdu lillaahil-lathee kasaanee haathaa (aththawba) wa razaqaneehi min ghayri hawlim-minnee wa laa quwwatin.");
        dua.setArabicD("الْحَمْدُ للهِ الَّذِي كَسَانِي هَذَا (الثَّوبَ) وَرَزَقَنِيهِ مِنْ غَيْرِ حَوْلٍ مِنِّي وَلَا قُوَّةٍ");
        dua.setImage(R.mipmap.ic_launcher);
        duas.add(dua);

        dua=new Dua();
        dua.setName("Putting on New Clothes");
        dua.setDuaTransliteration("Allaahumma lakal-hamdu 'Anta kasawtaneehi, 'as'aluka min khayrihi wa khayri maa suni'a lahu, wa 'a'oothu bika min sharrihi wa sharri ma suni'a lahu.");
        dua.setArabicD("اللَّهُمَّ لَكَ الْحَمْدُ أَنْتَ كَسَوْتَنِيهِ، أَسْأَلُكَ مِنْ خَيْرِهِ وَخَيْرِ مَا صُنِعَ لَهُ، وَأَعُوذُ بِكَ مِنْ شَرِّهِ وَشَرِّ مَا صُنِعَ لَهُ");
        dua.setImage(R.mipmap.ic_launcher);
        duas.add(dua);

        //RETURN COLLECTION
        return duas;
    }

}
