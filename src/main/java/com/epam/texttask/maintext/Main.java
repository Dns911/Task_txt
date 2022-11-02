package com.epam.texttask.maintext;

import com.epam.texttask.parser.TextParser;
import com.epam.texttask.composite.GroupType;
import com.epam.texttask.composite.TextComponent;
import com.epam.texttask.composite.TextComposite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = """
                It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the with there lease of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
                It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.
                It is a established fact that a reader will be of a page when looking at its layout.
                Bye.
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
        System.out.println(textMainComposite.toString());
        //System.out.println(textMainComposite.getElementsByType(GroupType.TEXT));
    }
}
