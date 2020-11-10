import geekbrains.Main;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestArray2 {
    static Main main;
    private int[] arr;
    private boolean result;

    public TestArray2(int[] arr, boolean result) {
        this.arr = arr;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
       return Arrays.asList(new Object[][]{
               {new int[]{1, 1, 1, 1}, false},
               {new int[]{1, 4, 1, 4, 1}, true},
               {new int[]{4, 4, 4, 4, 4}, false},
               {new int[]{1, 4, 1, 4, 4, 4 ,1 ,3}, false}
        });
    }

    @BeforeClass
    public static void prepare() {
        main = new Main();
    }

    @Test
    public void testArr2() {
        Assert.assertEquals(result, main.arrayTest2(arr));
    }
}
