package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {

    Scanner sc = new Scanner(System.in);

    public void maxNumber(){

        int a;
        int b;

        System.out.println("*** 두 정수를 입력해주세요 ***");
        System.out.print("첫번째 정수 : ");
        a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        b = sc.nextInt();

        System.out.println("*** 둘 중 큰 값 출력하기 ***");
        if(a > b) System.out.println("큰 값 : " + a);
        else if (a < b) System.out.println("큰 값 : " + b);
        else System.out.println("두 값이 같다.");
    }

    public void minNumber(){

        int a;
        int b;

        System.out.println("*** 두 정수를 입력해주세요 ***");
        System.out.print("첫번째 정수 : ");
        a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        b = sc.nextInt();

        System.out.println("*** 둘 중 작은 값 출력하기 ***");
        if(a > b) System.out.println("작은 값 : " + b);
        else if (a < b) System.out.println("작은 값 : " + a);
        else System.out.println("두 값이 같다.");
    }

    public void threeMaxMin(){

        int a;
        int b;
        int c;

        System.out.println("*** 세 정수를 입력해주세요 ***");
        System.out.print("첫번째 정수 : ");
        a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        b = sc.nextInt();
        System.out.print("세번째 정수 : ");
        c = sc.nextInt();

        System.out.println("*** 셋 중 작은 값 출력하기 ***");
        if(a > b && a > c) {
            System.out.println("가장 큰 값 : " + a);
            if (b > c) System.out.println("가장 작은 값 : " + c);
            else System.out.println("가장 작은 값 : " + b);
        }
        else if(a < b && c < b) {
            System.out.println("가장 큰 값 : " + b);
            if (a > c) System.out.println("가장 작은 값 : " + c);
            else System.out.println("가장 작은 값 : " + a);
        }
        else if(c > b && c > a) {
            System.out.println("가장 큰 값 : " + c);
            if (b > a) System.out.println("가장 작은 값 : " + a);
            else System.out.println("가장 작은 값 : " + b);
        }
        else System.out.println("세 값이 같다.");
    }

    public void checkEven(){

        int a;

        System.out.println("*** 홀 짝 ***");
        System.out.print("정수 : ");
        a = sc.nextInt();

        if(a % 2 == 0) System.out.println("짝!");
        else System.out.println("홀!");

    }

    public void isPassFail(){

        double Korean;
        double English;
        double math;
        double avg;

        System.out.println("*** 세 과목의 점수를 입력해주세요 ***");
        System.out.print("국어 : ");
        Korean = sc.nextDouble();
        System.out.print("영어 : ");
        English = sc.nextDouble();
        System.out.print("수학 : ");
        math = sc.nextDouble();
        avg = (Korean + English + math) / 3;

        System.out.println("*** 합 불합 ***");
        if (avg >= 60 && Korean >= 40 && English >= 40 && math >= 40){
            System.out.println("합격입니다!");
        }
        else {
            if( avg < 60) System.out.println("평균 점수 미달로 불합격입니다.");
            if (Korean < 40) System.out.println("국어 점수 미달로 불합격입니다.");
            if (English < 40) System.out.println("영어 점수 미달로 불합격입니다.");
            if (math < 40) System.out.println("수학 점수 미달로 불합격입니다.");
        }
    }

    public void scoreGrade(){

        int score;

        System.out.println("*** 학점 확인 ***");
        System.out.print("점수 : ");
        score = sc.nextInt();

        if(score >= 95) System.out.println("A+");
        else if(score >= 90 && score < 95) System.out.println("A");
        else if(score >= 85 && score < 90) System.out.println("B+");
        else if(score >= 80 && score < 85) System.out.println("B");
        else if(score >= 75 && score < 80) System.out.println("C+");
        else if(score >= 70 && score < 75) System.out.println("C");
        else if(score >= 65 && score < 70) System.out.println("D+");
        else if(score >= 60 && score < 65) System.out.println("D");
        else System.out.println("F");

    }

    public void checkPlusMinusZero(){

        int a;

        System.out.println("*** 양수 음수 0 ***");
        System.out.print("정수 : ");
        a = sc.nextInt();

        if(a > 0) System.out.println("양수!");
        else if (a < 0) System.out.println("음수!");
        else System.out.println("0");
    }

    public void whatCaracter(){

        String a = "";

        System.out.println("*** 영대문자 영소문자 숫자 기타 ***");
        System.out.print("정수 : ");
        a = sc.next();

        if(a.charAt(0) >= 65 && a.charAt(0) <= 90) System.out.println("영대문자!");
        else if(a.charAt(0) >= 97 && a.charAt(0) <= 122) System.out.println("영소문자!");
        else if(a.charAt(0) >= 48 && a.charAt(0) <= 57) System.out.println("숫자!");
        else System.out.println("기타");
    }
}
