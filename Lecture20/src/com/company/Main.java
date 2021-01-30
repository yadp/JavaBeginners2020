package com.company;


public class Main {

    public static void main(String[] args) {
		/*ConcertOfMetallica omv= new ConcertOfMetallica("OMV");

		ConcertOfMetallica orange = new ConcertOfMetallica("Orange");

		System.out.println("Is sell successful "+ omv.sellTicket(5));

		System.out.println("Is sell successful "+ orange.sellTicket(10));

		System.out.println(ConcertOfMetallica.getTicketsSold());

		System.out.println("Is sell successful "+ omv.sellTicket(1000));

		System.out.println(ConcertOfMetallica.getTicketsSold());*/



		Teacher ted = new Teacher("Ted");
		Group group1= new Group(10,ted);

		group1.getTeacher().getName();

	/*Group group1= new Group(5);
	group1.addStudents(3);
	System.out.println(group1.getNumberOfStudent());
	group1.addStudents(3);
	Group group2 = new Group(10);


	Group.getStudentInSchool();

	System.out.println();



	System.out.println(group1.getNumberOfStudent());
	System.out.println(group2.getNumberOfStudent());
	System.out.println("School: "+ Group.getStudentInSchool());*/



    }
}
