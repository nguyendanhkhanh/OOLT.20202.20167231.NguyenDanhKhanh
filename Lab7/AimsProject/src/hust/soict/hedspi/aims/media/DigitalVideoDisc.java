package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public DigitalVideoDisc() {
		super();
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
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
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
	}
	
}
