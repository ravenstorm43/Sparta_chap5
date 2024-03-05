class Tv9_1 {
    boolean power;
    int channel;
    String color;
    long price;

    // 생성자를 만들지 않으면 컴파일러가 자동으로 추가함
    public Tv9_1() {
        power = false;
        channel = 1;
    } // 초기값이 필요한 값들을 초기화해주는 기본 생성자
    // 생성자를 따로 정의하면 기본생성자를 컴파일러가 자동으로 추가하지 않음
    public Tv9_1(String color, long price) {
        power = false;
        channel = 1;
        this.color = color; // this.color는 인스턴스변수 color, 그냥 color는 매개변수이자 지역변수 color
        this.price = price;
    } // 오버로딩한 생성자, color와 price도 초기화해줌

    void power() {
        power = !power;
        if (power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() {
        channel++;
        System.out.println("채널 증가");
    }
    void channelDown() {
        channel--;
        System.out.println("채널 감소");
    }
}

class Tv9_1Main {
    public static void main(String[] args) {
        Tv9_1 tv = new Tv9_1();
        System.out.println("기본 생성자 TV: ");
        tv.power();

        Tv9_1 exTv = new Tv9_1("보라색", 3456789);
        System.out.println("오버로딩 생성자 TV");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);

        Tv9_1 tv2 = new Tv9_1();
    }
}
