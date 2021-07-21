package com.practice;

public class SavingWageEachCompany {

		public static final int presentFullTime = 2;
	    public static final int presentPartTime = 1;
	    public static final int fullTime = 8;
	    public static final int partTime = 4;

	    private String company;
	    private int perHoursWage;
	    private int maxWorkDays;
	    private int maxWorkHours;
	    private int salary;

	    public SavingWageEachCompany(String company, int perHoursWage, int maxWorkDays, int maxWorkHours) {
	        this.company = company;
	        this.perHoursWage = perHoursWage;
	        this.maxWorkDays = maxWorkDays;
	        this.maxWorkHours = maxWorkHours;
	    }

	    public void calulateSalary() {
	        int work_hours = 0, work_days = 0;
	        double salary = 0;
	        while (work_hours < maxWorkHours && work_days < maxWorkDays) {
	            work_days++;
	            double empcheck = Math.floor(Math.random() * 10) % 3;
	            int check = (int) empcheck;
	            switch (check) {
	                case presentFullTime:
	                    work_hours += fullTime;
	                    break;
	                case presentPartTime:
	                    work_hours += partTime;
	                    break;
	                default:
	                    work_hours += 0;
	            }
	            System.out.println("Day" + work_days + " Total working hrs " + work_hours);
	        }
	        this.salary = work_hours * perHoursWage;
	    }

	    
	    public String toString() {
	        return "Total salary for company " + company + " is : " + this.salary;
	    }

	    public static void main(String[] args) {
	    	SavingWageEachCompany com1 = new SavingWageEachCompany("Samsung", 20, 25, 100);
	    	SavingWageEachCompany com2 = new SavingWageEachCompany("Apple", 25, 25, 100);
	        com1.calulateSalary();
	        System.out.println(com1);
	        com2.calulateSalary();
	        System.out.println(com2);
	    }
	}