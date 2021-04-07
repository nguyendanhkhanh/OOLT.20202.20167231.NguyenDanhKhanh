package hust.soict.hedspi.aims.order;
import java.time.LocalDate;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered=0;
	
	private String dateOrdered;
	

	public static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;// danh sach so nguoi(list) order
	
	
	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	public Order(String dateOrdered) {
		super();
		if(nbOrders< MAX_LIMITTED_ORDERS) {
			this.dateOrdered = dateOrdered;
			nbOrders++;
		}else {
			System.out.println("So nguoi dat hang vuot qua so luong cho phep");
		}
		
	}

	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public boolean addDigitalVideoDisc(DigitalVideoDisc disc) {
		// add more an item to the list
		if(qtyOrdered >= MAX_NUMBER_ORDERED) {
			System.out.println("Qua so luong. Khong the them vao nua.");
			return true;
		}else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			return false;
		}
	}
	
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for(int i=0;i<dvdList.length;i++) {
			if(qtyOrdered >= MAX_NUMBER_ORDERED) {
				System.out.println("Qua so luong. Khong the them vao nua.");
				for(int j=i;j<dvdList.length;j++) {
					System.out.println(j-i+1+"."+dvdList[j].getTitle());
				}
				break;
			}else {
				itemsOrdered[qtyOrdered] = dvdList[i];
				qtyOrdered++;
			}
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		// add more an item to the list
		if(qtyOrdered >= MAX_NUMBER_ORDERED) {
			System.out.println("Qua so luong. Khong the them vao nua.");
		}else {
			itemsOrdered[qtyOrdered] = disc1;
			qtyOrdered++;
			if(qtyOrdered >= MAX_NUMBER_ORDERED) {
				System.out.println("Qua so luong. Khong the them vao nua.");
			}else {
				itemsOrdered[qtyOrdered] = disc2;
				qtyOrdered++;
			}
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		// remove the item passed by argument from the list
		int test=-1;
		for(int i=0;i<qtyOrdered;i++) {
			if(itemsOrdered[i] == disc) {
				test=i;
			}
		}
		if(test==-1) {
			System.out.println("Khong tim thay phan tu can xoa");
		}else {
			for(int i= test;i< qtyOrdered -1;i++) {
				itemsOrdered[i]=itemsOrdered[i+1];
			}
			qtyOrdered--;
		}
	}
	public float totalCost() {
		float cost=0f;
		for(int i=0;i<qtyOrdered;i++) {
			cost=cost+itemsOrdered[i].getCost();
		}
		return cost;
	}
	
	public void printListOrdered() {
		System.out.println("*************Order**************");
		System.out.println("Date: "+getDateOrdered());
		System.out.println("Ordered Items: ");
		for(int i=0;i<qtyOrdered;i++) {
			System.out.println(i+1+". DVD -"+itemsOrdered[i].getTitle()+" - "+ itemsOrdered[i].getCategory()+" - "+itemsOrdered[i].getDirector()+" - "+itemsOrdered[i].getLength()+": "+ itemsOrdered[i].getCost()+"$");
		}
		System.out.println("Total cost: "+ totalCost());
		System.out.println("********************************");
	}
	
	public DigitalVideoDisc getAluckyItem() {
		int min=0, max=qtyOrdered;
		int random = (int)(Math.random()*(max-min)+min);
		itemsOrdered[random].setCost(0);
		return itemsOrdered[random];
	}
}