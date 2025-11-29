/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.client.Static
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.corp.SquireCorpConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;

public abstract class a
extends Task {
    private static final /* synthetic */ int n;
    private static final /* synthetic */ int m;
    private static /* synthetic */ String[] lIlIlllIllll;
    @Inject
    protected /* synthetic */ SquireCorpConfig o;
    private static /* synthetic */ int[] lIlIllllIIII;

    private static String lllIIIlIIIIlII(String lllllllllllllllIllIIIllllIIIIllI, String lllllllllllllllIllIIIllllIIIlIlI) {
        lllllllllllllllIllIIIllllIIIIllI = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIllllIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIllllIIIlIIl = new StringBuilder();
        char[] lllllllllllllllIllIIIllllIIIlIII = lllllllllllllllIllIIIllllIIIlIlI.toCharArray();
        int lllllllllllllllIllIIIllllIIIIlll = lIlIllllIIII[1];
        char[] lllllllllllllllIllIIIllllIIIIIIl = lllllllllllllllIllIIIllllIIIIllI.toCharArray();
        int lllllllllllllllIllIIIllllIIIIIII = lllllllllllllllIllIIIllllIIIIIIl.length;
        int lllllllllllllllIllIIIlllIlllllll = lIlIllllIIII[1];
        while (a.lllIIIlIIIIlll(lllllllllllllllIllIIIlllIlllllll, lllllllllllllllIllIIIllllIIIIIII)) {
            char lllllllllllllllIllIIIllllIIIllII = lllllllllllllllIllIIIllllIIIIIIl[lllllllllllllllIllIIIlllIlllllll];
            lllllllllllllllIllIIIllllIIIlIIl.append((char)(lllllllllllllllIllIIIllllIIIllII ^ lllllllllllllllIllIIIllllIIIlIII[lllllllllllllllIllIIIllllIIIIlll % lllllllllllllllIllIIIllllIIIlIII.length]));
            0;
            ++lllllllllllllllIllIIIllllIIIIlll;
            ++lllllllllllllllIllIIIlllIlllllll;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIllllIIIlIIl);
    }

    static {
        a.lllIIIlIIIIllI();
        a.lllIIIlIIIIlIl();
        n = lIlIllllIIII[3];
        m = lIlIllllIIII[2];
    }

    private static boolean lllIIIlIIIlIII(int n2, int n3) {
        return n2 != n3;
    }

    private static void lllIIIlIIIIlIl() {
        lIlIlllIllll = new String[lIlIllllIIII[0]];
        a.lIlIlllIllll[a.lIlIllllIIII[1]] = a."Corporeal Beast";
    }

    private static void lllIIIlIIIIllI() {
        lIlIllllIIII = new int[4];
        a.lIlIllllIIII[0] = 1;
        a.lIlIllllIIII[1] = (0x14 ^ 0x5C) & ~(0xC ^ 0x44);
        a.lIlIllllIIII[2] = -(0xFFFF96AF & 0x79F6) & (0xFFFFBFFF & 0x7EE7);
        a.lIlIllllIIII[3] = -(0xFFFFD9BB & 0x67D5) & (0xFFFFFFDC & 0x6FF7);
    }

    /*
     * WARNING - void declaration
     */
    public boolean g() {
        void lllllllllllllllIllIIIllllIIllIII;
        int[] nArray = Static.getClient().getMapRegions();
        int n2 = nArray.length;
        int lllllllllllllllIllIIIllllIIlIlll = lIlIllllIIII[1];
        while (a.lllIIIlIIIIlll(lllllllllllllllIllIIIllllIIlIlll, (int)lllllllllllllllIllIIIllllIIllIII)) {
            void lllllllllllllllIllIIIllllIIllIIl;
            void lllllllllllllllIllIIIllllIIlIllI = lllllllllllllllIllIIIllllIIllIIl[lllllllllllllllIllIIIllllIIlIlll];
            if (!a.lllIIIlIIIlIII((int)lllllllllllllllIllIIIllllIIlIllI, lIlIllllIIII[2]) || a.lllIIIlIIIlIIl((int)lllllllllllllllIllIIIllllIIlIllI, lIlIllllIIII[3])) {
                return lIlIllllIIII[0];
            }
            ++lllllllllllllllIllIIIllllIIlIlll;
            0;
            if (-1 == -1) continue;
            return ((0x34 ^ 0x65) & ~(0x3B ^ 0x6A)) != 0;
        }
        return lIlIllllIIII[1];
    }

    public NPC f() {
        String[] stringArray = new String[lIlIllllIIII[0]];
        stringArray[a.lIlIllllIIII[1]] = lIlIlllIllll[lIlIllllIIII[1]];
        return NPCs.getNearest((String[])stringArray);
    }

    private static boolean lllIIIlIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIlIIIlIIl(int n2, int n3) {
        return n2 == n3;
    }
}

