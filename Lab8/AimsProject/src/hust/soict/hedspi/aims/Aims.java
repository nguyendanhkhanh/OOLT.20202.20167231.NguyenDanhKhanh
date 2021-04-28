 package hust.soict.hedspi.aims;
//import java.lang.module.FindException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.MyDate;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

import static org.junit.Assert.assertTrue;

public class Aims {
	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		}

	public static void main(String[] args) {

		int menu = -1;
		//ArrayList<Order> orderList = new ArrayList<Order>();
		Order anOrder = new Order("1998-03-23");
		//Order[] orderList = new Order[10];
		
		do {
			do {
				showMenu();
				Scanner scanner = new Scanner(System.in);
				menu = scanner.nextInt();
			}while(menu>4|| menu<0);
			switch(menu) {
			case 0:
				break;
			case 1:
				String date;
				System.out.println("Nhap ngay order(yyyy-mm-dd): ");
				Scanner scanner = new Scanner(System.in);
				date = scanner.nextLine();
				anOrder.setDateOrdered(date);
				
				break;
			case 2:
				System.out.println("-----Add item to order-------");
				
				int choice=-1;
				do {
					System.out.println("Add book(Chose 1)");
					System.out.println("Add DigitalVideoDisc(Chose 2)");
					System.out.println("Add compact(Chose 3)");
					System.out.print("Nhap lua chon: ");
					Scanner keyword = new Scanner(System.in);
					choice = keyword.nextInt();
				}while(choice>3||choice<1);
				
				switch(choice) {
				case 1:
					Scanner input = new Scanner(System.in);
					Book book = new Book();
					System.out.print("Id: ");
					book.setId(input.nextLine());
					System.out.print("Title: ");
					book.setTitle(input.nextLine());
					System.out.print("Category: ");
					book.setCategory(input.nextLine());
					System.out.print("Cost: ");
					book.setCost(input.nextFloat());
					anOrder.addMedia(book);
					break;
				case 2:
					Scanner input2 = new Scanner(System.in);
					DigitalVideoDisc disc = new DigitalVideoDisc();
					System.out.print("Id: ");
					disc.setId(input2.nextLine());
					System.out.print("Title: ");
					disc.setTitle(input2.nextLine());
					System.out.print("Category: ");
					disc.setCategory(input2.nextLine());
					System.out.print("Cost: ");
					disc.setCost(input2.nextFloat());
					anOrder.addMedia(disc);
					break;
				case 3:
					Scanner input3 = new Scanner(System.in);
					CompactDisc compact = new CompactDisc();
					System.out.print("Id: ");
					compact.setId(input3.nextLine());
					System.out.print("Title: ");
					compact.setTitle(input3.nextLine());
					System.out.print("Category: ");
					compact.setCategory(input3.nextLine());
					System.out.print("Cost: ");
					compact.setCost(input3.nextFloat());
					anOrder.addMedia(compact);
					break;
				default:
					break;
				}
				
				
				
//				Scanner input = new Scanner(System.in);
//				Media media = new Media();
//				System.out.print("Id: ");
//				media.setId(input.nextLine());
//				System.out.print("Title: ");
//				media.setTitle(input.nextLine());
//				System.out.print("Category: ");
//				media.setCategory(input.nextLine());
//				System.out.print("Cost: ");
//				media.setCost(input.nextFloat());
//				anOrder.addMedia(media);
				break;
			case 3:
				String id;
				System.out.print("Nhap id item can xoa: ");
				Scanner idInput = new Scanner(System.in);
				id = idInput.nextLine();
				int delete=0;
				for(Media x : anOrder.getItemsOrdered()) {
					if(x.getId().equals(id)==true) {
						anOrder.removeMedia(x);
						System.out.println("Da xoa item co id "+id);
						delete=1;
						break;
					}
				}
				if(delete==0) {
					System.out.println("Khong tim thay id can xoa");
				}
				
				break;
			case 4:
				anOrder.printListOrdered();
				break;
			}
			
		}while(menu!=0);

	}

}
	
	//UPDATE 4. AIMS
