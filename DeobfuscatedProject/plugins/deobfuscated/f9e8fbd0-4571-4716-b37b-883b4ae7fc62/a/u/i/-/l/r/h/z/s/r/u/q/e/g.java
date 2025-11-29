/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Prayer;

public final class g
extends Enum<g> {
    private static /* synthetic */ String[] lIllIlIlIIIII;
    public static final /* synthetic */ /* enum */ g MYSTIC_MIGHT;
    public static final /* synthetic */ /* enum */ g AUGURY;
    private final /* synthetic */ Prayer prayer;
    private static /* synthetic */ int[] lIllIlIlIIIIl;
    private static final /* synthetic */ g[] $VALUES;

    private static boolean llIIIllllllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIlllllIllll() {
        lIllIlIlIIIIl = new int[3];
        g.lIllIlIlIIIIl[0] = (0xA ^ 0x2D) & ~(0x25 ^ 2);
        g.lIllIlIlIIIIl[1] = 1;
        g.lIllIlIlIIIIl[2] = 2;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private static void llIIIlllllIlllI() {
        lIllIlIlIIIII = new String[lIllIlIlIIIIl[2]];
        g.lIllIlIlIIIII[g.lIllIlIlIIIIl[0]] = g."MYSTIC_MIGHT";
        g.lIllIlIlIIIII[g.lIllIlIlIIIIl[1]] = g."AUGURY";
    }

    private g(Prayer prayer) {
        this.prayer = prayer;
    }

    static {
        g.llIIIlllllIllll();
        g.llIIIlllllIlllI();
        MYSTIC_MIGHT = new g(Prayer.MYSTIC_MIGHT);
        AUGURY = new g(Prayer.AUGURY);
        g[] gArray = new g[lIllIlIlIIIIl[2]];
        gArray[g.lIllIlIlIIIIl[0]] = MYSTIC_MIGHT;
        gArray[g.lIllIlIlIIIIl[1]] = AUGURY;
        $VALUES = gArray;
    }

    private static String llIIIlllllIllIl(String llllllllllllllIllIIIlllIIllIllIl, String llllllllllllllIllIIIlllIIllIllII) {
        llllllllllllllIllIIIlllIIllIllIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlllIIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlllIIllIlIll = new StringBuilder();
        char[] llllllllllllllIllIIIlllIIllIlIlI = llllllllllllllIllIIIlllIIllIllII.toCharArray();
        int llllllllllllllIllIIIlllIIllIlIIl = lIllIlIlIIIIl[0];
        char[] llllllllllllllIllIIIlllIIllIIIll = llllllllllllllIllIIIlllIIllIllIl.toCharArray();
        int llllllllllllllIllIIIlllIIllIIIlI = llllllllllllllIllIIIlllIIllIIIll.length;
        int llllllllllllllIllIIIlllIIllIIIIl = lIllIlIlIIIIl[0];
        while (g.llIIIllllllIIII(llllllllllllllIllIIIlllIIllIIIIl, llllllllllllllIllIIIlllIIllIIIlI)) {
            char llllllllllllllIllIIIlllIIllIlllI = llllllllllllllIllIIIlllIIllIIIll[llllllllllllllIllIIIlllIIllIIIIl];
            llllllllllllllIllIIIlllIIllIlIll.append((char)(llllllllllllllIllIIIlllIIllIlllI ^ llllllllllllllIllIIIlllIIllIlIlI[llllllllllllllIllIIIlllIIllIlIIl % llllllllllllllIllIIIlllIIllIlIlI.length]));
            0;
            ++llllllllllllllIllIIIlllIIllIlIIl;
            ++llllllllllllllIllIIIlllIIllIIIIl;
            0;
            if ((0x5E ^ 0x5A) >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlllIIllIlIll);
    }

    public Prayer r() {
        return this.prayer;
    }
}

