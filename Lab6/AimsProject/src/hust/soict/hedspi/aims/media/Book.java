package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		//
	}
	public Book(int id,String title){
        super(id,title);
    }
    public Book(int id,String title, String category){
        super(id,title, category);
    }
    public Book(int id,String title, String category, float cost){
        super(id,title, category,cost);
    }
    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        if(authors.size() != 0) {
            this.authors = authors;
        }else {
            System.out.println("Authors list empty!");
        }
    }

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		int ktra = 0;
		for (String x : authors) {
			if ( x.equals(authorName ) == true) {
				ktra = 1;
				break;
			}
		}
		if (ktra == 0) {
			authors.add(authorName);
		}
	}
	public void removeAuthor(String authorName) {
		int ktra = 0;
		for (String x : authors) {
			if(x.equals(authorName)) {
				ktra = 1;
				break;
			}
		}
		if (ktra == 1) {
			authors.remove(authorName);
		}
	}
	
	

}
