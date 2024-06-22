package com.oops;

public class Book {

	private String name;
	private double price;
	private Author author;
	int qtyInStock;
	

	public Book(String name, double price, Author author, int qtyInStock) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.qtyInStock = qtyInStock;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	public int getQtyInStock() {
		return qtyInStock;
	}


	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}


	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", qtyInStock=" + qtyInStock + "]";
	}


	public static void main(String[] args) {
		
		
		Author authorObj = new Author("Jayshetty","jayshetty@gmail.com",'M');
		System.out.println(authorObj);
		
		Book dummyBook = new Book("Think like monk",300,authorObj, 10);
		System.out.println(dummyBook);
		
	}
	
}
