package cn.com.sky.agent.agentmain;

import java.lang.instrument.Instrumentation;

public class MyAgent {
	public static void agentmain(String args, Instrumentation inst) {
		System.out.println("MyAgent...begin...");

		Class[] classes = inst.getAllLoadedClasses();
		System.out.println("size:" + classes.length);
		for (Class cls : classes) {
			System.out.println(cls.getName());
		}

		System.out.println("MyAgent...end...");
	}
}