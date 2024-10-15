package com.company;

import java.util.Stack;

public class CustomStringBuilder {
    private StringBuilder current;
    private Stack<String> history;

    public CustomStringBuilder() {
        this.current = new StringBuilder();
        this.history = new Stack<>();
    }

    private void saveState() {
        history.push(current.toString());
    }

    public CustomStringBuilder append(String str) {
        saveState();
        current.append(str);
        return this;
    }

    public CustomStringBuilder delete(int start, int end) {
        saveState();
        current.delete(start, end);
        return this;
    }

    public CustomStringBuilder deleteCharAt(int index) {
        saveState();
        current.deleteCharAt(index);
        return this;
    }

    public CustomStringBuilder replace(int start, int end, String str) {
        saveState();
        current.replace(start, end, str);
        return this;
    }

    public CustomStringBuilder insert(int offset, String str) {
        saveState();
        current.insert(offset, str);
        return this;
    }

    public void undo() {
        current = new StringBuilder(history.pop());
    }

    @Override
    public String toString() {
        return "current = " + current;
    }
}
