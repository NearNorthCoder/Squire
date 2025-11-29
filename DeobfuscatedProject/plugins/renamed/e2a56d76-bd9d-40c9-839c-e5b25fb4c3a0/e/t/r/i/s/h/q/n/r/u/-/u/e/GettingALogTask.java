/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a_Unknown;
import e.t.r.i.s.h.q.n.r.u.-.u.e.x_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Getting a log -> GettingalogTask */
@TaskDesc(name="Getting a log")
public class GettingALogTask
extends x_Unknown {
    private static /* synthetic */ int[] lllIllIlIlIl;
    private static /* synthetic */ String[] lllIllIlIlII;

    private static String lIIIllIlIlIllII(String var4, String var3) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var10 = lllIllIlIlIl[0];
        char[] var11 = var4.toCharArray();
        int var9 = var11.length;
        int var2 = lllIllIlIlIl[0];
        while (v.lIIIllIlIllIIll(var2, var9)) {
            char var6 = var11[var2];
            var1.append((char)(var6 ^ var5[var10 % var5.length]));
            0;
            ++var10;
            ++var2;
            0;
            if ((77 + 18 - 71 + 169 ^ 67 + 1 - -46 + 83) > 1) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean lIIIllIlIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIlIllIIlI(int n2) {
        return n2 != 0;
    }

    @Inject
    public v(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }

    static {
        v.lIIIllIlIlIlllI();
        v.lIIIllIlIlIllIl();
    }

    private static boolean lIIIllIlIlIllll(Object object) {
        return object != null;
    }

    private static boolean lIIIllIlIllIIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        TileObject var7;
        NPC nPC;
        TileObject tileObject2 = this.G();
        if (v.lIIIllIlIlIllll(tileObject2)) {
            void var8;
            nPC = this.E();
            if (v.lIIIllIlIllIIII(nPC) && v.lIIIllIlIllIIII(nPC = this.D())) {
                return lllIllIlIlIl[0];
            }
            if (v.lIIIllIlIllIIIl(((GameObject)var8).getWorldArea().contains(var7.getWorldLocation()) ? 1 : 0)) {
                return lllIllIlIlIl[0];
            }
        }
        int[] nArray = new int[lllIllIlIlIl[1]];
        nArray[v.lllIllIlIlIl[0]] = lllIllIlIlIl[2];
        if (v.lIIIllIlIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllIllIlIlIl[0];
        }
        var7 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (v.lIIIllIlIllIIlI(lllIllIlIlII[lllIllIlIlIl[1]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[lllIllIlIlIl[1]];
                stringArray[v.lllIllIlIlIl[0]] = lllIllIlIlII[lllIllIlIlIl[3]];
                if (v.lIIIllIlIllIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIllIlIlIl[1];
                    0;
                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIllIlIlIl[0];
            return n2 != 0;
        });
        if (v.lIIIllIlIllIIII(var7)) {
            return lllIllIlIlIl[0];
        }
        nPC.interact(lllIllIlIlII[lllIllIlIlIl[0]]);
        return lllIllIlIlIl[1];
    }

    private static void lIIIllIlIlIllIl() {
        lllIllIlIlII = new String[lllIllIlIlIl[4]];
        v.lllIllIlIlII[v.lllIllIlIlIl[0]] = v."Chop down";
        v.lllIllIlIlII[v.lllIllIlIlIl[1]] = v."Tree";
        v.lllIllIlIlII[v.lllIllIlIlIl[3]] = v."Chop down";
    }

    private static boolean lIIIllIlIllIIIl(int n2) {
        return n2 == 0;
    }

    private static void lIIIllIlIlIlllI() {
        lllIllIlIlIl = new int[5];
        v.lllIllIlIlIl[0] = (0xE ^ 0x61 ^ (0x69 ^ 0x59)) & (6 ^ 0x7C ^ (0x9A ^ 0xBF) ^ -1);
        v.lllIllIlIlIl[1] = 1;
        v.lllIllIlIlIl[2] = -(0xFFFFE5EB & 0x5A1D) & (0xFFFFF7EF & 0x4DFF);
        v.lllIllIlIlIl[3] = 2;
        v.lllIllIlIlIl[4] = 3;
    }
}

