package wagchk;
public class  EmployeeWageUC5 {
     public static final int  IS_PART_TIME =1 ;
     public static final int  IS_FULL_TIME = 2;
     public static final int  Emp_Rate_Per_Hour = 20;
     public static final int  NUM_OF_WORK_DAYS = 20 ;
     public static void main(String[] args) {
         
         int emphrs = 0;
         int empwage = 0; 
         int totalEmpwage = 0 ;
      
         for (int day=0; day < NUM_OF_WORK_DAYS; day++) {
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
              
         empwage = emphrs *  Emp_Rate_Per_Hour;
         totalEmpwage += empwage;
         System.out.println("Emp wage;" + empwage);
 
         }
         System.out.println("Total Emp wage;" + totalEmpwage);
    }
} 
 
