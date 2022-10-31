package com.epam.texttask.composite;

import java.util.StringJoiner;

public class TextUnit implements TextComponent{
    private String unitText;

    private GroupType groupType;

    public GroupType getType() {
        return groupType;
    }

    public void setType(GroupType groupType) {
        this.groupType = groupType;
    }


    public String getUnitText() {
        return unitText;
    }

    public void setUnitText(String unitText) {
        this.unitText = unitText;
    }
    @Override
    public int count() {
        return 1;
    }

    @Override
    public String toString() {
        return new StringJoiner(";\n ",  "[", "]\n")
                .add("|" + unitText + "|")
                .toString();
    }
}
