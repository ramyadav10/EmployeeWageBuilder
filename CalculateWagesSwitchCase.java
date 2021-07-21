package JavaPackages;

public class CalculateWagesSwitchCase {
	static int wagePerHr=20;
	static int hrPerDay=8;
	static int wage;
	static String status;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String status=CheckEmp();
		System.out.println(status);
		System.out.println(wage);
	}

	public static String CheckEmp(){
		int ranFunction= (int) Math.floor(Math.random()*3);
		if(ranFunction == 1) {
			status="FullTime";
			calculateWage(wagePerHr,hrPerDay);
		}else if(ranFunction == 2) {
			status="PartTime";
			calculateWage(wagePerHr,hrPerDay);
		}else {status="Absent";}
			
		return status;
	}
	public static void calculateWage(int wagePerHr,int hrPerDay){
		switch(status) {
		case "FullTime":
			wage=wagePerHr*hrPerDay;
			
			break;
		case "PartTime":
			wage=wagePerHr*(hrPerDay/2);
			
			break;
		case "Absent":
			wage=0;
			break;
		default:
		}
	}
}
	