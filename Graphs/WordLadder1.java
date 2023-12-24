package Graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    String word;
    int steps;

    Pair(String word, int steps) {
        this.word = word;
        this.steps = steps;
    }
}

public class WordLadder1 {

    static int wordLadder(String stWord, String endWord, String[] valid) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(stWord, 1));

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < valid.length; i++) {
            set.add(valid[i]);
        }

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            String word = pair.word;
            int steps = pair.steps;
            if (word.equals(endWord))
                return steps;

            // one by one replace each character of word, if that word
            // is present in hashset, its a valid word

            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char[] replacedCharArray = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);

                    if (set.contains(replacedWord)) {
                        set.remove(replacedWord);
                        queue.add(new Pair(replacedWord, steps + 1));
                    }
                }
            }
        }

        return 0;
    }
}
