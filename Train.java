//static variables

class Train{
	
	static int totalTrain=24;
	static char trainSeries='B';
	static byte ticketNumber=116;
	static short seatNumber=5647;
	static long customerNumber=8431331159l;
	static float ticketPrice=78.76527f;
	static double gstOfTicket=2.6662762676d;
	static boolean trainAvraived=true;
	static String trainName="Wadeyaar Express";
	
public static void main(String []args){
	System.out.println("the total number of train is==="+totalTrain);
	System.out.println("the train series is==="+trainSeries);
	System.out.println("the ticket number is==="+ticketNumber);
	System.out.println("the seat number is===="+seatNumber);
	System.out.println("the customer number is===="+customerNumber);
	System.out.println("the price of ticket is===="+ticketPrice);
	System.out.println("gst of the ticket is===="+gstOfTicket);
	System.out.println("does train araived===="+trainAvraived);
	System.out.println("the name of train is===="+trainName);
   }
}