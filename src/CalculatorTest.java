import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator classUnderTest ;
    @Before
    public void setUp() throws Exception {
        this.classUnderTest = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        classUnderTest = null;
    }

    @Test
    public void testAdd() {
        assertEquals("add", 7, classUnderTest.add(3, 4));
    }
    @Test
    public void testAdd1() {
        assertEquals("add", 5, classUnderTest.add(3, 4));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAdd2() {
        classUnderTest.add(-3, -4);
    }

    @Test
    public void testSubstract() {
        assertEquals("substract", 2, classUnderTest.sub(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals("multiply", 56, classUnderTest.mult(7, 8));
    }
    @Test
    public void div() {
        assertEquals("div", 2, classUnderTest.div(4, 2));
    }
    @Test(expected = IllegalArgumentException.class)
    public void div2() {
        assertEquals("div", 56, classUnderTest.div(4, 0));
    }


    @Test
    public void testAdv1() {
        assertEquals("add", 7, classUnderTest.advCalc(3, 4,'+'));
    }
    @Test
    public void testAdv2() {
        assertEquals("add", 5,classUnderTest.advCalc(3, 4,'+'));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAdv3() {
        classUnderTest.advCalc(-3, -4,'+');
    }

    @Test
    public void testAdv4() {
        assertEquals("substract", 2, classUnderTest.advCalc(4, 2,'-'));
    }

    @Test
    public void testAdv5() {
        assertEquals("multiply", 12, classUnderTest.advCalc(3, 4,'*'));
    }
    @Test
    public void testAdv6() {
        assertEquals("div", 2, classUnderTest.advCalc(4, 2,'/'));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAdv7() {
        assertEquals("div", 56, classUnderTest.advCalc(4, 0,'/'));
    }
}
