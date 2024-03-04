class Tv1_1 {
    // 속성 : 변수 선언
    String color; // 색깔
    boolean power = false; // 전원 : false로 초기화
    int channel = 1; // 채널 : 1로 초기화

    // 기능 : 메서드 선언
    void power() { // 전원 기능
       power = !power;
       if (power) {
           System.out.println("전원 ON");
       } else {
           System.out.println("전원 OFF");
       }
    }

    void channelUp() { // 채널 증가
        channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { // 채널 감소
        channel--;
        System.out.println("채널 감소");
    }
}

class Tv1_1Main {
    public static void main(String[] args) {
        Tv1_1 t1 = new Tv1_1(); // TV1_1형의 t1인스턴스
        t1.color = "검정색"; // 색깔 초기화
        Tv1_1 t2 = new Tv1_1(); // TV1_1형의 t2인스턴스
        t2.color = "흰색"; // 색깔 초기화

        System.out.println("TV1 인스턴스 색깔 = " + t1.color); // 검정색
        System.out.println("TV2 인스턴스 색깔 = " + t2.color); // 흰색

        t1.power(); // 메서드 호출
        System.out.println("TV1 인스턴스 채널 = " + t1.channel);

        t1.channelUp(); // 메서드 호출
        System.out.println("TV1 인스턴스 채널 = " + t1.channel);
        t1.channelDown(); // 메서드 호출
        System.out.println("TV1 인스턴스 채널 = " + t1.channel);

        t1.power(); // 메서드 호출

        // TV2 인스턴스 참조변수에 TV1 인스턴스 참조변수를 저장함
        t2 = t1;

        System.out.println("TV1 인스턴스 색깔 = " + t1.color); // 검정색
        System.out.println("TV2 인스턴스 색깔 = " + t2.color); // 검정색

        // t2에 저장된 t2 인스턴스의 주소 대신 t1 인스턴스의 주소가 저장됨
        // 원래 t2에 저장된 인스턴스는 접근할 수 없음
    }
}
