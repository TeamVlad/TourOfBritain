package tourofbritain;

import tourofbritain.report.ReportController;

public class Main {

	public static void main(String[] args) {
		ReportController controller = new ReportController(); 
		controller.createReport("month", 1);
		controller.createReport("month", 2);
		controller.createReport("month", 3);
		controller.createReport("month", 4);
		
		controller.createReport("month", 5);
		controller.createReport("month", 1);
		controller.createReport("month", 1);
		controller.createReport("month", 1);
		controller.createReport("month", 1);
		
		controller.createReport("month", 1);
		controller.createReport("month", 1);
		controller.viewAllReports();
	}

}
