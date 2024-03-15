package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class GenericAssignment {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(224);
        l1.add(30);
        l1.add(34);
        l1.add(20);
        System.out.println("Reverse the list elements: " + reverseListElements(l1));
        System.out.println("Find the index of target element: " + findIndexOfTargetElement(l1, 224));

        List<Double> l2 = new ArrayList<>();
        l2.add(2.1);
        l2.add(1.7);
        l2.add(3.4);
        l2.add(4.5);
        System.out.println("Reverse the list elements: " + reverseListElements(l2));
        System.out.println("Index of target element: " + findIndexOfTargetElement(l2, 3.4));

        List<String> l3 = new ArrayList<>();
        l3.add("Abc");
        l3.add("cde");
        l3.add("efg");
        l3.add("xyz");
        System.out.println("Reverse the list elements: " + reverseListElements(l3));
        System.out.println("Find the index of target element: " + findIndexOfTargetElement(l3, "cde"));

    }


    public static <T extends List> T reverseListElements(T list){
        Collections.reverse(list);
        return (T) list;
    }
    public static <T> Integer findIndexOfTargetElement(List<T> list, T targetElement){
        int index = list.indexOf(targetElement);
        return index;

    }
}
