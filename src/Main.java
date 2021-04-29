public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello Petko!");
        System.out.println("Hello Kiril!");
        System.out.println("Hello Milena!");

        int[] arr = new int[] {5, 2, 6, 8, 1, 18, 9, 20};

        System.out.println();
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        BubbleSort bs = new BubbleSort();
        bs.bubbleSortFunc(arr);
        bs.printBubbleSortArr(arr);
    }
}
