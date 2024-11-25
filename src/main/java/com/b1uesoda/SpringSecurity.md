## 필터
### SecurityContextPersistenceFilter
SecurityContextRepository에서 SecurityContext(접근 주체와 인증에 대한 정보를 담고 있는 객체)를 가져오거나 저장하는 역할을 한다.

### UsernamePasswordAuthenticationFilter
인증 관리자. 폼 기반 로그인을 할 때 사용되는 필터로 아이디, 패스워드 데이터를 파싱해 인증 요청을 위임한다.
인증이 성공하면 AuthenticationSuccessHandler를, 인증에 실패하면 AuthenticationFailureHandler를 실행한다.

### FilterSecurityInterceptor
접근 결정 관리자. AccessDecisionManager로 권한 부여 처리를 위임함으로써 접근 제어 결정을 쉽게 해준다.
이 과정에서는 이미 사용자가 인증되어 있으므로 유효한 사용자인지도 알 수 있다. 즉, 인가 관련 설정을 할 수 있다.