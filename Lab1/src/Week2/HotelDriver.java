package lab2;

public class HotelDriver {

	public static void main(String[] args) {

		HotelRoom roomA = new HotelRoom();
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomA.setRate(100.0);
		roomA.setOccupied(1);
		
		HotelRoom roomB = new HotelRoom();
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		roomB.setRate(80.0);
		roomB.setOccupied(0);
		
		HotelRoom roomC = new HotelRoom(202, "Single", 0, 90.0);
		
		System.out.println("Room number:" + roomA.getRoomNumber() + "Room Type:" + roomA.getRoomType() + "Room availability:" + roomA.getOccupied() + "Room rate is:" + roomA.getRate());
		System.out.println("Room number:" + roomB.getRoomNumber() + "Room Type:" + roomB.getRoomType() + "Room availability:" + roomB.getOccupied() + "Room rate is:" + roomB.getRate());
		System.out.println("Room number:" + roomC.getRoomNumber() + "Room Type:" + roomC.getRoomType() + "Room availability:" + roomC.getOccupied() + "Room rate is:" + roomC.getRate());
	}

}
