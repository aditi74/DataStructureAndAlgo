package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vikram on 20/11/16.
 * 118. Pascal's Triangle   QuestionEditorial Solution  My Submissions
 Total Accepted: 107528
 Total Submissions: 297431
 Difficulty: Easy
 Contributors: Admin
 Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
 ]
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {


        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0)
            return result;

        List<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        result.add(pre);

        for (int i = 2; i <= numRows; i++) {
            List<Integer> cur = new ArrayList<Integer>();

            cur.add(1); //first
            for (int j = 0; j < pre.size() - 1; j++) {
                cur.add(pre.get(j) + pre.get(j + 1)); //middle
            }
            cur.add(1);//last

            result.add(cur);
            pre = cur;
        }

        return result;
    }


}
