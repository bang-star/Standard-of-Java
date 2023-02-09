# 예외처리(Exception Handling)

## 프로그램 오류

프로그램이 실행 중 어떤 원인에 의해서 오작동을 하거나 비정상적으로 종료되는 경우가 있다. 이러한 결과를 초래하는 원인을 프로그램 에러 또는 오류라고 한다.

이를 발생시점에 따라 '컴파일 에러(compile-time error)'와 '런타임 에러(runtime error)'로 나눌 수 있는데, 글자 그대로 '컴파일 에러'는 컴파일 할 때 발생하는 에러이고 프로그램의 실행도중에 발생하는 에러를 '런타임 에러'라고 한다. 이 외에도 '논리적 에러(logic error)'가 있는데, 컴파일도 잘되고 실행도 잘되지만 의도한 것과 다르게 동작하는 것을 말한다. 예를 들어, 창고의 재고가 음수가 된다던가, 게임 프로그램에서 비행기가 총알을 맞아도 죽지 않는 경우가 이에 해된다.

> **컴파일 에러**    컴파일 시에 발생하는 에러
> 
> **런타인 에러**    실행 시에 발생하는 에러
> 
> **논리적 에러**        실행은 되지만, 의도와 다르게 동작하는 것

소스 코드를 컴파일 하면 컴파일러가 소스코드(.java)에 대해 오타나 잘못된 구문, 자료형 체크 등의 기본적인 검사를 수행하여 오류가 있는지를 알려 준다. 컴파일러가 알려준 에러들을 모두 수정해서 컴파일을 성공적으로 마치고 나면, 클래스 파일(.class)이 생성되고, 생성된 클래스 파일을 실행할 수 있게 되는 것이다.

하지만 컴파일을 에러없이 성공적으로 마쳤다고 해서 프로그램의 실행 시에도 에러가 발생하지 않는 것은 아니다. 컴파일러가 소스코드의 기본적인 사항은 컴파일 시에 모두 걸러줄 수는 있지만, 실행도중에 발생할 수 있는 잠재적인 오류까지 검사할 수 없기 때문에 컴파일은 잘되었어도 실행 중에 에러의 의해서 잘못된 결과를 얻거나 프로그램이 비정상적으로 종료될 수 있다. 예를 들면 프로그램이 실행 중 동작은 멈춘 상태로 오랜 시간 지속되거나, 갑자기 프로그램이 실행을 멈추고 종료되는 경우 등이 이에 해당한다.

런타임 에러르 ㄹ방지하기 위해서는 프로그램의 실행도중 발생할 수 있는 모든 경우의 수를 고려하여 이에 대한 대비를 하는 것이 필요하다. 자바에서는 실행 시(runtime) 발생할 수 있는 프로그램 오류를 '에러(error)'와 '예외(exception)', 두 가지로 구분하였다.

에러는 메모리 부족(OutOfMemoryError)이나 스택오버플러우(StackOverflowError)와 같이 일단 발생하면 복구할 수 없는 심각한 오류이고, 예외는 발생하더라도 수습될 수 있는 비교적 덜 심각한 것이다.

에러가 발생하면, 프로글매의 비정상적인 종료를 막을 길이 없지만, 예외는 발생하더라도 프로그래머가 이에 대한 적절한 코드를 미리 작성해 놓음으로써 프로그램의 비정상적인 종료를 막을 수 있다.

> **에러(Error)**     프로그램 코드에 의해 수습될 수 없는 심각한 오류
> 
> **예외(Exception)** 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류


## 예외 클래스의 계층구조

자바에서는 실행 시 발생할 수 있는 오류(Exception과 Error)를 클래스로 정의하였다. 앞서 배운 것처럼 모든 클래스의 조상은 Object클래스이므로 Exception과 Error 클래스 역시 Object 클래스의 자손들이다.

![image](https://user-images.githubusercontent.com/22147400/217738949-35620723-657c-453c-9ce1-24de6a6f1e0f.png)

모든 예외의 최고 조상은 Exception 클래스이며, 상속계층도를 Exception 클래스부터 도식화하면 다음과 같다.

![image](https://user-images.githubusercontent.com/22147400/217739619-42bf264f-8559-42fb-b77a-18c842737be9.png)

위 그림에서 볼 수 있듯이 예외 클래스들은 다음과 같이 두 그룹으로 나눠질 수 있다.

> ① Exception 클래스와 그 자손들
> 
> ② RuntimeExeption클래스와 그 자손들

RuntimeExeption클래스와 그 자손 클래스들을 'RuntimeException클래스들'이라 하고, RuntimeException클래스들을 제외한 나머지 클래스들을 'Exception들'이라 하겠다.

RuntimeException클래스들은 주로 프로그래머의 실수에 의해 발생될 수 있는 예외들로 자바의 프로그래밍 요소들과 관계가 깊다. 예를들면, 배열의 범위를 벗어난 경우 IndexOutOfBoundsException, 값이 null인 참조변수의 멤버를 호출한 경우 NullPointerException, 클래스간의 형변환을 잘못한 경우 ClassCastException, 정수를 0으로 나누려고 한 경우 ArithmeticException이 발생한다.

Exception 클래스들은 주로 외부의 영향으로 발생할 수 있는 것들로서, 프로그램의 사용자들의 동작에 의해서 발생하는 경우가 많다. 예를 들면, 존재하지 않는 파일의 이름을 입력했다던가(FileNotFoundException), 실수로 클래스의 이름을 잘못 적었다던가(ClassNotFoundException), 또는 입력한 데이터 형식이 잘못된(DataFormatException) 경우에 발생한다.

> **Exception클래스들**     사용자의 실수와 같은 외적인 요소에 의해 발생하는 예외
> 
> **RuntimeException클래스들**  프로그래머의 실수로 발생하는 예외

## 예외처리하기(try-catch)

프로그램의 실행도중에 발생하는 에러는 어쩔 수 없지만, 예외는 프로그래머가 이에 대한 처리를 미리 해주어야 한다.

예외처리(Exception Handling)란, 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성한는 것이며, 예외처리의 목적은 예외의 발생으로 인한 실행 중인 프로그램의 갑작스런 비정상 종료를 막고, 정상적인 실행상태를 유지할 수 있도록 하는 것이다.

> 예외처리(Exception Handling)의
> - 정의 : 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
> - 목적 : 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것

발생한 예외를 처리하지 못하면, 프로그램은 비정상적으로 종료되며, 처리되지 못한 예외(uncaught exception)는 JVM의 '예외처리기(UncaughtExceptionHander)'가 받아서 예외의 원일을 화면에 출력한다.

예외를 처리하기 위해서는 try-catch 문을 사용하며, 그 구조는 다음과 같다.

```JAVA
try{
    // 예외가 발생할 가능성이 있는 문장의 코드
}catch(Exception1 e1) {
    // Exception1이 발생했을 경우에 대한 처리
}catch(Exception2 e2) {
    // Exception2이 발생했을 경우에 대한 처리
}catch(ExceptionN eN) {
    // ExceptionN이 발생했을 경우에 대한 처리
}
```

하나의 try블럭 다음에는 여러 종류의 예외를 처리할 수 있도록 하나 이상의 catch블럭이 올 수 있으며, 이 중 발생한 예외의 종류와 일치하는 단 한 개의 catch블럭만 수행된다. 발생한 예외의 종류와 일치하는 catch 블럭이 없으면 예외는 처리되지 않는다.

 - 참고 코드 > ExceptionEx1

위의 예제는 아무 일도 하지 않는다. 단순히 try-catch문의 사용 예를 보여주기 위해서 작성한 코드이다. 이처럼 하나의 메서드 내에 여러 개의 try-catch 문이 사용될 수 있으며, try 블럭 또는 catch 블럭에 또 다른 try-catch문이 포함될 수 있다. catch블럭 내의 코드에서도 예외가 발생할 수 있기 때문이다. catch 블럭의 괄호 내에 선언된 변수는 catch 블럭 내에서만 유효하기 때문에, 위의 모든 catch 블럭에 참조변수 'e' 하나 만을 사용해도 된다.

그러나 catch 블럭 내에 또 하나의 try-catch문이 포함되 ㄴ경우, 같은 이름의 참조변수를 사용해서는 안된다. 각 catch 블럭에 선언된 두 참조변수의 영역이 서로 겹치므로 다른 이름을 사용해야만 서로 구변되기 때문이다. 

 - 참고 코드 > ExceptionEx2

위의 예제는 변수 number에 저장되어 있는 값 100을 0~9 사이의 임의의 정수로 나눈 결과를 출력하는 일을 10번 반복한다. random()을 사용했기 때문에 매번 실행할 떄마다 결과가 다르겠지만, 대부분의 경우 10번이 출력되기 이전에 예외가 발생하여 프로그램이 비정상적으로 종료될 것이다.

![image](https://user-images.githubusercontent.com/22147400/217743493-6b2f8754-1f63-4c5f-8ed8-50a542adf303.png)

결과에 나타난 메시지를 보면 예외의 발생원인과 위치를 알 수 있다. 이 메시지를 보면 0으로 나누려 했기 때문에 'ArithmeticException'이 발생했고, 발생위치는 Exception2클래스의 main메서드(ExceptionEx2.java의 9번째 라인)라는 것을 알 수있다.

이제 어디서 왜 예외가 발생하는지 알았으니, 예외처리구문을 추가해서 실행도중 예외가 발생하더라도 프로그램이 실행 도중에 비정상적으로 종료되지 않도록 수정해보자.

- 참고 코드 > ExceptionEx3

![image](https://user-images.githubusercontent.com/22147400/217743898-cc1c8af2-df98-4636-b44f-7cb29b22e9e9.png)

ArithmeticException이 발생하더라도 위와 같이 예외처리하면, 프로그램이 비정상적으로 종료되지 않는다.

## try-catch 문에서의 흐름

try-catch 문에서, 예외가 발생한 경우와 발생하지 않았을 때의 흐름(문장의 실행순서)이 달라지는데, 아래에 이 두가지 경우에 따른 무장 실행순서를 정리하였다.

> ▶ try 블럭 내에서 예외가 발생한 경우
> 1. 발생한 예외와 일치하는 catch 블럭이 있는지 확인
> 2. 일치하는 catch 블럭을 찾게 되면, 그 catch 블럭 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 그 다음 문장을 계속해서 수행한다. 만일 일치하는 catch ㅁ블럭을 찾지 못하면, 예외는 처리되지 못한다.
>
> ▶ try 블럭 내에서 예외가 발생하지 않은 경우
> 1. catch 블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속한다.

 - 참고 코드 : ExceptionEx4, ExceptionEx5

## 예외의 발생과 catch 블럭

catch 블럭은 괄호()와 블럭{} 두 부분으로 나눠져 있는데, 괄호()내에는 처리하고자 하는 예외와 같은 타입의 참조변수 하나를 선언해야한다.

예외가 발생하면, 발생한 예외에 해당하는 클래스의 인스턴스가 만들어 진다. ExceptionEx5를 에시로 들면 ArithmeticException이 발생했으므로 ArithmeticException 인스턴스가 생성된다.

첫 번째 catch 블럭부터 차례로 내려가면서 catch 블럭의 괄호()내에 선언된 참조변수의 종류와 생성된 예외클래스의 인스턴스에 instanceOf 연산자를 이용해서 검사하게 되는데, 검사결과가 true 인 catch 블럭을 만날 때까지 검사는 계속된다.

검사결과가 true인 catch 블럭을 찾게되면 블럭에 있는 문장들을 모두 수행한 후에 try-catch문을 빠져나가고 예외는 처리되지만, 검사결과가 ture인 catch 블럭이 하나도 없으면 예외는 처리되지 않는다.

모든 예외 클래스는 Exception 클래스의 자손이므로, catch 블럭의 괄호()에 Exception 클래스 타입의 참조변수를 선언해 놓으면 어떤 종류의 예외가 발생하더라도 이 catch 블럭에 의해서 처리된다.

 - 참고 코드 : ExceptionEx6, ExceptionEx7


### printStackTrace()와 getMessage()

예외가 발생했을 때 생성되는 예외 클래스의 인스턴스에는 발생한 예외에 대한 정보가 담겨져 있으며, getMessage()와 printStackTrace()을 통해 이 정보들을 얻을 수 있다.

> **printStackTrance()**    예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
> 
> **getMessage()**          발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻을 수 있다. 

 - 참고 코드 : ExceptionEx8

![image](https://user-images.githubusercontent.com/22147400/217747196-a3dd06d1-7206-41b2-a468-b94ec2f80002.png)

위 에제의 결과는 예외가 발생해서 비정상적으로 종료되었을 때의 결과와 비슷하지만 예외는 try-catch문에 의해 처리되었으며 프로그램은 정상적으로 종료되었다.

그 대신 ArithmeticException 인스턴스의 printStackTrace()를 사용해서, 호출스택(call Stack)에 대한 정보와 예외 메시지를 출력하였다. 이처럼 try-catch문으로 예외처리를 하여 예외가 발생해도 비정상적으로 종료하지 ㅇ낳도록 해주는 동시에, printStackTrace() 또는 getMessage() 와 같은 메서드를 통해서 예외의 발생원인을 알 수 있다.


### 멀티 catch 블럭

JDK 1.7부터 여러 catch 블럭을 '|'기호를 이용해서, 하나의 catch 블럭으로 합칠 수 있게 되었으며, 이를 '멀티 catch 블럭'이라 한다. 아래의 코드에서 알 수 있듯이 '멀티 catch 블럭을' 이용하면 중복된 코드를 줄일 수 있다. 그리고 '|' 기호로 연결할 수 있는 예외 클래스의 개수에는 제한 이 벗다.

> [참고] 멀티 catch 블럭에 사용되는 '|'는 논리 연산자가 아니라 기호이다.

![image](https://user-images.githubusercontent.com/22147400/217748399-aeec0a3c-2427-4c77-b709-89a6adef09e0.png)

만일 멀티 catch 블럭의 '|'기호로 연결된 예외 클래스가 조상과 자손의 관계에 있다면 컴파일 에러가 발생한다.

왜냐하면 두 에외 클래스가 조상과 자손의 관계에 있다면, 그냥 다음과 같이 조상 클래스만 써주는 것과 똑같기 때문이다. 불필요한 코드는 제거하라는 의미에서 에러가 발생하는 것이다.

멀티 catch는 하나의 catch 블럭으로 여러 예외를 처리하는 것이기 때문에, 발생한 예외를 멀티 catch 블럭으로 처리하게 되었을 때, 멀티 catch 블럭 내에서는 실제로 어떤 예외가 발생한 것인지는 알 수 없다. 그래서 참조변수 e로 멀티 catch 블럭 '|'기호로 연결된 예외 클래스들의 공통 분모인 조상 예외 클래스에 선언된 멤버만 사용할 수 있다.

필요하다면, instanceOf 로 어떤 예외가 발생한 것인지 확인하고 개별적으로 처리할 수있는 있다. 그러나 이렇게까지 해가면서 catch 블럭을 합칠 일은 거의 없을 것이다.

마지막으로 멀티 catch 블럭에 선언된 참조변수는 e는 상수이므로 값을 변경할 수 없다는 제약이 있는데, 이것은 여러 catch 블럭이 하나의 참조변수를 공유하기 때문에 생기는 제약으로 실제로 참조변수의 값을 바꿀 일은 없을 것이다.

## 예외 발생시키기

키워드 throw를 사용해서 프로그래머가 고의로 예외를 발생시킬 수 있으며, 방법은 아래의 순서를 따르면 된다.

> 1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만들고 
> 2. 키워드 throw를 이용해서 예외를 발생시킨다.

 - 참고 코드 : ExceptionEx9, ExceptionEx10, ExceptionEx11

Exception 인스턴스를 생성할 때, 생성자에 String을 넣어 주면, 이 String이 Exception 인스턴스에 메시지로 저장된다. 이 메시지는 getMessage()를 이용해서 얻을 수 있다.

ExceptionEx10을 작성후에 컴파일 하면, 아래와 같은 에러가 발생하며 컴파일이 완료되지 않을 것이다. 예외처리가 되어야 할 부분에 예외처리가 되어 있지 않다는 에러이다. 위의 결과에서 알 수 있는 것처럼 분류한 'Exception 클래스들(Exception클래스와 그 자손들)'이 발생할 가능성이 있는 문장들에 대해 예외처리를 해주지 않으면 컴파일조차 되지 않는다.

ExceptionEx11은 예외처리를 하지 않았음에도 불구하고 ExceptionEx10과 달리 성공적으로 컴파일 될것이다. 그러나 실행하면, 아래의 실행결과처럼 RuntimeException이 발생하여 비정상적으로 종료될 것이다.

이 예제가 명백히 RuntimeException을 발생시키는 코드를 가지고 있고, 이에 대한 예외처리를 하지 않았음에도 불구하고 성공적으로 컴파일 되었다.

앞에서 설명한 것과 같이 'RuntimeException클래스와 그 자손(RuntimeException 클래스들)'에 해당하는 예외는 프로그래머가 실수로 발생하는 것들이기 때문에 예외처리를 강제하지 않는 것이다. 만일 RuntimeException클래스들에 속하는 예외가 발생할 가능성이 있는 코드에도 예외처리를 해야 한다면, 참조 변수와 배열일 사용되는 모든 곳에 예외처릴를 해주어야 할 것이다.

컴파일러가 예외처리를 확인하지 않는 RuntimeException들은 'unchunked 예외'라고 부르고, 예외처리를 확인하는 Exception들은 'checked 예외'라고 부른다.

![image](https://user-images.githubusercontent.com/22147400/217751966-82a41114-92cc-48e8-9c0f-55fceec9a31b.png)


## 메서드에 예외 선언하기

메서드에 예외를 선언하려면, 메서드의 선언부에 키워드 throws를 사용해서 메서드 내에서 발생할 수 있는 예외를 적어주기만 하면된다. 그리고 예외가 여러 개일 경우에는 쉼표(,)로 구분한다.

```JAVA
void method() throws Exception1, Exception2, ... ExceptionN {
    // 메서드의 내용    
}
```

> [참고] 예외를 발생시키는 throw와 예외를 메서드에 선언할 때 쓰이는 throws를 잘 구별하자.

만일 아래와 같이 모든 예외의 최고조상인 Exception클래스를 메서드에 선언하면, 이 메서드는 모든 종류의 예외가 발생할 가능성이 있다는 뜻이다.

```JAVA
void method() throws Exception{
    
}
```

이렇게 예외를 선언하면, 이 예외뿐만 아니라, 그 자손타입의 예외까지도 발생할 수 있다는 점에 주의하자. 앞서 오버라이딩에서 살펴본 것과 같이, 오버라이딩할 때는 단순히 선언된 예외의 개수가 아니라 상속관계까지 고려해야 한다.

메서드의 선언부에 예외를 선언함으로써 메서드를 사용하려는 사람이 메서드의 선언부를 보았을 때, 이 메서드를 사용하기 위해서는 어떠한 예외들이 처리되어져야 하는지 쉽게 알 수 있다.

기존의 많은 언어들에서는 메서드에 예외선언을 하지 않기 때문에, 경험 많은 프로그래머가 아니고서는 어떤 상황에 어떤 종류의 예외가 발생할 가능성이 있는지 충분히 예측하기 힘들기 때문에 그에 대한 대비를 하는 것이 어려웠다.

그러나 자바에서는 메서드를 작성할 때 메서드 내에서 발생할 가능성이 있는 예외를 메서드의 선언부에 명시하여 이 메서드를 사용하는 쪽에서는 이에 대한 처리를 하도록 강요하기 때문에, 프로그래머들의 짐을 덜어 주는 것은 물론이고 보다 견고한 프로그램 코드를 작성할 수 있도록 도와준다.

![image](https://user-images.githubusercontent.com/22147400/217774797-7c5ae63a-06e1-4bb7-9523-9bab59b3952a.png)

위 그림은 Java API 문서에서 찾아본 java.lang.Object 클래스의 wait 메서드에 대한 설명이다. 메서드의 선언부에 InterruptedException 이 키워드 throws와 함께 적혀 있는 것을 볼 수 있다. 이것이 의미하는 바는 이 메서드에서는 InterruptedException이 발생할 수 있으니, 이 메서드를 호출하고자 하는 메서드에서는 InterruptedException 을 처리해주어야 한다는 것이다.

InterruptedException 에 밑줄이 있는 것으로 보아 링크가 걸려 있음을 알 수 있을 것이다. 이 링크를 클릭하면, InterruptedException에 대한 설명을 볼 수 있다.

![image](https://user-images.githubusercontent.com/22147400/217775389-b2bd31c7-f8c6-4d0e-ad96-4ce53d486e99.png)

InterruptedException은 Exception 클래스의 자손임을 알 수 있다. 따라서 InterruptedException은 반드시 처리해주어야 하는 예외임을 알 수 있다. 그래서 wait 메서드의 선언부에 키워드 throws와 함께 선언되어져 있는 것이다.

Java API의 wait 메서드 설명의 아래쪽에 있는 "Throws:"를 보면, wait 메서드에서 발생할 수 있는 예외의 리스트와 언제 발생하는지에 대한 설명이 덧붙여져 있다.

여기에는 두 개의 예외가 적혀 있는데 메서드에 선언되어 있는 InterruptedException 외에 또 하나의 예외(IllegalMonitorStateException)가 있다.

IllegalMonitorStateException 역시 링크가 걸려 있으므로 클릭하면, IllegalMonitorStateException에 대한 정보를 얻을 수 있다.

![image](https://user-images.githubusercontent.com/22147400/217776574-aa28eddf-8ab3-496a-90af-745c7c82c937.png)

IllegalMonitorStateException은 RuntimeException 클래스의 자손이므로 IllegalMonitorStateException은 예외처리를 해주지 않아도 된다.

그래서 wait 메서드의 선언부에 IllegalMonitorStateException을 적지 않은 것이다.

메서드에 예외를 선언할 때 일반적으로 RuntimeException클래스들은 적지 않는다. 이 들을 메서드 선언부의 throws에 선언한다고 해서 문제가 되지는 않지만, 보통 반드시 처리해주어야 하는 예외들만 선언한다. 

이처럼 Java API문서를 통해 사용하고자 하는 메서드의 선언부와 "Throws:"를 보고, 이 메서드에서는 어떤 예외가 발생할 수 있으며 반드시 처리해주어야 하는 예외는 어떤 것들이 있는지 확인하는 것이 좋다.

사실 예외를 메서드의 throws에 명시하는 것은 예외를 처리하는 것이 아니라, 자신(예외가 발생할 가능성이 있는 메서드)을 호출한 메서드에게 예외를 저달하여 예외처리를 떠맡기는 것이다.

예외를 전달받은 메서드가 또다시 자신을 호출한 메서드에게 전달할 수 있으며, 이런 식으로 계속 호출스택에 있는 메서드들을 따라 전달되다가 제일 마지막에 있는 main 메서드에서도 예외가 처리되지 않으면, main 메서드마저 종료되어 프로그램이 전체가 종료된다.

 - 참고 코드 : ExceptionEx12

![image](https://user-images.githubusercontent.com/22147400/217778140-a9b74047-c851-488d-96c5-52fe8e307fea.png)

위의 실행결과를 보면, 프로그램의 실행도중 java.lang.Exception이 발생하여 비정상적으로 종료했다는 것과 예외가 발생했을 때 호출스택(call stack)의 내용을 알 수있다. 

위의 결과로부터 다음과 같은 사실을 알 수 있다.

> 1. 예외가 발생했을 때, 모두 3개의 메서드(main, method1, method2)가 호출스택에 있었다.
> 2. 예외가 발생한 곳은 제일 윗줄에 있는 method2()이다.
> 3. main메서드가 method1()을, method1()이 method2()를 호출했다.

위의 예제를 보면, method2()에서 `throw new Exception();`을 문장에 의해 예외가 강제적으로 발생했으나 try-catch문으로 예외처리를 해주지 않았으므로, method1()에서도 역시 예외처리를 해주지 않았으므로 종료되면서 main메서드에게 예외를 넘겨준다.

그러나 main 메서드에서 조차 예외처리를 해주지 않았으므로 main 메서드가 종료되어 프로그램이 예외로 인해 비정상적으로 종료되는 것이다.

이처럼 예외가 발생한 메서드에서 예외처리를 하지 않고 자신을 호출한 메서드에게 예외를 넘겨줄 수는 있지만, 이것으로 예외가 처리된 것은 아니고 예외를 단순히 전달만 하는 것이다. 결국 어느 한 곳에서는 반드시 try-catch문으로 예외처리를 해주어야 한다.

 - 참고 코드 : ExceptionEx13

예외는 처리되었지만, printStackTrace()를 통해 예외에 대한 정보를 화면에 출력하였다. 예외가 method1()에서 발생했으며, main 메서드가 method1()을 호출했음을 알 수 있다.

 - 참고 코드 : ExceptionEx14

ExceptionEx13과 ExceptionEx14는 모두 main 메서드가 method1()을 호출하며, method1()에서 예외가 발생한다. 차이점은 예외처리 방법에 있다.

ExceptionEx13은 method1()에서 예외처리를 했고, ExceptionEx14는 method1()에서 예외를 선언하여 자신을 호출하는 메서드(main)에 예외를 전달했으며, 호출한 메서드(main 메서드)에서는 try-catch문으로 예외처리를 했다.

ExceptionEx13처럼 예외가 발생한 메서드(method1) 내에서 처리되어지면, 호출한 메서드(main메서드)에서는 예외가 발생했다는 사실조차 모르게 된다.

ExceptionEx14처럼 예외가 발생한 메서드에서 예외를 처리하지 않고 호출한 메서드로 넘겨주면, 호출한 메서드에서는 method1()을 호출한 라인에서 예외가 발생한 것으로 간주되어 이에 대한 처리를 하게 된다.

 - 참고 코드 : ExceptionEx15

예외가 발생한 메서드에서 직접 예외를 처리하도록 해서 createFile 메서드를 호출한 main 메서드에서는 예외가 발생한 사실을 알지 못한다. 적절하지 못한 파일이름이 입력되면, 예외를 발생시키고, catch블럭에서 파일이름을 '제목없음.txt'로 설정해서 파일을 생성한다. 

 - 참고 코드 : ExceptionEx16

ExceptionEx16에서는 예외가 발생한 createFile 메서드에서 잘못 입력된 파일이름을 임의로 처리하지 않고, 호출한 main 메서드에게 예외가 발생했음을 알려서 파일이름을 다시 입력받도록 하였다.

## finally 블럭

finally 블럭은 try-catch문과 함께 예외의 발생여부에 상관없이 실행되어야할 코드를 포함시킬 목적으로 사용된다.

참고 코드 - FinallyTest

프로그램 설치를 위한 준비를 하고 파일들을 복사하고 설치가 완료되면, 프로그램을 설치하는데 사용된 임시파일들을 삭제하는 순서로 진행된다. 프로그램의 설치과정 중에 예외가 발생하더라도, 설치에 사용된 임시파일들이 삭제되도록 catch 블럭에 deleteTempFiles()메서드를 넣었다.

결국 try 블럭의 문장을 수행하는 동안에, 예외의 발생여부에 관계없이 deleteTempFiles() 메서드는 실행되어야 하는 것이다. 

이럴 때 finally 블럭을 사용하면 중복된 코드 없이 작성할 수 있다.

참고 코드 - FinallyTest2, FinallyTest3


## ⭐ 자동 자원 반환(try-with-resource) ⭐

JDK 1.7부터 try-with-resources문이라는 try-catch문의 변형이 새로 추가되었다. 이 구문은 주로 입출력(I/O) 관련된 클래스를 사용할 때 유용한다.

주로 입출력에 사용되는 클래스 중에서는 사용한 후에 꼭 닫아줘야 하는 것들이 있다. 그래야 사용했던 자원(resources)이 반환되기 때문이다.

```JAVA
try{
    fis = new FileInputStream("score.dat");
    dis = new DataInputStream(fis);
    ...
} catch (IOException ie) {
    ie.printStackTrance();    
}finally {
    dis.close();        // 작업 중에 예외가 발생하더라도, dis가 닫히도록 finally 블럭에 넣음    
}
```

위의코드는 DataInputStream을 사용해서 파일로부터 데이터를 읽는 코드인데, 데이터를 읽는 도중에 예외가 발생하더라도 DataInputStream이 닫히도록 finally 블럭 안에 close()를 넣었다. 여기까지는 별 문제가 없어 보이는데, 지짜 문제는 close()가 예외를 발생시킬 수 있다는데 있다. 그래서 위의 코드는 아래와 같이 해야 올바른 것이 된다.

```JAVA
try{
    fis = new FileInputStream("score.dat");
    dis = new DataInputStream(fis);
    ...
} catch (IOException ie) {
    ie.printStackTrance();
}finally {
    try{
        if(dis != null)
            dis.close();
    } catch(IOException ie) {
        ie.printStackTrace();    
    }
}
```

finally 블럭 안에 try-catch문을 추가해서 close()에서 발생할 수 있는 예외를 처리하도록 변경했는데, 코드가 복잡해져서 별로 보기에 좋지 않다. 더 나쁜 것은 try 블럭과 finally 블럭에서 모두 예외가 발생하면, try 블럭의 예외는 무시된다는 것이다.

이러한 점을 개선하기 위해서 try-with-resources 문이 추가된 것이다. 위의 코드를 try-with-resources 문으로 바꾸면 다음과 같다.

```JAVA
try (
    FileInputStream fis = new FileInputStream("score.dat");
    DataInputStream dis = new DataInputStream(fis)
){
    while(true) {
        score = dis.readInt();
        System.out.println(score);
        sum += score;
    }
} catch (EOFException e) {
    System.out.println("점수의 총합은 " + sum + " 입니다.");
} catch (IOException ie){
    ie.printStackTrace();
}
```

try-with-resource 문의 괄호()안에 객체를 생성하는 문장을 넣으면, 이 객체는 따로 close()를 호출하지 않아도 try 블럭을 벗어나는 순간 자동적으로 close()가 호출된다. 그 다음에 catch 블럭 또는 finally 블럭이 수행된다.

> [참고] try 블럭의 괄호()안에 변수를 선언하는 것도 가능하며, 선언된 변수는 try 블럭 내에서만 사용할 수 있다.

try-with-resource 문에 의해 객체의 close()가 호출될 수 있으려면, 클래스가 AutoCloseable이라는 인터페이스를 구현한 것이어야만 한다.

```JAVA
public interface AudoColoseable{
    void close() throws Exception;
}
```

위의 인터페이스는 각 클래스에서 적절히 자원 반환작업을 하도록 구현되어 있다. 그런데, 위의 코드를 잘 보면 clse()도 Exception을 발생시킬 수 있다. 만일 자동 호출된 close()에서 예외가 발생사면 어떻게 될까?

> 참고 코드: TryWithResourcesEx

main 메서드에 두 개의 try-catch문이 있는데, 첫 번째 것은 close()에서만 예외를 발생시키고, 두 번째 것은 exceptionWork()와 close()에서 모두 예외를 발생시킨다.

첫 번째는 일반적인 예외가 발생했을 때와 같은 형태로 출력되었지만, 두 번째는 출력형태가 다르다. 먼저 exceptionWork()에서 발생한 예외에 대한 내용이 출력되고, clse()에서 발생한 예외는 '억제된(suppressed)'이라는 의미의 머리말과 함꼐 출력되었다.

두 예외가 동시에 발생할 수 는 없기 때문에, 실제 발생한 예외를 WorkException으로 하고, CloseException은 억제된 예외로 다룬다. 억제된 예외에 대한 정보는 실제로 발생한 예외인 WorkException에 저장된다.

Throwable에는 억제된 예외와 관련된 다음과 같은 메서드가 정의되어 있다.

> void addSuppressed(Throwable exception) 억제된 예외를 추가
> 
> Throwable[] getSuppressed()

만일 기존의 try-catch문을 사용했다면, 먼저 발생한 WorkException은 무시되고, 마지막으로 발생한 CloseException에 대한 내용만 출력되었을 것이다.


## 사용자정의 예외

기존의 정의된 예외 클래스 외에 필요에 따라 프로그래머가 새로운 예외 클래스를 정의하여 사용할 수 있다. 보통 Exception 클래스로부터 상속받는 클래스를 만들지만, 필요에 따라 알맞은 예외 클래스를 선택할 수 있다.

> [참고] 가능하면 새로운 예외 클래스를 만들기보다는 기존의 예외 클래스를 활용하자.

```JAVA
class MyException extends Exception {
    MyException(String msg) {       // 문자열을 매개변수로 받는 생성자
        super(msg);                 // 조상인 Exception클래스의 생성자 호출
    }
} 
```

Exception 클래스로부터 상속받아 MyException 클래스를 만들었다. 필요하다면, 멤버변수나 메서드를 추가할 수 있다. Exception 클래스는 생성 시에 String 값을 받아서 메시지로 저장할 수 있다.

 ```JAVA
class MyException extends Exception {
    private final int ERR_CODE;
    
    MyException(String msg, int errCode) {       // 문자열을 매개변수로 받는 생성자
        super(msg);                 // 조상인 Exception클래스의 생성자 호출
        this.ERR_CODE = errCode;
    }

    MyException(String msg) { 
        this(msg, 100);
    }

    public int getERR_CODE() {
        return this.ERR_CODE;
    }
} 
 ```

이전의 코드를 좀더 개선하여 메시지뿐만 아니라 에러코드 값도 저장할 수 있도록 ERR_CODE와 getErrorCode()를 MyException 클래스의 멤버로 추가되었다.

기존의 예외 클래스는 주로 Exception 을 상속받아서 'checked예외'로 작성하는 경우가 많았지만, 요즘은 예외처리를 선택적으로 할 수 있도록 RuntimeException을 상속받아서 작성하는 쪽으로 바뀌어가고 있다. 'checked예외'는 반드시 예외처리를 해주어야 하기 때문에 예외처리가 불필요한 경우에도 try-catch문을 넣어서 코드가 복잡해지기 때문이다.

예외처리를 강제하도록 한 이유는 프로그래밍경험이 적은 사람들보다 견고한 프로그램을 작성할 수 있게 유도하기 위한 것이었는데, 요즘은 자바가 탄생하던 20년 전과 달리 프로그래밍 환경이 많이 달라졌다. 그때 자바를 설계하던 사람들은 자바가 주로 소형 가전기기나, 데스크탑에서 실행될 것이라고 생각했지만 현재 자바는 모바일이나 웹 프로그래밍에서 주로 쓰이고 있다. 이처럼 프로그래밍 환경이 달라진 만큼 필수적으로 처리해야만 할 것 같았던 예외들이 선택적으로 처리해도 되는 상황으로 바뀌는 경우가 종종 발생하고 있다. 그래서 필요에 따라 예외처리의 여부를 선택할 수 있는 'unchecked 예외'가 강제적인 'checked 예외'보다 더 환영받고 있다.

 - 참고 코드 : NewExceptionTest

## ⭐ 예외 던지기(Exception re-throwing) ⭐

한 메서드에서 발생할 수 있는 예외가 여럿 인경우, 몇 개는 try-catch문을 통해서 메서드 내에서 자체적으로 처리하고, 그 나머지는 선언부에 지정하여 호출한 메서드에서 처리하도록 함으로써, 양쪽에서 나눠서 처리되도록 할 수 있다.

그리고 심지어는 단 하나의 예외에 대해서도 예외가 발생한 메서드와 호출한 메서드, 양쪽에서 처리하도록 할 수 있다.

이것을 예외를 처리한 후에 인위적으로 다시 발생시키는 방법을 통해서 가능한데, 이것을 '예외 되던지기(exception re-throwing)'라고 한다.

먼저 예외가 발생할 가능성이 있는 메서드에서 try-catch문을 사용해서 예외를 처리해주고 catch 문에서 필요한 작업을 행한 후에 throw문을 사용해서 예외를 다시 발생시킨다. 다시 발생한 예외는 이 메서드를 호출한 메서드에게 전달되고 호출한 메서드의 try-catch 문에서 예외를 또다시 처리한다.

이 방법은 하나의 예외에 대해서 예외가 발생한 메서드와 이를 호출한 메서드 양쪽 모두에서 처리해줘야 할 작업이 있을 때 사용된다. 이때 주의할 점은 예외가 발생할 메서드에서는 try-catch문을 사용해서 예외처리를 해줌과 동시에 메서드의 선언부에 발생할 예외를 throws에 지정해줘야 한다는 것이다.

 - 참고 코드 : ExceptionEx17 

![image](https://user-images.githubusercontent.com/63120360/217846764-d7406eab-be01-4e61-8163-7c63eee227ff.png)

결과에서 알 수 있듯이 method1()과 main메서드 양쪽의 catch블럭이 모두 수행되었음을 알 수 있다. method1()의 catch 블럭에서 예외를 처리하고도 throw문을 통해 다시 예외를 발생시켰다. 그리고 이 예외를 main 메서드에서 한 번 더 처리하였다.

반환값이 있는 return문의 경우, catch 블럭에도 return 문이 있어야 한다. 예외가 발생했을 경우에도 값을 반환해야하기 때문이다.

```JAVA
static void method1() {
    try {
        System.out.println("method1() 이 호출되었습니다.");
        return 0;       // 현재 실행 중인 메서드를 종료한다.
    }catch (Exception e) {
        e.printStackTrace();
        return 1;       // catch블럭 내에도 return 문이 필요하다.
    } finally {
        System.out.println("method1()의 finally블럭이 실행되었습니다. ");    
    }
}
```

또는 catch 블럭에서 예외 되던지기해서 호출한 메서드로 예외를 전달하면, return문이 없어도 된다. 그래서 검증에서도 assert문 대신 assertError를 생성해서 던진다.

```JAVA
static void method1() {
    try {
        System.out.println("method1() 이 호출되었습니다.");
        return 0;       // 현재 실행 중인 메서드를 종료한다.
    }catch (Exception e) {
        e.printStackTrace();
        throw new Exception();
    } finally {
        System.out.println("method1()의 finally블럭이 실행되었습니다. ");
    }
}
```

## 연결된 예외(chained exception)

한 예외가 다른 예외를 발생시킬 수도 있다. 예를들어 예외 A가 예외 B를 발생시켰다면, A를 B의 '원인 예외(cause exception)'라고 한다. 아래의 코드는 "NewExceptionTest"의 일부를 변경한 것으로, SpaceException을 원인 예외로 하는 InstallException을 발생시키는 방법을 보여준다.

```JAVA
try {
    startInstall();
    copyFiles();
} catch (SpaceException e) {
    InstallException ie = new InstallException("설치중 예외발생");     // 예외 생성
    ie.initCause(e);                                                // InstallException의 원인 예외를 SpaceException으로 지정
    throw ie;                                                       // InstallException을 발생시킨다.
} catch (MemoryException me) {
    ...
}
```

먼저 InstallException을 생성한 후에, initCause()로 SpaceException을 InstallException의 원인 예외로 등록한다. 그리고 'throw'로 이 예외를 던진다.

initCause()는 Exception 클래스의 조상인 Throwable 클래스에 정의되어 있기 때문에 모든 예외에서 사용가능하다.

> **Throwable initCause(Throwable cause) : 지정한 예외를 원인 예외로 등록**
> 
> **Throwable getCause() : 원인 예외를 반환**

발생한 예외를 그냥 처리하면 될 텐데, 원인 예외로 등록해서 다시 예외를 발생시키는지 궁금할 것이다. 그 이유는 여러가지 예외를 하나의 큰 분류의 예외로 묶어서 다루기 위해서이다.

그렇다고 아래와 같이 InstallException을 SpaceException과 MemoryException의 조상으로 해서 catch 블록을 작성하면, 실제로 발생한 예외가 어떤 것인지 알 수 없다는 문제가 생긴다. 그리고 SpaceException과 MemoryException의 상속관계를 변경해야 한다는 것도 부담이다.

```JAVA
try {
    startInstall();
    copyFiles();
} catch(InstallException e) {
    e.printStackTrace();    
}
```

그래서 생각한 것이 예외가 원인 예외를 포함시킬 수 있게 한 것이다. 이렇게 하면, 두 예외는 상속관계가 아니어도 상관없다.

```JAVA
public class Throwable implements Serializable {
    ...
    private Throwable cause = this; // 객체 자신(this)을 원인 예외로 등록
}
```

또 다른 이유는 checked 예외를 unckecked 예외로 바꿀수 있도록 하기 위해서이다.

checked예외로 예외처리를 강제한 이유는 프로그래밍 경험이 적은 사람도 보다 견고한 프로그램을 작성할 수 있도록 유도하기 위한 것이었는데, 지금은 자바가 처음 개발되던 1990년대와 컴퓨터 환경이 많이 달라졌다.

그래서 checked 예외가 발생해도 예외를 처리할 수 없는 상황이 하나둘 발생하기 시작했다. 이럴 때 할 수 있는 일이라곤 그저 의미없는 try-catch문을 추가하는 것뿐인데, checked 예외를 unckecked예외로 바꾸면 예외처리가 선택적이 되므로 억지로 예외처리를 하지 않아도 된다.

![image](https://user-images.githubusercontent.com/63120360/217851705-73224d38-6730-43c2-9d2b-dc9da5119758.png)

MemoryException은 Exception의 자손이므로 반드시 예외를 처리해야하는데, 이 예외를 RuntimeException으로 감싸버렸기 때문에 unchecked예외가 되었다. 그래서 더 이상 startInstall()의 선언부에 MemoryException을 선언하지 않아도 된다. 참고로 위의 코드에서는 initCaluse()대신 RuntimeException의 생성자를 사용했다. 