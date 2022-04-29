package com.company.tugas7;

public class Main {
    public static void main(String[] args) {

        BangunDatar bd[] = new BangunDatar[7];
        bd[0] = new Lingkaran("Lingkaran", 25);
        bd[1] = new Trapesium("Trapesium", 23, 67, 34);
        bd[2] = new Trapesium("Trapesium", 31, 17, 12);
        bd[3] = new Persegi("Persegi", 19);
        bd[4] = new Segitiga("Segitiga", 19, 45);
        bd[5] = new Layang("Layang", 30, 15, 12, 22);
        bd[6] = new Layang("Layang", 24, 40, 37, 13);

        BangunDatar b = new fungsiBangunDatar();
        b.info();
        for (int i = 0; i < bd.length; i++) {
            System.out.printf("================ Bangun Datar %d ====================\n", i + 1);

            bd[i].info();
        }
        b.search("layang");
        b.search("LinGkarAn");
        b.search("kubus");
    }
}