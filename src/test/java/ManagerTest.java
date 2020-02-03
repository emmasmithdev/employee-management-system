import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jim", "SP204516D", 40250, "sales");
    }

    @Test
    public void hasName(){
        assertEquals("Jim", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("SP204516D", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40250, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDept(){
        assertEquals("sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5);
        assertEquals(42262.5, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(402.5, manager.payBonus(), 0.01);
    }
}
