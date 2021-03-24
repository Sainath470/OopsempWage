import java.util.*;

public class OopsEmpWage
{

		public static int attendance()
		{
				Random emp = new Random();
				int attend=emp.nextInt(2);
				return attend;
		}


		public static void EmpCheck()
		{
			int check=attendance();
			if(check==0)
			{
				System.out.println("Employee is Present");
			}
			else
			{
				System.out.println("EMployee is Absent");
			}
		}


		public static void main(String args[])
		{
			EmpCheck();
		}
}
