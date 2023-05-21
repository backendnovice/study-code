# 1강. 컴퓨터 보안의 개요

## 컴퓨터 보안의 개념

정보보호는 저장 및 전달될 정보를 여러가지 위협으로부터 보호하기 위한 정책 및 기법이다. 위협의 종류로는 허락되지 않은 접근, 수정, 훼손, 유출 등이 있다.

컴퓨터 보안은 정보보호의 대표적인 세부영역으로 컴퓨팅 환경에서 모든 위협상황에 대하여 대처하기 위한 정책 및 기법들을 말한다.

## 정보보호의 목표

정보보호의 핵심 목표는 기밀성, 무결성, 가용성으로 나눌 수 있다.

**기밀성(Confidentiality)** 은 허락되지 않은 자가 정보의 내용을 알 수 없도록 하는 것이다. 예로 은행업무 중에 고객의 계좌 정보가 제 3자에게 알려지는 것을 방지하는 것을 들 수 있다. 기밀성을 지키는 방법은 다음과 같다.

- 허락되지 않은 자가 정보 접근을 아예 불가하게 한다.
- 정보에 접근할 수 있더라도 알수없는 내용만을 보이도록 암호화한다.

**무결성(Integrity)** 은 허락되지 않은 자가 정보를 임의로 수정할 수 없도록 하는 것이다. 예로 DB의 고객정보가 임의로 수정되지 않도록 보호하고 조회할 때 전달과정에서 위변조를 방지하는 것을 들 수 있다. 무결성을 지키는 방법은 다음과 같다.

- 허락되지 않은 자가 정보 수정을 아예 불가하게 한다.
- 임의의 수정이 발생했다면 로그를 통해 기록하여 확인하고 추적한다.

**가용성(Availability)** 은 허락된 자가 정보에 접근할 때 방해하지 않도록 하는 것이다. 예로 고객이 정당한 절차를 거쳐서 개인 정보를 얻고자 할 때 즉시 조회가 가능하게 하는 것을 들 수 있다. 가용성을 지키는 방법은 다음과 같다.

- 정당한 조회 절차를 수립하여 사용자에게 제공한다.
- 사용자에게 일정 시간안에 정보의 취득을 보장한다.

정보보호의 부가 목표는 부인방지, 인증, 접근제어로 나눌 수 있다.

**부인방지(Non-repudiation)** 는 정보에 관여한 자가 이를 부인하지 못하도록 하는 것이다. 세부적으로 다음과 같이 나눌 수 있다.

- 발신 부인방지, 정보를 발신한 자가 정보의 발신 여부를 부인하지 못하도록 막는다.
- 수신 부인방지, 정보를 수신한 자가 정보의 수신 여부를 부인하지 못하도록 막는다.

**인증(Authentication)** 은 정보와 정보를 주체로 하는 실체의 신뢰 여부를 검토하는 것이다.

**접근제어(Access Control)** 는 정보에 허락된 접근만을 허용하고 외는 허용하지 않는 것이다. 보통 사용자의 위치 및 직급에 따라서 분류하여 관리한다.

## 정보화 환경과 역기능

정보화 사회가 성숙되어가며 인터넷을 통해 지구 반대편의 일도 실시간으로 파악할 수 있게 되었다. 동시에 악성 댓글, 스팸 메일, 피싱, 파밍, 스미싱 등의 정보와 관련된 범죄들이 증가를 불러왔다. 기술이 발전되는 것에 맞추어 랜섬웨어 등의 새로운 범죄들도 등장하고 있다.

## 컴퓨터의 역사

컴퓨터의 발전과 바이러스의 사례를 간략히 요약하면 아래 표와 같다.

| 시기        | 설명                                                                                                                 |
| ----------- | -------------------------------------------------------------------------------------------------------------------- |
| 1950년 이전 | 앨런 튜링(Alan Turing)이 독일의 애니그마 암호문 해독기 고안.                                                         |
| 1950년      | 메인프레임이 정부 기관과 학교에서 사용되기 시작. 해커 용어 등장.                                                     |
| 1960년      | 미국 국방부가 군사 목적으로 ARPANET을 개발.                                                                          |
| 1970년      | 애플 컴퓨터에서 개인용 컴퓨터를 판매하기 시작.                                                                       |
| 1980년      | IBM이 컴퓨터 시장에 합류. TCP/IP가 등장. 모리스 웜(Morris Worm)에 의해 대규모 피해 발생. 침해 대응 센터 CERT가 설립. |
| 1990년      | 은행, 회사, 정부에 접근하여 정보 및 자금이 탈취되는 사례가 발생.                                                     |
| 2000년      | 야후, CNN, 아마존 등의 사이트에 DDos 공격 발생.                                                                      |
| 2010년      | 문서, 그림 등의 파일을 암호화하는 램섬웨어가 등장.                                                                   |

각 국의 정부기관은 정보와 관련한 다양한 법률을 제정하였다.

| 국가 | 항목                                       | 연도   |
| ---- | ------------------------------------------ | ------ |
| 미국 | 개인정보 보호법                            | 1974년 |
| 미국 | 컴퓨터 사기 및 악용금지법                  | 1986년 |
| 한국 | 정보통신망 이용촉진 및 정보보호 관련 법    | 2001년 |
| 한국 | 개인정보 보호법                            | 2011년 |
| 미국 | 사이버 보안법                              | 2015년 |
| 한국 | 정보보호산업의 진흥 관련 법                | 2015년 |
| 유럽 | 개인정보 보호법(GDPR)                      | 2016년 |
| 한국 | 정보보호 및 개인정보보호 관리체계 인증 법  | 2018년 |
| 한국 | 데이터 3법(정보통신망, 개인정보, 신용정보) | 2020년 |
| 한국 | 가명 정보의 개념 법                        | 2020년 |

# 2강. 암호의 개념

## 암호의 정의

암호는 안전하지 않은 채널을 통해서 정보를 송수신하더라도 제 3자가 알아볼 수 없도록하는 것을 말한다. 암호 개념에는 다음 용어들이 등장한다.

- 평문(Plaintext), 암호화되지 않은 원래의 메시지.
- 암호문(Cipertext), 암호화되어 보호되는 메시지.
- 암호화(Encryption), 평문을 암호문으로 변환하는 행위.
- 복호화(Decryption), 암호문을 평문으로 되돌리는 행위.
- 키(Key), 암호화 및 복호화에서 열쇠 역할을 하는 데이터.

## 암호의 역사

암호는 역사적으로 군사적, 정치적인 목적으로 사용되어 왔다. 고대 암호는 다음과 같다.

스테가노그래피(Steganography)는 BC 480년, 페르시아의 침략계획을 나무판에 조각하고 밀랍을 발라서 스파르타에 보낸 것이다. 암호의 필수조건인 키가 존재하지 않으므로, 최초의 암호로 볼 수 없다.

고대 및 근대 암호 알고리즘은 크게 전치법과 치환법으로 나눌 수 있다.

- 전치법(Transposition Cipher)은 평문의 문자들의 순서를 바꾸어 암호화하는 기법이다.
- 치환법(Substitution Ciphter)은 평문의 문자들을 다른 문자로 치환하여 암호화하는 기법이다.

| 암호명          | 설명                                                                                  | 비고   |
| --------------- | ------------------------------------------------------------------------------------- | ------ |
| 스파르타 봉     | 길이 및 굵기가 같은 나무봉(Scytale)을 키(Key)로 종이를 감아서 가로로 평문을 작성한다. | 전치법 |
| 시저 암호       | 글자를 일정한 규칙에 맞추어 다른 글자, 숫자, 기호로 치환한다.                         | 치환법 |
| 시프트 암호     | 평문의 각 문자들을 알파벳 순서상 K번째 뒤의 문자들로 치환한다.                        | 치환법 |
| 비즈네르 암호   | 시프트 암호를 개선하여 숫자로 이루어진 배열을 돌아가며 뒤의 문자들로 치환한다.        | 치환법 |
| 플레이페어 암호 | 평문의 중복을 제거하고 5x5의 테이블에 나머지 알파벳과 채워넣어 규칙에 따라 치환한다.  | 치환법 |
| 힐 암호         | 행렬을 사용하여 둘 이상의 알파벳을 다른 문자로 치환한다.                              | 치환법 |

현대 알고리즘은 통신 기술, 기계식 계산기의 발전에 따라서 새롭게 등장한 대칭키 암호 알고리즘, 공개키 암호 알고리즘으로 나눌 수 있다.

- 대칭키 알고리즘은 암호화와 복호화에 같은 키를 사용하는 암호 방식이다. 대표적으로 DES, AES, IDEA가 있다.
- 공개키 알고리즘은 암호화와 복호화에 다른 키를 사용하는 암호 방식이다. 대표적으로 RSA, ECC, ELGamal이 있다.

대칭키 알고리즘은 암호화 및 복호화 속도가 빠른 반면 키 분배 문제가 존재하며, 공개키 알고리즘은 키 분배 문제는 해결된 반면 속도가 느리다.

# 3강. 인증

## 인증의 개념

인증(Authentication)은 메시지, 사용자, 출처, 장치 등의 실체가 정확한지 확인하는 과정을 말한다.

## 메시지 인증

메시지 인증은 메시지의 내용이 전송 도중에 변경되지 않고 정확하고 완전하게 수신되었는지 확인하는 것을 말한다.

메시지 인증 코드(MAC, Message Authentication Code)는 메시지 인증을 위하여 메시지에 붙이는 부가적인 데이터이다. 발신자는 메시지에 MAC을 함께 전송하고, 수신자는 메시지의 변조 여부를 MAC을 사용하여 확인한다.

MAC은 다음과 같은 특징을 갖는다.

- 비밀키 이용하여 제 3자가 메시지의 내용을 위조 및 변조할 수 없다.
- 메시지와는 독립되어 별도의 기밀성을 제공하지 않는다.
- 메시지 크기와는 독립적으로 고정된 작은 크기를 갖는다.

MAC 인증 알고리즘은 다음과 같다.

- HMAC(Hash-based MAC), 해시함수를 기반으로 비밀키를 메시지에 덧붙이고 해시함수를 적용한다.
- CMAC(Cipher-based MAC), 블록암호를 기반으로, CBC 모드(Cipher Block Chaining Mode)를 메시지에 적용한다.

## 사용자 인증

사용자 인증은 서버, PC, 웹페이지 등의 시스템에 접근하려는 사용자에 대하여 진행하는 인증을 말한다.

- 비밀번호 방식은 사용자가 입력하는 비밀번호가 시스템의 인증 정보와 일치 여부를 통해 인증한다.
- 생채인식 방식은 개개인의 고유 생체정보를 시스템에 저장하여 일치 여부를 통해 인증한다.
- 토큰 방식은 사용자가 소유하고 있는 특정 정보를 활용하여 사용자를 인증하는 방식이다.
- 2단계 인증 방식2FA(Two-Factor Authentication)은 위에서 설명한 인증방식을 결합하여 보안을 끌어올린 방식이다.

# 4강. 사이버 공격

## 사이버 공격의 개요

사이버 공격은 인터넷을 경유하여 국가, 기업, 개인의 컴퓨터에 접속하여 손상을 입히려는 행동을 말한다. 대표적인 공격 방식은 다음과 같다.

- 네트워크 상의 시스템 설정의 취약점을 발견하여 관리자 권한을 획득.
- 네트워크 상의 패킷(Packet)을 조작하는 공격.
- 상용 웹사이트 취약점을 노린 공격.
- 스마트폰 보급에 따른 무선환경에서의 공격.

## 다양한 사이버 공격

사이버 공격은 크게 악성코드, 네트워크 공격으로 나눌 수 있다.

악성코드(Malware, Malicious Code)는 시스템 손상, 전파, 정보 유출 등의 악의적인 용도로 사용될 수 있는 코드가 심어진 유해 프로그램의 총칭이다.

| 명칭       | 설명                                                                 | 특징                              |
| ---------- | -------------------------------------------------------------------- | --------------------------------- |
| 바이러스   | 시스템과 사용자 파일에서 증식하거나 시스템을 파괴하는 악성코드.      | 자기 복제 가능, 저수준 언어 사용. |
| 웜         | 컴퓨터의 취약점을 통해 스스로 감염되는 악성코드.                     | 빠른 전파력. 독자적인 실행.       |
| 트로이목마 | 정상적인 프로그램을 가장하여 의도하지 않은 기능을 수행하는 악성코드. | 정보 유출, 컴퓨터 제어.           |
| 백도어     | 공격자가 시스템에 침입한 후, 접근권한을 탈취할 용도로 설치한 경로.   | 인증 절차 회피.                   |
| 스파이웨어 | 컴퓨터에서 개인정보를 탈취할 목적으로 설계된 악성코드.               | 정보 유출, 허위 동작.             |
| 랜섬웨어   | 사용자의 파일을 암호화하고 인질로 삼아 금전을 요구하는 악성코드.     | 키를 모르면 풀 수 없는 알고리즘.  |

네트워크 공격은 네트워크 환경에서 악의적인 용도로 수행되는 사이버 공격을 말한다.

| 명칭     | 설명                                                                    | 특징                                        |
| -------- | ----------------------------------------------------------------------- | ------------------------------------------- |
| 스캐닝   | 공격대상 호스트 및 네트워크의 취약점을 발견하기 위한 도구로 사용.       | 취약점 점검 도구의 악용.                    |
| 스푸핑   | 공격 제어 호스트를 피해 호스트가 신뢰하는 호스트로 가장.                | IP, DNS, Web, ARP 등의 다양한 종류.         |
| 스니핑   | 네트워크 상의 데이터를 도청하는 행위.                                   | Passive(단순한 도청), Active(도청 및 변조). |
| DOS      | 대량의 데이터를 전송하거나 연결 요청하여 서비스 마비를 일으키는 행위.   | 반열림 TCP를 생성하고 공격하는 SYN 플러딩.  |
| DDOS     | 분산된 호스트를 감염시키고 지시하고 목표에 동시에 DOS 공격 수행.        | 분산된 호스트를 사용한 DOS 공격.            |
| 스팸메일 | 불특정 다수를 대상으로 일방적, 대량으로 전달되는 이메일.                | 광고, 홍보, 비방 목적으로 사용.             |
| 피싱     | 금융기관이나 공신력있는 업체를 사칭하여 개인, 금융정보를 탈취하는 행위. | 유사하게 생긴 가짜 사이트를 사용.           |

## 최근의 사이버 공격

사이버 공격은 보다 효율적인 공격을 위해서 에이전트화, 분산화, 자동화, 은닉화 되어가고 있다.

지능형 지속공격(APT, Advanced Persistent Threat)는 특정 대상을 목표로 다양한 공격기술을 이용하여 은밀하고 지속적으로 공격하는 행위이다.

# 5강. 서버 보안

## 서버 보안의 개요

일반적으로 정보 시스템은 서비스를 제공하는 서버, 제공받는 클라이언트의 서버-클라이언트 구조로 이루어져 있다. 방어지점을 응용 프로그램, 운영체제, 네트워크, 데이터 제어로 나누어 살펴보면 다음과 같다.

| 지점         | 설명                                                                |
| ------------ | ------------------------------------------------------------------- |
| 응용프로그램 | 서버 프로그램은 종종 백도어, 버그에 취약성을 갖는다.                |
| 운영체제     | 보안의 가장 근본적인 레벨으로 모든 행위를 관장한다.                 |
| 네트워크     | 시스템의 트래픽을 제어하여 유해한 트래픽을 차단한다.                |
| 전송데이터   | 전송되는 정보는 누구나 열람이 가능하므로, 암호화-복호화가 유효하다. |

## 서버 침입 및 정보유출

서버의 침입 및 정보유출 단계는 다음과 같이 예상해볼 수 있다.

1. 공격자가 대상 시스템을 결정한다.
2. 관리자 권한을 획득하기 위해 공격을 시도한다.
3. 목표를 수행하고 침입 흔적을 제거한다.
4. 후에 쉽게 접근하기 위하여 백도어를 설치한다.
5. 다른 시스템을 공격하거나, 정보를 변조 또는 유출한다.

## 서버 공격의 유형

계정 크랙 공격은 공격자가 서버에 접속할 수 있는 계정의 ID와 패스워드를 취득하는 공격 행위이다.

- 전수 공격(Brute Force Attack)은 조합할 수 있는 모든 ID, 패스워드를 이용하여 크랙을 시도하는 것이다. 많은 시간이 소요된다.
- 사전 공격(Dictionary Attack)은 ID와 패스워드가 될 수 있는 사전 파일을 생성하여 대입 가짓수를 줄이는 것이다.

네트워크 공격은 네트워크 상에서 이루어지는 서버 공격으로 스푸핑(Spoofing), 스니핑(Sniffing), 서비스 거부(DoS)을 예로 들 수 있으며, 추가적으로 버퍼 오버플로와 레이스 컨디션 공격이 있다.

버퍼 오버플로우(Buffer Overflow) 공격은 한정된 메모리 자원을 초과하는 데이터를 입력하여 공격자가 원하는 코드를 실행하는 공격이다. 이때 사용되는 것이 스택과 힙 영역이다.

- 스택(Stack)은 서브 프로그램이 호출될 때 복귀주소를 저장한다.
- 힙(Heap)은 malloc, new 등 메모리를 동적으로 할당할 때 사용한다.

레이스 컨디션(Race Condition) 공격은 두 프로세스가 동일한 자원을 공유할 때 경쟁상태에 이르게하여, 해당 파일에 접근하는 방법이다.

## 서버 보안 대책

사이버 공격으로 부터 서버를 지키기 위해서 사용할 수 있는 서버 보안 대책은 다음과 같다.

| 범주                 | 설명                                                                |
| -------------------- | ------------------------------------------------------------------- |
| 계정 관리            | 사용자별 그룹별 접근권한을 부여하고, 일정 횟수 시도시 계정 잠금.    |
| 패스워드 관리        | 패스워드 길이, 조합 규칙, 사용 기간을 정책화하고 암호화하여 저장.   |
| 시스템 접근제어      | DAC, MAC, RBAC 등을 활용하여 시스템 접근을 제한한다.                |
| 파일 시스템 보호     | 접근 및 변경 권한을 관리자에 한정하고, 파일을 백업 및 검사한다.     |
| 시스템 설정 및 관리  | ssh, scp 등 안전한 프로토콜 사용. 레지스트리 권한원격 제어 및 백업. |
| 운영체제 취약점 관리 | 작업 용도에 따른 시스템 파티션 분리. 불필요한 서비스 제거.          |
| 시스템 로그 관리     | 시스템 로그, 보안 로그 기록 및 관리.                                |
| 서버 관리자의 의무   | 시스템 상황, 계정 관리 정책, 자원 관리 방법 이해.                   |

임의적 접근 제어(DAC, Discretionary Access Control)는 관리자 혹은 소유자가 자율적 판단에 따라서 접근권한을 다른 사용자에게 부여하는 것이다.

강제적 접근 제어(MAC, Mandatory Access Control)는 객체에 비밀등급을, 사용자에게 허가등급을 부여하여 일정한 규칙에 따라서 관리하는 것이다.

역할 기반 접근 제어(RBAC, Role-Based Access Control)는 역할을 설정하여 조회 및 삭제 권한을 부여하는 것이다.

최소 권한(Least Privillege)은 사용자와 객체에 꼭 필요한 최소한의 권한만을 부여하는 것이다.

# 6강. 네트워크 보안

## 네트워크 보안의 개요

컴퓨터 네트워크(Computer Network)는 상호 접속 및 정보 교환의 편리한 창구로서, 불특정 다수의 접근이 가능하다.

통신 환경에서 발생할 수 있는 위협요소는 물리적인 위협, 기술적인 위협으로 나눌 수 있다.

- **물리적인 위협** : 네트워크 시스템에 직접적인 파괴나 손상을 입히는 행위 또는 도난.
- **기술적인 위협** : 통신 환경에서 정보를 무단으로 취득하는 행위(수동적 공격), 정보를 변조 및 위조하는 행위(능동적 공격).

기술적인 위협을 방어할 수 있는 대략적인 방법은 다음과 같다.

- **수동적 공격** : 통신회선에 제3자 접속 시도를 방지. 통신횐선의 데이터를 암호화.
- **능동적 공격** : 통신회선의 데이터를 암호화. 수신 측에서 무결성 확인.

## 네트워크 보안 서비스

네트워크 보안 서비스는 네트워크 보안을 강화하기 위한 제반 서비스로, 공격을 예방, 탐지, 복구하기 위한 메커니즘으로 구성되어있다.

인증(Authentication)은 수신된 데이터의 실체를 확인한다. 대표적으로 대등개체 인증과 데이터 발신처 인증이 있다.

- **대등개체 인증(Peer Entity Authentication)** 은 통신 당사자의 신분확인, 자격유무를 점검한다. 패스워드 및 암호화 기법이 사용된다.
- **데이터 발신처 인증(Data Origin Authentication)** 은 데이터 발신처의 자격유무를 확인한다. 상호의 직접적인 통신이 아닌 이메일과 같은 서비스를 예로 들 수 있다.

접근제어(Access Control)는 인가되지 않은 사용자의 위협으로부터 정보자원을 보호한다. 먼저 신분을 확인하고, 신분의 권한내에서 작업을 수행할 수 있는지 비교한다.

기밀성(Confidentiality)은 네트워크를 통해 전달되는 정보의 내용이 노출되는 것을 방지한다. 네 가지 형태로 구분할 수 있다.

- **접속 기밀성** : 연결상의 모든 사용자와 데이터를 보호한다.
- **비접속 기밀성** : 단일 데이터에 대한 모든 사용자 데이터를 보호한다.
- **선택영역 기밀성** : 연결 상의 선택된 사용자 데이터를 보호한다.
- **트래픽 흐름 기밀성** : 리소스, 목적지, 빈도, 길이 등의 트래픽 특성을 보호한다.

무결성(Integrity)은 데이터 내용이 인가되지 않은 방식으로 변조되는 것을 방지한다. 접속 여부, 복구 기능, 선택 여부에 따라서 다섯 가지로 구분할 수 있다.

부인방지(Non-Repudiation)는 발신자와 수신자를 대상으로 발신(Origin) 및 수신(Delivery) 부인방지로 나눌 수 있다.

## 네트워크 보안 메커니즘

암호화(Encryption)는 인증, 기밀성, 무결성을 제공하는 강력한 수단으로, 호스트 및 시스템 사이에 적용된다.

전자서명(Electronic Signature)은 데이터에 대한 서명과 검증절차를 통합하여 다루는 기술이다.

인증교환(Authentication Exchange)은 다양한 데이터를 교환할 때 사용하는 인증 방식이다.

- **3방향 핸드셰이크** : 서버와 클라이언트 간에 3번의 인증을 교환.
- **데이터 동기화** : 통신하는 요소가 클록 신호를 맞추어 교환.

트래픽 패딩(Traffic Padding)은 트래픽 해석을 방지하기 위해서 잘못된 트래픽 정보를 의도적으로 흘리는 기술이다.

공증(Notarization)은 데이터 무결성, 발신지, 수신지와 같은 특성들을 신뢰할 수 있는 제 3자가 보증하는 것이다.

## TCP/IP 보안

TCP/IP, UDP, ICMP는 인터넷의 대표적인 프로토콜으로 신뢰할 수 없는 네트워크 환경을 위해서 설계되었으나, 매우 광범위하게 사용되어 보다 강력한 요구사항이 제기되었다.

IPSec은 IP를 위한 보안 메커니즘으로 인증 헤더와 캡슐화 보안 페이로드로 이루어진다.

- **인증 헤더(Authentication Header)** 는 IP 데이터의 무결성과 출처를 보장하기 위해서 헤더에 포함하는 것이다.
- **캡슐화 보안 페이로드(Encapsulating Security Payload)** 는 기밀성, 무결성 및 출처를 보장하기 위해서 마지막에 위치하는 것이다.
- AH는 트랜스포트 모드(Transport Mode)로 IP 헤더를 암호화 하지 않고, ESP는 터널 모드(Tunnel Mode)로 원래 IP 헤더도 암호화한다.

SSL/TLS은 인터넷 환경의 텍스트 기반 데이터가 제 3자에게 유출되는 위험을 방지하는 프로토콜이다.

- SSL(Secure Socket Layer)은 웹 서버와 브라우저 간의 트래픽 보호를 위해 사용되는 표준.
- TLS(Transport Layer Security)는 SSL 3.0을 기반으로 한 IETF(국제 인터넷 표준화 기구) 표준.
- 핸드셰이크(Handshake) 프로토콜은 서버와 클라이언트 사이의 초기 통신 인증에 사용하는 표준.
- 레코드(Record) 프로토콜은 전송받은 데이터를 검증 및 복호화 후에 재조립하는 표준.

# 12강. 대칭키 암호

## 대칭키 암호의 개념

대칭키 암호는 암호화와 복호화에 하나의 같은 비밀키를 사용하는 암호 방식이다.

## 블록 암호

블록 암호는 평문을 고정된 크기의 블록으로 나누고, 블록마다 암호화 과정을 수행하여 암호문을 얻는 대칭키 암호 방식이다.

출력 블록의 각 비트는 입력 블록과 키의 모든 비트에 영향을 받음. 단순한 함수를 반복적으로 적용하여 암호학적으로 강한 함수를 만드는데 목적을 두고 있다.

- **라운드 함수** : 반복되는 함수.
- **라운드 키** : 라운드 함수에 작용하는 키.
- **키 스케쥴** : 키를 입력하여 라운드 키를 발생시키는 과정.

파이스텔(Feistel) 구조는 하나의 입력 블록을 좌우 두 개의 블록으로 분할하고 짝수 번의 라운드를 진행한다. 각 라운드의 출력 블록이 다음 라운드의 입력 블록이 된다. 파이스텔 구조는 다음 특징을 갖는다.

- 라운드 함수와 관계없이 역변환이 가능하다.
- 두 번의 수행으로 블록 간의 완전한 확산이 이루어진다.
- DES, SEED 등의 많은 블록 암호에 사용되는 알고리즘이다.

SPN(Substitution Permutation Network) 구조는 하나의 입력 블록을 여러 개의 소블록으로 나누며 라운드를 진행한다. 각 라운드의 출력 블록이 치환과 전치가 동시에 이루어지며, 다음 라운드의 입력 블록이 된다. SPN 구조는 다음 특징을 갖는다.

- 라운드 함수가 역변환이 가능해야 한다.
- 더욱더 많은 병렬성을 제공한다.
- AES, ARIA 등 최근 블록 암호에서 사용한다.

블록 암호는 어떤 방식을 사용하는 지에 따라서 구분할 수 있다.

**전자 코드 북(ECB, Electronic Code Book)** 은 블록이 독립적이며, 암호화 및 복호화에 병렬처리가 가능하다. 그러나 동일한 평문은 동일한 암호문을 생성하여 패턴 분석에 취약하다.

**암호 블록 연결(CBC, Cipher Block Chaining)** 은 출력 블록을 다음 암호화의 입력 블록으로 사용한다. 병렬처리가 불가능하며, 독립적이지 못하다.

**암호 피드백(CFB, Cipher Feedback)** 은 CBC와 마찬가지로 출력 블록을 다음 암호화에 사용한다. 그러나 XOR 연산을 기반으로 하므로 복호화 함수가 필요없다.

**출력 피드백(OFB, Output Feedback)** 은 디지털 신호화된 아날로그 신호에서 주로 사용한다. 블록은 독립적이며 복호화 함수가 필요없다.

**카운터(CTR, Counter)** 는 키에 1씩을 더하며 각 블록을 암호화한다. 블록은 독립적이고 복호화 함수가 필요하지 않다.

## 스트림 암호

스트림 암호는 평문과 같은 길이의 키 스트림을 생성하여 XOR 연산을 수행하여 암호문을 얻는 대칭키 암호 방식이다.

키 스트림에는 규칙성이 없어서 예측이 불가능한 랜덤 수열 **의사 랜덤(Pseudo Random) 수열** 을 사용한다. 대표적으로 LFSR이 있겠다.

**선형 귀환 시프트 레지스터(LFSR, Linear Feedback Shift Register)** 는 직전 $m$ 개의 비트값을 선형적으로 결합하여 새로운 비트값을 생성한다. 그러나 LFSR은 쉽게 해독될 수 있다.

## 대칭키 암호 알고리즘

**DES(Data Encryption Standard)** 는 1977년 미국의 데이터 암호 알고리즘의 표준으로 공표된 블록 암호 알고리즘이다. 2001년 AES의 등장으로 표준 자리를 물려주게 된다. 파이스텔 구조를 사용한다.

**TDEA(Triple Data Encryption Algorithm)** 는 DES를 3회 반복하여 안정성 문제를 해결하였으나, 3배나 느린 속도를 가진다.

**AES(Advanced Encryption Standard)** 는 DES를 대체하여 새롭게 등장한 대칭키 암호 알고리즘으로, 블록 크기는 DES의 두 배, 키 길이는 128, 192, 256bit 중에 선택할 수 있다. SPN 구조를 사용한다.

# 13강. 공개키 암호

## 공개키 암호의 개념

암호화 및 복호화에 두 개의 서로 다른 키를 사용하는 암호 방식이다. 공개키와 개인키의 한 쌍의 키를 사용한다.

- **공개키** 는 누구나 사용하여 암호화할 수 있다.
- **개인키** 는 오직 자신만이 사용하여 복호화할 수 있다.

## 기반 문제

공개키 암호 알고리즘은 소인수분해, 이산대수, 타원곡선 이산대수 문제 등의 어려운 문제들이 기반을 두고 있다.

**소인수분해** 에서 두 정소의 곱은 빠른 시간안에 구할 수 있지만, 임의의 양의 정수를 소인수분해하는 것은 매우 큰 자원이 소모된다. 기반 알고리즘은 RSA, 안전한 키는 2048비트다.

**이산대수** 에서 양의 정수 $n$, $a$, $x$에 대해서 $a^x(mod$ $n)$은 빠른 시간에 구할 수 있지만, 양의 정수 $n$, $a$, $y$에 대하여 $y=a^x(mod$ $n)$인 $x$를 구하는 것은 매우 큰 자원이 소모된다. 기반 알고리즘은 ElGamal, DSA, KCDSA, DHKE 등이 있으며 안전한 키의 길이는 2048비트다.

**타원곡선 이산대수** 에서 타원곡선상의 점과 정의된 덧셈 연산을 사용한 이산대수 문제는 마찬가지로 매우 큰 자원이 소모된다. 기반 알고리즘은 ECDSA, EC-KCDSA가 있다. 안전한 키의 크기는 224비트다.

## 공개키 암호 알고리즘

**RSA(Rivest Shamir Adleman)** 는 신용카드 결제, 증권거래, 이메일 등의 보안이 중요한 분야에서 응용되고 있다. 소인수분해 문제에 기반하고 있으며 차이가 큰 두 숫자를 사용한다.

**ElGamal** 은 유한체상에서 수신자의 공개키를 가지고 개인키를 계산하는 이산대수 문제에 기반하고 있다.

**ECC(Elliptic Curve Cryptosystem)** 는 유한체상에서 정의된 타원곡선 이산대수 문제에 기반하고 있다. RSA, ElGamal과 동일한 수준의 보안성을 제공하며 키의 길이는 제일 짧다. ElGamal 알고리즘을 변환하여 적용한 것이다.