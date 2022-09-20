public class SimpleSort {
    public int[] simpleSort(int[] container){
        int[] result = new int[container.length];
        int length = container.length;
        for(int i = 0; i < length; i ++){
            int index = findSmaller(container);
            result[i] = container[index];
            container = remove(container, index);
        }
        return result;
    }
    private int findSmaller(int[] data){
        int index = 0;
        for(int i = 0; i < data.length; i++){
            if (data[index] > data[i]){
                index = i;
            }
        }
        return index;
    }

    private int[] remove(int[] values, int index) {
        var result = new int[values.length - 1];

        for (var i = 0; i < values.length; i++) {
            if (i != index) {
                var newIndex = i < index ? i : i - 1;
                result[newIndex] = values[i];
            }
        }
        return result;
    }
}
