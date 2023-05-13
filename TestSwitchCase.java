public class TestSwitchCase {
	public static void main(String[] args) {
		char grade = 'G';
		
		switch(grade)
		{
		case 'A' :
			System.out.println("A++");
			break;
		case 'B' :
			System.out.println("A+");
			break;
		case 'C' :
			System.out.println("A");
			break;
			default:
				System.out.println("未知等级");
		}
		System.out.println("等级是" + grade);
	}
}