/*
@S.Nechifor x18393913
@28/11/2019
@Hotel Reservation Application - Reservation System

Room Class

*/

package hotelreservation;

//Imports
import java.util.HashMap;

//Class signature
public class Room extends Hotels{
    //Variable Declaration
    protected HashMap<String, Double> room = new HashMap<>();
    protected int nightsStay;
    protected double roomTotalCost;
    protected String roomChoice;
    
    //Constructor
    public Room(){
        room.put("Single", 10.0);
        room.put("Double", 20.0);
        room.put("Twin Single", 15.0);
        room.put("Triple", 25.0);
        room.put("Executive Suite", 75.0);
        room.put("Presidential Suite", 200.0);
        roomTotalCost=0.0;
        roomChoice="";
        nightsStay=0;
    }
    
    //Overloaded Constructor
    public Room(HashMap<String, Double> room, int nightsStay, double roomTotalCost, String roomChoice){
        this.room=room;
        this.nightsStay=nightsStay;
        this.roomTotalCost=roomTotalCost;
        this.roomChoice=roomChoice;
    }
    
    //Getters and Setters
    public double getRoomTotalCost() {
        return roomTotalCost;
    }
    
    public HashMap<String, Double> getRoom(){
        return room;
    }
    // USED FOR DEBUGGING
    public int getNightsStay() {
        return nightsStay;
    }

    public void setNightsStay(int nightsStay) {
        this.nightsStay = nightsStay;
    }
    
    // USED FOR DEBUGGING
    public String getRoomChoice() {
        return roomChoice;
    }

    public void setRoomChoice(String roomChoice) {
        this.roomChoice=roomChoice;
    }
}
