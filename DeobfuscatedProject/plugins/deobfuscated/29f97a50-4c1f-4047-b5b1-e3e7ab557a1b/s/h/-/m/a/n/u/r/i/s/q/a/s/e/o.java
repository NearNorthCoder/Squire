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
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

@TaskDesc(name="Drinking Range Potion")
public class o
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
        o llllllllllllllIllllIIllllIIIlIll;
        if (o.lIlIlllIIIIllII(this.aa.s() ? 1 : 0)) {
            return lIIlIllllIllI[0];
        }
        if (o.lIlIlllIIIIllIl(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), lIIlIllllIllI[1])) {
            return lIIlIllllIllI[0];
        }
        Item llllllllllllllIllllIIllllIIIlIlI = Inventory.getFirst(llllllllllllllIllllIIllllIIIlIll.Z.rangePotion().u());
        if (o.lIlIlllIIIIlllI(llllllllllllllIllllIIllllIIIlIlI)) {
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

    private static String lIlIlllIIIIlIIl(String llllllllllllllIllllIIlllIllllIlI, String llllllllllllllIllllIIlllIllllIIl) {
        llllllllllllllIllllIIlllIllllIlI = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlllIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIlllIlllllIl = new StringBuilder();
        char[] llllllllllllllIllllIIlllIlllllII = llllllllllllllIllllIIlllIllllIIl.toCharArray();
        int llllllllllllllIllllIIlllIllllIll = lIIlIllllIllI[0];
        char[] llllllllllllllIllllIIlllIlllIlIl = llllllllllllllIllllIIlllIllllIlI.toCharArray();
        int llllllllllllllIllllIIlllIlllIlII = llllllllllllllIllllIIlllIlllIlIl.length;
        int llllllllllllllIllllIIlllIlllIIll = lIIlIllllIllI[0];
        while (o.lIlIlllIIIIllll(llllllllllllllIllllIIlllIlllIIll, llllllllllllllIllllIIlllIlllIlII)) {
            char llllllllllllllIllllIIllllIIIIIII = llllllllllllllIllllIIlllIlllIlIl[llllllllllllllIllllIIlllIlllIIll];
            llllllllllllllIllllIIlllIlllllIl.append((char)(llllllllllllllIllllIIllllIIIIIII ^ llllllllllllllIllllIIlllIlllllII[llllllllllllllIllllIIlllIllllIll % llllllllllllllIllllIIlllIlllllII.length]));
            0;
            ++llllllllllllllIllllIIlllIllllIll;
            ++llllllllllllllIllllIIlllIlllIIll;
            0;
            if (((0x5C ^ 5 ^ (0xAB ^ 0xA4)) & (0x5D ^ 0x74 ^ 84 + 26 - 56 + 73 ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIlllIlllllIl);
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

