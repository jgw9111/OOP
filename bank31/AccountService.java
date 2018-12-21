package bank31;



public interface AccountService {
	// 서비스 로직에는 멤버변수를 두지 않는다.

	public String generatorAccountNum();

	/**
	 * *오늘 날짜 구하기
	 */
	public String today();

	/**
	 * 계좌 정보 보여주기
	 * */
	public String info(String accountNum, String name, String today, int money);

	/**
	 * 입금하기
	 */
	public String deposit(int money);

	/**
	 * 출금하기
	 */
	public String withdraw(int money);

	public String interest(double money, int month);
}
