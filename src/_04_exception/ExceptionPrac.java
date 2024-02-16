package _04_exception;

import java.util.*;

public class ExceptionPrac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 실습 1번
//        int[] intArray = {14, 552, 77, 8};
//        for (int i = 0; i <= 5; i++) {
//            try {
//                System.out.println(intArray[i]);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("인덱스가 범위를 벗어났습니다.");
//                continue;
//            }
//        }

        // 실습 2번
//        try {
//            System.out.print("배열 크기를 입력하세요 : ");
//            int arraySize = scanner.nextInt();
//            System.out.print("배열 요소를 입력하세요 : ");
//            int sum = 0;
//            for (int i = 0; i < arraySize; i++) {
//                sum += scanner.nextInt();
//            }
//            System.out.println("배열 평균 : " + (sum / arraySize));
//        } catch (ArithmeticException e) {
//            System.out.println("배열크기 오류 발생 >> " + e.toString());
//        } catch (InputMismatchException e) {
//            System.out.println("입력 자료형 오류 발생 >> " + e.toString());
//        }

        // 실습 2번 풀이
        try {
            // 배열 크기 입력
            System.out.print("배열 크기를 입력하세요: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
            }

            // 배열 생성
            int[] arr = new int[size];

            // 배열 요소 입력
            System.out.println(size + "개의 정수를 입력하세요:");
            int sum = 0;

            for (int i = 0; i < size; i++) {
                System.out.print("정수 " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }

            // 평균 계산
            double average = (double) sum / size;
            System.out.println("평균은 " + average + "입니다.");
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력 형식입니다. 정수를 입력하세요.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }


        // 실습 3번
//        try {
//            System.out.print("배열 크기를 입력하시오 : ");
//            //Scanner scanner = new Scanner(System.in);
//            int arraySize = scanner.nextInt();
//            System.out.println("배열 요소를 입력하시오");
//            ArrayList<Integer> intArray = new ArrayList<>();
//            ArrayList<Integer> resultArray = new ArrayList<>();
//            for (int i = 0; i < arraySize; i++) {
//                System.out.print("정수" + (i + 1) + ": ");
//                int input = scanner.nextInt();
//                if (!intArray.contains(input)) {
//                    intArray.add(input);
//                } else {
//                    resultArray.add(input);
//                }
//            }
//            Collections.sort(resultArray);
//            System.out.println("중복된 요소 : " + resultArray);
//
//        } catch (InputMismatchException e) {
//            System.out.println(e.toString());
//        } finally {
//            scanner.close();
//        }

        // 실습 3번 풀이
        /*        try {
            // 배열 크기 입력
            System.out.print("배열 크기를 입력하세요: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
            }

            // 배열 생성
            int[] arr = new int[size];

            // 배열 요소 입력
            System.out.println(size +"개의 정수를 입력하세요:");
            int sum = 0;

            for (int i = 0; i < size; i++) {
                System.out.print("정수 " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }

            // 평균 계산
            double average = (double) sum/size;
            System.out.println("평균은 " + average + "입니다.");
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력 형식입니다. 정수를 입력하세요.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }*/
    }
}
