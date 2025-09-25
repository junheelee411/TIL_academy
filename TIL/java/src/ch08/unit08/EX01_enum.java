package ch08.unit08;

public class EX01_enum {

    public static void main(String[] args) {
        System.out.println(Color.RED); // RED 출력

        // 열거형 상수의 기수(선언 위치) 출력
        for (Color c : Color.values()) {
            System.out.println(c + " -> " + c.ordinal());
        }

        System.out.println(Color.BLUE.ordinal());
        System.out.println(Color.RED.ordinal());
        System.out.println();

        // 지정된 이름의 열거형 반환
        Color c = Color.valueOf("RED");
        System.out.println(c);
        System.out.println();

        Test1 t = new Test1();
        t.setColor(Color.BLUE);

        // switch에서는 enum명 생략 가능 (Color 생략)
        switch (t.getColor()) {
            case RED:
                System.out.println("red");
                break;
            case GREEN:
                System.out.println("green");
                break;
            case BLUE:
                System.out.println("blue");
                break;
        }
    }

    // ✅ 중첩 enum
    enum Color {
        RED, GREEN, BLUE
    }

    // ✅ 중첩 클래스
    static class Test1 {
        private Color color = Color.RED;

        public void setColor(Color color) {
            this.color = color;
        }

        public Color getColor() {
            return color;
        }
    }
}
