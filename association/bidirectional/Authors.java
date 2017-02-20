package com.manytomany.bidirectional;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AUTHORS")
public class Authors {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AID")
	private int authId;
	@Column(name="BOOKNAME")
	private String bookName;
	@ManyToOne(cascade=CascadeType.ALL)
	private Set<Books> books;
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Set<Books> getBooks() {
		return books;
	}
	public void setBooks(Set<Books> books) {
		this.books = books;
	}
	
}
