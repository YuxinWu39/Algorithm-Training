package DFS;// Name: Yuxin Wu (Peter Wu)

import java.util.ArrayList;
import java.util.List;

public class AllSubsets {

    public static void main(String[] args) {
        AllSubsets test = new AllSubsets();
        List<String> result = test.findSubset("abc");
        System.out.print(result);


    }

    public List<String> findSubset(String input) {
        List<String> result = new ArrayList<String>();
        if (input == null) {
            return result;
        }
        char[] set = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        helper(0, sb, set, result);
        return result;

    }

    public void helper (int index, StringBuilder sb, char[] set, List<String> result) {
        if (index == set.length) {
            result.add(sb.toString());
            return;
        }

        helper(index + 1, sb.append(set[index]), set, result);
        sb.deleteCharAt(sb.length() - 1);
        helper(index + 1, sb, set, result);

    }

}
