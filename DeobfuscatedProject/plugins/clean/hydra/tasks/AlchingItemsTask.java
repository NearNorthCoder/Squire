/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.hydra.tasks;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.hydra.tasks.AHelper;

@TaskDesc(name="Alching items", priority=15, blocking=true)
public class AlchingItemsTask
extends Task {
    private final  a aV;
    public static final  ImmutableSet<String> aU;

    private static boolean lIIlIIIIlIIlIll(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIIlIIlIII() {
        llllIlIIIlll = new String[llllIlIIlIII[8]];
        y.llllIlIIIlll[y.llllIlIIlIII[0]] = "Open";
        y.llllIlIIIlll[y.llllIlIIlIII[2]] = " staff";
        y.llllIlIIIlll[y.llllIlIIlIII[3]] = "d'hide";
        y.llllIlIIIlll[y.llllIlIIlIII[4]] = "longsword";
        y.llllIlIIIlll[y.llllIlIIlIII[5]] = "med helm";
        y.llllIlIIIlll[y.llllIlIIlIII[1]] = "Rune ";
        y.llllIlIIIlll[y.llllIlIIlIII[6]] = "battleaxe";
        y.llllIlIIIlll[y.llllIlIIlIII[7]] = "Mystic";
    }

    static {
        y.lIIlIIIIlIIlIIl();
        y.lIIlIIIIlIIlIII();
        Object[] objectArray = new String[llllIlIIlIII[2]];
        objectArray[y.llllIlIIlIII[0]] = llllIlIIIlll[llllIlIIlIII[7]];
        aU = ImmutableSet.of((Object)llllIlIIIlll[llllIlIIlIII[2]], (Object)llllIlIIIlll[llllIlIIlIII[3]], (Object)llllIlIIIlll[llllIlIIlIII[4]], (Object)llllIlIIIlll[llllIlIIlIII[5]], (Object)llllIlIIIlll[llllIlIIlIII[1]], (Object)llllIlIIIlll[llllIlIIlIII[6]], (Object[])objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        void var2_2;
        SpellBook spellBook = SpellBook.getCurrent();
        if (y.lIIlIIIIlIIlIlI(spellBook, SpellBook.STANDARD)) {
            return llllIlIIlIII[0];
        }
        SpellBook.Standard var1 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (y.lIIlIIIIlIIlIll(var1.canCast() ? 1 : 0)) {
            return llllIlIIlIII[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llllIlIIlIII[2]];
            stringArray[y.llllIlIIlIII[0]] = llllIlIIIlll[llllIlIIlIII[0]];
            if (y.lIIlIIIIlIIlIll(item.hasAction(stringArray) ? 1 : 0)) {
                Stream stream = aU.stream();
                String string = item.getName();
                Objects.requireNonNull(string);

                if (y.lIIlIIIIlIIllIl(stream.anyMatch(string::contains) ? 1 : 0)) {
                    n2 = llllIlIIlIII[2];

                    if (((0xA6 ^ 0x9B ^ (0x56 ^ 0x36)) & (75 + 201 - 261 + 228 ^ 83 + 32 - 64 + 123 ^ -1)) == ((23 + 16 - -107 + 10 ^ 110 + 69 - 102 + 54) & (0xB5 ^ 0x82 ^ (0xF ^ 0x27) ^ -1))) return n2 != 0;
                    return ((111 + 19 - 10 + 7 ^ (0xA4 ^ 0x91)) & (0x68 ^ 0x7A ^ (0x59 ^ 1) ^ -1)) != 0;
                }
            }
            n2 = llllIlIIlIII[0];
            return n2 != 0;
        });
        if (y.lIIlIIIIlIIllII(var2)) {
            return llllIlIIlIII[0];
        }
        Magic.cast((Spell)var2_2, (Item)var3_3);
        this.sleep(llllIlIIlIII[1]);
        return llllIlIIlIII[2];
    }

        return String.valueOf(var3);
    }

    private static boolean lIIlIIIIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIlIIllII(Object object) {
        return object == null;
    }

    @Inject
    public AlchingItemsTask(a a2) {
        this.aV = a2;
    }

    private static boolean lIIlIIIIlIIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIIlIIlIlI(Object object, Object object2) {
        return object != object2;
    }
}

