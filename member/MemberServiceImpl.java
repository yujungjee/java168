package member;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	
	public MemberServiceImpl() {
		members = new Member[3];
		count = 0;
	}
	

	@Override
	public void join(Member member) {
		members[count] = member;
		count = 0;
	}
	
	@Override
	public String login(Member member) {
		String result = "FAIL";
		for(int i = 0; i<count; i++) {
			if(member.getUserid().equals(members[i].getUserid())
				&&
				member.getPassword().equals(members[i].getPassword())) {
				result = "SUCCESS";
					break;
			}
		}
		return result;
		
	}

	@Override
	public Member[] list() {
		return members;
	}
	
	@Override
	public String existId(Member member) {
		String result = "중복없음";
		for(int i = 0; i < count; i++) {
		if(member.getUserid().equals(members[i].getUserid())) {
		result = "중복된 아이디";
		}
	}
		return result;
	}
}
