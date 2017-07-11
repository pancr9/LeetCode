public class Sqrt {

    public int mySqrt(int x) {
        //The function uses Babylonian method to find square root for a number.
        if (x == 0 || x == 1) return x;
        if (x < 0) return -1;

        double temp = x;                                    //Maximum value of sqrt.

        while (temp >= 1) {                                 //Iterations till value is reduced to 1.
            double temp1 = ((temp + (x / temp)) / 2);       //Babylonian method for getting next iteration.
            if ((long) temp == (long) temp1)
                return (int) temp;
            temp = temp1;
        }
        return -1;
    }
}
