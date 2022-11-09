package com.epam.texttask.maintext;

import com.epam.texttask.action.TextAction;
import com.epam.texttask.action.impl.TextActionImpl;
import com.epam.texttask.comparator.TextComparator;
import com.epam.texttask.composite.GroupType;
import com.epam.texttask.parser.TextParser;
import com.epam.texttask.composite.TextComposite;
import com.epam.texttask.writer.TextWriter;

public class Main {
    public static void main(String[] args) {
//        String str = """
//                It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the with there lease of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
//                It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.
//                It is a established fact that a reader will be of a page when looking at its layout.
//                Bye.
//                """;
        String str = """
                It has survived, unchanged. It was mIpsum.
                It long is layout. The more-or-less, 'Content here, content here', English.
                It is layout. She a is. He.
                Bye.
                """;
        TextParser textParser = new TextParser();
        TextComposite textMainComposite = textParser.parse(str);

        textMainComposite.handler(GroupType.PARAGRAPH, TextComparator.COUNT_NEXT_TYPE);
        TextWriter textWriter = new TextWriter();
        textWriter.textToFile("Task N:\n" + textMainComposite.toString(), "", true);

    }
}
