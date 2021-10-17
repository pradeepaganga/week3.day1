package week3.day1;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="Java Excercise";
		char[] charArray = text.toCharArray();
		int length=charArray.length;
		for(int i=0;i<length;i++)
		{
						
			if(charArray[i]=='E')
			{
				int position;
				position=text.indexOf(charArray[i]);
				System.out.println(position);
			}
			else if(charArray[i]=='s')
			{
				int position;
				position=text.indexOf(charArray[i]);
				
				System.out.println(position);
				
			}
		
		}

	}

}
