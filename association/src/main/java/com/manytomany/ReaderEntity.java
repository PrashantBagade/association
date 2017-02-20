package com.manytomany;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="Reader")
public class ReaderEntity implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "ID")
	private int readerId;
	 @Column(name="RedrFName")
	private String readerFirstName;
	 @Column(name="RedrLName")
	private String readerLastName;
	 @ManyToMany(cascade=CascadeType.ALL)
	 @JoinTable(name="READER_SUBSCRIPTIONS", joinColumns={@JoinColumn(referencedColumnName="ID")},
	                            inverseJoinColumns={@JoinColumn(referencedColumnName="ID")})  
	private Set<SubscriptorEntity> subscriptions;
	 
	public ReaderEntity() {
		super();
	}
	public int getReaderId() {
		return readerId;
	}
	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}
	public String getReaderFirstName() {
		return readerFirstName;
	}
	public void setReaderFirstName(String readerFirstName) {
		this.readerFirstName = readerFirstName;
	}
	public String getReaderLastName() {
		return readerLastName;
	}
	public void setReaderLastName(String readerLastName) {
		this.readerLastName = readerLastName;
	}
	public Set<SubscriptorEntity> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(Set<SubscriptorEntity> subscriptions) {
		this.subscriptions = subscriptions;
	}
}
