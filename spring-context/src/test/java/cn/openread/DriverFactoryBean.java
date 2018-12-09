package cn.openread;


import org.springframework.beans.factory.FactoryBean;

import java.sql.DriverManager;


public class DriverFactoryBean implements FactoryBean {
	private String jdbcUrl;

	@Override
	public Object getObject() throws Exception {
		return DriverManager.getDriver(jdbcUrl);
	}

	@Override
	public Class<?> getObjectType() {
		return java.sql.Driver.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
}
