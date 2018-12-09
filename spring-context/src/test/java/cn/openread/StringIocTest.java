package cn.openread;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StringIocTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("spring.xml");
		A a = context.getBean(A.class);
		B b = context.getBean(B.class);
		a.setB(b);
		b.setA(a);
		System.out.println(a);
		System.out.println(b);
//		Object driver = context.getBean(StringIocTest.class);
//		System.out.println(driver);
	}

}
