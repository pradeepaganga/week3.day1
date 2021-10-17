package week3.day1;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "I am working with Java8";
		String replacedsentence = sentence.replace("8","11");
		System.out.println("New Sentence is: " + replacedsentence);
		String substring = sentence.substring(5, 14);
		System.out.println(substring);
		
		

	}
}

