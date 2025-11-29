/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.x;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

/* TASK: Teasing Animal -> TeasinganimalTask */
@TaskDesc(name="Teasing Animal", priority=10, blocking=true)
public class z
extends x {
    public static final /* synthetic */ int G;
    private static /* synthetic */ String[] llllIIIIIIlI;
    private static /* synthetic */ int[] llllIIIIIIll;

    private static void lIIIlllIIlllIlI() {
        llllIIIIIIll = new int[4];
        z.llllIIIIIIll[0] = -1 & (0xFFFFAFFF & 0x5BFB);
        z.llllIIIIIIll[1] = 0x1E ^ 0xE ^ (0xB1 ^ 0xA5);
        z.llllIIIIIIll[2] = ((0xB6 ^ 0xAD) & ~(0x62 ^ 0x79) ^ (0x3A ^ 0x7C)) & (0x7D ^ 0x78 ^ (6 ^ 0x45) ^ -1);
        z.llllIIIIIIll[3] = 1;
    }

    static {
        z.lIIIlllIIlllIlI();
        z.lIIIlllIIlllIIl();
        G = llllIIIIIIll[0];
    }

    private static boolean lIIIlllIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public z(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var3_3;
        z var2;
        if (z.lIIIlllIIlllIll(Players.getLocal().getAnimation(), llllIIIIIIll[0])) {
            this.sleep(llllIIIIIIll[1]);
            return llllIIIIIIll[2];
        }
        TileObject var4 = var2.F();
        if (z.lIIIlllIIllllII(var4)) {
            return llllIIIIIIll[2];
        }
        NPC var11 = var2.E();
        if (z.lIIIlllIIllllIl(var11)) {
            return llllIIIIIIll[2];
        }
        NPC var8 = var2.D();
        if (z.lIIIlllIIllllII(var8)) {
            return llllIIIIIIll[2];
        }
        if (z.lIIIlllIIlllllI(((GameObject)var4).getWorldArea().contains(var8.getWorldLocation()) ? 1 : 0)) {
            return llllIIIIIIll[2];
        }
        var3_3.interact(llllIIIIIIlI[llllIIIIIIll[2]]);
        return llllIIIIIIll[3];
    }

    private static boolean lIIIlllIIllllII(Object object) {
        return object == null;
    }

    private static void lIIIlllIIlllIIl() {
        llllIIIIIIlI = new String[llllIIIIIIll[3]];
        z.llllIIIIIIlI[z.llllIIIIIIll[2]] = z."Tease";
    }

    private static boolean lIIIlllIIlllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlllIIllllIl(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIIlllllI(int n2) {
        return n2 != 0;
    }

    private static String lIIIlllIIlllIII(String var9, String var7) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var5 = var7.toCharArray();
        int var1 = llllIIIIIIll[2];
        char[] var6 = var9.toCharArray();
        int var10 = var6.length;
        int var12 = llllIIIIIIll[2];
        while (z.lIIIlllIIllllll(var12, var10)) {
            char var3 = var6[var12];
            var13.append((char)(var3 ^ var5[var1 % var5.length]));
            0;
            ++var1;
            ++var12;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }
}

