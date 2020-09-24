package list_04_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
	List<Book> books = new ArrayList<>();
	for (int i = 0; i < 100000; i++) {
		String str = "";
		for (int j = 0; j < 5; j++) {
			String[] alf = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
			Random r = new Random();
			int rr = r.nextInt(26);
			str += alf[rr]+" ";
		}
		books.add(new Book());
		books.get(i).setTitle(str);
		Date d = new Date();
		books.get(i).setPublishDate(d);
//		System.out.println(books.get(i).getPublishDate().getTime()+" "+books.get(i).getTitle());
	}

	long num16 = 1600950000000L;
//	for (int i = 0; i < 100000; i+=10000) {
////		System.out.println(i+" "+books.get(i).getTitle());
//		System.out.println(books.get(i).getPublishDate().getTime()-num16+" "+books.get(i).getTitle());
//	}
	Collections.sort(books);
//	System.out.println("--------");
//	for (int i = 0; i < 100000; i+=10000) {
////		System.out.println(i+" "+books.get(i).getTitle());
//		System.out.println(books.get(i).getPublishDate().getTime()-num16+" "+books.get(i).getTitle());
//	}

	List<Book> bookss = new ArrayList<>();

	for (int i = 0; i < 10; i++) {
		Random r = new Random();
		int rr = r.nextInt(100000);
		bookss.add(books.get(rr));
		System.out.println(bookss.get(i).getPublishDate().getTime()-num16+" "+bookss.get(i).getTitle());
	}
	System.out.println("----");
	Collections.sort(bookss);
	for (int i = 0; i < 10; i++) {
		System.out.println((bookss.get(i).getPublishDate().getTime()-num16)/10+" "+bookss.get(i).getTitle());
	}

    }
}