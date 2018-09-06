package com.ddriop.git;

import MyAbstractMessage;

public class MyMessageSms extends MyAbstractMessage {
	@Override
	public void sendMesage() throws Exception {
		// TODO Auto-generated method stub
		if (null == getMessageParam() || null == getMessageParam().get("PHONENUM")
				|| "".equals(getMessageParam().get("PHONENUM"))) {
			throw new Exception("发送短信,需要传入PHONENUM参数");
		}

		System.out.println("我是短信，发送通知给" + getMessageParam().get("PHONENUM"));
	}
}
