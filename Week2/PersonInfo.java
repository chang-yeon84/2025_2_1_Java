package Week2;

public class PersonInfo {
	public static void main(String[] args) {
		String	name = "윤창연";
		int 	age = 23;
		double	height = 170.5d;
		char	gender = 'M';
		boolean is_Student = true;
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.printf("키: %.1fcm\n",height);
		System.out.printf("성별: %s\n",gender);
		System.out.printf("학생여부: %s\n",is_Student);
	
	}
}
