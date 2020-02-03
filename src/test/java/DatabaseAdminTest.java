import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Quentin", "123ABC", 40000);
    }

    @Test
    public void hasName(){
        assertEquals("Quentin", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("123ABC", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10);
        assertEquals(44000, databaseAdmin.getSalary(), 0.01);
    }

}
