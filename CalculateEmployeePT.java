package JavaPackages;

public class CalculateEmployeePT {
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
				wage=calculateWage(wagePerHr,hrPerDay);
			}else if(ranFunction == 2) {
				status="PartTime";
				wage=calculateWage(wagePerHr,hrPerDay);
			}else {status="Absent";}
				
			return status;
		}
		public static int calculateWage(int wagePerHr,int hrPerDay){
			if(status == "FullTime") {
				wage=wagePerHr*hrPerDay;
			}else if (status == "PartTime") {
				wage=wagePerHr*(hrPerDay/2);
			}else if(status=="Absent") {wage=0;};
			return wage;
		}
	}
