package com.example.demo.evaluacion.app.controller;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;

@Service
public class LottoService {

    public int[] generateSpanishLottoCombination() {
        int minNumber = 1;
        int maxNumber = 49;
        int combinationLength = 6;
        int[] combination = new int[combinationLength];
        Random random = new Random();

        for (int i = 0; i < combinationLength; i++) {
            int randomNumber;
            boolean isDuplicate;

            do {
                isDuplicate = false;
                randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

                for (int j = 0; j < i; j++) {
                    if (combination[j] == randomNumber) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);

            combination[i] = randomNumber;
        }

        Arrays.sort(combination);
        return combination;
    }
    
    public int[] generateFrenchLottoCombination() {
        int minNumber = 1;
        int maxNumber = 49;
        int combinationLength = 5;
        int[] combination = new int[combinationLength];
        Random random = new Random();

        for (int i = 0; i < combinationLength; i++) {
            int randomNumber;
            boolean isDuplicate;

            do {
                isDuplicate = false;
                randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

                for (int j = 0; j < i; j++) {
                    if (combination[j] == randomNumber) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);

            combination[i] = randomNumber;
        }

        Arrays.sort(combination);
        return combination;
    }
    
    public int[] generateItalianLottoCombination() {
        int minNumber = 1;
        int maxNumber = 90;
        int combinationLength = 6;
        int[] combination = new int[combinationLength];
        Random random = new Random();

        for (int i = 0; i < combinationLength; i++) {
            int randomNumber;
            boolean isDuplicate;

            do {
                isDuplicate = false;
                randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

                for (int j = 0; j < i; j++) {
                    if (combination[j] == randomNumber) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);

            combination[i] = randomNumber;
        }

        Arrays.sort(combination);
        return combination;
    }

}
