package Lab4.Date;

public class DateTest {
    public static void main(String[] args) {
        MyDate date1= new MyDate();
        date1.print();
        date1.setMonth("June");
        date1.print("dd/mm/yyy");
        date1.setMonth("Sep");
        date1.print("dd/mm/yyy");

        MyDate date2 = new MyDate("10/10/2009");
        MyDate date3 = new MyDate("5/1/2018");
        MyDate date4 = new MyDate("29/11/1998");
        System.out.println("Date 2 with Date 3 " + DateUtils.compareDate(date2, date3));
        System.out.println("Date 2 with Date 4  " + DateUtils.compareDate(date2, date4));
        System.out.println("Date 3 with Date 4 "+DateUtils.compareDate(date3,date4));

        MyDate[] dateList = { date1, date4, date3, date2 };
        DateUtils.sortDate(dateList);
    }
}