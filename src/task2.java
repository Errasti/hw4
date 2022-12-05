import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> taskList = new LinkedList<>();
        taskList.add("Первый");
        taskList.add("Второй");
        taskList.add("Третий");
        taskList.add("Четвертый");
        taskList.add("Пятый");
        System.out.println("Изначальный список:");
        System.out.println(taskList.toString());
        enqueue(taskList, "Шестой");
        System.out.println();
        System.out.println("Добавили элемент в очередь");
        System.out.println(taskList.toString());
        System.out.println();
        System.out.println("Возвращаем и удаляем первый элемент из очереди:");
        System.out.println(dequeue(taskList));
        System.out.println();
        System.out.println("Проверяем что он исчез из очереди:");
        System.out.println(taskList.toString());
        System.out.println();
        System.out.println("Возвращаем первый элемент и не удаляем его");
        System.out.println(first(taskList));

    }
    public static void enqueue(LinkedList<String> lst, String item){
        lst.add(item);
    }
    public static String dequeue(LinkedList<String> lst){
        String result = new String();
        result = lst.get(0);
        lst.remove(0);
        return result;
    }
    public static String first(LinkedList<String> lst){
        return lst.get(0);
    }

}
