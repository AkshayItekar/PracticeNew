import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Comparison {
    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<>();
        a.add(0, 5);
        a.add(1, 6);
        a.add(2, 7);


        List<Integer> b = new ArrayList<>();
        b.add(0, 10);
        b.add(1, 6);
        b.add(2, 3);

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {

            System.out.println(result.get(i));

        }

    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<Integer>();
        int count = 0;
        int c = 0;
        int d = 0;
        while(res.size() < 2) res.add(0);
        while (count < 3) {
            if (a.get(count) > b.get(count)) {

                //int c =res.get(0);
                if (res.isEmpty()) {
                    res.add(0, ++c);
                } else {
                    res.set(0, ++c);
                }
            } else if (a.get(count) < b.get(count)) {
                // int c =res.get(1);
                if (res.isEmpty()) {
                    res.add(1, ++d);
                } else {
                    res.set(1, ++d);
                }
            }
            count++;
        }

        return res;

    }

}
