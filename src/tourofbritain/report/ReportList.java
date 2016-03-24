package tourofbritain.report;

import java.util.ArrayList;

public class ReportList {

	private ArrayList<Report> reports = new ArrayList<Report>();
	
	
	public void addReport(Report report){
		this.reports.add(report);
	}
	public Report getReport(int id){
		for(int i = 0; i < this.reports.size();i++){
			if(this.reports.get(i).getID() == id)
				return this.reports.get(i);
		}
		return null;
	}
	
	public ArrayList<Report> getReports(){
		return this.reports;
	}
	public void viewReport(int id){
		this.getReport(id).getFullDetails();
	}
}
