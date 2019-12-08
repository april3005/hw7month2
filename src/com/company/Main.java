package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList A = new ArrayList();
        ArrayList B = new ArrayList();
        ArrayList C = new ArrayList();
        Scanner sc = new Scanner(System.in);
        A.add(sc.nextLine());
        A.add(sc.nextLine());
        A.add(sc.nextLine());
        A.add(sc.nextLine());
        A.add(sc.nextLine());
        System.out.println(A);

        B.add(sc.nextLine());
        B.add(sc.nextLine());
        B.add(sc.nextLine());
        B.add(sc.nextLine());
        B.add(sc.nextLine());
        System.out.println(B);

        C.addAll(A);
        C.addAll(B);
        System.out.println(C);

Collections.sort(C, new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
});

        System.out.println("Сортированный список С");
        System.out.println(C);

    }
}
