## 목표
- TDD 를 이용해 기능을 구현 함으로써 TDD 에 익숙해 진다.
    - Test fail -> test success -> refactoring 과정으로 진행한다.
    - 테스트 파일을 먼저 생성한다.
- 기능 구현 전에 어떤 기능을 넣을지 설계 과정을 먼저 진행하고 생성 될 도메인을 구상한다.

## 숫자야구 기능 목록

---
- Referee
- Balls
- Ball

- [ ] 랜덤 숫자 3개 생성 (중복 없이) - NumberGenerator#createRandomNumber()
- [ ] 볼 스트라이크 판단 기능 (컴퓨터 숫자와 유저 숫자를 비교할 수 있다) - Referee#compare()
- [ ] 몇개의 숫자가 같은지 알 수 있다. Referee#count
    - [x] 볼 위치가 같은지 알 수 있다. Ball#isEqualsPosition()
    - [x] 볼 숫자와 위치가 같은지 알 수 있다. Ball#isEquals()
    
- [x] 아무 것도 없으면 nothing
- [x] 같은 자리 숫자면 strike
- [x] 다른 위치 숫자면 ball
- [x] 0 ~ 9 에 해당 하는 숫자를 생성한다. Number
