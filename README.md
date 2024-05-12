# 프로젝트 명: QR코드 모임 출석체크 

## I. 프로젝트 수행팀 개요

* 수행 학기:  2024학년도 1학기
* 프로젝트명:  모임 출석 관리 웹
* Key Words :  출석체크, QR 코드, 모임, 
* 팀명: 어서옵소    

| 구분 | 성명   | 학번       | 소속학과         | 연계전공       | 이메일             |
| ---- | ------ | ---------- | ---------------- | -------------- | ------------------ |
| 팀장 | 장원혁 | 2018110202 | 영어통번역전공   | 융합SW연계전공 | jwhmark@gmail.com  |
| 팀원 | 김영찬 | 2019112479 | 산업시스템공학과 | 융합SW연계전공 | qzwx7530@dgu.ac.kr |
| 팀원 | 김민형 | 2019110747 | 정치외교학전공   | 융합SW연계전공 | ab000701@naver.com |              

* 지도교수:  SW교육원 이길섭 교수, 박효순 교수   

* 팀 구성원 또는 활동 사진  
    * *팀 자유 형식으로 작성*  

## II. 프로젝트 수행 결과  

### 1. 프로젝트 개요  

#### 1.1 개발 동기  

- 동국대학교 숫자코드로의 출석 인증방식은 대리출석이 가능하고 숫자를 직접 입력해야하는 불편함이 있어 QR 코드를 통한 출석 인증 시스템을 구상하게 되었다.


#### 1.2 개발 목표  

- 출석인증 방식을 QR 코드 스캔으로 한다.
- 사용자의 편의성을 고려하여 타임 아웃, 플로팅 기능, 기기 등록 기능을 개발한다.


#### 1.3 최종결과물  

- *프로젝트를 통해 개발된 최종 결과물에 대한 설명을 기술*  
- *그림 또는 사진을 제시하고 설명을 기술*  
- *필요한 경우 중간제목을 추가 가능*  

#### 1.4 기대 효과  

1. 편의성 증진

- 참여자의 출석 인증 과정의 편의성을 증진한다. QR 코드를 이용한 스마트출석 시스템은 참여자들이 카메라로 QR 코드를 스캔하는 동작 하나로 출석을 인증한다. 이는 기존 숫자 코드 입력에서 발생할 수 있는 잘못된 입력의 가능성을 차단하고, 숫자를 입력하는 동작을 줄여준다.

2. 부정출석 방지

- 부정 출석을 방지하여 주최자와 참여자의 신뢰성을 보장한다. 참여자의 기기 등록 기능과 QR코드의 타임 아웃 기능을 통해 부정 출석을 방지할 수 있다. 이는 주최자들이 참여자의 모임 출석 상태를 정확하게 파악하게 할 뿐만 아니라 부정 출석 가능성으로 발생할 수 있는 주최자와 참여자 간의 신뢰성을 회복한다.

3. 안정적 모임 진행

- 모임의 안정적 진행을 보장하여 모임의 환경을 개선한다. 본 프로젝트의 플로팅 기능을 통한 출석 체크는 지각으로 인해 모임 진행이 방해되는 것을 방지한다. 이는 주최자들과 참여자의 모임 만족도 증가로 이어질 수 있다.

4. 다양한 모임 관리

- QR 코드 스마트출석 시스템 회원들의 다양한 모임 관리를 용이하게 한다. 학교와 같은 특정 출석 시스템에 귀속되어 있지 않기 때문에 하나의 시스템으로 개인의 다양한 모임을 포괄하여 출석을 관리할 수 있다.

5. 종합적 모임 관리 플랫폼으로의 발전 가능성

- 본 프로젝트 이후 추가 개발 과정을 통해 종합적인 모임 플랫폼으로의 발전 가능성이 있다. 일정 관리 시스템의 추가 개발이나 다양한 출석 방식의 도입, 기존 시스템과 연동 등으로 출석 시스템의 한계를 벗어나 종합적인 모임 관리 플랫폼으로의 발전이 기대된다.

### 2. 프로젝트 수행 내용  

#### 2.1 프로젝트 진행과정 

- 역할
  - 프론트엔드: 김영찬
  - 백엔드: 김민형, 장원혁
- 프로젝트 진행 일정
  <img width="981" alt="간트차트" src="https://github.com/CSID-DGU/2024-1-OSSProj-WelcomeOPSO-06/assets/144206885/a2b3383e-6576-4483-bcc7-7403846b467b">

#### 2.2 프로젝트 구현내용  

- *프로젝트 설계, 구현 등 구현과 관련된 내용을 기술*  

### 3. 프로젝트 자료  

#### 3.1 프로젝트 OSS 구성  

- Zxing: QR 코드 생성 오픈소스
  https://github.com/zxing/zxing

#### 3.2 프로젝트 주요 문서 

[수행계획서] (https://github.com/CSID-DGU/2024-1-OSSProj-WelcomeOPSO-06/blob/main/Docs/1_1_OSSProj_06_%EC%96%B4%EC%84%9C%EC%98%B5%EC%86%8C_%EC%88%98%ED%96%89%EA%B3%84%ED%9A%8D%EC%84%9C.md)
[제안발표자료](https://github.com/CSID-DGU/2024-1-OSSProj-WelcomeOPSO-06/blob/main/Docs/1_2_OSSProj_%ED%8C%80%EB%B2%88%ED%98%B8_%ED%8C%80%EB%AA%85_%EC%88%98%ED%96%89%EA%B3%84%ED%9A%8D%EB%B0%9C%ED%91%9C%EC%9E%90%EB%A3%8C.ppt)
[중간보고서](https://github.com/CSID-DGU/2024-1-OSSProj-WelcomeOPSO-06/blob/main/Docs/2_1_OSSProj_06_%EC%96%B4%EC%84%9C%EC%98%B5%EC%86%8C_%EC%A4%91%EA%B0%84%EB%B3%B4%EA%B3%A0%EC%84%9C_.md)
[중간발표자료](https://github.com/CSID-DGU/2024-1-OSSProj-WelcomeOPSO-06/blob/main/Docs/2_2_OSSProj_06_%EC%96%B4%EC%84%9C%EC%98%B5%EC%86%8C_%EC%A4%91%EA%B0%84%EB%B0%9C%ED%91%9C%EC%9E%90%EB%A3%8C_.ppt)
[최종보고서](https://github.com/CSID-DGU/2024-1-OSSProj-WelcomeOPSO-06/blob/main/Docs/3_1_OSSProj_06_%EC%96%B4%EC%84%9C%EC%98%B5%EC%86%8C_%EC%B5%9C%EC%A2%85%EB%B3%B4%EA%B3%A0%EC%84%9C_.md)
[최종발표자료](https://github.com/CSID-DGU/2024-1-OSSProj-WelcomeOPSO-06/blob/main/Docs/3_2_OSSProj_06_%EC%96%B4%EC%84%9C%EC%98%B5%EC%86%8C_%EC%B5%9C%EC%A2%85%EB%B0%9C%ED%91%9C%EC%9E%90%EB%A3%8C_.ppt)
[이슈관리](https://github.com/CSID-DGU/2024-1-OSSProj-WelcomeOPSO-06/issues)
[범위 및 일정관리](https://github.com/CSID-DGU/2024-1-OSSProj-WelcomeOPSO-06/blob/main/Docs/4_1_OSSProj_06_%EC%96%B4%EC%84%9C%EC%98%B5%EC%86%8C_%EB%B2%94%EC%9C%84_%EC%9D%BC%EC%A0%95_%EC%9D%B4%EC%8A%88%EA%B4%80%EB%A6%AC.md)
[회의록](https://github.com/CSID-DGU/2024-1-OSSProj-WelcomeOPSO-06/blob/main/Docs/4_2_OSSProj_06_%EC%96%B4%EC%84%9C%EC%98%B5%EC%86%8C_%ED%9A%8C%EC%9D%98%EB%A1%9D.md)
[제품구성배포운영자료](https://github.com/CSID-DGU/2024-1-OSSProj-WelcomeOPSO-06/blob/main/Docs/4_3_OSSProj_06_%EC%96%B4%EC%84%9C%EC%98%B5%EC%86%8C_%EC%A0%9C%ED%92%88%EA%B5%AC%EC%84%B1%EB%B0%B0%ED%8F%AC%EC%9A%B4%EC%98%81%EC%9E%90%EB%A3%8C.md)

#### 3.3 참고자료  

1. 한국외대 전자출결 관리 시스템 메뉴얼, [https://at2.hufs.ac.kr/guide.html](https://at2.hufs.ac.kr/guide.html)
2. 박선주, QR코드를활용한스마트폰기반출석체크시스템, 한국정보교육학회, 2014년 1월.
3. 조유현,"다른 사람인거 모르겠지?"..中유학생, 수업부터 시험까지 통째 대리출석, 파이낸셜 뉴스, https://n.news.naver.com/article/014/0004994892?sid=102 , 2023년 4월.
4. 이원영, 최아영, 강의실 내에서 쉽게 이뤄지는 대리출석과 출튀, 덕성여대 신문, https://www.dspress.org/news/articleView.html?idxno=531월 , 2015년 3월. 
5. gukanucar, jwt-project, 깃허브, https://github.com/gurkanucar/jwt-project?tab=readme-ov-file , 2022년 1월
