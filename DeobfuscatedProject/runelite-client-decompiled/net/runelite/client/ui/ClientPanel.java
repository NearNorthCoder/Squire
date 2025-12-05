/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Constants
 */
package net.runelite.client.ui;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.annotation.Nullable;
import javax.swing.JPanel;
import net.runelite.api.Constants;

public final class ClientPanel
extends JPanel {
    public ClientPanel(@Nullable Applet client) {
        this.setSize(Constants.GAME_FIXED_SIZE);
        this.setMinimumSize(Constants.GAME_FIXED_SIZE);
        this.setPreferredSize(Constants.GAME_FIXED_SIZE);
        this.setLayout(new BorderLayout());
        this.setBackground(Color.black);
        if (client == null) {
            return;
        }
        this.add((Component)client, "Center");
    }
}

