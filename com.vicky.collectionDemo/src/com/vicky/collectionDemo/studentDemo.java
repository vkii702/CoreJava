package com.vicky.collectionDemo;

public class studentDemo {
	int stdId;
	String stdName;
	String stdAddress;
	int Marks;
	public studentDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public studentDemo(int stdId, String stdName, String stdAddress, int marks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAddress = stdAddress;
		Marks = marks;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "studentDemo [stdId=" + stdId + ", stdName=" + stdName + ", stdAddress=" + stdAddress + ", Marks="
				+ Marks + "]";
	}
	

}
