package net.luversof.core.exception;

import lombok.Getter;

public class BlueskyException extends RuntimeException {
	private static final long serialVersionUID = -2499198692880482249L;

	@Getter
	private final String errorCode;

	public BlueskyException(String errorCode) {
		this.errorCode = errorCode;
	}

	public BlueskyException(ErrorCode errorCode) {
		this.errorCode = errorCode.name();
	}
}
