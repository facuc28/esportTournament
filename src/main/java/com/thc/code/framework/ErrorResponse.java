package com.thc.code.framework;

public class ErrorResponse {

    private int trackingCode;
    private String severity;
    private String fieldError;
    private FormError formError;

    public ErrorResponse() {
    }

    public ErrorResponse(int trackingCode, String severity, String fieldError, FormError formError) {
        this.trackingCode = trackingCode;
        this.severity = severity;
        this.fieldError = fieldError;
        this.formError = formError;
    }

    public int getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(int trackingCode) {
        this.trackingCode = trackingCode;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getFieldError() {
        return fieldError;
    }

    public void setFieldError(String fieldError) {
        this.fieldError = fieldError;
    }

    public FormError getFormError() {
        return formError;
    }

    public void setFormError(FormError formError) {
        this.formError = formError;
    }
}
