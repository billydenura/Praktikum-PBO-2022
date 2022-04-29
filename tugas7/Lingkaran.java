package com.company.tugas7;

public class Lingkaran extends BangunDatar implements Hitung{
    private double jarijari;

    public Lingkaran(String nama, double jarijari) {
        this.jarijari = jarijari;
        super.listBangunDatar[BangunDatar.isiNow] = nama;
        BangunDatar.isiNow++;
    }

    @Override
    public double hitungKeliling() {
        double kll = jarijari*2*Math.PI;
        return kll;
    }

    @Override
    public double hitungLuas() {
        double luas = jarijari*jarijari*Math.PI;
        return luas;
    }

    @Override
    public double hitungSpesial() {
        double luasSegitiga = jarijari*jarijari/2;
        double luasJuring = jarijari*jarijari*Math.PI/4;
        double luasTembereng = luasJuring - luasSegitiga;
        return luasTembereng;
    }

    @Override
    void info() {
        System.out.println("====================================================");
        System.out.println("Nama Bangun Datar\t: Lingkaran");
        System.out.println("Panjang Jari-Jari\t: "+ jarijari);
        System.out.printf("Luas\t\t\t: %.2f\n",hitungLuas());
        System.out.printf("Keliling\t\t: %.2f\n",hitungKeliling());
        System.out.printf("Nilai Spesial\t: %.2f\n",hitungSpesial());
    }
}
