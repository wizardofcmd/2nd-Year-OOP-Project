/*
@S.Nechifor x18393913
@28/11/2019
@Hotel Reservation Application - Reservation System

Hotels.java

*/

package hotelreservation;

public class Hotels {
        //Declaring hotel details as an array
        protected String[] hotelOne = new String[3];
        protected String[] hotelTwo = new String[3];
        protected String[] hotelThree = new String[3];
        protected String[] hotelFour = new String[3];
        protected String[] hotelFive = new String[3];
        protected String[] hotelSix = new String[3];
        
        public Hotels(){
            //Storing values for each index for each hotel manually
            hotelOne[0]="White Courtyard Resort";
            hotelOne[1]="Paris";
            hotelOne[2]="5";

            hotelTwo[0]="Sapphire Dune";
            hotelTwo[1]="Morocco";
            hotelTwo[2]="5";

            hotelThree[0]="Rose Cottage";
            hotelThree[1]="Cork";
            hotelThree[2]="2";

            hotelFour[0]="Sunrise Lion";
            hotelFour[1]="New York";
            hotelFour[2]="4";

            hotelFive[0]="The Backyard";
            hotelFive[1]="Cork";
            hotelFive[2]="3";

            hotelSix[0]="Northern Brook Rest";
            hotelSix[1]="New York";
            hotelSix[2]="1";
        }
}
