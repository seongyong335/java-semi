package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class DoWhileSample {

    Scanner sc = new Scanner(System.in);

    public void addDashToken(){

        String tmp = "";
        StringBuilder sb = new StringBuilder();
        int i = 0;

        System.out.println("*** 문자 사이사이 '-' 추가 ***");
        System.out.print("문자열 입력 : ");
        tmp = sc.nextLine();

        do {
            sb.append(tmp.charAt(i));
            if(i + 1 < tmp.length())sb.append('-');
            i++;
        } while (i < tmp.length());

        System.out.println(sb);
    }

    public void burgerKingMenu(){

        int i = 0;
        int qcWapper = 0;
        int bWapper = 0;
        int bcWapper = 0;
        int mWapper = 0;
        int sWapper = 0;


        System.out.println("*** 버거킹 주문 ***");

        do {
            System.out.println("*** 메뉴 ***");
            System.out.println("1.콰트로치즈와퍼 세트 - 9700원");
            System.out.println("2.불고기와퍼 세트 - 9100원");
            System.out.println("3.베이컨치즈와퍼 세트 - 9700원");
            System.out.println("4.몬스터와퍼 세트 - 10300원");
            System.out.println("5.통새우와퍼 세트 - 9700원");
            System.out.println("6.계산하기");
            System.out.print("선택 : ");
            i = sc.nextInt();

            switch (i){
                case 1 : qcWapper++; break;
                case 2 : bWapper++; break;
                case 3 : bcWapper++; break;
                case 4 : mWapper++; break;
                case 5 : sWapper++; break;
                case 6 : i = 6; break;
            }
        } while (i != 6);

        System.out.println("*** 장바구니 ***");
        if(qcWapper > 0) System.out.println("콰트로치즈와퍼 세트 - " + qcWapper);
        if(bWapper > 0) System.out.println("불고기와퍼 세트 - " + bWapper);
        if(bcWapper > 0) System.out.println("베이컨치즈와퍼 세트 - " + bcWapper);
        if(mWapper > 0) System.out.println("몬스터와퍼 세트 - " + mWapper);
        if(sWapper > 0) System.out.println("통새우와퍼 세트 - " + sWapper);
        System.out.println("총액 : " + (qcWapper * 9700) + (bWapper * 9100) + (bcWapper * 9700) + (mWapper * 10300) + (sWapper * 9700) + "원");
    }

    public void isStringAlphabet(){

        String tmp = "";
        int i = 0;

        System.out.println("*** 모든 글자는 @@다 ***");
        System.out.print("문자열 입력 : ");
        tmp = sc.nextLine();

        do {
            if((tmp.charAt(i) >= 65 && tmp.charAt(i) <= 90) || (tmp.charAt(i) >= 97 && tmp.charAt(i) <= 122)) i++;
            else break;
        }while (i != tmp.length());

        if(i == tmp.length()) System.out.println("모든 글자는 영문자다.");
        else System.out.println("모든 글자는 영문자가 아니다.");
    }
}
