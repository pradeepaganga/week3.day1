package week3.day1;

public class Students {
	
	private void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		
		System.out.println("Id of the Student is: "+id);

	}
	private void getStudentInfo(int id,String name) {
		// TODO Auto-generated method stub
		System.out.println("Id of the Student is: "+id);
		System.out.println("Name of the Student is: "+name);

	}
	
	private void getStudentInfo(String email,long phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("email of the Student is: "+email);
		System.out.println("Phone of the Student is: "+phoneNumber);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students st=new Students();
		st.getStudentInfo(101);
		st.getStudentInfo(102,"Arthi");
		st.getStudentInfo("pradee@gmail.com",956604512);

	}

}
