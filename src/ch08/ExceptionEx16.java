package ch08;

import java.io.File;

public class ExceptionEx16 {
    /**
     * 예외가 발생한 메서드에서 직접 예외를 처리하지 않고
     * 호출한 메서드에서 예외처리를 진행한 파일 생성 예제
     * @param args
     */
    public static void main(String[] args) {
        try {
            File file = createFile(args[0]);
            System.out.println(file.getName() + " 파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " + 다시 입력해주세요.");
        }
    }

    private static File createFile(String filename) throws Exception {
        if (filename == null || filename.equals("")) {
            throw new Exception("파일이름이 유효하지 않습니다.");
        }

        File f = new File(filename);

        // File 객체의 createNewFile 메서드를 이용해서 실제 파일을 생성한다.
        f.createNewFile();
        return f;
    }

}
