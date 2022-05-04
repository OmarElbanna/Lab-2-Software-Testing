import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {
    Question1 question1;
    @BeforeEach
    public void init(){
        question1=new Question1();
    }
    @AfterEach
    public void cleanUp(){
        question1=null;
    }
    @Nested
    //Question1 i
    public class CheckParityTest {
        public String expectedParity;
        @Nested
        public class EvenTest{
            @BeforeEach
            public void initExpected(){
                expectedParity="Even";
            }
            @Test
            public void test0(){
                assertEquals(expectedParity,question1.checkParity(0));

            }
            @Test
            public void test2(){
                assertEquals(expectedParity,question1.checkParity(2));
            }
            @Test
            public void testneg2(){
                assertEquals(expectedParity,question1.checkParity(-2));
            }
            @Test
            public void test18(){
                assertEquals(expectedParity,question1.checkParity(18));
            }
            @Test
            public void testneg200(){
                assertEquals(expectedParity,question1.checkParity(-200));
            }
            @Test
            public void test200(){
                assertEquals(expectedParity,question1.checkParity(200));
            }
            @AfterEach
            public void cleanUp(){
                question1=null;
            }

        }
        @Nested
        public class OddTest{
            @BeforeEach
            public void initExpected(){
                expectedParity="Odd";
            }
            @Test
            public void test1(){
                assertEquals(expectedParity,question1.checkParity(1));
            }
            @Test
            public void testneg1(){
                assertEquals(expectedParity,question1.checkParity(-1));
            }
            @Test
            public void test9(){
                assertEquals(expectedParity,question1.checkParity(9));
            }
            @Test
            public void testneg9(){
                assertEquals(expectedParity,question1.checkParity(-9));
            }
            @Test
            public void test15(){
                assertEquals(expectedParity,question1.checkParity(15));
            }
            @Test
            public void test501(){
                assertEquals(expectedParity,question1.checkParity(501));
            }
            @Test
            public void testneg501(){
                assertEquals(expectedParity,question1.checkParity(-501));
            }
            @AfterEach
            public void cleanUp(){
                question1=null;
            }

        }
        @AfterEach
        public void cleanUp(){
            question1=null;
        }

    }
    @Nested
    //Question1 ii
    public class MinmaxTest{
        @Test
        public void testMaxAllPositive(){
            question1.setArr(new int[]{1,16,7,6,19,200,201,66,300});
            assertEquals(300,question1.getMax());

        }
        @Test
        public void testMaxAllNegative(){
            question1.setArr(new int[]{-1,-16,-7,-6,-19,-200,-201,-66,-300});
            assertEquals(-1,question1.getMax());

        }
        @Test
        public void testMaxPosAndNeg(){
            question1.setArr(new int[]{0,-19,4,-40,6,61});
            assertEquals(61,question1.getMax());

        }
        @Test
        public void testMinAllPositive(){
            question1.setArr(new int[]{1,16,7,6,19,200,201,66,300});
            assertEquals(1,question1.getMin());

        }
        @Test
        public void testMinAllNegative(){
            question1.setArr(new int[]{-1,-16,-7,-6,-19,-200,-201,-66,-300});
            assertEquals(-300,question1.getMin());

        }
        @Test
        public void testMinPosAndNeg(){
            question1.setArr(new int[]{0,-19,4,-40,6,61});
            assertEquals(-40,question1.getMin());

        }
        @AfterEach
        public void cleanUp(){
            question1=null;
        }



    }

}