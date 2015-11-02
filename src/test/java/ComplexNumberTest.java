import junit.framework.TestCase;
import org.junit.Test;

public class ComplexNumberTest extends TestCase {

    private static final double ACCEPTABLE_ERROR = 1e-15;

    @Test
    public void testOneArgumentConstructor(){
        ComplexNumber complexNumber = new ComplexNumber(1);

        assertEquals("r after one arg constructor", 1.0, complexNumber.r);
        assertEquals("i after one arg constructor", 0.0, complexNumber.i);
    }

    @Test
    public void testTwoArgumentConstructor(){
        ComplexNumber complexNumber = new ComplexNumber(1.8, 1.534);

        assertEquals("r after constructor", 1.8, complexNumber.r);
        assertEquals("i after constructor", 1.534, complexNumber.i);
    }

    @Test
    public void testAdd(){
        ComplexNumber complexNumber1 = new ComplexNumber(1,1);
        ComplexNumber complexNumber2 = new ComplexNumber(2,2);

        ComplexNumber complexNumberSum = complexNumber1.add(complexNumber2);

        assertEquals("r of sum", 3.0, complexNumberSum.r);
        assertEquals("i of sum", 3.0, complexNumberSum.i);
    }

    @Test
    public void testAddDecimal(){
        ComplexNumber complexNumber1 = new ComplexNumber(1.53,1.24);
        ComplexNumber complexNumber2 = new ComplexNumber(1.40,9);
        ComplexNumber complexNumberSum = complexNumber1.add(complexNumber2);

        assertEquals("r of sum decimal", 2.93, complexNumberSum.r, ACCEPTABLE_ERROR);
        assertEquals("i of sum decimal", 10.24, complexNumberSum.i, ACCEPTABLE_ERROR);
    }

    @Test
    public void testAddNegative(){
        ComplexNumber complexNumber1 = new ComplexNumber(-1,1);
        ComplexNumber complexNumber2 = new ComplexNumber(2,-2);

        ComplexNumber complexNumberSum = complexNumber1.add(complexNumber2);

        assertEquals("r of sum negative", 1.0, complexNumberSum.r);
        assertEquals("i of sum negative", -1.0, complexNumberSum.i);
    }

    @Test
    public void testAddNegativeDecimal(){
        ComplexNumber complexNumber1 = new ComplexNumber(-1.53,1.24);
        ComplexNumber complexNumber2 = new ComplexNumber(1.40,-9);
        ComplexNumber complexNumberSum = complexNumber1.add(complexNumber2);

        assertEquals("r of sum negative decimal", -0.13, complexNumberSum.r, ACCEPTABLE_ERROR);
        assertEquals("i of sum negative decimal", -7.76, complexNumberSum.i, ACCEPTABLE_ERROR);
    }

    @Test
    public void testSubtract(){
        ComplexNumber complexNumber1 = new ComplexNumber(1,1);
        ComplexNumber complexNumber2 = new ComplexNumber(3,4);
        ComplexNumber complexNumberSum = complexNumber1.subtract(complexNumber2);

        assertEquals("r of subtract", -2.0, complexNumberSum.r, ACCEPTABLE_ERROR);
        assertEquals("i of subtract", -3.0, complexNumberSum.i, ACCEPTABLE_ERROR);
    }

    @Test
    public void testSubtractDecimal(){
        ComplexNumber complexNumber1 = new ComplexNumber(1.2,1.3);
        ComplexNumber complexNumber2 = new ComplexNumber(3.2,4.3);
        ComplexNumber complexNumberSum = complexNumber1.subtract(complexNumber2);

        assertEquals("r of subtract decimal", -2.0, complexNumberSum.r, ACCEPTABLE_ERROR);
        assertEquals("i of subtract decimal", -3.0, complexNumberSum.i, ACCEPTABLE_ERROR);
    }

    @Test
    public void testSubtractNegative(){
        ComplexNumber complexNumber1 = new ComplexNumber(1,1);
        ComplexNumber complexNumber2 = new ComplexNumber(-3,-4);
        ComplexNumber complexNumberSum = complexNumber1.subtract(complexNumber2);

        assertEquals("r of subtract negative", 4, complexNumberSum.r, ACCEPTABLE_ERROR);
        assertEquals("i of subtract negative", 5, complexNumberSum.i, ACCEPTABLE_ERROR);
    }

    @Test
    public void testSubtractNegativeDecimal(){
        ComplexNumber complexNumber1 = new ComplexNumber(1.2,1.3);
        ComplexNumber complexNumber2 = new ComplexNumber(-3.2,-4.3);
        ComplexNumber complexNumberSum = complexNumber1.subtract(complexNumber2);

        assertEquals("r of subtract negative decimal", 4.4, complexNumberSum.r, ACCEPTABLE_ERROR);
        assertEquals("i of subtract negative decimal", 5.6, complexNumberSum.i, ACCEPTABLE_ERROR);
    }

    @Test
    public  void testMultiply(){
        ComplexNumber complexNumber1 = new ComplexNumber(1,2);
        ComplexNumber complexNumber2 = new ComplexNumber(3,4);
        ComplexNumber complexNumberProduct = complexNumber1.multiply(complexNumber2);

        assertEquals("r of complex product", -5.0, complexNumberProduct.r, ACCEPTABLE_ERROR);
        assertEquals("i of complex product", 10.0, complexNumberProduct.i, ACCEPTABLE_ERROR);
    }

    @Test
    public  void testMultiplyDecimal(){
        ComplexNumber complexNumber1 = new ComplexNumber(1.1,2.3);
        ComplexNumber complexNumber2 = new ComplexNumber(3.43,4.32);
        ComplexNumber complexNumberProduct = complexNumber1.multiply(complexNumber2);

        assertEquals("r of complex product decimal", -6.163, complexNumberProduct.r, ACCEPTABLE_ERROR);
        assertEquals("i of complex product decimal", 12.641, complexNumberProduct.i, ACCEPTABLE_ERROR);
    }

    @Test
    public  void testMultiplyNegative(){
        ComplexNumber complexNumber1 = new ComplexNumber(1,2);
        ComplexNumber complexNumber2 = new ComplexNumber(-3,-4);
        ComplexNumber complexNumberProduct = complexNumber1.multiply(complexNumber2);

        assertEquals("r of complex product negative", 5.0, complexNumberProduct.r, ACCEPTABLE_ERROR);
        assertEquals("i of complex product negative", -10.0, complexNumberProduct.i, ACCEPTABLE_ERROR);
    }

    @Test
    public  void testMultiplNegativeyDecimal(){
        ComplexNumber complexNumber1 = new ComplexNumber(1.1,2.3);
        ComplexNumber complexNumber2 = new ComplexNumber(-3.43,-4.32);
        ComplexNumber complexNumberProduct = complexNumber1.multiply(complexNumber2);

        assertEquals("r of complex product negative decimal", 6.163, complexNumberProduct.r, ACCEPTABLE_ERROR);
        assertEquals("i of complex product negative decimal", -12.641, complexNumberProduct.i, ACCEPTABLE_ERROR);
    }

    @Test
    public  void testMultiplyZero(){
        ComplexNumber complexNumber1 = new ComplexNumber(1,2);
        ComplexNumber complexNumber2 = new ComplexNumber(0,0);
        ComplexNumber complexNumberProduct = complexNumber1.multiply(complexNumber2);

        assertEquals("r of complex product", 0.0, complexNumberProduct.r, ACCEPTABLE_ERROR);
        assertEquals("i of complex product", 0.0, complexNumberProduct.i, ACCEPTABLE_ERROR);
    }

}
