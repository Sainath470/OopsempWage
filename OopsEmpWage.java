import java.util.*;

public class OopsEmpWage
{
		//initializing variables using static so that they can use
		// any where in class or inside method
		static int WorkingHrs=0;
		static int WagePerHr=20;
		static int Full_Time=8;
		static int Part_Time=4;
		static int TotalWorkingDays=20;

		public static int attendance()
		{
		Random emp = new Random();
		int attend=emp.nextInt(3);
		return attend;
		}

		//method to check whether employee is present or not
		public void EmpCheck()
		{
			int WorkingDay=0;
			int check=attendance();
			while(WorkingDay<=TotalWorkingDays)
			{
				WorkingDay++;
				switch(check)
				{
					case 0:
							WorkingHrs+=Full_Time;
							break;

					case 1:
							WorkingHrs+=Part_Time;
							break;

					case 2:
							break;

					default:
							System.out.println("Invalid");
							break;
				}
			}
			System.out.println("Total Wage is "+WorkingHrs*WagePerHr);

		}

		public static void main(String args[])
		{
			OopsEmpWage emp1=new OopsEmpWage();
			emp1.EmpCheck();//calling EmpCheck emthod using object.
		}

}


