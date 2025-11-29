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
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.GEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l_Unknown;
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

/* TASK: Handling prayers -> PrayerFlickingTask */
@TaskDesc(name="Handling prayers", priority=100)
public class HandlingPrayersTask
extends Task {
    private final /* synthetic */ c cg;
    private final /* synthetic */ GauntletConfig cf;
    private static /* synthetic */ String[] llIIlllllIlI;
    private static /* synthetic */ int[] llIIlllllIll;

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
    private /* synthetic */ boolean a(Player player, l l2, List list, NPC nPC) {
        boolean bl;
        void var8;
        void var14;
        void var1;
        W var15;
        void var7;
        void var22;
        g g2 = g.i(nPC.getId());
        if (W.lIIIIIIIIllIIII((Object)g2)) {
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIllIIlI(var22.getInteracting(), var7)) {
            return llIIlllllIll[1];
        }
        l var20 = var15.cg.V().d(var7.getWorldLocation());
        if (W.lIIIIIIIIllIIll(var20, var1) && W.lIIIIIIIIlIllll(var14.contains(var20) ? 1 : 0)) {
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIlIllll(var22.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), var7.getWorldArea()) ? 1 : 0)) {
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIllIlII(var8.ak(), var7.getWorldLocation().distanceTo(var22.getWorldLocation()))) {
            bl = llIIlllllIll[1];
            0;
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

    private static String lIIIIIIIIlIlIlI(String var4, String var6) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIIlllllIll[4]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(llIIlllllIll[5], var9);
            return new String(var16.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
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
        int var3;
        int n2;
        void var12;
        W var5;
        Player player = Players.getLocal();
        if (!W.lIIIIIIIIlIllIl(player) || W.lIIIIIIIIlIlllI(Vars.getBit((int)llIIlllllIll[0]), llIIlllllIll[1])) {
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIlIllll(Prayers.getPoints())) {
            Item var19 = Inventory.getFirst(item -> e.aI.contains(item.getId()));
            if (W.lIIIIIIIIllIIII(var19)) {
                return llIIlllllIll[2];
            }
            var19.interact(llIIlllllIlI[llIIlllllIll[2]]);
            return llIIlllllIll[2];
        }
        if (!W.lIIIIIIIIllIIIl(var5.cg.A() ? 1 : 0) || !W.lIIIIIIIIlIllIl(var5.cg.V()) || W.lIIIIIIIIllIIIl(var5.cg.V().av().e(var12.getWorldLocation()) ? 1 : 0)) {
            if (W.lIIIIIIIIllIIIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return llIIlllllIll[1];
            }
            return llIIlllllIll[2];
        }
        Prayer var19 = var5.bJ();
        if (W.lIIIIIIIIlIllIl(var19)) {
            if (W.lIIIIIIIIllIIIl(var5.cf.flickMonsters() ? 1 : 0)) {
                Prayers.flick(List.of(var19));
                0;
                return llIIlllllIll[1];
            }
            if (W.lIIIIIIIIlIllll(Prayers.isEnabled((Prayer)var19) ? 1 : 0)) {
                Prayers.toggle((Prayer)var19);
                return llIIlllllIll[1];
            }
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIlIllll(NPCs.getAll(arg_0 -> W.c((Player)var12, arg_0)).isEmpty() ? 1 : 0)) {
            n2 = llIIlllllIll[1];
            0;
            if ((161 + 85 - 236 + 188 ^ 167 + 13 - 98 + 112) <= -1) {
                return ((0x3F ^ 0x2D ^ (0xA2 ^ 0x94)) & (0x2D ^ 0x30 ^ (0x5F ^ 0x66) ^ -1)) != 0;
            }
        } else {
            n2 = llIIlllllIll[2];
        }
        if (W.lIIIIIIIIllIIIl(var3 = n2)) {
            List<Prayer> var18 = List.of(Prayer.PROTECT_FROM_MELEE);
            if (W.lIIIIIIIIllIIIl(var5.cf.flickMonsters() ? 1 : 0)) {
                Prayers.flick(var18);
                0;
                return llIIlllllIll[1];
            }
            if (W.lIIIIIIIIlIllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                return llIIlllllIll[1];
            }
            0;
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

    private static /* synthetic */ boolean c(Player player, NPC nPC) {
        int n2;
        if (W.lIIIIIIIIlIllll(nPC.isDead() ? 1 : 0) && W.lIIIIIIIIllIlIl(nPC.getWorldLocation().distanceTo(player.getWorldLocation()), llIIlllllIll[3]) && W.lIIIIIIIIllIIlI(nPC.getInteracting(), player) && W.lIIIIIIIIllIIIl(nPC.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), player.getWorldLocation()) ? 1 : 0)) {
            n2 = llIIlllllIll[1];
            0;
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
        W.llIIlllllIlI[W.llIIlllllIll[2]] = W."Drink";
    }

    private static boolean lIIIIIIIIlIllIl(Object object) {
        return object != null;
    }

    private static void lIIIIIIIIlIllII() {
        llIIlllllIll = new int[6];
        W.llIIlllllIll[0] = -(0xFFFFF1EB & 0x4E35) & (0xFFFFFBFF & 0x67F9);
        W.llIIlllllIll[1] = 1;
        W.llIIlllllIll[2] = (0x90 ^ 0xBB) & ~(0xAF ^ 0x84);
        W.llIIlllllIll[3] = 3;
        W.llIIlllllIll[4] = 0x27 ^ 0x2F;
        W.llIIlllllIll[5] = 2;
    }

    @Inject
    public W(GauntletConfig gauntletConfig, c c2) {
        this.cf = gauntletConfig;
        this.cg = c2;
    }

    /*
     * WARNING - void declaration
     */
    private Prayer bJ() {
        void var5_5;
        void var11;
        W var10;
        Player player = Players.getLocal();
        if (W.lIIIIIIIIllIIII(player)) {
            return null;
        }
        l var23 = var10.cg.V().d(var11.getWorldLocation());
        if (W.lIIIIIIIIllIIII(var23)) {
            return null;
        }
        List<l> var13 = var10.cg.V().c(var23);
        NPC var17 = NPCs.getNearest(arg_0 -> var10.a((Player)var11, var23, var13, arg_0));
        if (W.lIIIIIIIIllIIII(var17)) {
            return null;
        }
        g var2 = g.i(var17.getId());
        if (W.lIIIIIIIIllIIII((Object)var2)) {
            return null;
        }
        return var5_5.ai();
    }
}

