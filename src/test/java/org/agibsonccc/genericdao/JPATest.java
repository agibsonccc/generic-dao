package org.agibsonccc.genericdao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/org/agibsonccc/genericdao/appconfig-hibernate.xml"})
@Transactional
@TransactionConfiguration(defaultRollback=false)
public class JPATest {
	@Autowired
	private TestDao testDao;
	@Test
	public void testSaving() {
		TestModel test1 = new TestModel();
		test1.setValue("test");
		Assert.isTrue(testDao.saveE(test1),"Saving element failed");
		List<TestModel> models=testDao.allElements();
		Assert.notEmpty(models,"Model lookup failed");
	}
	
}
