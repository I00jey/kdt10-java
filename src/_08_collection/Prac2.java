package _08_collection;

import java.util.*;

public class Prac2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("이름 입력 : ");
            String name = scanner.next();
            if (name.equals("종료")) {
                break;
            }
            System.out.print("나이 입력 : ");
            int age = scanner.nextInt();


            map.put(name, age);
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        System.out.println("== 입력받은 이름과 나이 목록 ==");
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> hang = entryIterator.next();
            System.out.printf("이름 : %s, 나이 : %d %n%n", hang.getKey(), hang.getValue());
        }
    }

}
