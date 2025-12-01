package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.NPC;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
@TaskDesc(name = "Specing Corp")
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.r  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/r.class */
public class r extends a {
    @Inject

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ s f3a;
    private static /* synthetic */ int[] lIlIlllIlllI;
    @Inject
    private /* synthetic */ SquireCorp p;
    private static /* synthetic */ String[] lIlIlllIllIl;

    private static boolean lllIIIlIIIIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllIIIlIIIIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIIIlllllII(int i) {
        return i == 0;
    }

    private static boolean lllIIIIlllllll(Object obj) {
        return obj == null;
    }

    private static boolean lllIIIlIIIIIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllIIIIlllllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    public boolean run() {
        if (lllIIIIlllllII(g() ? 1 : 0)) {
            return lIlIlllIlllI[0];
        }
        NPC f = f();
        if (lllIIIIlllllIl(f) && lllIIIIllllllI(Reachable.isInteractable(f) ? 1 : 0) && !lllIIIIllllllI(f.isDead() ? 1 : 0)) {
            if (lllIIIIlllllIl(Players.getNearest(player -> {
                if (lllIIIlIIIIIlI(player, Players.getLocal()) && lllIIIlIIIIIll(player.getInteracting(), f) && lllIIIIlllllII(player.isFriend() ? 1 : 0)) {
                    ?? r0 = lIlIlllIlllI[1];
                    "".length();
                    return " ".length() != " ".length() ? ((179 ^ 157) ^ (90 ^ 102)) & (((74 ^ 3) ^ (39 ^ 124)) ^ (-" ".length())) : r0;
                }
                return lIlIlllIlllI[0];
            }))) {
                this.p.c(lIlIlllIlllI[1]);
                return lIlIlllIlllI[0];
            }
            EquipmentSetup t = this.f3a.t();
            if (lllIIIIlllllll(t)) {
                return lIlIlllIlllI[0];
            }
            if (!lllIIIlIIIIIII(Combat.getSpecEnergy(), lIlIlllIlllI[2]) || lllIIIlIIIIIIl(Combat.getCurrentHealth(), lIlIlllIlllI[3])) {
                TeleportLoader.enterHouse();
                "".length();
                return lIlIlllIlllI[0];
            } else if (lllIIIIlllllII(Gear.isEquipped(t.getIds()) ? 1 : 0)) {
                Gear.swapTo(t);
                "".length();
                return lIlIlllIlllI[1];
            } else {
                if (lllIIIIlllllII(Combat.isSpecEnabled() ? 1 : 0)) {
                    Combat.toggleSpec();
                }
                f.interact(lIlIlllIllIl[lIlIlllIlllI[0]]);
                this.p.b(lIlIlllIlllI[1]);
                return lIlIlllIlllI[1];
            }
        }
        return lIlIlllIlllI[0];
    }

    private static void lllIIIIllllIlI() {
        lIlIlllIllIl = new String[lIlIlllIlllI[1]];
        lIlIlllIllIl[lIlIlllIlllI[0]] = lllIIIIllllIIl("NhUELS8c", "wapLL");
    }

    static {
        lllIIIIllllIll();
        lllIIIIllllIlI();
    }

    private static void lllIIIIllllIll() {
        lIlIlllIlllI = new int[4];
        lIlIlllIlllI[0] = (55 ^ 31) & ((124 ^ 84) ^ (-1));
        lIlIlllIlllI[1] = " ".length();
        lIlIlllIlllI[2] = 33 ^ 19;
        lIlIlllIlllI[3] = (((15 + 42) - (-4)) + 95) ^ (((106 + 74) - 57) + 54);
    }

    private static String lllIIIIllllIIl(String lllllllllllllllIllIIIlllllIIIIll, String lllllllllllllllIllIIIlllllIIIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIlllllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIlllllIIIIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIIlllllIIIIlI.toCharArray();
        int lllllllllllllllIllIIIllllIllllll = lIlIlllIlllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIlllIlllI[0];
        while (lllIIIlIIIIIIl(i, length)) {
            char lllllllllllllllIllIIIlllllIIIlII = charArray2[i];
            lllllllllllllllIllIIIlllllIIIIIl.append((char) (lllllllllllllllIllIIIlllllIIIlII ^ charArray[lllllllllllllllIllIIIllllIllllll % charArray.length]));
            "".length();
            lllllllllllllllIllIIIllllIllllll++;
            i++;
            "".length();
            if ((((((3 + 20) - (-127)) + 0) ^ (((10 + 29) - (-98)) + 9)) & (((126 ^ 19) ^ (94 ^ 55)) ^ (-" ".length()))) < (((251 ^ 191) ^ (62 ^ 119)) & (((24 ^ 83) ^ (93 ^ 27)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIIlllllIIIIIl);
    }

    private static boolean lllIIIIllllllI(int i) {
        return i != 0;
    }

    private static boolean lllIIIlIIIIIll(Object obj, Object obj2) {
        return obj == obj2;
    }
}
