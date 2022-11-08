
package com.epam.texttask.composite;

public enum GroupType {
    DEFAULT ("<>"),
    TEXT (""),
    PARAGRAPH("\n"),
    SENTENCE("   "),
    LEXEMA(" "),
    SYMBOL("");
    private String value;
    private int level;

    GroupType(String value) {
        this.value = value;
    }

    public String getDelimiter() {
        return value;
    }


}
