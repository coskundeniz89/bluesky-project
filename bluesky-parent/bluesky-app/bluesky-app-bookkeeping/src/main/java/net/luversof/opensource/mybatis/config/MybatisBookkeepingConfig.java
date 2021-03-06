package net.luversof.opensource.mybatis.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(basePackages = "net.luversof.bookkeeping.mapper", sqlSessionFactoryRef = "bookkeepingSqlSessionFactory")
public class MybatisBookkeepingConfig extends MybatisConfig {
	@Bean
	public SqlSessionFactory bookkeepingSqlSessionFactory(@Qualifier("bookkeepingDataSource") DataSource bookkeepingDataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = getSqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(bookkeepingDataSource);
		sqlSessionFactoryBean.afterPropertiesSet();
		return sqlSessionFactoryBean.getObject();
	}
}
