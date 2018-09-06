package com.ddriop.git;

import java.util.Map;

public abstract class MyAbstractMessage implements IMyMessage {
	
	private Map<String, Object> messageParam;
	
	@Override
	public Map<String, Object> getMessageParam() {
		// TODO Auto-generated method stub
		return messageParam;
	}

	@Override
	public void setMessageParam(Map<String, Object> messageParam) {
		// TODO Auto-generated method stub
		this.messageParam = messageParam;
	}


}
