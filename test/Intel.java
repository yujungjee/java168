package test;

import java.util.Scanner;   // Scanner 클래스를 사용하기 위해 추가

public class Intel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   // Scanner 클래스의 객체를 생성
        // Scanner - 입력을 받을 때 필수적으로 사용하는 녀석
        // System. in은 시스템 입력을 의미 = 키보드 입력을 받겠다
        // Scanner scan = new Scanner(System.in);을 적으면
        // 맨 위에 import java.util.Scanner;가 생성된다.

        int num = scan.nextInt();   // 정수를 입력받아서 변수 num에 저장
        // scan.nextInt()를 통해 키보드로 들어온 입력을 숫자로 변환해준다.
        // 키보드 입력값을 변수 num에 결과값(입력값)에 저장한다.
        // 변수의 목적은 저장이다.

        System.out.println("입력값은 = " + num);

    }
}