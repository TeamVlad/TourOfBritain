package tourofbritain.report;

public class ReportController {

	private ReportList reportList;
	public ReportController(){
		this.reportList = new ReportList();
	}
	
	public void createReport(String type,int id){
		this.reportList.addReport(ReportFactory.createReport(type, id));
	}
	
	public void viewReport(int id){
		this.reportList.getReport(id).getFullDetails();
	}
	public void viewAllReports(){
		for(Report r : this.reportList.getReports()){
			r.getFullDetails();
		}
	}
	public void deleteReport(){
		
	}
	
	public void editReport(){
		
	}
}
