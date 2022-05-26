package com.company.tugas9;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        tim timA1 = new tim(168,50);
        tim timA2 = new tim(170,60);
        tim timA3 = new tim(165,56);
        tim timA4 = new tim(168,55);
        tim timA5 = new tim(172,60);
        tim timA6 = new tim(170,70);
        tim timA7 = new tim(169,66);
        tim timA8 = new tim(165,56);
        tim timA9 = new tim(171,72);
        tim timA10 = new tim(166,56);

        tim timB1 = new tim(170,66);
        tim timB2 = new tim(167,60);
        tim timB3 = new tim(165,59);
        tim timB4 = new tim(166,58);
        tim timB5 = new tim(168,58);
        tim timB6 = new tim(175,71);
        tim timB7 = new tim(172,68);
        tim timB8 = new tim(171,68);
        tim timB9 = new tim(168,65);
        tim timB10 = new tim(169,60);

        var timA = new ArrayList<tim>();
        var timB = new ArrayList<tim>();

        Collections.addAll(timA,timA1,timA2,timA3,timA4,timA5,timA6,timA7,timA8,timA9,timA10);
        Collections.addAll(timB,timB1,timB2,timB3,timB4,timB5,timB6,timB7,timB8,timB9,timB10);

        //copy isi tim B ke tim C
        var timC = new ArrayList<tim>(timB);

        //Mengurutkan isi tim berdasarkan berat atau tinggi
        Collections.sort(timA);
        System.out.println("Tim A urutan berat naik  : "+timA.toString());
        Collections.reverse(timA);
        System.out.println("Tim A urutan berat turun : "+timA.toString());
        Collections.sort(timB);
        System.out.println("Tim B urutan berat naik  : "+timB.toString());
        Collections.reverse(timB);
        System.out.println("Tim B urutan berat turun : "+timB.toString());

        //Cari max dan min dari tinggi dan berat masing masing tim
        System.out.println("Tinggi Max Tim A : "+ Collections.max(timA));
        System.out.println("Tinggi Min Tim A : "+ Collections.min(timA));
        System.out.println("Tinggi Max Tim B : "+ Collections.max(timB));
        System.out.println("Tinggi Min Tim B : "+ Collections.min(timB));

        //implementasi arraylist masing-masing tim
        System.out.println("Tim A : " + timA);
        System.out.println("Tim B : " + timB);
        System.out.println("Tim C : " + timC);

        //Cari jumlah pemain dengan tinggi dan berat ditentukan
        int nTinggiB = 0, nBeratA = 0 ;
        int dicariTinggi1 =168, dicariTinggi2=160;
        int dicariBerat1 = 56, dicariBerat2=53;
        for (var x :timB) {
            if (x.getTinggi()== dicariTinggi1|| x.getTinggi()==dicariTinggi2){
                nTinggiB ++;
            }
        }
        for (var x : timA){
            if (x.getBerat()==dicariBerat1 || x.getBerat()==dicariBerat2){
                nBeratA ++;
            }
        }
        System.out.println("Tim B tinggi badan 168 cm dan 160 cm : "+nTinggiB);
        System.out.println("Tim A berat badan 56 kg dan 53 kg :"+nBeratA);

        //cari tinggi atau berat s=yang sama antara tim A dan B
        int nSamaBerat = 0, nSamaTinggi = 0;
        for (var x : timA){
            for(var y : timB){
                if (x.getTinggi() == y.getTinggi()){
                    nSamaTinggi++;
                }
            }
        }
        for (var x : timA){
            for(var y : timB){
                if (x.getBerat() == y.getBerat()){
                    nSamaBerat++;
                }
            }
        }
        if(nSamaBerat>0) System.out.println("Kedua Anggota Tim ada yang memiliki berat yang sama sebanyak :"+ nSamaBerat);
        else System.out.println("Tidak ada anggata yang memeiliki berat yang sama!");
        if(nSamaTinggi>0) System.out.println("Kedua Anggota Tim ada yang memiliki tinggi yang sama sebanyak :"+ nSamaTinggi);
        else System.out.println("Tidak ada anggata yang memeiliki tinggi yang sama!");
    }
}
