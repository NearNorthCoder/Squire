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
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Tekton", priority = 10000, blocking = true, register = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aE  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aE.class */
public class aE extends U {
    private /* synthetic */ C0039n al;
    private /* synthetic */ C0039n ak;
    private final /* synthetic */ int dI = 660;
    /* synthetic */ int dJ;
    public final /* synthetic */ int dL = 7488;
    private static /* synthetic */ String[] lIlIllIIllII;
    public final /* synthetic */ int dK = 7473;
    public /* synthetic */ int dM;
    /* synthetic */ int dA;
    private static /* synthetic */ int[] lIlIllIIllll;
    private /* synthetic */ int dN;
    private /* synthetic */ int dO;
    private /* synthetic */ int am;
    /* synthetic */ int dB;

    private static boolean lllIIIIIIIlIII(Object obj) {
        return obj == null;
    }

    private static boolean lllIIIIIIIlIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    private boolean da() {
        int i;
        if (lllIIIIIIlIIIl(Combat.getSpecEnergy(), lIlIllIIllll[14])) {
            return lIlIllIIllll[2];
        }
        Item aY = C0044s.aY();
        if (lllIIIIIIIlIII(aY)) {
            return lIlIllIIllll[2];
        }
        if (lllIIIIIIIlIlI(aY.getId(), Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId())) {
            i = lIlIllIIllll[5];
            "".length();
            if ((-((((9 + 17) - (-46)) + 90) ^ (((143 + 103) - 219) + 140))) >= 0) {
                return ((((114 + 170) - 88) + 24) ^ (((63 + 186) - 198) + 137)) & (((52 ^ 124) ^ (186 ^ 146)) ^ (-" ".length()));
            }
        } else {
            i = lIlIllIIllll[2];
        }
        if (lllIIIIIIIIlll(i)) {
            return lIlIllIIllll[2];
        }
        Combat.toggleSpec();
        return lIlIllIIllll[5];
    }

    private static boolean lllIIIIIIIIllI(int i) {
        return i != 0;
    }

    private static boolean lllIIIIIIlIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lllIIIIIIIIlIl();
        lllIIIIIIIIlII();
    }

    private static boolean lllIIIIIIIlIIl(int i, int i2) {
        return i != i2;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            if (lllIIIIIIIIllI(tileObject.getName().equals(lIlIllIIllII[lIlIllIIllll[23]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIllIIllll[5]];
                strArr[lIlIllIIllll[2]] = lIlIllIIllII[lIlIllIIllll[24]];
                if (lllIIIIIIIIllI(tileObject.hasAction(strArr) ? 1 : 0) && lllIIIIIIIIllI(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIllIIllll[5];
                    "".length();
                    return ((7 ^ 80) & ((77 ^ 26) ^ (-1))) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIllIIllll[2];
        });
    }

    private static boolean lllIIIIIIIIlll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v128, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v130, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v138, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v141, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v143, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v150, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v157, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v172, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v174, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v178, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v192, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v194, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v204, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v208, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        if (lllIIIIIIIIllI(co() ? 1 : 0)) {
            return lIlIllIIllll[5];
        }
        WorldPoint c2 = H.TEKTON_START.c(this.ak);
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIIIIIIIIllI(tileObject.getName().contains(lIlIllIIllII[lIlIllIIllll[28]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIllIIllll[5]];
                strArr[lIlIllIIllll[2]] = lIlIllIIllII[lIlIllIIllll[29]];
                if (lllIIIIIIIIllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIllIIllll[5];
                    "".length();
                    return (((((47 + 80) - 84) + 165) ^ (((12 + 161) - (-1)) + 22)) & (((171 ^ 139) ^ (183 ^ 131)) ^ (-" ".length()))) >= " ".length() ? ((12 ^ 41) ^ (89 ^ 107)) & (((136 ^ 188) ^ (79 ^ 108)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIllIIllll[2];
        });
        if (lllIIIIIIIIlll(Reachable.isWalkable(c2) ? 1 : 0)) {
            if (lllIIIIIIIlIII(nearest)) {
                return cS();
            }
            nearest.interact(lIlIllIIllII[lIlIllIIllll[2]]);
            return lIlIllIIllll[5];
        }
        NPC nearest2 = NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIllIIllII[lIlIllIIllll[27]]);
        });
        if (lllIIIIIIIlIII(nearest2)) {
            return cS();
        }
        db();
        if (!lllIIIIIIIlIIl(nearest2.getAnimation(), lIlIllIIllll[4]) || lllIIIIIIIlIlI(nearest2.getAnimation(), lIlIllIIllll[6])) {
            this.dM += lIlIllIIllll[5];
            System.out.println(this.dM);
            if (lllIIIIIIIlIll(this.dM, lIlIllIIllll[5])) {
                nearest2.interact(lIlIllIIllII[lIlIllIIllll[5]]);
                return lIlIllIIllll[5];
            } else if (lllIIIIIIIIlll(this.cp.flinchTekton() ? 1 : 0)) {
                Movement.setDestination(cY());
                return lIlIllIIllll[5];
            } else if (lllIIIIIIIlIll(this.dM, lIlIllIIllll[7]) && lllIIIIIIIIllI(this.cp.flinchTekton() ? 1 : 0)) {
                Movement.setDestination((WorldPoint) this.bS.getWorldArea().getMeleeTiles(this.cq).stream().filter(worldPoint -> {
                    return Reachable.isWalkable(worldPoint);
                }).max(Comparator.comparingInt(worldPoint2 -> {
                    return nearest2.getWorldArea().distanceTo(worldPoint2);
                })).orElse(null));
                return lIlIllIIllll[5];
            }
        }
        this.dM = lIlIllIIllll[2];
        if (lllIIIIIIIIllI(nearest2.isMoving() ? 1 : 0) && lllIIIIIIIllII(nearest2.getWorldArea().distanceTo(this.bS), lIlIllIIllll[7])) {
            WorldPoint c3 = H.TEKTON_START.c(this.ak);
            if (lllIIIIIIIllIl(Projectiles.getNearest(projectile -> {
                if (lllIIIIIIIlIlI(projectile.getId(), lIlIllIIllll[1]) && lllIIIIIIIlIll(WorldPoint.fromLocal(this.cq, projectile.getTarget()).distanceTo(c3), lIlIllIIllll[5])) {
                    ?? r0 = lIlIllIIllll[5];
                    "".length();
                    return 0 != 0 ? ((23 ^ 29) ^ (18 ^ 80)) & (((253 ^ 142) ^ (172 ^ 151)) ^ (-" ".length())) : r0;
                }
                return lIlIllIIllll[2];
            }))) {
                return lIlIllIIllll[2];
            }
            Movement.setDestination(c3);
            return lIlIllIIllll[5];
        } else if (lllIIIIIIIlIlI(nearest2.getPoseAnimation(), lIlIllIIllll[3])) {
            if (lllIIIIIIIllIl(nearest)) {
                Movement.setDestination(cZ());
                return lIlIllIIllll[5];
            }
            WorldPoint worldPoint3 = (WorldPoint) c2.createWorldArea(lIlIllIIllll[8]).toWorldPointList().stream().filter(worldPoint4 -> {
                if (lllIIIIIIIIllI(Reachable.isWalkable(worldPoint4) ? 1 : 0) && lllIIIIIIIlIlI(nearest2.getWorldArea().distanceTo(worldPoint4), lIlIllIIllll[10])) {
                    ?? r0 = lIlIllIIllll[5];
                    "".length();
                    return (((92 ^ 126) ^ (127 ^ 29)) & (((213 ^ 175) ^ (88 ^ 98)) ^ (-" ".length()))) != 0 ? ((81 ^ 84) ^ (118 ^ 125)) & (((68 ^ 52) ^ (241 ^ 143)) ^ (-" ".length())) : r0;
                }
                return lIlIllIIllll[2];
            }).min(Comparator.comparingDouble(worldPoint5 -> {
                return worldPoint5.distanceTo2DHypotenuse(c2);
            })).orElse(null);
            if (lllIIIIIIIlIII(worldPoint3)) {
                return lIlIllIIllll[2];
            }
            Movement.setDestination(worldPoint3);
            return lIlIllIIllll[5];
        } else {
            da();
            "".length();
            if (lllIIIIIIIIllI(nearest2.isMoving() ? 1 : 0)) {
                if (lllIIIIIIIllIl(this.bS.getInteracting()) && lllIIIIIIIIllI(this.bS.getInteracting().equals(nearest2) ? 1 : 0)) {
                    return lIlIllIIllll[2];
                }
                nearest2.interact(lIlIllIIllII[lIlIllIIllll[7]]);
                return lIlIllIIllll[5];
            }
            if (lllIIIIIIIIlll(this.cp.flinchTekton() ? 1 : 0)) {
                WorldPoint cX = cX();
                if (lllIIIIIIIlIII(cX)) {
                    return lIlIllIIllll[2];
                }
                if (!lllIIIIIIIIllI(cW().contains(this.bS.getWorldLocation()) ? 1 : 0)) {
                    this.dA = lIlIllIIllll[2];
                    WorldPoint cY = cY();
                    if (!lllIIIIIIIIllI(this.bS.isMoving() ? 1 : 0) && !lllIIIIIIIIllI(this.bS.isMoving() ? 1 : 0)) {
                        Movement.setDestination(cY);
                    }
                    return lIlIllIIllll[2];
                }
                this.dJ = lIlIllIIllll[2];
                this.dA += lIlIllIIllll[5];
                if (lllIIIIIIIlIlI(this.dA, lIlIllIIllll[5])) {
                    nearest2.interact(lIlIllIIllII[lIlIllIIllll[9]]);
                    return lIlIllIIllll[5];
                }
                Movement.setDestination(cX);
                return lIlIllIIllll[5];
            }
            int animation = nearest2.getAnimation();
            if (lllIIIIIIIIllI(nearest2.getWorldArea().getMeleeTiles(this.cq).contains(this.bS.getWorldLocation()) ? 1 : 0)) {
                System.out.println(lIlIllIIllII[lIlIllIIllll[10]]);
                this.dO = lIlIllIIllll[2];
                Movement.setDestination((WorldPoint) this.bS.getWorldArea().getMeleeTiles(this.cq).stream().filter(worldPoint6 -> {
                    return Reachable.isWalkable(worldPoint6);
                }).max(Comparator.comparingInt(worldPoint7 -> {
                    return nearest2.getWorldArea().distanceTo(worldPoint7);
                })).orElse(null));
                System.out.println(lIlIllIIllII[lIlIllIIllll[8]]);
                return lIlIllIIllll[5];
            }
            System.out.println("last: " + this.dN + " | current: " + animation + " | frame: " + nearest2.getAnimationFrame());
            if (lllIIIIIIIlIIl(nearest2.getAnimation(), lIlIllIIllll[0]) && lllIIIIIIIlllI(nearest2.getAnimationFrame(), lIlIllIIllll[11]) && lllIIIIIIIllll(this.dO)) {
                this.dN = nearest2.getAnimation();
                nearest2.interact(lIlIllIIllII[lIlIllIIllll[12]]);
            }
            this.dO += lIlIllIIllll[5];
            return lIlIllIIllll[5];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean a(int i, int i2, int i3) {
        if (lllIIIIIIIIlll(i2)) {
            if (!lllIIIIIIIlIll(i, lIlIllIIllll[17] - i3) || lllIIIIIIlIIIl(i, i3)) {
                ?? r0 = lIlIllIIllll[5];
                "".length();
                return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIIllll[2];
        } else if (lllIIIIIIIlllI(i, i2 - i3) && lllIIIIIIIlIll(i, i2 + i3)) {
            ?? r02 = lIlIllIIllll[5];
            "".length();
            return (-" ".length()) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
        } else {
            return lIlIllIIllll[2];
        }
    }

    private int z(int i) {
        int i2 = lIlIllIIllll[2];
        while (lllIIIIIIlIIIl(i2, lIlIllIIllll[10])) {
            if (lllIIIIIIIIllI(a(i, i2 * lIlIllIIllll[15], lIlIllIIllll[16]) ? 1 : 0)) {
                return i2 * lIlIllIIllll[15];
            }
            i2++;
            "".length();
            if ("   ".length() <= 0) {
                return ((148 ^ 152) ^ (29 ^ 1)) & (((((118 + 147) - 161) + 57) ^ (((161 + 50) - 146) + 112)) ^ (-" ".length()));
            }
        }
        return lIlIllIIllll[0];
    }

    private WorldPoint cZ() {
        WorldPoint c2 = H.TEKTON_START.c(this.ak);
        List worldPointList = this.bS.getWorldLocation().createWorldArea(lIlIllIIllll[7]).toWorldPointList();
        int[] iArr = new int[lIlIllIIllll[5]];
        iArr[lIlIllIIllll[2]] = lIlIllIIllll[1];
        List<Projectile> all = Projectiles.getAll(iArr);
        ArrayList arrayList = new ArrayList();
        for (Projectile projectile : all) {
            arrayList.addAll(WorldPoint.fromLocal(this.cq, projectile.getTarget()).createWorldArea(lIlIllIIllll[5]).toWorldPointList());
            "".length();
            "".length();
            if ((((((119 + 6) - 64) + 73) ^ (((5 + 97) - 34) + 74)) & (((44 ^ 37) ^ " ".length()) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return (WorldPoint) worldPointList.stream().filter(worldPoint -> {
            if (lllIIIIIIIIllI(Reachable.isWalkable(worldPoint) ? 1 : 0) && lllIIIIIIIIlll(arrayList.contains(worldPoint) ? 1 : 0)) {
                ?? r0 = lIlIllIIllll[5];
                "".length();
                return (159 ^ 155) < (6 ^ 2) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIIllll[2];
        }).min(Comparator.comparingInt(obj -> {
            return ((WorldPoint) obj).distanceTo(this.bS);
        }).thenComparingDouble(obj2 -> {
            return ((WorldPoint) obj2).distanceTo2DHypotenuse(c2);
        })).orElse(null);
    }

    private static boolean lllIIIIIIIlllI(int i, int i2) {
        return i >= i2;
    }

    private static String llIlllllllIlII(String lllllllllllllllIllIIlIllIIIIIIlI, String lllllllllllllllIllIIlIllIIIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIllIIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIllIIllll[18]), "DES");
            Cipher lllllllllllllllIllIIlIllIIIIIlII = Cipher.getInstance("DES");
            lllllllllllllllIllIIlIllIIIIIlII.init(lIlIllIIllll[7], secretKeySpec);
            return new String(lllllllllllllllIllIIlIllIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIllIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIllIIIIIIll) {
            lllllllllllllllIllIIlIllIIIIIIll.printStackTrace();
            return null;
        }
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return (lllIIIIIIIlllI(Combat.getSpecEnergy(), lIlIllIIllll[14]) && lllIIIIIIIllIl(C0044s.aZ())) ? C0044s.b(C0044s.aZ()) : C0044s.b(C0044s.e(N.TEKTON));
    }

    private static void lllIIIIIIIIlIl() {
        lIlIllIIllll = new int[31];
        lIlIllIIllll[0] = -" ".length();
        lIlIllIIllll[1] = (-((-2897) & 28538)) & (-67) & 26367;
        lIlIllIIllll[2] = (160 ^ 149) & ((169 ^ 156) ^ (-1));
        lIlIllIIllll[3] = (-16391) & 23863;
        lIlIllIIllll[4] = (-137) & 7624;
        lIlIllIIllll[5] = " ".length();
        lIlIllIIllll[6] = (-((-15987) & 32499)) & (-586) & 24575;
        lIlIllIIllll[7] = "  ".length();
        lIlIllIIllll[8] = (111 ^ 54) ^ (217 ^ 133);
        lIlIllIIllll[9] = "   ".length();
        lIlIllIIllll[10] = 124 ^ 120;
        lIlIllIIllll[11] = 153 ^ 144;
        lIlIllIIllll[12] = "   ".length() ^ (144 ^ 149);
        lIlIllIIllll[13] = 123 ^ 124;
        lIlIllIIllll[14] = (((37 + 124) - (-21)) + 65) ^ (((3 + 2) - (-60)) + 132);
        lIlIllIIllll[15] = (-((-2593) & 24567)) & (-10250) & 32735;
        lIlIllIIllll[16] = (((75 + 54) - (-65)) + 12) ^ (((23 + 155) - 46) + 38);
        lIlIllIIllll[17] = (-((-871) & 15207)) & (-1) & 16383;
        lIlIllIIllll[18] = (((37 + 19) - (-10)) + 62) ^ (((9 + 82) - 44) + 89);
        lIlIllIIllll[19] = (-((-16834) & 26575)) & (-33) & 32751;
        lIlIllIIllll[20] = (-((-1651) & 2047)) & (-20481) & 32765;
        lIlIllIIllll[21] = 190 ^ 180;
        lIlIllIIllll[22] = (244 ^ 177) ^ (136 ^ 198);
        lIlIllIIllll[23] = 77 ^ 65;
        lIlIllIIllll[24] = 181 ^ 184;
        lIlIllIIllll[25] = (250 ^ 170) ^ (123 ^ 37);
        lIlIllIIllll[26] = (60 ^ 83) ^ (211 ^ 179);
        lIlIllIIllll[27] = 90 ^ 74;
        lIlIllIIllll[28] = 42 ^ 59;
        lIlIllIIllll[29] = 69 ^ 87;
        lIlIllIIllll[30] = 126 ^ 109;
    }

    private static boolean lllIIIIIIIllll(int i) {
        return i > 0;
    }

    private static boolean lllIIIIIIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static String lllIIIIIIIIIll(String lllllllllllllllIllIIlIllIIIlIlll, String lllllllllllllllIllIIlIllIIIlIllI) {
        String lllllllllllllllIllIIlIllIIIlIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlIllIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIlIllIIIlIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIlIllIIIlIllI.toCharArray();
        int lllllllllllllllIllIIlIllIIIlIIll = lIlIllIIllll[2];
        char[] charArray2 = lllllllllllllllIllIIlIllIIIlIlll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIllIIllll[2];
        while (lllIIIIIIlIIIl(i, length)) {
            lllllllllllllllIllIIlIllIIIlIlIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIIlIllIIIlIIll % charArray.length]));
            "".length();
            lllllllllllllllIllIIlIllIIIlIIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIlIllIIIlIlIl);
    }

    private static void lllIIIIIIIIlII() {
        lIlIllIIllII = new String[lIlIllIIllll[30]];
        lIlIllIIllII[lIlIllIIllll[2]] = llIlllllllIlII("U5WesbyTXqM=", "behAt");
        lIlIllIIllII[lIlIllIIllll[5]] = lllIIIIIIIIIlI("oOrGX4VkNiI=", "BRBfQ");
        lIlIllIIllII[lIlIllIIllll[7]] = llIlllllllIlII("qrff62lKN6A=", "oEfVh");
        lIlIllIIllII[lIlIllIIllll[9]] = lllIIIIIIIIIlI("Ki1ZOqm3L3U=", "RMNvt");
        lIlIllIIllII[lIlIllIIllll[10]] = lllIIIIIIIIIlI("5yxej7PjDGUiO8jjOM0EFA==", "RFaUg");
        lIlIllIIllII[lIlIllIIllll[8]] = lllIIIIIIIIIlI("J9wX9nADaFkY2BiqPer1q/xuh0nI3v/z", "MrneW");
        lIlIllIIllII[lIlIllIIllll[12]] = lllIIIIIIIIIlI("dvk/8VLch1w=", "mNKnZ");
        lIlIllIIllII[lIlIllIIllll[13]] = llIlllllllIlII("BQVQXCE0E/8=", "gEBmj");
        lIlIllIIllII[lIlIllIIllll[18]] = lllIIIIIIIIIlI("BdBAyL0rJCo=", "GUANT");
        lIlIllIIllII[lIlIllIIllll[11]] = llIlllllllIlII("b3Qr6phLSVk=", "WrtkP");
        lIlIllIIllII[lIlIllIIllll[21]] = lllIIIIIIIIIlI("FQTArZIpGTs=", "WFADn");
        lIlIllIIllII[lIlIllIIllll[22]] = lllIIIIIIIIIll("AyAJIyg5", "WEbWG");
        lIlIllIIllII[lIlIllIIllll[23]] = lllIIIIIIIIIlI("cHooSIQyIUg=", "sOSBt");
        lIlIllIIllII[lIlIllIIllll[24]] = lllIIIIIIIIIlI("EKE5VMP5Krc=", "kdCci");
        lIlIllIIllII[lIlIllIIllll[25]] = lllIIIIIIIIIll("NgwuEA0M", "biEdb");
        lIlIllIIllII[lIlIllIIllll[26]] = lllIIIIIIIIIlI("ZBH4/uhlPc0=", "zcGSO");
        lIlIllIIllII[lIlIllIIllll[27]] = llIlllllllIlII("Xesh9zpEDDg=", "QbxvW");
        lIlIllIIllII[lIlIllIIllll[28]] = lllIIIIIIIIIlI("LCmLFjM7izs=", "fFDok");
        lIlIllIIllII[lIlIllIIllll[29]] = llIlllllllIlII("lodEn2tqUIY=", "iAyKx");
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        if (lllIIIIIIIlIII(NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIllIIllII[lIlIllIIllll[25]]);
        }))) {
            return null;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(Prayer.PROTECT_FROM_MELEE);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }

    private static String lllIIIIIIIIIlI(String lllllllllllllllIllIIlIlIllllIlIl, String lllllllllllllllIllIIlIlIllllIlII) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIlIlllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlIllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlIlIllllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlIlIllllIlll.init(lIlIllIIllll[7], lllllllllllllllIllIIlIlIlllllIII);
            return new String(lllllllllllllllIllIIlIlIllllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIlIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIlIllllIllI) {
            lllllllllllllllIllIIlIlIllllIllI.printStackTrace();
            return null;
        }
    }

    private WorldPoint cX() {
        NPC nearest = NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIllIIllII[lIlIllIIllll[21]]);
        });
        if (lllIIIIIIIlIII(nearest)) {
            return null;
        }
        WorldPoint worldLocation = nearest.getWorldLocation();
        System.out.println(nearest.getOrientation());
        switch (z(nearest.getOrientation())) {
            case 0:
                return worldLocation.dx(lIlIllIIllll[10]).dy(lIlIllIIllll[9]);
            case 512:
                return worldLocation.dx(lIlIllIIllll[9]).dy(lIlIllIIllll[0]);
            case 1024:
                return worldLocation.dx(lIlIllIIllll[0]).dy(lIlIllIIllll[2]);
            case 1536:
                return worldLocation.dx(lIlIllIIllll[2]).dy(lIlIllIIllll[10]);
            default:
                return null;
        }
    }

    @Inject
    protected aE(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIllIIllll[0];
        this.dI = lIlIllIIllll[1];
        this.dA = lIlIllIIllll[2];
        this.dB = lIlIllIIllll[2];
        this.dJ = lIlIllIIllll[2];
        this.dK = lIlIllIIllll[3];
        this.dL = lIlIllIIllll[4];
        this.dM = lIlIllIIllll[2];
        this.dN = lIlIllIIllll[0];
        this.dO = lIlIllIIllll[2];
    }

    private WorldPoint cY() {
        NPC nearest = NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIllIIllII[lIlIllIIllll[11]]);
        });
        if (lllIIIIIIIlIII(nearest)) {
            return null;
        }
        WorldPoint worldLocation = nearest.getWorldLocation();
        switch (z(nearest.getOrientation())) {
            case 0:
                return worldLocation.dx(lIlIllIIllll[9]).dy(lIlIllIIllll[0]);
            case 512:
                return worldLocation.dx(lIlIllIIllll[0]).dy(lIlIllIIllll[2]);
            case 1024:
                return worldLocation.dx(lIlIllIIllll[2]).dy(lIlIllIIllll[10]);
            case 1536:
                return worldLocation.dx(lIlIllIIllll[10]).dy(lIlIllIIllll[9]);
            default:
                return null;
        }
    }

    private static boolean lllIIIIIIlIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllIIIIIIIllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean y(int lllllllllllllllIllIIlIllIllllIll) {
        Item first = Inventory.getFirst(item -> {
            return item.getName().startsWith(lIlIllIIllII[lIlIllIIllll[26]]);
        });
        if (!lllIIIIIIIlIII(first) && !lllIIIIIIIllII(Movement.getRunEnergy(), lllllllllllllllIllIIlIllIllllIll)) {
            first.interact(lIlIllIIllII[lIlIllIIllll[13]]);
            return lIlIllIIllll[5];
        }
        return lIlIllIIllll[2];
    }

    private static boolean lllIIIIIIIllII(int i, int i2) {
        return i > i2;
    }

    private List<WorldPoint> cW() {
        NPC nearest = NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIllIIllII[lIlIllIIllll[22]]);
        });
        if (lllIIIIIIIlIII(nearest)) {
            return null;
        }
        WorldPoint worldLocation = nearest.getWorldLocation();
        return List.of(worldLocation.dx(lIlIllIIllll[10]).dy(lIlIllIIllll[9]), worldLocation.dx(lIlIllIIllll[9]).dy(lIlIllIIllll[0]), worldLocation.dx(lIlIllIIllll[0]).dy(lIlIllIIllll[2]), worldLocation.dx(lIlIllIIllll[2]).dy(lIlIllIIllll[10]));
    }

    public void db() {
        if (lllIIIIIIIIllI(cj().isFullyEquipped() ? 1 : 0) && lllIIIIIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.THIRD)) {
            int[] iArr = new int[lIlIllIIllll[7]];
            iArr[lIlIllIIllll[2]] = lIlIllIIllll[19];
            iArr[lIlIllIIllll[5]] = lIlIllIIllll[20];
            if (lllIIIIIIIIllI(Equipment.contains(iArr) ? 1 : 0)) {
                Combat.setAttackStyle(Combat.AttackStyle.THIRD);
            }
        }
    }

    private static boolean lllIIIIIIIlIll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    private boolean cS() {
        if (lllIIIIIIIIllI(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            Movement.setDestination(this.al.bs);
            return lIlIllIIllll[5];
        }
        TileObject cR = cR();
        if (lllIIIIIIIlIII(cR)) {
            return lIlIllIIllll[2];
        }
        if (!lllIIIIIIIIlll(this.bS.isMoving() ? 1 : 0) || lllIIIIIIIIllI(this.bS.isAnimating() ? 1 : 0)) {
            return lIlIllIIllll[2];
        }
        cR.interact(lIlIllIIllII[lIlIllIIllll[18]]);
        return lIlIllIIllll[5];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (lllIIIIIIlIIII(this.ak.bw, N.TEKTON)) {
            ?? r0 = lIlIllIIllll[5];
            "".length();
            return (((184 ^ 195) ^ (51 ^ 111)) & (((24 ^ 7) ^ (165 ^ 157)) ^ (-" ".length()))) >= " ".length() ? ((216 ^ 166) ^ (39 ^ 107)) & (((199 ^ 150) ^ (81 ^ 50)) ^ (-" ".length())) : r0;
        }
        return lIlIllIIllll[2];
    }
}
