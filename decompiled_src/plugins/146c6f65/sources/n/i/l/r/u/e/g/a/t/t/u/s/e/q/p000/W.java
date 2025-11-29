package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

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
@TaskDesc(name = "Handling prayers", priority = 100)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.W  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/W.class */
public class W extends Task {
    private final /* synthetic */ C0002c cg;
    private final /* synthetic */ GauntletConfig cf;
    private static /* synthetic */ String[] llIIlllllIlI;
    private static /* synthetic */ int[] llIIlllllIll;

    private static boolean lIIIIIIIIlIlllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIIIIIIllIIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIIIllIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIIIIIIllIlIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIIIIIIllIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIIIIIIIllIIII(Object obj) {
        return obj == null;
    }

    private static String lIIIIIIIIlIlIlI(String lllllllllllllllIlIIIllllIlIlIlll, String lllllllllllllllIlIIIllllIlIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllllIlIlIllI.getBytes(StandardCharsets.UTF_8)), llIIlllllIll[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlllllIll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllllIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIllllIlIllIII) {
            lllllllllllllllIlIIIllllIlIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIIlIllll(int i) {
        return i == 0;
    }

    static {
        lIIIIIIIIlIllII();
        lIIIIIIIIlIlIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    public boolean run() {
        int i;
        Player local = Players.getLocal();
        if (!lIIIIIIIIlIllIl(local) || lIIIIIIIIlIlllI(Vars.getBit(llIIlllllIll[0]), llIIlllllIll[1])) {
            return llIIlllllIll[2];
        }
        if (lIIIIIIIIlIllll(Prayers.getPoints())) {
            Item first = Inventory.getFirst(item -> {
                return C0004e.aI.contains(Integer.valueOf(item.getId()));
            });
            if (lIIIIIIIIllIIII(first)) {
                return llIIlllllIll[2];
            }
            first.interact(llIIlllllIlI[llIIlllllIll[2]]);
            return llIIlllllIll[2];
        } else if (!lIIIIIIIIllIIIl(this.cg.A() ? 1 : 0) || !lIIIIIIIIlIllIl(this.cg.V()) || lIIIIIIIIllIIIl(this.cg.V().av().e(local.getWorldLocation()) ? 1 : 0)) {
            if (lIIIIIIIIllIIIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return llIIlllllIll[1];
            }
            return llIIlllllIll[2];
        } else {
            Prayer bJ = bJ();
            if (lIIIIIIIIlIllIl(bJ)) {
                if (lIIIIIIIIllIIIl(this.cf.flickMonsters() ? 1 : 0)) {
                    Prayers.flick(List.of(bJ));
                    "".length();
                    return llIIlllllIll[1];
                } else if (lIIIIIIIIlIllll(Prayers.isEnabled(bJ) ? 1 : 0)) {
                    Prayers.toggle(bJ);
                    return llIIlllllIll[1];
                } else {
                    return llIIlllllIll[2];
                }
            }
            if (lIIIIIIIIlIllll(NPCs.getAll(npc -> {
                if (lIIIIIIIIlIllll(npc.isDead() ? 1 : 0) && lIIIIIIIIllIlIl(npc.getWorldLocation().distanceTo(local.getWorldLocation()), llIIlllllIll[3]) && lIIIIIIIIllIIlI(npc.getInteracting(), local) && lIIIIIIIIllIIIl(npc.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), local.getWorldLocation()) ? 1 : 0)) {
                    ?? r0 = llIIlllllIll[1];
                    "".length();
                    return ((33 ^ 50) & ((51 ^ 32) ^ (-1))) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlllllIll[2];
            }).isEmpty() ? 1 : 0)) {
                i = llIIlllllIll[1];
                "".length();
                if (((((161 + 85) - 236) + 188) ^ (((167 + 13) - 98) + 112)) <= (-" ".length())) {
                    return ((63 ^ 45) ^ (162 ^ 148)) & (((45 ^ 48) ^ (95 ^ 102)) ^ (-" ".length()));
                }
            } else {
                i = llIIlllllIll[2];
            }
            if (!lIIIIIIIIllIIIl(i)) {
                Prayers.disableAll();
                return llIIlllllIll[1];
            }
            List of = List.of(Prayer.PROTECT_FROM_MELEE);
            if (lIIIIIIIIllIIIl(this.cf.flickMonsters() ? 1 : 0)) {
                Prayers.flick(of);
                "".length();
                return llIIlllllIll[1];
            } else if (lIIIIIIIIlIllll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                return llIIlllllIll[1];
            } else {
                "".length();
                return (((76 ^ 35) ^ (40 ^ 18)) & (((((207 + 14) - 11) + 16) ^ (((130 + 35) - 112) + 130)) ^ (-" ".length()))) != 0 ? ((((102 + 17) - (-2)) + 51) ^ (((119 + 30) - 85) + 75)) & (((166 ^ 199) ^ (11 ^ 77)) ^ (-" ".length())) : llIIlllllIll[2];
            }
        }
    }

    private static boolean lIIIIIIIIllIlII(int i, int i2) {
        return i >= i2;
    }

    private static void lIIIIIIIIlIlIll() {
        llIIlllllIlI = new String[llIIlllllIll[1]];
        llIIlllllIlI[llIIlllllIll[2]] = lIIIIIIIIlIlIlI("7g8YrwPrKzY=", "ugxdF");
    }

    private static boolean lIIIIIIIIlIllIl(Object obj) {
        return obj != null;
    }

    private static void lIIIIIIIIlIllII() {
        llIIlllllIll = new int[6];
        llIIlllllIll[0] = (-((-3605) & 20021)) & (-1025) & 26617;
        llIIlllllIll[1] = " ".length();
        llIIlllllIll[2] = (144 ^ 187) & ((175 ^ 132) ^ (-1));
        llIIlllllIll[3] = "   ".length();
        llIIlllllIll[4] = 39 ^ 47;
        llIIlllllIll[5] = "  ".length();
    }

    @Inject
    public W(GauntletConfig gauntletConfig, C0002c c0002c) {
        this.cf = gauntletConfig;
        this.cg = c0002c;
    }

    private Prayer bJ() {
        Player local = Players.getLocal();
        if (lIIIIIIIIllIIII(local)) {
            return null;
        }
        C0011l d = this.cg.V().d(local.getWorldLocation());
        if (lIIIIIIIIllIIII(d)) {
            return null;
        }
        List<C0011l> c = this.cg.V().c(d);
        NPC nearest = NPCs.getNearest(npc -> {
            EnumC0006g i = EnumC0006g.i(npc.getId());
            if (lIIIIIIIIllIIII(i)) {
                return llIIlllllIll[2];
            }
            if (lIIIIIIIIllIIlI(local.getInteracting(), npc)) {
                return llIIlllllIll[1];
            }
            C0011l d2 = this.cg.V().d(npc.getWorldLocation());
            if ((!lIIIIIIIIllIIll(d2, d) || !lIIIIIIIIlIllll(c.contains(d2) ? 1 : 0)) && !lIIIIIIIIlIllll(local.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), npc.getWorldArea()) ? 1 : 0) && lIIIIIIIIllIlII(i.ak(), npc.getWorldLocation().distanceTo(local.getWorldLocation()))) {
                ?? r0 = llIIlllllIll[1];
                "".length();
                return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlllllIll[2];
        });
        if (lIIIIIIIIllIIII(nearest)) {
            return null;
        }
        EnumC0006g i = EnumC0006g.i(nearest.getId());
        if (lIIIIIIIIllIIII(i)) {
            return null;
        }
        return i.ai();
    }
}
