# 모바일 프로그래밍 강의 정리

## 1장. 안드로이드 프로젝트 앱의 동작 원리

### Android 프로젝트의 구성

| 파일 및 디렉토리명           | 설명                                                                                 |
| ---------------------------- | ------------------------------------------------------------------------------------ |
| java/MainActivity.java       | 스마트폰 화면을 구성하는 Activity를 정의하는 파일로서 처음 실행되는 코드를 정의한다. |
| build/R.java                 | 앱이 동작하며 참조하는 Resource(문자열, 사운드, 이미지)들의 ID가 정의된다.           |
| res/drawable                 | 화면에 그려지는 이미지 파일들이 저장되는 디렉토리.                                   |
| res/layout/activity_main.xml | MainActivity.java에 대한 레이아웃을 정의하는 XML 파일.                               |
| res/values/strings.xml       | 앱이 동작하며 참조하는 문자열들이 변수의 형태로 정의된 파일.                         |
| AndroidManifest.xml          | 앱의 전반적인 정보를 통해서 Application의 구성요소와 권한을 정의한다.                |

**MainActivity.java**

타 언어 프로젝트의 main 함수와 비슷한 역할을 수행하는 파일로서, Activity를 수정하여 앱의 시작점을 정의할 수 있다.

**R.java**

AAPT가 앱에서 사용하는 리소스를 컴파일하여 생성되는 파일이다. 개발자가 임의로 내용을 변경할 수 없다.

**activity_main.xml**

안드로이드 앱은 실행과 데이터 부분으로 나뉘는데, 레이아웃은 '.java'가 아닌 '.xml'에서 정의된다.

**strings.xml**

안드로이드 앱의 리소스의 문자열을 담당하는 파일으로, 여러 곳에서 사용하는 문자열을 묶어서 관리할 수 있다.

**AndroidManifest.xml**

앱에 대한 전반적인 기능들을 명세하는 구성 정보를 담당하는 파일으로서, 개발자가 파일명을 변경할 수 없다. 다음 역할들을 수행할 수 있다.

- 앱 컴포넌트의 선언
- 앱 실행권한 정의
- 앱 API 레벨 정의
- 앱 요구사항 정의

### Android 주요 컴포넌트

**액티비티(Activity)**

하나의 애플리케이션의 화면 작업(인터페이스, 이벤트)들을 담당하는 컴포넌트.

**서비스(Service)**

애플리케이션의 백그라운드에서 동작하는 컴포넌트. 별도의 인터페이스를 제공하지 않으며, 다른 앱으로 전환해도 계속해서 실행된다.

**방송 수신자(Broadcase Receiver)**

스마트폰에서 발생하는 다양한 이벤트들을 수신하고 처리하는 컴포넌트. 시스템의 이벤트를 앱에 전달하여 적절한 작업을 수행한다.

**콘텐츠 제공자(Content Provider)**

데이터를 체계적으로 관리하고 앱의 인터페이스에 제공하는 컴포넌트. 데이터는 시스템, DB, 웹 상에서 저장할 수 있으며, 다른 앱의 데이터를 변경할 수 있다.

### Android 앱의 작동 원리

일반적인 Java 프로그램과 달리 ART/Dalvik이라 불리는 별도의 가상머신에서 실행한다. 실행 과정은 다음과 같다.

1. **.java**는 바이트 코드(.class)로 변환 된다.
2. **.class**는 Dalvik의 실행 파일(.dex)로 변환된다.
3. **.dex**는 AAPT를 통해 패키지 파일(.apk)로 변환된다.

**Dalvik**

JIT(Just In Time) 방식의 컴파일 환경 기반의 안드로이드 전용 가상머신으로, JVM의 라이선스 이슈에 의하여 개발되었다.

**ART(Android Runtime)**

앱을 설치하기 전에 컴파일을 마치고 실행하는 안드로이드 가상머신으로 Dex(Dalvik Executable) 형식의 바이트 코드를 실행한다.

## 2장. View

### View 소개

View는 안드로이드 기본 화면을 구성하는 기본 요소이다. View는 위젯과 레이아웃으로 구분할 수 있다.

**위젯(Widget)**

View에서 텍스트 입력(TextView), 이미지(ImageView), 버튼(Button), 체크박스(Checkbox) 등의 기능을 제공하는 여러 클래스.

**레이아웃(Layout)**

View에서 화면의 구조를 나타내는 Container, 위젯과 레이아웃을 포함하여 관리하는 View Group의 역할을 수행하는 클래스.

### id 속성

id 속성은 View 명칭을 정의할 수 있다.

| 속성명 | 설명                                                       |
| ------ | ---------------------------------------------------------- |
| @      | id를 R.java에 등록하거나, R.java로부터 참조할 때 사용한다. |
| +      | id를 처음 정의할 때 사용한다.                              |
| id/    | 안드로이드 변수명을 정의할 때 사용한다.                    |
| ID     | id/ 뒤의 요소로 속성값의 명칭이다.                         |

**사용례**

- id 속성을 부여.

```xml
<Button
    android:id="@+id/button"
/>
```

- id 속성을 사용.

```xml
<TextView
    android:layout_below="@id/textView"
/>
```

### background 속성

background 속성은 View 배경의 색상과 이미지를 설정할 수 있다.

**사용례**

- background 이미지 설정.

```xml
<Button
    android:background="@mipmap/ic_launcher"
/>
```

- background 색상 설정.

```xml
<Button
    android:background="#ffff1326"
/>
```

### Rotation 속성

rotation 속성은 View의 각도를 설정한다. rotationX는 수평, rotationY는 수직 각도를 결정한다.

- 각도를 45도로 설정.

```xml
<ImageView
    android:rotation="45"
/>
```

### Padding 속성

padding 속성은 View의 안쪽 여백을 설정한다. left, right, top, bottom 속성을 사용할 수 있다.

- 안쪽 여백 50dp 설정.

```xml
<ImageView
    android:padding="50dp"
/>
```

### Visibility 속성

visibility 속성은 View의 표시 여부를 설정한다.

| 속성명    | 설명                                                    |
| --------- | ------------------------------------------------------- |
| visible   | View가 화면에 표시되는 상태.                            |
| invisible | View가 화면에 표시되지 않지만, 자리는 차지하는 상태.    |
| gone      | View가 화면에 표시되지 않고, 자리도 차지하지 않는 상태. |

- 이미지를 숨김 설정.

```xml
<ImageView
    android:visibility="invisible"
/>
```

### Focusable 속성

focusable 속성은 View의 상세 기능 활성화 여부를 설정한다. EditText나 Button과 같이 사용자와 상호작용하는 위젯들은 true로 설정해야 한다.

- EditText focusable 설정.

```xml
<EditText
    android:focusable="true"
/>
```

### Alpha 속성

alpha 속성은 View의 투명도를 설정한다. 0.0 ~ 1.0 사이의 float 값을 가지며, 낮을 수록 투명하다.

- Image의 투명도 설정.

```xml
<ImageView
    android:alpha="0.5"
/>
```
