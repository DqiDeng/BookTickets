package flightorder;
import java.util.ArrayList;
public class Flight {
//∫Ω∞‡–≈œ¢
	private String FlightID;
	private String startTime;
	private String arrivalTime;
	private String startCity;
	private String arrivalCity;
	private String departureDate;
	private int price;
	private int currentPassengers;
	private int seatCapacity;
	private String flightStatus;
	private ArrayList PassengerIDs;
	public Flight(String FlightID, String startTime, String arrivalTime, String startCity,String arrivalCity, String departureDate, int price, int currentPassengers, int seatCapacity, String flightStatus, ArrayList PassengerIDs)
	{
		this.FlightID=FlightID;
		this.startTime=startTime;
		this.arrivalTime=arrivalTime;
		this.startCity=startCity;
		this.arrivalCity=arrivalCity;
		this.departureDate=departureDate;
		this.price=price;
		this.currentPassengers=currentPassengers;
		this.seatCapacity=seatCapacity;
		this.flightStatus=flightStatus;
		this.PassengerIDs=PassengerIDs;
	}
	public void setFlightID(String FlightID){
		this.FlightID=FlightID;
	}
	public String getFightID(){
		return FlightID;
	}
	public void setstartTime(String startTime){
		this.startTime=startTime;
	}
	public String getstartTime(){
		return startTime;
	}
	public void setarrivalTime(String arrivalTime){
		this.arrivalTime=arrivalTime;
	}
	public String arrivalTime(){
		return arrivalTime;
	}
	public void setstartCity(String startCity){
		this.startCity=startCity;
	}
	public String getstartCity(){
		return startCity;
	}
	public void setarrivalCity(String arrivalCity){
		this.arrivalCity=arrivalCity;
	}
	public String getarrivalCity(){
		return arrivalCity;
	}
	public void setdepartureDate(String departureDate){
		this.departureDate=departureDate;
	}
	public String getdepartureDate(){
		return departureDate;
	}
	public void setprice(int price){
		this.price=price;
	}
	public int getprice(){
		return price;
	}
	public void setcurrentPassengers(int currentPassengers){
		this.currentPassengers=currentPassengers;
	}
	public int getcurrentPassengers(){
		return currentPassengers;
	}
	public void setseatCapacity(int seatCapacity){
		this.seatCapacity=seatCapacity;
	}
	public int getseatCapacity(){
		return seatCapacity;
	}
	public void setflightStatus(String flightStatus){
		this.flightStatus=flightStatus;
	}
	public String getflightStatus(){
		return flightStatus;
	}
	public void setPassengerIDs(ArrayList PassengerIDs){
		this.PassengerIDs=PassengerIDs;
	}
	public ArrayList getPassengerIDs(){
		return PassengerIDs;
	}
}
