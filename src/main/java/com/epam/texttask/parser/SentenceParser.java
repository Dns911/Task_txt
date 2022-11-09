package com.epam.texttask.parser;

import com.epam.texttask.composite.GroupType;
import com.epam.texttask.composite.TextComposite;
import com.epam.texttask.composite.TextUnit;

import java.util.Arrays;
import java.util.List;

public class SentenceParser extends AbstractParser {
    static final String LEXEMA_REGEX = "\\s+";
    private AbstractParser nextSuccessor = new LexemaParser();

    @Override
    public TextComposite parse(String str) {
        TextComposite textComposite = new TextComposite(GroupType.SENTENCE);
        List<String> elements = Arrays.stream(str.split(LEXEMA_REGEX)).toList();
        for (String element : elements) {
            textComposite.add(nextSuccessor.parse(element));
        }
        return textComposite;
    }
}
