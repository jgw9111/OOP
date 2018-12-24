package bank31_prac;

public interface MemberService {
	//회원 가입
	public void join(String id,String name,String ssn,String pass);
	public MemberBean[] list();
	public MemberBean find(String id);
	
	//로그인
	public boolean login(String id,String pass) ;
	
	public int count();
	//정보 수정
	public void update();
	//회원 탈퇴
	public void delete() ;
}
