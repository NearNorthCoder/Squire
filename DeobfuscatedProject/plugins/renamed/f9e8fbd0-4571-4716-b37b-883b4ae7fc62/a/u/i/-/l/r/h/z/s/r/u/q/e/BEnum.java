/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.widgets.Dialog
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.widgets.Dialog;

public final class BEnum
extends Enum<b> {
    private static /* synthetic */ String[] lIllIlllIllll;
    public static final /* synthetic */ /* enum */ b RING_OF_DUELING;
    private static /* synthetic */ int[] lIllIllllIlII;
    private final /* synthetic */ Consumer<Item> action;
    public static final /* synthetic */ /* enum */ b CONSTRUCTION_CAPE;
    private static final /* synthetic */ b[] $VALUES;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ b HOUSE_TELEPORT;

    private b(String string2, Consumer<Item> consumer) {
        this.name = string2;
        this.action = consumer;
    }

    private static String llIIlIIllIllIIl(String var17, String var10) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIllIllllIlII[2], var19);
            return new String(var1.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlllIIlll(int n2) {
        return n2 == 0;
    }

    private static String llIIlIIllIlIlll(String var5, String var14) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIllIllllIlII[8]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIllIllllIlII[2], var11);
            return new String(var3.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void llIIlIIlllIIlIl() {
        lIllIllllIlII = new int[11];
        b.lIllIllllIlII[0] = (0xB9 ^ 0xA6 ^ (0x47 ^ 0xD)) & (112 + 9 - 35 + 59 ^ 186 + 52 - 117 + 75 ^ -1);
        b.lIllIllllIlII[1] = 1;
        b.lIllIllllIlII[2] = 2;
        b.lIllIllllIlII[3] = 3;
        b.lIllIllllIlII[4] = 125 + 32 - 18 + 6 ^ 67 + 111 - 92 + 63;
        b.lIllIllllIlII[5] = 0x12 ^ 0x17;
        b.lIllIllllIlII[6] = 0x6B ^ 0x12 ^ 33 + 63 - -19 + 12;
        b.lIllIllllIlII[7] = 0x46 ^ 0x34 ^ (0x70 ^ 5);
        b.lIllIllllIlII[8] = 0xF ^ 7;
        b.lIllIllllIlII[9] = 0x58 ^ 0x51;
        b.lIllIllllIlII[10] = 0x7E ^ 0x74;
    }

    private static String llIIlIIllIllIII(String var12, String var8) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var7 = var8.toCharArray();
        int var18 = lIllIllllIlII[0];
        char[] var6 = var12.toCharArray();
        int var16 = var6.length;
        int var2 = lIllIllllIlII[0];
        while (b.llIIlIIlllIlIII(var2, var16)) {
            char var4 = var6[var2];
            var13.append((char)(var4 ^ var7[var18 % var7.length]));
            0;
            ++var18;
            ++var2;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    static {
        b.llIIlIIlllIIlIl();
        b.llIIlIIllIlllIl();
        RING_OF_DUELING = new b(lIllIlllIllll[lIllIllllIlII[5]], item -> {
            if (b.llIIlIIlllIIllI(Dialog.isViewingOptions() ? 1 : 0) && b.llIIlIIlllIIlll(Dialog.hasOption((String)lIllIlllIllll[lIllIllllIlII[2]]) ? 1 : 0)) {
                Dialog.chooseOption((int)lIllIllllIlII[3]);
                0;
                return;
            }
            item.interact(lIllIlllIllll[lIllIllllIlII[3]]);
        });
        HOUSE_TELEPORT = new b(lIllIlllIllll[lIllIllllIlII[7]], item -> item.interact(lIllIlllIllll[lIllIllllIlII[1]]));
        CONSTRUCTION_CAPE = new b(lIllIlllIllll[lIllIllllIlII[9]], item -> item.interact(lIllIlllIllll[lIllIllllIlII[0]]));
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
        b.lIllIlllIllll[b.lIllIllllIlII[0]] = b."Tele to POH";
        b.lIllIlllIllll[b.lIllIllllIlII[1]] = b."Break";
        b.lIllIlllIllll[b.lIllIllllIlII[2]] = b."Yes";
        b.lIllIlllIllll[b.lIllIllllIlII[3]] = b."Rub";
        b.lIllIlllIllll[b.lIllIllllIlII[4]] = b."RING_OF_DUELING";
        b.lIllIlllIllll[b.lIllIllllIlII[5]] = b."Ring of dueling";
        b.lIllIlllIllll[b.lIllIllllIlII[6]] = b."HOUSE_TELEPORT";
        b.lIllIlllIllll[b.lIllIllllIlII[7]] = b."Teleport to house";
        b.lIllIlllIllll[b.lIllIllllIlII[8]] = b."CONSTRUCTION_CAPE";
        b.lIllIlllIllll[b.lIllIllllIlII[9]] = b."Construct";
    }

    public Consumer<Item> l() {
        return this.action;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }
}

