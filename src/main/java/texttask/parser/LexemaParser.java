package com.epam.texttask.parser;

import com.epam.texttask.composite.GroupType;
import com.epam.texttask.composite.TextComposite;
import com.epam.texttask.composite.TextUnit;

public class LexemaParser extends AbstractParser{
    @Override
    public TextComposite parse(String str) {
        TextComposite textComposite = new TextComposite();
        textComposite.setType(GroupType.SYMBOL);
        char[] charArr = str.toCharArray();
        for (char item : charArr) {
            TextUnit textUnit = new TextUnit();
            textUnit.setType(GroupType.SYMBOL);
            textUnit.setUnitText(String.valueOf(item));
            textComposite.add(textUnit);
        }
        return textComposite;
    }
}
