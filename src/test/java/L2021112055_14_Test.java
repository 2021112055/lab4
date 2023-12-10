import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class L2021112055_14_Test {
    // Testing strategy
    //  地址是否有效：每个整数是否位于 0 到 255，是否含有前导0
    //

    @Test
    public void testRestoreIpAddresses(){
        Solution14 solution=new Solution14();
        Solution14 solution2=new Solution14();
        Solution14 solution3=new Solution14();
        Solution14 solution4=new Solution14();
        Solution14 solution5=new Solution14();
        String s1="25525511135";
        String s2="0000";
        String s3="101023";
        String s4="255255111256";//超过255
        String s5="0011255245";//含有前导0
        String[] expected1 = {"255.255.11.135", "255.255.111.35"};
        String[] expected2 = {"0.0.0.0"};
        String[] expected3 = {"1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"};
        String[] expected4 = {};
        String[] expected5 = {};
        assertArrayEquals(expected1, solution.restoreIpAddresses(s1).toArray(new String[0]));
        assertArrayEquals(expected2, solution2.restoreIpAddresses(s2).toArray(new String[0]));
        assertArrayEquals(expected3, solution3.restoreIpAddresses(s3).toArray(new String[0]));
        assertArrayEquals(expected4, solution4.restoreIpAddresses(s4).toArray(new String[0]));
        assertArrayEquals(expected5, solution5.restoreIpAddresses(s5).toArray(new String[0]));
    }
}
