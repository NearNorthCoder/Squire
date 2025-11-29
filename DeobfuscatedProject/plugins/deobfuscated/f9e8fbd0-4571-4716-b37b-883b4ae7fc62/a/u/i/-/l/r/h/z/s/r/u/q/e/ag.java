/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;

public abstract class ag
extends Task {
    protected final /* synthetic */ SquireZulrahConfig aC;
    @Inject
    protected /* synthetic */ SquireZulrah E;
    private static /* synthetic */ int[] lIllIllIllIII;
    private static /* synthetic */ String[] lIllIllIlIllI;
    private final /* synthetic */ Client aD;

    public abstract boolean ac();

    private static String llIIlIIlIIlIIll(String llllllllllllllIllIIIlIIllllIllII, String llllllllllllllIllIIIlIIllllIlIll) {
        llllllllllllllIllIIIlIIllllIllII = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIIllllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlIIllllIllll = new StringBuilder();
        char[] llllllllllllllIllIIIlIIllllIlllI = llllllllllllllIllIIIlIIllllIlIll.toCharArray();
        int llllllllllllllIllIIIlIIllllIllIl = lIllIllIllIII[0];
        char[] llllllllllllllIllIIIlIIllllIIlll = llllllllllllllIllIIIlIIllllIllII.toCharArray();
        int llllllllllllllIllIIIlIIllllIIllI = llllllllllllllIllIIIlIIllllIIlll.length;
        int llllllllllllllIllIIIlIIllllIIlIl = lIllIllIllIII[0];
        while (ag.llIIlIIlIIllllI(llllllllllllllIllIIIlIIllllIIlIl, llllllllllllllIllIIIlIIllllIIllI)) {
            char llllllllllllllIllIIIlIIlllllIIlI = llllllllllllllIllIIIlIIllllIIlll[llllllllllllllIllIIIlIIllllIIlIl];
            llllllllllllllIllIIIlIIllllIllll.append((char)(llllllllllllllIllIIIlIIlllllIIlI ^ llllllllllllllIllIIIlIIllllIlllI[llllllllllllllIllIIIlIIllllIllIl % llllllllllllllIllIIIlIIllllIlllI.length]));
            0;
            ++llllllllllllllIllIIIlIIllllIllIl;
            ++llllllllllllllIllIIIlIIllllIIlIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlIIllllIllll);
    }

    private static boolean llIIlIIlIIlllll(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIIlIIlIIlIlII() {
        lIllIllIlIllI = new String[lIllIllIllIII[1]];
        ag.lIllIllIlIllI[ag.lIllIllIllIII[0]] = ag."Zulrah";
    }

    private static void llIIlIIlIIllIll() {
        lIllIllIllIII = new int[4];
        ag.lIllIllIllIII[0] = (0x28 ^ 0x1C ^ (0x26 ^ 0x1C)) & (32 + 119 - 101 + 132 ^ 22 + 42 - 20 + 140 ^ -1);
        ag.lIllIllIllIII[1] = 1;
        ag.lIllIllIllIII[2] = 0xFFFFF734 & 0x2BFB;
        ag.lIllIllIllIII[3] = -(0xFFFF96CB & 0x79B5) & (0xFFFFF7FF & 0x3BAF);
    }

    private static boolean llIIlIIlIIlllII(int n2) {
        return n2 == 0;
    }

    static {
        ag.llIIlIIlIIllIll();
        ag.llIIlIIlIIlIlII();
    }

    private static boolean llIIlIIlIlIIIII(int n2, int n3) {
        return n2 == n3;
    }

    public boolean run() {
        if (ag.llIIlIIlIIlllII(this.ag() ? 1 : 0)) {
            return lIllIllIllIII[0];
        }
        String[] stringArray = new String[lIllIllIllIII[1]];
        stringArray[ag.lIllIllIllIII[0]] = lIllIllIlIllI[lIllIllIllIII[0]];
        NPC llllllllllllllIllIIIlIlIIIIIIllI = NPCs.getNearest((String[])stringArray);
        if (ag.llIIlIIlIIlllIl(llllllllllllllIllIIIlIlIIIIIIllI)) {
            return lIllIllIllIII[0];
        }
        return this.ac();
    }

    protected ag(Client client, SquireZulrahConfig squireZulrahConfig) {
        this.aD = client;
        this.aC = squireZulrahConfig;
    }

    private static boolean llIIlIIlIIlllIl(Object object) {
        return object != null;
    }

    private static boolean llIIlIIlIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private boolean ag() {
        ag llllllllllllllIllIIIlIlIIIIIIIII;
        if (ag.llIIlIIlIIlllII(this.aD.isInInstancedRegion() ? 1 : 0)) {
            this.E.b(lIllIllIllIII[0]);
            return lIllIllIllIII[0];
        }
        int[] llllllllllllllIllIIIlIIlllllllll = llllllllllllllIllIIIlIlIIIIIIIII.aD.getMapRegions();
        int llllllllllllllIllIIIlIIllllllllI = llllllllllllllIllIIIlIIlllllllll.length;
        int llllllllllllllIllIIIlIIlllllllIl = lIllIllIllIII[0];
        while (ag.llIIlIIlIIllllI(llllllllllllllIllIIIlIIlllllllIl, llllllllllllllIllIIIlIIllllllllI)) {
            int llllllllllllllIllIIIlIIlllllllII = llllllllllllllIllIIIlIIlllllllll[llllllllllllllIllIIIlIIlllllllIl];
            if (!ag.llIIlIIlIIlllll(llllllllllllllIllIIIlIIlllllllII, lIllIllIllIII[2]) || ag.llIIlIIlIlIIIII(llllllllllllllIllIIIlIIlllllllII, lIllIllIllIII[3])) {
                return lIllIllIllIII[1];
            }
            ++llllllllllllllIllIIIlIIlllllllIl;
            0;
            if (null == null) continue;
            return ((0xA4 ^ 0xBE) & ~(0x7A ^ 0x60)) != 0;
        }
        return lIllIllIllIII[0];
    }
}

