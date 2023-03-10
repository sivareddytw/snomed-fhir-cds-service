package org.snomed.cdsservice.model;

public class CDSCoding {

	private final String system;
	private final String code;
	private String display;

	public CDSCoding(String system, String code) {
		this.system = system;
		this.code = code;
	}

	public CDSCoding(String system, String code, String display) {
		this.system = system;
		this.code = code;
		this.display = display;
	}

	public String getSystem() {
		return system;
	}

	public String getCode() {
		return code;
	}

	public String getDisplay() {
		return display;
	}

}
