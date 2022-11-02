package com.epam.texttask.parser;

import com.epam.texttask.composite.GroupType;
import com.epam.texttask.composite.TextComposite;
import com.epam.texttask.composite.TextUnit;

import java.util.Arrays;
import java.util.List;

public class TextParser extends AbstractParser {
    static final String PARAGRAPH_REGEX = "\\n";
    private AbstractParser nextSuccessor = new ParagraphParser();

    @Override
    public TextComposite parse(String str) {
        TextComposite textComposite = new TextComposite(GroupType.TEXT);
        List<String> result = Arrays.stream(str.split(PARAGRAPH_REGEX)).toList();
        for (String item : result) {
            TextUnit textUnit = new TextUnit(item, GroupType.PARAGRAPH);
            textComposite.add(textUnit);
            textComposite.add(nextSuccessor.parse(item));
        }
        return textComposite;
    }
}
