/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.leagues.cooking;

import java.awt.Label;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="leaguesminer")
public interface TickCookerconfig
extends Config {
    @ConfigItem(keyName="note", name="Will note food with 'eat' action when 15 or more in inventory", description="Must have banker note in inventory", position=3)
    default public Label text4() {
        return null;
    }

    @ConfigItem(keyName="note", name="Must have banker note in inv", description="Must have banker note in inventory", position=0)
    default public Label text() {
        return null;
    }

    @ConfigItem(keyName="note", name=" Put noted food in first inv slot", description="Must have banker note in inventory", position=1)
    default public Label text2() {
        return null;
    }

    @ConfigItem(keyName="note", name="Will auto note burnt food", description="Must have banker note in inventory", position=2)
    default public Label text3() {
        return null;
    }
}

