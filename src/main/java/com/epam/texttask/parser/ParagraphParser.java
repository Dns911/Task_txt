package com.epam.texttask.parser;

import com.epam.texttask.composite.GroupType;
import com.epam.texttask.composite.TextComposite;
import com.epam.texttask.composite.TextUnit;

import java.util.Arrays;
import java.util.List;

public class ParagraphParser extends AbstractParser {

    static final String SENTENCE_REGEX = "(\\.|\\!|\\?)\\s+";
    private AbstractParser nextSuccessor = new SentenceParser();

    @Override
    public TextComposite parse(String str) {
        TextComposite textComposite = new TextComposite(GroupType.PARAGRAPH);
        List<String> result = Arrays.stream(str.split(SENTENCE_REGEX)).toList();
        for (String item : result) {
            textComposite.add(nextSuccessor.parse(item));
        }
        return textComposite;
    }
}
