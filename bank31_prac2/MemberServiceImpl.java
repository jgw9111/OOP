package bank31_prac2;

public class MemberServiceImpl implements MemberService {

	@Override
	public MemberBean join(String id, String name, String ssn, String pass) {
		// TODO Auto-generated method stub
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setPass(pass);
		member.setSsn(ssn);
		return member;
	}

	@Override
	public void login(String id,String pass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
}