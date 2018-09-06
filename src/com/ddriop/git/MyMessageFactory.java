package com.ddriop.git;

import java.util.HashMap;
import java.util.Map;

public class MyMessageFactory implements IMyMessageFactory {

	@Override
	public IMyMessage createMessage(String messageType) {
		IMyMessage myMessage;
		Map<String, Object> messageParam = new HashMap<String, Object>();
		if ("SMS".equals(messageType)) {
			myMessage = new MyMessageSms();
			messageParam.put("PHONENUM", "123456789");
		} else if ("OA".equals(messageType)) {
			myMessage = new MyMessageOaTodo();
			messageParam.put("OAUSERNAME", "testUser");
		} else if ("EMAIL".equals(messageType)) {
			myMessage = new MyMessageEmail();
			messageParam.put("EMAIL", "test@test.com");
		} else {
			myMessage = new MyMessageEmail();
			messageParam.put("EMAIL", "test@test.com");
		}
		myMessage.setMessageParam(messageParam);
		return myMessage;
	}
}
