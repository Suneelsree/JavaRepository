import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class  MinimumAbsDifference{
    public static void main(String args[]){
        int[] arr={3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> res=minimumAbsDifference(arr);
        for(List<Integer> out:res){
            System.out.println(out.toString());
        }
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        int min_diff=Integer.MAX_VALUE;
        int dif;
        for(int i=1;i<n;i++)
        {
            dif=Math.abs(arr[i]-arr[i-1]);
            if(min_diff>dif)min_diff=dif;
        }
        for(int i=1;i<n;i++)
        {
            dif=Math.abs(arr[i]-arr[i-1]);
            if(dif==min_diff)res.add(new ArrayList<>(Arrays.asList(arr[i-1],arr[i])));
        }
        return res;
    }
} 
