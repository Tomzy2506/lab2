package lab2;

public class HotelRoom {

		private int roomNumber;
		private int occupied;
		private String roomType;
		private double rate;
		
		public HotelRoom() {
			roomNumber = 0;
			roomType = " ";
			occupied = 0;
			rate = 0.0;
		}
		
		public HotelRoom(int roomNumber, String roomType, int occupied, double rate) {
			this.roomNumber = roomNumber;
			this.roomType = roomType;
			this.occupied = occupied;
			this.rate = rate;
		}
		public double getRate() {
			return rate;
		}
		public void setRate(double rate) {
			this.rate = rate;
		}
		public int getOccupied() {
			return occupied;
		}
		public void setOccupied(int occupied) {
			if(occupied==0 || occupied==1) {
				this.occupied = occupied;
			}
			else {
				System.out.println("Occupied number is not within a range");
			}
		}
		public int getRoomNumber() {
			return roomNumber;
		}
		public void setRoomNumber(int roomNumber) {
			this.roomNumber = roomNumber;
		}
		public String  getRoomType() {
			return roomType;
		}
		public void setRoomType(String roomType) {
			this.roomType = roomType;
		}
}
