public class Question1 {
    private int []arr;

    public int[]getArr(){
        return this.arr;
    }

    public void setArr(int[] array){
        this.arr=array.clone();

    }

    public int getMax(){
        int max=arr[0];
        for (int i=1;i<this.arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public int getMin(){
        int min=arr[0];
        for (int i=1;i<this.arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public String checkParity(int number){
        if(number%2==0)
            return "Even";
        else
            return "Odd";
    }
}
