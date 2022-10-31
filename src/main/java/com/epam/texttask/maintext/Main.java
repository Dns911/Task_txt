package com.epam.texttask.maintext;

import com.epam.texttask.parser.TextParser;
import com.epam.texttask.composite.GroupType;
import com.epam.texttask.composite.TextComponent;
import com.epam.texttask.composite.TextComposite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = """
                A regular expression? Specified as a string, must first be compiled...
                The resulting pattern can create a Matcher object!
                All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern.
                """;
//        AlfaParser alfaParser = new AlfaParser();
////        List<String> prgrphs = alfaParser.parseToParagraph(str);
////        System.out.println(prgrphs.toString());
//        List<String> stnts = alfaParser.parseToSentence(str);
//        System.out.println(stnts.toString());
//        List<String> lexemas = alfaParser.parseToLexema(stnts.get(0));
//        System.out.println(lexemas.toString());
        TextParser textParser = new TextParser();
        TextComposite textMainComposite = textParser.parse(str);
        //System.out.println(textMainComposite);
        List<TextComponent> res = textMainComposite.getAllComponentByType(GroupType.LEXEMA);
        System.out.println(res);
    }
}
