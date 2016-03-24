package tourofbritain.report;

public class MonthlyReport extends Report {

	public MonthlyReport(int id) {
		super(id);
	}

	@Override
	public void getFullDetails() {
		System.out.println("Montly report for: "+this.getDate().toString());
		System.out.println("Report ID: "+this.getID());
		System.out.println("Number of journies: "+this.getJournies());
		System.out.println("Number of passengers: "+this.getPassengers());
		System.out.println("Income : £"+this.getIncome());
		
	}

}
