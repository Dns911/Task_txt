package com.epam.texttask.parser;

import com.epam.texttask.composite.GroupType;
import com.epam.texttask.composite.TextComposite;
import com.epam.texttask.composite.TextUnit;

public class LexemaParser extends AbstractParser {
    @Override
    public TextComposite parse(String str) {
        TextComposite textComposite = new TextComposite(GroupType.LEXEMA);
        char[] charArr = str.toCharArray();
        for (char item : charArr) {
            TextUnit textUnit = new TextUnit(String.valueOf(item), GroupType.SYMBOL);
            textComposite.add(textUnit);
        }
        return textComposite;
    }
}
