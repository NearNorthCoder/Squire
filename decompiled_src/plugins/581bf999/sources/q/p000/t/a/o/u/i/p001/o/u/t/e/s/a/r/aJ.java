package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.StatChanged;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.BoostingPotion;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Doing boulder dash", priority = 100, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aJ  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aJ.class */
public class aJ extends aI {
    private /* synthetic */ int dZ;
    private static /* synthetic */ String[] llIIllIIIlI;
    private static final /* synthetic */ int dT;
    private /* synthetic */ NPC dW;
    private final /* synthetic */ Set<NPC> dU;
    private /* synthetic */ int dY;
    private static final /* synthetic */ Point[] dQ;
    private final /* synthetic */ Set<NPC> dV;
    private static final /* synthetic */ int dR;
    private /* synthetic */ int ea;
    private static final /* synthetic */ int[] dS;
    private /* synthetic */ boolean dX;
    private static /* synthetic */ int[] llIIllIlIIl;

    private static boolean lIlIIIlIlllIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.dW = null;
        this.dV.clear();
        this.dU.clear();
        this.dX = llIIllIlIIl[0];
        this.ea = llIIllIlIIl[0];
    }

    private static boolean lIlIIIlIllIIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIIlIllIIII(int i) {
        return i > 0;
    }

    private static boolean lIlIIIlIllIlIl(int i) {
        return i == 0;
    }

    @Subscribe
    public void b(StatChanged statChanged) {
        if (lIlIIIlIllIIIl(this.dW)) {
            this.dU.add(this.dW);
            "".length();
        }
    }

    static {
        lIlIIIlIlIlIll();
        lIlIIIlIIIlIIl();
        dR = llIIllIlIIl[14];
        dT = llIIllIlIIl[13];
        Point[] pointArr = new Point[llIIllIlIIl[15]];
        pointArr[llIIllIlIIl[0]] = new Point(llIIllIlIIl[16], llIIllIlIIl[17]);
        pointArr[llIIllIlIIl[1]] = new Point(llIIllIlIIl[18], llIIllIlIIl[17]);
        pointArr[llIIllIlIIl[3]] = new Point(llIIllIlIIl[17], llIIllIlIIl[19]);
        pointArr[llIIllIlIIl[4]] = new Point(llIIllIlIIl[17], llIIllIlIIl[17]);
        pointArr[llIIllIlIIl[2]] = new Point(llIIllIlIIl[17], llIIllIlIIl[18]);
        pointArr[llIIllIlIIl[10]] = new Point(llIIllIlIIl[20], llIIllIlIIl[7]);
        pointArr[llIIllIlIIl[11]] = new Point(llIIllIlIIl[20], llIIllIlIIl[8]);
        dQ = pointArr;
        int[] iArr = new int[llIIllIlIIl[3]];
        iArr[llIIllIlIIl[0]] = llIIllIlIIl[21];
        iArr[llIIllIlIIl[1]] = llIIllIlIIl[14];
        dS = iArr;
    }

    private static String lIlIIIlIIIIllI(String llllllllllllllllIIlllIlllIlIlIIl, String llllllllllllllllIIlllIlllIlIlIII) {
        try {
            SecretKeySpec llllllllllllllllIIlllIlllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIlllIlIlIII.getBytes(StandardCharsets.UTF_8)), llIIllIlIIl[12]), "DES");
            Cipher llllllllllllllllIIlllIlllIlIlIll = Cipher.getInstance("DES");
            llllllllllllllllIIlllIlllIlIlIll.init(llIIllIlIIl[3], llllllllllllllllIIlllIlllIlIllII);
            return new String(llllllllllllllllIIlllIlllIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIlllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIlllIlIlIlI) {
            llllllllllllllllIIlllIlllIlIlIlI.printStackTrace();
            return null;
        }
    }

    private void bE() {
        Item first = Inventory.getFirst(item -> {
            return item.getName().toLowerCase().contains(llIIllIIIlI[llIIllIlIIl[3]]);
        });
        if (lIlIIIlIlIllll(first)) {
            return;
        }
        if (lIlIIIlIllIlll(Skills.getBoostedLevel(Skill.RANGED), (Skills.getLevel(Skill.RANGED) + BoostingPotion.RANGING_POTION.getBoostAmount(Skill.RANGED)) - llIIllIlIIl[4])) {
            return;
        }
        first.interact(llIIllIIIlI[llIIllIlIIl[1]]);
    }

    private static boolean lIlIIIlIlIllIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIIlIlllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIIlIllIllI(int i, int i2) {
        return i <= i2;
    }

    private static void lIlIIIlIlIlIll() {
        llIIllIlIIl = new int[22];
        llIIllIlIIl[0] = ((216 ^ 161) ^ (8 ^ 125)) & (((64 ^ 51) ^ (((69 + 11) - (-11)) + 36)) ^ (-" ".length()));
        llIIllIlIIl[1] = " ".length();
        llIIllIlIIl[2] = 85 ^ 81;
        llIIllIlIIl[3] = "  ".length();
        llIIllIlIIl[4] = "   ".length();
        llIIllIlIIl[5] = (-16554) & 28333;
        llIIllIlIIl[6] = 45 ^ 59;
        llIIllIlIIl[7] = (98 ^ 85) ^ (78 ^ 100);
        llIIllIlIIl[8] = 62 ^ 29;
        llIIllIlIIl[9] = ((235 + 140) - 147) + 17;
        llIIllIlIIl[10] = (((136 + 73) - 186) + 119) ^ (((39 + 12) - (-82)) + 6);
        llIIllIlIIl[11] = (203 ^ 158) ^ (253 ^ 174);
        llIIllIlIIl[12] = 23 ^ 31;
        llIIllIlIIl[13] = (-2403) & 12151;
        llIIllIlIIl[14] = (-((-4673) & 21449)) & (-33) & 28591;
        llIIllIlIIl[15] = 112 ^ 119;
        llIIllIlIIl[16] = 62 ^ 34;
        llIIllIlIIl[17] = (196 ^ 139) ^ (3 ^ 108);
        llIIllIlIIl[18] = (((137 + 54) - 43) + 2) ^ (((101 + 40) - 108) + 103);
        llIIllIlIIl[19] = (43 ^ 15) ^ (125 ^ 123);
        llIIllIlIIl[20] = 177 ^ 153;
        llIIllIlIIl[21] = (-16890) & 28671;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bq() {
        return llIIllIlIIl[1];
    }

    private static boolean lIlIIIlIlIllII(int i) {
        return i != 0;
    }

    private static boolean lIlIIIlIllIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIIlIlIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIlIllIIIl(Object obj) {
        return obj != null;
    }

    private static int lIlIIIlIlIlllI(float f, float f2) {
        return (f > f2 ? 1 : (f == f2 ? 0 : -1));
    }

    private static String lIlIIIlIIIlIII(String llllllllllllllllIIlllIllllIIlllI, String llllllllllllllllIIlllIllllIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIllllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIllllIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIllllIlIIII.init(llIIllIlIIl[3], secretKeySpec);
            return new String(llllllllllllllllIIlllIllllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIllllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIllllIIllll) {
            llllllllllllllllIIlllIllllIIllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v156, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v170, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v184, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v195, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v199, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v201, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v220, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v231, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v238, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v128, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v135, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v145, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aI
    public boolean bC() {
        NPC bB = bB();
        if (lIlIIIlIlIllll(bB)) {
            r();
            return llIIllIlIIl[0];
        }
        bE();
        if (lIlIIIlIllIIII(this.ea)) {
            this.ea -= llIIllIlIIl[1];
            if (!lIlIIIlIllIIIl(this.dW) || lIlIIIlIllIIlI(this.dW.distanceTo(Players.getLocal()), llIIllIlIIl[2])) {
                return llIIllIlIIl[1];
            }
        }
        if ((lIlIIIlIllIIll(this.dZ, llIIllIlIIl[3]) && !lIlIIIlIllIlII(bA(), llIIllIlIIl[4])) || (lIlIIIlIllIIll(this.dZ, llIIllIlIIl[1]) && lIlIIIlIllIIll(bA(), llIIllIlIIl[3]))) {
            this.dX = llIIllIlIIl[1];
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        this.dZ = bA();
        if (lIlIIIlIlIllII(this.dX ? 1 : 0) && lIlIIIlIllIlII(bB.getId(), llIIllIlIIl[5])) {
            if (lIlIIIlIllIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            WorldPoint a = a(new Point(llIIllIlIIl[6], llIIllIlIIl[7]));
            WorldPoint a2 = a(new Point(llIIllIlIIl[6], llIIllIlIIl[8]));
            WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
            if (lIlIIIlIllIIII(lIlIIIlIlIlllI(a.distanceTo2DHypotenuse(worldLocation2), a2.distanceTo2DHypotenuse(worldLocation2)))) {
                a = a2;
            }
            Movement.setDestination(a);
            return llIIllIlIIl[1];
        }
        if (lIlIIIlIllIIll(Players.getLocal().getGraphic(), llIIllIlIIl[9])) {
            this.dX = llIIllIlIIl[1];
        }
        if (lIlIIIlIllIlIl(this.dX ? 1 : 0)) {
            return llIIllIlIIl[0];
        }
        if (lIlIIIlIllIllI(bB.getWorldArea().getX(), worldLocation.getWorldX()) && lIlIIIlIlIllII(this.cW.redX() ? 1 : 0)) {
            if (lIlIIIlIlIllIl(a(dQ[llIIllIlIIl[10]]).getWorldX(), worldLocation.getWorldX())) {
                Movement.setDestination(worldLocation.dx(llIIllIlIIl[1]));
                return llIIllIlIIl[1];
            }
            this.dX = llIIllIlIIl[0];
            return llIIllIlIIl[0];
        }
        bp();
        if (lIlIIIlIllIlIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        List<NPC> bD = bD();
        WorldPoint a3 = a(dQ[llIIllIlIIl[0]]);
        if (lIlIIIlIllIlll(a3.getWorldX(), worldLocation.getWorldX())) {
            Movement.setDestination(a3);
            return llIIllIlIIl[1];
        }
        List of = List.of(a(dQ[llIIllIlIIl[4]]), a(dQ[llIIllIlIIl[3]]), a(dQ[llIIllIlIIl[2]]));
        List of2 = List.of(a(dQ[llIIllIlIIl[10]]), a(dQ[llIIllIlIIl[11]]));
        int llllllllllllllllIIlllIlllllllllI = NPCs.getAll(dS).size();
        if (lIlIIIlIlIllII(bD.isEmpty() ? 1 : 0)) {
            WorldPoint a4 = a(dQ[llIIllIlIIl[1]]);
            if (!lIlIIIlIllIlII(llllllllllllllllIIlllIlllllllllI, llIIllIlIIl[12]) || (lIlIIIlIllIIIl(this.dW) && lIlIIIlIlIllII(this.dW.getWorldArea().contains(worldLocation) ? 1 : 0) && lIlIIIlIllIlll(llllllllllllllllIIlllIlllllllllI, llIIllIlIIl[10]))) {
                a4 = (WorldPoint) of2.stream().min(Comparator.comparingDouble(worldPoint -> {
                    return worldPoint.distanceTo2DHypotenuse(worldLocation);
                })).orElse(null);
            }
            if (lIlIIIlIllIlll(a4.getWorldX(), worldLocation.getWorldX())) {
                Movement.setDestination(a4);
            }
            return llIIllIlIIl[1];
        }
        NPC orElse = bD.stream().filter(npc -> {
            if (lIlIIIlIllIIll(npc.getId(), llIIllIlIIl[14]) && lIlIIIlIllIlIl(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIIllIlIIl[1];
                "".length();
                return "   ".length() <= (((((25 + 141) - 78) + 64) ^ (((80 + 58) - 81) + 85)) & (((142 ^ 130) ^ (217 ^ 195)) ^ (-" ".length()))) ? ((158 ^ 145) ^ (71 ^ 30)) & (((((132 + 46) - 26) + 64) ^ (((4 + 16) - (-29)) + 93)) ^ (-" ".length())) : r0;
            }
            return llIIllIlIIl[0];
        }).filter(npc2 -> {
            if (lIlIIIlIllIlIl(this.dV.contains(npc2) ? 1 : 0)) {
                ?? r0 = llIIllIlIIl[1];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? " ".length() & (" ".length() ^ (-1)) : r0;
            }
            return llIIllIlIIl[0];
        }).filter(npc3 -> {
            if (lIlIIIlIlllIIl(npc3, this.dW)) {
                ?? r0 = llIIllIlIIl[1];
                "".length();
                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIllIlIIl[0];
        }).findFirst().orElse(null);
        if (!lIlIIIlIlIllll(orElse)) {
            orElse.interact(llIIllIIIlI[llIIllIlIIl[0]]);
            if (lIlIIIlIlIllII(Equipment.contains(item -> {
                return item.getName().contains(llIIllIIIlI[llIIllIlIIl[4]]);
            }) ? 1 : 0)) {
                this.ea = llIIllIlIIl[1];
            }
            this.dW = orElse;
            return llIIllIlIIl[1];
        }
        WorldPoint a5 = a(dQ[llIIllIlIIl[4]]);
        WorldPoint a6 = a(dQ[llIIllIlIIl[3]]);
        WorldPoint a7 = a(dQ[llIIllIlIIl[2]]);
        if (lIlIIIlIlIllll(this.dW)) {
            return llIIllIlIIl[0];
        }
        WorldArea worldArea = this.dW.getWorldArea();
        WorldPoint[] worldPointArr = new WorldPoint[llIIllIlIIl[4]];
        worldPointArr[llIIllIlIIl[0]] = a5;
        worldPointArr[llIIllIlIIl[1]] = a6;
        worldPointArr[llIIllIlIIl[3]] = a7;
        WorldPoint worldPoint2 = (WorldPoint) Stream.of((Object[]) worldPointArr).min(Comparator.comparingDouble(worldPoint3 -> {
            return worldPoint3.distanceTo2DHypotenuse(worldArea.getCenter());
        })).orElse(null);
        if (lIlIIIlIlIllII(of.stream().allMatch(worldPoint4 -> {
            if (lIlIIIlIllIllI(worldPoint4.getWorldX(), worldLocation.getWorldX())) {
                ?? r0 = llIIllIlIIl[1];
                "".length();
                return (-" ".length()) > " ".length() ? ((122 ^ 18) ^ (135 ^ 180)) & (((((101 + 183) - 250) + 206) ^ (((140 + 97) - 110) + 44)) ^ (-" ".length())) : r0;
            }
            return llIIllIlIIl[0];
        }) ? 1 : 0)) {
            if (lIlIIIlIlIllII(of.contains(worldLocation) ? 1 : 0)) {
                worldPoint2 = worldLocation.dx(llIIllIlIIl[1]);
                "".length();
                if ((-" ".length()) > (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lIlIIIlIlIllII(worldArea.contains(worldLocation) ? 1 : 0) && lIlIIIlIllIlll(llllllllllllllllIIlllIlllllllllI, llIIllIlIIl[10])) {
                worldPoint2 = (WorldPoint) of2.stream().min(Comparator.comparingDouble(worldPoint5 -> {
                    return worldPoint5.distanceTo2DHypotenuse(worldLocation);
                })).orElse(null);
                "".length();
                if (((((123 + 116) - 104) + 30) ^ (((145 + 104) - 148) + 60)) <= 0) {
                    return ((31 ^ 116) ^ (213 ^ 151)) & (((((57 + 125) - 52) + 25) ^ (((119 + 23) - (-20)) + 16)) ^ (-" ".length()));
                }
            } else if (lIlIIIlIllIlll(Math.abs(worldArea.getCenter().getWorldY() - worldLocation.getWorldY()), llIIllIlIIl[1])) {
                worldPoint2 = new WorldPoint(worldLocation.getWorldX() + llIIllIlIIl[3], worldArea.getCenter().getWorldY(), this.cu.getPlane());
                "".length();
                if (0 != 0) {
                    return ((((76 + 111) - 108) + 49) ^ (((60 + 85) - 47) + 59)) & (((((81 + 49) - 100) + 110) ^ (((140 + 49) - 45) + 1)) ^ (-" ".length()));
                }
            } else if (lIlIIIlIllIllI(llllllllllllllllIIlllIlllllllllI, llIIllIlIIl[10])) {
                return llIIllIlIIl[1];
            } else {
                worldPoint2 = worldArea.getCenter();
            }
        }
        Movement.setDestination(worldPoint2);
        return llIIllIlIIl[1];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aI, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.babaBoulderAttackStyle();
    }

    private static void lIlIIIlIIIlIIl() {
        llIIllIIIlI = new String[llIIllIlIIl[2]];
        llIIllIIIlI[llIIllIlIIl[0]] = lIlIIIlIIIIllI("Al+vSs1miTg=", "cZdho");
        llIIllIIIlI[llIIllIlIIl[1]] = lIlIIIlIIIIlll("Kx4LIAQ=", "olbNo");
        llIIllIIIlI[llIIllIlIIl[3]] = lIlIIIlIIIIlll("AwcNCQ0fAQ==", "qfcnd");
        llIIllIIIlI[llIIllIlIIl[4]] = lIlIIIlIIIlIII("saI7Q5jsl8qAbohWEf/Bqw==", "SAyNr");
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (lIlIIIlIlllIII(animationChanged.getActor(), bB()) && lIlIIIlIllIIll(animationChanged.getActor().getAnimation(), llIIllIlIIl[13])) {
            this.dY = Static.getClient().getTickCount();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Inject
    protected aJ(Client client, C0077z c0077z, TOAConfig tOAConfig, SquireAutoTOA squireAutoTOA) {
        super(client, c0077z, tOAConfig);
        this.dU = new HashSet();
        this.dV = new HashSet();
        this.dX = llIIllIlIIl[0];
        this.dZ = llIIllIlIIl[0];
        this.ea = llIIllIlIIl[0];
        this.aY = squireAutoTOA;
    }

    private static boolean lIlIIIlIllIlII(int i, int i2) {
        return i != i2;
    }

    private List<NPC> bD() {
        List all = NPCs.getAll(dS);
        int worldX = Players.getLocal().getWorldX();
        int i = worldX;
        Iterator it = all.iterator();
        do {
            if (lIlIIIlIlIllII(it.hasNext() ? 1 : 0)) {
                NPC npc = (NPC) it.next();
                if (lIlIIIlIlIllIl(npc.getWorldLocation().getX(), worldX) && lIlIIIlIlIllII(NPCs.getAll(npc2 -> {
                    if (lIlIIIlIllIIll(npc2.getId(), npc.getId()) && lIlIIIlIllIlII(npc2.getWorldLocation().getX(), npc.getWorldLocation().getX()) && lIlIIIlIllIIlI(npc2.getWorldArea().getX() + npc2.getWorldArea().getWidth(), npc.getWorldLocation().getX()) && lIlIIIlIlIllIl(npc2.getWorldArea().getX(), worldX)) {
                        ?? r0 = llIIllIlIIl[1];
                        "".length();
                        return "  ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIllIlIIl[0];
                }).isEmpty() ? 1 : 0)) {
                    i = npc.getWorldLocation().getX();
                    "".length();
                    if ((((21 ^ 74) ^ (30 ^ 112)) & (((2 ^ 56) ^ (93 ^ 86)) ^ (-" ".length()))) != 0) {
                        return null;
                    }
                } else {
                    "".length();
                }
            }
            int i2 = i;
            return (List) all.stream().filter(npc3 -> {
                if (lIlIIIlIllIIll(npc3.getWorldLocation().getX(), i2)) {
                    ?? r0 = llIIllIlIIl[1];
                    "".length();
                    return (-"   ".length()) > 0 ? ((194 ^ 148) ^ (20 ^ 122)) & (((23 ^ 14) ^ (64 ^ 97)) ^ (-" ".length())) : r0;
                }
                return llIIllIlIIl[0];
            }).collect(Collectors.toList());
        } while (((((21 + 187) - 25) + 6) ^ (((128 + 112) - 74) + 18)) != 0);
        return null;
    }

    private static String lIlIIIlIIIIlll(String llllllllllllllllIIlllIlllIlllllI, String llllllllllllllllIIlllIlllIllllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIlllIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIlllIllllII = new StringBuilder();
        char[] charArray = llllllllllllllllIIlllIlllIllllIl.toCharArray();
        int llllllllllllllllIIlllIlllIlllIlI = llIIllIlIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIllIlIIl[0];
        while (lIlIIIlIllIIlI(i, length)) {
            char llllllllllllllllIIlllIlllIllllll = charArray2[i];
            llllllllllllllllIIlllIlllIllllII.append((char) (llllllllllllllllIIlllIlllIllllll ^ charArray[llllllllllllllllIIlllIlllIlllIlI % charArray.length]));
            "".length();
            llllllllllllllllIIlllIlllIlllIlI++;
            i++;
            "".length();
            if ((59 ^ 63) < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlllIlllIllllII);
    }

    private static boolean lIlIIIlIllIIlI(int i, int i2) {
        return i < i2;
    }
}
