/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;

public final class AMEnum
extends Enum<am> {
    private static final /* synthetic */ am[] $VALUES;
    private static /* synthetic */ String[] llIllllIl;
    public static final /* synthetic */ /* enum */ am ECTOFUNTUS;
    private static /* synthetic */ int[] llIlllllI;
    public static final /* synthetic */ /* enum */ am SLIME_COLLECTION;
    private final /* synthetic */ WorldArea area;
    public static final /* synthetic */ /* enum */ am ECTO_UPSTAIRS;

    public WorldArea bp() {
        return this.area;
    }

    private static void llIIIIIIIlI() {
        llIllllIl = new String[llIlllllI[11]];
        am.llIllllIl[am.llIlllllI[0]] = am."ECTOFUNTUS";
        am.llIllllIl[am.llIlllllI[5]] = am."ECTO_UPSTAIRS";
        am.llIllllIl[am.llIlllllI[6]] = am."SLIME_COLLECTION";
    }

    public static am[] values() {
        return (am[])$VALUES.clone();
    }

    private am(WorldArea worldArea) {
        this.area = worldArea;
    }

    static {
        am.llIIIIIIIll();
        am.llIIIIIIIlI();
        ECTOFUNTUS = new am(new WorldArea(llIlllllI[1], llIlllllI[2], llIlllllI[3], llIlllllI[4], llIlllllI[0]));
        ECTO_UPSTAIRS = new am(new WorldArea(llIlllllI[1], llIlllllI[2], llIlllllI[3], llIlllllI[4], llIlllllI[5]));
        SLIME_COLLECTION = new am(new WorldArea(llIlllllI[7], llIlllllI[8], llIlllllI[9], llIlllllI[10], llIlllllI[0]));
        am[] amArray = new am[llIlllllI[11]];
        amArray[am.llIlllllI[0]] = ECTOFUNTUS;
        amArray[am.llIlllllI[5]] = ECTO_UPSTAIRS;
        amArray[am.llIlllllI[6]] = SLIME_COLLECTION;
        $VALUES = amArray;
    }

    private static void llIIIIIIIll() {
        llIlllllI = new int[12];
        am.llIlllllI[0] = (0x21 ^ 0x15 ^ (0xEC ^ 0xC6)) & (151 + 47 - 144 + 106 ^ 178 + 125 - 126 + 13 ^ -1);
        am.llIlllllI[1] = 0xFFFFFEFF & 0xF42;
        am.llIlllllI[2] = -(0xFFFFDC65 & 0x739B) & (0xFFFFDFBF & 0x7DF7);
        am.llIlllllI[3] = 0x6D ^ 0x61 ^ (0x5D ^ 0x42);
        am.llIlllllI[4] = 0x3D ^ 0x2F;
        am.llIlllllI[5] = 1;
        am.llIlllllI[6] = 2;
        am.llIlllllI[7] = -(111 + 128 - 104 + 18) & (0xFFFFBFFA & 0x4EFF);
        am.llIlllllI[8] = -(0xFFFFFFEB & 0x5877) & (0xFFFFFFFE & 0x7EFF);
        am.llIlllllI[9] = 0x22 ^ 0 ^ (0x18 ^ 0x3F);
        am.llIlllllI[10] = 0x23 ^ 0x2A;
        am.llIlllllI[11] = 3;
    }

    public static am valueOf(String string) {
        return Enum.valueOf(AMEnum.class, string);
    }

    private static boolean llIIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIIIIIIl(String lIlIllIllIIllII, String lIlIllIllIIlIll) {
        lIlIllIllIIllII = new String(Base64.getDecoder().decode(lIlIllIllIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIllIIlIlI = new StringBuilder();
        char[] lIlIllIllIIlIIl = lIlIllIllIIlIll.toCharArray();
        int lIlIllIllIIlIII = llIlllllI[0];
        char[] lIlIllIllIIIIlI = lIlIllIllIIllII.toCharArray();
        int lIlIllIllIIIIIl = lIlIllIllIIIIlI.length;
        int lIlIllIllIIIIII = llIlllllI[0];
        while (am.llIIIIIIlII(lIlIllIllIIIIII, lIlIllIllIIIIIl)) {
            char lIlIllIllIIllIl = lIlIllIllIIIIlI[lIlIllIllIIIIII];
            lIlIllIllIIlIlI.append((char)(lIlIllIllIIllIl ^ lIlIllIllIIlIIl[lIlIllIllIIlIII % lIlIllIllIIlIIl.length]));
            0;
            ++lIlIllIllIIlIII;
            ++lIlIllIllIIIIII;
            0;
            if (1 != -1) continue;
            return null;
        }
        return String.valueOf(lIlIllIllIIlIlI);
    }

    public boolean bo() {
        return this.area.contains(Players.getLocal().getWorldLocation());
    }
}

