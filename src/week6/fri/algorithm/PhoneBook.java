package week6.fri.algorithm;

import java.util.HashSet;

public class PhoneBook {
    class Solution {
        /*
        전화번호 중 한 번호가 다른 번호의 접두어인 경우가 있는 지 확인하려함.
        .indexOf() 몇번째 인덱스에 해당 글자가 등장 하는지 리턴
        var => 타입 추론 : 타입이 자명할경우 (/는 다른타입가능해서 사용자제)
        for each 방식 사용
        속도를 나타내는 O(N^2) 는 무엇을 의미하는걸까..?

         핵심로직
         hashset에서 한개씩 뽑아서 ex) 12348765
         1  O(1)
         12  O(1)
         1234  O(1)
         12348  O(1)
         123487  O(1).... 20번 반복
         ...
         12348765를 hs에서 검색
         O(N^2) 이 아니라 O(20N)인 이유?
         hashset의 경우는 O(1)이기 때문
         O(20) 전화번호 하나가 최대 20글자이기 때문
         1,000,000 * 1,000,000 보다는 20 * 1,000,000이 훨씬 매우 아주 시발 존나 개같이 빠름
         중첩for문 어차피 써야한다.. -> 안쓰려하면 함정에 빠짐
          */

        public boolean solution(String[] phone_book) {
            HashSet<String> hs = new HashSet<>();
            boolean answer = true;
            for (var phone_num : phone_book) hs.add(phone_num);

            for (int i = 0; i < phone_book.length; i++) {
                for(int j = 0; j< phone_book[i].length(); j++) {
                    if(hs.contains(phone_book[i].subSequence(0,j))) answer = false;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println("12".indexOf("123"));
        // 결과 -1 왜냐하면 123은 12에 포함되지 않기 때문
        System.out.println("123".indexOf("12"));
        // 결과 0
    }
}
