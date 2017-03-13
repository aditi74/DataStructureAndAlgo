package ImportantQuestions;

/**
 * Created by vikram on 13/3/17.
 */
public class KMPAlgo {


    public static void main(String[] args) {
        KMPAlgo kmpAlgo= new KMPAlgo();
        kmpAlgo.kmpPrefixTable("abcaby");
    }
    public void kmpPrefixTable(String str)
    {
      //  str="abcaby";
        int[] kmpTable= new int[str.length()];

        kmpTable[0]= 0;

        for (int i=1,j=0;i<str.length();)
        {
            if (str.charAt(i)==str.charAt(j))
            {
                kmpTable[i]=j+1;
                i++;
                j++;

            }
              else
            {
                if (j!=0)
                j=kmpTable[j-1];
                 else
                     i++;



            }

        }

        for (int i=0;i< str.length();i++)
        {
            System.out.print(kmpTable[i] + " ");
        }






    }


}
