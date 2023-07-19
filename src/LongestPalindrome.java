import java.util.Scanner;

public class LongestPalindrome {
    static String longest(String word){
        int n=word.length();
        if(n==1){
            return word;
        }
        int maxlength=0;
        int start=0,end=0;
        for (int i=0;i<word.length();i++){
            int left=i-1;
            int right=i+1;
            while (left>0 && right<n && word.charAt(left)==word.charAt(right)){
               if(right-left+1>end-start+1)
               {
                   start=left;
                   end=right;
               }
               left--;right++;
            }
         left=i;
            right=i+1;
            while (left>0 && right<n && word.charAt(left)==word.charAt(right)){
                if(right-left+1>end-start+1)
                {
                    start=left;
                    end=right;
                }
                left--;right++;
            }

        }

        return word.substring(start,end+1);


    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word= scan.nextLine();
        System.out.println(longest(word));


    }
}
