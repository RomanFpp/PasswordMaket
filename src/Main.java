import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random rndm = new Random();

        System.out.print(StringStore.greetings + StringStore.warnings + "\n");
        StringBuilder stringBuilder = new StringBuilder();

        char[] symbolsArray = new char[]{
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'G', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'а', 'б', 'в', 'г', 'д', 'е',
                'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
                'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н',
                'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ы', 'Э', 'Ю', 'Я', '0', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', ' ', '¬', '!', '\"', '£', '$', '%', '^', '&', '*', '(', ')', '_', '+', '@', '}',
                '{', '~', '<', '>', '?', '\\', ';', 'ª', '·', '¿', '+', 'ç', '_', ':', '[', ']'
        };

        int a = Integer.parseInt(reader.readLine());

        for (int i = 0; i < a; i++) {
            int randomlLeter = rndm.nextInt(symbolsArray.length); // извлекаем случайную букву
            stringBuilder.append(symbolsArray[randomlLeter]); // формируем строку из букв
        }
        System.out.println(stringBuilder);
    }
}