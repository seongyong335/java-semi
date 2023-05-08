package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class NonStaticMethodSample {

    Scanner sc = new Scanner(System.in);
    public void testScanner(){

        byte a;
        short b;
        char c;
        int d;
        long e;
        float f;
        double g;
        String h;
        boolean i;

        System.out.println("*** 종류별 자료형 값 입력 ***");
        System.out.print("byte : ");
        a = sc.nextByte();
        sc.nextLine();
        System.out.print("short : ");
        b = sc.nextShort();
        sc.nextLine();
        System.out.print("char : ");
        c = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("int : ");
        d = sc.nextInt();
        sc.nextLine();
        System.out.print("long : ");
        e = sc.nextLong();
        sc.nextLine();
        System.out.print("float : ");
        f = sc.nextFloat();
        sc.nextLine();
        System.out.print("double : ");
        g = sc.nextDouble();
        sc.nextLine();
        System.out.print("String : ");
        h = sc.nextLine();
        System.out.print("boolean : ");
        i = sc.nextBoolean();

        System.out.println("*** 결과 ***");
        System.out.println("byte : " + a);
        System.out.println("short : " + b);
        System.out.println("char : " + c);
        System.out.println("int : " + d);
        System.out.println("long : " + e);
        System.out.println("float : " + f);
        System.out.println("double : " + g);
        System.out.println("String : " + h);
        System.out.println("boolean : " + i);
    }

    public void testRandom(){

        int a = (int)((Math.random() * 100) + 1);
        double b = ((Math.random() * 100) + 1);
        System.out.println("*** 1~100 사이의 정수와 실수의 난수 ***");
        System.out.println("정수 : " + a);
        System.out.println("실수 : " + b);
    }
}
