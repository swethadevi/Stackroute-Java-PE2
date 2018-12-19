
/*
    Write a program to calculate the frequency of the words in a given file,

    Example: Create a file named FileDemo.txt with the following content
    i am a man ,
    i like to sleep ,
    i have a home.

    Output: i->3 times,
    am-1,
    like -1,
    have -1,
    a-2 etc.,

 */


import java.io.BufferedReader;
        import java.io.File;
        import java.io.FileReader;
        import java.util.HashMap;

public class Question9_Count_Frequency
{
    public static void main(String args[]) throws Exception
    {
        HashMap<String, Integer> frequency = new HashMap();
        File newfile = new File("/home/user/Documents/Java-Practise-Ex2/text1");
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(newfile));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        String st;
        int i;
        while ((st = br.readLine()) != null)
        {
            String[] words = st.split(" ");
            for(i=0;i<words.length;i++)
            {
                if(frequency.containsKey(words[i]))
                {
                    int a = frequency.get(words[i]);
                    frequency.put(words[i], a+1);
                }
                else
                {
                    frequency.put(words[i], 1);
                }
            }
        }
        for (HashMap.Entry<String,Integer> entry : frequency.entrySet())
        {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}