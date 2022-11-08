package com.epam.texttask.action;

import com.epam.texttask.comparator.TextComparator;
import com.epam.texttask.composite.TextComponent;
import com.epam.texttask.composite.TextComposite;

public interface TextAction {
    void sort(TextComponent textComponent, TextComparator comparator);
}
