package test;


import static org.junit.Assert.fail;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@org.springframework.test.context.ContextConfiguration("classpath:spring/applicationContext.xml")
public class Test {

	@org.junit.Test
	public void test() {
		fail("Not yet implemented");
	}

}
