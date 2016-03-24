package tourofbritain.report;

public class ReportFactory {

	public static Report createReport(String type, int id){
		
		if(type==null)return null;
		
		switch(type){
			case "week":
				return new WeeklyReport(id);
			case "month":
				return new MonthlyReport(id);	
		}
		System.out.println("No valid report to be made.");
		return null;
	}
}
