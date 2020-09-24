package list_04_practice;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
	Set<Book> books = new HashSet<>();

	System.out.println("size="+books.size());

	Book b = new Book();
	b.setComment("happy");
	b.setTitle("history");
	b.setPublishDate(new Date());
	books.add(b);

//	for (int i = 0; i < 1; i++) {
//		String str = "";
//		for (int j = 0; j < 5; j++) {
//			String[] alf = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//			Random r = new Random();
//			int rr = r.nextInt(26);
//			str += alf[rr]+" ";
//		}
//		books.add(new Book());
//		books.get(i).setTitle(str);
//		Date d = new Date();
//		books.get(i).setPublishDate(d);
//	}
	for (int i = 0; i < 1; i++) {
		System.out.println(i);
	}
	System.out.println("size="+books.size());
	b = new Book();
	b.setComment("happy");
	b.setTitle("history");
	b.setPublishDate(new Date());
	books.remove(b);
	System.out.println("size="+books.size());
	Iterator<Book> i = books.iterator();
	while(i.hasNext()) {
		Book aa = i.next();
		System.out.println(aa.getPublishDate().getTime());
	}
//	イテレータが上手くいかなかったのは、PublishDateの時間差が無いと、Bbooks.get()とbが同じと判断されるため、
//	removeが正常に実行されるためにおこる。

	System.out.println("b"+b.getPublishDate().getTime());
//	if(b.equals(b2)) {
//		System.out.println("same");
//	}else {
//		System.out.println("difficult");
//
//	}
//	System.out.println(books.get.getPublishDate().getTime());
//	System.out.println("size="+books.size());
//
//	books.remove(b);
//	System.out.println("size="+books.size());


	long num16 = 1600950000000L;
//	for (int i = 0; i < 100000; i+=10000) {
////		System.out.println(i+" "+books.get(i).getTitle());
//		System.out.println(books.get(i).getPublishDate().getTime()-num16+" "+books.get(i).getTitle());
//	}
//	Collections.sort(books);
//	System.out.println("--------");
//	for (int i = 0; i < 100000; i+=10000) {
////		System.out.println(i+" "+books.get(i).getTitle());
//		System.out.println(books.get(i).getPublishDate().getTime()-num16+" "+books.get(i).getTitle());
//	}

//	List<Book> bookss = new ArrayList<>();
//
//	for (int i = 0; i < 10; i++) {
//		Random r = new Random();
//		int rr = r.nextInt(100000);
//		bookss.add(books.get(rr));
//		System.out.println(bookss.get(i).getPublishDate().getTime()-num16+" "+bookss.get(i).getTitle());
//	}
//	System.out.println("----");
//	Collections.sort(bookss);
//	for (int i = 0; i < 10; i++) {
//		System.out.println((bookss.get(i).getPublishDate().getTime()-num16)/10+" "+bookss.get(i).getTitle());
//	}

    }
}