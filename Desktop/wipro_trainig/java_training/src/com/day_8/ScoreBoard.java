package com.day_8;

import java.util.HashMap;
import java.util.Scanner;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class ScoreBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        int topScore = -1;
        String topPlayer = "";

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter player " + i + " name: ");
            String name = sc.nextLine();

            System.out.print("Enter " + name + "'s score: ");
            int score = Integer.parseInt(sc.nextLine());

            map.put(name, score);

            if (score > topScore) {
                topScore = score;
                topPlayer = name;
            }
            System.out.println();
        }

        System.out.println("\n--- Scoreboard ---");
        for (String name : map.keySet()) {
            Integer score = map.get(name);
            System.out.println("Name: " + name + ", Score: " + score);
        }

        System.out.println("\nWinner: " + topPlayer + " with score " + topScore);

        System.out.println("\n--- Score Differences from Winner ---");
        for (String name : map.keySet()) {
            int diff = topScore - map.get(name);
            if (diff == 0) {
                System.out.println(name + ": Top Scorer!");
            } else {
                System.out.println(name + ": " + diff + " point(s) behind");
            }
        }

        sc.close();
    }
}
