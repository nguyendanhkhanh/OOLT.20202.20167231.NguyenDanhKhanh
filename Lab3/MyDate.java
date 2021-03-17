package Lab3;
import java.time.LocalDate;
import java.util.Scanner;

public class MyDate {

	private int day;
	private int month;
	private int year;
	public MyDate(int day, int month, int year) {
		super();
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	public MyDate() {
		super();
		LocalDate date = LocalDate.now();
		this.day = date.getDayOfMonth();
		this.month=date.getMonthValue();
		this.year=date.getYear();
	}
	public MyDate(String date) {
		System.out.println("Date: "+date);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day>0 && day <=31) {
			this.day=day;
		}else {
			//kiem tra ngay hop le
			System.out.println("Ngay nhap khong hop le");
			this.day=0;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>0&&month<=12) {
			this.month= month;
		}else {
			System.out.println("Nhap thang khong hop le");
			this.month=0;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year>0) {
			this.year=year;
		}else {
			System.out.println("Nhap nam khong hop le");
			this.year=0;
		}
	}
	//quy uoc dinh dang dd/mm/yy
	public void accept() {
		System.out.print("Nhap date(day/month/year) (VD: 2/3/1998): ");
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		String[] mangDate = date.split("/");
		
		setDay(Integer.parseInt(mangDate[0]));
		setMonth(Integer.parseInt(mangDate[1]));
		setYear(Integer.parseInt(mangDate[2]));
	}
	public void print() {
		LocalDate date = LocalDate.now();
		System.out.println("Today: "+date);
		System.out.println("Day: "+getDay()+", Month: "+getMonth()+", Year: "+getYear());
	}
}
