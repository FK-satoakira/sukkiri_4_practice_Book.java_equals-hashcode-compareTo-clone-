package list_04_practice;

import java.util.Date;

public class Book implements Cloneable, Comparable<Book> {
	private String title;
	private Date publishDate;
	private String comment;
	@Override
	public int compareTo(Book b) {
//		return this.publishDate.compareTo(b.publishDate);/*DateクラスがCompareableをじっそうしてるからcompareTo(引数:Date)が可能。*/
		if(this.publishDate.getTime() < b.publishDate.getTime())return 1;
		if(this.publishDate.getTime() > b.publishDate.getTime())return -1;
//		if(this.title.hashCode() < b.title.hashCode())return -1;
//		if(this.title.hashCode() > b.title.hashCode())return 1;
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result += prime * result + ((comment == null) ? 0 : comment.hashCode());
		result += prime * result + ((publishDate == null) ? 0 : publishDate.hashCode());
		result += prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object o) {
		if(o==this)return true;
		if(o==null)return false;
		if(!(o instanceof Book)) {return false;}
		Book b = (Book) o;
		if(!(b.title.trim().equals(this.title.trim()) && b.publishDate.equals(this.publishDate))) {
			return false;
		}
		return true;
	}

	@Override
	protected Book clone() {
		Book b = new Book();
		b.title = this.title;
		b.publishDate = this.publishDate;
		b.comment = this.comment;
		return b;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}


}
