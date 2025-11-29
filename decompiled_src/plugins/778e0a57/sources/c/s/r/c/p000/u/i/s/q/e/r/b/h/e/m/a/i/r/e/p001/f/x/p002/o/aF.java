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
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
@TaskDesc(name = "Vasa", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aF  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aF.class */
public class aF extends U {
    private /* synthetic */ int dB;
    private /* synthetic */ NPC dQ;
    private /* synthetic */ WorldPoint dR;
    private /* synthetic */ C0039n ak;
    private /* synthetic */ int am;
    private /* synthetic */ C0039n al;
    private static /* synthetic */ int[] lIlIIIIIIIlI;
    private /* synthetic */ NPC dP;
    private static /* synthetic */ String[] lIlIIIIIIIIl;

    private static void llIlIIlllIIIIl() {
        lIlIIIIIIIIl = new String[lIlIIIIIIIlI[25]];
        lIlIIIIIIIIl[lIlIIIIIIIlI[1]] = llIlIIllIllllI("AUc+z2d5n/8=", "YYgCO");
        lIlIIIIIIIIl[lIlIIIIIIIlI[2]] = llIlIIllIlllll("S2Tn/Tp1S/M=", "YtMGt");
        lIlIIIIIIIIl[lIlIIIIIIIlI[4]] = llIlIIllIllllI("xmHx/7M/LCOsTG6xZiwwF8YwkaakvUt6ijQ1bZbJcQU=", "QIBdi");
        lIlIIIIIIIIl[lIlIIIIIIIlI[6]] = llIlIIllIlllll("auZ++SoxCP0=", "VEnQF");
        lIlIIIIIIIIl[lIlIIIIIIIlI[7]] = llIlIIlllIIIII("OBAnEzcSDT0V", "ydSrT");
        lIlIIIIIIIIl[lIlIIIIIIIlI[9]] = llIlIIllIllllI("EvDr7CYUNy4=", "dIrDw");
        lIlIIIIIIIIl[lIlIIIIIIIlI[10]] = llIlIIllIlllll("wnHxI9SVW8EKsrWyrUotaQ==", "uVxsP");
        lIlIIIIIIIIl[lIlIIIIIIIlI[13]] = llIlIIllIllllI("PJ/qZK4l9I9uNCM8kh50wA==", "kqIWQ");
        lIlIIIIIIIIl[lIlIIIIIIIlI[14]] = llIlIIllIlllll("xNsWHFTPia8=", "ieATc");
        lIlIIIIIIIIl[lIlIIIIIIIlI[15]] = llIlIIllIllllI("uHZkA3U10Gg=", "NyNjo");
        lIlIIIIIIIIl[lIlIIIIIIIlI[16]] = llIlIIlllIIIII("HSIhGjZiNA==", "EGSsU");
        lIlIIIIIIIIl[lIlIIIIIIIlI[17]] = llIlIIlllIIIII("MBAlJw==", "VyWBQ");
        lIlIIIIIIIIl[lIlIIIIIIIlI[18]] = llIlIIlllIIIII("DyQnBQE=", "LVHvr");
        lIlIIIIIIIIl[lIlIIIIIIIlI[19]] = llIlIIllIllllI("o3RMpUjwksw=", "bgZvi");
        lIlIIIIIIIIl[lIlIIIIIIIlI[20]] = llIlIIllIllllI("xetxJR7puW4=", "GaETv");
        lIlIIIIIIIIl[lIlIIIIIIIlI[3]] = llIlIIllIllllI("LDH6s8xAlhpdVaXlXBc9xQ==", "nqLaV");
        lIlIIIIIIIIl[lIlIIIIIIIlI[5]] = llIlIIllIlllll("ltEBvqTDbxI=", "VTcFF");
        lIlIIIIIIIIl[lIlIIIIIIIlI[21]] = llIlIIlllIIIII("JTkUKjcSPQ==", "uXgYV");
        lIlIIIIIIIIl[lIlIIIIIIIlI[22]] = llIlIIlllIIIII("NiY1JgQ=", "sHACv");
        lIlIIIIIIIIl[lIlIIIIIIIlI[23]] = llIlIIllIlllll("67WXCjnCVhc=", "mLSUP");
        lIlIIIIIIIIl[lIlIIIIIIIlI[24]] = llIlIIlllIIIII("ECglJBw=", "BGFOo");
    }

    private static void llIlIIlllIIIlI() {
        lIlIIIIIIIlI = new int[26];
        lIlIIIIIIIlI[0] = -" ".length();
        lIlIIIIIIIlI[1] = ((181 ^ 135) ^ (148 ^ 135)) & (((58 ^ 0) ^ (64 ^ 91)) ^ (-" ".length()));
        lIlIIIIIIIlI[2] = " ".length();
        lIlIIIIIIIlI[3] = (223 ^ 151) ^ (243 ^ 180);
        lIlIIIIIIIlI[4] = "  ".length();
        lIlIIIIIIIlI[5] = 69 ^ 85;
        lIlIIIIIIIlI[6] = "   ".length();
        lIlIIIIIIIlI[7] = 167 ^ 163;
        lIlIIIIIIIlI[8] = (-((-19965) & 32765)) & (-18505) & 32633;
        lIlIIIIIIIlI[9] = 175 ^ 170;
        lIlIIIIIIIlI[10] = (170 ^ 176) ^ (167 ^ 187);
        lIlIIIIIIIlI[11] = (-((-6385) & 15609)) & (-545) & 32746;
        lIlIIIIIIIlI[12] = (-3) & 11891;
        lIlIIIIIIIlI[13] = (6 ^ 9) ^ (190 ^ 182);
        lIlIIIIIIIlI[14] = (((10 + 118) - 68) + 93) ^ (((28 + 29) - (-70)) + 18);
        lIlIIIIIIIlI[15] = 168 ^ 161;
        lIlIIIIIIIlI[16] = 7 ^ 13;
        lIlIIIIIIIlI[17] = (215 ^ 171) ^ (182 ^ 193);
        lIlIIIIIIIlI[18] = 147 ^ 159;
        lIlIIIIIIIlI[19] = (((90 + 130) - 72) + 26) ^ (((90 + 43) - 78) + 108);
        lIlIIIIIIIlI[20] = (144 ^ 134) ^ (75 ^ 83);
        lIlIIIIIIIlI[21] = 147 ^ 130;
        lIlIIIIIIIlI[22] = 116 ^ 102;
        lIlIIIIIIIlI[23] = (((51 + 183) - 64) + 19) ^ (((37 + 169) - 40) + 8);
        lIlIIIIIIIlI[24] = (129 ^ 189) ^ (164 ^ 140);
        lIlIIIIIIIlI[25] = (((81 + 86) - 101) + 113) ^ (((85 + 42) - 65) + 104);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean cT() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIlIIlllIIlII(tileObject.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[17]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIIIIIlI[2]];
                strArr[lIlIIIIIIIlI[1]] = lIlIIIIIIIIl[lIlIIIIIIIlI[18]];
                if (llIlIIlllIIlII(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIIIIIIlI[2];
                    "".length();
                    return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIIIIIIlI[1];
        });
        if (llIlIIlllIIlll(nearest)) {
            System.out.println(lIlIIIIIIIIl[lIlIIIIIIIlI[13]]);
            return lIlIIIIIIIlI[1];
        }
        nearest.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[14]]);
        return lIlIIIIIIIlI[2];
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        if (llIlIIlllIIlll(NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[23]]);
        }))) {
            return null;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(Prayer.PROTECT_FROM_MISSILES);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }

    private static boolean llIlIIlllIIIll(int i, int i2) {
        return i <= i2;
    }

    private NPC de() {
        return NPCs.getNearest(npc -> {
            if (llIlIIlllIIlII(npc.getName().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[3]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIIIIIlI[2]];
                strArr[lIlIIIIIIIlI[1]] = lIlIIIIIIIIl[lIlIIIIIIIlI[5]];
                if (llIlIIlllIIlII(npc.hasAction(strArr) ? 1 : 0) && llIlIIlllIIlII(this.ak.a((Locatable) npc) ? 1 : 0)) {
                    ?? r0 = lIlIIIIIIIlI[2];
                    "".length();
                    return " ".length() >= (9 ^ 13) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIIIIIIlI[1];
        });
    }

    private void dg() {
        WorldPoint worldPoint = this.ak.bq;
    }

    private static String llIlIIllIlllll(String lllllllllllllllIlllIIlIllllIIIlI, String lllllllllllllllIlllIIlIllllIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlIllllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIllllIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIIlI[14]), "DES");
            Cipher lllllllllllllllIlllIIlIllllIIlII = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlIllllIIlII.init(lIlIIIIIIIlI[4], lllllllllllllllIlllIIlIllllIIlIl);
            return new String(lllllllllllllllIlllIIlIllllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlIllllIIIll) {
            lllllllllllllllIlllIIlIllllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlllIllII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    private boolean dj() {
        NPC df = df();
        if (llIlIIlllIIlll(df)) {
            return lIlIIIIIIIlI[1];
        }
        if (llIlIIlllIlIlI(df.getAnimation(), lIlIIIIIIIlI[0])) {
            System.out.print(lIlIIIIIIIIl[lIlIIIIIIIlI[10]]);
            return lIlIIIIIIIlI[1];
        } else if (llIlIIlllIlIll(df.getWorldArea().distanceTo(this.bS), lIlIIIIIIIlI[6])) {
            WorldPoint worldPoint = (WorldPoint) this.bS.getWorldLocation().createWorldArea(lIlIIIIIIIlI[4]).toWorldPointList().stream().filter(worldPoint2 -> {
                return Reachable.isWalkable(worldPoint2);
            }).max(Comparator.comparingInt(obj -> {
                return df.getWorldArea().distanceTo((WorldPoint) obj);
            }).thenComparingDouble(obj2 -> {
                return -this.bS.distanceTo((WorldPoint) obj2);
            })).orElse(null);
            if (llIlIIlllIIlll(worldPoint)) {
                return lIlIIIIIIIlI[1];
            }
            Movement.setDestination(worldPoint);
            return lIlIIIIIIIlI[2];
        } else {
            return lIlIIIIIIIlI[1];
        }
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            if (llIlIIlllIIlII(tileObject.getName().equals(lIlIIIIIIIIl[lIlIIIIIIIlI[21]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIIIIIlI[2]];
                strArr[lIlIIIIIIIlI[1]] = lIlIIIIIIIIl[lIlIIIIIIIlI[22]];
                if (llIlIIlllIIlII(tileObject.hasAction(strArr) ? 1 : 0) && llIlIIlllIIlII(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIIIIIIIlI[2];
                    "".length();
                    return (((42 ^ 127) ^ (44 ^ 57)) & (((((127 + 189) - 102) + 33) ^ (((19 + 58) - 27) + 133)) ^ (-" ".length()))) >= ((93 ^ 21) ^ (90 ^ 22)) ? ((189 ^ 178) ^ (56 ^ 12)) & (((((211 + 198) - 275) + 116) ^ (((127 + 123) - 117) + 60)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIIIIIIlI[1];
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v108, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    private boolean j(boolean z) {
        int i;
        this.dP = df();
        if (llIlIIlllIIlll(this.dP)) {
            return lIlIIIIIIIlI[1];
        }
        if (llIlIIlllIIlII(z ? 1 : 0) && llIlIIlllIIlII(di() ? 1 : 0)) {
            System.out.println(lIlIIIIIIIIl[lIlIIIIIIIlI[4]]);
            Movement.setDestination(dd());
            return lIlIIIIIIIlI[2];
        } else if (llIlIIlllIlIII(this.cq.getTickCount() - this.dB, lIlIIIIIIIlI[2])) {
            this.dP.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[6]]);
            this.dB = this.cq.getTickCount();
            this.dR = this.bS.getWorldLocation();
            System.out.println(lIlIIIIIIIIl[lIlIIIIIIIlI[7]]);
            return lIlIIIIIIIlI[2];
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.dR.createWorldArea(lIlIIIIIIIlI[2]).toWorldPointList());
            "".length();
            int[] iArr = new int[lIlIIIIIIIlI[2]];
            iArr[lIlIIIIIIIlI[1]] = lIlIIIIIIIlI[8];
            for (Projectile projectile : Projectiles.getAll(iArr)) {
                if (llIlIIlllIIlll(projectile)) {
                    "".length();
                    if (0 != 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    arrayList.addAll(WorldPoint.fromLocal(this.cq, projectile.getTarget()).createWorldArea(lIlIIIIIIIlI[2]).toWorldPointList());
                    "".length();
                    "".length();
                    if ("  ".length() > "  ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            }
            if (!llIlIIlllIIlII(arrayList.contains(this.bS.getWorldLocation()) ? 1 : 0)) {
                this.dP.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[9]]);
                return lIlIIIIIIIlI[2];
            } else if (!llIlIIlllIIlII(z ? 1 : 0)) {
                Movement.setDestination((WorldPoint) this.bS.getWorldLocation().createWorldArea(lIlIIIIIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> {
                    if (llIlIIlllIIlII(Reachable.isWalkable(worldPoint) ? 1 : 0) && llIlIIlllIlIIl(arrayList.contains(worldPoint) ? 1 : 0)) {
                        ?? r0 = lIlIIIIIIIlI[2];
                        "".length();
                        return " ".length() <= ("  ".length() & ("  ".length() ^ (-" ".length()))) ? ((220 ^ 135) ^ (118 ^ 106)) & (((1 ^ 34) ^ (100 ^ 0)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIIIIIIlI[1];
                }).min(Comparator.comparingInt(worldPoint2 -> {
                    return Math.abs(lIlIIIIIIIlI[7] - this.dP.getWorldArea().distanceTo(worldPoint2));
                })).orElse(null));
                return lIlIIIIIIIlI[2];
            } else {
                WorldPoint dd = dd();
                if (llIlIIlllIIlII(this.cp.vasaToggle() ? 1 : 0)) {
                    i = lIlIIIIIIIlI[9];
                    "".length();
                    if ((-" ".length()) > 0) {
                        return ((159 ^ 175) ^ (247 ^ 143)) & (((82 ^ 51) ^ (39 ^ 14)) ^ (-" ".length()));
                    }
                } else {
                    i = lIlIIIIIIIlI[7];
                }
                int i2 = i;
                Movement.setDestination((WorldPoint) this.bS.getWorldLocation().createWorldArea(lIlIIIIIIIlI[4]).toWorldPointList().stream().filter(worldPoint3 -> {
                    if (llIlIIlllIIlII(Reachable.isWalkable(worldPoint3) ? 1 : 0) && llIlIIlllIlIIl(arrayList.contains(worldPoint3) ? 1 : 0)) {
                        ?? r0 = lIlIIIIIIIlI[2];
                        "".length();
                        return (((((123 + 94) - 117) + 43) ^ (((36 + 96) - 6) + 44)) & (((((5 + 22) - (-21)) + 98) ^ (((10 + 165) - 112) + 120)) ^ (-" ".length()))) < (-" ".length()) ? ((174 ^ 197) ^ (127 ^ 55)) & (((225 ^ 152) ^ (121 ^ 35)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIIIIIIlI[1];
                }).min(Comparator.comparingInt(obj -> {
                    return Math.abs(i2 - this.dP.getWorldArea().distanceTo((WorldPoint) obj));
                }).thenComparingInt(obj2 -> {
                    return ((WorldPoint) obj2).distanceToPath(this.cq, dd);
                })).orElse(null));
                return lIlIIIIIIIlI[2];
            }
        }
    }

    static {
        llIlIIlllIIIlI();
        llIlIIlllIIIIl();
    }

    private NPC df() {
        return NPCs.getNearest(npc -> {
            if (llIlIIlllIIlII(npc.getName().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[19]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIIIIIlI[2]];
                strArr[lIlIIIIIIIlI[1]] = lIlIIIIIIIIl[lIlIIIIIIIlI[20]];
                if (llIlIIlllIIlII(npc.hasAction(strArr) ? 1 : 0) && llIlIIlllIIlII(this.ak.a((Locatable) npc) ? 1 : 0)) {
                    ?? r0 = lIlIIIIIIIlI[2];
                    "".length();
                    return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIIIIIIlI[1];
        });
    }

    private static boolean llIlIIlllIlIII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    private boolean cS() {
        if (llIlIIlllIIlII(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            if (llIlIIlllIIlIl(Movement.getDestination()) && llIlIIlllIIlII(Movement.getDestination().equals(this.al.bt) ? 1 : 0)) {
                return lIlIIIIIIIlI[1];
            }
            Movement.setDestination(this.al.bs);
            return lIlIIIIIIIlI[2];
        }
        TileObject cR = cR();
        if (llIlIIlllIIlll(cR)) {
            Movement.setDestination(this.ak.bq.dx(lIlIIIIIIIlI[5]).dy(lIlIIIIIIIlI[5]));
            return lIlIIIIIIIlI[2];
        } else if (!llIlIIlllIlIIl(this.bS.isMoving() ? 1 : 0) || llIlIIlllIIlII(this.bS.isAnimating() ? 1 : 0)) {
            return lIlIIIIIIIlI[1];
        } else {
            cR.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[2]]);
            return lIlIIIIIIIlI[2];
        }
    }

    private static boolean llIlIIlllIllIl(int i, int i2) {
        return i == i2;
    }

    private static String llIlIIlllIIIII(String lllllllllllllllIlllIIlIlllllIlll, String lllllllllllllllIlllIIlIlllllIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIlIlllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlllIIlIlllllIlII = lllllllllllllllIlllIIlIlllllIllI.toCharArray();
        int lllllllllllllllIlllIIlIlllllIIll = lIlIIIIIIIlI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIIIlI[1];
        while (llIlIIlllIlIll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlllIIlIlllllIlII[lllllllllllllllIlllIIlIlllllIIll % lllllllllllllllIlllIIlIlllllIlII.length]));
            "".length();
            lllllllllllllllIlllIIlIlllllIIll++;
            i++;
            "".length();
            if (((((91 + 10) - 13) + 65) ^ (((148 + 142) - 244) + 111)) < ((237 ^ 143) ^ (25 ^ 127))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIIlllIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean cU() {
        if (llIlIIlllIIlII(Inventory.isFull() ? 1 : 0)) {
            return lIlIIIIIIIlI[1];
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (llIlIIlllIIlII(tileItem.getName().startsWith(lIlIIIIIIIIl[lIlIIIIIIIlI[16]]) ? 1 : 0) && llIlIIlllIIlII(this.ak.a((Locatable) tileItem) ? 1 : 0) && llIlIIlllIIlII(Reachable.isInteractable(tileItem) ? 1 : 0)) {
                ?? r0 = lIlIIIIIIIlI[2];
                "".length();
                return (-(73 ^ 77)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIIIIIIlI[1];
        });
        if (llIlIIlllIIlll(nearest)) {
            return lIlIIIIIIIlI[1];
        }
        nearest.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[15]]);
        return lIlIIIIIIIlI[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    private boolean di() {
        if (llIlIIlllIIlll(de())) {
            return lIlIIIIIIIlI[1];
        }
        for (WorldPoint worldPoint : this.bS.getWorldLocation().pathTo(this.cq, dd())) {
            if (llIlIIlllIIlII(this.dP.getWorldArea().contains(worldPoint) ? 1 : 0)) {
                return lIlIIIIIIIlI[2];
            }
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true);
            }
        }
        return lIlIIIIIIIlI[1];
    }

    @Inject
    protected aF(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIIIIIIlI[0];
        this.dB = lIlIIIIIIIlI[0];
        this.dR = new WorldPoint(lIlIIIIIIIlI[1], lIlIIIIIIIlI[1], lIlIIIIIIIlI[1]);
    }

    private WorldPoint dd() {
        NPC de = de();
        if (llIlIIlllIIlll(de)) {
            return null;
        }
        List list = (List) de.getWorldArea().getMeleeTiles(Static.getClient()).stream().filter(worldPoint -> {
            return Reachable.isWalkable(worldPoint);
        }).collect(Collectors.toList());
        if (llIlIIlllIIlII(list.isEmpty() ? 1 : 0)) {
            return null;
        }
        WorldPoint worldPoint2 = (WorldPoint) list.get(lIlIIIIIIIlI[1]);
        List list2 = (List) list.stream().filter(worldPoint3 -> {
            if (!llIlIIlllIlIlI(worldPoint3.getWorldX(), worldPoint2.getWorldX()) || llIlIIlllIllIl(worldPoint3.getWorldY(), worldPoint2.getWorldY())) {
                ?? r0 = lIlIIIIIIIlI[2];
                "".length();
                return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIIIIIIlI[1];
        }).collect(Collectors.toList());
        list.removeAll(list2);
        "".length();
        return llIlIIlllIlIII(list.size(), list2.size()) ? (WorldPoint) list2.get(lIlIIIIIIIlI[1]) : (WorldPoint) list.get(lIlIIIIIIIlI[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean dc() {
        NPC de = de();
        NPC df = df();
        if (!llIlIIlllIIlIl(de) || llIlIIlllIIlll(df)) {
            return lIlIIIIIIIlI[1];
        }
        if (llIlIIlllIIlII(de.isDead() ? 1 : 0)) {
            Movement.setDestination(this.ak.bq.dx(lIlIIIIIIIlI[3]).dy(lIlIIIIIIIlI[3]));
            return lIlIIIIIIIlI[2];
        }
        db();
        if (llIlIIlllIIlIl(this.bS.getInteracting()) && llIlIIlllIIlII(this.bS.getInteracting().equals(de) ? 1 : 0)) {
            return lIlIIIIIIIlI[1];
        }
        WorldPoint dd = dd();
        if (llIlIIlllIlIII(this.bS.distanceTo(dd), lIlIIIIIIIlI[4])) {
            Movement.setDestination(dd);
            return lIlIIIIIIIlI[2];
        }
        de.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[1]]);
        return lIlIIIIIIIlI[2];
    }

    private static boolean llIlIIlllIlIIl(int i) {
        return i == 0;
    }

    private static String llIlIIllIllllI(String lllllllllllllllIlllIIlIlllIlIlIl, String lllllllllllllllIlllIIlIlllIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIlllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIIIIlI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlIlllIlIllI) {
            lllllllllllllllIlllIIlIlllIlIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        if (llIlIIlllIIIll(this.bS.distanceTo(this.ak.bs), lIlIIIIIIIlI[2]) && llIlIIlllIIlII(cT() ? 1 : 0)) {
            return lIlIIIIIIIlI[2];
        }
        int dk = aG.dk();
        System.out.println("state: " + aG.dk());
        NPC nearest = NPCs.getNearest(npc -> {
            if (llIlIIlllIIlII(npc.getName().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[24]]) ? 1 : 0) && llIlIIlllIIlII(this.ak.a((Locatable) npc) ? 1 : 0)) {
                ?? r0 = lIlIIIIIIIlI[2];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIIIIIIlI[1];
        });
        if (llIlIIlllIIlIl(nearest)) {
            Movement.setDestination(nearest.getWorldArea().getRandom());
            return lIlIIIIIIIlI[2];
        }
        switch (dk) {
            case 0:
                return llIlIIlllIIlII(cU() ? 1 : 0) ? lIlIIIIIIIlI[2] : cS();
            case 1:
                return dj();
            case 2:
                return j((boolean) lIlIIIIIIIlI[2]);
            case 3:
                return dc();
            case 4:
                return j((boolean) lIlIIIIIIIlI[1]);
            default:
                return lIlIIIIIIIlI[2];
        }
    }

    public void db() {
        if (llIlIIlllIIlII(cj().isFullyEquipped() ? 1 : 0) && llIlIIlllIllII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            int[] iArr = new int[lIlIIIIIIIlI[4]];
            iArr[lIlIIIIIIIlI[1]] = lIlIIIIIIIlI[11];
            iArr[lIlIIIIIIIlI[2]] = lIlIIIIIIIlI[12];
            if (llIlIIlllIIlII(Equipment.contains(iArr) ? 1 : 0)) {
                Combat.setAttackStyle(Combat.AttackStyle.FIRST);
            }
        }
    }

    private void dh() {
    }

    private static boolean llIlIIlllIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean llIlIIlllIIlII(int i) {
        return i != 0;
    }

    private static boolean llIlIIlllIlIll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIIlllIIlll(Object obj) {
        return obj == null;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return C0044s.b(C0044s.e(N.VASA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIlIIlllIIllI(this.ak.bw, N.VASA)) {
            ?? r0 = lIlIIIIIIIlI[2];
            "".length();
            return " ".length() < 0 ? ((159 ^ 188) ^ (56 ^ 37)) & (((119 ^ 48) ^ (95 ^ 38)) ^ (-" ".length())) : r0;
        }
        return lIlIIIIIIIlI[1];
    }

    private static boolean llIlIIlllIlIlI(int i, int i2) {
        return i != i2;
    }
}
