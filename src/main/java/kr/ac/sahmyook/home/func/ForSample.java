package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {

    Scanner sc = new Scanner(System.in);
    public void sum1To10(){

        int sum = 0;

        for(int i = 1; i<=10; i++){
            sum += i;
        }

        System.out.println("*** 1~10까지 정수들의 합 ***");
        System.out.println("합 : " + sum);
    }

    public void sumEven1To100(){

        int sum = 0;

        for(int i = 1; i<=100; i++){
            if(i % 2 == 0) sum += i;
        }

        System.out.println("*** 1~100까지 짝수들의 합 ***");
        System.out.println("합 : " + sum);
    }

    public void oneGugudan(){

        int dan = 0;

        System.out.println("*** 구구단 ***");
        System.out.print("단 : ");
        dan = sc.nextInt();

        for(int i = 1; i <= 9; i++) System.out.println(dan + " " + i +" : " + (dan * i));
    }

    public void sumMinToMax(){

        int a = 0;
        int b = 0;
        int sum = 0;

        System.out.println("*** 두 정수를 입력해주세요 ***");
        System.out.print("첫번째 정수 : ");
        a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        b = sc.nextInt();

        if(a < b) {
            for(int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
        else if(b < a) {
            for(int i = b; i <= a; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
        else System.out.println("두 수가 같거나 잘못 입력하셨습니다.");
    }

    public void printStar(){

        int a = 0;
        int b = 0;
        String tmp = "";

        System.out.println("*** 별문자 ***");
        System.out.print("줄 : ");
        a = sc.nextInt();
        System.out.print("칸 : ");
        b = sc.nextInt();

        System.out.println("*** 결과 ***");
        for(int j = 0; j < b; j++) tmp += "*";
        for(int i = 0; i < a; i++) System.out.println(tmp);
    }

    public void printNumberStar(){

        System.out.println("*** 7 * 7 별문자 ***");

        for (int i = 0; i < 7; i++){
            String tmp = "";
            for(int j = 0; j < 7; j++){
                if(j == i) tmp += (i+1);
                else tmp += "*";;
            }
            System.out.println(tmp);
        }
    }

    public void printTriangleStar(){

        int a = 0;
        int b = 0;

        System.out.println("*** 삼각형 ***");
        System.out.print("줄 : ");
        a = sc.nextInt();

        if(a > 0) {
            for(int i = 0; i < a; i++) {
                String tmp = "";
                for(int j = 0;  j <= i; j++) {
                    tmp += "*";
                }
                System.out.println(tmp);
            }
        }
        else {
            b = Math.abs(a);
            for(int i = 0; i < b; i++){
                String tmp = "";
                for(int j = b; j > i; j--){
                    tmp += "*";
                }
                System.out.println(tmp);
            }
        }
    }

    public void guguDan(){

        System.out.println("*** 구구단 ***");
        for(int i = 2; i <= 9; i++){
            System.out.println("***" +i + "단 ***");
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
