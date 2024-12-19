package com.online.book.store.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookRegistration {

	@Id
	String Book_title;
	String Author;
	String Reviews;
	String rate;
	String price;
	String imagePath;
	String imageName;
	boolean isHomePage;
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBook_title() {
		return Book_title;
	}
	public void setBook_title(String book_title) {
		Book_title = book_title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author= author;
	}
	public String getReviews() {
		return Reviews;
	}
	public void setReviews(String reviews) {
		Reviews = reviews;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public boolean isHomePage() {
		return isHomePage;
	}
	public void setHomePage(boolean homePage) {
		isHomePage = homePage;
	}
}
