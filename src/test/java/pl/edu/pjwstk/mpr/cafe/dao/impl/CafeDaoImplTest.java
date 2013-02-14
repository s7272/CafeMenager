package pl.edu.pjwstk.mpr.cafe.dao.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.edu.pjwstk.mpr.cafe.bo.CafeBo;
import pl.edu.pjwstk.mpr.cafe.model.Cafe;

public class CafeDaoImplTest {
	ApplicationContext appContext = new ClassPathXmlApplicationContext(
			"spring/config/BeanLocations.xml");
	CafeBo cafeBo = (CafeBo) appContext.getBean("cafeBo");

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public final void testSave() {
		Cafe cafe = new Cafe();
		cafe.setCafeName("Delicje");
		cafe.setCafeAddress("10 Lutego 11/11, 81-229 Gdynia");
		cafe.setCafePhone("58 620 22 22");

		cafeBo.save(cafe);

		Cafe cafe2 = cafeBo.findByCafeName("Delicje");
		assertSame("Cafe", cafe, cafe2);
		assertNotNull("Name", cafe2.getCafeName());
		assertEquals("Name", "Delicje", cafe2.getCafeName());
		assertNotNull("Address", cafe2.getCafeAddress());
		assertEquals("Address", "10 Lutego 11/11, 81-229 Gdynia",
				cafe2.getCafeAddress());
		assertNotNull("Phone", cafe2.getCafePhone());
		assertEquals("Phone", "58 620 22 22", cafe2.getCafePhone());
	}

	@Test
	public final void testUpdate() {
		Cafe cafe2;
		fail("not yet");
	}

	@Test
	public final void testDelete() {
		fail("not yet");
	}

	@Test
	public final void testFindByCafeName() {
		fail("not yet");
	}

	@Test
	public final void testListAllCafes() {
		fail("not yet");
	}
}
