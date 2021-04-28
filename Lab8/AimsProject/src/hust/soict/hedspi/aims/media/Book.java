package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;

public class Book extends Media implements Comparable<Book> {
	private List<String> authors = new ArrayList<String>();
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category) {
		super(title, category);
	}
	public Book(String title, String category, List<String> authors) {
		super(title, category);
		this.authors = authors;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		int ktra =0;
		for(String x : authors) {
			if(x.equals(authorName)==true) {
				ktra=1;
				break;
			}
		}
		if(ktra==0) {
			authors.add(authorName);
		}
	}
	public void removeAuthor(String authorName) {
		int ktra=0;
		for(String x : authors) {
			if(x.equals(authorName)) {
				ktra=1;
				break;
			}
		}
		if(ktra==1) {
			authors.remove(authorName);
		}
	}
	@Override
	public int compareTo(Book book) {
		return this.getTitle().compareTo(book.getTitle());
	}
	
	
	
	// bai 7 - tach tu va dem so lan xuat hien
	String content;//chua string
	List<String> contentTokens;//list chua cac token
	Map<String, Integer> wordFrequency;// map chua key, value
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<String> getContentTokens() {
		return contentTokens;
	}
	public void setContentTokens(List<String> contentTokens) {
		this.contentTokens = contentTokens;
	}
	public Map<String, Integer> getWordFrequency() {
		return wordFrequency;
	}
	public void setWordFrequency(Map<String, Integer> wordFrequency) {
		this.wordFrequency = wordFrequency;
	}
	
	
	public void processContent() {
		wordFrequency = new TreeMap();
		
		contentTokens = Arrays.asList(this.content.split("\\.|\\s|\\,"));
		Collections.sort(contentTokens);
		int max = contentTokens.size();
		int tmp[] = new int[max];// mang danh dau vi tri da duyet
		for(int i=0;i<max;i++) {
			tmp[i]=1;
		}
		for(int i=0;i<contentTokens.size();i++) {
			int count=1;
			if(tmp[i]==1) {// =1 la chua duyet
				tmp[i] = 0;// =0 la da duyet qua phan tu
				for(int j=i+1;j<contentTokens.size();j++) {
					if(contentTokens.get(i).equals(contentTokens.get(j))) {
						count++;
						tmp[j]=0;
					}
				}
				wordFrequency.put(contentTokens.get(i), count);
			}
		}
	}
	
	@Override
	public String toString() {
		return
			"----------Information of Book-----------\n"+
			"ID: " + this.getId() + "\n"+
		    "Title: " + this.getTitle() +"\n"+
		    "Authors: " + this.getAuthors() +"\n"+
		    "Category: " + this.getCategory() +"\n"+
		    "Cost: " + this.getCost() +"\n"+
		    "Content: " + this.getContent() +"\n"+
		    "ContentTokens: " + this.getContentTokens() +"\n"+
		    "WordFrequency: " + this.getWordFrequency() +"\n";
	}
}