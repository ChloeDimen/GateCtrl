/* DO NOT EDIT THIS FILE - it is machine generated */
#include <com_android_JwGateCtrl.h>
#include <jwctrl_power.h>
/*
 * Class:     com_android_JwGateCtrl
 * Method:    pwrBoot
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_android_JwGateCtrl_pwrBoot
  (JNIEnv* env, jobject clazz, jint cmd) {
	int ret = 0;
	ret = pwrBoot(cmd);
	return ret;
}

/*
 * Class:     com_android_JwGateCtrl
 * Method:    portPwrCtrl
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_android_JwGateCtrl_portPwrCtrl
  (JNIEnv* env, jobject clazz, jint port, jint onoff) {
	int ret = 0;
	ret = portPwrCtrl(port, onoff);
	return ret;
}

/*
 * Class:     com_android_JwGateCtrl
 * Method:    portPwrReset
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_android_JwGateCtrl_portPwrReset
  (JNIEnv* env, jobject clazz, jint port) {
	int ret = 0;
	ret = portPwrReset(port);
	return ret;
}

/*
 * Class:     com_android_JwGateCtrl
 * Method:    portPwrRead
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_android_JwGateCtrl_portPwrRead
  (JNIEnv* env, jobject clazz, jint port) {
	int ret = 0;
	ret = portPwrRead(port);
	return ret;
}