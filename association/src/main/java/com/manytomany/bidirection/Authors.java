package com.manytomany.bidirection;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="AUTHORS")
public class Authors {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long authorId;
	
	@Column(name = "author_name")
	private String authorName;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy="authors")
	private Set<Books> books; 
	
	
	public Set<Books> getBooks() {
		return books;
	}

	public void setBooks(Set<Books> books) {
		this.books = books;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}
