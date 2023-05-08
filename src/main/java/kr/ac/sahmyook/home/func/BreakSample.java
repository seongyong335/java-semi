package kr.ac.sahmyook.home.func;

public class BreakSample {

    public void sumBreak(){

        int i = 1;
        int sum = 0;

        System.out.println("*** 1~100까지 정수들의 합 ***");
        while (i > 0){
            sum += i;
            if(i == 100) break;
            i++;
        }
        System.out.println("답 : " + sum);
    }

    public void guguDanBreak(){

        System.out.println("*** 구구단 ***");
        for(int i = 2; i <= 9; i++){
            System.out.println("***" + i + "단 ***");
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + (i * j));
                if(j == 5) break;
            }
        }
    }
}
