package lab1;

public class cbr1Countx {
	public static int countX(String str) {
		int i = str.indexOf("x");//c1 
		if (i != -1) { //c2
		return 1 + countX(str.substring(i + 1)); //c1+T(n+1)--->O(n)
		}
		else
		return 0;
		}
}
