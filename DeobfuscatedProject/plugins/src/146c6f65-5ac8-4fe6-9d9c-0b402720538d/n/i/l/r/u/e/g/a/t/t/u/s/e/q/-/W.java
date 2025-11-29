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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.g;
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
public class W
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
        void lllllllllllllllIlIIIllllIllIIlII;
        void lllllllllllllllIlIIIllllIllIIllI;
        void lllllllllllllllIlIIIllllIllIIlll;
        W lllllllllllllllIlIIIllllIllIlIIl;
        void lllllllllllllllIlIIIllllIllIIlIl;
        void lllllllllllllllIlIIIllllIllIlIII;
        g g2 = g.i(nPC.getId());
        if (W.lIIIIIIIIllIIII((Object)g2)) {
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIllIIlI(lllllllllllllllIlIIIllllIllIlIII.getInteracting(), lllllllllllllllIlIIIllllIllIIlIl)) {
            return llIIlllllIll[1];
        }
        l lllllllllllllllIlIIIllllIllIIIll = lllllllllllllllIlIIIllllIllIlIIl.cg.V().d(lllllllllllllllIlIIIllllIllIIlIl.getWorldLocation());
        if (W.lIIIIIIIIllIIll(lllllllllllllllIlIIIllllIllIIIll, lllllllllllllllIlIIIllllIllIIlll) && W.lIIIIIIIIlIllll(lllllllllllllllIlIIIllllIllIIllI.contains(lllllllllllllllIlIIIllllIllIIIll) ? 1 : 0)) {
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIlIllll(lllllllllllllllIlIIIllllIllIlIII.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), lllllllllllllllIlIIIllllIllIIlIl.getWorldArea()) ? 1 : 0)) {
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIllIlII(lllllllllllllllIlIIIllllIllIIlII.ak(), lllllllllllllllIlIIIllllIllIIlIl.getWorldLocation().distanceTo(lllllllllllllllIlIIIllllIllIlIII.getWorldLocation()))) {
            bl = llIIlllllIll[1];
            "".length();
            if ("  ".length() <= 0) {
                return ((0x84 ^ 0xA2) & ~(0x13 ^ 0x35)) != 0;
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

    private static String lIIIIIIIIlIlIlI(String lllllllllllllllIlIIIllllIlIlIlIl, String lllllllllllllllIlIIIllllIlIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllllIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllllIlIlIllI.getBytes(StandardCharsets.UTF_8)), llIIlllllIll[4]), "DES");
            Cipher lllllllllllllllIlIIIllllIlIllIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIIllllIlIllIIl.init(llIIlllllIll[5], lllllllllllllllIlIIIllllIlIllIlI);
            return new String(lllllllllllllllIlIIIllllIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllllIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIllllIlIllIII) {
            lllllllllllllllIlIIIllllIlIllIII.printStackTrace();
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
        int lllllllllllllllIlIIIllllIllllllI;
        int n2;
        void lllllllllllllllIlIIIlllllIIIIIII;
        W lllllllllllllllIlIIIlllllIIIIIIl;
        Player player = Players.getLocal();
        if (!W.lIIIIIIIIlIllIl(player) || W.lIIIIIIIIlIlllI(Vars.getBit((int)llIIlllllIll[0]), llIIlllllIll[1])) {
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIlIllll(Prayers.getPoints())) {
            Item lllllllllllllllIlIIIllllIlllllll = Inventory.getFirst(item -> e.aI.contains(item.getId()));
            if (W.lIIIIIIIIllIIII(lllllllllllllllIlIIIllllIlllllll)) {
                return llIIlllllIll[2];
            }
            lllllllllllllllIlIIIllllIlllllll.interact(llIIlllllIlI[llIIlllllIll[2]]);
            return llIIlllllIll[2];
        }
        if (!W.lIIIIIIIIllIIIl(lllllllllllllllIlIIIlllllIIIIIIl.cg.A() ? 1 : 0) || !W.lIIIIIIIIlIllIl(lllllllllllllllIlIIIlllllIIIIIIl.cg.V()) || W.lIIIIIIIIllIIIl(lllllllllllllllIlIIIlllllIIIIIIl.cg.V().av().e(lllllllllllllllIlIIIlllllIIIIIII.getWorldLocation()) ? 1 : 0)) {
            if (W.lIIIIIIIIllIIIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return llIIlllllIll[1];
            }
            return llIIlllllIll[2];
        }
        Prayer lllllllllllllllIlIIIllllIlllllll = lllllllllllllllIlIIIlllllIIIIIIl.bJ();
        if (W.lIIIIIIIIlIllIl(lllllllllllllllIlIIIllllIlllllll)) {
            if (W.lIIIIIIIIllIIIl(lllllllllllllllIlIIIlllllIIIIIIl.cf.flickMonsters() ? 1 : 0)) {
                Prayers.flick(List.of(lllllllllllllllIlIIIllllIlllllll));
                "".length();
                return llIIlllllIll[1];
            }
            if (W.lIIIIIIIIlIllll(Prayers.isEnabled((Prayer)lllllllllllllllIlIIIllllIlllllll) ? 1 : 0)) {
                Prayers.toggle((Prayer)lllllllllllllllIlIIIllllIlllllll);
                return llIIlllllIll[1];
            }
            return llIIlllllIll[2];
        }
        if (W.lIIIIIIIIlIllll(NPCs.getAll(arg_0 -> W.c((Player)lllllllllllllllIlIIIlllllIIIIIII, arg_0)).isEmpty() ? 1 : 0)) {
            n2 = llIIlllllIll[1];
            "".length();
            if ((161 + 85 - 236 + 188 ^ 167 + 13 - 98 + 112) <= -" ".length()) {
                return ((0x3F ^ 0x2D ^ (0xA2 ^ 0x94)) & (0x2D ^ 0x30 ^ (0x5F ^ 0x66) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIIlllllIll[2];
        }
        if (W.lIIIIIIIIllIIIl(lllllllllllllllIlIIIllllIllllllI = n2)) {
            List<Prayer> lllllllllllllllIlIIIllllIlllllIl = List.of(Prayer.PROTECT_FROM_MELEE);
            if (W.lIIIIIIIIllIIIl(lllllllllllllllIlIIIlllllIIIIIIl.cf.flickMonsters() ? 1 : 0)) {
                Prayers.flick(lllllllllllllllIlIIIllllIlllllIl);
                "".length();
                return llIIlllllIll[1];
            }
            if (W.lIIIIIIIIlIllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                return llIIlllllIll[1];
            }
            "".length();
            if (((0x4C ^ 0x23 ^ (0x28 ^ 0x12)) & (207 + 14 - 11 + 16 ^ 130 + 35 - 112 + 130 ^ -" ".length())) != 0) {
                return ((102 + 17 - -2 + 51 ^ 119 + 30 - 85 + 75) & (0xA6 ^ 0xC7 ^ (0xB ^ 0x4D) ^ -" ".length())) != 0;
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
            "".length();
            if (((0x21 ^ 0x32) & ~(0x33 ^ 0x20)) == " ".length()) {
                return ((0x74 ^ 0x34) & ~(0x22 ^ 0x62)) != 0;
            }
        } else {
            n2 = llIIlllllIll[2];
        }
        return n2 != 0;
    }

    private static void lIIIIIIIIlIlIll() {
        llIIlllllIlI = new String[llIIlllllIll[1]];
        W.llIIlllllIlI[W.llIIlllllIll[2]] = W.lIIIIIIIIlIlIlI("7g8YrwPrKzY=", "ugxdF");
    }

    private static boolean lIIIIIIIIlIllIl(Object object) {
        return object != null;
    }

    private static void lIIIIIIIIlIllII() {
        llIIlllllIll = new int[6];
        W.llIIlllllIll[0] = -(0xFFFFF1EB & 0x4E35) & (0xFFFFFBFF & 0x67F9);
        W.llIIlllllIll[1] = " ".length();
        W.llIIlllllIll[2] = (0x90 ^ 0xBB) & ~(0xAF ^ 0x84);
        W.llIIlllllIll[3] = "   ".length();
        W.llIIlllllIll[4] = 0x27 ^ 0x2F;
        W.llIIlllllIll[5] = "  ".length();
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
        void lllllllllllllllIlIIIllllIlllIlIl;
        W lllllllllllllllIlIIIllllIlllIllI;
        Player player = Players.getLocal();
        if (W.lIIIIIIIIllIIII(player)) {
            return null;
        }
        l lllllllllllllllIlIIIllllIlllIlII = lllllllllllllllIlIIIllllIlllIllI.cg.V().d(lllllllllllllllIlIIIllllIlllIlIl.getWorldLocation());
        if (W.lIIIIIIIIllIIII(lllllllllllllllIlIIIllllIlllIlII)) {
            return null;
        }
        List<l> lllllllllllllllIlIIIllllIlllIIll = lllllllllllllllIlIIIllllIlllIllI.cg.V().c(lllllllllllllllIlIIIllllIlllIlII);
        NPC lllllllllllllllIlIIIllllIlllIIlI = NPCs.getNearest(arg_0 -> lllllllllllllllIlIIIllllIlllIllI.a((Player)lllllllllllllllIlIIIllllIlllIlIl, lllllllllllllllIlIIIllllIlllIlII, lllllllllllllllIlIIIllllIlllIIll, arg_0));
        if (W.lIIIIIIIIllIIII(lllllllllllllllIlIIIllllIlllIIlI)) {
            return null;
        }
        g lllllllllllllllIlIIIllllIlllIIIl = g.i(lllllllllllllllIlIIIllllIlllIIlI.getId());
        if (W.lIIIIIIIIllIIII((Object)lllllllllllllllIlIIIllllIlllIIIl)) {
            return null;
        }
        return var5_5.ai();
    }
}

