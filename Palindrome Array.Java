
class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int i=0, j=arr.length-1;
        // while(i<z){
        //     if(arr[i]!=arr[j]) return false;
        //     i++;
        //     j--;
        // }
        return check(arr,i,j);
    }
    static boolean check(int []arr,int i, int j){
        if (i>=j) return true;
        if(arr[i]!=arr[j])return false;
        return check(arr,i+1,j-1);
    }
}

