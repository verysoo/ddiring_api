package com.ddiring.api.constant;

public class Const {
    // test인 경우 true, live는 false
    static public final boolean TEST_DEBUG_USER = false;
    static public final Integer TEST_USER = 111;

    static public final String PUBVER = "201912161";
    static public final Integer CODE_OK = 1;
    static public final Double LAT = 37.5666805;
    static public final Double LNG = 126.9784147;
    static public final Integer USER_SYSTEM = 100;
    static public final Integer USER_NULL = -1;

    static public final String ymdhmssz = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    static public final String ymdhms = "yyyy-MM-dd HH:mm:ss";
    static public final String ymd = "yyyy-MM-dd";

    static public final String HEADER_DEVICE = "x-dolgo-device";
    static public final String HEADER_DEVICE_SERIAL = "x-dolgo-device-serial";
    static public final String HEADER_TOKEN = "x-dolgo-token";
    static public final String HEADER_FCM_TOKEN = "x-dolgo-fcm-token";
    static public final String HEADER_DEVICE_VALUE = "5518509C175E0361";
    static public final String HEADER_TOKEN_NULL = "token-null";

    //221.155.157.11 수연님 집
    //125.142.163.70 수연님 2
    static public final String ADMIN_IP = "127.0.0.1/112.216.230.34/10.140.151.71/210.206.68.66/221.155.157.11/125.142.163.70";
    static public final String FB_APP_ID = "315453039332338";

    static public final Integer PAGE_SIZE = 10;
    static public final Integer SEQ_ZERO = 0;
    static public final Integer LIMIT_FULL = 999;
    static public final Integer ROOT_ZERO = 0;
    static public final Integer USE_Y = 1;
    static public final Integer USE_N = 0;
}
