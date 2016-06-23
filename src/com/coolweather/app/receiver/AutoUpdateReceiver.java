package com.coolweather.app.receiver;

import com.coolweather.app.service.AutopdateService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoUpdateReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent arg1) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(context,AutopdateService.class);
		context.startService(intent);
	}

}
