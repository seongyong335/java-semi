package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class WhileSample {

    Scanner sc = new Scanner(System.in);

    public void printUniCode(){

        char a = 'a';

        System.out.println("*** 유니코드 출력 반복 (0 입력시 종료) ***");
        while (a != '0'){
            System.out.print("문자 : ");
            a = sc.next().charAt(0);
            if(a != '0') System.out.println((int)a);
        }
    }

    public void sum1To100(){

        int a = 0;
        int sum = 0;

        while (a <= 100){
            sum += a;
            a++;
        }
        System.out.println("*** 1~100까지의 합 ***");
        System.out.println(sum);
    }

    public void numberGame(){

        int a = (int)((Math.random() * 100) + 1);
        int b = 0;

        System.out.println("*** 1~100 사이 랜덤 정수 맞추기 ***");

        while (b != a){
            System.out.print("답 : ");
            b = sc.nextInt();
            if(b > a) System.out.println("언더");
            else if(b < a) System.out.println("오버");
        }
        System.out.println("정답!");
    }

    public void countCharacter(){

        String tmp = "";
        int i = 0;
        int c = 0;

        System.out.println("*** 영문자의 갯수 ***");
        System.out.print("자동으로 시작이 안되면 Enter를 눌러주세요");
        sc.nextLine();  //nextLine으로 입력 받다보니 이러지 않으면 버퍼에 남아있는 찌꺼기때문에 가끔 그냥 끝나버림.
        System.out.println();
        System.out.print("문자열 입력 : ");
        tmp = sc.nextLine();

        while (i < tmp.length()){
            if((tmp.charAt(i) >= 65 && tmp.charAt(i) <= 90) || (tmp.charAt(i) >= 97 && tmp.charAt(i) <= 122)) c++;
            i++;
        }

        System.out.println("문자의 갯수 : " + c);
    }

    public void countInChar(){

        String tmp = "";
        char cTmp = ' ';
        int i = 0;
        int c = 0;

        System.out.println("*** 문자열 안 중복 문자의 갯수 ***");
        System.out.print("문자열 입력 : ");
        tmp = sc.nextLine();
        System.out.print("문자 입력 : ");
        cTmp = sc.next().charAt(0);

        while (i < tmp.length()){
            if (tmp.charAt(i) == cTmp) c++;
            i++;
        }

        System.out.println("문자열 안 중복 " + cTmp + "의 갯수 : " + c);
    }
}
