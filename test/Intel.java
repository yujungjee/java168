package test;

import java.util.Scanner;   // Scanner Ŭ������ ����ϱ� ���� �߰�

public class Intel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   // Scanner Ŭ������ ��ü�� ����
        // Scanner - �Է��� ���� �� �ʼ������� ����ϴ� �༮
        // System. in�� �ý��� �Է��� �ǹ� = Ű���� �Է��� �ްڴ�
        // Scanner scan = new Scanner(System.in);�� ������
        // �� ���� import java.util.Scanner;�� �����ȴ�.

        int num = scan.nextInt();   // ������ �Է¹޾Ƽ� ���� num�� ����
        // scan.nextInt()�� ���� Ű����� ���� �Է��� ���ڷ� ��ȯ���ش�.
        // Ű���� �Է°��� ���� num�� �����(�Է°�)�� �����Ѵ�.
        // ������ ������ �����̴�.

        System.out.println("�Է°��� = " + num);

    }
}