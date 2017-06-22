package cn.com.sky.agent.agentmain;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

public class TestAgent {
	public static void main(String[] args) throws InterruptedException, IOException, AgentLoadException, AgentInitializationException, AttachNotSupportedException {
		VirtualMachine vm = VirtualMachine.attach(args[0]);// 目标进程id
		System.out.println(vm);
		vm.loadAgent(args[1]);// agent的位置
	}
}