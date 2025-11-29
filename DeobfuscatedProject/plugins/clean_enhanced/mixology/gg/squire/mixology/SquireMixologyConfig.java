/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Button
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.mixology;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squiremixology")
public interface SquireMixologyConfig
extends Config {
    @ConfigSection(name="General Settings", description="Settings related to your gear", position=0)
    public static final  String GENERAL_SETTINGS;

    @ConfigItem(position=4, keyName="agaHerb", name="Aga Herb", description="Pick herb to paste during minigame", section="General Settings")
    default public a agaHerb() {
        return a.CADANTINE;
    }

    @ConfigItem(position=5, keyName="lyeHerb", name="Lye Herb", description="Pick herb to paste during minigame", section="General Settings")
    default public c lyeHerb() {
        return c.AVANTOE;
    }

    @ConfigItem(position=1, keyName="pluginMode", name="Mode", description="Pick potion strategy", section="General Settings")
    default public d pluginMode() {
        return d.MINIGAME;
    }

    @ConfigItem(position=8, keyName="stopAt3000", name="Stop at paste amount", description="Stop at 3k paste made during minigame mode", section="General Settings")
    @Range(min=1, max=25000)
    default public int stopAt3000() {
        return 0xFFFFDBB8 & 0x37CF;
    }

    @ConfigItem(position=2, keyName="potionStrategy", name="Strategy", description="Pick potion strategy", section="General Settings")
    default public f potionStrategy() {
        return f.SINGLE_ORDER;
    }

    static {
        GENERAL_SETTINGS = "General Settings";
    }

    @ConfigItem(position=6, keyName="moxHerb", name="Mox Herb", description="Pick herb to paste during minigame", section="General Settings")
    default public e moxHerb() {
        return e.GUAM_LEAF;
    }

    @ConfigItem(position=5, keyName="pause", name="Pause", description="Pause execution")
    default public Button pause() {
        return new Button();
    }

    @ConfigItem(position=3, keyName="herbPaste", name="Herb Pasting", description="Pick herb to paste", section="General Settings")
    default public b herbPaste() {
        return b.GUAM_LEAF;
    }

    @ConfigItem(position=7, keyName="useStamina", name="Use Staminas", description="Use staminas?", section="General Settings")
    default public boolean useStamina() {
        return ((178 + 237 - 260 + 95 ^ 124 + 16 - -6 + 47) & (0xD3 ^ 0x99 ^ (0xC0 ^ 0xB1) ^ -1)) != 0;
    }
}

