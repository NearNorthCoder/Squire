/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
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
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

/* TASK: Jumping Pitfall Trap -> JumpingpitfalltrapTask */
@TaskDesc(name="Jumping Pitfall Trap", priority=20, blocking=true)
public class w
extends x {
    private static /* synthetic */ String[] lllIlllllIlI;
    private static /* synthetic */ int[] lllIlllllIll;

    static {
        w.lIIIlllIIIlllll();
        w.lIIIlllIIIllllI();
    }

    private static boolean lIIIlllIIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlllIIlIIIII(Object object) {
        return object == null;
    }

    private static void lIIIlllIIIllllI() {
        lllIlllllIlI = new String[lllIlllllIll[3]];
        w.lllIlllllIlI[w.lllIlllllIll[0]] = w."Jump";
    }

    private static void lIIIlllIIIlllll() {
        lllIlllllIll = new int[4];
        w.lllIlllllIll[0] = (0x35 ^ 0x79) & ~(0x45 ^ 9);
        w.lllIlllllIll[1] = 2;
        w.lllIlllllIll[2] = 0x2F ^ 0x29;
        w.lllIlllllIll[3] = 1;
    }

    private static String lIIIlllIIIlllIl(String var8, String var5) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var1 = var5.toCharArray();
        int var11 = lllIlllllIll[0];
        char[] var2 = var8.toCharArray();
        int var3 = var2.length;
        int var9 = lllIlllllIll[0];
        while (w.lIIIlllIIlIIIlI(var9, var3)) {
            char var7 = var2[var9];
            var10.append((char)(var7 ^ var1[var11 % var1.length]));
            0;
            ++var11;
            ++var9;
            0;
            
            return null;
        }
        return String.valueOf(var10);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var12;
        w var4;
        TileObject tileObject = this.F();
        if (w.lIIIlllIIlIIIII(tileObject)) {
            return lllIlllllIll[0];
        }
        NPC var6 = var4.E();
        if (w.lIIIlllIIlIIIII(var6)) {
            return lllIlllllIll[0];
        }
        if (w.lIIIlllIIlIIIIl(((GameObject)var12).getWorldArea().contains(var6.getWorldLocation()) ? 1 : 0)) {
            return lllIlllllIll[0];
        }
        var12.interact(lllIlllllIlI[lllIlllllIll[0]]);
        if (w.lIIIlllIIlIIIlI(var12.distanceTo((Locatable)Players.getLocal()), lllIlllllIll[1]) && w.lIIIlllIIlIIIlI(var6.distanceTo((Locatable)Players.getLocal()), lllIlllllIll[1])) {
            var4.sleep(lllIlllllIll[2]);
            return lllIlllllIll[3];
        }
        this.sleep(lllIlllllIll[1]);
        return lllIlllllIll[3];
    }

    private static boolean lIIIlllIIlIIIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public w(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }
}

