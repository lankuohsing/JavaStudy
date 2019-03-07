/*
#include "TestJNI.h"



TestJNI::TestJNI()
{
}


TestJNI::~TestJNI()
{
}
*/
#include "com_languoxing_test_JNIDemo.h"
#include <iostream>
#include <stdio.h>

JNIEXPORT void JNICALL Java_com_languoxing_test_JNIDemo_testHello
( JNIEnv *, jobject ) {
	printf( "this is C++ print" );
}