package me.nimkoes.lesson1;

public class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        int q, r;
        int answer = 0;
        int adder = 0;
        boolean firstOne = true;
    
        q = N;
        while(q != 0) {
            r = q%2;
            q = q/2;
        
            if(r == 1) {
                firstOne = false;
                answer = Math.max(adder, answer);
                adder = 0;
            } else {
                if(!firstOne) ++adder;
            }
        }
    
        return answer;
    }
    
    public static void main(String[] args) {
        BinaryGap p = new BinaryGap();
        System.out.println(p.solution(9));      // 1001         :: expected : 2
        System.out.println(p.solution(529));    // 1000010001   :: expected : 4
        System.out.println(p.solution(20));     // 10100        :: expected : 1
        System.out.println(p.solution(32));     // 100000       :: expected : 0
    }
}
