package com.giof71.monitoring.dto.structure.decorated;

import com.giof71.monitoring.dto.OperationResult;

public interface StructuredOperationResult<T> {
	OperationResult getOperationResult();
	T getData();
	void setData(T data);
}
