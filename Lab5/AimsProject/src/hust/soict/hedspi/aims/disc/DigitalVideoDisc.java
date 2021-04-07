package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public DigitalVideoDisc() {
		super();
	}
	public DigitalVideoDisc(String title) {
		super();
		this.setTitle(title); // truy cap vao setTitle cua Media;
	}
	public DigitalVideoDisc(String title, String category) {
		super();
		this.setTitle(title);
		// this.category = category;
		this.setCategory(category);
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		/*		this.title = title;
		this.category = category;
		this.director = director;
		*/
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public boolean search(String title) {
		String[] strArray = title.split(" ");
		String[] titleDiscArray = this.title.split(" ");
		for(String str : strArray) {
			for(String titleDisc : titleDiscArray) {
				if(titleDisc.equals(str)) {
					return true;
				}
			}
		}
		return false;
	}	
}
