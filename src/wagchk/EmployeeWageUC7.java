package wagchk;
					
public class EmployeeWageUC7 {
	public static final int  IS_PART_TIME =1 ;
	public static final int  IS_FULL_TIME = 2;
	public static final int  Emp_Rate_Per_Hour = 20;
	public static final int  NUM_OF_WORK_DAYS = 20 ;
	public static final int  MAX_HRS_IN_MONTH = 100 ;
					    
	public static int empWageComputation( ) {
		int totalEmpHrs = 0 ,  EmpHrs = 0 ,  totalWorkingDays = 0 ;
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORK_DAYS  ) {
				
			totalWorkingDays++; 
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
			case IS_FULL_TIME:
				EmpHrs = 8 ;
				break;
			case IS_PART_TIME:
				EmpHrs = 4 ;
				break;	
			default :
				EmpHrs = 0 ; 
				break;
			}      
			totalEmpHrs += EmpHrs;     
			System.out.println("Day :" + totalWorkingDays + " EmpHr: " +EmpHrs);
		}
		int totalEmpWage = totalEmpHrs *  Emp_Rate_Per_Hour;
		System.out.println("Total Emp wage;" + totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String [] args) {
		empWageComputation();
	}
}
    	
    	
    
   
 
    

