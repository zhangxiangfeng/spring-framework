package cn.openread;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;


public class LubanString implements BeanFactoryAware {
	private BeanFactory beanFactory;

	public void sayhello() {
		beanFactory.getBean(Hi.class);
	}


	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
}
