package Task_8.Extra.BracketSequence;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketSequence {
    private final Stack<Character> sequence;
    private final HashMap<Character, Character> bracketsPair;
    private String bracketSequence;

    public BracketSequence() {
        this.sequence = new Stack<>();
        this.bracketsPair = new HashMap<>(Map.of(
                ')', '(',
                ']', '[',
                '}', '{'
        ));
    }

    public String getBracketSequence() {
        return bracketSequence;
    }

    public void setBracketSequence(String bracketSequence) {
        this.bracketSequence = bracketSequence;
    }

    public Boolean checkBracketSequence() {
        if (bracketSequence == null || bracketSequence.isEmpty()) {
            System.out.println("Скобочная последовательность пуста (считается корректной)");
            return true;
        }

        for (int i = 0; i < bracketSequence.length(); i += 1) {
            char ch = bracketSequence.charAt(i);

            if (bracketsPair.containsValue(ch)) {
                sequence.push(ch);
            }
            else if (bracketsPair.containsKey(ch)) {
                if (sequence.isEmpty()) {
                    System.out.println("Скобочная последовательность некорректна: нет соответствующей открывающей скобки");
                    return false;
                }
                char actualBracket = sequence.pop();
                char expectedBracket = bracketsPair.get(ch);

                if (actualBracket != expectedBracket) {
                    System.out.println("Скобочная последовательность некорректна: несовпадение типов скобок");
                    return false;
                }
            }
        }

        if (sequence.isEmpty()) {
            System.out.println("Скобочная последовательность корректна");
            return true;
        } else {
            System.out.println("Скобочная последовательность некорректна: остались незакрытые скобки");
            return false;
        }
    }


    public void clearBracketSequence() {
        sequence.clear();
        bracketSequence = "";
    }
}
