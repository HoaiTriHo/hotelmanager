package DTO;

import java.util.Date;

public class Room_DTO {
	//Properties class Room_DTO
	private int roomID;
	private String typeOfRoom;
	private Date checkInDate;
	private Date checkOutDate;
	private int service;
	private String note;
	private float prePayment;
	private int dayOfStay;
	private float total;
	
	//Contructor class Room_DTO
	public Room_DTO(int roomID, String typeOfRoom, Date checkInDate, Date checkOutDate, int service, String note,
			float prePayment, int dayOfStay, float total) {
		super();
		this.roomID = roomID;
		this.typeOfRoom = typeOfRoom;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.service = service;
		this.note = note;
		this.prePayment = prePayment;
		this.dayOfStay = dayOfStay;
		this.total = total;
	}

	public Room_DTO() {
		super();
	}
	//Getter setter

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public String getTypeOfRoom() {
		return typeOfRoom;
	}

	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getService() {
		return service;
	}

	public void setService(int service) {
		this.service = service;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public float getPrePayment() {
		return prePayment;
	}

	public void setPrePayment(float prePayment) {
		this.prePayment = prePayment;
	}

	public int getDayOfStay() {
		return dayOfStay;
	}

	public void setDayOfStay(int dayOfStay) {
		this.dayOfStay = dayOfStay;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
	
}
