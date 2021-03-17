package Lab3;

public class Order {

	public static final int MAX_NUMBER_ORDERED = 10;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered=0;
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		// add more an item to the list
		if(qtyOrdered >= MAX_NUMBER_ORDERED) {
			System.out.println("Qua so luong. Khong the them vao nua.");
		}else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
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

}
