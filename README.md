# A-ko Mentor🔍

## 대학🏫 생활 안내 반응형 웹

### <개요>
기존의 대학 생활 정보 제공 어플리케이션과 웹사이트는 사용자가 원하는 정보를 찾기 어렵고, 신입생이 필요로 하는 기능이 부족한 UI를 가지고 있다. 동국대학교의 AI 소프트웨어융합학부를 비롯한 여러 전공에서는 선수과목 이수 시스템을 사용하고 있지만, 정보 전달이 명확하지 않다. 
따라서 본 프로젝트는 이러한 문제를 해결하기 위해 사용자 친화적인 UI와 새로운 기능을 개발하여, 학생들이 더 쉽게 필요한 정보를 얻고 졸업 요건을 충족할 수 있도록 돕는 것을 목표로 한다. 이를 통해 대학 생활에 익숙하지 않은 학생들에게 더 높은 편의성을 제공하고자 한다.

### 시안
https://www.youtube.com/watch?v=1n1VtqlyKgg&feature=youtu.be

### 1. login , sign up

 **📌로그인 처리**
<p align="center">
  <img width="300" alt="KakaoTalk_20240613_041024129" src="https://github.com/CSID-DGU/2024-01-CSC4004-03-Summer/assets/121737437/2f86e8cd-780e-46ce-b729-a1b5edb8b3f1">
  <img width="300" alt="KakaoTalk_20240613_041216751" src="https://github.com/CSID-DGU/2024-01-CSC4004-03-Summer/assets/121737437/c951f3da-888d-4593-ba3b-fbcce3d9509d">
  <img width="300" alt="KakaoTalk_20240613_041216751" src="https://github.com/CSID-DGU/2024-01-CSC4004-03-Summer/assets/121737437/c951f3da-888d-4593-ba3b-fbcce3d9509d">
</p>

<p>
JWT를 이용하는 방식으로 acessToken을 localStorage에 저장 하였다.<br/><br/>
  보안 약점 😈 : localStorage 안에 세션 id, refreshToken 또는 accessToken을 저장해두면 XSS 취약점을 통해 그 안에 담긴 값을 불러오거나, 불러온 값을 이용해 API 콜을 위조할 수 있다.
</p>

### 2. main, chatting Screen

 **📌메인 화면**
<p align="center">
  <img width="300" alt="KakaoTalk_20240613_041122376" src="https://github.com/CSID-DGU/2024-01-CSC4004-03-Summer/assets/121737437/ba1f99d6-d432-4716-851e-fc2d8bc75f3a">
  <img width="300" alt="스크린샷 2024-06-13 064102" src="https://github.com/CSID-DGU/2024-01-CSC4004-03-Summer/assets/121737437/45f02105-ef4b-4788-bdbe-d39ddbd61784">

</p>

<p>
사용자가 검색창에 질문 입력시 채팅 text와 함께 chatting Screen으로 넘어감.<br/><br/>
예상 질문의 경우 키워드 필터링을 통해 준비된 응답을 출력. 그외 질문은 GPT API로 처리.
</p>

### 2. credit Screen, time table

 **📌학점 조회, 시간표 추천, 커리 큘럼**
 
<p align="center">
    <img width="300" alt="KakaoTalk_20240613_041437306" src="https://github.com/CSID-DGU/2024-01-CSC4004-03-Summer/assets/121737437/a06b88f8-43a0-4884-9c76-5705d919b554">
    <img width="300" alt="KakaoTalk_20240613_041455436" src="https://github.com/CSID-DGU/2024-01-CSC4004-03-Summer/assets/121737437/32393b30-a451-4a0c-8c36-d708db9c92b1">
    <img width="300" alt="KakaoTalk_20240613_041550441" src="https://github.com/CSID-DGU/2024-01-CSC4004-03-Summer/assets/121737437/ee4eab4b-c662-45b4-b491-53e2b4ebc30d">
</p>

원그래프로 학점 조회 가능.(애니메이션 활용)
커리큘럼의 경우 마우스 호버가 잡히면 버블로 선이수 과목을 알려줌.

 **📌시간표 조회**
<p align="center">
    <img width="300" alt="KakaoTalk_20240613_041701520" src="https://github.com/CSID-DGU/2024-01-CSC4004-03-Summer/assets/121737437/19e2431d-8e21-4808-84d0-56287d043333">
</p>
  구글 지도 URL을 활용하여 각 건물의 위도 경도를 필터링하여 길찾기로 연결.

#### Database Structure

<img src="https://github.com/CSID-DGU/2024-01-CSC4004-03-Summer/assets/121737437/0f2fa908-fbd7-42a3-a962-2a420e6ff040" width="400" height="800" alt="스크린샷 2024-06-13 034318">


### Development Tools
Front-end 
  - VS code
  - Figma
  - React, JavaScript

Back-end
  - Spring Boot
  - MySQL(AWS)
  - Python(Chat Bot)

### Notion
https://conscious-flier-5e5.notion.site/SUMMER-API-d2362f3949ab42a9b58a4a254e6ebb1a?pvs=4


### 팀원
* 2020112030 컴퓨터공학과 김선표 (Backend)
* 2021110022 불교학부 김수빈 (Frontend)
* 2023112564 컴퓨터공학과 김윤서 (Backend)
* 2020112056 컴퓨터공학과 노정우 (Backend)
* 2021111042 컴퓨터공학과 정설화 (Frontend) 
