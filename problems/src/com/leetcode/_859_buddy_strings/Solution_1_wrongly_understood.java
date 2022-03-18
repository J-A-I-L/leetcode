package com.leetcode._859_buddy_strings;

import java.util.ArrayList;
import java.util.List;

class Solution_1_wrongly_understood {
    public boolean buddyStrings(String s, String goal) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                indices.add(i);
            }
        }

        return indices.size() == 2 && !indices.get(0).equals(indices.get(1));
    }
}
