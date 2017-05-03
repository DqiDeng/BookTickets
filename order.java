package flightorder;

import java.util.Date;
public class order {
	int passengerID;
	String seat;
	Flight flight;
	Date creatDate;
	String status;
	public order (int passengerID, String seat, Flight flight, Date creatDate, String status)
	{
		this.passengerID=passengerID;
		this.seat=seat;
		this.flight=flight;
		this.creatDate=creatDate;
		this.status=status;
	}
	public void setpassengerID(int passengerID){
		this.passengerID=passengerID;
	}
	public int getpassengerID(){
		return passengerID;
	}
	public void setseat(String seat){
		this.seat=seat;
	}
	public String getseat(){
		return seat;
	}
	public void setflight(Flight flight){
		this.flight=flight;
	}
	public Flight getflight(){
		return flight;
	}
	public void setDate(Date creatDate){
		this.creatDate=creatDate;
	}
	public Date getDate(){
		return creatDate;
	}
	public void setstatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return status;
	}
	public void displayorder(){
		System.out.printf("PassengerID: %d\n",passengerID);
		System.out.printf("Seat: %s\n",seat);
		System.out.printf("FlightInfo: %s\n",flight);
		System.out.printf("CreatDate: %s\n",creatDate);
		System.out.printf("Status: %s\n",status);
	}

}
