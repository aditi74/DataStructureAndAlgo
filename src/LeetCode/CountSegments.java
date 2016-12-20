package LeetCode;

/**
 * Created by vikram on 20/12/16.
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

 Please note that the string does not contain any non-printable characters.

 Example:

 Input: "Hello, my name is John"
 Output: 5
 */
public class CountSegments {

    public static void main(String[] args) {
        String str="        ";

        CountSegments countSegment= new CountSegments();
        System.out.println(countSegment.countSegments(str));
    }
    public int countSegments(String s) {
        if (s.length()==0)
            return 0;
      String[] output= s.split(" ");
        int counter=0;
        System.out.println(output.length);

       for (int i=0;i<output.length;i++)
       {
          if (output[i].length()!=0)
              counter++;
       }


return counter;
    }
}
