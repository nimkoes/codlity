package me.nimkoes.lesson4;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> mySet = new HashSet<>();
        int size = A.length;
        for (int elem : A) {
            if (mySet.contains(elem) || elem > size) return 0;
            else mySet.add(elem);
        }
        if (mySet.size() == size) return 1;
        else return 0;
    }
    
    public static void main(String[] args) {
        PermCheck p = new PermCheck();
        System.out.println(" :: " + p.solution(new int[] {4, 1, 3, 2}));     // expected : 1
    }
}
