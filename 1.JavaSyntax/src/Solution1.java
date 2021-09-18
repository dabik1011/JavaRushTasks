public class Solution1 {

    public static void main(String[] args)  {
        //напишите тут ваш код
        int[] qwe = {1,6,5,8,3,9,0,2};
printArr(qwe);
        System.out.println();
        sort(qwe);
        printArr(qwe);

    }

    // метод проверяет, гласная ли буква
    public static void printArr (int [] arr) {
        for (int s: arr) System.out.print(s + " ");
    }
    public static void sort(int[] arr) {
       // boolean all = false;
      //  while (!all) {
           // all = true;
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0 ;j < i;j++) {
            if (arr[i] < arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
              //  all = false;
            }
        }
        }
    }
}