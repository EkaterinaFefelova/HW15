import java.util.Scanner;

public class Main {

    public static final String VALID_STRING = " -АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";


    public static void main(String[] args) {
    String input = getInput();
    if(validateInput(input))
        printFIO(input);
    }

    public static String getInput(){
        System.out.println("Пожалуйста, введите свои фамилию, имя и отчество, разделенные пробелами: ");
        return new Scanner(System.in).nextLine().trim();
    }

    public static boolean validateInput (String input){
        boolean isValid = true;

        for (int i=0; i<input.length(); i++) {
            if (!VALID_STRING.contains(String.valueOf(input.charAt(i)))) {
                isValid = false;
                break;
            }
        }

        int spaces = 0;
        for (int i=0; i<input.length(); i++){
            if (input.charAt(i)== ' ')
                spaces++;
        }
        if (spaces!=2)
            isValid = false;

        if (!isValid)
            System.out.println("Введенная строка не является ФИО!");

        return isValid;
    }

    public static void printFIO(String input){
        System.out.println("Фамилия: " + input.substring(0, input.indexOf(' ')));
        System.out.println("Имя: " + input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim());
        System.out.println("Отчество: " + input.substring(input.lastIndexOf(' ')).trim());
    }
}