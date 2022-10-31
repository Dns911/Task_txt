package com.epam.texttask.parser;

import com.epam.texttask.composite.GroupType;
import com.epam.texttask.composite.TextComposite;
import com.epam.texttask.composite.TextUnit;

import java.util.Arrays;
import java.util.List;

public class SentenceParser extends AbstractParser{
    static final String LEXEMA_REGEX = "\\s+";
    @Override
    public TextComposite parse(String str) {
        TextComposite textComposite = new TextComposite();
        textComposite.setType(GroupType.LEXEMA);
        List<String> result = Arrays.stream(str.split(LEXEMA_REGEX)).toList();
        LexemaParser lexemaParser = new LexemaParser();
        for (String item : result) {
            TextUnit textUnit = new TextUnit();
            textUnit.setType(GroupType.LEXEMA);
            textUnit.setUnitText(item);
            textComposite.add(textUnit);
            textComposite.add(lexemaParser.parse(item));
        }
        return textComposite;
    }
}
