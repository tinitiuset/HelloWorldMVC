/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo910.reto0mvc.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Martin Valiente and Kerman Rodriguez
 */
public class ViewFactoryTest {

    public ViewFactoryTest() {
    }

    /**
     * Test of getView method, of class ViewFactory.
     */
    @Test
    public void testGetView() {

        System.out.println("getView");

        ViewFactory instance = new ViewFactory();

        // Result variable
        Object result = null;
        // Expected result variable
        Object expResult = null;

        for (int option = 0; option <= 3; option++) {
            switch (option) {
                case 1:
                    result = instance.getView(option);
                    expResult = new ViewImplementation();
                    assertEquals(result.getClass(), expResult.getClass());
                    break;
                case 2:
                    result = instance.getView(option);
                    expResult = new SwingViewImplementation();
                    assertEquals(result.getClass(), expResult.getClass());
                    break;
                case 3:
                    result = instance.getView(option);
                    expResult = new JavaFXViewImplementation();
                    assertEquals(result.getClass(), expResult.getClass());
                    break;
                default:
                    break;
            }

        }
    }

}
