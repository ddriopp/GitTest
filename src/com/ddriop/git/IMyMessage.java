package com.ddriop.git;

import java.util.Map;

public interface IMyMessage {
	public Map<String, Object> getMessageParam();

	public void setMessageParam(Map<String, Object> messageParam);

	public void sendMesage() throws Exception;
}
