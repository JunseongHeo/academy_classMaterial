// 사용자정의예외 클래스선언
package ch10_Exception;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {	}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
