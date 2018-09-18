package ru.maxlich.app.entity;

public class Message {
    private String text;
    boolean isError;

    public Message(String text, boolean isError) {
        this.text = text;
        this.isError = isError;
    }

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }
}
