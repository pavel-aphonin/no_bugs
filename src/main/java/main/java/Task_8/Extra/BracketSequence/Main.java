package main.java.Task_8.Extra.BracketSequence;

public class Main {
    public static void main(String[] args) {
        BracketSequence bracketSequence = new BracketSequence();

        // Проверяем корректную последовательность
        bracketSequence.setBracketSequence("((((({[]})))))");
        System.out.println(bracketSequence.getBracketSequence());
        bracketSequence.checkBracketSequence();
        bracketSequence.clearBracketSequence();

        // Проверяем некорректную последовательность
        bracketSequence.setBracketSequence("((((({[)}))))))]");
        System.out.println(bracketSequence.getBracketSequence());
        bracketSequence.checkBracketSequence();
        bracketSequence.clearBracketSequence();

        // Проверяем последовательность с лишней закрывающей скобкой
        bracketSequence.setBracketSequence("((((({[]}))))))");
        System.out.println(bracketSequence.getBracketSequence());
        bracketSequence.checkBracketSequence();
        bracketSequence.clearBracketSequence();

        // Проверяем пустую последовательность
        System.out.println(bracketSequence.getBracketSequence());
        bracketSequence.checkBracketSequence();
    }
}
