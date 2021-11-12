package LYT.Book;

public class Book {
private String Title;
private String Author;
private int numberOfPages;

public Book(String title, String author, int pages) {
	super();
	this.Title = title;
	this.Author = author;
	this.numberOfPages = pages;
}
public String toString() {
	return Title + Author + numberOfPages;
}
}
