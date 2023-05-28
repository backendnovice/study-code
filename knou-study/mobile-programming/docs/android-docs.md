# 1강. 안드로이드 프로젝트 앱의 동작 원리

## Android 프로젝트의 구성

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

## Android 주요 컴포넌트

**액티비티(Activity)**

하나의 애플리케이션의 화면 작업(인터페이스, 이벤트)들을 담당하는 컴포넌트.

**서비스(Service)**

애플리케이션의 백그라운드에서 동작하는 컴포넌트. 별도의 인터페이스를 제공하지 않으며, 다른 앱으로 전환해도 계속해서 실행된다.

**방송 수신자(Broadcase Receiver)**

스마트폰에서 발생하는 다양한 이벤트들을 수신하고 처리하는 컴포넌트. 시스템의 이벤트를 앱에 전달하여 적절한 작업을 수행한다.

**콘텐츠 제공자(Content Provider)**

데이터를 체계적으로 관리하고 앱의 인터페이스에 제공하는 컴포넌트. 데이터는 시스템, DB, 웹 상에서 저장할 수 있으며, 다른 앱의 데이터를 변경할 수 있다.

## Android 앱의 작동 원리

일반적인 Java 프로그램과 달리 ART/Dalvik이라 불리는 별도의 가상머신에서 실행한다. 실행 과정은 다음과 같다.

1. **.java**는 바이트 코드(.class)로 변환 된다.
2. **.class**는 Dalvik의 실행 파일(.dex)로 변환된다.
3. **.dex**는 AAPT를 통해 패키지 파일(.apk)로 변환된다.

**Dalvik**

JIT(Just In Time) 방식의 컴파일 환경 기반의 안드로이드 전용 가상머신으로, JVM의 라이선스 이슈에 의하여 개발되었다.

**ART(Android Runtime)**

앱을 설치하기 전에 컴파일을 마치고 실행하는 안드로이드 가상머신으로 Dex(Dalvik Executable) 형식의 바이트 코드를 실행한다.

# 2강. View

## View 소개

View는 안드로이드 기본 화면을 구성하는 기본 요소이다. View는 위젯과 레이아웃으로 구분할 수 있다.

**위젯(Widget)**

View에서 텍스트 입력(TextView), 이미지(ImageView), 버튼(Button), 체크박스(Checkbox) 등의 기능을 제공하는 여러 클래스.

**레이아웃(Layout)**

View에서 화면의 구조를 나타내는 Container, 위젯과 레이아웃을 포함하여 관리하는 View Group의 역할을 수행하는 클래스.

## View 속성

id 속성을 사용하여 View의 리소스 명칭을 정의할 수 있다.

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

## background 속성

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

## Rotation 속성

rotation 속성은 View의 각도를 설정한다. rotationX는 수평, rotationY는 수직 각도를 결정한다.

- 각도를 45도로 설정.

```xml
<ImageView
    android:rotation="45"
/>
```

## Padding 속성

padding 속성은 View의 안쪽 여백을 설정한다. left, right, top, bottom 속성을 사용할 수 있다.

- 안쪽 여백 50dp 설정.

```xml
<ImageView
    android:padding="50dp"
/>
```

## Visibility 속성

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

## Focusable 속성

focusable 속성은 View의 상세 기능 활성화 여부를 설정한다. EditText나 Button과 같이 사용자와 상호작용하는 위젯들은 true로 설정해야 한다.

- EditText focusable 설정.

```xml
<EditText
    android:focusable="true"
/>
```

## Alpha 속성

alpha 속성은 View의 투명도를 설정한다. 0.0 ~ 1.0 사이의 float 값을 가지며, 낮을 수록 투명하다.

- Image의 투명도 설정.

```xml
<ImageView
    android:alpha="0.5"
/>
```

# 3강. 문자 및 이미지 출력을 위한 위젯

## TextView

문자열을 화면에 출력하기 위해서 사용하는 위젯.

| 속성명     | 설명                       |
| ---------- | -------------------------- |
| text       | 텍스트 문자열을 변경한다.  |
| textColor  | 텍스트 색상을 변경한다.    |
| textSize   | 텍스트 크기를 변경한다.    |
| textStyle  | 텍스트 스타일을 변경한다.  |
| typeface   | 텍스트 글꼴을 설정한다.    |
| singleline | 텍스트를 한 줄로 설정한다. |

- text 속성 설정 예제.

```xml
<!-- strings.xml -->
<resources>
    <string name="hello_world">Hello World</string>
</resources>

<!-- activity_main.xml -->
<TextView
    android:text="@string/hello_world"
/>
```

- textColor 속성 설정 예제.

```xml
<TextView
    android:textColor="#ff405aff"
/>
```

- textSize 속성 설정 예제.

```xml
<TextView
    android:textSize="30dp"
/>
```

- textStyle 속성 설정 예제.

```xml
<TextView
    android:textStyle="bold|italic"
/>
```

- typeface 속성 설정 예제.

```xml
<TextView
    android:typeface="sans"
/>
```

- singleLine 속성 설정 예제.

```xml
<TextView
    android:singleLine="true"
/>
```

## ImageView

이미지를 화면에 출력하기 위해서 사용하는 위젯.

| 속성명           | 설명                                                   | 비고                |
| ---------------- | ------------------------------------------------------ | ------------------- |
| src              | 이미지의 소스 경로를 결정한다.                         |                     |
| maxWidth         | 이미지의 최대 가로 길이를 결정한다.                    | Height == 세로 길이 |
| minWidth         | 이미지의 최소 가로 길이를 결정한다.                    | Height == 세로 길이 |
| adjustViewBounds | 이미지의 비율을 유지하며 크기를 조정한다.              |                     |
| cropToPadding    | 이미지가 레이아웃을 초과하면 잘라낼지 여부를 결정한다. |                     |
| scaleType        | 이미지의 크기변환 및 채워넣기 옵션을 설정한다.         | 아래 표 참고        |

아래 표는 scaleType의 옵션을 설명한다.

| 옵션명     | 설명                                                                               |
| ---------- | ---------------------------------------------------------------------------------- |
| fitCenter  | 원래 비율을 유지하며 View의 중앙에 표시한다.                                       |
| fitStart   | 이미지 시작 위치를 좌측 상단을 기준으로 한다.                                      |
| fitEnd     | 이미지 시작 위치를 우측 하단을 기준으로 한다.                                      |
| fitXY      | 이미지의 비율을 무시하고 틀에 맞춘다.                                              |
| center     | 이미지의 크기를 변경하지 않고 중앙에 위치한다.                                     |
| centerCrop | 이미지를 틀에 맞추어 동일 비율로 크기를 변경한다.                                  |
| matrix     | 크기와 비율을 유지하여 좌측 상단을 기준으로 출력한다. 이미지가 초과할 경우 잘린다. |

- 이미지 경로 설정.

```xml
<ImageView
    android:src="@mipmap/ic_launcher"
/>
```

- 이미지 크기 설정.

```xml
<ImageView
    android:maxWidth="100pt"
    android:minHeight="100pt"
/>
```

- 이미지 한계 설정.

```xml
<ImageView
    android:adjustViewBounds="true"
/>
```

- 이미지 안쪽 여백 여부 설정.

```xml
<ImageView
    android:cropToPadding="true"
/>
```

- 이미지 크기 조정 기준 설정.

```xml
<ImageView
    android:scaleType="fitXY"
/>
```

# 4강. 사용자 인터페이스를 위한 위젯

## Button

Button은 사용자로부터 이벤트를 수집할 수 있는 인터페이스를 제공하는 위젯이다. 디폴트는 직사각형 모양이며 사각형 영역을 터치하여 선택적인 명령을 전달할 수 있다.

| 속성명      | 설명                                               |
| ----------- | -------------------------------------------------- |
| text        | Button에 표기되는 문자열을 결정한다.               |
| textAllCaps | Button에 표기되는 문자열을 대문자로 변환한다.      |
| onClick     | Button을 클릭하면 발생하는 이벤트 동작을 연결한다. |

- text 속성 설정 예제.

```xml
<Button
    android:text="Button"
/>
```

- textAllCaps 속성 설정 예제.

```xml
<Button
    android:textAllCaps="true"
/>
```

- onButtonClick 속성 설정 예제.

```xml
<!-- MainActivity의 onButtonClick 함수를 호출. -->
<Button
    android:onClick="onButtonClick"
/>
```

```java
public class MainActivity extends AppCompatActivity {
    // (...)

    // 버튼 ID에 따라서 text를 설정하는 메소드.
    public void onButtonClick(View view) {
        TextView text1 = (TextView) findViewById(R.id.text1);
        switch(view.getId()) {
            case R.id.button1:
                text1.setText("hello");
                break;
            case R.id.button2:
                text2.setText("world");
                break;
        }
    }
}
```

## EditText

EditText는 사용자로부터 문자열을 입력받을 수 있는 인터페이스를 제공하는 위젯이다. TextView의 서브 클래스로 TextView의 모든 속성을 사용할 수 있다.

| 속성명  | 설명                                                               |
| ------- | ------------------------------------------------------------------ |
| text    | EditText의 기본 문자열을 결정한다.                                 |
| getText | EditText의 문자열을 MainActivity에서 활용할 때 참조할 때 사용한다. |

- text 속성 설정 예제.

```xml
<EditText
    android:text="Input Please"
/>
```

- getText 활용 예제.

```xml
<EditText
    android:id="@+id/edit"
    android:text="Input Please"
/>
<Button
    android:id="@+id/button"
    android:onClick="onButtonClick"
/>
```

```java
public class MainActivity extends AppCompatActivity {
    // (...)
    // 버튼을 클릭하면 edit의 문자열을 토스트로 출력하는 메소드.
    public void onButtonClick(View view) {
        EditText edit = (EditText) findViewById(R.id.edit);
        String string = edit.getText().toString();
        Toast.makeText(MainActivity.this, string, Toast.LENGHT_SHORT).show();
    }
}
```

## CheckBox

CheckBox는 사용자가 문자열 리스트에 다수의 구성요소를 동시에 선택하기 위한 인터페이스를 제공하는 위젯이다.

| 속성명    | 설명                                                        |
| --------- | ----------------------------------------------------------- |
| isChecked | CheckBox의 체크 여부를 MainActivity에서 참조할 때 사용한다. |

- CheckBox 위젯 예제.

```xml
<CheckBox
    android:id="@+id/checkbox1"
    android:text="apple"
/>
<CheckBox
    android:id="@+id/checkbox2"
    android:text="banana"
/>
<CheckBox
    android:id="@+id/checkbox3"
    android:text="orange"
/>
```

## RadioButton

RadioButton은 사용자가 문자열 리스트에서 하나의 구성요소를 선택하기 위한 인터페이스를 제공하는 위젯이다. 여러 RadioButton들을 연동하기 위해서 RadioGroup를 사용한다.

| 속성명    | 설명                                                           |
| --------- | -------------------------------------------------------------- |
| isChecked | RadioButton의 체크 여부를 MainActivity에서 참조할 때 사용한다. |

- RadioButton 위젯 예제.

```xml
<RadioGroup>
    <RadioButton
        android:id="@+id/radiobutton1"
        android:text="Apple"
    />
    <RadioButton
        android:id="@+id/radiobutton2"
        android:text="Banana"
    />
    <RadioButton
        android:id="@+id/radiobutton3"
        android:text="Orange"
    />
</RadioGroup>
```

## Switch

Switch는 사용자의 선택에 따라서 On / Off를 전환하는 토글 형태의 인터페이스를 제공하는 위젯이다. MainActivity에서 isChecked 메소드를 통해 선택 여부를 판별할 수 있다.

| 속성명    | 설명                                                      |
| --------- | --------------------------------------------------------- |
| isChecked | Switch의 체크 여부를 MainActivity에서 참조할 때 사용한다. |

- Switch 위젯 예제.

```xml
<Switch
    android:id="@+id/switch1"
    android:text="approval"
/>
<Button
    android:id="@+id/button1"
    android:text="button"
    android:onClick="onButtonClick"
/>
<TextView
    android:id="@+id/result"
    android:text=""
    android:textSize="35dp"
/>
```

```java
public class MainActivity extends AppCompatActivity {
    // (...)
    // 버튼을 클릭하면 스위치의 체크 여부에 따라서 result의 내용을 변경하는 메소드.
    public void onButtonClick(View view) {
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        TextView result = (TextView) findViewById(R.id.result);

        switch(view.getId()) {
            case R.id.button1:
                if(switch1.isChecked()) {
                    result.setText("Switch On");
                }else {
                    result.setText("Switch Off");
                }
                break;
        }
    }
}
```

# 5강. 레이아웃 1

## ViewGroup

ViewGroup은 다양한 View를 그룹화하여 계층적인 관리 구조를 제공함으로써 효율성을 높여준다.

| 속성명        | 설명                                  | 비고         |
| ------------- | ------------------------------------- | ------------ |
| layout_width  | 레이아웃의 가로 크기를 결정한다.      | 아래 표 참고 |
| layout_height | 레이아웃의 세로 크기를 결정한다.      | 아래 표 참고 |
| layout_margin | View와 View 사이의 간격을 지정한다.   | 바깥쪽 여백  |
| padding       | View의 내용물 사이의 간격을 지정한다. | 안쪽 여백    |

↓ layout_width와 layout_height 속성표

| 속성명       | 설명                                     |
| ------------ | ---------------------------------------- |
| match_parent | 레이아웃의 크기에 맞춰 최대 크기로 출력. |
| wrap_content | 레이아웃의 크기에 맞춰 최소 크기로 출력. |
| literal      | 입력한 값에 따라서 크기가 결정.          |

- layout_width와 layout_height 속성 예제.

```xml
<LinearLayout>
    <Button
        android:id="@+id/button1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
    />
    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
    />
</LinearLayout>
```

- padding과 layout_margin 속성 예제.

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_margin="20px"
    android:padding="15dp">
    <TextView
        android:text="Button"
        android:typeface="serif"
    />
</LinearLayout>
```

## LinearLayout

LinearLayout(선형 레이아웃)은 내부 구성요소를 선형적으로 배치하는 ViewGroup이다.

| 속성명          | 설명                                             | 비고                     |
| --------------- | ------------------------------------------------ | ------------------------ |
| orientation     | View들을 배치하는 방향을 지정한다.               | vertical / horizontal    |
| baselineAligned | 높이가 다른 TextView를 아래를 기준으로 정렬한다. | vertical 의미 없음       |
| gravity         | View 내용물의 정렬 방식을 결정한다.              | center / center_vertical |
| layout_weight   | 상위 레이아웃 영역 할당 비율을 지정한다.         | 0(기본값)                |

- orientation 속성 예제.

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    <EditText
        android:id="@+id/edit"
        android:text="Input Please"
    />
    <Button
        android:id="@+id/button"
        android:text="SUBMIT"
    />
</LinearLayout>
```

- baselineAligned 속성 예제.

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:baselineAligned="true">
    <EditText
        android:id="@+id/edit"
        android:text="Input Please"
    />
    <Button
        android:id="@+id/button"
        android:text="SUBMIT"
    />
</LinearLayout>
```

- gravity 속성 예제.

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:baselineAligned="true">
    <TextView
        android:id="@+id/text1"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="center_vertical | right"
        android:text="Gravity Test"
    />
</LinearLayout>
```

- layout_weight 속성 예제.

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    <TextView
        android:layout_width="match_parent"
        android:layout_width="wrap_content"
        android:layout_weight="1"
        android:gravity="center"
        android:text="top text(1)"
    />
    <TextView
        android:layout_width="match_parent"
        android:layout_width="wrap_content"
        android:layout_weight="2"
        android:gravity="center"
        android:text="top text(2)"
    />
    <TextView
        android:layout_width="match_parent"
        android:layout_width="wrap_content"
        android:layout_weight="3"
        android:gravity="center"
        android:text="top text(3)"
    />
</LinearLayout>
```

# 6강. 레이아웃 2

## RelativeLayout

RelativeLayout은 ViewGroup에서 View 사이의 상대적인 관계를 사용하여 위치를 지정하고 배치하는 레이아웃이다.

| 속성값                          | 설명                                                             |
| ------------------------------- | ---------------------------------------------------------------- |
| layout_above                    | 지정된 View 위에 배치한다.                                       |
| layout_below                    | 지정된 View 아래에 배치한다.                                     |
| layout_toLeftOf                 | 지정된 View 왼쪽에 배치한다.                                     |
| layout_toRightOf                | 지정된 View 오른쪽에 배치한다.                                   |
| layout_alignTop                 | 지정된 View와 위쪽 변을 맞춘다.                                  |
| layout_alignBottom              | 지정된 View와 아래쪽 변을 맞춘다.                                |
| layout_alignLeft                | 지정된 View와 왼쪽 변을 맞춘다.                                  |
| layout_alignRight               | 지정된 View와 오른쪽 변을 맞춘다.                                |
| layout_alignParentTop           | true면 부모와 위쪽 변을 맞춘다.                                  |
| layout_alignParentBottom        | true면 부모와 아래쪽 변을 맞춘다.                                |
| layout_alignParentLeft          | true면 부모와 왼쪽 변을 맞춘다.                                  |
| layout_alignParentRight         | true면 부모와 오른쪽 변을 맞춘다.                                |
| layout_alignBaseline            | 지정한 View와 베이스라인을 맞춘다.                               |
| layout_alignWithParentIfMIssing | 대상으로 지정한 View가 존재하지 않을 경우, 부모를 기준으로 한다. |
| layout_centerHorizontal         | true면 부모의 수평 중앙에 배치한다.                              |
| layout_centerVertical           | true면 부모의 수직 중앙에 배치한다.                              |
| layout_centerInParent           | true면 부모의 수평 및 수직 중앙에 배치한다.                      |

- RelativeLayout 예제.

```xml
<RelativeLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    <TextView
        android:id="@+id/target"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInparent="true"
        android:text="TARGET"/>
    <TextView
        android:id="@+id/left"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@id/target"
        android:text="LEFT"/>
    <TextView
        android:id="@+id/right"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignRight="@id/target"
        android:text="RIGHT"/>
    <TextView
        android:id="@+id/top"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignTop="@id/target"
        android:text="TOP"/>
    <TextView
        android:id="@+id/bottom"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBottom="@id/target"
        android:text="BOTTOM"/>
</RelativeLayout>
```

RelativeLayout에서 View는 상대적인 위치를 결정하기 위해서 다른 View에 종속될 수 있다. 때문에 배치를 찾고 유지보수를 할 때 어려움이 발생할 수 있다.

## AbsoluteLayout

AbsoluteLayout은 View 사이의 관계와 상관없이 절대적인 위치에 View를 배치하는 레이아웃이다.

| 속성명   | 설명                              |
| -------- | --------------------------------- |
| layout_x | 해당 가로 좌표에 View를 배치한다. |
| layout_y | 해당 세로 좌표에 View를 배치한다. |

- AbsoluteLayout 예제.

```xml
<AbsoluteLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_x="50dip"
        android:layout_y="350dip"
        android:text="Absolute(50, 350)"/>
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_x="130dip"
        android:layout_y="90dip"
        android:text="Absolute(130, 90)"/>
</AbsoluteLayout>
```

## FrameLayout

FrameLayout은 위치를 지정하는 규칙이 없고, 모든 View가 좌측 상단에 나타나는 레이아웃이다.

| 속성명             | 설명                                                                              |
| ------------------ | --------------------------------------------------------------------------------- |
| foreground         | 자식 위에 얹는 이미지를 설정한다.                                                 |
| foregroundGravity  | foreground 이미지의 위치를 결정한다.                                              |
| measureAllChildren | 레이아웃 크기를 자식 View에 맞추거나, Visiblity가 visible로 설정된 View에 맞춘다. |

- FrameLayout 예제. (겹쳐서 표시)

```xml
<FrameLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <ImageView
        android:id="@+id/image1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/banana"/>
    <ImageView
        android:id="@+id/image2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/earth"/>
</FrameLayout>
```

- FrameLayout 예제. (버튼으로 숨기기/보이기)

```xml
<FrameLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <ImageView
        android:id="@+id/image"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:src="@mipmap/ic_launcher"
        android:adjustViewBounds="true"/>
    <Button
        android:id="@+id/button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Show/Hide"/>
</FrameLayout>
```

```java
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(
            new View.onClickListener() {
                public void onClick(View view) {
                    ImageView image = (ImageView) findViewById(R.id.image);
                    if(image.getVisibility() == View.VISIBLE)
                        image.setVisibility(View.GONE);
                    else
                        image.setVisibility(View.VISIBLE);
                }
            }
        );
    }
}
```

# 7강. 레이아웃 3

## TableLayout

TableLayout은 행과 열을 구분하는 표 형태로 자식 View를 배치하는 레이아웃이다.

| 속성명         | 설명                                                 | 비고    |
| -------------- | ---------------------------------------------------- | ------- |
| shrinkColumns  | 부모 폭에 맞추기 위해서 열의 폭을 강제로 축소한다.   | 열 번호 |
| stretchColumns | 부모 여백을 채우기 위해서 열의 폭을 임의로 확장한다. | 열 번호 |

- TableLayout 예제.

```xml
<TableLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TableRow>
        <TextView
            android:text="SUN"
            android:textSize="50px"
            android:padding="5dip"/>
        <TextView
            android:text="MON"
            android:textSize="50px"
            android:padding="5dip"/>
        <TextView
            android:text="TUE"
            android:textSize="50px"
            android:padding="5dip"/>
    </TableRow>
    <TableRow>
        <TextView
            android:text="5"
            android:textSize="50px"
            android:padding="5dip"/>
        <TextView
            android:text="6"
            android:textSize="50px"
            android:padding="5dip"/>
        <TextView
            android:text="7"
            android:textSize="50px"
            android:padding="5dip"/>
    </TableRow>
</TableLayout>
```

## 레이아웃 중첩

레이아웃은 View들을 담는 컨테이너로 ViewGroup과 View를 포함할 수 있다. 레이아웃을 중첩하여 배치하는 것도 가능하다.

- 레이아웃 중첩 예제.

```xml
<LinearLayout
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="First Layout Start"/>
    <TableLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <TableRow>
            <TextView
                android:text="SUN"
                android:textSize="50px"
                android:padding="5dip"/>
            <TextView
                android:text="MON"
                android:textSize="50px"
                android:padding="5dip"/>
            <TextView
                android:text="TUE"
                android:textSize="50px"
                android:padding="5dip"/>
        </TableRow>
        <TableRow>
            <TextView
                android:text="5"
                android:textSize="50px"
                android:padding="5dip"/>
            <TextView
                android:text="6"
                android:textSize="50px"
                android:padding="5dip"/>
            <TextView
                android:text="7"
                android:textSize="50px"
                android:padding="5dip"/>
        </TableRow>
    </TableLayout>
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Second"/>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Layout"/>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="TextView"/>
    </LinearLayout>
</LinearLayout>
```

## 실행 중 속성 바꾸기

안드로이드 앱을 실행 중에 특정 View의 속성값을 변경함으로써 동적인 화면을 구성할 수 있다. 기본적으로 set 계열의 메소드가 사용된다.

- TextView 속성 변경 예제.

```java
public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout_activity_main);
        findViewById(R.id.buttonid).setOnClickListener(new View.OnClickListener() {
            // 버튼을 클릭하면 Text 크키를 40으로 변경.
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.textid);
                text.setTextSize(40);
            }
        })
    }
}
```

- ImageView 속성 변경 예제.

```java
public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.buttonid).setOnClickListener(new View.OnClickListener() {
            // 버튼을 클릭하면 이미지를 파란색으로 변경.
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageid);
                image.setColorFilter(Color.BLUE);
            }
        })
    }
}
```

# 8강. 도형 및 소리 출력

## 도형 출력 1

Canvas는 액티비티가 실행되는 화면을 도형을 그리기 위한 도화지 역할을 맡는다. View 또는 View 파생 클래스를 상속받고 onMeasure, onDraw 메소드를 재정의하여 사용한다.

- CustomView를 구현한 예제.

```java
public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView text = new TextView(this);
        setContentView(text);
    }
}

class TextView extends View {
    public TextView(Context context) {
        super(context);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.CYAN);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawRect(120, 100, 320, 500, paint);
    }
}
```

Canvas 객체는 화면 위의 다양한 그림을 그리는 메소드를 지원한다. 시스템이 초기화하고 View의 onDraw 함수로 인수를 전달한다.

다음은 Canvas 내의 다양한 도형을 그리는 메소드들을 다음과 같다.

```java
void drawPoint(float x, float y, Paint paint);
void drawLine(float startX, float startY, float stopX, float stopY, Paint paint);
void drawCircle(float cx, float cy, float radius, Paint paint);
void drawRect(float left, float top, float right, float bottom, Paint paint);
void drawText(String text, float x, float y, Paint paint);
```

- Canvas 객체를 활용하는 예제.

```java
public void onDraw(Canvas canvas) {
    canvas.drawColor(Color.LTGRAY);
    Paint paint = new Paint();
    paint.setStrokeWidth(30f);

    // 빨간색 사각형.
    paint.setColor(Color.RED);
    canvas.drawRect(10, 10, 200, 400, paint);

    // 파란색 투명원.
    paint.setColor(0x800000ff);
    canvas.drawCircle(350, 550, 250, paint);

    // 검정색 점.
    paint.setColor(Color.BLACK);
    canvas.drawPoint(30, 30, paint);

    // 검정색 선.
    canvas.drawLine(700, 700, 900, 900, paint);

    // 초록색 문자열.
    paint.setTextSize(100);
    paint.setColor(Color.GREEN);
    canvas.drawText("Canvas Text", 100, 1000, paint);
}
```

## 도형 출력 2

Paint 객체는 그리기 속성 정보를 갖는 객체이며, 화면에 그려지는 도형의 색상, 선의 굵기 등의 속성값을 Paint 객체를 이용하여 지정한다.

| 속성명         | 설명                                                                | 비고                 |
| -------------- | ------------------------------------------------------------------- | -------------------- |
| setAntiAlias   | 색상의 차이가 뚜렷한 경계 부근의 중간색을 삽입하여 부드럽게 만든다. |                      |
| setColor       | 도형의 색을 16진수, 색상 코드, 색상명으로 지정한다.                 | Color.RED, 0x0000ff  |
| getColor       | 도형의 현재 설정 색상값을 반환한다.                                 |                      |
| setStrokeCap   | 선 끝 모양을 지정한다.                                              | BUTT, ROUND, SQUARE  |
| setStrokeWidth | 선 이나 직선의 굵기를 float값으로 지정한다.                         |                      |
| setStyle       | 도형을 그릴 때 외곽선 모양을 결정한다.                              | FILL, STROKE         |
| setStrokeJoin  | 도형의 모서리를 표현하는 방식을 결정한다.                           | MITTER, BEVEL, ROUND |

- Paint 객체를 활용하는 예제.

```java
public void onDraw(Canvas canvas) {
    canvas.drawRGB(212, 244, 250);
    Paint paint = new Paint();

    // 선 끝 테스트.
    paint.setColor(Color.RED);
    paint.setStrokeWidth(30);
    paint.setStrokeCap(Paint.Cap.ROUND);
    canvas.drawLine(50, 100, 700, 100, paint);
    paint.setStrokeCap(Paint.Cap.SQUARE);
    canvas.drawLine(50, 200, 700, 200, paint);

    // 모서리 테스트.
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeJoin(Paint.Join.MITTER);
    canvas.drawRect(50, 300, 150, 400, paint);
    paint.setStrokeJoin(Paint.Join.BEVEL);
    canvas.drawRect(100, 300, 200, 400, paint);
    paint.setStrokeJoin(Paint.Join.ROUND);
    canvas.drawRect(310, 300, 410, 400, paint);

    // 채우기 테스트. (채우기)
    paint.setColor(Color.GREEN);
    paint.setStrokeWidth(10);
    paint.setAntiAlias(true);
    paint.setStyle(Paint.Style.FILL);
    canvas.drawCircle(100, 550, 50, paint);

    // 채우기 테스트. (외곽선)
    paint.setStyle(Paint.Style.STROKE);
    canvas.drawCircle(230, 550, 50, paint);

    // 채우기 테스트. (채우기 & 외곽선)
    paint.setStyle(Paint.Style.FILL_AND_STROKE);
    canvas.drawCircle(360, 550, 50, paint);
    paint.setColor(Color.YELLOW);
}
```

## 메시지 알림

Toast 객체는 화면에 일시적으로 나타나는 작은 팝업으로 사용자에게 간단한 피드백 메시지를 제공한다. 일방적으로 정보를 알려주기 때문에 상호작용과 포커스를 갖지 않는다.

- Toast 프로젝트 예제.

```java
public class MainActivity extends Activity {
    Toast mToast = null;
    int count;
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.shortmsg).setOnClickListener(mClickListener);
        findViewById(R.id.longmsg).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.shortmsg:
                    Toast.makeText(MainActivity.this, "Short Time Message", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.longmsg:
                    Toast.makeText(MainActivity.this, "Long Time Message", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}
```

## 소리 알림

안드로이드에서 지원하는 확장자(.wav, .mp3, .ogg)를 갖는 소리 파일들을 재생할 수 있다. 파일들은 res/raw 폴더에 저장한다.

| 객체명       | 설명                                                                  |
| ------------ | --------------------------------------------------------------------- |
| SoundPool    | raw 폴더에 저장된 소리 파일을 재생한다.                               |
| AudioManager | 출력 장비와 오디오를 관리한다. 안드로이드 기본 파일을 사용할 수 있다. |

- 소리 알림 예제.

```java
public class MainActivity extends Activity {
    SoundPool mPool;
    int mDing;
    AudioManager mAm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        mDing = new mPool.load(this, R.raw.bgm, 1);
        mAm = (AudioManager)getSystemService(AUDIO_SERVICE);
        findViewById(R.id.beep1).setOnClickListener(mClickListener);
        findViewById(R.id.beep2).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        public void onClick(View v) {
            MediaPlayer player;
            switch(v.getId()) {
                case R.id.beep1:
                    mPool.play(mDing, 1, 1, 0, 0, 1);
                    break;
                case R.id.beep2:
                    mAm.playSoundEffect(AudioManager.FX_KEYPRESS_STANDARD);
                    break;
            }
        }
    }
}
```

# 9강. 이벤트 처리 1

## 이벤트 핸들러

이벤트 핸들러는 사용자의 터치 반응이나 시스템 구성요소에서 발생하는 이벤트를 처리하는 주체이다.

콜백 메소드(Callback Method)는 특정 이벤트가 발생할 때 자동으로 호출되어 실행하는 메소드이다.

| 메소드명         | 설명                                                   |
| ---------------- | ------------------------------------------------------ |
| onTouchEvent     | 화면을 터치했을 때 호출되는 메소드.                    |
| onKeyDown        | 키를 누른 상태에서 뗄 때 호출되는 메소드.              |
| onKeyUp          | 키를 뗄 때 호출되는 메소드.                            |
| onTrackballEvent | 트랙볼이 사용될 때 호출되는 메소드.                    |
| onFocusChanged   | 해당 View의 포커스에 변화가 발생할 때 호출되는 메소드. |

- 콜백 메소드 예제.

```java
public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = new CustomView(this);
        setContentView(view);
    }

    class CustomView extends View {
        public CustomView(Context context) {
            super(context);
        }
        // onTouchEvent를 구현하여 터치 이벤트를 커스텀.
        public boolean onTouchEvent(MotionEvent event) {
            super.onTouchEvent(event);
            if(event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(MainActivity.this, "Touch Event Received", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }
}
```

이벤트 리스너(Event Listener)는 특정 이벤트를 처리하는 인터페이스이다. View에 의존하는 콜백 메소드 방식과 달리 범용적이며, 제한되지 않는다.

| 이벤트 리스너              | 콜백 메소드   | 설명                                |
| -------------------------- | ------------- | ----------------------------------- |
| View.OnTouchListener       | onTouch       | 사용자가 View를 터치할 때 호출된다. |
| View.OnKeyListener         | onKey         | 키를 누르거나 땔 때 호출된다.       |
| View.OnClickListener       | onClick       | View를 클릭할 때 호출된다.          |
| View.OnLongClickListener   | onLongClick   | View를 길게 클릭할 때 호출된다.     |
| View.OnFocusChangeListener | onFocusChange | 포커스가 변경될 때 호출된다.        |
| View.OnDragListener        | onDrag        | View가 드래그할 때 호출된다.        |

- 이벤트 리스너 예제. (인터페이스 구현)

```java
public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = new View(this);
        view.setOnTouchListener(touchListener); // OnTouch 리스너 등록.
        setContentView(view);
    }

    // OnTouchListener 구현.
    class TouchListenerClass implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(MainActivity.this, "Touch Event Received", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }

    // OnTouch 리스너 객체 생성.
    TouchListenerClass touchListener = new TouchListenerClass();
}
```

- 이벤트 리스너 예제. (액티비티 구현)

```java
public class MainActivity extends Activity implements View.OnTouchListener {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = new View(this);
        view.setOnTouchListener(this);
        setContentView(view);
    }

    public boolean onTouch(View view, MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            Toast.makeText(this, "Touch Event Received", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
```

- 이벤트 리스너 예제. (View)

```java
public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CustomView view = new CustomView(this);
        view.setOnTouchListener(view);
        setContentView(view);
    }

    class CustomView extends View implements View.OnTouchListener {
        public CustomView(Context context) {
            super(context);
        }
        public boolean onTouch(View view, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(MainActivity.this, "Touch Event Received", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }
}
```

## 안드로이드 프레임워크의 구조

안드로이드 프레임워크는 기본적으로 다음 구조로 구성된다.

| 구조명               | 설명                                                        | 비고                               |
| -------------------- | ----------------------------------------------------------- | ---------------------------------- |
| 시스템 앱            | 사용자를 위한 앱으로 기본 구성 앱.                          | Dialer, Email, Calaender, Camera   |
| JAVA API             | 앱이 사용하는 프레임워크, 클래스, 메소드에 대한 라이브러리. | Content Providers, View, Managers  |
| C/C++ 라이브러리     | C/C++ 네이티브 코드를 기반 빌드 제공. OpenGL API 지원.      | Webkit, OpenGL ES, Media Framework |
| 안드로이드 런타임    | 안드로이드 컴파일러, 실행환경을 제공.                       | Android Runtime, Core Libraries    |
| 하드웨어 추상화 계층 | API 프레임워크에 하드웨어 기능을 노출하는 표준 인터페이스.  | Audio, Bluetooth, Camera, Sensors  |
| Linux 커널           | 메모리, 프로세스, 네트워크, 드라이버를 관리하는 OS 커널.    | Linux Kernel, Power Management     |

# 10강. 이벤트 처리 2

## 터치 입력

사용자가 레이아웃을 터치하면서 발생하는 사용자 이벤트를 처리하는 방법이다.

- 터치 그림판 예제.

```java
public class MainActivity extends Activity {
    private MyView view;

    public class Vertex {
        Vertex(float ax, float ay, boolean ad) {
            x = ax;
            y = ay;
            Draw = ad;
        }
        float x;
        float y;
        boolean Draw;
    }

    ArrayList<Vertex> arVertex;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new MyView(this);
        setContentView(view);
        arVertex = new ArrayList<Vertex>();
    }

    protected class MyView extends View {
        Paint paint;

        public MyView(Context context) {
            super(context);
            paint = new Paint();
            paint.setColor(Color.BLUE);
            paint.setStrokeWidth(3);
            paint.setAntiAlias(true);
        }

        public void onDraw(Canvas canvas) {
            int i;
            canvas.drawColor(Color.LTGRAY);
            for(i = 0; i < arVertex.size(); i++) {
                if(arVertex.get(i).Draw) {
                    canvas.drawLine(arVertex.get(i - 1).x, arVertex.get(i - 1).y, arVertex.get(i).x, arVertex.get(i).y, paint);
                }
            }
        }

        public boolean onTouchEvent(MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_DOWN) {
                arVertex.add(new Vertex(event.getX(), event.getY(), false));
                return true;
            }
            if(event.getAction() == MotionEvent.ACTION_MOVE) {
                arVertex.add(new Vertex(event.getX(), event.getY(), true));
                return true;
            }
            return false;
        }
    }
}
```

## 키보드 입력

사용자가 키보드를 통해 입력할 때 발생하는 사용자 이벤트를 처리하는 방법이다. Key 코드를 인수로서 사용한다.

| 동작                | 설명                      |
| ------------------- | ------------------------- |
| KEYCODE_DPAD_LEFT   | 왼쪽 이동키               |
| KEYCODE_DPAD_RIGHT  | 오른쪽 이동키             |
| KEYCODE_DPAD_UP     | 위쪽 이동키               |
| KEYCODE_DPAD_DOWN   | 아래쪽 이동키             |
| KEYCODE_DPAD_CENTER | 중앙쪽 이동키             |
| KEYCODE_A ~ Z       | 알파벳 A ~ Z              |
| KEYCODE_0 ~ 9       | 숫자 0 ~ 9                |
| KEYCODE_CALL        | 통화                      |
| KEYCODE_ENDCALL     | 통화 종료                 |
| KEYCODE_HOME        | 홈                        |
| KEYCODE_BACK        | 뒤로                      |
| KEYCODE_VOLUME_UP   | 볼륨 증가                 |
| ACTION_DOWN         | 키를 누른 상태            |
| ACTION_UP           | 키를 뗀 상태              |
| ACTION_MULTIPLE     | 동일키를 여러번 누른 상태 |

- 키보드 입력 처리 예제.

```java
public class MainActivity extends Activity {
    private MyView view;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new MyView(this);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        setContentView(view);
    }

    protected class MyView extends View {
        float mX, mY, mR, mL;
        int mColor;

        public MyView(Context context) {
            super(context);
            mX = 500;
            mY = 500;
            mR = 600;
            mL = 600;
            mColor = Color.RED;
        }

        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);
            Paint paint = new Paint();
            paint.setColor(mColor);
            paint.setAntiAlias(true);
            canvas.drawRect(mX, mY, mR, mL, paint);
        }

        public boolean onKeyDown(int keyCode, KeyEvent event) {
            super.onKeyDown(keyCode, event);
            // getAction(): 동작을 가져온다.
            if(event.getAction() == KeyEvent.ACTION_DOWN) {
                switch(keyCode) {
                    case KeyEvent.KEYCODE_DPAD_LEFT:
                        mX -= 5;
                        mR -= 5;
                        invalidate();
                        return true;
                    case KeyEvent.KEYCODE_DPAD_RIGHT:
                        mX += 5;
                        mR += 5;
                        invalidate();
                        return true;
                    case KeyEvent.KEYCODE_DPAD_UP:
                        mY -= 5;
                        mL -= 5;
                        invalidate();
                        return true;
                    case KeyEvent.KEYCODE_DPAD_DOWN:
                        mY += 5;
                        mL += 5;
                        invalidate();
                        return true;
                }
            }
            return false;
        }
    }

    public void setFocusable(boolean b) {

    }
}
```

## 위젯 이벤트

위젯도 View들을 비교하여 이벤트를 처리하는 방법은 동일하지만, 한 번에 모아서 처리하는 것이 효율적이다.

- 위젯 이벤트 처리 예제.

```java
public class MainActivity extends AppCompatActivity {
    public void onCreatee(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_10_3);

        // good 버튼 이벤트 처리.
        Button buttonGood = (Button)findViewById(R.id.good);
        buttonGood.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                TextView textPool = (TextView)findViewById(R.id.question);
                textPool.setText("Good!!^^");
            }
        });

        // bad 버튼 이벤트 처리.
        Button buttonBad = (Button)findViewById(R.id.bad);
        buttonBad.setOnClickListener(new Button.OnCLickListener() {
            public void onClick(View view) {
                TextView textPool = (TextView)findViewById(R.id.question);
                textPool.setText("Bad~~ㅠㅠ");
            }
        });
    }
}
```

- 위젯 이벤트 처리 예제. (통합)

```java
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // good 버튼 리스너 등록.
        Button buttonGood = (Button)findViewById(R.id.good);
        buttonGood.setOnClickListener(this);

        // bad 버튼 리스너 등록.
        Button buttonBad = (Button)findViewById(R.id.bad);
        buttonBad.setOnClickListener(this);
    }

    public void onClick(View view) {
        TextView textPool = (TextView)findViewById(R.id.question);
        switch(view.getId()) {
            case R.id.good:
                textPool.setText("Good!!^^");
                break;
            case R.id.bad:
                textPool.setText("Bad~~ㅠㅠ");
                break;
        }
    }
}
```

## 타이머 이벤트

안드로이드 플랫폼은 특정 시간을 간격으로 함수를 주기적으로 실행하는 타이머 이벤트를 지원한다.

- 타이머 이벤트 처리 예제.

```java
public class MainActivity extends AppCompatActivity {
    int value = 0;
    TextView mText;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_10_6);
        mText = (TextView)findViewById(R.id.text);
        mHandler.sendEmptyMessage(0);
    }

    Handler mHandler = new Handler() {
        public void handleMessage(Message message) {
            value.setText("Timer Value = " + value);
            mHandler.sendEmptyMessageDelayed(0, 1000);
        }
    };
}
```

## 방향 이벤트

안드로이드 플랫폼은 가속도, 회전, 조도 센서 등의 다양한 종류의 센서를 다루는 API를 지원한다.

| 클래스 및 인터페이스명 | 설명                               | 종류      |
| ---------------------- | ---------------------------------- | --------- |
| SensorManager          | 센서에 접근하는 메소드를 제공한다. | Class     |
| Sensor                 | 센서의 객체를 선언한다.            | Class     |
| SensorEventListener    | 이벤트 형태의 센서값을 처리한다.   | Interface |
| SensorEvent            | 센서값을 갖고 접근할 수 있다.      | Class     |

- 화면 전환 처리 예제.

```xml
<RelativeLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerVertical="true"
        android:layout_centerHorizontal="true"
        android:orientation="vertical">
        <TextView
            android:id="@+id/orientation"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="초기 상태"/>
        <TextView
            android:id="@+id/arrow"
            android:layout_width="match_content"
            android:layout_height="wrap_content"
            android:textAlignment="center"
            android:text="†"/>
    </LinearLayout>
</RelativeLayout>
```

```java
public class MainActivity extends AppCompatActivity {
    OrientationEventListener mOrientationListener;
    TextView mDir;
    TextView mArrow;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDir = (TextView)findViewById(R.id.orientation);
        mArrow = (TextView)findViewById(R.id.arrow);
        mOrientationListener = new OrientationEventListener(this, SensorManager.SENSOR_DELAY_NORMAL) {
            @Override
            public void onOrientationChanged(int orientation) {
                mDir.setText("회전 값: " + String.valueOf(orientation));
                if(orientation >= 315 || orientation < 45) {
                    mArrow.setRotation(0);
                }else if(orientation >= 45 && orientation < 135) {
                    mArrow.setRotation(270);
                }else if(orientation >= 135 && orientation < 225) {
                    mArrow.setRotation(180);
                }else if(orientation >= 225 && orientation < 315) {
                    mArrow.setRotation(90);
                }
            }
        };
        mOrientationListener.enable();
    }
}
```

# 11강. 액티비티와 인텐트

## 액티비티 1

앱은 Activity, ContentProvider, BroadcastReceiver, Service의 네 개의 컴포넌트로 구성된다.

- Activity는 사용자가 앱과의 상호작용을 수행하는 기본적인 컴포넌트.
- ContentProvider는 앱과 데이터 계층 간의 매개체 역할을 수행하여 데이터를 가져오는 컴포넌트.
- BroadcastReceiver는 특정 이벤트에서 수신 및 처리를 수행하는 컴포넌트.
- Service는 백그라운드에서 작업을 수행하는 컴포넌트.

앱은 데스크톱 환경과는 달리 자원이 넉넉하지 않으므로 여러가지 제약이 발생한다.

- 메모리의 제한으로 동시에 많은 앱을 실행할 수 없다.
- 화면 크기의 제한으로 여러 앱을 동시에 보여줄 수 없다.

액티비티 자체는 안드로이드 앱을 관리하기 위한 단위로서 View, ViewGroup를 가지고, setContentView()로 View를 화면에 출력한다.

## 생명주기

앱은 여러 개를 동시에 실행할 수 있지만, 하나의 화면만을 출력한다. 따라서 생명주기(Life Cycle)에 맞추어 '**시작->실행->활성화->비활성화->중지->종료**'의 형태로 활성화, 비활성화되며 실행된다.

안드로이드 플랫폼은 작업들을 스택(Stack)의 형태로 관리하는데, 액티비티가 새로 생성되면 위로 쌓으며 활성화하는 구조이다.

| 상태    | 설명                                                         |
| ------- | ------------------------------------------------------------ |
| Active  | 사용자에게 보여지며 직접 사용하는 상태이다.                  |
| Pause   | 다른 액티비티로 포커스가 전환되어 일시중지된 상태이다.       |
| Stopped | 사용자에게 보여지지 않으며 언제든지 종료될 수 있는 상태이다. |

액티비티는 생성되어 종료될 때까지 onPause(), onResume()이 여러 차례 호출될 수 있다.

액티비티 상태와 관련된 메소드는 다음과 같다.

| 메소드명    | 설명                                                                             |
| ----------- | -------------------------------------------------------------------------------- |
| onCreate()  | 액티비티가 생성될 때 호출되며 필요한 초기화 작업들을 수행한다.                   |
| onRestart() | 액티비티가 중지된 후 다시 활성화되기 전에 호출된다.                              |
| onStart()   | 액티비티가 사용자에게 보이기 직전에 호출된다.                                    |
| onResume()  | 액티비티가 사용자와 상호작용 하기 직전에 호출된다.                               |
| onPause()   | 애니메이션을 중지하고, 데이터를 저장하며, 다른 액티비티가 실행될 때 호출된다.    |
| onStop()    | 액티비티가 사용자에게 보이지 않을 때 호출된다. 액티비티가 소멸된 상태가 아니다.  |
| onDestroy() | 액티비티가 완전히 소멸될 때 호출된다. finish(), isFinishing()으로 주체가 갈린다. |

## 인텐트 1

인텐트(Intent)는 여러 개의 액티비티로 구성된 앱에서 통신 장치, 메시지 전달 방식을 의미한다. 또한, 주요 컴포넌트들이 수행해야 할 작업의 정보를 가진다. 일반적인 함수에서 인수, 반환값의 역할과 유사하다.

인텐트 호출 메소드는 **startActivity(Intent intent)**로 인텐트 안에 호출 액티비티, 필요한 정보를 가지고 있다.

인텐트 생성자는 다른 액티비티를 호출할 때 주로 사용하며, 액티비티의 Class, Context 등을 사용한다.

- 인텐트 기본 예시.

```java
Intent intent = new Intent(MainActivity.this, SubActivity.class);
startActivity(intent);
```

명시적 인텐트(Explicit Intent)는 인텐트의 호출 컴포넌트를 분명하게 명시하는 것이다. 같은 앱의 SubActivity를 호출할 때 사용한다.

- 명시적 인텐트 예시.

```java
Intent searchIntent = new Intent(MainActivity.this, SearchService.class);
searchIntent.setData(Uri.parse(mapUrl));
startService(searchIntent);
```

암시적 인텐트(Implicit Intent)는 호출 대상이 분명히 정해지지 않은 인텐트를 말한다. 다른 앱의 내부 코드를 보지 않는 이상 분명한 이름을 알 수 없기 때문이다.

- 암시적 인텐트 예시.

```java
Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/"));
startActivity(intent);
```

## 액티비티 2

startActivity()를 사용하여 다른 액티비티를 호출하더라도 정상적으로 실행되지 않는다. 보안상의 이유 때문인데, AndroidManifest.xml에 수동으로 등록해야 한다.

- AndroidManifest 등록 예제.

```xml
<manifest>
    <application>
        <activity>
            (...)
            <intent-filter>
                <action android:name="android.intent.action.MAIN"/>
                <category android:name="android.intent.category.LAUNCHER"/>
            </intent-filter>
        </activity>
        <activity
            android:name=".SubActivity"
            android:label="SubActivity">
        </activity>
    </application>
</manifest>
```

액티비티명은 패키지명을 포함한 전체 경로로 지정하며, 같은 패키지는 앞에 '.'을 찍는다.

인텐트 필터(Intent-filter)는 액티비티가 어떤 종류의 인텐트를 받을 것인지 명시하는 필터 역할을 수행한다.

## 인텐트 2

사용할 인텐트를 명확히 하기 위해서는 Action, Data, Type, Category, Component 등의 정보들이 포함되어야 한다. 생성자를 전달하여 초기화할 수 있고, 메소드로 변경하거나 내용을 확인할 수도 있다.

Action은 개발자가 실행하고자 하는 동작을 의미하며 수행 작업을 지정한다. Action을 조사하거나 변경할 때는 getAction(), setAction()을 사용한다.

| 액션                    | 대상                | 설명                            |
| ----------------------- | ------------------- | ------------------------------- |
| ACTION_CALL             | 액티비티            | 통화를 시작한다.                |
| ACTION_EDIT             | 액티비티            | 데이터를 표시하고 편집한다.     |
| ACTION_MAIN             | 액티비티            | 메인 액티비티를 실행한다.       |
| ACTION_VIEW             | 액티비티            | 무언가를 보여준다.              |
| ACTION_DIAL             | 액티비티            | 전화를 건다.                    |
| ACTION_BATTER_LOW       | 브로드캐스트 리시버 | 배터리가 부족하다.              |
| ACTION_HEADSET_PLUG     | 브로드캐스트 리시버 | 헤드셋이 접속되거나 분리되었다. |
| ACTION_SCREEN_ON        | 브로드캐스트 리시버 | 화면이 켜졌다.                  |
| ACTION_TIMEZONE_CHANGED | 브로드캐스트 리시버 | 타임존이 변경되었다.            |

Data는 Action에 필요한 상세 데이터를 제공하는 역할을 수행한다. Action과 마찬가지로 접근하기 위해서는 getData(), setData()를 사용한다.

- 액티비티 명세 예제.

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    <EditText
        android:id="@+id/telText"
        android:layout_width="150dp"
        android:layout_height="wrap_content"
        android:editable="true"
        android:inputType="phone"/>
    <Button
        android:id="@+id/callButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:onClick="mOnClick"
        android:text="CALL"/>
</LinearLayout>
```

```java
public class MainActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button callButton = (Button)findViewById(R.id.callButton);
        callButton.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick(View view) {
                EditText telText = (EditText)findViewById(R.id.telText);
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + telText.getText()));
                startActivity(intent);
            }
        }
    }
}
```

# 12강. 프래그먼트

## 프래그먼트 1

프래그먼트(Fragment)는 하나의 액티비티를 분할하여 개별적인 목적에 맞는 특정 기능들을 수행하며, 스마트폰의 일부분을 차지한다. 하나의 화면에서 여러 프래그먼트들을 사용하여 풍족한 인터페이스를 제공받을 수 있다.

프래그먼트는 재사용이 가능하며, 생명주기가 서브 액티비티와 같이 결합된 액티비티에 종속된다.

프래그먼트 매니저(Fragment Manager)는 액티비티와 프래그먼트 사이의 중계자 역할을 수행하며 추가, 변경, 삭제에 대한 기능을 제공한다. setContentView()가 아닌 inflate() 메소드를 사용한다.

프래그먼트는 직접적으로 데이터 통신을 수행할 수 없으며, 액티비티를 통해서 통신을 수행해야 한다. 통신 종류는 다음과 같다.

- 인터페이스 기반 프래그먼트 통신
- 프래그먼트 전용 요청 API 통신
- 프래그먼트 간의 뷰 모델 통신

## 프래그먼트 2

액티비티와 프래그먼트는 다음 차이점을 가지고 있다.

| 액티비티                                           | 프래그먼트                                            |
| -------------------------------------------------- | ----------------------------------------------------- |
| 사용자가 상호작용할 수 있는 인터페이스를 제공한다. | 액티비티의 일부분으로 부분적 UI를 제공한다.           |
| 종속적이지 않고, 독립적인 수행이 가능하다.         | 액티비티에 종속적이고, 독립적으로 수행할 수 없다.     |
| 액티비티 매니저를 통해서 관리한다.                 | 프래그먼트 매니저를 통해서 관리한다.                  |
| 액티비티 만으로 멀티스크린 UI를 만들 수 없다.      | 여러 프래그먼트를 사용하여 멀티스크린을 만들 수 있다. |
| 사용 전에 매니페스트에 등록해야 한다.              | 사전에 매니페스트에 언급되지 않는다.                  |
| 시스템의 백 스택을 관리하여 개발자의 개입이 적다.  | 백 스택에 저장되지 않아 개발자의 개입이 필요하다.     |
| 액티비티는 재사용이 불가능하다.                    | 프래그먼트는 재사용이 가능하다.                       |
| 프래그먼트 대비 무거운 성능을 갖는다.              | 액티비티 대비 가벼운 성능을 갖는다.                   |

프래그먼트는 전체적으로 세 가지 단계로 나눌 수 있다.

- 액티비티에 프래그먼트가 선언되고 초기화되는 추가 단계.
- 정의된 동작을 수행하는 프래그먼트 실행 단계.
- 프래그먼트 동작을 완료하고 종료되는 시점인 종료 단계.

프래그먼트 상태 관리 메소드는 다음과 같다.

| 메소드              | 설명                                                                                 |
| ------------------- | ------------------------------------------------------------------------------------ |
| onAttach()          | 프래그먼트가 액티비티에 붙을 때, 리소스를 가져다 쓸 때 오버라이드하여 사용한다.      |
| onCreate()          | 프래그먼트가 생성될 때, 재시작될 때 초기화에 사용한다.                               |
| onCreateView()      | View를 인스턴스화하며, UI 관련 값을 초기화한다.                                      |
| onActivityCreated() | 부모 액티비티의 onCreate()가 종료된 후 실행된다.                                     |
| onStart()           | 액티비티가 시작된 사앹에서 호출되고, UI를 관리하는 코드 또는 값을 초기화한다.        |
| onResume()          | 프로그래밍이 일시 중지되어 onPause()를 호출하고 재시작할 때 초기화 작업을 수행한다.  |
| onPause()           | 화면이 중지되거나, 사용자가 프래그먼트를 떠나면 호출된다.                            |
| onStop()            | 다른 액티비티에 의해서 화면에 보이지 않을 때 필요가 없는 기능을 모두 중지한다.       |
| onDestroy()         | 액티비티, 프래그먼트가 소멸되기 전에 호출된다. 해제되지 않은 리소스를 해제해야 한다. |
| onDestroyView()     | 프래그먼트와 관련된 View가 제거된다.                                                 |
| onDetach()          | 프래그먼트가 액티비티로부터 해제될 때 호출된다.                                      |

- 프래그먼트 예제 1.

```java
// FragmentFirst.java
public class FragmentFirst extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
}

// FragmentSecond.java
public class FragmentSecond extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
}

// MainActivity.java
public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
    }

    public void showFragment(View view) {
        fragmentTransaction = fragmentManager.beginTransaction();
        if(view == findViewById(R.id.button1)) {
            FragmentFirst fragmentFirst = new FragmentFirst();
            fragmentTransaction.replace(R.id.fragment_container, fragmentFirst);
            fragmentTransaction.commit();
        }else {
            FragmentSecond fragmentSecond = new FragmentSecond();
            fragmentTransaction.replace(R.id.fragment_container, fragmentSecond);
            fragmentTransaction.commit();
        }
    }
}
```

## 프래그먼트 통신

- 프래그먼트 예제 2.

```xml
<!-- fragment_top.xml -->
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="[TOP 프래그먼트]"/>
    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="메시지 대기중"/>
</LinearLayout>

<!-- fragment_bottom.xml -->
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="[BOTTOM 프래그먼트]"/>
    <EditText
        android:id="@+id/edit_text"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="메시지를 작성하시오"/>
    <Button
        android:id="@+id/btn_send"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="메시지 전송"/>
</LinearLayout>

<!-- activity_main.xml -->
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    tools:context=".MainActivity">
    <FrameLayout
        android:id="@+id/TopFrame"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="0.5"/>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="1dp"
        android:background="#FF1E1E"/>
    <FrameLayout
        android:id="@+id/BottomFrame"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="0.5"/>
</LinearLayout>
```

```java
// TopFragment.java
public class TopFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_top, container, false);
    }
    public void setText(CharSequence text) {
        TextView textView = (TextView)getView().findViewById(R.id.textView);
        textView.setText(text);
    }
}

// BottomFragment.java
public class BottomFragment extends Fragment {
    private BottomListener bottomListener;
    private EditText editText;
    private Button button;

    public interface BottomListener {
        void BottomSender(CharSequence input);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_bottom, container, false);
       editText = view.findViewById(R.id.edit_text);
       button = view.findViewById(R.id.btn_send);
       button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            CharSequence input = editText.getText();
            bottomListener.BottomSender(input);
        }
       });
       return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof BottomListener) {
            bottomListener = (BottomListener) context;
        }else {
            throw new RuntimeException(context.toString() + " must implement FragmentBottomListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        bottomListener = null;
    }
}

// MainActivity.java
public class MainActivity extends AppCompatActivity implements BottomFragment, BottomListener {
    BottomFragment.BottomListener {
        TopFragment topFragment;
        BottomFragment bottomFragment;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            topFragment = new TopFragment();
            bottomFragment = new BottomFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.TopFrame, topFragment)
                    .replace(R.id.BottomFrame, bottomFragment)
                    .commit();
        }

        @Override
        public void BottomSender(CharSequence input) {
            topFragment.setText(input);
        }
    }
}
```
