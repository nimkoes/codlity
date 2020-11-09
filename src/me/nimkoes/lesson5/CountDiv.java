package me.nimkoes.lesson5;

public class CountDiv {
    
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        return B/K - ((A > 0 ? (A-1)/K : -1));
    }
    
    public static void main(String[] args) {
        CountDiv p = new CountDiv();
        System.out.println(" :: " + p.solution(6, 11, 2));     // expected : 3
    }
}
