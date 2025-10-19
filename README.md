문자열 덧셈 연산기

# 프로젝트 구조

## 1. controller
### 1-1. CalculatorController

## 2. service
### 2-1. Operator
### 2-2. AddOperator
### 2-3. DelimitersUtils
### 2-4. StringSpliter
### 2-5. NumbersUtils
### 2-6. Validator
### 2-7. InputValidator
### 2-8. Calculator

## 3. domain
### 3-1. Numbers
### 3-2. Delimiters

## 4. view  
### 4-1. View
### 4-2. InputView
### 4-3. OutputView

---
1-1 CalculatorController
- Calculator를 관리하는 controller 

---
2-1. Operator
- 연산 정의 인터페이스

2-2. AddOperator
- Operator를 구현하여 만든 덧셈 연산 클래스
- Numbers의 sum 메서드를 사용하여 나온 결과값을 반환한다.

2-3. DelimitersUtils
- 구분자 추출 클래스
- 커스텀 구분자 prefix와 suffix 제거 문자열 반환

2-4. StringSpliter
- 문자열을 구분자로 구분하여 문자열 배열로 반환하는 클래스

2-5. NumbersUtils
- 문자열을 숫자형으로 변경하는 클래스

2-6. Validator
- 유효성 검증 인터페이스

2-7. InputValidator
- 입력 문자열 유효 검증 인터페이스

2-8. Calculator
- 위 기능들을 활용하여, 덧셈 연산을 위한 각 기능들을 호출하고, 결과를 반환하는 클래스

---
3-1. Numbers
- 숫자를 보관해둔 클래스
- 덧셈 연산 메서드를 통해 덧셈 결과를 반환

3-2. Delimiters
- 구분자를 보관해둔 클래스

---
4-1. View
- 입출력 메서드 정의 인터페이스

4-2. InputView
- 안내 문구를 출력하고, 사용자 입력을 반환하는 클래스

4-3. OutputView
- 덧셈 연산 결과를 출력하는 클래스