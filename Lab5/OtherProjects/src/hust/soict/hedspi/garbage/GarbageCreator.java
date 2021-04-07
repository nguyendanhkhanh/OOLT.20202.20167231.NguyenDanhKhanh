package hust.soict.hedspi.garbage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i,j;
		FileReader f1= new FileReader("/home/admin/Documents/Java/OrtherProjects/src/hust/soict/hedspi/garbage/demo.txt");
		FileReader f2= new FileReader("/home/admin/Documents/Java/OrtherProjects/src/hust/soict/hedspi/garbage/demo.txt");
		
		long start1 = System.currentTimeMillis();
		String str = "";
		while((i=f1.read()) != -1)
		str = str+(char)i;
		f1.close();
		System.out.println("Time by String: " + (System.currentTimeMillis()-start1));
		
		long start2 = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		while((j=f2.read()) != -1)
			sb.append((char)j);
			f2.close();
		System.out.println("Time by StringBuffer: "+(System.currentTimeMillis()-start2));
	

	}

}