import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal animal = new Duck("오륑", 2);

        Class duck = Class.forName("Duck"); //이름으로 클래스 정보 가져오기

        // 접근 제어자가 private 이지만 실행 가능하게 하는 구문.
        Method nextYear = duck.getDeclaredMethod("nextYear");
        nextYear.setAccessible(true);
        nextYear.invoke(animal, null);  //메서드 호출(객체, 인자) 즉. age 1증가

        Method getAge = duck.getDeclaredMethod("getAge");
        int age = (int) getAge.invoke(animal, null);

        System.out.println("Age : " + age); // Age : 3
    }
}
