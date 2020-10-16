package me.nimkoes;

import java.util.HashSet;

public class DemoTest {
    public int solution(int[] A) {
        int answer = 1;
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i : A) if(i > 0) hs.add(i);
        if(hs.size() == 0) return 1;
        for(int i = 1; hs.contains(i); ++i) ++answer;
        
        return answer;
    }
    
    public static void main(String[] args) {
        DemoTest p = new DemoTest();
        System.out.println(p.solution(new int[] {1, 2, 3}));
    }
}
/*
[Task description]

This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

Copyright 2009–2020 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */