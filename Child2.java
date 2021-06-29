public class Child2 extends Parent {
    Child2(){
        this("a");
        System.out.println("Child2の引数なしコンストラクタが呼ばれました");
    }
    Child2(String a) {
        System.out.println("Child2の引数付きのコンストラクタが呼ばれました");
    }
}
