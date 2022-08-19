# WorkOutMemo

### 📱 앱의 목적
: 운동 메모 기능


### 👊🏻 도전!!
- 기본 보일러플레이트 만들며 프로젝트 진행 
  - base class(activity, fragment, viewModel, dialog, toast)
- MVVM + 클린 아키텍쳐 구조
  - ViewModel, Repository 사용
  - module 단위 구성(app, core, data, domain, presentation)
    - app           : DI(Koin)
    - core          : Base Class
    - data          : 내부, 외부 데이터 저장소
    - domain        : data 와 presentation 데이터 연결
    - presentation  : UI
- 구글 스토어 배포 
- 새 기술 시도
  - recyclerview diffutil class
  - binding adapter
  - room
  - fragment navigation
  - editText
    - 키보드 컨트롤
    - 정규식
    - 양방향 데이터바인딩
  

### 📝 기술
- 클린아키텍쳐, MVVM
- coroutine
- koin
- room



#### TODO
- 리스트 아이템 decoration
- 이미지 필요
  - 로고
  - 헤더(뒤로가기, 추가, 수정, 이동...)
  - 스플래시 로띠, 로딩 로띠
- room 클린+MVVM 구조 적용
