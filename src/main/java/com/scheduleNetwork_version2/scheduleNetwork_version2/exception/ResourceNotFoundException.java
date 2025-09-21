package com.scheduleNetwork_version2.scheduleNetwork_version2.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s با %s: %s یافت نشد", resourceName, fieldName, fieldValue));
    }
}


