package cn.openread;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.DefaultResourceLoader;

import java.util.Arrays;


public class BeanFactorySimpleTest {
	public static void main(String[] args) {
		// 注册 中心
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		// 读取器
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.setResourceLoader(new DefaultResourceLoader());
		// 装载构建Bean的定义
		reader.loadBeanDefinitions("spring.xml");
		factory.getBean("hi");
		factory.getBean("driver");
//		factory.getBean("hi2");
		System.out.println(Arrays.toString(factory.getBeanDefinitionNames()));
	}
}
