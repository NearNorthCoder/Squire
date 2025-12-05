/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.ui;

import java.awt.Desktop;
import java.awt.desktop.QuitStrategy;

class MacOSQuitStrategy {
    MacOSQuitStrategy() {
    }

    public static void setup() {
        Desktop.getDesktop().setQuitStrategy(QuitStrategy.CLOSE_ALL_WINDOWS);
    }
}

