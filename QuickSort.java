import java.util.*;

class QuickSort {
  public static void main(String args[]) {
    int start = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("enter length of array");
    int n = s.nextInt();
    int a[] = new int[n];
    int end = n - 1;
    System.out.println("enter elements one by one");
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }
    quick q = new quick();
    q.divide(a, start, end);
    for (int i = 0; i < end; i++)
      System.out.println(a[i]);
    s.close();
  }
}

class quick {
  int conqure(int a[], int start, int end) {
    int pivot = a[start];
    int i = start;
    int j = end;
    while (i < j) {
      while (pivot >= a[i] && i < end)
        i++;
      while (pivot <= a[j] && j > start)
        j--;
      if (i < j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
      }
    }
    int p = a[j];
    a[j] = pivot;
    pivot = p;
    return j;
  }

  void divide(int a[], int start, int end) {
    int j;
    if (start < end) {
      j = conqure(a, start, end);
      divide(a, start, j - 1);
      divide(a, j + 1, end);
    }
  }
}
