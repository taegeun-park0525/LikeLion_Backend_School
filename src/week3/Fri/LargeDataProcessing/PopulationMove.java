package week3.Fri.LargeDataProcessing;

public class PopulationMove {
    private int outSido;    //전출
    private int comeSido;   //전입

    public PopulationMove(){}; // 기본생성자
    public PopulationMove(int outsido, int comeSido) { //전입 전출 코드를 받아 저장하는 생성자
        this.comeSido = comeSido;
        this.outSido = outsido;
    }
//게터 추가
    public int getOutSido() {
        return outSido;
    }

    public int getComeSido() {
        return comeSido;
    }
//세터추가
    public void setOutSido(int outSido) {
        this.outSido = outSido;
    }

    public void setComeSido(int comeSido) {
        this.comeSido = comeSido;
    }

    public PopulationMove parse(String data) { //문자열을 나누어 String[]을 만듦
        String dividedData[] = data.split(",");
        System.out.println(dividedData[0]);
        System.out.println(dividedData[6]);
        return new PopulationMove(Integer.parseInt(dividedData[0]), Integer.parseInt(dividedData[6]));
    }
}
