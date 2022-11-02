package com.epam.texttask.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class TextComposite implements TextComponent {
    private List<TextComponent> textComponents = new ArrayList<>();

    private GroupType unitType;

//    public TextComposite() {
//    }

    public TextComposite(GroupType unitType) {
        this.unitType = unitType;
    }

    @Override
    public GroupType getType() {
        return unitType;
    }

    public boolean add(TextComponent textComponent) {
        return textComponents.add(textComponent);
    }

    public boolean remove(Object o) {
        return textComponents.remove(o);
    }

//    @Override
//    public TextComposite getElementsByType(GroupType groupType){
//        TextComposite resultComposite = new TextComposite();
//        for (TextComponent txtComp: this.textComponents){
//                resultComposite.add(txtComp.getElementsByType(groupType));
//        }
//        return resultComposite;
//    }


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
        String str = "";
        for (TextComponent txtComponent : this.textComponents) {
            str += txtComponent.toString();
        }
        return str;
    }
}
