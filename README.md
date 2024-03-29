# WorkOutMemo

## 시작 동기
‘몸이 건강해야 일도 열심히 할 수 있다’는 생각에 운동을 하고 기록할 필요성을 느꼈습니다. 운동 기록 앱을 직접 만들어서 필요한 기능들을 계속 추가해나가면 좋겠다고 생각했습니다.



## 📱 앱의 목적
: 운동 메모 기능


## 📝 기술
- Architecture: Clean-Architecture, MVVM
- 비동기 : Coroutine
- DI : Koin
- DB : Room
- LiveData - DataBinding


## 👊🏻 도전!!
- 기본 보일러플레이트 만들며 프로젝트 진행 
  - base class(activity, fragment, viewModel, dialog, toast)
- MVVM + 클린 아키텍쳐 구조
  - ViewModel, Repository 사용
  - module 단위 구성(app, core, data, presentation)
    - app           : DI(Koin)
    - core          : Base Class
    - data          : 내부, 외부 데이터 저장소
    - domain        : data 와 presentation 데이터 연결
    - presentation  : UI
- 구글 스토어 배포 
- 새 기술 시도
  - recyclerview diffutil class
  - room
  - fragment navigation
  - editText
    - 키보드 컨트롤
    - 정규식
    - 양방향 데이터바인딩
 


## 🔖 TODO
- 리스트 아이템 decoration
- 이미지 필요
  - 로고
  - 헤더(뒤로가기, 추가, 수정, 이동...)
  - 스플래시 로띠, 로딩 로띠
- room 클린+MVVM 구조 적용

## 화면별 필요한 이미지 리스트업
#### BodyPart
- [ ]  >
- [ ] Item text 앞에 붙는 것(*)
- [ ] 운동부위 추가 버튼 (신체부위) (+Pressed)

#### MeMoList
- [ ] < (뒤로가기)
- [ ] 메모 추가 (글씨쓰는 듯한)

#### MemoCreate
- [ ] 저장 버튼

#### Memo
- [ ] 수정 버튼 
- [ ] 수정 완료 버튼


## 🗒 추가 기능 리스트

- 달력
- 타이머
- 그래프
- 로그인
- 알람
