/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo910.reto0mvc.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kerman Rodríguez y Martín Valiente
 */
public class ModelFactoryTest {

    public ModelFactoryTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getModel method, of class ModelFactory.
     */
    @Test
    public void testGetModel() {

        System.out.println("getModel");

        ModelFactory instance = new ModelFactory();

        // Result variable
        Object result = null;
        // Expected result variable
        Object expResult = null;

        for (int option = 0; option <= 3; option++) {
            switch (option) {
                case 1:
                    result = instance.getModel(option);
                    expResult = new ModelImplementation();
                    assertEquals(result.getClass(), expResult.getClass());
                    break;
                case 2:
                    result = instance.getModel(option);
                    expResult = new DaoModelImplementation();
                    assertEquals(result.getClass(), expResult.getClass());
                    break;
                default:
                    break;
            }

        }
    }

}
