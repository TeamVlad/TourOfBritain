package tourofbritain.report;

import java.util.Date;
import java.util.Random;

public abstract class Report {

	private int id;
	private Date date;
	private int passengers;
	private int journies;
	private double income;
	public Report(int id) {
		this.id = id;
		this.date = new Date();
		Random r = new Random();
		this.passengers = r.nextInt(10000);
		this.journies = r.nextInt(100);
		this.income = r.nextDouble()*10000;
		date.setTime(r.nextLong());//give it a random date for testing..
	}

	public int getID(){
		return this.id;
	}
	
	public int getPassengers(){
		return this.passengers;
	}
	public int getJournies(){
		return this.journies;
	}
	
	public double getIncome(){
		return this.income;
	}
	
	public Date getDate(){
		return this.date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	public void setPassengers(int p){
		this.passengers = p;
	}
	
	public void setJournies(int j){
		this.journies = j;
	}
	
	public void setIncome(double i){
		this.income = i;
	}
	
	public void saveReport(){
		//database action
	}
	
	public void loadReport(){
		
	}
	public abstract void getFullDetails();
		
	
}
