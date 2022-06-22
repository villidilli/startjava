package topjava.startjava.lesson_1;

/*
Реализуйте Калькулятор, который должен уметь выполнять
математические операции (+, -, *, /, ^, %) над целыми
положительными числами:
○ для проверки знака математической операции воспользуйтесь
оператором if else
○ выведите на экран результат работы калькулятора с помощью
System.out.println()
*/

public class Calculator {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        char c = '*';

        if(c == '*'){
            System.out.println(a * b);
        }
    }
}
