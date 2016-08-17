package com.saikikky.android.coolweather.util;

public interface HttpCallbackListener {

	void onFinish(String response);
	
	void onError(Exception e);
}
