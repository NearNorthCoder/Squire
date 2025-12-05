/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client.ui;

import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;

public class JMultilineLabel
extends JTextArea {
    private static final long serialVersionUID = 1L;

    public JMultilineLabel() {
        this.setEditable(false);
        this.setCursor(null);
        this.setOpaque(false);
        this.setFocusable(false);
        this.setWrapStyleWord(true);
        this.setLineWrap(true);
        this.setBorder(new EmptyBorder(0, 8, 0, 8));
        this.setAlignmentY(0.5f);
        DefaultCaret caret = (DefaultCaret)this.getCaret();
        caret.setUpdatePolicy(1);
    }
}

