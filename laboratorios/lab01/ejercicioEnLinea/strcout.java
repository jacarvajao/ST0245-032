package lab1;

public class strcout {
	public static int strCount(String str, String sub) {
		if(str.indexOf(sub)==-1) return 0;
		if(str.indexOf(sub)!=-1)
		{
		return 1 + strCount(str.substring(str.indexOf(sub)+sub.length()), sub);
		}
		return 0;
		}
}
