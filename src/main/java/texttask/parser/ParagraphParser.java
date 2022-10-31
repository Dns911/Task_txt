package com.epam.texttask.parser;

import com.epam.texttask.composite.GroupType;
import com.epam.texttask.composite.TextComposite;
import com.epam.texttask.composite.TextUnit;

import java.util.Arrays;
import java.util.List;

public class ParagraphParser extends AbstractParser {

    static final String SENTENCE_REGEX = "(\\.|\\!|\\?)\\s+";

    @Override
    public TextComposite parse(String str) {
        TextComposite textComposite = new TextComposite();
        textComposite.setType(GroupType.SENTENCE);
        List<String> result = Arrays.stream(str.split(SENTENCE_REGEX)).toList();
        SentenceParser sentenceParser = new SentenceParser();
        for (String item : result) {
            TextUnit textUnit = new TextUnit();
            textUnit.setType(GroupType.SENTENCE);
            textUnit.setUnitText(item);
            textComposite.add(textUnit);
            textComposite.add(sentenceParser.parse(item));
        }
        return textComposite;
    }
}
