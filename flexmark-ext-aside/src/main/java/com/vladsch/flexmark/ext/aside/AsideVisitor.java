package com.vladsch.flexmark.ext.aside;

public interface AsideVisitor {
    // void visit(ExtAside node);
    void visit(final AsideBlock node);
}
