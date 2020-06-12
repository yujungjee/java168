package member;

import java.util.Scanner;

public class MemberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member = new Member();
		MemberService memberService = new MemberServiceImpl();
		
		// 0 종료 1 회원가입 2 로그인
		while(true) {
			System.out.println("메뉴: 0.종료 1.회원가입 2.로그인");
			switch (scan.nextInt()) {
			case 0:
				System.err.println("종료");
				return;
			case 1:
				System.out.println("회원가입");
				System.out.println("아이디: ");
				member.setUserid(scan.next());
				System.out.println("비밀번호: ");
				member.setPassword(scan.next());
				System.out.println("이름: ");
				member.setName(scan.next());
				System.out.println("*** 회원가입 정보확인 ***");
				System.out.println(member.toString());
				memberService.join(member);
				break;
			case 2:
				System.out.println("로그인");
				break;
			default:
				System.out.println("메뉴에 없는 기능입니다.");
				break;
			}	
		}
	}
}
