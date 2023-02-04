package ch06.method;

public class MemberCall {
    int instanceVariable = 10;
    static int classVariable = 20;

    int instanceVariable2 = classVariable;
    // static int cv2 = instanceVariable;   에러. 클래스 변수는 인스턴스 변수를 사용할 수 없음.
    static int classVariable2 = new MemberCall().instanceVariable;

    static void staticMethod1() {
        System.out.println(classVariable);
        // System.out.println(instanceVariable); 에러. 클래스 메서드에서 인스턴스 변수를 사용할 수 없음.

        MemberCall memberCall = new MemberCall();
        System.out.println(memberCall.instanceVariable);
    }

    void instanceMethod1() {
        System.out.println(instanceVariable);
        System.out.println(classVariable);
    }

    static void staticMethod2() {
        staticMethod1();
        // instanceMethod1();

        MemberCall memberCall = new MemberCall();
        memberCall.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
