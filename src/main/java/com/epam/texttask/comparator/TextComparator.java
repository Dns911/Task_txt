package com.epam.texttask.comparator;

import com.epam.texttask.composite.TextComponent;

import java.util.Comparator;

public enum TextComparator implements Comparator<TextComponent> {
    COUNT_SYMBOL {
        @Override
        public int compare(TextComponent o1, TextComponent o2) {
            return Integer.compare(o1.countSymbol(), o2.countSymbol());
        }
    },
    COUNT_NEXT_TYPE {
        @Override
        public int compare(TextComponent o1, TextComponent o2) {
            return Integer.compare(o1.countNextType(), o2.countNextType());
        }
    }

}
