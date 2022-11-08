package com.epam.texttask.composite;

import com.epam.texttask.comparator.TextComparator;

import java.util.List;

public interface TextComponent {
    GroupType getType();
    void setType(GroupType unitType);
    List<TextComponent> getElements();
    void setElements(List<TextComponent> list);
    int countSymbol();
    int countNextType();
   void handler(GroupType groupType, TextComparator textComparator);
}
