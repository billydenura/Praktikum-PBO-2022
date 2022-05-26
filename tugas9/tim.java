package com.company.tugas9;

public class tim implements Comparable<tim> {
    private int tinggi, berat;

    public tim(int tinggi, int berat) {
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getBerat() {
        return berat;
    }

    // untuk sorting tinggi
    @Override
    public int compareTo(tim o) {
        int copare = ((tim)o).getTinggi();
        return this.tinggi - copare;
    }

    //untuk sorting berat
//    @Override
//    public int compareTo(tim o) {
//        int copare = ((tim)o).getBerat();
//        return this.berat - copare;
//    }

    @Override
    public String toString() {
        return "{" +
                "tinggi=" + tinggi +
                ", berat=" + berat +
                '}';
    }
}
