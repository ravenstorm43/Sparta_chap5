class Tv10_1 {
    boolean power;
    int channel;
    String color;
    long price;

    public Tv10_1() {
        this.power = false;
        this.channel = 1;
    }

    public Tv10_1(String color, long price) {
        this.power = false;
        this.channel = 1;
        this.color = color;
        this.price = price;
    }
    void power() {
        this.power = !power;
        if (this.power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }
    void channelUp() {
        this.channel++;
        System.out.println("채널 증가");
    }
    void channelDown() {
        this.channel--;
        System.out.println("채널 감소");
    }
    // 색깔을 수정하고 객체 자기 자신을 반환하는 메서드
    Tv10_1 changeColor(String color) {
        this.color = color;
        System.out.println("색깔 변경 완료!");
        return this; // this는 자기 자신을 가리키는 참조변수
    }
}

class Tv10_1Main {
    public static void main(String[] args) {
        // 기본 초기화된 Tv10_1 생성
        Tv10_1 tv = new Tv10_1();
        System.out.print("기본 생성자 Tv10_1: ");
        tv.power();

        // 오버로딩 생성자로 초기화한 Tv10_1 생성
        Tv10_1 exTv = new Tv10_1("보라색", 3456789);
        System.out.print("오버로딩 생성자 Tv10_1: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);
        System.out.println();

        // exTv의 색깔을 수정하고 수정된 객체의 참조변수를 exTvThis에 저장
        Tv10_1 exTvThis = exTv.changeColor("파란색");
        System.out.println("색깔이 변경되었는지 확인 exTvThis.color : " + exTvThis.color);
        System.out.println("exTv.color = " + exTv.color);
        //exTvThis와 exTv가 가리키는 메모리주소는 같기에 exTv의 color도 같이 변경됨
    }
}