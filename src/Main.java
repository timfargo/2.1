import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value = 33;
        Integer value2 = 33;
        Integer[] value3 = {3,4};
        Person person = new Person("Lyapis","Trubetskoy");
        changeValue(value);
        changeValue(person);
        System.out.println(value);
        System.out.println(Arrays.toString((value3)));
        System.out.println(person);
    }

    private static void changeValue(int value){
        value = 22;
    }

    private static void changeValue(Integer localValue){
        localValue = 22;
    }

    private static void changeValue2(Integer[] localValue){
        localValue = new Integer[]{1,2};
    }

    private static void changeValue3(Integer[] localValue){
        localValue[1] = 99;
    }

    private static void changeValue(Person localValue){
        localValue = new Person("Ilya","Lagutenko");
    }

    private static void changeValue5(Person localValue){
        localValue.setName("Ilya");
        localValue.setSurname("Lagutenko");
    }

}