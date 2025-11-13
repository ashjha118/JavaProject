package java_collection;

import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2;
        rotate(list, k);
        System.out.println(list);
    }

    public static <T> void rotate(List<T> list, int k) {
        int n = list.size();
        k %= n;
        List<T> temp = new ArrayList<>(list.subList(k, n));
        temp.addAll(list.subList(0, k));
        for (int i = 0; i < n; i++)
            list.set(i, temp.get(i));
    }
}
