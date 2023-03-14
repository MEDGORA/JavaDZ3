import java.util.ArrayList;
import java.util.List;

/**
 * task
 */
public class task {

    public static void main(String[] args) {
        //Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
        
        System.out.print("Первый список: ");
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++){
            if (list1.get(i) % 2 == 1){
                list1.remove(i);
            }
        }
        System.out.print("Изменённый первый список: ");
        System.out.println(list1);
        System.out.println();
        //Дан список ArrayList<String>. Удалить из него все строки, которые являются числами 
        //Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); 
        //["string", "s", "my_value"]
        //ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); 
        
        System.out.print("Второй список: ");
        System.out.println(list2);
        for (int i = 0; i < list2.size(); i++){
            try {
                int n = Integer.parseInt(list2.get(i));
                list2.remove(i);
                i--;
            }catch (NumberFormatException e) {
                
            }
        }
        System.out.print("Изменённый второй список: ");
        System.out.println(list2);
    }
}