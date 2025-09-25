package ch08.unit08;

public class EX02 {
    public static void main(String[] args) {
        System.out.println(City.SEOUL);
        // toString을 재정의했기 때문에 "서울인구 :1000만명" 출력됨

        System.out.println("\n전체 리스트");

        System.out.println("서울 : " + City.SEOUL.getEcount());

        // 전체 도시 출력
        for (City c : City.values()) {
            System.out.println(c.getName() + ", " + c.getEcount());
        }
    }
}

// 열거형에 값을 할당
enum City {
    SEOUL("서울", 1000),
    BUSAN("부산", 250),
    INCHEON("인천", 300);

    private String name;
    private int count;

    // 생성자 (private 생략 가능)
    City(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getEcount() {
        return count;
    }

    @Override
    public String toString() {
        return this.name + "인구 :" + this.count + "만명";
    }
}
