package singleton;

public class SingletonService {

    // 1. 클래스 내부에서 private static으로 유일한 인스턴스 생성
    private static final SingletonService instance = new SingletonService();

    // 2. public 메서드를 통해 외부에서 인스턴스에 접근할 수 있도록 함
    public static SingletonService getInstance() {
        return instance;
    }

    // 3. 생성자를 private으로 선언하여 외부에서 직접 객체를 생성하지 못하도록 함
    private SingletonService() {
    }

    // 4. 유일한 인스턴스의 로직을 수행하는 메서드
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
