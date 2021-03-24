import java.util.*;

public class OopsEmpWage
{
		//initializing variables using static so that they can use
		// any where in class or inside method
		static int TotalWage=0;
		static int WagePerHr=20;
		static int Full_Time=8;
		static int Part_Time=4;

		public static int attendance()
		{
		Random emp = new Random();
		int attend=emp.nextInt(3);
		return attend;
		}

		//method to check whether employee is present or not
		public void EmpCheck()
		{
			int check=attendance();
			switch(check)
			{
				case 0:
					System.out.println("Employee is Present");
					TotalWage+=Full_Time*WagePerHr;
					System.out.println("Total Wage for full time work is "+TotalWage);
					break;

				case 1:
					System.out.println("Employee is present and done part time work");
					TotalWage+=Part_Time*WagePerHr;
					System.out.println("Total Wage for part time work is "+TotalWage);
					break;

				case 2:
					System.out.println("Employee is Absent");
					break;

				default:
					System.out.println("Invalid");
					break;
			}

		}

		public static void main(String args[])
		{
			OopsEmpWage emp1=new OopsEmpWage();
			emp1.EmpCheck();//calling EmpCheck emthod using object
		}

}


