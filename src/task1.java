import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> taskList = new LinkedList<>();
        taskList.add("Первый");
        taskList.add("Второй");
        taskList.add("Третий");
        taskList.add("Четвертый");
        taskList.add("Пятый");
        System.out.println("Изначальный список:");
        System.out.println(taskList.toString());
        System.out.println("Перевернутый список:");
        System.out.println(reverseLst(taskList).toString());

    }

    public static LinkedList<String> reverseLst(LinkedList<String> lst){
        LinkedList<String> resultLst = new LinkedList<>();
        for(int i = lst.size() - 1; i >= 0; i-- ){
            resultLst.add(lst.get(i));
        }
        return resultLst;
    }
}
