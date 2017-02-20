package com.manytomany;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Subscriptor")
public class SubscriptorEntity implements Serializable {
/**
	 * @author Prashant Bagade
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="ID")
 private int subscriptorId;
@Column(name="SubName")
 private String subscriptorName;

 @ManyToMany(mappedBy="subscriptions")
 private Set<ReaderEntity> readers;
 public SubscriptorEntity() {
	super();
}
public int getSubscriptorId() {
	return subscriptorId;
}
public void setSubscriptorId(int subscriptorId) {
	this.subscriptorId = subscriptorId;
}
public String getSubscriptorName() {
	return subscriptorName;
}
public void setSubscriptorName(String subscriptorName) {
	this.subscriptorName = subscriptorName;
}
public Set<ReaderEntity> getReaders() {
	return readers;
}
public void setReaders(Set<ReaderEntity> readers) {
	this.readers = readers;
}

}

