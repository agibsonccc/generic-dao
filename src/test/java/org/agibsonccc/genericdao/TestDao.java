package org.agibsonccc.genericdao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("testDao")
@Transactional
public class TestDao extends GenericManager<TestModel>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4743659511517204331L;

	public TestDao() {
		super(TestModel.class);
	}




}
