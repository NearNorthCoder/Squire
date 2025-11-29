package gg.squire.runecrafting;

import g.r.r.p000.t.q.i.u.o.e.s.d;
import java.util.Set;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
@ConfigGroup("squiresandstone")
/* loaded from: squire-gotr-0.4.1.jar:gg/squire/runecrafting/SquireGOTRConfig.class */
public interface SquireGOTRConfig extends Config {
    @ConfigSection(name = "Game Settings", description = "Settings for in the minigame", position = 2)
    public static final /* synthetic */ String IN_GAME = "In Game";
    @ConfigSection(name = "Extra Settings", description = "Other settings related to overlays and helper mode", position = 50)
    public static final /* synthetic */ String EXTRA_SETTINGS = "Extra Settings";
    @ConfigSection(name = "Rune Settings", description = "Settings for which runes to craft", position = 30)
    public static final /* synthetic */ String RUNE_SETTINGS = "Rune Settings";

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "repairPouches", name = "Repair Pouches", description = "Do you want to repair pouches (lunars/pearls)?", position = 25, section = "In Game")
    default boolean repairPouches() {
        return ((113 ^ 88) ^ (((56 + 13) - 39) + 97)) & (((((190 + 177) - 173) + 26) ^ (((84 + 123) - 90) + 21)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "highlightTarget", name = "Highlight targets", description = "Enables highlighting targets to aid with helper mode.", position = 53, section = "Extra Settings")
    default boolean highlightTarget() {
        return ((154 ^ 161) ^ (69 ^ 110)) & (((((80 + 93) - 50) + 27) ^ (((46 + 26) - 57) + 119)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "craftGuardian", name = "Create Guardians", description = "Do you want the plugin to create guardians (requires chisel)", position = 21, section = "In Game")
    default boolean craftGuardian() {
        return ((195 ^ 163) ^ (141 ^ 163)) & (((((165 + 24) - (-6)) + 58) ^ (((30 + 168) - 34) + 15)) ^ (-" ".length()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "depositRunes", name = "Deposit Runes", description = "Disables depositing runes for UIM.", position = 50, section = "Extra Settings")
    default boolean depositRunes() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "focusStrongCell", name = "Prioritize strong runes", description = "Do you want the plugin to prioritize making the strongest cell type no matter your points?", position = 24, section = "In Game")
    default boolean focusStrong() {
        return " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "repairPouchesPearls", name = "Use pearls", description = "Do you want to use pearls for repairing pouches", position = 25, section = "In Game", hidden = true, unhide = "repairPouches", unhideValue = "true")
    default boolean usePearls() {
        return ((((69 + 93) - 159) + 153) ^ (((15 + 14) - (-93)) + 15)) & (((251 ^ 182) ^ (112 ^ 40)) ^ (-" ".length()));
    }

    @ConfigItem(keyName = "runeTypes", name = "Rune Types", description = "What rune types to aim for/prioritize", position = 31, section = "Rune Settings")
    default Set<d> runeTypes() {
        return Set.of();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "balancePoints", name = "Balance Reward Points", description = "Should the plugin try to balance your total reward points?", position = 23, section = "In Game")
    default boolean balancePoints() {
        return " ".length();
    }

    @ConfigItem(keyName = "fragmentCount", name = "Starting Fragments", description = "How many fragments do you want to start out with", position = 20, section = "In Game")
    @Range(min = 35, max = 260)
    default int fragmentAmount() {
        return ((76 + 5) - (-47)) + 12;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "useTalisman", name = "Use Talisman", description = "Should the plugin use the talismans it gets (make sure you toggle the bad ones)!", position = 22, section = "In Game")
    default boolean useTalisman() {
        return " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "helperMode", name = "Helper Mode", description = "Disables full-automation and helps with pouches, depositing and entering portals.", position = 51, section = "Extra Settings")
    default boolean helperMode() {
        return ((241 ^ 148) ^ (1 ^ 114)) & (((64 ^ 52) ^ (98 ^ 0)) ^ (-" ".length()));
    }
}
