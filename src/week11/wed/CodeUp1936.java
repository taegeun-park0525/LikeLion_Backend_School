package week11.wed;

public class CodeUp1936 {
    /*
    공통된 부모를 찾을때까지 올라가야함
    올라가면서 count + 1을 해주며 거리를 계산
    부모가 N이면 자식은 2N+1, 2N+2임
    a,b 각각의 부모가 될수있는 노드들을 배열에 저장함
    비교해서 같은부모를 찾음
    각각의 인덱스를를 이용해 거리를 구해준다?? -> 너무 많이 자원소비할듯
    자식을 2로나누어줌 => 부모가됨
    ab 크기를 비교해서 나누고 그걸 비교하는 로직을 만든다
     */
    public static int findParents(int a, int b) {
        if(a == b) {
            return 0;
        }else if(a < b) {
            return findParents(a, b/2) +1;
        }else if(a > b) {
            return findParents(a/2, b)+1;
        }
        return 0;
    }

    public static void main(String[] args) {
    int a = 3;
    int b = 4;

        System.out.println(findParents(a,b));

    }
}
