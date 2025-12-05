/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.config;

import java.awt.Dimension;
import javax.swing.JPanel;

public class FixedWidthPanel
extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(250, super.getPreferredSize().height);
    }
}

