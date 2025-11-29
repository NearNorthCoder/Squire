/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.runecrafting;

import g.r.r.-.t.q.i.u.o.e.s.d;
import java.util.Set;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squiresandstone")
public interface SquireGOTRConfig
extends Config {
    @ConfigSection(name="Rune Settings", description="Settings for which runes to craft", position=30)
    public static final /* synthetic */ String RUNE_SETTINGS;
    @ConfigSection(name="Game Settings", description="Settings for in the minigame", position=2)
    public static final /* synthetic */ String IN_GAME;
    @ConfigSection(name="Extra Settings", description="Other settings related to overlays and helper mode", position=50)
    public static final /* synthetic */ String EXTRA_SETTINGS;

    @ConfigItem(keyName="repairPouches", name="Repair Pouches", description="Do you want to repair pouches (lunars/pearls)?", position=25, section="In Game")
    default public boolean repairPouches() {
        return false;
    }

    @ConfigItem(keyName="highlightTarget", name="Highlight targets", description="Enables highlighting targets to aid with helper mode.", position=53, section="Extra Settings")
    default public boolean highlightTarget() {
        return ((0x9A ^ 0xA1 ^ (0x45 ^ 0x6E)) & (80 + 93 - 50 + 27 ^ 46 + 26 - 57 + 119 ^ -1)) != 0;
    }

    @ConfigItem(keyName="craftGuardian", name="Create Guardians", description="Do you want the plugin to create guardians (requires chisel)", position=21, section="In Game")
    default public boolean craftGuardian() {
        return ((0xC3 ^ 0xA3 ^ (0x8D ^ 0xA3)) & (165 + 24 - -6 + 58 ^ 30 + 168 - 34 + 15 ^ -1)) != 0;
    }

    @ConfigItem(keyName="depositRunes", name="Deposit Runes", description="Disables depositing runes for UIM.", position=50, section="Extra Settings")
    default public boolean depositRunes() {
        return 1 != 0;
    }

    @ConfigItem(keyName="focusStrongCell", name="Prioritize strong runes", description="Do you want the plugin to prioritize making the strongest cell type no matter your points?", position=24, section="In Game")
    default public boolean focusStrong() {
        return 1 != 0;
    }

    @ConfigItem(keyName="repairPouchesPearls", name="Use pearls", description="Do you want to use pearls for repairing pouches", position=25, section="In Game", hidden=true, unhide="repairPouches", unhideValue="true")
    default public boolean usePearls() {
        return ((69 + 93 - 159 + 153 ^ 15 + 14 - -93 + 15) & (0xFB ^ 0xB6 ^ (0x70 ^ 0x28) ^ -1)) != 0;
    }

    @ConfigItem(keyName="runeTypes", name="Rune Types", description="What rune types to aim for/prioritize", position=31, section="Rune Settings")
    default public Set<d> runeTypes() {
        return Set.of();
    }

    @ConfigItem(keyName="balancePoints", name="Balance Reward Points", description="Should the plugin try to balance your total reward points?", position=23, section="In Game")
    default public boolean balancePoints() {
        return 1 != 0;
    }

    @ConfigItem(keyName="fragmentCount", name="Starting Fragments", description="How many fragments do you want to start out with", position=20, section="In Game")
    @Range(min=35, max=260)
    default public int fragmentAmount() {
        return 76 + 5 - -47 + 12;
    }

    @ConfigItem(keyName="useTalisman", name="Use Talisman", description="Should the plugin use the talismans it gets (make sure you toggle the bad ones)!", position=22, section="In Game")
    default public boolean useTalisman() {
        return 1 != 0;
    }

    @ConfigItem(keyName="helperMode", name="Helper Mode", description="Disables full-automation and helps with pouches, depositing and entering portals.", position=51, section="Extra Settings")
    default public boolean helperMode() {
        return ((0xF1 ^ 0x94 ^ (1 ^ 0x72)) & (0x40 ^ 0x34 ^ (0x62 ^ 0) ^ -1)) != 0;
    }

    static {
        IN_GAME = "In Game";
        EXTRA_SETTINGS = "Extra Settings";
        RUNE_SETTINGS = "Rune Settings";
    }
}

