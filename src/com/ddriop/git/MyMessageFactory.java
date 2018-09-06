package com.ddriop.git;

public class MyMessageFactory implements IMyMessageFactory {
	
	@Override
	public IMyMessage createMessage(String messageType) {
		IMyMessage myMessage;
		Map<String, Object> messageParam = new HashMap<String, Object>();
		if ("SMS".equals(messageType)) {
			myMessage = new MyMessageSms();
			messageParam.put("PHONENUM", "123456789");
		}

		return myMessage;
	}
}
