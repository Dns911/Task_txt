package com.epam.texttask.composite;

import com.epam.texttask.action.TextAction;
import com.epam.texttask.action.impl.TextActionImpl;
import com.epam.texttask.comparator.TextComparator;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {
    private List<TextComponent> textComponents = new ArrayList<>();

    private GroupType unitType;

    public TextComposite(GroupType unitType) {
        this.unitType = unitType;
    }

    @Override
    public List<TextComponent> getElements() {
        return textComponents;
    }

    @Override
    public void setElements(List<TextComponent> textComponents) {
        this.textComponents = textComponents;
    }

    @Override
    public GroupType getType() {
        return unitType;
    }

    @Override
    public void setType(GroupType unitType) {
        this.unitType = unitType;
    }

    public boolean add(TextComponent textComponent) {
        return textComponents.add(textComponent);
    }

    public void remove(int index) {
        textComponents.remove(index);
    }

    @Override
    public void handler(GroupType groupType, TextComparator textComparator) {
        TextAction textAction = new TextActionImpl();
        if (this.getType().equals(groupType)) {
            textAction.sort(this, textComparator);
        } else {
            for (TextComponent txtComp : this.textComponents) {
                if (txtComp.getType().equals(groupType)) {
                    textAction.sort(txtComp, textComparator);
                } else {
                    txtComp.handler(groupType, textComparator);
                }
            }
        }
    }

    @Override
    public int countSymbol() {
        int counter = 0;
        for (TextComponent component :
                textComponents) {
            counter += component.countSymbol();
        }
        return counter;
    }

    @Override
    public int countNextType() {
        int counter = textComponents.toArray().length;
        return counter;
    }

    @Override
    public String toString() {
        String str = "";
        GroupType currentType;
        for (TextComponent txtComponent : this.textComponents) {
            currentType = txtComponent.getType();
            str += txtComponent + currentType.getDelimiter();
        }
        return str;
    }
}
