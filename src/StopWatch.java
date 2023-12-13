public class StopWatch {
    private long starTime;
    private long endTime;
    public StopWatch(){
        starTime = System.currentTimeMillis();
    }
    public long getStarTime(){
        return starTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public void start(){
        starTime = System.currentTimeMillis();
    }
    public void stop(){
        starTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - starTime;
    }

    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()* 100000);
        }
        StopWatch stopWatch = new StopWatch();
        selectionSort(array);
        stopWatch.stop();
        System.out.println("a" +stopWatch.getElapsedTime());
    }
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

}