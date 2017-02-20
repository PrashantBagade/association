package com.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="STUDENTID")
	private int studentId;
	@Column(name="STUDENTNAME")
	private String studentName;
	@ManyToOne
	private ClassRoomEntity classRoom;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public ClassRoomEntity getClass1() {
		return classRoom;
	}
	public void setClass1(ClassRoomEntity classRoom) {
		this.classRoom = classRoom;
	}
	
}
