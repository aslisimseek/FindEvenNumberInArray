import java.util.Arrays;

public class FindEvenNumberInArray {
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 3, 2, 4, 5, 6, 2, 3, 4,21};
        int[] duplicateList = new int[list.length];
        int startedIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j] && list[i] % 2 == 0) {
                    duplicateList[startedIndex++] = list[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicateList));
    }
}
