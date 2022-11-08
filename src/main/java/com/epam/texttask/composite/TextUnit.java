package com.epam.texttask.composite;

import com.epam.texttask.comparator.TextComparator;

import java.util.ArrayList;
import java.util.List;

public class TextUnit implements TextComponent {
    private String unitText;
    private GroupType unitType;

    public TextUnit(String unitText, GroupType unitType) {
        this.unitText = unitText;
        this.unitType = unitType;
    }

    @Override
    public List<TextComponent> getElements() {
        return new ArrayList<>();

    }

    @Override
    public void setElements(List<TextComponent> list) {
    }

    @Override
    public GroupType getType() {
        return unitType;
    }

    @Override
    public void setType(GroupType unitType) {
        this.unitType = unitType;
    }

    public void handler(GroupType groupType, TextComparator textComparator) {
    }

    @Override
    public int countSymbol() {
        return 1;
    }

    @Override
    public int countNextType() {
        return 0;
    }

    @Override
    public String toString() {
        return unitText;
    }
}
