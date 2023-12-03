import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        System.out.println("4.Написать обобщенный класс MinMax, который содержит методы для нахождения минимального" +
                "\nи максимального элемента массива. Массив является переменной класса. Массив должен передаваться" +
                "\nв класс через конструктор");
        MinMax<Character> aChar=new MinMax<>(new Character[]{(char)((new Random()).nextInt(26)+'a'),(char)((new Random()).nextInt(26)+'a'),(char)((new Random()).nextInt(26)+'a'),(char)((new Random()).nextInt(26)+'a')});
        printMinMaxInfo(aChar);
        System.out.println();
        MinMax<Integer> aInt=new MinMax<>(new Integer[]{new Random().nextInt(100),new Random().nextInt(100),new Random().nextInt(100),new Random().nextInt(100)});
        printMinMaxInfo(aInt);
        System.out.println();
        MinMax<Double> aDouble=new MinMax<>(new Double[]{new Random().nextDouble(100),new Random().nextDouble(100),new Random().nextDouble(100),new Random().nextDouble(100)});
        printMinMaxInfo(aDouble);
        System.out.println();
        System.out.println("Написать класс Калькулятор (необобщенный), который содержит обобщенный статические" +
                "\nметоды-sum,multiply,divide,substraction. Параметры этих методов-два числа разного типа, над которыми" +
                "\nдолжна быть произведена операция");
        printAllResults(getArrayOfCalcOperations());
    }
    public static void printMinMaxInfo(MinMax<?> arr){
        System.out.println(arr);
        System.out.println("Минимальный элемент-\'"+arr.getMinElement()+'\'');
        System.out.println("Максимальный элемент-\'"+arr.getMaxElement()+'\'');
    }
    public static double[] getArrayOfCalcOperations() {
        return new double[]{Calculator.divide(34, 1.24), Calculator.sum((short) 5, 173L), Calculator.multiply((byte) 87, 24.4f), Calculator.subtraction((long) 526371, (short) 2)};
    }
    public static void printAllResults(double[] results) {
        NumberFormat nf = getNumberFormat();
        for (double result : results) {
            System.out.println("результат = " + nf.format(result) + " ");
        }
    }
    public static NumberFormat getNumberFormat(){
        NumberFormat nf= NumberFormat.getInstance(Locale.ROOT);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf;
    }
}
