package hust.soict.hedspi.aims.order;
import java.time.LocalDate;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	//public static final int MAX_NUMBER_ORDERED = 10;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private String dateOrdered;
	

	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

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
	
	public void addMedia(Media media) {
		itemsOrdered.add(media);
	}
	
	public void removeMedia(Media media) {
		itemsOrdered.remove(media);
	}

	public float totalCost() {
		float cost=0;
		for(Media x : itemsOrdered) {
			cost=cost+x.getCost();
		}
		return cost;
	}
	
	public void printListOrdered() {
		System.out.println("*************Order**************");
		System.out.println("Date: "+getDateOrdered());
		System.out.println("Ordered Items: ");
//		for(int i=0;i<qtyOrdered;i++) {
//			System.out.println(i+1+". DVD -"+itemsOrdered[i].getTitle()+" - "+ itemsOrdered[i].getCategory()+" - "+itemsOrdered[i].getDirector()+" - "+itemsOrdered[i].getLength()+": "+ itemsOrdered[i].getCost()+"$");
//		}
		for(Media x: itemsOrdered) {
			System.out.println(x.getId()+" -"+ x.getTitle()+" - "+ x.getCategory()+" - "+x.getCost()+"$");
		}
		System.out.println("Total cost: "+ totalCost());
		System.out.println("********************************");
	}
	
}