package wagchk;

public class EmployeeWageUC8 {
    public static final int  IS_PART_TIME =1 ;
    public static final int  IS_FULL_TIME = 2;

    
    public static int empWageComputation( String company , int empRatePerHour,int numOfWorkingDays,int maxhoursPerMonth) {
    	int totalEmpHrs = 0 ,  EmpHrs = 0 ,  totalWorkingDays = 0 ;
    	while (totalEmpHrs <= maxhoursPerMonth && totalWorkingDays < numOfWorkingDays  ) {
           
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
       int totalEmpWage = totalEmpHrs *  empRatePerHour;
       System.out.println("Total Emp wage for company :" +company+" is: " + totalEmpWage);
       return totalEmpWage;
    }
    public static void main(String [] args) {
    	empWageComputation("Relaince" ,20 ,2 ,10);
    	empWageComputation("vmart" ,10 ,4 ,20);
    }
}
    	
