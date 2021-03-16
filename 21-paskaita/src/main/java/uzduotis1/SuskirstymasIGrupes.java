package uzduotis1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SuskirstymasIGrupes implements Comparator<Student> {

    public List<Student[]> suskirstyti(List<Student> studentai, int skaiciusGrupiu) {
      List[] splitted = new List[skaiciusGrupiu];
      int arrayLenght = studentai.size();

      for(int i = 0; i < arrayLenght; i = i + skaiciusGrupiu){
          Student[]val = new Student[skaiciusGrupiu];

          if (arrayLenght < i + skaiciusGrupiu){
              skaiciusGrupiu = arrayLenght -i;

          }
          
      }return null;

    }


    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}
