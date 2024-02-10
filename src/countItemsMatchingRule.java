import java.util.*;
public class countItemsMatchingRule {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> items= new ArrayList<ArrayList<String>>();
        ArrayList<String> row1 = new ArrayList<>();
        row1.add("9qqqq");
        row1.add("10qqqq");
        row1.add("11qqqq");
        items.add(row1);

        ArrayList<String> row2 = new ArrayList<>();
        row2.add("0qqqq");
        row2.add("1qqqq");
        row2.add("2qqqq");
        items.add(row2);

        ArrayList<String> row3 = new ArrayList<>();
        row3.add("3qqqq");
        row3.add("4qqqq");
        row3.add("5qqqq");
        items.add(row3);

        ArrayList<String> row4 = new ArrayList<>();
        row3.add("6qqqq");
        row3.add("7qqqq");
        row3.add("8qqqq");
        items.add(row4);

        System.out.println(countMatches(items,"name","qqqq"));

    }
    public static boolean countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int indx=returnRulekey(ruleKey);
        int cnt=0;
        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i).get(indx));
            if(items.get(i).get(indx).equals(ruleValue)){
                cnt++;
//                System.out.println(items.get(i).get(indx));
            }
        }
        System.out.println(cnt);
        return false;
    }
    public static int returnRulekey(String ruleKey){
        if(ruleKey.equals("type")){
            return 0;
        }else if(ruleKey.equals("color")){
            return 1;
        }else if(ruleKey.equals("name")){
            return 2;
        }
        return -1;
    }
}
