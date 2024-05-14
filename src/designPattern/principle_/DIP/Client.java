package designPatterns.DIP;

/**
 * @author felix
 * @date 2024/5/10 14:31
 *
 * 依赖倒置
 *
 */
public class Client {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        Work work1 = new Work(task1);
        Work work2 = new Work(task2);

        work1.performTask();
        work2.performTask();
    }
}
