
public class TestArg {
	static String[] strs = new String[2];
	
	public static void main(String[] args) {
		
		strs [0] = "AA";
		strs [1] = "BB";
		testArgs("test", strs [0],strs [1], "H","D");
		
	}
	public static void testArgs(String test, Object ...args) {
		for (Object str : args) {
			System.out.println(str);
		}
	}
}
