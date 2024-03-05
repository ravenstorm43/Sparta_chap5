class InstMethod7_1 {
    int num1, num2; // 인스턴스 변수
    static int num3 = 100; // 클래스 변수

    int add(int num1, int num2) { // 인스턴스 메서드
        System.out.println();
        System.out.println("매개변수로 입력 받은 num1, num2 확인");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //num1, num2는 지역변수

        System.out.println("this.num1 = " + this.num1);
        //여기서의 num1은 인스턴스변수

        System.out.println("매개변수 이자 지역변수 num1 = " + num1);
        //여기서의 num1은 지역변수

        return num1 + num2;
        // 매개변수끼리의 합을 리턴

        //return this.num1 + this.num2;
        // 인스턴스 변수끼리의 합을 리턴
    }
}

class InstMethod7_1Main {
    public static void main(String[] args) {
        InstMethod7_1 methodTest = new InstMethod7_1();
        methodTest.num1 = 10;
        methodTest.num2 = 20;

        System.out.println("result : " + methodTest.add(methodTest.num1, methodTest.num2));
        System.out.println("result : " + methodTest.add(80, 90));
    }
}

