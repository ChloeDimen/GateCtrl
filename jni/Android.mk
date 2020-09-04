# Copyright 2013 The Android Open Source Project
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

TARGET_PLATFORM := android-22
LOCAL_SRC_FILES := jwctrl_power.c com_android_JwGateCtrl.c
LOCAL_C_INCLUDES := $(LOCAL_PATH)/include
LOCAL_LDLIBS    += -llog
LOCAL_MODULE := gatectrl
#LOCAL_CFLAGS := -Werror
LOCAL_MODULE_TAGS := optional

include $(BUILD_SHARED_LIBRARY)

#include $(CLEAR_VARS)
#
#LOCAL_SRC_FILES:= jwboot_test.c jwctrl_reboot.c
#LOCAL_C_INCLUDES := $(LOCAL_PATH)/include
#LOCAL_SHARED_LIBRARIES := libcutils
#LOCAL_MODULE:= jwboot_test
#LOCAL_MODULE_TAGS := eng
#
#include $(BUILD_EXECUTABLE)

#include $(CLEAR_VARS)
#
#LOCAL_SRC_FILES:= jwpower_test.c jwctrl_power.c
#LOCAL_C_INCLUDES := $(LOCAL_PATH)/include
#LOCAL_SHARED_LIBRARIES := libcutils
#LOCAL_MODULE:= jwpower_test
#LOCAL_MODULE_TAGS := eng
#
#include $(BUILD_EXECUTABLE)
