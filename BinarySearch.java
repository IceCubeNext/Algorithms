public class BinarySearch {
    public int binarySearch(int[] container, int item) {
        int result = -1;
        int left = 0;
        int right = container.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (container[mid] == item) {
                return mid;
            } else if (container[mid] < item) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
