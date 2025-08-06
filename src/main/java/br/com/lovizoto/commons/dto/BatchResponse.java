package br.com.lovizoto.commons.dto;

import java.util.List;

public class BatchResponse {

    private String sessionId;
    private List<String> responses;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public List<String> getResponses() {
        return responses;
    }

    public void setResponses(List<String> responses) {
        this.responses = responses;
    }
}
