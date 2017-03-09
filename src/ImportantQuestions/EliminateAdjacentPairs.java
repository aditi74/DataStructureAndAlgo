package ImportantQuestions;

/**
 * Created by vikram on 6/3/17.
 * You are given a string. You have to eliminate the pairs (two same chars adjacent to each other).

 eg. input string RGBBGBGR –> RGGBGR–> RBGR (output)


 */
public class EliminateAdjacentPairs {

    public static void main(String[] args) {

        char[] str= {'R','G','B','B','G','B','G','R'};
        EliminateAdjacentPairs adjacentPairs= new EliminateAdjacentPairs();
        adjacentPairs.removeAdjacentPair(str);
    }

    void removeAdjacentPair(char[] str)
    {
        int len =str.length;
        int i,j=0;
        for(i=1; i < len; i++)
        {
            while((str[i]==str[j]) && (j >= 0))
            {
                i++;
                j--;
            }

            str[++j] = str[i];
        }
        str[j+1]='\0';
        System.out.println(str);
        return;
    }



}
