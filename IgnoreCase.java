package week3.day1;

public class IgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="I am Learning Java";
		String s2="I am learning java?";
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Print equal");
		}
		
		if(s1==s2)
		{
			System.out.println("Print equal");
		}
		if(s1.equals(s2))
		{
			System.out.println("Print equal");
		}

	}

}
