public class BinarySearch<T extends Comparable<T>> extends Searcher<T>{
    @Override
    public void start() {
        int searchingIndex = data.length/2;
        int right = 0;
        int left = data.length;
        while(index == -1) {
            searchingIndex = (left+right)/2;
            if(goal.compareTo(data[searchingIndex]) < 0){
                left = searchingIndex;
            } else if(goal.compareTo(data[searchingIndex]) > 0){
                right = searchingIndex;
            } else {
                index = searchingIndex;
            }
        }
    }
}
