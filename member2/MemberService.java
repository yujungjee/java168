package member2;


public interface MemberService {
	// 1. 회원가입
	public void join(Member member);
	// 2. 로그인
	public String login(Member member);
	// 3. 회원목록
	public Member[] list();
	// 4. 아이디 중복체크
	public String existId(Member member);
	// 5. 비번 수정
	public String changePassword(Member member);
	// 6. 회원탈퇴
	public String withdrawal (Member member);
	// 7. 아이디검색
	public String idfind(Member member);
	// 8. 이름 검색
	public String namefind(Member member);
	// 9. 전체 회원수
	public int count();
}