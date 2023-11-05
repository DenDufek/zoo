package com.myzoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        // Додавання тварин до списку за допомогою методу add(index, element)
        animals.add(0, "Лев");
        animals.add(1, "Зебра");
        animals.add(2, "Слон");
        animals.add(3, "Тигр");
        animals.add(4, "Гепард");
        animals.add(5, "Жираф");
        animals.add(6, "Мавпа");
        animals.add(7, "Крокодил");

        // Виведення списку тварин у консоль
        System.out.println("Список тварин у зоопарку:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
