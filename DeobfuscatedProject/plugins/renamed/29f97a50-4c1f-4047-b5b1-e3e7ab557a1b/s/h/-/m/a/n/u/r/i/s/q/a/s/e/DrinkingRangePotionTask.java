/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown;

/* TASK: Drinking Range Potion -> DrinkingrangepotionTask */
@TaskDesc(name="Drinking Range Potion")
public class DrinkingRangePotionTask
extends Task {
    private final /* synthetic */ c aa;
    private static /* synthetic */ int[] lIIlIllllIllI;
    private static /* synthetic */ String[] lIIlIllllIlIl;
    private final /* synthetic */ SquireShamanConfig Z;

    private static void lIlIlllIIIIlIlI() {
        lIIlIllllIlIl = new String[lIIlIllllIllI[2]];
        o.lIIlIllllIlIl[o.lIIlIllllIllI[0]] = o."Drink";
    }

    static {
        o.lIlIlllIIIIlIll();
        o.lIlIlllIIIIlIlI();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        o var3;
        if (o.lIlIlllIIIIllII(this.aa.s() ? 1 : 0)) {
            return lIIlIllllIllI[0];
        }
        if (o.lIlIlllIIIIllIl(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), lIIlIllllIllI[1])) {
            return lIIlIllllIllI[0];
        }
        Item var11 = Inventory.getFirst(var3.Z.rangePotion().u());
        if (o.lIlIlllIIIIlllI(var11)) {
            return lIIlIllllIllI[0];
        }
        var1_1.interact(lIIlIllllIlIl[lIIlIllllIllI[0]]);
        return lIIlIllllIllI[2];
    }

    private static void lIlIlllIIIIlIll() {
        lIIlIllllIllI = new int[3];
        o.lIIlIllllIllI[0] = (0x26 ^ 0x1D) & ~(0xBB ^ 0x80);
        o.lIIlIllllIllI[1] = 0x83 ^ 0x85;
        o.lIIlIllllIllI[2] = 1;
    }

    private static boolean lIlIlllIIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlllIIIIlIIl(String var9, String var5) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var4 = lIIlIllllIllI[0];
        char[] var8 = var9.toCharArray();
        int var10 = var8.length;
        int var1 = lIIlIllllIllI[0];
        while (o.lIlIlllIIIIllll(var1, var10)) {
            char var2 = var8[var1];
            var6.append((char)(var2 ^ var7[var4 % var7.length]));
            0;
            ++var4;
            ++var1;
            0;
            if (((0x5C ^ 5 ^ (0xAB ^ 0xA4)) & (0x5D ^ 0x74 ^ 84 + 26 - 56 + 73 ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean lIlIlllIIIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlllIIIIlllI(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIIIIllII(int n2) {
        return n2 == 0;
    }

    @Inject
    public o(SquireShamanConfig squireShamanConfig, c c2) {
        this.Z = squireShamanConfig;
        this.aa = c2;
    }
}

