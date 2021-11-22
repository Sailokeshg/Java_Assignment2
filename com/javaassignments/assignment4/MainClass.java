package com.javaassignments.assignment4;

import java.text.ParseException;
import java.util.Scanner;

public class MainClass {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            String[] formDates = new String[n];
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                formDates[i] = scanner.nextLine();
            }
            for (String dates : formDates) {
                String registerDate = dates.split(" ")[0];
                String today = dates.split(" ")[1];
                try {
                    Kyc kyc = new Kyc();
                    kyc.getRange(registerDate, today);
                }
                catch (ParseException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        }
    }

