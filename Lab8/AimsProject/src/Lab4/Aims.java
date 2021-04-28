package Lab4;
//import java.lang.module.FindException;
import Lab4.Date.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

public class Aims {

	public static void main(String[] args) {
		
		
		Order anOrder = new Order("2019-03-02");
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);
		
//		DigitalVideoDisc dvdList[] = new DigitalVideoDisc[10];
//		for(int i=0;i<dvdList.length;i++) {
//			dvdList[i] = dvd1;
//		}
//		anOrder.addDigitalVideoDisc(dvdList)
		
		
		anOrder.addDigitalVideoDisc(dvd1, dvd2);
		anOrder.printListOrdered();
		
		DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
//		unitTestAddDigitalVideoDisc(anOrder, dvdList);
//		unitTestAddDigitalVideoDisc(anOrder, dvd1, dvd2);
		
		MyDate date1 = new MyDate("January 1st 2000");
		MyDate date2 = new MyDate("February 2nd 2000");
		MyDate date3 = new MyDate("February 2nd 1900");
		MyDate date4 = new MyDate("February 2nd 140");
		MyDate date5 = new MyDate("February 2nd 4092");
//		unitTestDateCompare(date1, date2);
		MyDate[] dateList = {date1, date2, date3, date4, date5};
//		unitTestDateSort(dateList);
		for (MyDate date: dateList) {
			date.print();
		}
		
		// Tao order moi de test
		Order order2 = new Order("2021-31-03");
		DigitalVideoDisc dvd2_1 = new DigitalVideoDisc("Nguyen Danh");
		dvd2_1.setCategory("Animation");
		dvd2_1.setCost(20);
		dvd2_1.setDirector("nguyendanhkhanh");
		dvd2_1.setLength(23);
		order2.addDigitalVideoDisc(dvd2_1);
		order2.printListOrdered();
	}

	public static void unitTestAddDigitalVideoDisc(Order anOrder, DigitalVideoDisc ...dvdList) {
		
	}
	public static void unitTestAddDigitalVideoDisc(Order anOrder, DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {

	}
	
	
}
