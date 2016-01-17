package com.sample.demo2;


import javax.annotation.Resource;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sample.demo2.models.Product;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class JDBCTest1 {
	
	
	
	@Resource(name="hibernateTemplate")
	HibernateTemplate ht;
	
	@Test
	public void test() {
		Session session =null;
				ht.getSessionFactory().openSession();
		try {
			 session = ht.getSessionFactory().openSession();
			session.beginTransaction();
			session.setFlushMode(FlushMode.COMMIT);
			Product product =new Product();
			product.setProductId(2);
			product.setProductName("产品2");
			session.save(product);
			session.getTransaction().commit();
			System.out.println("测试成功");
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		
	}

}
