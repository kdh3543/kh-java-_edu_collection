public class Exam_02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		boolean result;
		int result2;
		result2 = x + y;
		System.out.println(x + " + " + y + " = " + result2); // 30
		x = y = 2;
		System.out.println("x = " + x++ + ", y = " + ++y);  // 2, 3
		System.out.println("x = " + x + ", y = " + y); // 3, 3
		y = 10;
		result = ! (((x>y) || (y==x)) || ((x!=y) && (x<y)) ); 
		System.out.println(result); //false
	}
}