package com.company;

public class Main {

    public static void main(String[] args) {
        final int max = 107; // Максимальное число
        final int generateRandomAge = generateRandomAge(max);
        System.out.println("Вы сгенерировали случайное число:" + generateRandomAge);
    }
    public static int generateRandomAge(int max){
        return (int) (Math.random() * ++max);

    }
}
