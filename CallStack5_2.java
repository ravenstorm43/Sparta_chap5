class CallStack5_2 {
    static void firstMethod() {
        secondMethod();
        System.out.println("firstMethod()");
    }
    // 스택 -> (first)
    static void secondMethod() {
        thirdMethod();
        System.out.println("secondMethod()");
    }
    // 스택 -> (first, second)
    static void thirdMethod() {
        finalMethod();
        System.out.println("thirdMethod()");
    }
    // 스택 -> (first, second, third)
    static void finalMethod() {
        System.out.println("finalMethod");
    }
    // 스택 -> (first, second, third, final)
    // finalMethod() 출력후
    // 스택 -> (first, second, third)
    // 스택 -> (first, second)
    // 스택 -> (first)
    public static void main(String[] args) {
        firstMethod();
    }
}
