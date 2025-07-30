package br.com.lovizoto.commons.dto;

import br.com.lovizoto.commons.enums.Direction;

import java.time.LocalDateTime;

public class MessageLog {

    private String sessionId;
    private String rawContent;
    private String parsed_content;
    private Direction direction;
    private String source;
    private LocalDateTime timestamp;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getRawContent() {
        return rawContent;
    }

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    public String getParsed_content() {
        return parsed_content;
    }

    public void setParsed_content(String parsed_content) {
        this.parsed_content = parsed_content;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
