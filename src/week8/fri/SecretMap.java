package week8.fri;

import week8.thu.Solution;

public class SecretMap {

    /*
    n으로 배열의 길이를 정함. 반복횟수를 정함.
    반복문 : 2진수로 변환 후 문자열로만들고 변환된 문자열을 ex: "01001" 을 split으로 한글자씩 나누어 배열에저장
    한글자씩 비교해 정답작성
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String result = "";

        for(int i= A; i>0; i=i/2){
            result = String.valueOf(i%2) + result;
            System.out.println(result);
        }

        System.out.println(result);

    }
    //내가생각한거
    public String makeBinary(int A) {
        String result = "";

        for(int i= A; i>0; i=i/2){
            result = String.valueOf(i%2) + result;
            System.out.println(result);
        }

        System.out.println(result);
        return result;
    }
    //강사님이해주신거
    String getBinaryString(int decNum) {
        String answer = "";
        while (decNum > 0) {
            answer += decNum % 2;
            decNum /= 2;
        }
        return answer;
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};


        return answer;
    }
}
