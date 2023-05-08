package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {

    Scanner sc = new Scanner(System.in);

    public void calculator(){

        int a;
        int b;
        String c = "";

        System.out.println("*** 두 정수와 한개의 연산문자를 입력해주세요 ***");
        System.out.print("첫번째 정수 : ");
        a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        b = sc.nextInt();
        System.out.print("연산문자 : ");
        c = sc.next();

        switch (c){
            case "+" : System.out.println(a + b); break;
            case "-" : System.out.println(a - b); break;
            case "*" : System.out.println(a * b); break;
            case "/" : System.out.println(a / b); break;
            case "%" : System.out.println(a % b); break;
            default: System.out.println("연산문자가 잘 못 입력되었습니다."); break;
        }
    }

    public void fruitPrice(){

        String fruit;

        System.out.print("과일 이름을 입력하세요 : ");
        fruit = sc.next();

        if(fruit.equals("사과")) System.out.println(fruit + "의 가격은 1000원 입니다.");
        else if(fruit.equals("바나나")) System.out.println(fruit + "의 가격은 3000원 입니다.");
        else if(fruit.equals("복숭아")) System.out.println(fruit + "의 가격은 2000원 입니다.");
        else if(fruit.equals("키위")) System.out.println(fruit + "의 가격은 5000원 입니다.");
        else System.out.println("준비된 상품이 없습니다.");
    }
}
