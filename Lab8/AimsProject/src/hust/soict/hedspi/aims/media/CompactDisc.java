package hust.soict.hedspi.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable, Comparable<CompactDisc>  {
	
	private String artist;
	private int length;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	private int length;
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}


	public void addTrack(Track trackIn ) {
		if(this.tracks.contains(trackIn))
			System.out.println("The track " + trackIn.getTitle() + " is existed. ");
		else 
		{
			this.tracks.add(trackIn);
			System.out.println("The track " + trackIn.getTitle() + " has been added. ");
		}
	}
	public void removeTrack(Track trackOut) {
		if(this.tracks.contains(trackOut)) 
		{
			this.tracks.remove(trackOut);
			System.out.println("The track "+ trackOut.getTitle() + " has been removed. " );
		}
			
		else
			System.out.println("The track "+ trackOut.getTitle() + " is not existed. " );
	}
	
	public int getLength() {
		int totalLength = 0;
		for(Track x: tracks) {
			totalLength = totalLength + x.getLength();
		}
		return totalLength;
	}
	
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	
	public void play() {
		for(Track x : tracks) {
			x.play();
		}
	}
	@Override
	public int compareTo(CompactDisc cd) {
		return this.getTitle().compareTo(cd.getTitle());
	}
	
}
