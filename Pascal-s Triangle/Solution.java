import java.util.ArrayList;
import java.util.List;

class Solution {

    private List<List<Integer>> pascalList = new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {

        if (numRows < 1) return pascalList;

        List<Integer> pascalRow = new ArrayList<>();

        pascalRow.add(1);
        pascalList.add(pascalRow);
        if (numRows == 1)
            return pascalList;

        pascalRow = new ArrayList<>();
        pascalRow.add(1);
        pascalRow.add(1);
        pascalList.add(pascalRow);
        if (numRows == 2)
            return pascalList;

        //Form each row by addition.
        for (int i = 3; i <= numRows; i++) {

            int n = i - 1;
            pascalRow = new ArrayList<>();

            while (n >= 0)
                pascalRow.add(getAddition(i - 1, n--));

            pascalList.add(pascalRow);

        }

        return pascalList;
    }

    /**
     * Function to perform addition on previous values and return new value.
     *
     * @param i row number
     * @param n item number
     * @return current value for mentioned row and item number.
     */
    private int getAddition(int i, int n) {

        if (n == 0 || n == i)
            return 1;
        else return pascalList.get(i - 1).get(n - 1) + pascalList.get(i - 1).get(n);

    }
}
