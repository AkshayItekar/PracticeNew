import java.io.IOException;

import java.util.*;
import java.io.*;

public class Solution {


    public static void main(String[] args) {
       // int[] arr;
        Scanner scn = new Scanner(System.in);
        String name = "textbook thing ";
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-10);
        arr.add(20);
        arr.add(30);
        arr.add(-40);
        arr.add(-50);
        arr.add(60);
         arr.add(-70);
        arr.add(80 );
       arr.add(90 );
        int k = 3;
        int n = 9;
        ArrayList<Integer> res = firstNegativeInteger(arr, k, n);
        System.out.println(res);
    }

    public static ArrayList<Integer> firstNegativeInteger(ArrayList<Integer> arr, int k, int n) {
        //    Write your code here.
        ArrayList<Integer> res = new ArrayList<>();
        int[] array = new int[n];

        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < i + k; j++) {
                if (j < n) {
                    a = arr.get(j);
                    if (a < 0) {
                        array[c] = a;
                        c++;
                        b = 0;
                        break;
                    }
                }

            }
            if (b == k && i < n - 1) {
                b = 0;
                array[c] = b;
                c++;
            }

        }

        for (int i = 0; i < array.length-2; i++)
            res.add(new Integer(array[i]));
        return res;
    }

}