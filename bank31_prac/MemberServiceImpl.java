package bank31_prac;

public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	private int count;

	MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}

	@Override
	public void join(String id, String name, String ssn, String pass) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setPass(pass);
		member.setSsn(ssn);
		members[count] = member;
		count++;
	}

	@Override
	public MemberBean[] list() {

		return members;
	}

	@Override
	public MemberBean find(String id) {
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if (members[i].getId().equals(id)) {
				member = members[i];
				break;
			}
		}

		return member;
	}

	@Override
	public boolean login(String id, String pass) {
		boolean ok = false;
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if (members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				ok = true;
				break;
			}
		}
		return ok;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

}
