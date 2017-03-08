package recursiveSortingPackage;

import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kasper
 */
public class MergeSortLinkedLists {

    public static void merge_sort_start(int[] arr) {
        List<Integer> toSort = new LinkedList<>();
        for (int elem : arr) {
            toSort.add(elem);
        }

        List<Integer> result = merge_sort(toSort);

        int i = 0;
        for (Integer val : result) {
            arr[i++] = val;
        }

    }

    private static List<Integer> merge_sort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }
        List<Integer> left = new LinkedList<>();
        List<Integer> right = new LinkedList<>();
        split_list(arr, left, right);
        left = merge_sort(left);
        right = merge_sort(right);
        arr = merge_list(left, right);
        return arr;
    }

    private static void split_list(List<Integer> arr, List<Integer> left, List<Integer> right) {
        boolean toTheLeft = true;
        for (Integer elem : arr) {
            if (toTheLeft) {
                left.add(elem);
            } else {
                right.add(elem);
            }
            toTheLeft = !toTheLeft;
        }
    }

    private static List<Integer> merge_list(List<Integer> left, List<Integer> right) {
        LinkedList<Integer> mergedList = new LinkedList<>();
        while (!left.isEmpty() && !right.isEmpty()) {
            Integer elem = peek(left) < peek(right) ? poll(left) : poll(right);
            mergedList.add(elem);
        }
        mergedList.addAll(left);
        mergedList.addAll(right);
        return mergedList;
    }

    private static Integer peek(List<Integer> l) {
        return l.get(0);
    }

    private static Integer poll(List<Integer> l) {
        Integer i = l.get(0);
        l.remove(0);
        return i;
    }

}
