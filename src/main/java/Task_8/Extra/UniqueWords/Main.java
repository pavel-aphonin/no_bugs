package Task_8.Extra.UniqueWords;

public class Main {
    static void main() {
        UniqeWords uniqeWords = new UniqeWords();

        // Считаем уникальные слова в тексте
        uniqeWords.setText("Перед вами текст, предназначенный для анализа. Его цель – продемонстрировать процесс подсчета уникальных слов. Обратите внимание на разнообразие лексики и на те слова, которые не повторяются.");
        System.out.println(uniqeWords.getText());
        uniqeWords.makeUniqueWordsSet();
        uniqeWords.calculateUniqueWordsCount();
        uniqeWords.printUniqueWords();
        uniqeWords.clear();

        // Читаем уникальные слова в пустом тексте
        uniqeWords.setText("");
        System.out.println(uniqeWords.getText());
        uniqeWords.makeUniqueWordsSet();
        uniqeWords.calculateUniqueWordsCount();
        uniqeWords.printUniqueWords();
    }
}
