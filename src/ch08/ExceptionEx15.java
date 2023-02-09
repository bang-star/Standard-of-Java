package ch08;

import java.io.File;

public class ExceptionEx15 {
    /**
     * 예외가 발생한 메서드에서 직접 예외를 처리하도록 한 파일 생성 예제
     * @param args
     */
    public static void main(String[] args) {
        File file = createFile(args[0]);
        System.out.println(file.getName() + " 파일이 성공적으로 생성되었습니다.");
    }

    private static File createFile(String filename) {
        try {
            if(filename == null || filename.equals("")) {
                throw new Exception("파일이름이 유효하지 않습니다.");
            }

        }catch (Exception e) {
            filename = "제목없음.txt";      // fileName이 부적절한 경우, 파일이름을 '제목없음.txt'으로 한다.
        } finally {
            File f = new File(filename);
            createNewFile(f);
            return f;
        }
    }

    private static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) { }
    }
}
