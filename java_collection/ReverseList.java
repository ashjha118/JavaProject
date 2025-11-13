package java_collection;

import java.util.*;

public class ReverseList {
    public static <T> void reverse(List<T> list) {
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> l = new LinkedList<>(a);
        reverse(a); reverse(l);
        System.out.println(a); 
        System.out.println(l);
    }
}
