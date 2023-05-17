# 1강. 컴퓨터 그래픽스 개관

## CG 개요

컴퓨터를 활용하여 그림을 그리거나 조작하는 기술 또는 완성된 그림.

| 소프트웨어                             | 하드웨어        |
| -------------------------------------- | --------------- |
| 그래픽스 기본요소 생성 알고리즘        | 입출력 장치     |
| 객체의 이동, 회전, 크기 등의 기하 변환 | 비디오 메모리   |
| 2차원 및 3 차원 뷰잉 알고리즘          | 그래픽스 처리기 |
| 조명 및 물체 렌더링 알고리즘           | ETC             |

## CG 활용

CAD(Computer Aided Design)는 컴퓨터 지원 설계의 줄임말이다. 자동차, 조선, 항공, 건축 등의 다양한 분야에서 활용되며, 다음 목록으로 요약할 수 있다.

- 컴퓨터를 사용하여 객체를 설계하는 보조 기술.
- 2차원 및 3차원으로 입체적인 모델링을 활용한 도면 제작.
- 제품의 설계, 최적화, 검증을 시각적으로 보여주는 디지털 프로타이핑.
- CAM(Computer-aided manufacturing)과 연동을 통해 제조 공정의 향상.

디지털 아트(Digital Art)는 컴퓨터의 그래픽을 통해 디지털의 형태로 표현하는 새로운 예술 분야이다. 디지털 회화, 디지털 설치 예술, 가상 현실 등을 예로 들 수 있다.

가시화(Visualization)은 영상, 도표, 애니메이션을 통해 메시지를 알기 쉽게 전달하는 기술이다.코로나 지도, 자동차의 충격 시뮬레이션 등을 예로 들 수 있다.

가상현실(VR, Virtual Reality)은 컴퓨터 시뮬레이션을 통해 현실과 가까운 감각을 제공하는 가상 환경을 말한다. 다음 목록의 효과를 얻을 수 있다.

- 스크린과 입체 디스플레이를 사용하여 시각 정보 제공.
- 데이터 장갑 등을 통해서 컴퓨터와 실시간 상호작용.
- 음향 및 촉각 정보를 활용하여 현실감 증대.

증강현실(AR, Augmented Reality)은 현실 세계에 디지털 정보를 결합하여 정보의 가치를 높이는 기술. 혼합 현실(MR, Mixed reality)는 가상 객체와 현실 객체를 통합하여 새로운 경험을 제공하는 기술.

## CG 시스템 구성

컴퓨터 그래픽스의 처리 및 실행에 사용되는 대표적인 장치로는 상용 컴퓨터에서 사용하는 그래픽 카드를 예로 들 수 있다. 그래픽카드는 그래픽스 처리 장치, 비디오 메모리, 비디오 출력 인터페이스, 비디오 BIOS로 구성된다.

GPU(Graphics Processing Unit)는 그래픽스 연산의 처리를 담당하는 전용 프로세서로 다음과 같은 기능을 수행한다.

- 그래픽스 객체를 XY 좌표의 픽셀 집합으로 표현하는 주사변환(Rasterization) 기능.
- 2차원 및 3차원 그래픽스 렌더링(Rendering) 기능.
- 디지털 비디오 데이터 처리 기능.

VRAM(Video Random Access Memory)은 GPU 동작에 필요한 프로그램 및 데이터를 버퍼를 사용하여 저장한다. 버퍼의 종류는 다음과 같다.

- 실제 화면에 출력되고 있는 픽셀 값을 저장하는 전면 버퍼(Front Buffer).
- 실제 렌더링이 일어나고 있는 후면 버퍼(Back Buffer).
- 색상 값을 기록하는 색상 버퍼(Color Buffer, Frame Buffer).
- 객체 깊이 정보를 기록하는 깊이 버퍼(Depth Buffer, Z Buffer).
- 렌더링에서 제외할 픽셀을 기록하는 스텐실 버퍼(Stencil Buffer).

비디오 출력 인터페이스는 프레임 버퍼에서 저장하고 있는 화면을 디스플레이 장치에 출력한다. VGA, DVI, HDMI, DP, Thunderbolt3 등이 있다.

- VGA(Video Graphics Array)는 아날로그 방식의 표준 인터페이스.
- DVI(Digital Visual Interface)는 디지털 방식의 표준 인터페이스.
- HDMI(High Definition Multimedia Interface)는 비디오, 오디오, 제어 등의 단자들을 통합한 표준 인터페이스.
- DP(Display Port)는 TV에 최적화된 HDMI와 달리 컴퓨터에 최적화된 인터페이스.
- Thunderbolt3는 USB-C 타입의 연결을 제공하는 인터페이스.

비디오 BIOS는 그래픽 카드의 동작의 기반을 제공하는 펌웨어 형태의 기본 소프트웨어이다.

## 디스플레이 방식

벡터 방식은 임의 주사 디스플레이로도 부르며, 점과 점을 선으로 연결하여 그림을 그린다.

래스터 방식은 일정한 간격의 격자에 픽셀의 형태로 그림을 그린다. 벡터 방식과 달리 화면이 일그러지는 에일리어싱(Aliasing)이 발생할 수 있으며, 관련 용어들은 다음과 같다.

- 픽셀(Pixel)은 격자에 표시되는 점을 의미한다.
- 프레임(Frame)은 전체 스크린 영역의 그림이다.
- 프레임 버퍼(Frame Buffer)는 하나의 프레임의 픽셀 값들을 저장하는 버퍼이다.
- 해상도(Resolution)는 디스플레이 할 수 있는 픽셀의 수이다.
- 주사변환(Rasterization)은 그래픽스 객체를 이산적인 픽셀 집합으로 표현하는 것이다.

# 2강. 컴퓨터 그래픽스 소프트웨어

## 래스터 그래픽스 영상

래스터 그래픽스 영상의 래스터(Raster)는 CRT의 주사방식에서 유래하였다. 사각형 격자 좌표의 픽셀 배열로 구성되며, 색상과 크기에 따라서 정확도에서 차이를 보인다. 때문에 그림을 확대해도 세밀한 그림을 얻을 수 없다.

관련한 장치로는 디지털 카메라, 스캐너를 들 수 있으며, 소프트웨어로는 MS Paint, Photoshop 등의 이미지 편집 프로그램이 존재한다.

| 확장자 | 설명                                                                                         | 비고                             |
| ------ | -------------------------------------------------------------------------------------------- | -------------------------------- |
| TIFF   | 무손실 포맷. 웹과 호환되지 않는 고해상도 이미지에 사용. 레이어를 포함하여 편집에서 유용하다. | Tag Image File Format            |
| BMP    | 무손실 포맷. 윈도우 환경에서 사용. 이미지 용량이 크다.                                       | Bitmap                           |
| PNG    | 무손실 포맷. 웹에서 주로 사용. 투명 배경(Transparent) 기능을 지원한다.                       | Portable Network Graphics        |
| JPEG   | 손실 포맷. 저용량 이미지에 사용. 확장자는 .jpeg가 아닌 .jpg이다.                             | Joint Photographic Exprets Group |

## 벡터 그래픽스 영상

벡터 그래픽스 영상의 벡터(Vector)는 크기와 방향을 나타내는 수학적 용어이다. 직선 및 곡선을 사용하여 그림을 표현하며, 요소의 수에 따라서 크기가 결정된다. 프레젠테이션을 위해 래스터 영상으로 변환하는 렌더링 작업이 필요하다.

관련 소프트웨어는 Adobe Iliustrator, CorelDRAW 등의 편집 프로그램, 3dsMax, Maya 등의 3차원 그래픽 프로그램 등이 있다.

| 확장자 | 설명                                    | 비고                     |
| ------ | --------------------------------------- | ------------------------ |
| SVG    | 웹 친화적인 벡터 파일 포맷.             | Scalable Vector Graphics |
| PDF    | 프레젠테이션, 문서 등에 사용하는 포맷.  | Portable Document Format |
| EPS    | 전문적인 고품질 이미지에 사용하는 포맷. | Encapsulated PostScript  |
| WMF    | 윈도우 운영 체제의 백터 파일 포맷.      | Windows Meta File        |
| DXF    | 2D, 3D 도면에 사용하는 벡터 파일 포맷.  | Drawing Exchange Format  |

## 컴퓨터 그래픽스 패키지

특수목적 패키지는 특정 응용 분야에 특화된 그래픽 결과물을 생성하기 위한 그래픽스 패키지이다.

- 건축, 기계, 전자회로 등의 하드웨어를 설계하는 CAD 패키지 프로그램.
- 래스터 그림 및 사진들을 편집하는 페인트 패키지 프로그램.
- 모델링 및 애니메이션을 생성하는 모델링 패키지 프로그램.

범용 그래픽스 API는 C/C++, Java와 같은 프로그래밍 언어에서 프로그래밍할 수 있는 환경을 제공하는 그래픽스 라이브러리이다. 화면 설계 및 렌더링 관련 함수들을 제공한다.

| 수준   | 설명                                                       | 예                           |
| ------ | ---------------------------------------------------------- | ---------------------------- |
| 고수준 | 장면 묘사 기능. 다양한 모형들을 객체로 장면을 구성.        | Open Inventor, VRML, Java 3D |
| 저수준 | 기본요소, 속성지정, 기하변환, 뷰잉등을 정의하는 함수 제공. | GL, OpenGL, Direct3D         |

## OpenGL 프로그래밍

OpenGL은 저수준 절차적 그래픽스 API로서, GL을 다양한 환경에서 활용할 수 있도록 독립적으로 개발되었다.

OpenGL은 하드웨어의 발전에 따라서 기능을 추가한 버젼을 공개하고 있다.

| 버젼       | 변경사항                              | 비고                                               |
| ---------- | ------------------------------------- | -------------------------------------------------- |
| OpenGL 1.0 | 고정 기능 그래픽스 파이프라인을 추가. | 고정 개수의 파라미터에 의해 제어하는 파이프라인.   |
| OpenGL 2.0 | GLSL(OpenGL Shading Language)를 추가. | C언어 기반의 상위 레벨 셰이딩 언어.                |
| OpenGL 3.0 | 디프리케이션 모델 도입.               | 오래된 접근방식을 탈피하고 새로운 접근방식을 제공. |
| OpenGL 4.0 | 두 단계의 테셀레이션 셰이더 추가.     | 고차원의 요소들을 저차원의 요소들로 분할.          |

## OpenGL 라이브러리

OpenGL Core Profile은 셰이더 데이터, 상태 설정, 지시 명령 등을 통해 프로그램을 준비한다. OpenGL Compatibility Profile은 구버전과의 호환성을 위해서 제공하는 기능들을 포함한다. 추가적인 라이브러리는 다음과 같다.

| 라이브러리 | 설명                                                    | 비고                       |
| ---------- | ------------------------------------------------------- | -------------------------- |
| GLFW       | 화면 설계, 이벤트 처리 등을 제공하는 간단한 API.        | Graphics Library Framework |
| GLEW       | OpenGL 환경을 확장하여 개선된 개발 환경을 지원하는 API. | OpenGL Extension Wrangler  |
| GLEE       | OpenGL 프로그램을 위한 단순한 추가 기능을 지원하는 API. | OpenGL Easy Extenstion     |
| GLUT       | OpenGL 인터페이스의 창 관리를 제공하는 유틸리티 툴킷.   | OpenGL Utility Toolkit     |
| FreeGLUT   | Deprecated된 GLUT를 대체하기 위해 개발된 라이브러리.    |                            |

## OpenGL 자료형

OpenGL에서 사용하는 특수한 자료형은 다음과 같다.

| 자료형                     | C/C++ 자료형          | 접미사 |
| -------------------------- | --------------------- | ------ |
| GLbyte                     | 8비트 정수            | b      |
| GLshort                    | 16비트 정수           | s      |
| GLint, GLsizei             | 32비트 정수           | i      |
| GLfloat, GLclampf          | 32비트 실수           | f      |
| GLdouble, GLclampd         | 64비트 실수           | d      |
| GLubyte, GLboolean         | 8비트 부호 없는 정수  | ub     |
| GLushort                   | 16비트 부호 없는 정수 | us     |
| GLuint, GLenum, GLbitfield | 32비트 부호 없는 정수 | ui     |

OpenGL에서 사용하는 함수 형식은 다음과 같다.

```cpp
// return_type  <lib_prefix>FunctionName<arg_count><arg_type>{v}(<arguments>);
// return_type  : 반환 타입.
// lib_prefix   : 함수 접두사.
// FunctionName : 함수 명.
// arg_count    : 함수가 갖는 인수 수.
// arg_type     : 인수의 타입.
// v            : 벡터일 경우 첨가.
// arguments    : 인수.

void glClear(GLbitfield buf);

void glUniform2f(GLint location, GLfloat v0, GLfloat v1);
```

## 셰이더

OpenGL이 동작하는 순서를 나타내는 공식 파이프라인은 다음과 같다.

| 순서 | 파이프라인      | 설명                                                                        |
| ---- | --------------- | --------------------------------------------------------------------------- |
| 1    | Vertex Puller   | 꼭짓점 전달. 선 및 테두리를 정의하는 점들의 리스트를 생성한다.              |
| 2    | Vertex Shader   | 꼭짓점 셰이더. GLSL로 작성하여 정의한 점 데이터를 조작한다.                 |
| 3    | Tessellation    | 테셀레이션. 셰이더를 세부적인 메쉬로 나눈다.                                |
| 4    | Geometry Shader | 기하구조 셰이더. 입력 데이터를 가져와서 0 개 이상의 출력 데이터를 생성한다. |
| 5    | Resterization   | 래스터화. 화면을 출력하기 위해서 래스터화 한다. (Fragment)                  |
| 6    | Fragment Shader | 프래그먼트 셰이더. GLSL로 작성된 프로그램이 각 Fragment의 색을 계산한다.    |

## 코드 예제

```cpp
// 선언부.
#include <iostream>
using namespace std;

#define FREEGLUT_STATIC
#define GLEW_STATIC
#include <gl/glew.h>
#include <gl/freeglut.h>

// 3차원 좌표를 표현하기 위한 구조체.
struct Vec3f {
    float x, y, z;
    Vec3f() {}
    Vec3f(float _x, float _y, float _z) : x(_x), y(_y), z(_z) {}
};

enum {TRIANGLE, N_VBOs};
GLuint VBO[N_VBOs]; // 꼭짓점 버퍼 객체.


// 꼭짓점 셰이더 소스.
static const char* pVS =
"#version 330                            \n"
"layout (location = 0) in vec3 Position; \n"
"                                        \n"
"void main()                             \n"
"{                                       \n"
" gl_Position = vec4(Position*0.1, 1.0); \n"
"}";

// 프래그먼트 셰이더 소스.
static const char* pFS =
"#version 330                           \n"
"out vec4 FragColor;                    \n"
"                                       \n"
"void main()                            \n"
"{                                      \n"
" FragColor = vec4(1.0, 0.0, 0.0, 1.0); \n"
"}";

// 개별 셰이더 추가 함수.
static void AddShader(GLuint shaderProg, const char* pShaderSrc, GLint ShaderType)
{
    // 셰이더 생성.
    GLuint shader = glCreateShader(ShaderType);
    if(!shader)
    {
        cerr << "오류 - Shader 생성(" << ShaderType << ")" << endl;
    }

    // 셰이더 컴파일.
    const GLchar* src[1] = { pShaderSrc };
    const GLint len[1] = { strlen(pShaderSrc) };
    glShaderSource(shader, 1, src, len);
    glCompileShader(shader);
    GLint success;
    glGetShaderiv(shader, GL_COMPILE_STATUS, &success);

    // 컴파일 오류 처리.
    if(!success) {
        GLchar infoLog[256];
        glGetShaderInfoLog(shader, 256, NULL, infoLog);
        cerr << "오류 - Shader 컴파일(" << ShaderType << "): " << infoLog << endl;
        exit(1);
    }

    // 셰이더 프로그램에 컴파일된 셰이더 추가.
    glAttachShader(shaderProg, shader);
}

// 전체 셰이더 추가 함수.
static void SetUpShaders()
{
    // 셰이더 프로그램 객체 생성
    GLuint shaderProg = glCreateProgram();
    if (!shaderProg) {
        cerr << "오류 - Shader 프로그램 생성" << endl;
        exit(1);
    }

    // 꼭짓점 셰이더 및 프래그먼트 셰이더 적재
    AddShader(shaderProg, pVS, GL_VERTEX_SHADER);
    AddShader(shaderProg, pFS, GL_FRAGMENT_SHADER);
    GLint success = 0;
    GLchar errLog[256];

    // 셰이더 프로그램 링크 및 오류 처리.
    glLinkProgram(shaderProg);
    glGetProgramiv(shaderProg, GL_LINK_STATUS, &success);
    if (!success) {
        glGetProgramInfoLog(shaderProg, sizeof(errLog), NULL, errLog);
        cerr << "오류 - Shader 프로그램 링크: " << errLog << endl;
        exit(1);
    }

    // 프로그램 객체 유효 검사.
    glValidateProgram(shaderProg); // 프로그램 객체가 유효한지 검사
    glGetProgramiv(shaderProg, GL_VALIDATE_STATUS, &success);
    if (!success) {
        glGetProgramInfoLog(shaderProg, sizeof(errLog), NULL, errLog);
        cerr << "Invalid shader program: " << errLog << endl;
        exit(1);
    }

    // 셰이더 프로그램 객체로 지정.
    glUseProgram(shaderProg);
}

// 화면 렌더링 콜백 함수.
static void RenderCB()
{
    // 화면 초기화.
    glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
    glClear(GL_COLOR_BUFFER_BIT);

    glEnableVertexAttribArray(0);
    glBindBuffer(GL_ARRAY_BUFFER, VBO[TRIANGLE]);
    glVertexAttribPointer(0, 3, GL_FLOAT, GL_FALSE, 0, 0);
    glDrawArrays(GL_TRIANGLES, 0, 3);
    glDisableVertexAttribArray(0);
    glFinish();
}

// 꼭짓점을 저장하는 버퍼 생성.
static void InitVBOs()
{
    // 삼각형 꼭짓점 좌표로 요소 초기화.
    Vec3f Vertices[3];
    Vertices[0] = Vec3f(-5.0f, -5.0f, 0.0f);
    Vertices[1] = Vec3f(5.0f, -5.0f, 0.0f);
    Vertices[2] = Vec3f(0.0f, 5.0f, 0.0f);

    // 꼭짓점 버퍼를 생성하고 꼭짓점 좌표 전달.
    glGenBuffers(N_VBOs, VBO);
    glBindBuffer(GL_ARRAY_BUFFER, VBO[TRIANGLE]);
    glBufferData(GL_ARRAY_BUFFER, sizeof(Vertices), Vertices, GL_STATIC_DRAW);
}

// main 함수.
int main(int argc, char** argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowPosition(50, 100);
    glutInitWindowSize(640, 480);
    glutCreateWindow("OpenGL Sample");

    GLenum s = glewInit();
    if (s != GLEW_OK) {
        cerr << "오류 - " << glewGetErrorString(s) << endl;
        return 1;
    }

    cout << "GL version: " << glGetString(GL_VERSION) << endl;
    cout << "GLSL version: " << glGetString(GL_SHADING_LANGUAGE_VERSION) << endl;

    SetUpShaders();
    InitVBOs();
    glutDisplayFunc(RenderCB);
    glutMainLoop();
    return 0;
}
```

# 3강. 컴퓨터 그래픽스 기본요소(1)

## 좌표의 표현

데카르트 좌표계(Cartesian Coordinate System)는 하나의 점에서 수직으로 교차하는 직선 축으로 표현되는 좌표계.

동차좌표(Homogeneous Coordinates)는 n차원 투영공간을 n + 1개의 좌표로 나타내는 좌표계.

## OpenGL 점 및 선분 그리기

꼭짓점 버퍼 객체를 생성하고, 좌표를 저장한 후에 꼭짓점 셰이더에 전달한다.

```cpp
enum {TRIANGLE, N_VBOs};
GLuint VBO[N_VBOs]; // VBO(Vertex Buffer Object)는 꼭짓점 정보를 저장하는 집합 버퍼.
// (...)
GLfloat Vertices[3][3] = {
    {-5.0f, -5.0f, 0.0f}, {5.0f, -5.0f, 0.0f}, {0.0f, 5.0f, 0.0f}
};
glGenBuffers(N_VBOs, VBO);                                                  // 새로운 버퍼를 생성.
glBindBuffer(GL_ARRAY_BUFFER, VBO[TRIANGLE]);                               // 생성한 버퍼에 타겟을 할당.
glBufferData(GL_ARRAY_BUFFER, sizeof(Vertices), Vertices, GL_STATIC_DRAW);  // 실제 버퍼에 데이터를 삽입.
```

glDrawArrays 함수를 사용하여 점을 그릴 수 있다. Mode를 GL_POINTS로 지정한다.

```cpp
glEnableVertexAttribArray(0);                           // 꼭짓점 데이터의 시작 인덱스를 렌더링 엔진에 알려줌.
glBindBuffer(GL_ARRAY_BUFFER, VBO[TRIANGLE]);
glVertexAttribPointer(0, 3, GL_FLOAT, GL_FALSE, 0, 0);  // 위치 속성을 객체에서 가져오는 속성을 지정.
glDrawArrays(GL_POINTS, 0, 3);                          // 꼭짓점을 그림.
glDisableVertexAttribArray(0);                          // 꼭짓점 데이터의 끝 인덱스를 렌더링 엔진에 알려줌.
```

glDrawArrays 함수를 사용하여 선분을 그릴 수 있다. Mode들은 다음과 같다.

- GL_LINES, 나열된 꼭짓점들을 두 개씩 짝을 지어 선분을 그린다.
- GL_LINE_STRIP, 나열된 꼭짓점들을 계속 연결하여 다중선분을 그린다.
- GL_LINE_LOOP, 나열된 꼭짓점들을 계속 연결하여 닫힌 다중선분을 그린다.

## DDA 알고리즘

DDA(Digital Differential Analyzer)는 절대값 |m|에 맞추어 기준축의 좌표가 1씩 증가할 때, 나머지 축 좌표의 변화를 구하여, 좌표를 계산하는 알고리즘이다.

- |m| <= 1, x축 좌표가 1씩 변화할 때, y축 좌표가 m만큼 변화한다.
- |m| > 1, y축 좌표가 1씩 변화할 때, x축 좌표가 1/m만큼 변화한다.

DDA 알고리즘의 코드 예제는 다음과 같다.

```cpp
void DDA(int x0, int y0, int xEnd, int yEnd)
{
    // x0 != xEnd, y0 != yEnd로 가정.
    int dx = xEnd - x0, dy = yEnd - y0;
    int steps, k;
    float xIncrement, yIncrement, x = x0, y = y0;

    if(abs(dx) > abs(dy))
        steps = abs(dx);
    else
        steps = abs(dy);

    xIncrement = float(dx) / float(steps);
    yIncrement = float(dy) / float(steps);

    setPixel(round(x), round(y));
    for(k = 0; k < steps; k++)
    {
        x += xIncrement;
        y += yIncrement;
        setPixel(round(x), round(y));
    }
}
```

## Bresenham 알고리즘

브레젠험 직선 알고리즘(Bresenham's Line Algorithm)은 컴퓨터 그래픽스에서 복잡한 실수 계산을 대체하여, 정수 계산으로 직선을 그리는 알고리즘이다. 코드 예제는 다음과 같다.

```cpp
void bresenham_line(int xl, int yl, int xr, int yr)
{
    int x, y = yl, W = xr - xl, H = yr - yl;
    int F = 2 * H - W, dF1 = 2 * H, dF2 = 2 * (H - W);

    for(x = xl; x <= xr; x++)
    {
        setPixel(x, y);
        if(F < 0)
            F += dF1;
        else {
            y++;
            F += dF2;
        }
    }
}
```
