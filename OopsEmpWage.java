import java.util.*;

public class OopsEmpWage
{
		//initializing variables using static so that they can use
		// any where in class or inside method
		static int TotalWage=0;
		static int WagePerHr=20;
		static int Full_time=8;

		public static int attendance()
		{
		Random emp = new Random();
		int attend=emp.nextInt(2);
		return attend;
		}

		//method to check whether employee is present or not
		public void EmpCheck()
		{
			int check=attendance();
			if(check==0)
			{
				System.out.println("Employee is Present");
				TotalWage+=Full_time*WagePerHr;
				System.out.println("Total Wage is "+TotalWage);
			}
			else
			{
				System.out.println("Employee is Absent");
			}
		}

		public static void main(String args[])
		{
			OopsEmpWage emp1=new OopsEmpWage();
			emp1.EmpCheck();//calling EmpCheck emthod using object
		}

}


