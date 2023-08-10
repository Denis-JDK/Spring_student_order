package my.homework.spring_next_step.lesson.strategy.sort;

import java.util.Random;

public class ArraySort {

    private Integer[] array;
    Random random = new Random();

    public ArraySort() {
        this.array= new Integer[random.nextInt(200)];

    }
    public static void main(String[] args) {
        ArraySort arraySort = new ArraySort();
        arraySort.addArray(arraySort.array);

        SortContext context;

        if (arraySort.array.length<=50){
            context= new SortContext(new BubbleSort());
            context.sort(arraySort.array);
            for (int i=0;i<=arraySort.array.length-1; i++ ) {
                System.out.println("BubbleSort: " + arraySort.array[i]);
            }

        }else {
            context = new SortContext(new MergeArray());
            context.sort(arraySort.array);
            for (int i=0;i<=arraySort.array.length-1; i++ ) {
                System.out.println("MergeArray: " + arraySort.array[i]);
            }
        }

    }

    public void addArray(Integer [] array){
        for (int i = 0; i <=array.length-1; i++){
            array[i]= random.nextInt(10);
        }


    }
}

