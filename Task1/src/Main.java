public class Main {

    public static final String RUSSIAN_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static void main(String[] args) {
        for (int i=0; i<RUSSIAN_ALPHABET.length(); i++)
            System.out.println(RUSSIAN_ALPHABET.charAt(i) + "-" + (int)RUSSIAN_ALPHABET.charAt(i));
    }
}