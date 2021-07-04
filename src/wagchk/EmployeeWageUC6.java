package wagchk;
public class  EmployeeWageUC6 {
     public static final int  IS_PART_TIME =1 ;
     public static final int  IS_FULL_TIME = 2;
     public static final int  Emp_Rate_Per_Hour = 20;
     public static final int  NUM_OF_WORK_DAYS = 20 ;
     public static final int  MAX_HRS_IN_MONTH = 100 ;
     public static void main(String[] args) {
         int totalemphrs = 0;
         int totalEmpwage = 0 , totalworkingdays = 0 ;
      
         while (totalemphrs <= MAX_HRS_IN_MONTH && totalworkingdays < NUM_OF_WORK_DAYS  ) {
              int emphrs = 0;
              totalworkingdays++; 
              int empcheck = (int) Math.floor(Math.random() * 10) % 3;
              switch ((int)empcheck) {
                 case IS_FULL_TIME:
                    emphrs = 8 ;
                    break;
                 case IS_PART_TIME:
                    emphrs = 4 ;
                    break;
                 default :
                    emphrs = 0 ; 
                    break;
            }      
         totalemphrs += emphrs;     
         int empwage = emphrs *  Emp_Rate_Per_Hour;
         totalEmpwage += empwage;
        
     
 
         }
         System.out.println("Total Emp wage;" + totalEmpwage);
    }
} 
 
