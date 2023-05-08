package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {

    Scanner sc = new Scanner(System.in);

    public void myProfile(){
        String sirName = "최";
        String givenName = "성용";
        int age = 26;

        System.out.println("*** 프로필 ***");
        System.out.println("이름 : " + sirName + givenName);
        System.out.println("나이 : " + age);
    }

    public void empInformation(){
        String sirName = "";
        String givenName = "";
        int age = 0;

        System.out.println("*** 사원정보를 입력해주세요 ***");
        System.out.print("성 : ");
        sirName = sc.nextLine();
        System.out.print("이름 : ");
        givenName = sc.nextLine();
        System.out.print("나이 : ");
        age = sc.nextInt();

        System.out.println("*** 사원정보 ***");
        System.out.println("이름 : " + sirName + givenName);
        System.out.println("나이 : " + age);

    }
}
