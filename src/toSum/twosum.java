package toSum;

public class twosum {

	/**
	 * @param args
	 */
	 public int[] twoSum(int[] nums, int target) {
	        int [] res = new int[2];
	       
	        for(int i = 0;i<nums.length;i++){
	            for(int j = i+1;j<nums.length;j++){
	            	int tar = nums[i]+nums[j];
	            	System.out.println(nums[i]+","+nums[j]+","+tar);
	                if(tar ==target){
	                    res[0] = i;
	                    res[1] = j;
	                    System.out.println(res[0]+","+res[1]);
	                    return res;
	                }
	            }
	        }
	        return res;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] ={3,2,4};
				
		twosum ts = new twosum();
		int res[] = ts.twoSum(nums, 6);
		String str2 = "";
		str2 =4+str2;
		str2 = 1+str2;
		System.out.println(str2);
		
	}

}
