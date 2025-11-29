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

public abstract class ag_Unknown
extends Task {
    protected final /* synthetic */ SquireZulrahConfig aC;
    @Inject
    protected /* synthetic */ SquireZulrah E;
    private static /* synthetic */ int[] lIllIllIllIII;
    private static /* synthetic */ String[] lIllIllIlIllI;
    private final /* synthetic */ Client aD;

    public abstract boolean ac();

    private static String llIIlIIlIIlIIll(String var2, String var8) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var9 = var8.toCharArray();
        int var6 = lIllIllIllIII[0];
        char[] var15 = var2.toCharArray();
        int var10 = var15.length;
        int var11 = lIllIllIllIII[0];
        while (ag.llIIlIIlIIllllI(var11, var10)) {
            char var5 = var15[var11];
            var13.append((char)(var5 ^ var9[var6 % var9.length]));
            0;
            ++var6;
            ++var11;
            0;
            
            return null;
        }
        return String.valueOf(var13);
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
        NPC var4 = NPCs.getNearest((String[])stringArray);
        if (ag.llIIlIIlIIlllIl(var4)) {
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
        ag var3;
        if (ag.llIIlIIlIIlllII(this.aD.isInInstancedRegion() ? 1 : 0)) {
            this.E.b(lIllIllIllIII[0]);
            return lIllIllIllIII[0];
        }
        int[] var12 = var3.aD.getMapRegions();
        int var1 = var12.length;
        int var14 = lIllIllIllIII[0];
        while (ag.llIIlIIlIIllllI(var14, var1)) {
            int var7 = var12[var14];
            if (!ag.llIIlIIlIIlllll(var7, lIllIllIllIII[2]) || ag.llIIlIIlIlIIIII(var7, lIllIllIllIII[3])) {
                return lIllIllIllIII[1];
            }
            ++var14;
            0;
            
            return false;
        }
        return lIllIllIllIII[0];
    }
}

