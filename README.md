# concurrency_issues
> 재고시스템으로 알아보는 동시성이슈 해결방법 - 최상용

### 🛠실습 환경
- Spring Boot 3.2.1
- Java 17
- JPA
- MySQL
- Docker
- Redis

### 👩‍🏫학습내용
- 동시성 이슈란?
  - 여러 스레드가 동시에 하나의 자원을 공유하고 있기 때문에 같은 자원을 두고 경쟁 상태(race Condition) 같은 문제가 발생
- 경쟁 상태(Race condition)
  - 둘 이상의 Thread가 공유 데이터에 액세스 할 수 있고 동시에 변경을 하려고 할때 발생하는 문제
-  경쟁 상태 해결 방법 
    - JAVA
      - Synchronized
    - Database
      - 비관적 락 (Pessimistic Lock)
      - 낙관적 락 (Optimistic Lock)
      - 네임드 락 (Named Lock)
    - Redis
       - Lettuce
       - Redisson
