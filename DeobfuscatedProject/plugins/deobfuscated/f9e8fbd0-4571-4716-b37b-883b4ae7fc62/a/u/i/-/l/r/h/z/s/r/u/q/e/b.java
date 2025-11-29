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

public final class b
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

    private static String llIIlIIllIllIIl(String llllllllllllllIllIIIlIIIIlIIIlll, String llllllllllllllIllIIIlIIIIlIIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIIIIlIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIIIIlIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIIIIlIIlIll.init(lIllIllllIlII[2], llllllllllllllIllIIIlIIIIlIIllII);
            return new String(llllllllllllllIllIIIlIIIIlIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIIIIlIIlIlI) {
            llllllllllllllIllIIIlIIIIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlllIIlll(int n2) {
        return n2 == 0;
    }

    private static String llIIlIIllIlIlll(String llllllllllllllIllIIIlIIIIIllllII, String llllllllllllllIllIIIlIIIIIlllIll) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIIIIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIIIIlllIll.getBytes(StandardCharsets.UTF_8)), lIllIllllIlII[8]), "DES");
            Cipher llllllllllllllIllIIIlIIIIIlllllI = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIIIIIlllllI.init(lIllIllllIlII[2], llllllllllllllIllIIIlIIIIIllllll);
            return new String(llllllllllllllIllIIIlIIIIIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIIIIIllllIl) {
            llllllllllllllIllIIIlIIIIIllllIl.printStackTrace();
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

    private static String llIIlIIllIllIII(String llllllllllllllIllIIIlIIIIlIllIIl, String llllllllllllllIllIIIlIIIIlIllIII) {
        llllllllllllllIllIIIlIIIIlIllIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIIIIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlIIIIlIlllII = new StringBuilder();
        char[] llllllllllllllIllIIIlIIIIlIllIll = llllllllllllllIllIIIlIIIIlIllIII.toCharArray();
        int llllllllllllllIllIIIlIIIIlIllIlI = lIllIllllIlII[0];
        char[] llllllllllllllIllIIIlIIIIlIlIlII = llllllllllllllIllIIIlIIIIlIllIIl.toCharArray();
        int llllllllllllllIllIIIlIIIIlIlIIll = llllllllllllllIllIIIlIIIIlIlIlII.length;
        int llllllllllllllIllIIIlIIIIlIlIIlI = lIllIllllIlII[0];
        while (b.llIIlIIlllIlIII(llllllllllllllIllIIIlIIIIlIlIIlI, llllllllllllllIllIIIlIIIIlIlIIll)) {
            char llllllllllllllIllIIIlIIIIlIlllll = llllllllllllllIllIIIlIIIIlIlIlII[llllllllllllllIllIIIlIIIIlIlIIlI];
            llllllllllllllIllIIIlIIIIlIlllII.append((char)(llllllllllllllIllIIIlIIIIlIlllll ^ llllllllllllllIllIIIlIIIIlIllIll[llllllllllllllIllIIIlIIIIlIllIlI % llllllllllllllIllIIIlIIIIlIllIll.length]));
            0;
            ++llllllllllllllIllIIIlIIIIlIllIlI;
            ++llllllllllllllIllIIIlIIIIlIlIIlI;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlIIIIlIlllII);
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

