package com.epam.texttask.parser;


import com.epam.texttask.composite.TextComposite;

public abstract class AbstractParser {
    protected AbstractParser successor;

    public void setSuccessor(AbstractParser successor) {

        this.successor = successor;
    }

    public abstract TextComposite parse(String str);
}
