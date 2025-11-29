/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.zulrah.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.widgets.Dialog;

public final class GameEnum21
extends Enum<b> {
    
    public static final  /* enum */ b RING_OF_DUELING;
    
    private final  Consumer<Item> action;
    public static final  /* enum */ b CONSTRUCTION_CAPE;
    private static final  b[] $VALUES;
    private final  String name;
    public static final  /* enum */ b HOUSE_TELEPORT;

    private GameEnum21(String string2, Consumer<Item> consumer) {
        this.name = string2;
        this.action = consumer;
    }

    private static boolean llIIlIIlllIIlll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    static {
        b.llIIlIIlllIIlIl();
        b.llIIlIIllIlllIl();
        RING_OF_DUELING = new GameEnum21(lIllIlllIllll[lIllIllllIlII[5]], item -> {
            if (b.llIIlIIlllIIllI(Dialog.isViewingOptions() ? 1 : 0) && b.llIIlIIlllIIlll(Dialog.hasOption((String)lIllIlllIllll[lIllIllllIlII[2]]) ? 1 : 0)) {
                Dialog.chooseOption((int)lIllIllllIlII[3]);

                return;
            }
            item.interact(lIllIlllIllll[lIllIllllIlII[3]]);
        });
        HOUSE_TELEPORT = new GameEnum21(lIllIlllIllll[lIllIllllIlII[7]], item -> item.interact(lIllIlllIllll[lIllIllllIlII[1]]));
        CONSTRUCTION_CAPE = new GameEnum21(lIllIlllIllll[lIllIllllIlII[9]], item -> item.interact(lIllIlllIllll[lIllIllllIlII[0]]));
        b[] bArray = new b[lIllIllllIlII[3]];
        bArray[b.lIllIllllIlII[0]] = RING_OF_DUELING;
        bArray[b.lIllIllllIlII[1]] = HOUSE_TELEPORT;
        bArray[b.lIllIllllIlII[2]] = CONSTRUCTION_CAPE;
        $VALUES = bArray;
    }

    private static boolean llIIlIIlllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIlllIIllI(int n2) {
        return n2 != 0;
    }

    public String k() {
        return this.name;
    }

    private static void llIIlIIllIlllIl() {
        lIllIlllIllll = new String[lIllIllllIlII[10]];
        b.lIllIlllIllll[b.lIllIllllIlII[0]] = "Tele to POH";
        b.lIllIlllIllll[b.lIllIllllIlII[1]] = "Break";
        b.lIllIlllIllll[b.lIllIllllIlII[2]] = "Yes";
        b.lIllIlllIllll[b.lIllIllllIlII[3]] = "Rub";
        b.lIllIlllIllll[b.lIllIllllIlII[4]] = "RING_OF_DUELING";
        b.lIllIlllIllll[b.lIllIllllIlII[5]] = "Ring of dueling";
        b.lIllIlllIllll[b.lIllIllllIlII[6]] = "HOUSE_TELEPORT";
        b.lIllIlllIllll[b.lIllIllllIlII[7]] = "Teleport to house";
        b.lIllIlllIllll[b.lIllIllllIlII[8]] = "CONSTRUCTION_CAPE";
        b.lIllIlllIllll[b.lIllIllllIlII[9]] = "Construct";
    }

    public Consumer<Item> l() {
        return this.action;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum21.class, string);
    }
}

