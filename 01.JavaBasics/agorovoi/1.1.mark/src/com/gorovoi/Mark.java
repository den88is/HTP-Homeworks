package com.gorovoi;

import java.util.Random;

//Average mark

public class Mark {

    public static void main(String[] args) {

        System.out.println("Таблица успеваемости");
        System.out.println();

        Random number = new Random();
        int studentCount = number.nextInt(11) + 15;
        int numOfLesson = number.nextInt(5) + 8;

        int[][] table = new int[studentCount][numOfLesson];

        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                table[row][column] = number.nextInt(10) + 1;
            }
        }

        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                System.out.print(" " + table[row][column]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Средние оценки по предметам");
        System.out.println();

        double[] averageMarkLesson = new double[table.length];
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                averageMarkLesson[row] += (double) table[row][column];
            }
            averageMarkLesson[row] /= numOfLesson;
        }

        for (int row = 0; row < numOfLesson; row++) {
            System.out.printf("%5.2f" + " ", averageMarkLesson[row]);
        }

        System.out.println();
        System.out.println("Средние оценки учеников");
        System.out.println();

        double[] averageStudMark = new double[studentCount];
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; row < table[row].length; column++) {
                averageStudMark[row] += (double) table[row][column];
            }
            averageStudMark[row] /= (double) studentCount;
        }

        for (int row = 0; row < studentCount; row++) {
            System.out.printf("%5.2f" + " ", averageStudMark[row]);
        }

        System.out.println();
        System.out.println("Средняя оценка по классу");
        System.out.println();

        double averageMarkClass = 0.0;
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                averageMarkClass += (double) table[row][column];
            }
        }

        averageMarkClass = averageMarkClass/(studentCount*numOfLesson);

        System.out.printf("%5.2f", averageMarkClass);

        System.out.println();
        System.out.println("Максимальная и минимальная оценки");
        System.out.println();

        mark_1:
        for (int mark = 0; mark <= 10; mark++) {
            for (int row = 0; row < table.length; row++) {
                for (int column = 0; column < table[row].length; column++) {
                    if (table[row][column] == mark) {
                        System.out.println("Минимальная оценка в классе =" + mark);
                        break mark_1;
                    }
                }
            }
        }

        mark_2:
        for (int mark = 11; mark >= 1; mark--) {
            for (int row = 0; row < table.length; row++) {
                for (int column = 0; column < table[row].length; column++) {
                    if (table[row][column] == mark) {
                        System.out.println("Максимальная оценка в классе =" + mark);
                        break mark_2;
                    }
                }
            }
        }

    }
}
