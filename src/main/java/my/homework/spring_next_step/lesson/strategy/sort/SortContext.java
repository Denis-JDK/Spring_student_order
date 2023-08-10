package my.homework.spring_next_step.lesson.strategy.sort;

public class SortContext {
    private SortStrategy strategy;

    public SortContext(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(Integer[] array){
         strategy.sort(array);
    }


}
