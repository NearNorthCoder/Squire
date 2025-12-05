/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.miginfocom.swing.MigLayout
 */
package net.runelite.client.plugins.unethicalite.ui;

import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import net.miginfocom.swing.MigLayout;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.unethicalite.ui.PanelContainer;
import net.unethicalite.client.config.SquireConfig;
import net.unethicalite.client.managers.interaction.InteractMethod;
import net.unethicalite.client.managers.interaction.MouseBehavior;

public class InteractionContainer
extends PanelContainer {
    public InteractionContainer(SquireConfig config, ConfigManager configManager) {
        super("Interaction settings", config, configManager);
    }

    @Override
    protected void rebuild() {
        this.removeAll();
        this.add((Component)this.createComboBoxSection("Interact type", "interactMethod", InteractMethod.class), "wrap");
        switch (this.config.interactMethod()) {
            case MOUSE_EVENTS: {
                JPanel mouseEventsContainer = new JPanel((LayoutManager)new MigLayout());
                mouseEventsContainer.setBorder(new TitledBorder("Mouse events"));
                mouseEventsContainer.add((Component)this.createCheckBox("Natural mouse", "naturalMouse"), "wrap");
                mouseEventsContainer.add((Component)this.createComboBoxSection("Mouse behavior", "mouseBehavior", MouseBehavior.class), "wrap");
                this.add((Component)mouseEventsContainer, "wrap");
                break;
            }
            case MOUSE_FORWARDING: {
                JPanel mouseFwContainer = new JPanel((LayoutManager)new MigLayout());
                mouseFwContainer.setBorder(new TitledBorder("Mouse forwarding"));
                mouseFwContainer.add((Component)this.createCheckBox("Force mouse forwarding", "forceForwarding"), "wrap");
                mouseFwContainer.add((Component)this.createCheckBox("Forward movement", "forwardMovement"), "wrap");
                if (!this.config.forwardMovement()) {
                    mouseFwContainer.add(this.createTextSection("Click location", "clickLocation", false));
                }
                mouseFwContainer.add((Component)this.createCheckBox("Always forward movement", "forceForwardMovement"), "wrap");
                mouseFwContainer.add((Component)this.createCheckBox("Forward keystrokes as clicks", "forwardKeystrokes"), "wrap");
                mouseFwContainer.add((Component)this.createCheckBox("Forward from specific monitors", "selectedMonitorsOnly"), "wrap");
                if (this.config.selectedMonitorsOnly()) {
                    mouseFwContainer.add((Component)this.createTextSection("Monitor IDs", "selectedMonitorIds", false), "wrap, grow");
                }
                mouseFwContainer.add((Component)this.createCheckBox("Forward specific mouse buttons", "selectedButtonsOnly"), "wrap");
                if (this.config.selectedButtonsOnly()) {
                    mouseFwContainer.add((Component)this.createTextSection("Button IDs", "selectedButtons", false), "wrap, grow");
                }
                mouseFwContainer.add((Component)this.createCheckBox("Forward as left click", "forwardLeftClick"), "wrap");
                this.add((Component)mouseFwContainer, "wrap");
            }
        }
        this.add((Component)this.createCheckBox("Disable manual input", "disableMouse"), "wrap");
        this.add((Component)this.createCheckBox("Never Log", "neverLog"), "wrap");
        this.revalidate();
    }
}

