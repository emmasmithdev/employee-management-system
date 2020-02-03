import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Ian", "123ABC", 100000, "finance", 500000);
    }

    @Test
    public void hasName(){
        assertEquals("Ian", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("123ABC", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDept(){
        assertEquals("finance", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(500000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10);
        assertEquals(110000, director.getSalary(), 0.01);
    }

//    @Test
//    public void canPayBonus(){
//        assertEquals(1000, director.payBonus(), 0.01);
//    }

    @Test
    public void raiseSalaryMustNotBeNegative(){
        director.raiseSalary(-10);
        assertEquals(100000, director.getSalary(), 0.01);
    }

    @Test
    public void canChangeName(){
        director.setName("Ian Gray");
        assertEquals("Ian Gray", director.getName());
    }

    @Test
    public void nameMustNotBeNull(){
        director.setName("");
        assertEquals("Ian", director.getName());
    }

    @Test
    public void getsTwoPercentBonus(){
        assertEquals(2000, director.payBonus(), 0.01);
    }
}
