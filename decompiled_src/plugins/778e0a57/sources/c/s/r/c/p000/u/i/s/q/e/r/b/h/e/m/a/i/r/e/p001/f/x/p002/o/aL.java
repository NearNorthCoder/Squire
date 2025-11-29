package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Trying Olm HEAD", priority = 21000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aL  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aL.class */
public class aL extends aR {
    private static /* synthetic */ int[] lIlIllIllIII;
    private static /* synthetic */ String[] lIlIllIlIlll;

    static {
        lllIIIIIllIIll();
        lllIIIIIllIIlI();
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public EquipmentSetup cj() {
        return C0044s.bc();
    }

    private static boolean lllIIIIIllIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean lllIIIIIllIlII(int i) {
        return i == 0;
    }

    private static String lllIIIIIllIIIl(String lllllllllllllllIllIIlIIlllllIlII, String lllllllllllllllIllIIlIIlllllIIll) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIlllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIlllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIllIII[3], lllllllllllllllIllIIlIIlllllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIlllllIlIl) {
            lllllllllllllllIllIIlIIlllllIlIl.printStackTrace();
            return null;
        }
    }

    private static String lllIIIIIllIIII(String lllllllllllllllIllIIlIIllllIIlll, String lllllllllllllllIllIIlIIllllIIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIllllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIllllIIllI.getBytes(StandardCharsets.UTF_8)), lIlIllIllIII[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIllIII[3], lllllllllllllllIllIIlIIllllIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIllllIlIII) {
            lllllllllllllllIllIIlIIllllIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIIlllIII(Object obj) {
        return obj != null;
    }

    private static boolean lllIIIIIllIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v47, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public boolean cg() {
        if (lllIIIIIllIlII(ct() ? 1 : 0)) {
            if (lllIIIIIllIlIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIlIllIllIII[0];
            }
            return lIlIllIllIII[1];
        } else if (lllIIIIIllIlII(this.ed.at() ? 1 : 0)) {
            return lIlIllIllIII[1];
        } else {
            if (!lllIIIIIllIlII(ds() ? 1 : 0) || lllIIIIIllIlIl(du() ? 1 : 0)) {
                return lIlIllIllIII[1];
            }
            cm();
            NPC nearest = NPCs.getNearest(npc -> {
                if (lllIIIIIllIlIl(npc.getName().equals(lIlIllIlIlll[lIlIllIllIII[3]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIllIllIII[0]];
                    strArr[lIlIllIllIII[1]] = lIlIllIlIlll[lIlIllIllIII[4]];
                    if (lllIIIIIllIlIl(npc.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIlIllIllIII[0];
                        "".length();
                        return (-"  ".length()) >= 0 ? ((26 ^ 51) ^ (235 ^ 142)) & (((((106 + 173) - 111) + 61) ^ (((91 + 164) - 99) + 13)) ^ (-" ".length())) : r0;
                    }
                }
                return lIlIllIllIII[1];
            });
            if (lllIIIIIllIllI(nearest)) {
                return lIlIllIllIII[1];
            }
            List<WorldPoint> dH = dH();
            System.out.println("Turn: " + dI() + " | " + this.ed.az() + " | direction: " + this.ed.am());
            if (lllIIIIIllIlIl(dI() ? 1 : 0)) {
                String k = k(lIlIllIllIII[1]);
                if (!lllIIIIIllIlII(k.equals(lIlIllIlIlll[lIlIllIllIII[1]]) ? 1 : 0) || lllIIIIIllIlIl(k.equals(lIlIllIlIlll[lIlIllIllIII[0]]) ? 1 : 0)) {
                    dH = m(k);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (GraphicsObject graphicsObject : this.ec.getGraphicsObjects()) {
                if (lllIIIIIllIlll(graphicsObject.getId(), lIlIllIllIII[2])) {
                    arrayList.addAll(WorldPoint.fromLocal(this.ec, graphicsObject.getLocation()).createWorldArea(lIlIllIllIII[0]).toWorldPointList());
                    "".length();
                }
                "".length();
                if (!(true ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            if (!lllIIIIIllIlII(dH.contains(this.bS.getWorldLocation()) ? 1 : 0)) {
                dr();
                "".length();
                return lIlIllIllIII[0];
            }
            WorldPoint orElse = dH.stream().filter(worldPoint -> {
                if (lllIIIIIllIlIl(Reachable.isWalkable(worldPoint) ? 1 : 0) && lllIIIIIllIlII(this.ed.ap().contains(worldPoint) ? 1 : 0) && lllIIIIIllIlII(arrayList.contains(worldPoint) ? 1 : 0)) {
                    ?? r0 = lIlIllIllIII[0];
                    "".length();
                    return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIllIllIII[1];
            }).min(Comparator.comparingDouble(worldPoint2 -> {
                return worldPoint2.distanceTo2DHypotenuse(this.bS.getWorldLocation());
            })).orElse(null);
            if (!lllIIIIIlllIII(Movement.getDestination()) || !lllIIIIIllIlIl(Movement.getDestination().equals(orElse) ? 1 : 0)) {
                Movement.setDestination(orElse);
                return lIlIllIllIII[0];
            }
            WorldPoint worldPoint3 = (WorldPoint) this.bS.getWorldLocation().createWorldArea(lIlIllIllIII[3]).toWorldPointList().stream().filter(worldPoint4 -> {
                if (lllIIIIIllIlIl(Reachable.isWalkable(worldPoint4) ? 1 : 0) && lllIIIIIllIlII(this.ed.ap().contains(worldPoint4) ? 1 : 0) && lllIIIIIllIlII(arrayList.contains(worldPoint4) ? 1 : 0)) {
                    ?? r0 = lIlIllIllIII[0];
                    "".length();
                    return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIllIllIII[1];
            }).min(Comparator.comparingDouble(obj -> {
                return ((WorldPoint) obj).distanceTo2DHypotenuse(orElse);
            }).thenComparingDouble(obj2 -> {
                return nearest.getWorldArea().distanceTo((WorldPoint) obj2);
            })).orElse(null);
            if (!lllIIIIIlllIII(worldPoint3) || lllIIIIIllIlll(worldPoint3.getWorldX(), orElse.getWorldX())) {
                return lIlIllIllIII[1];
            }
            Movement.setDestination(worldPoint3);
            return lIlIllIllIII[0];
        }
    }

    private static void lllIIIIIllIIlI() {
        lIlIllIlIlll = new String[lIlIllIllIII[5]];
        lIlIllIlIlll[lIlIllIllIII[1]] = lllIIIIIllIIII("TatWXG72tMQ=", "SWcbK");
        lIlIllIlIlll[lIlIllIllIII[0]] = lllIIIIIllIIIl("wm5KooxFkWw=", "kNZjS");
        lIlIllIlIlll[lIlIllIllIII[3]] = lllIIIIIllIIII("/lMOh7W8YNQtnBnWJyY95g==", "LcXsE");
        lIlIllIlIlll[lIlIllIllIII[4]] = lllIIIIIllIIIl("1AxvR7Mzxww=", "fOyHb");
    }

    private static boolean lllIIIIIllIlIl(int i) {
        return i != 0;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        Prayer aE = this.ed.aE();
        if (lllIIIIIllIllI(aE)) {
            aE = Prayer.PROTECT_FROM_MAGIC;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(aE);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }

    @Inject
    protected aL(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void lllIIIIIllIIll() {
        lIlIllIllIII = new int[7];
        lIlIllIllIII[0] = " ".length();
        lIlIllIllIII[1] = (84 ^ 78) & ((86 ^ 76) ^ (-1));
        lIlIllIllIII[2] = (-16985) & 18431;
        lIlIllIllIII[3] = "  ".length();
        lIlIllIllIII[4] = "   ".length();
        lIlIllIllIII[5] = 55 ^ 51;
        lIlIllIllIII[6] = (75 ^ 103) ^ (47 ^ 11);
    }
}
