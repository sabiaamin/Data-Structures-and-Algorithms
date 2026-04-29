package _05_Arrays;
import java.util.ArrayList;
import java.util.List;

public class _09b_Union_of_Two_Sorted_Arrays_using_Arraylist {
    public List<Integer> findUnion(int a[], int b[]) {
        // code here
        int al=a.length;
        int bl=b.length;
        List<Integer> r= new ArrayList<>();
        int i=0,j=0;
        int k=0;

        while(i<al && j<bl ){
            if(a[i]<b[j] ){
                if(k==0 || r.get(k-1)!=a[i]){
                    r.add(a[i]);
                    i++;k++;
                }else{    // r[k-1]==b[j]
                    i++;
                }
            }else if(a[i]==b[j]){
                if(k==0 || r.get(k-1)!=a[i]){
                    r.add(a[i]);
                    i++;k++;j++;
                }else{
                    i++;j++;
                }

            } else {
                if(k==0 ||r.get(k-1)!=b[j] ){
                    r.add(b[j]);
                    k++;j++;
                }else{    // r[k-1]==b[j]
                    j++;
                }
            }
        }
        while(i<al){
            if(k==0 || r.get(k-1)!=a[i]){
                r.add(a[i]);
                i++;k++;
            }else{
                i++;
            }

        }
        while(j<bl){
            if(k==0 || r.get(k-1)!=b[j]){
                r.add(b[j]);
                k++;j++;
            }else{
                j++;
            }
        }

        return (ArrayList<Integer>)r;
    }
    public  void main(String[] args) {
        int []a={1,3,3,5,7,8,8};
        int []b={1,2,2,4,6,6,7,8,9};
        List<Integer> u = findUnion(a,b);
        System.out.println(u);
    }

}
