package com.manytoone;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="CRNUMBER")
public class ClassRoomEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CRoomNUMBER")
	private int classRoomNumber;
	
	@Column(name="CLASSNAME")
	private String className;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="CLASS_ROOMugyhvu")
	private Set<StudentEntity> student;
	
	public int getClassRoomNumber() {
		return classRoomNumber;
	}
	public void setClassRoomNumber(int classRoomNumber) {
		this.classRoomNumber = classRoomNumber;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Set<StudentEntity> getStudent() {
		return student;
	}
	public void setStudent(Set<StudentEntity> student) {
		this.student = student;
	}
}
