package com.giof71.monitoring.dto.structure.decorated;

import com.giof71.monitoring.dto.OperationResult;

public abstract class AbsStructuredOperationResult<T> implements StructuredOperationResult<T> {

	private final OperationResult operationResult = new OperationResult();
	private T data;
	
	@Override
	public OperationResult getOperationResult() {
		return operationResult;
	}
	
	@Override
	public T getData() {
		return data;
	}
	
	@Override
	public void setData(T data) {
		this.data = data;
	}
}
