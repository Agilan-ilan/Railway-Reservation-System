import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Coach.*;
import Interfaces.ICoach;
import Passenger.*;
import Station.*;
public class ZohoRailwayReservationSystem {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		
		/////////////////////////////////////////////////////
		//////Train Inputs Starts here
	
		Station station=new Station("SID-100","CHENNAI");
		
		ArrayList<ICoach> createcoaches1=new ArrayList<>();
		createcoaches1.add(new SleeperCoach("C1",8,1,8,4,false));
		createcoaches1.add(new ThreeAC("C2",8,1,8,4,true));
		createcoaches1.add(new TwoAC("C3",6,1,6,3,true));
		
		ArrayList<ICoach> createcoaches2=new ArrayList<>();
		createcoaches2.add(new SleeperCoach("C1",8,1,8,4,false));
		createcoaches2.add(new ThreeAC("C2",8,1,8,4,true));
		createcoaches2.add(new TwoAC("C3",6,1,6,3,true));
		createcoaches2.add(new OneAC("C4",4,1,4,2,true));
		
		
		ArrayList<TrainSchedule> trainSchedule=new ArrayList<>();
		ArrayList<Schedule> timeSchedules1=new ArrayList<>();
		ArrayList<Schedule> timeSchedules2=new ArrayList<>();
		
		Train createtrain1 =new Train("TID-100","RAJDHANI EXPRESS","CHENNAI-EGMORE","DINDUGAL JUNCTIOIN",createcoaches1);
		
		timeSchedules1.add(new Schedule("Chennai Egmore (MS)",null,"20:55","0","0km"));
		timeSchedules1.add(new Schedule("Tambaram (TBM))","21:18","21:20","2mins","25km"));
		timeSchedules1.add(new Schedule("Chengalpattu (CGL)","21:48","21:50","2mins","56km"));
		timeSchedules1.add(new Schedule("Villuparam Junction (VM)","	23:25","23:30","5mins","159km"));
		timeSchedules1.add(new Schedule("Vridhachalam Junction (VRI)","00:10","00:12","2mins","213km"));
		timeSchedules1.add(new Schedule("Tiruchchirapali (TPJ)","02:35","02:40","5mins","336km"));
		timeSchedules1.add(new Schedule("Dindigul Junction (DG)","04:08",null,"0","431km"));

		
		Train createtrain2=new Train("TID-101","DURANTO EXPRESS","MADURAI JUNCTION","SANKARAN KOVIL",createcoaches2);	
		
		timeSchedules2.add(new Schedule("Madurai Junction (MDU)",null,"05:30","10mins","0km"));
		timeSchedules2.add(new Schedule("Virudunagar Junction (VPT)","06:15","06:17","2mins","20km"));
		timeSchedules2.add(new Schedule("Tiruttangal (TTL)","06:34","06:38","4mins","36km"));
		timeSchedules2.add(new Schedule("Sivakasi (SVKS)","06:40","06:45","5mins","59km"));
		timeSchedules2.add(new Schedule("Srivilliputtur (SVPR)","06:56","06:42","2mins","113km"));
		timeSchedules2.add(new Schedule("Rajapalayam (RJPM)","06:56","06:57","1min","206km"));
		timeSchedules2.add(new Schedule("Dindigul Junction (DG)","07:07",null,"0","231km"));
		

		trainSchedule.add(new TrainSchedule(createtrain1,timeSchedules1));
		trainSchedule.add(new TrainSchedule(createtrain2,timeSchedules2));
		StationTrain stationTrain=new StationTrain(station,trainSchedule);
		
		////////Train Inputs Ends here
		//////////////////////////////////////////////////
		///Passenger Input Starts here
		
		Address address1=new Address(21,"Sinnnasamy Street","Thavalakuppam","605007","Puducherry","Puducherry");
		Account account1 =new Account("ID-101","Fred","Parks","Parks"+"@zohomail.com",952459944,"male",23,"Fred9944",address1);
		
		Address address2=new Address(36,"RR Street","Arriyankuppam","605004","Puducherry","Puducherry");
		Account account2 =new Account("ID-102","Jamie","Pages","Jamie"+"@zohomail.com",954559441,"female",21,"Jamie9441",address2);
		
		Address address3=new Address(22,"Nalai Street","Rediyarpalyam","605005","Madudkarai","TamilNadu");
		Account account3 =new Account("ID-103","Naomi","Whitehead","Whitehead"+"@zohomail.com",852423434,"female",25,"Naomi3434",address3);
		
		Address address4=new Address(13,"Jumpcut Street","Murungapakkam","605004","Puducherry","Puducherry");
		Account account4 =new Account("ID-104","Windsor","Griffith","Windsor"+"@zohomail.com",792456544,"male",20,"Windsor6544",address4);
		
		
		ArrayList<AccessSpecifier> accessSpecifiers=new ArrayList<AccessSpecifier>();
		accessSpecifiers.add(new AccessSpecifier(account1,"admin"));
		accessSpecifiers.add(new AccessSpecifier(account2,"user"));
		accessSpecifiers.add(new AccessSpecifier(account3,"user"));
		accessSpecifiers.add(new AccessSpecifier(account4,"user"));
		
		
		///Passenger Input Ends here
		//////////////////////////////////////////////////
		////Ticket Input Starts here
		
		ArrayList<ICoach> tcoaches1=new ArrayList<>();
		tcoaches1.add(new SleeperCoach("C1",4,2,5,0,false));
		Train train1=new Train("TID-101","DURANTO EXPRESS","Madurai Junction (MDU)","Tiruttangal (TTL)",tcoaches1);
		Ticket ticket1 =new Ticket("PNR-101",train1,"Issued","27-07-2022","11:00");
		
		ArrayList<ICoach> tcoaches2=new ArrayList<>();
		tcoaches2.add(new OneAC("C4",3,1,3,0,false));
		Train train2=new Train("TID-100","RAJDHANI EXPRESS","Tambaram (TBM))","Rajapalayam (RJPM)",tcoaches2);
		Ticket ticket2 =new Ticket("PNR-102",train2,"Issued","28-07-2022","10:00");
		
		ArrayList<ICoach> tcoaches3=new ArrayList<>();
		tcoaches3.add(new OneAC("C1",2,2,3,0,false));
		Train train3=new Train("TID-100","DURANTO EXPRESS","Chennai Egmore (MS)","Dindigul Junction (DG)",tcoaches2);
		Ticket ticket3 =new Ticket("PNR-102",train2,null,"28-07-2022","10:00");
		
		ArrayList<TrainTicket> trainTickets1=new ArrayList<>();
		trainTickets1.add(new TrainTicket(ticket1,stationTrain));
		trainTickets1.add(new TrainTicket(ticket2,stationTrain));
		
		ArrayList<TrainTicket> trainTickets2=new ArrayList<>();
		trainTickets2.add(new TrainTicket(ticket3,stationTrain));
		
		ArrayList<PassengerBooking> passengerBookings1=new ArrayList<PassengerBooking>();
		passengerBookings1.add(new PassengerBooking("PB-101",trainTickets1,"26-07-2022"));

		
		ArrayList<PassengerBooking> passengerBookings2=new ArrayList<PassengerBooking>();
		passengerBookings2.add(new PassengerBooking("PB-102",trainTickets2,"27-07-2022"));
		
		////Ticket Input Ends here
		///////////////////////////////////////////
		
		
		ArrayList<PassengerAccount> passengers=new ArrayList();
		passengers.add(new PassengerAccount(account2,passengerBookings1));
		passengers.add(new PassengerAccount(account4,passengerBookings2));
		
		AccessSpecifierList accessSpecifierslist=new AccessSpecifierList(accessSpecifiers,passengers);
	
		
		
		
		System.out.println("************************************************************");
		System.out.println("*********Welcome to Zoho Railway Reservation System*********");
		System.out.println("************************************************************");
		
		System.out.println("Enter your Credentials for Loging in....");
		System.out.println("Enter your Username ID :");
		String userId=scan.next();
		System.out.println("Enter the corresponding Password :");
		String password=scan.next();
		String accessType="";
		
		//Iterator to loop through the List of accessSpecifiers for finding out the AccessType of the current given
		//if the user id matches with existing password saved in the object collection(temporary database)
		Account account = null;
		Iterator<AccessSpecifier> it1 = accessSpecifierslist.getAccessSpecifier().iterator();
		
		while(it1.hasNext()) {
			AccessSpecifier i = it1.next();
		
		      if(i.getAccount().getId().equals(userId)) {
		    	  if(i.getAccount().getPassword().equals(password)) {
		    		  System.out.println("Welcome "+i.getAccount().getFirstName());
		    		  accessType=i.getAccessType();
		    		   account=i.getAccount();
		    		  //Saving the Access type and Account of the user
		    		  break;
		    	  }
		        
		      }
		    }
		PassengerAccount passenger=null;
		Iterator<PassengerAccount> it2 = accessSpecifierslist.getPassenger().iterator();
		
		while(it2.hasNext()) {
			PassengerAccount i = it2.next();
		
		      if(i.getAccount().getId().equals(account.getId())) {
		    	 
		    		  passenger=i;
		    		  //Saving the Passenger Instance
		    		  break;
		        
		      }
		    }
		
		switch(accessType) {
		
		case "user":
				new Passenger(passenger);
			break;
			
		case "admin":
			
			break;
			
		default:
			
			
		}
		
		
		
		
		
	}
}
