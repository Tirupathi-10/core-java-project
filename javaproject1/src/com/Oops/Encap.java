package com.Oops;

public class Encap {
	private int stdid;
	private String sname;
	private double marks;

	public void setStdid(int stdid) {
		if (stdid > 10) {
			this.stdid = stdid;
		} else {
			System.out.println("Invalid Id");
		}
	}

	public int getStdid() {
		return stdid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getsname() {
		return sname;
	}

	public void setMarks(double marks) {
		if (marks < 100) {
			this.marks = marks;
		} else {
			System.out.println("Invalid");
		}
	}

	public double getMarks() {
		return marks;
	}

}
