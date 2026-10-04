public class BinarySearch<T extends Comparable<T>> extends Searcher<T>{
    @Override
    public void start() {
        int size =  data.length;
        int searchingIndex = size/2;
        int right = 0;
        int left = size;
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
