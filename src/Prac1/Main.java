package Prac1;

import java.util.Comparator;
import java.util.Scanner;

public class Main implements Comparator<int[]>{
    Scanner sc = new Scanner(System.in);
    int[] mas1;
    int[] mas2;
    Main(){
        System.out.println("Введите размер массива 1");
        mas1 = new int[sc.nextInt()];
        System.out.println("Введите размер массива 2");
        mas2 = new int[sc.nextInt()];
    }

    @Override
    public int compare(int[] o1, int[] o2) {
        return Math.max(o1.length, o2.length);
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Размер большего массива: " + main.compare(main.mas1, main.mas2));
    }
}
