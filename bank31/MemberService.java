package bank31;

public interface MemberService {
	// 회원 가입
	public void join(String id,String name,String ssn,String pass);
	//==================================================================
	// 목록 보기
	public MemberBean[] list();
	// 개인정보 검색
	public MemberBean find(String id);
	
	// 로그인
	public boolean login(String id,String pass);
	// 회원 수 
	public int count();
	//==================================================================

	// 정보 수정
	public void update();

	// 회원 탈퇴
	public void delete();
}
