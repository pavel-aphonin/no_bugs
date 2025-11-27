package main.java.Task_8.Extra.ActionHistory;

public class Main {
    public static void main(String[] args) {
        // Полагаем, что размер истории действий ничем не ограничен

        ActionHistory actionHistory = new ActionHistory();

        // Выполняем несколько действий
        actionHistory.showActionHistory();
        actionHistory.addAction("Ввод текста");
        actionHistory.addAction("Ввод текста");
        actionHistory.addAction("Вставка таблицы");
        actionHistory.addAction("Ввод текста");
        actionHistory.addAction("Ввод текста");
        actionHistory.addAction("Применение форматирования");
        actionHistory.addAction("Вставка изображения");
        actionHistory.addAction("Применение шаблона");
        actionHistory.addAction("Ввод текста");
        actionHistory.addAction("Удаление текста");
        actionHistory.showActionHistory();

        // Отменяем действия
        actionHistory.undo();
        actionHistory.showActionHistory();
        actionHistory.undo();
        actionHistory.showActionHistory();

        // Повторяем действия
        actionHistory.redo();
        actionHistory.showActionHistory();
        actionHistory.redo();
        actionHistory.showActionHistory();

        // Множественная отмена действий
        actionHistory.multipleUndo(5);
        actionHistory.showActionHistory();

        // Множественный повтор действий
        actionHistory.multipleRedo(5);
        actionHistory.showActionHistory();

        // Запрет повтора действий после выполнения новых
        actionHistory.showUndoHistory();
        actionHistory.multipleUndo(3);
        actionHistory.showUndoHistory();
        actionHistory.addAction("Ввод текста");
        actionHistory.showUndoHistory();

        // Очистка истории действий
        actionHistory.clearActionHistory();
        actionHistory.showUndoHistory();
        actionHistory.showActionHistory();
    }
}
