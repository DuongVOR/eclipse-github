package exception;

public class ThoiGian {
	protected int day;
	protected int month;
	protected int year;

	public ThoiGian() {
	}

	public ThoiGian(int day, int month, int year) {
		try {
			InvalidDate(day, month);
		} catch (InvalidDateException e) {
			e.printStackTrace();
		}
		this.day = day;
		this.month = month;
		this.year = year;

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		try {
			InvalidDate(day, 1);
			this.day = day;
		} catch (InvalidDateException e) {
			e.printStackTrace();
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		try {
			this.month = month;
			InvalidDate(1, month);
		} catch (InvalidDateException e) {
			e.printStackTrace();
		}
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

	public static void InvalidDate(int day, int month) throws InvalidDateException {
		if (day > 31 || month > 12)
			throw new InvalidDateException("Oh no ban nhap sai gi roi!");
	}
}