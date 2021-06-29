public class Test142 {

	private String accountNumber = "4649";
	private int balance = 1592;

	public String toString() {
		return "\\" + this.balance + "(口座番号：" + this.accountNumber + ") ";
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Test142) {
			Test142 a = (Test142) o;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}
