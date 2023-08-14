package Arrays;

public class TrappedRainWater {
    public static void main(String[] args) {

        int [] arr = {4,2,0,6,3,2,5};
        System.out.println(TrappedWater(arr));

    }
    public static int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftMax=0;
        int rightMax=0;
        int water=0;
        while(left<=right)
        {
            if(height[left]<height[right])
            {
                if(height[left]>leftMax)
                    leftMax=height[left];
                else
                    water+=leftMax-height[left];
                left++;

            }else{
                if(height[right]>rightMax)
                    rightMax=height[right];
                else
                    water+=rightMax-height[right];
                right--;

            }

        }
        return water;


    }

    public static int TrappedWater(int [] height){

        // Calculate the left max boundary  array
        int [] leftmax = new int [height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

        // Calculate the Right max boundary array

        int [] RightMax = new int [height.length];
        RightMax[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i>=0 ; i--) {
            RightMax[i] = Math.max(height[i],RightMax[i+1]);
        }
        int trapedWater = 0;

        // loop;

        for (int i = 0; i < height.length; i++) {
            //find the minimum boundary
            int waterLevel = Math.min(leftmax[i],RightMax[i]);
            // waterlevel = waterlevel - height[i];

            //  total Water Level is trapedwater  = trapedwater + waterlevel - height[i];
            trapedWater +=waterLevel-height[i];
        }
        return trapedWater;
    }
}
