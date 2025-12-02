/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  net.runelite.api.Item
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.unethicalite.api.magic;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Rune;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunePouch {
    private static final Logger log = LoggerFactory.getLogger(RunePouch.class);
    private static final int SLOT_1_TYPE_BIT = 29;
    private static final int SLOT_1_QUANTITY_BIT = 1624;
    private static final int SLOT_2_TYPE_BIT = 1622;
    private static final int SLOT_2_QUANTITY_BIT = 1625;
    private static final int SLOT_3_TYPE_BIT = 1623;
    private static final int SLOT_3_QUANTITY_BIT = 1626;
    private static final int SLOT_4_TYPE_BIT = 14285;
    private static final int SLOT_4_QUANTITY_BIT = 14286;

    public static boolean hasPouch() {
        Predicate<Item> runePouchPredicate = i -> i.getName().toLowerCase().contains("rune pouch") && !i.getName().toLowerCase().contains("note");
        return Inventory.getFirst(runePouchPredicate) != null;
    }

    public static int getQuantity(Rune rune) {
        if (!RunePouch.hasPouch()) {
            return 0;
        }
        RuneSlot[] slots = RuneSlot.values();
        int amount = Inventory.getFirst("Rune pouch") == null ? 4 : 3;
        for (int i = 0; i < amount; ++i) {
            RuneSlot slot = slots[i];
            if (slot.getRuneName() == null || !Arrays.stream(rune.getRuneNames()).anyMatch(name -> slot.getRuneName().startsWith((String)name))) continue;
            return slot.getQuantity();
        }
        return 0;
    }

    public static int getQuantity(Rune rune, boolean strictTypeMatching) {
        if (!strictTypeMatching) {
            return RunePouch.getQuantity(rune);
        }
        if (!RunePouch.hasPouch()) {
            return 0;
        }
        RuneSlot[] slots = RuneSlot.values();
        int amount = Inventory.getFirst("Rune pouch") == null ? 4 : 3;
        for (int i = 0; i < amount; ++i) {
            RuneSlot slot = slots[i];
            if (slot.getRuneName() == null || !slot.getRuneName().startsWith(rune.getRuneNames()[0])) continue;
            return slot.getQuantity();
        }
        return 0;
    }

    public static enum RuneSlot {
        FIRST(29, 1624),
        SECOND(1622, 1625),
        THIRD(1623, 1626),
        FOURTH(14285, 14286);

        private final int type;
        private final int quantityVarbitIdx;
        private final LoadingCache<Integer, Integer> VARBIT_CACHE = CacheBuilder.newBuilder().expireAfterWrite(1L, TimeUnit.SECONDS).build((CacheLoader)new CacheLoader<Integer, Integer>(){

            public Integer load(@NotNull Integer type) {
                return Vars.getBit(type);
            }
        });

        private RuneSlot(int type, int quantityVarbitIdx) {
            this.type = type;
            this.quantityVarbitIdx = quantityVarbitIdx;
        }

        public int getType() {
            return this.type;
        }

        public int getQuantityVarbitIdx() {
            return this.quantityVarbitIdx;
        }

        public int getVarbit() {
            try {
                return (Integer)this.VARBIT_CACHE.get((Object)this.type);
            }
            catch (ExecutionException e) {
                log.error("Failed to get cached varbit", (Throwable)e);
                return 0;
            }
        }

        public String getRuneName() {
            switch (this.getVarbit()) {
                case 1: {
                    return "Air rune";
                }
                case 2: {
                    return "Water rune";
                }
                case 3: {
                    return "Earth rune";
                }
                case 4: {
                    return "Fire rune";
                }
                case 5: {
                    return "Mind rune";
                }
                case 6: {
                    return "Chaos rune";
                }
                case 7: {
                    return "Death rune";
                }
                case 8: {
                    return "Blood rune";
                }
                case 9: {
                    return "Cosmic rune";
                }
                case 10: {
                    return "Nature rune";
                }
                case 11: {
                    return "Law rune";
                }
                case 12: {
                    return "Body rune";
                }
                case 13: {
                    return "Soul rune";
                }
                case 14: {
                    return "Astral rune";
                }
                case 15: {
                    return "Mist rune";
                }
                case 16: {
                    return "Mud rune";
                }
                case 17: {
                    return "Dust rune";
                }
                case 18: {
                    return "Lava rune";
                }
                case 19: {
                    return "Steam rune";
                }
                case 20: {
                    return "Smoke rune";
                }
                case 21: {
                    return "Wrath rune";
                }
            }
            return null;
        }

        public int getQuantity() {
            return Vars.getBit(this.quantityVarbitIdx);
        }
    }
}
