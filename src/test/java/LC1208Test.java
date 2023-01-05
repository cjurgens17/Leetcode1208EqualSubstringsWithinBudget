import static org.junit.Assert.*;

public class LC1208Test {

    @org.junit.Test
    public void maxSubstring() {
        int actual1 = LC1208.maxSubstring("abcd","bcdf", 3);
        int actual2 = LC1208.maxSubstring("abcd","cdef", 3);
        int actual3 = LC1208.maxSubstring("abcd","acde",0);
        int actual4 = LC1208.maxSubstring("anryddgaqpjdw","zjhotgdlmadcf",5);

        assertEquals(3, actual1);
        assertEquals(1, actual2);
        assertEquals(1, actual3);
        assertEquals(1, actual4);
    }
}