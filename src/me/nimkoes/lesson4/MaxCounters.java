package me.nimkoes.lesson4;

import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] answer = new int[N];
        int tempMax = 0;
        int maxValue = 0;
        
        for (int i = 0; i < A.length; ++i) {
            if (A[i] == N + 1) {
                maxValue = tempMax;
            } else {
                int pos = A[i] - 1;
                if (answer[pos] < maxValue) answer[pos] = maxValue + 1;
                else ++answer[pos];
                
                if (answer[pos] > tempMax) tempMax = answer[pos];
            }
        }
        
        for (int i = 0; i < N; i++) if (answer[i] < maxValue) answer[i] = maxValue;
        return answer;
    }
    
    public static void main(String[] args) {
        MaxCounters p = new MaxCounters();
        System.out.println(" :: " + Arrays.toString(p.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4})));     // expected : [3, 2, 2, 4, 2]
    }
}
