package com.epam.texttask.composite;

import java.util.List;
import java.util.StringJoiner;

public class TextUnit implements TextComponent {
    private String unitText;

    private GroupType unitType;

    public TextUnit(String unitText, GroupType unitType) {
        this.unitText = unitText;
        this.unitType = unitType;
    }

    public GroupType getType() {
        return unitType;
    }

    @Override
    public int count() {
        return 1;
    }


//    @Override
//    public TextComponent getElementsByType(GroupType groupType){
//        if (this.getType().equals(groupType)){
//            return this;
//        }
//        return this;
//    }

    @Override
    public String toString() {
        String str;
        if (this.getType().equals(GroupType.SYMBOL)) {
            str = unitText;
        } else if (this.getType().equals(GroupType.LEXEMA)) {
            str = " ";
        } else if (this.getType().equals(GroupType.SENTENCE)) {
            str = " ";
        } else {
            str = "\n"; // new line
        }
        return str;
    }
}
