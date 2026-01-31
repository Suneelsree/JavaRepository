import java.util.ArrayList;
import java.util.List;


public class Leetcode22 {
    public static void main(String[] args) {
        Leetcode22 l=new Leetcode22();
        List<String> res=l.generateParenthesis(10);
        System.out.println(res.toString());
    }
    public List<String> generateParenthesis(int n) {
       List<String> res = new ArrayList<String>();
        backtrack(res,new StringBuffer(),0,0,n);
        return res;
    }
    public static void backtrack(List<String> res,StringBuffer str,int open,int close,int n)
    {
        if(str.length()==2*n)
        {
            res.add(str.toString());
        }

        if(open<n)
        {
            str.append("(");
            backtrack(res,str,open+1,close,n);
            str.deleteCharAt(str.length() - 1);
        }
        if(close<open)
        {
            str.append(")");
            backtrack(res,str,open,close+1,n);
            str.deleteCharAt(str.length() - 1);
        }
    }
}