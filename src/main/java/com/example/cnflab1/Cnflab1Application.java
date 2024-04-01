package com.example.cnflab1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Cnflab1Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SpringApplication.run(Cnflab1Application.class, args);
		ApplicationContext ac = new ClassPathXmlApplicationContext("NewFile.xml");
		
		Customer c = (Customer)ac.getBean("customer");
		Ticket t =(Ticket)c.getTick();
		
		while(true) {
			System.out.println("1.  Insert \n 2. Display \n 3.Exit");
			System.out.println("Enter the choice:- ");
			int a = sc.nextInt();
			switch(a){
				case 1:
					System.out.println("Enter Customer Name:- ");
					c.setName(sc.next());
					System.out.println("Enter Customer Address:- ");
					c.setAddress(sc.next());
					System.out.println("Enter ticket number:- ");
					t.setTickno(sc.nextInt());
					System.out.println("Enter ticket seat number:- ");
					t.setSeatno(sc.nextInt());
					System.out.println("Enter ticket price:- ");
					t.setPrice(sc.nextInt());
					System.out.println("Enter ticket type:-Gold/Platinum/Economic");
					t.setTicktype(sc.next());
					c.setTick(t);
					break;
				case 2:
					System.out.println("Customer Details");
					System.out.println("Name: " + c.getName()+" " + " Address" + c.getAddress());
					System.out.println("Ticket details");
					t=c.getTick();
					System.out.println("TicketNumber:- " + t.getTickno());
					System.out.println("TicketType:- "+ t.getTicktype());
					System.out.println("TicketSeatNumber:- "+t.getSeatno());
					System.out.println("TicketPrice:- "+ t.getPrice());
					break;
				case 3:
					System.exit(0);
					
			}
		}
	}

}
