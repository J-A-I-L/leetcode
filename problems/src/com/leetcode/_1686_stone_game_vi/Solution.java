package com.leetcode._1686_stone_game_vi;

import java.util.PriorityQueue;

class Solution {
    static class ChoiceInTurn implements Comparable<ChoiceInTurn>{
        int differenceInPoints;
        int i;

        public ChoiceInTurn(int differenceInPoints, int i) {
            this.differenceInPoints = differenceInPoints;
            this.i = i;
        }

        @Override
        public int compareTo(ChoiceInTurn choiceInTurn) {
            return choiceInTurn.differenceInPoints - this.differenceInPoints;
        }
    }

    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int result = 0;
        boolean isAlicesTurn = true;

        PriorityQueue<ChoiceInTurn> priorityChoice = new PriorityQueue<>();

        for(int i = 0; i < aliceValues.length; i++){
            priorityChoice.add(new ChoiceInTurn(aliceValues[i] + bobValues[i], i));
        }

        while(!priorityChoice.isEmpty()){
            ChoiceInTurn bestChoice = priorityChoice.poll();
            if(isAlicesTurn){
                result += aliceValues[bestChoice.i];
            }else{
                result -= bobValues[bestChoice.i];
            }
            isAlicesTurn = !isAlicesTurn;
        }

        return Integer.compare(result, 0);
    }
}
