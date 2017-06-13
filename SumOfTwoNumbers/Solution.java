public class Solution {
    public int getSum(int a, int b) {
    
    if(b == 0) return a;
    return getSum(a ^ b, (a & b) << 1);
    
    
    /*
    int sum = a ^ b;            //SUM of two integers is A XOR B
    int carry = (a & b) << 1;  //CARRY of two integer is A AND B
    return getSum(sum, carry);
    */
    
    }
}
