/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.d;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.f;

public final class c
extends Enum<c> {
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ String[] lIlIIIIIIllll;
    public static final /* synthetic */ /* enum */ c BOLOGANO;
    public static final /* synthetic */ /* enum */ c GOLOVANOVA;
    public static final /* synthetic */ /* enum */ c BEST_OPTION;
    private static /* synthetic */ int[] lIlIIIIIlIIIl;
    public static final /* synthetic */ /* enum */ c LOGAVANO;

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void lIllIllIllIllII() {
        lIlIIIIIlIIIl = new int[9];
        c.lIlIIIIIlIIIl[0] = 0x52 ^ 0x18;
        c.lIlIIIIIlIIIl[1] = 124 + 111 - 141 + 38 ^ 59 + 131 - 123 + 111;
        c.lIlIIIIIlIIIl[2] = (0x30 ^ 0x1C ^ (0x7B ^ 0x13)) & (0x3D ^ 0x31 ^ (0xC1 ^ 0x89) ^ -" ".length());
        c.lIlIIIIIlIIIl[3] = " ".length();
        c.lIlIIIIIlIIIl[4] = "  ".length();
        c.lIlIIIIIlIIIl[5] = "   ".length();
        c.lIlIIIIIlIIIl[6] = 0x9B ^ 0x9F;
        c.lIlIIIIIlIIIl[7] = 0x1F ^ 0x1A;
        c.lIlIIIIIlIIIl[8] = 0x5F ^ 0x5A ^ (0x79 ^ 0x74);
    }

    private static void lIllIllIllIlIll() {
        lIlIIIIIIllll = new String[lIlIIIIIlIIIl[7]];
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[2]] = c.lIllIllIlIlllll("xyqN5CJUY8t/bV/C86GzBvfyzgH7JMLjFIDpHbdPND4=", "VazWn");
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[3]] = c.lIllIllIllIlIIl("CCwrGz0OLSgCKg==", "OcgTk");
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[4]] = c.lIllIllIllIlIIl("FxoZIi4UGxo=", "UUUmi");
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[5]] = c.lIllIllIllIlIlI("3FVW3OGb5dGuEsdkdjignw==", "DiMkM");
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[6]] = c.lIllIllIlIlllll("w7xN2fpr1VxONv5JZ0Kr2A==", "JQexE");
    }

    private static String lIllIllIlIlllll(String llllllllllllllIlllIIlIIIllIIllII, String llllllllllllllIlllIIlIIIllIIlIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIIllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIIIllIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIIIllIIlllI.init(lIlIIIIIlIIIl[4], llllllllllllllIlllIIlIIIllIIllll);
            return new String(llllllllllllllIlllIIlIIIllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIIIllIIllIl) {
            llllllllllllllIlllIIlIIIllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIllIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIllIlllI(Object object) {
        return object == null;
    }

    private static boolean lIllIllIllIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    public f i() {
        switch (d.n[this.ordinal()]) {
            case 1: {
                return f.GOLOVANOVA;
            }
            case 2: {
                return f.BOLOGANO;
            }
            case 3: {
                return f.LOGAVANO;
            }
            case 4: {
                int llllllllllllllIlllIIlIIIllIlllII = Skills.getLevel((Skill)Skill.FARMING);
                if (c.lIllIllIllIllIl(llllllllllllllIlllIIlIIIllIlllII, lIlIIIIIlIIIl[0])) {
                    return f.LOGAVANO;
                }
                if (c.lIllIllIllIllIl(llllllllllllllIlllIIlIIIllIlllII, lIlIIIIIlIIIl[1])) {
                    return f.BOLOGANO;
                }
                return f.GOLOVANOVA;
            }
        }
        return null;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static String lIllIllIllIlIIl(String llllllllllllllIlllIIlIIIlIllIlll, String llllllllllllllIlllIIlIIIlIllIllI) {
        llllllllllllllIlllIIlIIIlIllIlll = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIlIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIIIlIlllIlI = new StringBuilder();
        char[] llllllllllllllIlllIIlIIIlIlllIIl = llllllllllllllIlllIIlIIIlIllIllI.toCharArray();
        int llllllllllllllIlllIIlIIIlIlllIII = lIlIIIIIlIIIl[2];
        char[] llllllllllllllIlllIIlIIIlIllIIlI = llllllllllllllIlllIIlIIIlIllIlll.toCharArray();
        int llllllllllllllIlllIIlIIIlIllIIIl = llllllllllllllIlllIIlIIIlIllIIlI.length;
        int llllllllllllllIlllIIlIIIlIllIIII = lIlIIIIIlIIIl[2];
        while (c.lIllIllIlllIIII(llllllllllllllIlllIIlIIIlIllIIII, llllllllllllllIlllIIlIIIlIllIIIl)) {
            char llllllllllllllIlllIIlIIIlIllllIl = llllllllllllllIlllIIlIIIlIllIIlI[llllllllllllllIlllIIlIIIlIllIIII];
            llllllllllllllIlllIIlIIIlIlllIlI.append((char)(llllllllllllllIlllIIlIIIlIllllIl ^ llllllllllllllIlllIIlIIIlIlllIIl[llllllllllllllIlllIIlIIIlIlllIII % llllllllllllllIlllIIlIIIlIlllIIl.length]));
            "".length();
            ++llllllllllllllIlllIIlIIIlIlllIII;
            ++llllllllllllllIlllIIlIIIlIllIIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlIIIlIlllIlI);
    }

    private static String lIllIllIllIlIlI(String llllllllllllllIlllIIlIIIlIlIIlll, String llllllllllllllIlllIIlIIIlIlIIlII) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIIlIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIlIlIIlII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIIIl[8]), "DES");
            Cipher llllllllllllllIlllIIlIIIlIlIlIIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIIIlIlIlIIl.init(lIlIIIIIlIIIl[4], llllllllllllllIlllIIlIIIlIlIlIlI);
            return new String(llllllllllllllIlllIIlIIIlIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIIIlIlIlIII) {
            llllllllllllllIlllIIlIIIlIlIlIII.printStackTrace();
            return null;
        }
    }

    static {
        c.lIllIllIllIllII();
        c.lIllIllIllIlIll();
        GOLOVANOVA = new c();
        BOLOGANO = new c();
        LOGAVANO = new c();
        BEST_OPTION = new c();
        c[] cArray = new c[lIlIIIIIlIIIl[6]];
        cArray[c.lIlIIIIIlIIIl[2]] = GOLOVANOVA;
        cArray[c.lIlIIIIIlIIIl[3]] = BOLOGANO;
        cArray[c.lIlIIIIIlIIIl[4]] = LOGAVANO;
        cArray[c.lIlIIIIIlIIIl[5]] = BEST_OPTION;
        $VALUES = cArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Item item) {
        boolean bl;
        void llllllllllllllIlllIIlIIIllIlIllI;
        void llllllllllllllIlllIIlIIIllIlIlIl;
        f f2 = this.i();
        if (c.lIllIllIllIlllI((Object)f2)) {
            Object[] objectArray = new Object[lIlIIIIIlIIIl[3]];
            objectArray[c.lIlIIIIIlIIIl[2]] = this;
            Log.info((String)lIlIIIIIIllll[lIlIIIIIlIIIl[2]], (Object[])objectArray);
            return lIlIIIIIlIIIl[2];
        }
        String llllllllllllllIlllIIlIIIllIlIlII = llllllllllllllIlllIIlIIIllIlIlIl.j();
        if (c.lIllIllIllIllll(llllllllllllllIlllIIlIIIllIlIllI.getName().contains(llllllllllllllIlllIIlIIIllIlIlII) ? 1 : 0)) {
            bl = lIlIIIIIlIIIl[3];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0xAB ^ 0xC5 ^ (0x7E ^ 0x3E)) & (88 + 8 - 55 + 124 ^ 108 + 39 - 53 + 45 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlIIIIIlIIIl[2];
        }
        return bl;
    }

    private static boolean lIllIllIlllIIII(int n2, int n3) {
        return n2 < n3;
    }
}

