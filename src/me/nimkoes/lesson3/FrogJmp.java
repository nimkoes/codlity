package me.nimkoes.lesson3;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int answer = 0;
        if(X == Y) return answer;
        
        int diff = Y - X;
        answer = diff / D;
        if(diff % D > 0) ++answer;
        
        return answer;
    }
    
    public static void main(String[] args) {
        FrogJmp p = new FrogJmp();
        System.out.println(p.solution(10, 85, 30));   // expected : 3
        System.out.println(p.solution(1, 1, 1));      // expected : 0
        System.out.println(p.solution(1, 10, 1));     // expected : 9
        System.out.println(p.solution(1, 10, 9));     // expected : 1
    }
}
