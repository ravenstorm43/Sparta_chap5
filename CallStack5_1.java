class CallStack5_1 {
    static void firstMethod() {
        System.out.println("firstMethod()");
        secondMethod();
    }
    // 스택 -> (first)
    static void secondMethod() {
        System.out.println("secondMethod()");
        thirdMethod();
    }
    // 스택 -> (first, second)
    static void thirdMethod() {
        System.out.println("thirdMethod()");
        finalMethod();
    }
    // 스택 -> (first, second, third)
    static void finalMethod() {
        System.out.println("finalMethod()");
    }
    // 스택 -> (first, second, third, final)
    public static void main(String[] args) {
        firstMethod();
    }
}
