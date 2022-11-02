package com.epam.texttask.parser;


import com.epam.texttask.composite.TextComposite;

public abstract class AbstractParser {

    public abstract TextComposite parse(String str);
}
