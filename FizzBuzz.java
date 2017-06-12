import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
                public List<String> fizzBuzz(int n) {
                    if(n<0) return null;
                    try{
                        List<String> output = new ArrayList<String>();

                        for(int i = 1; i<=n;i++)
                        {
                            if(!(i%3==0) && !(i%5==0)) output.add(Integer.toString(i));
                            else if(i%3 ==0 && i%5==0) output.add("FizzBuzz");
                            else if(i%3 ==0) output.add("Fizz");
                            else output.add("Buzz");
                        }

                        return output;
                    }
                    catch (Exception e)
                    {
                        //Invalid input.
                        return null;
                    }
                }
            }
