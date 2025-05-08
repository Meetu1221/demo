package com.project.inheritance;

public class MountainBike extends Bicycle {

	public int seatHight;

	public MountainBike(int speed, int gear, int startHight) {
		super();
		seatHight = startHight;
	}
	
	public void seatHight(int hight) {
		seatHight=hight;
	}

	@Override
	public String toString() {
		return (super.toString()+"\nSeat Hight="+seatHight);
	}



}
