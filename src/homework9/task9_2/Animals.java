package homework9.task9_2;

import java.util.LinkedList;

public class Animals {
    /*
    Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
     */

    LinkedList<String> animals = new LinkedList<>();

    void addAnimal(String newAnimal) {
        animals.addFirst(newAnimal);
    }

    void removeAnimal() {
        if (!animals.isEmpty()) {
            animals.removeLast();
        }
    }

    public String toString() {
        return animals.toString();
    }

}
