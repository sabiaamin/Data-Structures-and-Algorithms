package _05_Arrays;

public class _09a_Union_of_Two_Sorted_Arrays_using_array {
    public static int[] findUnion(int a[], int b[]) {
        int al = a.length;
        int bl = b.length;
        int[] r = new int[al+bl];
        int i=0,j=0,k=0;

        while (i < al && j < bl) {
            if (a[i] <b[j]) {
                // Decision Path 1: Array A has the smaller element
                if (k == 0 || r[k - 1] != a[i]) {
                    r[k++] = a[i];
                }
                i++;
            } else if (a[i] == b[j]) {
                // Decision Path 2: Elements are equal
                if (k == 0 || r[k - 1] != a[i]) {
                    r[k++] = a[i];
                }
                i++;
                j++;
            } else {
                // Decision Path 3: Array B has the smaller element
                if (k == 0 || r[k - 1] != b[j]) {
                    r[k++] = b[j];
                }
                j++;
            }
        }

        // Processing remaining elements of 'a'
        while (i < al) {
            if (k == 0 || r[k - 1] != a[i]) {
                r[k++] = a[i];
            }
            i++;
        }

        // Processing remaining elements of 'b'
        while (j < bl) {
            if (k == 0 || r[k - 1] != b[j]) {
                r[k++] = b[j];
            }
            j++;
        }

        // Final trimming to match exact union size
        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = r[x];
        }
        return result;
    }
}