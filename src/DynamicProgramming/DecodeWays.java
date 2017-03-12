package DynamicProgramming;

/**
 * Created by vikram on 9/3/17.
 */
public class DecodeWays {

    public static void main(String[] args) {

        DecodeWays decodeWays=  new DecodeWays();
        System.out.println(decodeWays.decode("1123"));
    }

    public int decode(String message)
    {

        int msgLen = message.length();
        if(msgLen == 0 || msgLen == 1)
            return 1;

        int count = 0;

        if(message.charAt(msgLen - 1 ) > '0')//last digit
            count = decode(message.substring(0, msgLen - 1));//trimmed message by decreasing length by 1


        if((message.charAt(msgLen - 2) < '2') || ( message.charAt(msgLen - 2) == '2' &&  message.charAt(msgLen - 1) < '7' ) )
            count += decode(message.substring(0, msgLen - 2));

        return count;
    }


}
