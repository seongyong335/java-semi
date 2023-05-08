package kr.ac.sahmyook.home.func;

public class ContinueSample {

    public void sumJumpThree(){

        int sum = 0;

        System.out.println("*** 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합 ***");
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0) continue;
            sum += i;
        }
        System.out.println("합계 : " + sum);
    }

    public void rowColJump(){

        int[][] iarr = new int[3][5];
        int c = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                iarr[i][j] = c;
                c++;
            }
        }

        System.out.println("*** 3행 5열의 행열값 출력 ***");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                if (i == 1 && j >= 3 && j <= 5) continue;
                System.out.println("iarr["+ i + "][" + j + "] = " + iarr[i][j]);
            }
        }
    }
}
