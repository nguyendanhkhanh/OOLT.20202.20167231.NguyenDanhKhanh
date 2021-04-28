package hust.soict.hedspi.aims.media;

public class Disc extends Media {

	String director;
	int length;	
		
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	public Disc() {
		// TODO Auto-generated constructor stub
	}
    public Disc(String director){
        this.director = director;
    }
    public Disc(String director, int length){
        this.director = director;
        this.length = length;
    }
		
}
