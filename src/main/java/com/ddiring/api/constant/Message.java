package com.ddiring.api.constant;

public class Message {
	// info
	static public final String S3_INFO_MSG = "aws init.";
	
	static public final String STRING_SVR_EX_MSG = "서버에 오류가 발생했습니다!";
	
	// exception
	static public final String ADVICE_SVR_EX_MSG = STRING_SVR_EX_MSG; // Server Exception.
	static public final Integer ADVICE_INVAL_EX_CD = 20;
	
	static public final String WEB_AUTH_TITLE_EX_MSG = "인증에 오류가 발생했습니다"; // auth-exception
	static public final String WEB_AUTH_EX_MSG = "인증에 오류가 발생했습니다.";

	// exception-service
	static public final String VOL_CODE_SVR_EX_MSG = STRING_SVR_EX_MSG; // volunteer code exception.
	
	static public final String LOG_MSG_SVR_EX_MSG = STRING_SVR_EX_MSG; // LogMessage Fail!!!
	
	static public final String UPL_IMG_SVR_EX_MSG = STRING_SVR_EX_MSG; // insert image fail
	static public final String UPL_IMG_INVAL_EX_MSG = "잘못된 이미지 입니다."; // invalid image.
	static public final String UPL_IMG_TYPE_INVAL_EX_MSG = "잘못된 타입 입니다."; // invalid type_code.
	
	// exception-user
	static public final String AUTH_SVR_EX_MSG = STRING_SVR_EX_MSG; // auth fail.
	static public final String AUTH_TEL_INVAL_EX_MSG = "잘못된 전화번호 입니다."; // Invalid telephone.
	static public final String AUTH_TEL_SRV_EX_MSG = STRING_SVR_EX_MSG; // auth telephone fail.
	static public final String AUTH_TOKEN_INVAL_EX_MSG = "잘못된 토큰 입니다."; // Invalid token.
	static public final String AUTH_EMAIL_INVAL_EX_MSG = "잘못된 이메일 입니다.\n가입 시 등록한 이메일을 입력해 주세요."; // Invalid email.
	static public final String AUTH_PASSWD_SRV_EX_MSG = STRING_SVR_EX_MSG; // reset password fail.
	static public final String AUTH_DUPL_TEL_INVAL_EX_MSG = "중복된 전화번호 입니다."; // duplicated telephone.
	static public final String AUTH_EXCEED_INVAL_EX_MSG = "1일 인증횟수 초과 입니다."; // Daily auth request exceed.
	static public final String AUTH_TOKEN_EXPIRE_INVAL_EX_MSG = "시간 초과된 토큰 입니다."; // expired token.
	static public final String AUTH_USER_NOT_EXIST_AUTH_EX_MSG = "가입 정보가 없습니다.";
	static public final Integer AUTH_USER_NOT_EXIST_AUTH_EX_CD = 13;
	static public final String AUTH_PERMIS_AUTH_EX_MSG = "잘못된 회원 형식입니다."; // Invalid user type permission
	static public final Integer AUTH_PERMIS_AUTH_EX_CD = 17;
	
	static public final String SESSION_SVR_EX_MSG = STRING_SVR_EX_MSG; // session fail.
	static public final String LOGIN_SVR_EX_MSG = "로그인에 실패 했습니다.!"; // login fail.
	static public final String SESSION_EMAIL_INVAL_EX_MSG = "잘못된 이메일 입니다.";
	static public final String SESSION_PASSWD_INVAL_EX_MSG = "잘못된 비밀번호 입니다.";
	static public final String SESSION_TOKEN_INVAL_EX_MSG = "잘못된 토큰 입니다."; // Invalid token
	static public final String SESSION_LOGIN_TYPE_INVAL_EX_MSG = "잘못된 로그인 형식 입니다.";
	static public final String SESSION_USER_NOT_EXIST_AUTH_EX_MSG = "가입 정보가 없습니다.";
	static public final Integer SESSION_USER_NOT_EXIST_AUTH_EX_CD = 11;
	static public final String SESSION_PASSWD_AUTH_EX_MSG = "비밀번호가 틀립니다.";
	static public final Integer SESSION_PASSWD_AUTH_EX_CD = 12;
	static public final String SESSION_USER_AUTH_EX_MSG = "인증되지 않은 회원 입니다.";
	static public final Integer SESSION_USER_AUTH_EX_CD = 18;
	static public final String SESSION_USER_TYPE_AUTH_EX_MSG = "잘못된 회원 형식 입니다."; // Permission denied.
	static public final Integer SESSION_USER_TYPE_AUTH_EX_CD = 15;
	static public final String SESSION_FB_EMAIL_INVAL_EX_MSG = "잘못된 facebook 이메일 입니다.."; // invalid facebook email.
	static public final String SESSION_AUTH_EX_MSG = "인증에 오류가 발생했습니다."; // Invalid permission
	static public final Integer SESSION_AUTH_EX_CD = 16;
	static public final String SESSION_PERMIS_AUTH_EX_MSG = "잘못된 회원 형식 입니다."; // Invalid user type permission
	static public final Integer SESSION_PERMIS_AUTH_EX_CD = 17;
	
	static public final String USER_SVR_EX_MSG = STRING_SVR_EX_MSG; // user fail.
	static public final String JOIN_SVR_EX_MSG = "가입에 실패했습니다."; // join fail.
	static public final String USER_AGREE_INVAL_EX_MSG = "잘못된 서비스 동의값 입니다.";	// invalid agree_yn.
	static public final String USER_PRIVACY_INVAL_EX_MSG = "잘못된 개인정보 동의값 입니다.";	// invalid privacy_yn.
	static public final String USER_COMMERCE_INVAL_EX_MSG = "잘못된 전자상거래 동의값 입니다.";	// invalid commerce_yn.
	static public final String USER_EMAIL_INVAL_EX_MSG = "잘못된 이메일 입니다.";
	static public final String USER_PASSWD_INVAL_EX_MSG = "잘못된 비밀번호 입니다.";
	static public final String USER_TEL_INVAL_EX_MSG = "잘못된 전화번호 입니다."; // Invalid telephone. 
	static public final String USER_PRIVACY_NUMBER_INVAL_EX_MSG = "잘못된 주민번호 입니다.";
	static public final String USER_NICKNAME_INVAL_EX_MSG = "잘못된 닉네임 입니다."; // Invalid nickname.
	static public final String USER_LOGIN_TYPE_INVAL_EX_MSG = "잘못된 로그인 형식 입니다.";
	static public final String USER_TOKEN_INVAL_EX_MSG = "잘못된 토큰 입니다."; // invalid token.
	static public final String USER_EMAIL_SVR_EX_MSG = "이메일 검증에 오류가 발생했습니다."; // check email fail.
	static public final String USER_NICKNAME_SVR_EX_MSG = "닉네임 검증에 오류가 발생했습니다."; // nickname check fail.
	static public final String USER_DUPL_ID_INVAL_EX_MSG = "중복된 아이디 입니다.";
	static public final String USER_DUPL_EMAIL_INVAL_EX_MSG = "중복된 이메일 입니다."; // duplicated email.
	static public final String USER_DUPL_TEL_INVAL_EX_MSG = "중복된 전화번호 입니다."; // duplicated telephone.
	static public final String USER_DUPL_NICKNAME_INVAL_EX_MSG = "중복된 닉네임 입니다."; // duplicated nickname.
	static public final String USER_AUTH_INVAL_EX_MSG = "인증되지 않은 사용자 입니다."; // user auth fail.
	static public final String USER_FB_EMAIL_INVAL_EX_MSG = "잘못된 facebook 이메일 입니다."; // invalid facebook email.
	static public final String USER_PUSH_INFO_AGREE_INVAL_EX_MSG = "잘못된 정보 push 동의값 입니다."; // invalid push_agree_yn1
	static public final String USER_PUSH_AGREE_INVAL_EX_MSG = "잘못된 push 동의값 입니다."; // invalid push_agree_yn2
	static public final String USER_EMAIL_AGREE_INVAL_EX_MSG = "잘못된 이메일 동의값 입니다."; // invalid email_agree_yn1
	static public final String USER_SMS_AGREE_INVAL_EX_MSG = "잘못된 문자 동의값 입니다."; // invalid sms_agree_yn1
	static public final String USER_USER_NOT_EXIST_AUTH_EX_MSG = "가입 정보가 없습니다.";
	static public final Integer USER_USER_NOT_EXIST_AUTH_EX_CD = 13;
	static public final String USER_PASSWD_AUTH_EX_MSG = "잘못된 비밀번호 입니다";
	static public final Integer USER_PASSWD_AUTH_EX_CD = 14;
	static public final String USER_SAME_PASSWD_AUTH_EX_MSG = "기존과 동일한 비밀번호 입니다";
	static public final Integer USER_SAME_PASSWD_AUTH_EX_CD = 19;
	
	// exception-api
	static public final String FB_AUTH_EX_MSG = "페이스북 처리 오류 입니다."; // facebook api fail
	static public final Integer FB_AUTH_EX_CD = 11;
	static public final String KAKAO_AUTH_EX_MSG = "카카오 처리 오류 입니다.";
	static public final Integer KAKAO_AUTH_EX_CD = 11;
	static public final String APPLE_AUTH_EX_MSG = "애플 처리 오류 입니다.";
	static public final Integer APPLE_AUTH_EX_CD = 11;
	
	static public final String IMP_TOKEN_ORD_EX_MSG = "주문에 오류가 발생했습니다!"; // Order exception!
	static public final Integer IMP_TOKEN_ORD_EX_CD = 101;
	static public final String IMP_POST_SUB_CUST_ORD_EX_MSG = "주문에 오류가 발생했습니다!"; // Order exception!
	static public final Integer IMP_POST_SUB_CUST_ORD_EX_CD = 102;
	static public final String IMP_DEL_SUB_CUST_ORD_EX_MSG = "주문에 오류가 발생했습니다!"; // Order exception!
	static public final Integer IMP_DEL_SUB_CUST_ORD_EX_CD = 103;
	static public final String IMP_POST_PAY_PRE_ORD_EX_MSG = "주문에 오류가 발생했습니다!"; // Order exception!
	static public final Integer IMP_POST_PAY_PRE_ORD_EX_CD = 104;
	static public final String IMP_POST_SUB_PAY_ORD_EX_MSG = "주문에 오류가 발생했습니다!"; // Order exception!
	static public final Integer IMP_POST_SUB_PAY_ORD_EX_CD = 105;
	static public final String IMP_GET_PAY_ORD_EX_MSG = "주문에 오류가 발생했습니다!"; // Order exception!
	static public final Integer IMP_GET_PAY_ORD_EX_CD = 106;
	
	static public final String SMS_SRV_EX_MSG = "문자 발송에 오류가 발생했습니다!"; // Send Sms Fail!!! (sendApiSms)

	// exception-pay
	static public final String CONT_REAS_SVR_EX_MSG = STRING_SVR_EX_MSG; // ContentReason Fail!!!
	static public final String CONT_REAS_ORDER_INVAL_EX_MSG = "잘못된 주문 입니다."; // Invalid order
	static public final String CONT_REAS_ORDER_STATUS_INVAL_EX_MSG = "잘못된 입니다."; // Invalid order status
	static public final String CONT_REAS_ORDER_SVR_EX_MSG = STRING_SVR_EX_MSG; // Insert ContentReason Fail!!! (update payment order)
	
	static public final String PAY_CARD_SVR_EX_MSG = STRING_SVR_EX_MSG; // PaymentCard Fail!!!
	static public final String PAY_CARD_IMP_SVR_EX_MSG = STRING_SVR_EX_MSG + "(imp)"; // Insert PaymentCard Fail!!! (iamport)
	static public final String PAY_CARD_SEQ_INVAL_EX_MSG = "잘못된 카드 정보 입니다."; // Invalid seq.
	
	static public final String PAY_ORDER_SVR_EX_MSG = STRING_SVR_EX_MSG; // PaymentOrder Fail!!!
	static public final String PAY_ORDER_IMP_SVR_EX_MSG = STRING_SVR_EX_MSG + "(imp)"; // Insert PaymentOrder Fail!!! (iamport)
	static public final String PAY_ORDER_USER_INVAL_EX_MSG = "잘못된 회원정보 입니다."; // Invalid user seq.
	static public final String PAY_ORDER_STORY_SVR_EX_MSG = "서버 정보에 오류가 발생했습니다."; // Insert PaymentOrder Fail!!! (invalid story)
	static public final String PAY_ORDER_AGENCY_SVR_EX_MSG = "서버 정보에 오류가 발생했습니다."; // Insert PaymentOrder Fail!!! (invalid agency)
	static public final String PAY_ORDER_SEQ_INVAL_EX_MSG = "잘못된 주문정보 입니다."; // Invalid order seq.
	static public final String PAY_ORDER_TYPE_INVAL_EX_MSG = "잘못된 주문형식 입니다."; // Invalid order type.
	static public final String PAY_ORDER_STATUS_INVAL_EX_MSG = "잘못된 주문상태 입니다."; // Invalid order status.
	static public final String PAY_ORDER_CARD_INVAL_EX_MSG = "잘못된 카드정보 입니다."; // Invalid payment card seq.
	static public final String PAY_ORDER_PRICE_INVAL_EX_MSG = "잘못된 가격정보 입니다.";
	static public final String PAY_ORDER_TOKEN_INVAL_EX_MSG = "잘못된 토큰 입니다.";
	
	static public final String PAY_SVR_EX_MSG = STRING_SVR_EX_MSG; // Payment Fail!!!
	static public final String PAY_IMP_SVR_EX_MSG = STRING_SVR_EX_MSG + "(imp)"; // Insert Payment Fail!!! (iamport)
	static public final String PAY_SVR_EMAIL_EX_MSG = STRING_SVR_EX_MSG; // Send Receipt Fail!!!
	static public final String PAY_SEQ_INVAL_EX_MSG = "잘못된 결제정보 입니다."; // Invalid payment.
	static public final String PAY_ORDER_INVAL_EX_MSG = "잘못된 주문정보 입니다."; // Invalid payment order.
	static public final String PAY_USER_INVAL_EX_MSG = "잘못된 회원정보 입니다."; // Invalid payment user.
	static public final String PAY_USER_SVR_EX_MSG = "회원정보 오류가 발생했습니다."; // Insert payment Fail!!! (getUser)
	static public final String PAY_EMAIL_SVR_EX_MSG = "이메일 발송 오류가 발생했습니다."; // Send receipt email Fail!!! (email)
	static public final String PAY_STATUS_ORDER_INVAL_EX_MSG = "잘못된 주문상태 입니다."; // Invalid order status.
	static public final String PAY_CARD_INVAL_EX_MSG = "잘못된 카드정보 입니다."; // Invalid payment card seq.
	
	static public final String PAY_PRICE_FAIL_MSG = "가격정보에 오류가 발생했습니다."; // Insert payment Fail!!! (Invalid price)
	static public final String PAY_IMP_NULL_CANCEL_MSG = "취소 통신에 오류가 발생했습니다."; // cancel iamport resp null
	static public final String PAY_IMP_TIME_EMPTY_CANCEL_MSG = "취소 시간 정보에 오류가 발생했습니다."; // cancel iamport resp cancelledAt empty
	
	// admin
	static public final String ADMIN_INVAL_AGENCY_SEQ = "Invalid agency seq.";
	static public final String ADMIN_INVAL_STORY_SEQ = "Invalid story seq.";


}
