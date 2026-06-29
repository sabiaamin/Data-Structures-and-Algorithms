package _06_Binary_Search;

public class _13_Find_Peak_Element_LC_162 {
    public int findPeakElement(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
        public int findPeakElement1(int[] arr) {
            int low=0;
            int high=arr.length-1;
            int num=Integer.MIN_VALUE;
            int idx=0;
            while(low<high){
                int mid=low+(high-low)/2;
                if(mid<arr.length-1 && arr[mid]<arr[mid+1]){
                    if(num<arr[mid+1] ){
                        num=arr[mid+1];
                        idx=mid+1;
                    }
                    low=mid+1;
                }else if( mid<arr.length-1 && arr[mid]>arr[mid+1]){
                    if(num<arr[mid] && mid>0 && arr[mid]>arr[mid-1]){
                        num=arr[mid];
                        idx=mid;
                    }
                    high=mid-1;
                }
            }
            if(num!=Integer.MIN_VALUE){
                return idx;
            }
            low=0;
            high=arr.length-1;
            while(low<high){
                int mid=low+(high-low)/2;
                if(mid<arr.length-1 && arr[mid]<arr[mid+1]){
                    if(num<arr[mid+1] ){
                        num=arr[mid+1];
                        idx=mid+1;
                    }
                    low=mid+1;
                }
                else if( mid<arr.length-1 && arr[mid]>arr[mid+1]){
                    if(num<arr[mid] && mid>0 && arr[mid]>arr[mid-1]){
                        num=arr[mid];
                        idx=mid;
                    }
                    low=mid+1;
                }
            }
            return idx;

        }
}
