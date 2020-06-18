package member2;

public class MemberServiceImpl implements MemberService{
	private Member[] members; 
	private int count;
	
	public MemberServiceImpl() {
		members  = new Member[3];
		count = 0;
	}
	// 1. 회원가입
	@Override
	public void join(Member member) {
		members[count] = member;
		count++;
	}
	
	// 2. 로그인
	@Override
	public String login(Member member) {
		String result = "FAIL";
		for(int i=0;i< count; i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&&
				member.getPassword().equals(members[i].getPassword())) {
				result = "SUCCESS";
				break;
			}
		}
		return result;
	}
	// 3. 회원목록
	@Override
	public Member[] list() {
		return members;
	}
	// 4. 아이디 중복체크
	@Override
	public String existId(Member member) {
		String result = "중복없음";
		for(int i=0; i< count; i++) {
			if(member.getUserid().equals(members[i].getUserid())) {
				result ="중복된 아이디";
			}
		}
		return result;
	}
	// 5. 비번 수정
	@Override
	public String changePassword(Member member) {
		return null;
	}
	// 6. 회원탈퇴
	@Override
	public String withdrawal(Member member) {
		return null;
	}
	// 7. 아이디검색
	@Override
	public String idfind(Member member) {
		return null;
	}
	// 8. 이름 검색 (동명이인 처리필요)
	@Override
	public String namefind(Member member) {
		int cnt = 0; //동명이인의 수
		
		Member[] temp = new Member[cnt];
		return null;
	}
	// 9. 전체 회원수
	@Override
	public int count() {
		return 0;
	}
}