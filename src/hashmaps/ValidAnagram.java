package hashmaps;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
//        System.out.println(isAnagram("care","race"));
//        System.out.println(isAnagram("tulip","lipid"));

        //System.out.println(longestKSubstr("uvtptxgtckttipjpnewpc",17));

        int [] arr = {1,0,1,0,1};
        System.out.println(numSubarraysWithSum(arr,2));

    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int ans =0;
        int l =0;
        int r =0;
        int sum =0;
        while(r<n){
            sum+=nums[r];
            if(sum<goal) r++;
           else if(sum>goal){
              while(sum>goal){
                  sum-=nums[l];
                  l++;
              }
              ans++;
            }
           else if(sum==goal){
                ans++;
                r++;
            }

        }
        return ans;
    }




    public static double findMaxAverage(int[] nums, int k) {


        double ans = Double.MIN_VALUE;
        int i =0;
        int j  =0;

        int sum =0;

        while(j<nums.length){
            //calulations
            sum+=nums[j];

            //checking window size

            if(j-i+1<k) j++;

            else{
                double avg = sum/k;
                ans = Math.max(ans,avg);
                sum -= nums[i];
                i++;
                j++;
            }

        }

        return ans;

    }



    public static int longestKSubstr(String s, int k) {
        int ans = 0;
        int i = 0;
        int j = 0;
        int sl = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < sl) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                ans = Math.max(ans, j - i + 1);
                j++;
            } else if (map.size() > k) {
                while (map.size() > k) {
                    char c = s.charAt(i);
                    map.put(c, map.get(c) - 1);
                    if (map.get(c) == 0) {
                        map.remove(c);
                    }
                    i++;
                }
                j++;
            }
        }

        return ans;
    }


    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
            

        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                }
                else map.put(ch, map.get(ch)-1);
            }
            else return false;
        }
        return map.isEmpty();
    }






    //     public String minWindow(String s, String t) {
//         int sl = s.length();
//         int tl = t.length();
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i =0; i< tl ; i++){
//              char ch = t.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         int i = 0;
//         int j =0;
//         int count =0 ;

//         String ans = "";
//        int min=Integer.MAX_VALUE;

//         while(j<sl){
//             char ch = s.charAt(j);
//         if(!map.containsKey(ch))
//             {
//                 j++;
//                 continue;
//             }

//               else if(map.containsKey(ch)){
//                     map.put(ch, map.get(ch)-1);
//                     if(map.get(ch) == 0)  count--;
//                 }

//             if(count ==0){
//                if(min>j-i+1)
//                 {
//                     ans=s.substring(i,j+1);
//                     min=Math.min(min,j-i+1);
//                 }
//                 while(count==0)
//                 {
//                     char c1=s.charAt(i);
//                     if(!map.containsKey(c1))
//                         i++;
//                     else{
//                         map.put(c1,map.get(c1)+1);
//                         if(map.get(c1)>0)
//                             count++;
//                         i++;
//                     }
//                     if(count==0)
//                     {
//                         if(min>j-i+1)
//                         {
//                             ans=s.substring(i,j+1);
//                             min=j-i+1;
//                         }
//                     }
//                 }

//             }
//             j++;




//         }


//         return ans;



//     }


    public String minWindow(String s, String t) {
        String ans="";
        int i=0,j=0;
        int min=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int k=0;k<t.length();k++)
        {
            char c=t.charAt(k);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count=map.size();

        while(j<s.length())
        {
            char c=s.charAt(j);
            if(!map.containsKey(c))
            {
                j++;
                continue;
            }
            else if(map.containsKey(c))
            {
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)
                    count--;
            }
            if(count==0)
            {
                if(min>j-i+1)
                {
                    ans=s.substring(i,j+1);
                    min=Math.min(min,j-i+1);
                }
                while(count==0)
                {
                    char c1=s.charAt(i);
                    if(!map.containsKey(c1))
                        i++;
                    else{
                        map.put(c1,map.get(c1)+1);
                        if(map.get(c1)>0)
                            count++;
                        i++;
                    }
                    if(count==0)
                    {
                        if(min>j-i+1)
                        {
                            ans=s.substring(i,j+1);
                            min=j-i+1;
                        }
                    }
                }
            }
            j++;
        }
        return ans;
    }


}







