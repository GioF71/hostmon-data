package com.giof71.monitoring.dto.structure;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Host {
	private Long id;
	private String address;
	private String friendlyName;
	private Calendar creationTimestamp = Calendar.getInstance();
	private Calendar updateTimestamp = creationTimestamp;
}
