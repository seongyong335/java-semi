package kr.ac.sahmyook.home.func;

public class StaticMethodSample {

    public void testMathRandom(){

        int a = (int)((Math.random() * 45) + 1);
        System.out.println("*** 1~45사이의 임의의 정수 출력 ***");
        System.out.println(a);
    }

    public void testMathAbs(){

        System.out.println("*** -12.77의 절대값 출력 ***");
        System.out.println("-12.77의 절대값 : " + Math.abs(-12.77));
    }

    public void testMathMax(){

        System.out.println("*** 120과 54 중 큰값 출력 ***");
        System.out.println("큰 값 : " + Math.max(120, 57));
    }
}
