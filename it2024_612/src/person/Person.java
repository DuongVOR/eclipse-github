package person;

public class Person {
	// thuoc tinh lop person
	protected String name;
	protected String dob;
	protected String pod;
	protected char gender;
	protected String email;
	protected String phone;
	protected int old;

	// Phuong thuc tao constructor
	public Person() {
	}

	public Person(String name, String dob, String pod, char gender, String email, String phone, int old) {
		this.name = name;
		this.dob = dob;
		this.pod = pod;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.old = old;
	}

	// Phuong thuc setter and getter
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPod() {
		return pod;
	}

	public void setPod(String pod) {
		this.pod = pod;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	// Phuong thuc toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", pod=" + pod + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + ", old=" + old + "]";
	}
}
