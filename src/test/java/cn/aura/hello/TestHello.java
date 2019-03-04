package cn.aura.hello;

import org.junit.Test;

public class TestHello {

	@Test
	public void test(){
		HelloWorld hw = new HelloWorld();
		System.out.println(hw.sayHi("zs"));
				
	}
}
