import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Emma", "JN203613B", 50000);
    }

    @Test
    public void hasName(){
        assertEquals("Emma", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JN203613B", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(500, developer.payBonus(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(10);
        assertEquals(55000, developer.getSalary(), 0.01);
    }
}
