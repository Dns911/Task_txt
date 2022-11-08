package com.epam.texttask.action.impl;

import com.epam.texttask.action.TextAction;
import com.epam.texttask.comparator.TextComparator;
import com.epam.texttask.composite.GroupType;
import com.epam.texttask.composite.TextComponent;

import java.util.Collections;
import java.util.List;

public class TextActionImpl implements TextAction {
    @Override
    public void sort(TextComponent textComponent, TextComparator comparator) {
        GroupType current = textComponent.getType();
        List<TextComponent> textComponentList = textComponent.getElements();
        Collections.sort(textComponentList, comparator);
        textComponent.setElements(textComponentList);
        textComponent.setType(current);
    }
}
