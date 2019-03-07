
package List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<String>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(inputList.get(i));
        }

    }
}
