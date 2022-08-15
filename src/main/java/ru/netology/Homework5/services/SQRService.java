package ru.netology.Homework5.services;

public class SQRService {

    public int countSQR(long a, long b) {

        int count = 0;

        for (int i = 10; i <= 99; i++) {
            long value = i * i;

            if (value >= a & value <= b) {
                count = count + 1;
            }
        }
        return count;
    }
}
