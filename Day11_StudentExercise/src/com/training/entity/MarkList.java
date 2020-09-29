package com.training.entity;

public class MarkList {

	private int maths;
	private int biology;
	private int physics;
	public MarkList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarkList(int maths, int biology, int physics) {
		super();
		this.maths = maths;
		this.biology = biology;
		this.physics = physics;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getBiology() {
		return biology;
	}
	public void setBiology(int biology) {
		this.biology = biology;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	
}
