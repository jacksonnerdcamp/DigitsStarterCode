import java.util.*;
import java.lang.*;

public class Digits
{
    //The list of digits from the number used to //construct this object
    ArrayList<Integer> digitList = new ArrayList<>();

    //Constructs a Digits object that
    //represents num
    public Digits (int num)
    {

        String word = Integer.toString(num);
        for(int i = 0; i < word.length(); i++)
        {
            digitList.add(Integer.parseInt(word.substring(i, i + 1)));
        }
    }
    public boolean isStrictlyIncreasing()
    {
        for(int i = 0; i < digitList.size(); i++)
        {
            if(digitList.get(i) > digitList.get(i + 1))
            {
                return false;
            }
        }
        return true;
    }
    //Extra method to make the runner easier to read
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

}
