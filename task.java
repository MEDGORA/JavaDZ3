import java.util.ArrayList;

/**
 * task
 */
public class task {

    public static void main(String[] args) {
        //Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 1){
                list.remove(i);
            }
        }
        System.out.println(list);
        //Дан список ArrayList<String>. Удалить из него все строки, которые являются числами 
        //Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); 
        //["string", "s", "my_value"]
        
    }
}