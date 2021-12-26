
package com.educacionit.spring.beginning.class01.test;


import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.educacionit.spring.beginning.class01.beans.Single;


@RunWith (SpringJUnit4ClassRunner.class)
//Estoy diciendo que tome el application context y lo cargue
@ContextConfiguration(locations = { "classpath:applicationContext7.xml" })
public class SingleTest {
	
	
	public SingleTest () {
		
		super ();
	}
	
        //Dos variables privadas de tipo Single
	
	@Autowired
	Single bean1 = null;
	
	@Autowired
	Single bean2 = null;

	
    @Test
    public void test_ml_always_return_true() {

    	System.out.println (bean1.getCode());
    	System.out.println (bean2.getCode ());
    	//devuelve true debido a que SPRING  trabaja con singleton
        //inyecta el mismo bean el application context en ambos.
        //por mas que tenga 30 variables en el application context dice que
        //solo va a haber uno.
        assertTrue (bean1.getCode ().equals (bean2.getCode ()));
    }
}