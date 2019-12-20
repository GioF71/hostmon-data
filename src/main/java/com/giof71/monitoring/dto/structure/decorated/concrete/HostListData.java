package com.giof71.monitoring.dto.structure.decorated.concrete;

import java.util.List;

import com.giof71.monitoring.dto.structure.Host;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HostListData {
	private long count;
	private List<Host> hostList;
}
