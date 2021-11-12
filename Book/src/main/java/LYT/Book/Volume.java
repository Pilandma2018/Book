package LYT.Book;

public class Volume {
private String volumeName;
private int numberOfBooks;
private  Book[] books;

Volume(String volumeName, int numBooks, Book[] books) {
	this.volumeName = volumeName;
	this.numberOfBooks = numBooks;
	this.books = books;
}
public String toString() {
	return volumeName + numberOfBooks;
}
public Book[] getArraybook() {
	return books;
}
}
