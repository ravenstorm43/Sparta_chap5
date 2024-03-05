class StaticMethod7_1 {
//    int num1, num2; // 인스턴스 변수

    static int num1 = 10, num2 = 20; // 클래스 변수

    static int add(int num1, int num2) {
        System.out.println();
        System.out.println("매개변수로 입력 받은 num1, num2 확인");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //num1, num2는 add함수의 지역변수
        //인스턴스 변수는 클래스 메서드에서 사용 불가능
        //클래스 변수는 클래스 메서드에서 사용 가능

        System.out.println("클래스변수 확인");
        System.out.println("StaticMethod7_1.num1 = " + StaticMethod7_1.num1);
        System.out.println("StaticMethod7_1.num2 = " + StaticMethod7_1.num2);

        System.out.println("num1 + num2 = " + (num1 + num2));
        return num1 + num2;
    }
}

class StaticMethod7_1Main {
    public static void main(String[] args) {
        StaticMethod7_1 methodTest = new StaticMethod7_1();
        methodTest.num1 = 10;
        methodTest.num2 = 20;

        methodTest.add(methodTest.num1, methodTest.num2);

        StaticMethod7_1.add(methodTest.num1, methodTest.num2);
    }
}
