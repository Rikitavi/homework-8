package ru.mukhametzyanov.task4;

/**В классе создан счетчик {@link Counter#counter}, который
 * считает количество созданных объектов в методе main.
 */
public class Counter {
    static int counter =0;
    private int date;
    private int time;

    public Counter() {
        counter++;
    }

    public Counter(int date, int time) {
        this.date = date;
        this.time = time;
        counter++;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(2, 12);
        Counter counter3 = new Counter();
        System.out.println(counter);
    }
}
