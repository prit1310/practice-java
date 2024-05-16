 class removeDuplicate {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int uniqueIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int newLength = removeDuplicates(arr);

        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
