package com.epam.texttask.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class TextComposite implements TextComponent {
    private GroupType type;
    private List<TextComponent> textComponents = new ArrayList<>();

    public TextComposite() {
    }

    public GroupType getType() {
        return type;
    }

    public List<TextComponent> getTextComponents() {
        return textComponents;
    }

    public List<TextComponent> getAllComponentByType(GroupType groupType) {
        List<TextComponent> result = new ArrayList<>();
        for (TextComponent textComponent: textComponents){
            if (textComponent.getType().equals(groupType)){
                result.add(textComponent);
            }
        }
        return result;
    }

    public boolean add(TextComponent textComponent) {
        return textComponents.add(textComponent);
    }

    public boolean remove(Object o) {
        return textComponents.remove(o);
    }

    public void setType(GroupType type) {
        this.type = type;
    }

    @Override
    public int count() {
        int counter = 0;
        for (TextComponent component :
                textComponents) {
            counter += component.count();
        }
        return counter;
    }

    @Override
    public String toString() {
        return new StringJoiner(" \n ", "{", "}\n")
                .add("type=" + type + "\n" + " " + textComponents)
                .toString();
    }
}
