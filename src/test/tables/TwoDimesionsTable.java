package test.tables;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwoDimesionsTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("wymiar 1:");
        int wymiar1 = in.nextInt();


        int[][] tablica = new int[wymiar1][];
        Random ran = new Random();
        //inicjalizacja
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("wymiar 2 pozycja " + i + ":");
            int wymiar2 = in.nextInt();
            tablica[i] = new int[wymiar2];
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = ran.nextInt(20);
            }
        }


        //wyswietl
        int avg = 0;
        int licz = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] tpom : tablica) {
            for (int x : tpom) {
                System.out.print("\t" + x);
                if (min > x) {
                    min = x;
                }
                max = max < x ? x : max;
                avg += x;
                licz++;
            }
            System.out.println("");
        }
        System.out.println("MIN " + min);
        System.out.println("MAX " + max);
        System.out.println("AVG " + avg / licz);
        System.out.print(Arrays.deepToString(tablica));

    }
}
