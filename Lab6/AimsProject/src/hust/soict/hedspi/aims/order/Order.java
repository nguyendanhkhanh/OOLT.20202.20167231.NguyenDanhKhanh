package hust.soict.hedspi.aims.order;
import java.time.LocalDate;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private MyDate dateOrdered;
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	
	public static final int MAX_NUMBER_ORDERED = 10;
	
	public static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;// danh sach so nguoi(list) order
	
	
    public Order() {
        if (nbOrders < MAX_LIMITTED_ORDERS) {
            dateOrdered = new MyDate();
            nbOrders++;
        } else {
            System.out.println("So nguoi dat hang vuot qua so luong cho phep.");
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
		System.out.println("Order Management Applications: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("Total cost: "+ totalCost());
		System.out.println("********************************");
	}
	

}