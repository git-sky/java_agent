package cn.com.sky.agent.premain;

/**
 * <pre>
 * 
 * java -javaagent:E:\myagent.jar=Hello1 -javaagent:E:\myagent.jar=Hello2 -javaagent:E:\myagent.jar=Hello3 -jar myapp.jar
 */
public class MyProgram {

	public static void main(String[] args) {
		System.out.println("..............main..........");
	}

}
