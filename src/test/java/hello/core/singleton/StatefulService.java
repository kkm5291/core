package hello.core.singleton;

public class StatefulService {

//    private int price; //상태를 유지하는 필드 (이렇게 사용하면 안됨)

    // stateful한 상태 (절대로 이렇게 쓰면 안됨)
//    public void order(String name, int price) {
//        System.out.println("name = " + name + " price = " + price);
//        this.price = price; // 여기가 문제
//    }


    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
