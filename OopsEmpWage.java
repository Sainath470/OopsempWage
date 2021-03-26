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


		public static void EmployeeWageCal()
		{
			System.out.println("Total Wage for 20 days is "+WorkingHrs*WagePerHr);

		}

		//method to check whether employee is present or not and calculate working hrs
		public void EmpCheck()
		{
			int WorkingDays=1;

			while((WorkingDays<=TotalWorkingDays)&&(WorkingHrs<100))
			{
								int check=attendance();

					switch(check)
					{
						case 0:
								System.out.println("Employee is Absent on " +WorkingDays+" Day");
								break;

						case 1:
								WorkingHrs+=Part_Time;
								break;

						default:
								WorkingHrs+=Full_Time;
								break;
					}
					WorkingDays++;
			}
			EmployeeWageCal();
		}


		public static void main(String args[])
		{
			OopsEmpWage emp1=new OopsEmpWage();
			emp1.EmpCheck();//calling EmpCheck emthod using object.
		}

}


