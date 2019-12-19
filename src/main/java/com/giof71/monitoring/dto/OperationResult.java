package com.giof71.monitoring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OperationResult {

	private OperationStatus status = OperationStatus.SUCCESS;
	private String errorCode;
	private String errorDescription;
	
	public void fail(String errorCode, String errorDescription) {
		setStatus(OperationStatus.FAIL);
		setErrorCode(errorCode);
		setErrorDescription(errorDescription);
	}
}
