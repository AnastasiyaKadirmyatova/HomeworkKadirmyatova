package homework9;

import java.util.HashMap;
import java.util.Map;

public class task9_3 {
    /*
    Задача 3:
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
     */
    public static Map<String, Boolean> wordMultiple(String[] words) {

        Map<String, Integer> countMap = new HashMap<>();

        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        Map<String, Boolean> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            result.put(entry.getKey(), entry.getValue() >= 2);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] test1 = {"a", "b", "a", "c", "b"};
        System.out.println(wordMultiple(test1));

        String[] test2 = {"c", "b", "a"};
        System.out.println(wordMultiple(test2));

        String[] test3 = {"c", "c", "c", "c"};
        System.out.println(wordMultiple(test3));
    }
}
