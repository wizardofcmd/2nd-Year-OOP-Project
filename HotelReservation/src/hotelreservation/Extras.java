/*
@S.Nechifor x18393913
@28/11/2019
@Hotel Reservation Application - Reservation System

Extras Class

*/

package hotelreservation;

//Import packages
import java.util.HashMap;
import java.util.ArrayList;

//Opening class signature
public class Extras extends Room{
    //Initializing the variables
    protected ArrayList<String> extras = new ArrayList<>();
    protected String hotelChoice;
    protected double extraChoice;
    
    //Constructor
    public Extras(){
        extras.add("Bathroom Essentials");
        extras.add("Bottle of Champagne");
        extras.add("TV Channels");
        extras.add("Kitchen Essentials");
        extras.add("Safe");
    }
    
    //Overloaded Constructor
    public Extras(HashMap<String, Double> room,int nightsStay, double roomTotalCost, String roomChoice, ArrayList<String> extras, String hotelChoice, int extraChoice){
        super(room, nightsStay, roomTotalCost, roomChoice);
        this.extras=extras;
        this.hotelChoice=hotelChoice;
        this.extraChoice=extraChoice;
    }
    
    //Creating the calculation method
    public void calculateTotalCost(){
        //Using a switch-case statement instead of if-else for the varied conditions
        switch(hotelChoice){
            case "White Courtyard Resort, Paris, 5":
                //Hard-coding the cost of the hotels into each condition
                roomTotalCost+=200;
                break;
            case "Sapphire Dune, Morocco, 5":
                roomTotalCost+=300;
                break;
            case "Rose Cottage, Cork, 2":
                roomTotalCost+=50;
                break;
            case "Sunrise Lion, New York, 4":
                roomTotalCost+=150;
                break;
            case "The Backyard, Cork, 3":
                roomTotalCost+=100;
                break;
            case "Northern Brook Rest, New York, 1":
                roomTotalCost+=25;
                break;
            default:
                break;
        }
        
        //Using a switch-case statement instead of if-else for the varied conditions
        switch(roomChoice){
            case "Single":
                //Using the .get() method to retrieve value from the key in HashMap
                roomTotalCost+=room.get("Single");
                break;
            case "Double":
                roomTotalCost+=room.get("Double");
                break;
            case "Twin Single":
                roomTotalCost+=room.get("Twin Single");
                break;
            case "Triple":
                roomTotalCost+=room.get("Triple");
                break;
            case "Executive Suite":
                roomTotalCost+=room.get("Executive Suite");
                break;
            case "Presidential Suite":
                roomTotalCost+=room.get("Presidential Suite");
                break;
            default:
                break;
        }
        
        roomTotalCost=(roomTotalCost*nightsStay)+extraChoice;
    }
    
    //Getters and Setters
    public String getHotelChoice() {
        return hotelChoice;
    }

    public void setHotelChoice(String hotelChoice) {
        this.hotelChoice = hotelChoice;
    }

    public double getExtraChoice() {
        return extraChoice;
    }

    public void setExtraChoice(double extraChoice) {
        this.extraChoice = extraChoice;
    }
}