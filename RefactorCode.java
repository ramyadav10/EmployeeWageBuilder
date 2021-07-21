package JavaPackages;

public class RefactorCode {
	static int wagePerHr=20;
	static int hrs,hrPerDay,totalHrs=0;
	static int hrsPerMonth=100;
	static int wage;
	static int totalWage=0;
	static String status;
	static int i=1,month=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(i <= month && totalHrs<=hrsPerMonth) {
		System.out.println(i);
		CheckEmp();
		totalHrs+=hrs;
		totalWage=totalWage+wage;
		System.out.println("On Day-"+i+"> Total working hrs: "+totalHrs);
		i++;
		}
		System.out.println("Total Wage for Month: "+totalWage);
	}

	public static void CheckEmp(){
		int ranFunction= (int) Math.floor(Math.random()*3);
		if(ranFunction == 1) {
			status="FullTime";
			System.out.println(status);
			calculateWage(wagePerHr,8);
			System.out.println(wage);
		}else if(ranFunction == 2) {
			status="PartTime";
			System.out.println(status);
			calculateWage(wagePerHr,4);
			System.out.println(wage);
		}else {
			status="Absent";
			wage=0;
			System.out.println(status);
		}
	}
	
	public static int calculateWage(int wagePerHr,int hrPerDay){
			wage=wagePerHr*hrPerDay;
			hrs=hrPerDay;
			return wage;
	}
}
	