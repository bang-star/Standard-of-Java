package ch08;

public class NewExceptionTest {
    /**
     * 사용자 정의 예외를 실제 설치 프로그램과 유사하게
     * 구성하여 실습에 이해를 높인 예제
     * @param args
     */
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        }catch (SpaceException e) {
            System.out.println("에러 메시지 : " +  e.getMessage());
            e.printStackTrace();
            System.out.println("공간 확보 후 다시 시도해주세요.");
        } catch (MemoryException e) {
            System.out.println("에러 메시지 : " +  e.getMessage());
            e.printStackTrace();
            System.gc();
            System.out.println("다시 시도해주세요.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace()) {
            throw new SpaceException("설치한 공간이 부족합니다.");
        } else if(!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    static void copyFiles() {}
    static void deleteTempFiles() {}

    static boolean enoughSpace() {
        // 설치하는데 필요한 공간이 있는지 확인
        return false;
    }

    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리공간이 있는지 확인
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
