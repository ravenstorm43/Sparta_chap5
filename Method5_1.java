class Method5_1 {
    int add(int x, int y) {
        int result = x + y;
        return result; // 값을 반환
    }
}

class Method5_1Main {
    public static void main(String[] args) {
        Method5_1 method = new Method5_1(); // Method5_1 클래스에 만든 메서드 add를 사용하기 위해 객체 생성

        int result = method.add(3, 5);
        System.out.println("result = " + result);
    }
}