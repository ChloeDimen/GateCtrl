/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_android_JwGateCtrl */

#ifndef _Included_com_android_JwGateCtrl
#define _Included_com_android_JwGateCtrl
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_android_JwGateCtrl
 * Method:    pwrBoot
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_android_JwGateCtrl_pwrBoot
  (JNIEnv* env, jobject clazz, jint cmd);

/*
 * Class:     com_android_JwGateCtrl
 * Method:    portPwrCtrl
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_android_JwGateCtrl_portPwrCtrl
  (JNIEnv* env, jobject clazz, jint port, jint onoff);

/*
 * Class:     com_android_JwGateCtrl
 * Method:    portPwrReset
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_android_JwGateCtrl_portPwrReset
  (JNIEnv* env, jobject clazz, jint port);

/*
 * Class:     com_android_JwGateCtrl
 * Method:    portPwrRead
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_android_JwGateCtrl_portPwrRead
  (JNIEnv* env, jobject clazz, jint port);
#ifdef __cplusplus
}
#endif
#endif
