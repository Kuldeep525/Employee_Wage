package wagchk;
public class  EmployeeWageUC2 {
    
     public static void main(String[] args) {
        
         int  IS_FULL_TIME = 1;
         int  Emp_Rate_Per_Hour = 20;
         int emphrs = 0;
         int empwage = 0; 
         double empcheck = Math.floor(Math.random() * 10) % 3;
         if (empcheck == IS_FULL_TIME){
              emphrs = 8 ;
            }
         else{
              emphrs = 0 ;
            }
              
         empwage = emphrs *  Emp_Rate_Per_Hour;
         System.out.println("Emp wage;" + empwage); 
    }
} 
 
