package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Guardians", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aA  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aA.class */
public class aA extends U {
    private /* synthetic */ C0039n al;
    /* synthetic */ int dA;
    private /* synthetic */ int am;
    /* synthetic */ int dB;
    private static /* synthetic */ int[] lIlIIIlIIIlI;
    private static /* synthetic */ String[] lIlIIIIllIlI;
    private /* synthetic */ C0039n ak;

    private static String llIlIlIlIIIIlI(String lllllllllllllllIlllIIIIllllIIlll, String lllllllllllllllIlllIIIIllllIIllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIIllllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIllllIIllI.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIIlI[11]), "DES");
            Cipher lllllllllllllllIlllIIIIllllIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIIIIllllIlIIl.init(lIlIIIlIIIlI[3], lllllllllllllllIlllIIIIllllIlIlI);
            return new String(lllllllllllllllIlllIIIIllllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIIllllIlIII) {
            lllllllllllllllIlllIIIIllllIlIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (llIlIlIllIIIlI(npc.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[14]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIlIIIlI[2]];
                strArr[lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[15]];
                if (llIlIlIllIIIlI(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIIlIIIlI[2];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIIlIIIlI[1];
        });
        if (llIlIlIllIIIII(nearest)) {
            return cS();
        }
        if (llIlIlIllIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.THIRD) && llIlIlIllIIIlI(cj().isFullyEquipped() ? 1 : 0)) {
            Combat.setAttackStyle(Combat.AttackStyle.THIRD);
            return lIlIIIlIIIlI[2];
        }
        int tickCount = this.cq.getTickCount();
        WorldPoint cQ = cQ();
        if (!llIlIlIllIIIll(this.bS.distanceTo(cQ), lIlIIIlIIIlI[2])) {
            this.dA = lIlIIIlIIIlI[1];
            if (llIlIlIllIIIlI(nearest.getWorldArea().isInMeleeDistance(this.bS.getWorldLocation()) ? 1 : 0)) {
                Movement.setDestination(cQ);
                return lIlIIIlIIIlI[2];
            } else if (llIlIlIllIIIlI(this.bS.getWorldLocation().equals(cQ) ? 1 : 0)) {
                return lIlIIIlIIIlI[2];
            } else {
                Movement.setDestination(cQ);
                return lIlIIIlIIIlI[2];
            }
        }
        this.dA += lIlIIIlIIIlI[2];
        if (llIlIlIllIIlII(this.dA, lIlIIIlIIIlI[3])) {
            Movement.setDestination((WorldPoint) this.bS.getWorldLocation().createWorldArea(lIlIIIlIIIlI[2]).toWorldPointList().stream().filter(worldPoint -> {
                return Reachable.isWalkable(worldPoint);
            }).min(Comparator.comparingDouble(obj -> {
                return nearest.getWorldArea().distanceTo((WorldPoint) obj);
            }).thenComparingDouble(obj2 -> {
                return ((WorldPoint) obj2).distanceTo2DHypotenuse(this.bS.getWorldLocation());
            })).orElse(null));
            return lIlIIIlIIIlI[2];
        } else if (llIlIlIllIIlIl(this.dA, lIlIIIlIIIlI[3]) && llIlIlIllIIlIl(tickCount - this.dB, lIlIIIlIIIlI[4])) {
            this.dB = tickCount;
            nearest.interact(lIlIIIIllIlI[lIlIIIlIIIlI[1]]);
            return lIlIIIlIIIlI[2];
        } else {
            return lIlIIIlIIIlI[2];
        }
    }

    private static boolean llIlIlIllIIIII(Object obj) {
        return obj == null;
    }

    private static boolean llIlIlIllIlIlI(Object obj) {
        return obj != null;
    }

    private static void llIlIlIlIlllll() {
        lIlIIIlIIIlI = new int[17];
        lIlIIIlIIIlI[0] = -" ".length();
        lIlIIIlIIIlI[1] = (49 ^ 14) & ((48 ^ 15) ^ (-1));
        lIlIIIlIIIlI[2] = " ".length();
        lIlIIIlIIIlI[3] = "  ".length();
        lIlIIIlIIIlI[4] = 54 ^ 50;
        lIlIIIlIIIlI[5] = -"  ".length();
        lIlIIIlIIIlI[6] = "   ".length();
        lIlIIIlIIIlI[7] = 84 ^ 82;
        lIlIIIlIIIlI[8] = 196 ^ 193;
        lIlIIIlIIIlI[9] = (((28 + 153) - 80) + 74) ^ (((59 + 124) - 122) + 130);
        lIlIIIlIIIlI[10] = 106 ^ 109;
        lIlIIIlIIIlI[11] = 162 ^ 170;
        lIlIIIlIIIlI[12] = (113 ^ 37) ^ (237 ^ 176);
        lIlIIIlIIIlI[13] = 179 ^ 185;
        lIlIIIlIIIlI[14] = (((0 + 17) - (-57)) + 88) ^ (((33 + 100) - 113) + 149);
        lIlIIIlIIIlI[15] = (((142 + 44) - 149) + 114) ^ (((52 + 59) - 21) + 65);
        lIlIIIlIIIlI[16] = 79 ^ 66;
    }

    private static boolean llIlIlIllIIlIl(int i, int i2) {
        return i > i2;
    }

    static {
        llIlIlIlIlllll();
        llIlIlIlIIIlIl();
    }

    private static boolean llIlIlIllIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIlIllIIlll(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlIlIllIIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlIlIllIIIlI(int i) {
        return i != 0;
    }

    @Inject
    protected aA(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIIlIIIlI[0];
        this.dA = lIlIIIlIIIlI[1];
        this.dB = lIlIIIlIIIlI[1];
    }

    private static void llIlIlIlIIIlIl() {
        lIlIIIIllIlI = new String[lIlIIIlIIIlI[16]];
        lIlIIIIllIlI[lIlIIIlIIIlI[1]] = llIlIlIlIIIIlI("21yta/BwfJg=", "AgHJM");
        lIlIIIIllIlI[lIlIIIlIIIlI[2]] = llIlIlIlIIIIll("ECoqD1kKMHBY", "cCPjy");
        lIlIIIIllIlI[lIlIIIlIIIlI[3]] = llIlIlIlIIIlII("4V2iU34YAHk=", "gNPcD");
        lIlIIIIllIlI[lIlIIIlIIIlI[6]] = llIlIlIlIIIIll("NyMaPiUAJw==", "gBiMD");
        lIlIIIIllIlI[lIlIIIlIIIlI[4]] = llIlIlIlIIIIlI("oomHpmkxku0=", "RWxRm");
        lIlIIIIllIlI[lIlIIIlIIIlI[8]] = llIlIlIlIIIlII("Sakz2qcYwsQ3X3/U3/ZquA==", "EjeTU");
        lIlIIIIllIlI[lIlIIIlIIIlI[7]] = llIlIlIlIIIlII("IJnIfvBxS/c=", "yJKRb");
        lIlIIIIllIlI[lIlIIIlIIIlI[10]] = llIlIlIlIIIlII("Mp2MpvWL4XZKhS5thI6mqw==", "dcGBg");
        lIlIIIIllIlI[lIlIIIlIIIlI[11]] = llIlIlIlIIIIlI("eKVVQSA2WEU=", "WYbpb");
        lIlIIIIllIlI[lIlIIIlIIIlI[12]] = llIlIlIlIIIIlI("9mctCgUipDdS3hIF+Jvowg==", "HuSSy");
        lIlIIIIllIlI[lIlIIIlIIIlI[13]] = llIlIlIlIIIIll("BjM7EREs", "GGOpr");
        lIlIIIIllIlI[lIlIIIlIIIlI[14]] = llIlIlIlIIIlII("l1lZ8cZM/KVJqK5mI6fRZg==", "yuKDz");
        lIlIIIIllIlI[lIlIIIlIIIlI[15]] = llIlIlIlIIIlII("ch7gfG/X27o=", "fhjYa");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIlIlIllIlIIl(this.ak.bw, N.GUARDIANS)) {
            ?? r0 = lIlIIIlIIIlI[2];
            "".length();
            return ((244 ^ 186) ^ (57 ^ 115)) <= 0 ? ((252 ^ 195) ^ (136 ^ 163)) & (((28 ^ 44) ^ (229 ^ 193)) ^ (-" ".length())) : r0;
        }
        return lIlIIIlIIIlI[1];
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return C0044s.b(C0044s.e(N.GUARDIANS));
    }

    private static String llIlIlIlIIIlII(String lllllllllllllllIlllIIIIlllIIIIlI, String lllllllllllllllIlllIIIIlllIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIlllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIIIlllIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIIIlllIIIlII.init(lIlIIIlIIIlI[3], secretKeySpec);
            return new String(lllllllllllllllIlllIIIIlllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIlllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIIlllIIIIll) {
            lllllllllllllllIlllIIIIlllIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIllIIIll(int i, int i2) {
        return i <= i2;
    }

    private WorldArea cP() {
        List all = NPCs.getAll(npc -> {
            if (llIlIlIllIIIlI(npc.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[12]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIlIIIlI[2]];
                strArr[lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[13]];
                if (llIlIlIllIIIlI(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIIlIIIlI[2];
                    "".length();
                    return (((199 ^ 193) ^ (186 ^ 155)) & (((223 ^ 134) ^ (93 ^ 35)) ^ (-" ".length()))) != 0 ? ((234 ^ 130) ^ (161 ^ 131)) & (((225 ^ 177) ^ (147 ^ 137)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIIlIIIlI[1];
        });
        if (llIlIlIllIIllI(all.size())) {
            return null;
        }
        if (llIlIlIllIIlII(all.size(), lIlIIIlIIIlI[3])) {
            WorldPoint worldLocation = ((NPC) all.get(lIlIIIlIIIlI[1])).getWorldLocation();
            WorldPoint worldLocation2 = ((NPC) all.get(lIlIIIlIIIlI[2])).getWorldLocation();
            System.out.println(lIlIIIIllIlI[lIlIIIlIIIlI[2]]);
            return (!llIlIlIllIIlll(worldLocation.getWorldX(), worldLocation2.getWorldX()) || llIlIlIllIlIII(worldLocation.getWorldY(), worldLocation2.getWorldY())) ? new WorldArea(worldLocation.dx(lIlIIIlIIIlI[5]).dy(lIlIIIlIIIlI[5]), worldLocation2.dx(lIlIIIlIIIlI[6]).dy(lIlIIIlIIIlI[6])) : new WorldArea(worldLocation2.dx(lIlIIIlIIIlI[5]).dy(lIlIIIlIIIlI[5]), worldLocation.dx(lIlIIIlIIIlI[6]).dy(lIlIIIlIIIlI[6]));
        }
        return new WorldArea(((NPC) all.get(lIlIIIlIIIlI[1])).getWorldLocation().dx(lIlIIIlIIIlI[5]).dy(lIlIIIlIIIlI[5]), lIlIIIlIIIlI[7], lIlIIIlIIIlI[7]);
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (llIlIlIllIIIlI(npc.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[8]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIlIIIlI[2]];
                strArr[lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[7]];
                if (llIlIlIllIIIlI(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIIlIIIlI[2];
                    "".length();
                    return (-" ".length()) > "  ".length() ? ((((37 + 82) - 67) + 104) ^ (((160 + 75) - 194) + 140)) & (((((109 + 89) - 63) + 0) ^ (((165 + 128) - 164) + 45)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIIlIIIlI[1];
        });
        if (llIlIlIllIIIII(nearest) || llIlIlIllIIlIl(nearest.getWorldLocation().distanceTo(this.bS), lIlIIIlIIIlI[8])) {
            return null;
        }
        return Prayers.getOffensive();
    }

    private static boolean llIlIlIllIlIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    private boolean cS() {
        if (llIlIlIllIIIlI(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            if (llIlIlIllIlIlI(Movement.getDestination()) && llIlIlIllIIIlI(Movement.getDestination().equals(this.al.bt) ? 1 : 0)) {
                return lIlIIIlIIIlI[1];
            }
            Movement.setDestination(this.al.bs);
            return lIlIIIlIIIlI[2];
        }
        TileObject cR = cR();
        if (llIlIlIllIIIII(cR)) {
            Movement.setDestination(this.ak.bq.dx(lIlIIIlIIIlI[9]).dy(lIlIIIlIIIlI[9]));
            return lIlIIIlIIIlI[2];
        } else if (!llIlIlIllIIllI(this.bS.isMoving() ? 1 : 0) || llIlIlIllIIIlI(this.bS.isAnimating() ? 1 : 0)) {
            return lIlIIIlIIIlI[1];
        } else {
            cR.interact(lIlIIIIllIlI[lIlIIIlIIIlI[3]]);
            return lIlIIIlIIIlI[2];
        }
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            if (llIlIlIllIIIlI(tileObject.getName().equals(lIlIIIIllIlI[lIlIIIlIIIlI[6]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIlIIIlI[2]];
                strArr[lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[4]];
                if (llIlIlIllIIIlI(tileObject.hasAction(strArr) ? 1 : 0) && llIlIlIllIIIlI(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIIIlIIIlI[2];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIIlIIIlI[1];
        });
    }

    private WorldPoint cQ() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (llIlIlIllIIIlI(npc.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[10]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIlIIIlI[2]];
                strArr[lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[11]];
                if (llIlIlIllIIIlI(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIIlIIIlI[2];
                    "".length();
                    return (-" ".length()) >= 0 ? (true ^ true) & (true ^ true) : r0;
                }
            }
            return lIlIIIlIIIlI[1];
        });
        return (WorldPoint) cP().getMeleeTiles(this.cq).stream().filter(worldPoint -> {
            return Reachable.isWalkable(worldPoint);
        }).min(Comparator.comparingDouble(worldPoint2 -> {
            return worldPoint2.distanceToHypotenuse(nearest.getWorldLocation());
        })).orElse(null);
    }

    private static String llIlIlIlIIIIll(String lllllllllllllllIlllIIIIlllIlIlll, String lllllllllllllllIlllIIIIlllIlIllI) {
        String lllllllllllllllIlllIIIIlllIlIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIIIlllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIIIlllIlIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIIIIlllIlIllI.toCharArray();
        int lllllllllllllllIlllIIIIlllIlIIll = lIlIIIlIIIlI[1];
        char[] charArray2 = lllllllllllllllIlllIIIIlllIlIlll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIlIIIlI[1];
        while (llIlIlIllIlIII(i, length)) {
            lllllllllllllllIlllIIIIlllIlIlIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlllIIIIlllIlIIll % charArray.length]));
            "".length();
            lllllllllllllllIlllIIIIlllIlIIll++;
            i++;
            "".length();
            if ((((((131 + 87) - 167) + 151) ^ (((91 + 18) - 14) + 47)) & (((((185 + 60) - 107) + 71) ^ (((86 + 129) - 185) + 119)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIIIIlllIlIlIl);
    }

    private static boolean llIlIlIllIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIlIlIllIIllI(int i) {
        return i == 0;
    }
}
