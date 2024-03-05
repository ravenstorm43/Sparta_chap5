class Overloading8_1 {
    int add(int a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }
    long add(long a, long b) {
        System.out.println("long add(long a, long b)");
        return a + b;
    }
    long add(long a, int b) {
        System.out.println("long add(long a, int b)");
        return a + b;
    }
    long add(int a, long b) {
        System.out.println("long add(int a, long b)");
        return a + b;
    }
//    void add(int a, int b) {
//        System.out.println("void add(int a, int b)");
//        System.out.println("a + b = " + a + b);
//    }
//     void 리턴형으로 오버로딩은 할 수 없음
}
// 입력하는 값이 다르지만 같은 기능을 수행하는 경우가 많을 때 사용성 및 효율을 높이기 위해 오버로딩을 사용
class Overloading8_1Main {
    public static void main(String[] args) {
        Overloading8_1 test = new Overloading8_1();
        System.out.println(test.add(10, 20));
        System.out.println(test.add(13L, 17L));
        System.out.println(test.add(5L, 10));
        System.out.println(test.add(12, 23L));

        System.out.println();
    }
}