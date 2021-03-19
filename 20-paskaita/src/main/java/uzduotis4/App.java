package uzduotis4;

import java.util.ArrayList;
import java.util.List;

import static uzduotis4.MaxAverage.findWithMaxAverage;

public class App {
    public static void main(String[] args) {

        List<ListOfNumbers>listObject = new ArrayList<>();
        ListOfNumbers listObject1 = new ListOfNumbers();
        listObject1.addNumber(1.5d);
        listObject1.addNumber(10d);
        listObject1.addNumber(2.5d);
        System.out.println(listObject1);

        ListOfNumbers listObject2 = new ListOfNumbers();
        listObject2.addNumber(0d);
        listObject2.addNumber(1d);

        ListOfNumbers listObject3 = new ListOfNumbers();
        listObject3.addNumber(100d);


        ListOfNumbers result1 = findWithMaxAverage(listObject1, listObject2, listObject3);
        ListOfNumbers result2 = findWithMaxAverage(listObject1, listObject2);

        System.out.println(result1);
        System.out.println(result2);

    }

    private static <T extends ListOfNumbers> T findWithMaxAverage(T... parameters){

        T max = parameters[0];
        for(T parameter: parameters){
            if(parameter.getAverage() > max.getAverage()){
                max = parameter;
            }
        }return max;
    }



}
