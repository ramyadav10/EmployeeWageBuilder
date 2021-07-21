package JavaPackages;

public class EmployeeWage {
	
	private String companyName;
	private int wagePerHr;
	private int daysPerMonth;
	private int fullTime;
	private int partTime;
	public static int wagePerDay,i,j;
	public static int totalWageForSamsung=0,totalWageForApple=0;
	
	public EmployeeWage(String company,int days,int earning,int full,int half) {
		this.companyName=company;
		this.daysPerMonth=days;
		this.wagePerHr=earning;
		this.fullTime=full;
		this.partTime=half;
	}
	public static int calculateWage(EmployeeWage obj) {
		int status=(int) Math.floor(Math.random()*3);
		if (status==1) {
			wagePerDay=obj.wagePerHr*obj.fullTime;
		}else if(status==2) {
			wagePerDay=obj.wagePerHr*obj.partTime;
		}else {
			wagePerDay=0;
		}
	return wagePerDay;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeWage emp1=new EmployeeWage("Samsung",5,20,8,4);
		EmployeeWage emp2=new EmployeeWage("Apple",6,35,9,5);
		
		  while(i < emp1.daysPerMonth){
			  int wage1=calculateWage(emp1);
			  System.out.println("For "+emp1.companyName+" wage per day:"+wage1);
			  totalWageForSamsung+=wage1;
			  i++;
		  } 
		  while(j < emp2.daysPerMonth){
			  int wage2=calculateWage(emp2);
			  System.out.println("For "+emp2.companyName+" wage per day:"+wage2);
			  totalWageForApple+=wage2; 
			  j++;
		  }
		  System.out.println(totalWageForSamsung);
		  System.out.println(totalWageForApple);
	}

}
