/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.CEnum;
import g.r.r.-.t.q.i.u.o.e.s.h_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

/* TASK: Crafting runes -> CraftingrunesTask */
@TaskDesc(name="Crafting runes", priority=5, blocking=true)
public class CraftingRunesTask
extends h_Unknown {
    private static /* synthetic */ String[] llIIllllllIl;
    private static /* synthetic */ int[] llIIlllllllI;

    private static boolean llllllllllIlIl(int n2) {
        return n2 <= 0;
    }

    static {
        p.llllllllllIlII();
        p.llllllllllIIIl();
    }

    private static boolean llllllllllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var2_2;
        p var9;
        int var10;
        int n2;
        int[] nArray = new int[llIIlllllllI[2]];
        nArray[p.llIIlllllllI[1]] = llIIlllllllI[3];
        if (!p.llllllllllIlIl(Inventory.getCount((int[])nArray)) || p.llllllllllIllI(this.aV.S(), Static.getClient().getTickCount())) {
            n2 = llIIlllllllI[2];
            0;
            if (1 < 0) {
                return ((187 + 68 - 215 + 171 ^ 9 + 69 - 77 + 138) & (0xD0 ^ 0xA9 ^ (0x14 ^ 0x35) ^ -1)) != 0;
            }
        } else {
            n2 = llIIlllllllI[1];
        }
        if (!p.llllllllllIlll(var10 = n2) || p.llllllllllIlll(var9.aV.g() ? 1 : 0)) {
            return llIIlllllllI[1];
        }
        String[] stringArray = new String[llIIlllllllI[2]];
        stringArray[p.llIIlllllllI[1]] = llIIllllllIl[llIIlllllllI[1]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (p.lllllllllllIII(var3)) {
            return llIIlllllllI[1];
        }
        if (p.llllllllllIlll(var9.b((GameObject)var3) ? 1 : 0)) {
            return llIIlllllllI[2];
        }
        var2_2.interact(llIIllllllIl[llIIlllllllI[2]]);
        return llIIlllllllI[2];
    }

    private static void llllllllllIIIl() {
        llIIllllllIl = new String[llIIlllllllI[0]];
        p.llIIllllllIl[p.llIIlllllllI[1]] = p."Altar";
        p.llIIllllllIl[p.llIIlllllllI[2]] = p."Craft-rune";
    }

    private static boolean llllllllllIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllllllllllIII(Object object) {
        return object == null;
    }

    private static String llllllllllIIII(String var8, String var4) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var7 = var4.toCharArray();
        int var11 = llIIlllllllI[1];
        char[] var2 = var8.toCharArray();
        int var6 = var2.length;
        int var1 = llIIlllllllI[1];
        while (p.lllllllllllIIl(var1, var6)) {
            char var12 = var2[var1];
            var5.append((char)(var12 ^ var7[var11 % var7.length]));
            0;
            ++var11;
            ++var1;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    @Inject
    public p(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllllllI[0]];
        cArray[p.llIIlllllllI[1]] = c.ACTIVE;
        cArray[p.llIIlllllllI[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    private static void llllllllllIlII() {
        llIIlllllllI = new int[4];
        p.llIIlllllllI[0] = 2;
        p.llIIlllllllI[1] = (0x22 ^ 0x38) & ~(0x81 ^ 0x9B);
        p.llIIlllllllI[2] = 1;
        p.llIIlllllllI[3] = 0xFFFFE9FF & 0x7EFF;
    }
}

