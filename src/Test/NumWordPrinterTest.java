package Test;
import main.NumWordPrinter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumWordPrinterTest {


    @Test
    public void testDivisibleByAllThree() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("EvenPrimeLucky", printer.printWord(572, false));
    }


    @Test
    public void testDivisibleByTwoAndEleven() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("EvenPrimeEleven", printer.printWord(44, false));
    }

    @Test
    public void testDivisibleByThirteen() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("LuckyThirteen", printer.printWord(13, false));
    }

    @Test
    public void testDivisibleByThirteenNegativeTest() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("LuckyThirteen", printer.printWord(-13, false));
    }


    @Test
    public void testDivisibleByTwo() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("Even", printer.printWord(4, false));
    }

    @Test
    public void testOddOneOut() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("OddOneOut", printer.printWord(7, false));
    }
    @Test
    public void testOddOneOutNegative() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("OddOneOut", printer.printWord(-21, false));
    }


    @Test
    public void testUppercaseOption() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("EVENPRIMEELEVEN", printer.printWord(22, true));
    }
}
