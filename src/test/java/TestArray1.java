import geekbrains.Main;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestArray1 {
    static Main main;
    private int[] arrBefore;
    private int[] arrAfter;

    public TestArray1(int[] arrBefore, int[] arrAfter) {
        this.arrBefore = arrBefore;
        this.arrAfter = arrAfter;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 2, 3, 1, 7, 4}, new int[]{}},
                {new int[]{4, 1, 2, 1, 3, 1, 5, 1}, new int[]{1, 2, 1, 3, 1, 5, 1}},
                {new int[]{1, 4, 1, 4, 1, 2, 3, 5}, new int[]{1, 2, 3, 5}}
        });
    }

    @BeforeClass
    public static void prepare() {
        main = new Main();
    }

    @Test
    public void testArr1() {
        Assert.assertArrayEquals(arrAfter, main.arrayTest1(arrBefore));
    }

}
