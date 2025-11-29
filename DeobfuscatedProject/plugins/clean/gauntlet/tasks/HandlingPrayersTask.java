/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.gauntlet.GauntletConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GameEnum18;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Handling prayers", priority=100)
public class HandlingPrayersTask
extends Task {
    private final  c cg;
    private final  GauntletConfig cf;

    private static boolean lIIIIIIIIlIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIIIIIllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIIllIIlI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private  boolean a(Player player, l l2, List list, NPC nPC) {
        boolean bl;
        void var1;
        void var2;
        void var3;
        W var4;
        void var5;
        void var6;
        g g2 = g.i(nPC.getId());
        if (W.lIIIIIIIIllIIII((Object)g2)) {
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIllIIlI(var6.getInteracting(), var5)) {
            return llIIlllllIll[1];
        }
        l var7 = var4.cg.V().d(var5.getWorldLocation());
        if (W.lIIIIIIIIllIIll(var7, var3) && W.lIIIIIIIIlIllll(var2.contains(var7) ? 1 : 0)) {
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIlIllll(var6.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), var5.getWorldArea()) ? 1 : 0)) {
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIllIlII(var1.ak(), var5.getWorldLocation().distanceTo(var6.getWorldLocation()))) {
            bl = llIIlllllIll[1];

            if (2 <= 0) {
                return false;
            }
        } else {
            bl = llIIlllllIll[2];
        }
        return bl;
    }

    private static boolean lIIIIIIIIllIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIIIIllIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIIIIIIllIIII(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIIIlIllll(int n2) {
        return n2 == 0;
    }

    static {
        W.lIIIIIIIIlIllII();
        W.lIIIIIIIIlIlIll();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        int var8;
        int n2;
        void var9;
        W var10;
        Player player = Players.getLocal();
        if (!W.lIIIIIIIIlIllIl(player) || W.lIIIIIIIIlIlllI(Vars.getBit((int)llIIlllllIll[0]), llIIlllllIll[1])) {
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIlIllll(Prayers.getPoints())) {
            Item var11 = Inventory.getFirst(item -> e.aI.contains(item.getId()));
            if (W.lIIIIIIIIllIIII(var11)) {
                return llIIlllllIll[2];
            }
            var11.interact(llIIlllllIlI[llIIlllllIll[2]]);
            return llIIlllllIll[2];
        }
        if (!W.lIIIIIIIIllIIIl(var10.cg.A() ? 1 : 0) || !W.lIIIIIIIIlIllIl(var10.cg.V()) || W.lIIIIIIIIllIIIl(var10.cg.V().av().e(var9.getWorldLocation()) ? 1 : 0)) {
            if (W.lIIIIIIIIllIIIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return llIIlllllIll[1];
            }
            return llIIlllllIll[2];
        }
        Prayer var11 = var10.bJ();
        if (W.lIIIIIIIIlIllIl(var11)) {
            if (W.lIIIIIIIIllIIIl(var10.cf.flickMonsters() ? 1 : 0)) {
                Prayers.flick(List.of(var11));

                return llIIlllllIll[1];
            }
            if (W.lIIIIIIIIlIllll(Prayers.isEnabled((Prayer)var11) ? 1 : 0)) {
                Prayers.toggle((Prayer)var11);
                return llIIlllllIll[1];
            }
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIlIllll(NPCs.getAll(arg_0 -> W.c((Player)var9, arg_0)).isEmpty() ? 1 : 0)) {
            n2 = llIIlllllIll[1];

            if ((161 + 85 - 236 + 188 ^ 167 + 13 - 98 + 112) <= -1) {
                return ((0x3F ^ 0x2D ^ (0xA2 ^ 0x94)) & (0x2D ^ 0x30 ^ (0x5F ^ 0x66) ^ -1)) != 0;
            }
        } else {
            n2 = llIIlllllIll[2];
        }
        if (W.lIIIIIIIIllIIIl(var8 = n2)) {
            List<Prayer> var12 = List.of(Prayer.PROTECT_FROM_MELEE);
            if (W.lIIIIIIIIllIIIl(var10.cf.flickMonsters() ? 1 : 0)) {
                Prayers.flick(var12);

                return llIIlllllIll[1];
            }
            if (W.lIIIIIIIIlIllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                return llIIlllllIll[1];
            }

            if (((0x4C ^ 0x23 ^ (0x28 ^ 0x12)) & (207 + 14 - 11 + 16 ^ 130 + 35 - 112 + 130 ^ -1)) != 0) {
                return ((102 + 17 - -2 + 51 ^ 119 + 30 - 85 + 75) & (0xA6 ^ 0xC7 ^ (0xB ^ 0x4D) ^ -1)) != 0;
            }
        } else {
            Prayers.disableAll();
            return llIIlllllIll[1];
        }
        return llIIlllllIll[2];
    }

    private static boolean lIIIIIIIIllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static  boolean c(Player player, NPC nPC) {
        int n2;
        if (W.lIIIIIIIIlIllll(nPC.isDead() ? 1 : 0) && W.lIIIIIIIIllIlIl(nPC.getWorldLocation().distanceTo(player.getWorldLocation()), llIIlllllIll[3]) && W.lIIIIIIIIllIIlI(nPC.getInteracting(), player) && W.lIIIIIIIIllIIIl(nPC.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), player.getWorldLocation()) ? 1 : 0)) {
            n2 = llIIlllllIll[1];

            if (((0x21 ^ 0x32) & ~(0x33 ^ 0x20)) == 1) {
                return false;
            }
        } else {
            n2 = llIIlllllIll[2];
        }
        return n2 != 0;
    }

    private static void lIIIIIIIIlIlIll() {
        llIIlllllIlI = new String[llIIlllllIll[1]];
        W.llIIlllllIlI[W.llIIlllllIll[2]] = "Drink";
    }

    private static boolean lIIIIIIIIlIllIl(Object object) {
        return object != null;
    }

    @Inject
    public HandlingPrayersTask(GauntletConfig gauntletConfig, c c2) {
        this.cf = gauntletConfig;
        this.cg = c2;
    }

    /*
     * WARNING - void declaration
     */
    private Prayer bJ() {
        void var5_5;
        void var13;
        W var14;
        Player player = Players.getLocal();
        if (W.lIIIIIIIIllIIII(player)) {
            return null;
        }
        l var15 = var14.cg.V().d(var13.getWorldLocation());
        if (W.lIIIIIIIIllIIII(var15)) {
            return null;
        }
        List<l> var16 = var14.cg.V().c(var15);
        NPC var17 = NPCs.getNearest(arg_0 -> var14.a((Player)var13, var15, var16, arg_0));
        if (W.lIIIIIIIIllIIII(var17)) {
            return null;
        }
        g var18 = g.i(var17.getId());
        if (W.lIIIIIIIIllIIII((Object)var18)) {
            return null;
        }
        return var5_5.ai();
    }
}

