package com.javacademy.insurance;

import java.util.Random;

/**
 * Генератор номеров договоров
 */
public class NumberGenerator {

    public String generateContractNumber() {
        Random random = new Random();
        int number = random.nextInt(1000);
        return String.valueOf(number);
    }
}
