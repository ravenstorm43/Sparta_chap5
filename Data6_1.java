class Data6_1 {
    int x; //기본형
    int y; // 기본형
}

class Data6_1Main {
    public static void main(String[] args) {
        Data6_1 data = new Data6_1();
        data.x = 10;
        data.y = 20;

        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수 x, y 값 확인");
        System.out.println("data 인스턴스 변수 x = " + data.x);
        System.out.println("data 인스턴스 변수 y = " + data.y);
        System.out.println();

        // changeParameter 메서드 의 매개변수에 Data 클래스의 인스턴스 변수를 입력한다
        System.out.println("입력받은 매개변수의 값을 바꾸는 메소드 수행");
        changeParameter(data.x, data.y);
        System.out.println();

        // changeParameter(data.x, data.y);에서 data.x 와 data.y하고
        // changeParameter에서 사용된 지역변수 x와 y는 값만 같은 별개의 변수임
        // changeParameter에서 값을 변경해도 data.x, data.y는 변하지 않음
        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수의 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 x = " + data.x);
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 x = " + data.y);;
    }
    static void changeParameter(int x, int y) {
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 x 와 y의 값 확인");
        System.out.println("입력 받은 매개변수 x = " + x);
        System.out.println("입력 받은 매개변수 y = " + y);
        x = 100;
        y = 200;
        System.out.println("변경한 후 x = " + x);
        System.out.println("변경한 후 y = " + y);
        System.out.println("changeParameter 메서드 끝");
    }
}

