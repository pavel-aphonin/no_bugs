package main.java.Task_8.Extra.ActionHistory;

import java.util.Stack;

public class ActionHistory {
    private final Stack<String> actionHistory;
    private final Stack<String> undoHistory;

    public ActionHistory() {
        this.actionHistory = new Stack<>();
        this.undoHistory = new Stack<>();
    }

    public void addAction(String action) {
        actionHistory.push(action);

        if (!undoHistory.isEmpty()) {
            undoHistory.clear();
        }
    }

    public void undo() {
        String item = actionHistory.pop();
        undoHistory.push(item);
    }

    public void redo() {
        String item = undoHistory.pop();
        actionHistory.push(item);
    }

    public void multipleUndo(Integer count) {
        for (int i = 1; i <= count; i += 1) {
            this.undo();
        }
    }

    public void multipleRedo(Integer count) {
        for (int i = 1; i <= count; i += 1) {
            this.redo();
        }
    }

    public void showActionHistory() {
        System.out.println(actionHistory);
    }

    public void showUndoHistory() {
        System.out.println(undoHistory);
    }

    public void clearActionHistory() {
        actionHistory.clear();
        undoHistory.clear();
    }
}
