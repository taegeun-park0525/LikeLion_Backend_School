package Week6.Thu.Algorithm;

import Week6.Tue.Algorithm.HashTable;

import java.util.ArrayList;

public class NotFinishPlayer {
    //동명이인이 있을수 있다 => 해쉬로 값을 다르게 저장해라
    //
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashTable participantHT = new HashTable();
        for (int i = 0; i < participant.length; i++) {
            participantHT.insert(participant[i], participantHT.hash(participant[i]));
        }

        HashTable completionHT = new HashTable();
        for (int i = 0; i < completion.length; i ++) {
            completionHT.insert(completion[i], completionHT.hash(participant[i]));
        }


        return answer;
    }

    public static void main(String[] args) {
        NotFinishPlayer nfp = new NotFinishPlayer();
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden, kiki"};
        nfp.solution(participant, completion);
    }
}
