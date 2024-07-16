public class BinarySearch {

    public static void main(String[] args)
    {
        int[] arr= {1,2,3,5,7,8,9,55,121,12,20};
        int[] arr2 ={10,8,6,4,2,1};
        int target = 6;
        int result = BinarySearch(arr2, target);
        System.out.println(result);
    }
    public static int BinarySearch(int[] arr,int target)
    {
        int start=0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target == arr[mid]) return mid;
            if (isAsc)
            {
              if(target<arr[mid]) end=mid+1; 
              else start=mid+1;
            }
            else
            {
            if(target>arr[mid]) end=mid+1; 
              else start=mid+1;
            }
        } return -1;
    }
}

