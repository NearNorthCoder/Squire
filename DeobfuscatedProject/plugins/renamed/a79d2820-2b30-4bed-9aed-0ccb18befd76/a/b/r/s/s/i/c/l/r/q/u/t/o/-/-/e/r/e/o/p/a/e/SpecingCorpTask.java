/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.a_Unknown;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.s_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

/* TASK: Specing Corp -> SpecingcorpTask */
@TaskDesc(name="Specing Corp")
public class SpecingCorpTask
extends a_Unknown {
    @Inject
    private /* synthetic */ s a;
    private static /* synthetic */ int[] lIlIlllIlllI;
    @Inject
    private /* synthetic */ SquireCorp p;
    private static /* synthetic */ String[] lIlIlllIllIl;

    private static boolean lllIIIlIIIIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIIIlIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIIlllllII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIIlllllll(Object object) {
        return object == null;
    }

    private static boolean lllIIIlIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIIIIlllllIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var4;
        if (r.lllIIIIlllllII(this.g() ? 1 : 0)) {
            return lIlIlllIlllI[0];
        }
        NPC var11 = var4.f();
        if (!r.lllIIIIlllllIl(var11) || !r.lllIIIIllllllI(Reachable.isInteractable((Locatable)var11) ? 1 : 0) || r.lllIIIIllllllI(var11.isDead() ? 1 : 0)) {
            return lIlIlllIlllI[0];
        }
        Player var7 = Players.getNearest(player -> {
            int n2;
            if (r.lllIIIlIIIIIlI(player, Players.getLocal()) && r.lllIIIlIIIIIll(player.getInteracting(), var11) && r.lllIIIIlllllII(player.isFriend() ? 1 : 0)) {
                n2 = lIlIlllIlllI[1];
                0;
                if (1 != 1) {
                    return ((0xB3 ^ 0x9D ^ (0x5A ^ 0x66)) & (0x4A ^ 3 ^ (0x27 ^ 0x7C) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlllIlllI[0];
            }
            return n2 != 0;
        });
        if (r.lllIIIIlllllIl(var7)) {
            var4.p.c(lIlIlllIlllI[1]);
            return lIlIlllIlllI[0];
        }
        EquipmentSetup var8 = var4.a.t();
        if (r.lllIIIIlllllll(var8)) {
            return lIlIlllIlllI[0];
        }
        if (!r.lllIIIlIIIIIII(Combat.getSpecEnergy(), lIlIlllIlllI[2]) || r.lllIIIlIIIIIIl(Combat.getCurrentHealth(), lIlIlllIlllI[3])) {
            TeleportLoader.enterHouse();
            0;
            return lIlIlllIlllI[0];
        }
        if (r.lllIIIIlllllII(Gear.isEquipped((int[])var8.getIds()) ? 1 : 0)) {
            Gear.swapTo((EquipmentSetup)var8);
            0;
            return lIlIlllIlllI[1];
        }
        if (r.lllIIIIlllllII(Combat.isSpecEnabled() ? 1 : 0)) {
            Combat.toggleSpec();
        }
        var1_1.interact(lIlIlllIllIl[lIlIlllIlllI[0]]);
        this.p.b(lIlIlllIlllI[1]);
        return lIlIlllIlllI[1];
    }

    private static void lllIIIIllllIlI() {
        lIlIlllIllIl = new String[lIlIlllIlllI[1]];
        r.lIlIlllIllIl[r.lIlIlllIlllI[0]] = r."Attack";
    }

    static {
        r.lllIIIIllllIll();
        r.lllIIIIllllIlI();
    }

    private static void lllIIIIllllIll() {
        lIlIlllIlllI = new int[4];
        r.lIlIlllIlllI[0] = (0x37 ^ 0x1F) & ~(0x7C ^ 0x54);
        r.lIlIlllIlllI[1] = 1;
        r.lIlIlllIlllI[2] = 0x21 ^ 0x13;
        r.lIlIlllIlllI[3] = 15 + 42 - -4 + 95 ^ 106 + 74 - 57 + 54;
    }

    private static String lllIIIIllllIIl(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var6 = var3.toCharArray();
        int var10 = lIlIlllIlllI[0];
        char[] var5 = var2.toCharArray();
        int var13 = var5.length;
        int var1 = lIlIlllIlllI[0];
        while (r.lllIIIlIIIIIIl(var1, var13)) {
            char var12 = var5[var1];
            var9.append((char)(var12 ^ var6[var10 % var6.length]));
            0;
            ++var10;
            ++var1;
            0;
            if (((3 + 20 - -127 + 0 ^ 10 + 29 - -98 + 9) & (0x7E ^ 0x13 ^ (0x5E ^ 0x37) ^ -1)) >= ((0xFB ^ 0xBF ^ (0x3E ^ 0x77)) & (0x18 ^ 0x53 ^ (0x5D ^ 0x1B) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lllIIIIllllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIlIIIIIll(Object object, Object object2) {
        return object == object2;
    }
}

