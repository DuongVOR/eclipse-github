package exception;

public class ThoiGian {
	protected int day;
	protected int month;
	protected int year;

	public ThoiGian() {
	}

	public ThoiGian(int day, int month, int year) {
		try {
			this.day = day;
			this.month = month;
			this.year = year;
			if (day > 31 || month > 12)
				day = -1;
		} catch (NumberFormatException e) {
			System.out.println(e.toString());
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "ThoiGian [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
