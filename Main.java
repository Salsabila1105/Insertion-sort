public class Main {

    static int[] handleSort(int[] data) {
        for(int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;
            while(j >= 0 && key < data[j]) {
                data[j + 1] = data[j];
                --j;
            }
            data[j + 1] = key;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] unsorterData = {5, 11, 4, 8, 1, 21};
        int[] sortedData = handleSort(unsorterData);

        for(int itm : sortedData) {
            System.out.println(itm);
        }
    }
}