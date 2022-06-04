package com.company.tugas10;

import java.util.*;
import java.util.Iterator;
import java.util.StringTokenizer;

public class TugasPrak {
    public static void main(String[] args) {
        String tes1 = "Saya belajar bahasa Java. Bahasa Java mempunyai kelas berupa String. Belajar String  Java itu mudah. String Java juga sering diimplementasikan.";
        String tes2 = tes1.toLowerCase(Locale.ROOT);
        tes2 = tes2.replace(".","");
        StringTokenizer tes3 = new StringTokenizer(tes2);

        Iterator<Object> iterator = tes3.asIterator();

        ArrayList<String> tes4 = new ArrayList<>();
        HashSet<String> tes5 = new HashSet<>();

        while (iterator.hasNext()) {
            tes4.add(iterator.next().toString());
        }

        System.out.printf("%-20s %5s\n","Token","Frekuensi");
        for (var x : tes4){
            if (tes5.contains(x))continue;
            int frec = Collections.frequency(tes4,x);
            System.out.printf("%-20s %5s\n",x,frec);
            tes5.add(x);
        }

    }
}
