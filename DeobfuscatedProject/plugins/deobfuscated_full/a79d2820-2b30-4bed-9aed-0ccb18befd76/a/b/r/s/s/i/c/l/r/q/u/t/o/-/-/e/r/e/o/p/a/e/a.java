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

    private static String lllIIIlIIIIlII(String var4, String var11) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var9 = var11.toCharArray();
        int var6 = lIlIllllIIII[1];
        char[] var10 = var4.toCharArray();
        int var2 = var10.length;
        int var12 = lIlIllllIIII[1];
        while (a.lllIIIlIIIIlll(var12, var2)) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var9[var6 % var9.length]));
            0;
            ++var6;
            ++var12;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var7);
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
        void var5;
        int[] nArray = Static.getClient().getMapRegions();
        int n2 = nArray.length;
        int var8 = lIlIllllIIII[1];
        while (a.lllIIIlIIIIlll(var8, (int)var5)) {
            void var3;
            void var1 = var3[var8];
            if (!a.lllIIIlIIIlIII((int)var1, lIlIllllIIII[2]) || a.lllIIIlIIIlIIl((int)var1, lIlIllllIIII[3])) {
                return lIlIllllIIII[0];
            }
            ++var8;
            0;
            if (-1 == -1) continue;
            return false;
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

