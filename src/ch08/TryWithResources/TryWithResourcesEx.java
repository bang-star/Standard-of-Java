package ch08.TryWithResources;

public class TryWithResourcesEx {
    /**
     * try-with-Resource 구조로 인터페이스를 이용해 자원을 반환시키는 예제로
     * 직접 close를 작성하지 않아도 내부적으로 호출됨을 확인할 수 있는 예제
     * @param args
     */
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false);    // 예외가 발생하지 않는다.
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }

        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true);     // 예외가 발생한다.
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
    }
}

class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork(" + exception + ") called");

        if (exception)
            throw new WorkException("WorkException occur!!!");
    }

    @Override
    public void close() throws CloseException {
        System.out.println("close() called");

        throw new CloseException("CloseException occur!!!");
    }
}

class WorkException extends Exception {
    WorkException(String msg) {
        super(msg);
    }
}

class CloseException extends Exception {
    CloseException(String msg) {
        super(msg);
    }
}