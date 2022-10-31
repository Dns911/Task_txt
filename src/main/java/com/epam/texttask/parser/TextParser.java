package com.epam.texttask.parser;

import com.epam.texttask.composite.GroupType;
import com.epam.texttask.composite.TextComposite;
import com.epam.texttask.composite.TextUnit;

import java.util.Arrays;
import java.util.List;

public class TextParser extends AbstractParser {
    static final String PARAGRAPH_REGEX = "\\n";

    @Override
    public TextComposite parse(String str) {
        TextComposite textComposite = new TextComposite();
        textComposite.setType(GroupType.PARAGRAPH);
        List<String> result = Arrays.stream(str.split(PARAGRAPH_REGEX)).toList();
        ParagraphParser paragraphParser = new ParagraphParser();
        for (String item : result) {
            TextUnit textUnit = new TextUnit();
            textUnit.setUnitText(item);
            textUnit.setType(GroupType.PARAGRAPH);
            textComposite.add(textUnit);
            textComposite.add(paragraphParser.parse(item));
        }

        return textComposite;
    }
}
