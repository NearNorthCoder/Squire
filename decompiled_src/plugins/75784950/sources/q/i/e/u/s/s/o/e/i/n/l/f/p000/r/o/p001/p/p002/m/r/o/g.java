package q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Eclipse moon")
/* renamed from: q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.g  reason: invalid package */
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:q/i/e/u/s/s/o/e/i/n/l/f/-/r/o/-/p/-/m/r/o/g.class */
public class g extends Task {
    private static /* synthetic */ int[] lIIIIIIlIIlII;
    private static /* synthetic */ Set<WorldPoint> P;
    private final /* synthetic */ SquireMoonsOfPerilConfig O;
    private static /* synthetic */ String[] lIIIIIIlIIIll;
    /* synthetic */ WorldArea Q = new WorldArea(lIIIIIIlIIlII[0], lIIIIIIlIIlII[1], lIIIIIIlIIlII[2], lIIIIIIlIIlII[3], lIIIIIIlIIlII[4]);
    /* synthetic */ WorldArea B = new WorldArea(new WorldPoint(lIIIIIIlIIlII[5], lIIIIIIlIIlII[6], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[7], lIIIIIIlIIlII[8], lIIIIIIlIIlII[4]));
    /* synthetic */ WorldArea C = new WorldArea(new WorldPoint(lIIIIIIlIIlII[9], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[11], lIIIIIIlIIlII[12], lIIIIIIlIIlII[4]));
    /* synthetic */ WorldArea D = new WorldArea(new WorldPoint(lIIIIIIlIIlII[13], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[14], lIIIIIIlIIlII[12], lIIIIIIlIIlII[4]));
    /* synthetic */ WorldArea E = new WorldArea(new WorldPoint(lIIIIIIlIIlII[15], lIIIIIIlIIlII[6], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[16], lIIIIIIlIIlII[8], lIIIIIIlIIlII[4]));
    /* synthetic */ WorldArea F = new WorldArea(new WorldPoint(lIIIIIIlIIlII[15], lIIIIIIlIIlII[17], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[16], lIIIIIIlIIlII[18], lIIIIIIlIIlII[4]));
    /* synthetic */ WorldArea G = new WorldArea(new WorldPoint(lIIIIIIlIIlII[13], lIIIIIIlIIlII[19], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[14], lIIIIIIlIIlII[20], lIIIIIIlIIlII[4]));
    /* synthetic */ WorldArea H = new WorldArea(new WorldPoint(lIIIIIIlIIlII[9], lIIIIIIlIIlII[19], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[11], lIIIIIIlIIlII[20], lIIIIIIlIIlII[4]));
    /* synthetic */ WorldArea I = new WorldArea(new WorldPoint(lIIIIIIlIIlII[5], lIIIIIIlIIlII[17], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[7], lIIIIIIlIIlII[18], lIIIIIIlIIlII[4]));

    private static boolean lIIlIlllIllIlll(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlIlllIlIllll();
        lIIlIlllIlIlllI();
        P = new HashSet();
    }

    private static String lIIlIlllIlIlIll(String lllllllllllllllIIIllllIIIlllllIl, String lllllllllllllllIIIllllIIIlllllII) {
        try {
            SecretKeySpec lllllllllllllllIIIllllIIlIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllIIIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIllllIIIlllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIllllIIIlllllll.init(lIIIIIIlIIlII[22], lllllllllllllllIIIllllIIlIIIIIII);
            return new String(lllllllllllllllIIIllllIIIlllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllIIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIllllIIIllllllI) {
            lllllllllllllllIIIllllIIIllllllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public g(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.O = squireMoonsOfPerilConfig;
    }

    private static void lIIlIlllIlIllll() {
        lIIIIIIlIIlII = new int[41];
        lIIIIIIlIIlII[0] = (-16385) & 17855;
        lIIIIIIlIIlII[1] = (-(208 ^ 178)) & (-2069) & 11775;
        lIIIIIIlIIlII[2] = (102 ^ 68) ^ (122 ^ 126);
        lIIIIIIlIIlII[3] = (((53 + 16) - (-65)) + 22) ^ (((163 + 175) - 251) + 89);
        lIIIIIIlIIlII[4] = ((86 ^ 20) ^ (65 ^ 50)) & (((18 ^ 114) ^ (28 ^ 77)) ^ (-" ".length()));
        lIIIIIIlIIlII[5] = (-22563) & 24046;
        lIIIIIIlIIlII[6] = (-((-3809) & 20223)) & (-4609) & 30655;
        lIIIIIIlIIlII[7] = (-18481) & 19965;
        lIIIIIIlIIlII[8] = (-((-1323) & 21887)) & (-513) & 30710;
        lIIIIIIlIIlII[9] = (-25122) & 26607;
        lIIIIIIlIIlII[10] = (-((-2185) & 23245)) & (-9) & 30703;
        lIIIIIIlIIlII[11] = (-4609) & 6095;
        lIIIIIIlIIlII[12] = (-((-14484) & 30943)) & (-6657) & 32751;
        lIIIIIIlIIlII[13] = (-(147 ^ 148)) & (-12801) & 14295;
        lIIIIIIlIIlII[14] = (-2061) & 3550;
        lIIIIIIlIIlII[15] = (-2085) & 3575;
        lIIIIIIlIIlII[16] = (-10274) & 11765;
        lIIIIIIlIIlII[17] = (-16386) & 26015;
        lIIIIIIlIIlII[18] = (-6209) & 15839;
        lIIIIIIlIIlII[19] = (-((-5617) & 24562)) & (-67) & 28639;
        lIIIIIIlIIlII[20] = (-((-2053) & 19047)) & (-4097) & 30719;
        lIIIIIIlIIlII[21] = " ".length();
        lIIIIIIlIIlII[22] = "  ".length();
        lIIIIIIlIIlII[23] = "   ".length();
        lIIIIIIlIIlII[24] = (-((-12567) & 32055)) & (-267) & 32766;
        lIIIIIIlIIlII[25] = (((131 + 101) - 193) + 145) ^ (((0 + 95) - (-15)) + 78);
        lIIIIIIlIIlII[26] = 179 ^ 182;
        lIIIIIIlIIlII[27] = (-((-6165) & 14487)) & (-2) & 30647;
        lIIIIIIlIIlII[28] = (21 ^ 83) ^ (199 ^ 135);
        lIIIIIIlIIlII[29] = (((24 + 110) - 84) + 93) ^ (((22 + 26) - 20) + 108);
        lIIIIIIlIIlII[30] = -" ".length();
        lIIIIIIlIIlII[31] = (-16921) & 26557;
        lIIIIIIlIIlII[32] = (-16401) & 17883;
        lIIIIIIlIIlII[33] = (-16902) & 18389;
        lIIIIIIlIIlII[34] = (-20557) & 30188;
        lIIIIIIlIIlII[35] = (((61 + 16) - (-98)) + 16) ^ (((27 + 30) - 15) + 141);
        lIIIIIIlIIlII[36] = (-((-14030) & 30703)) & (-1) & 29693;
        lIIIIIIlIIlII[37] = (198 ^ 173) ^ (25 ^ 123);
        lIIIIIIlIIlII[38] = 34 ^ 40;
        lIIIIIIlIIlII[39] = (-16641) & 29655;
        lIIIIIIlIIlII[40] = 166 ^ 173;
    }

    private static boolean lIIlIlllIllIllI(int i, int i2) {
        return i != i2;
    }

    private static String lIIlIlllIlIllII(String lllllllllllllllIIIllllIIIllIllIl, String lllllllllllllllIIIllllIIIllIllII) {
        String lllllllllllllllIIIllllIIIllIllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIllllIIIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIllllIIIllIllII.toCharArray();
        int lllllllllllllllIIIllllIIIllIlIIl = lIIIIIIlIIlII[4];
        char[] charArray2 = lllllllllllllllIIIllllIIIllIllIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIIIIIlIIlII[4];
        while (lIIlIlllIllIlll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIIllllIIIllIlIIl % charArray.length]));
            "".length();
            lllllllllllllllIIIllllIIIllIlIIl++;
            i++;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private WorldArea d(WorldPoint worldPoint) {
        WorldArea[] worldAreaArr = new WorldArea[lIIIIIIlIIlII[35]];
        worldAreaArr[lIIIIIIlIIlII[4]] = this.B;
        worldAreaArr[lIIIIIIlIIlII[21]] = this.C;
        worldAreaArr[lIIIIIIlIIlII[22]] = this.D;
        worldAreaArr[lIIIIIIlIIlII[23]] = this.E;
        worldAreaArr[lIIIIIIlIIlII[25]] = this.F;
        worldAreaArr[lIIIIIIlIIlII[26]] = this.G;
        worldAreaArr[lIIIIIIlIIlII[28]] = this.H;
        worldAreaArr[lIIIIIIlIIlII[29]] = this.I;
        List asList = Arrays.asList(worldAreaArr);
        WorldArea worldArea = null;
        int i = lIIIIIIlIIlII[4];
        do {
            if (lIIlIlllIllIlll(i, asList.size())) {
                if (lIIlIlllIllIIIl(((WorldArea) asList.get(i)).contains(worldPoint) ? 1 : 0)) {
                    worldArea = (WorldArea) asList.get(i);
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                } else {
                    i++;
                    "".length();
                }
            }
            return worldArea;
        } while ((-" ".length()) < "  ".length());
        return null;
    }

    private static boolean lIIlIlllIllIIII(int i) {
        return i == 0;
    }

    private static boolean lIIlIlllIllIIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v126, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v170, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v175, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v182, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v210, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    public boolean run() {
        if (lIIlIlllIllIIII(a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIlIIlII[4];
        }
        if (lIIlIlllIllIIII(b().isFullyEquipped() ? 1 : 0)) {
            if (lIIlIlllIllIIIl(Inventory.isFull() ? 1 : 0)) {
                String[] strArr = new String[lIIIIIIlIIlII[21]];
                strArr[lIIIIIIlIIlII[4]] = lIIIIIIlIIIll[lIIIIIIlIIlII[4]];
                if (lIIlIlllIllIIIl(Inventory.contains(strArr) ? 1 : 0) && lIIlIlllIllIIlI(Equipment.fromSlot(EquipmentInventorySlot.SHIELD)) && lIIlIlllIllIIll(b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] strArr2 = new String[lIIIIIIlIIlII[21]];
                    strArr2[lIIIIIIlIIlII[4]] = lIIIIIIlIIIll[lIIIIIIlIIlII[21]];
                    Inventory.getFirst(strArr2).interact(lIIIIIIlIIIll[lIIIIIIlIIlII[22]]);
                }
            }
            b().swap();
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if (lIIlIlllIllIlIl(npc.getId(), lIIIIIIlIIlII[39]) && lIIlIlllIllIIIl(a(npc.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIIIIIIlIIlII[21];
                "".length();
                return (31 ^ 27) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIIIIIlIIlII[4];
        });
        if (lIIlIlllIllIIlI(nearest)) {
            WorldArea d = d(nearest.getWorldLocation());
            if (lIIlIlllIllIIlI(d)) {
                if (lIIlIlllIllIIII(d.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIIll[lIIIIIIlIIlII[23]];
                    Movement.setDestination(nearest.getWorldLocation());
                    return lIIIIIIlIIlII[4];
                } else if (lIIlIlllIllIIIl(d.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr = new int[lIIIIIIlIIlII[21]];
                    iArr[lIIIIIIlIIlII[4]] = lIIIIIIlIIlII[24];
                    NPC nearest2 = NPCs.getNearest(iArr);
                    if (lIIlIlllIllIIlI(nearest2)) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIIll[lIIIIIIlIIlII[25]];
                        if (lIIlIlllIllIIIl(l.l() ? 1 : 0) && lIIlIlllIllIIIl(Inventory.contains(item -> {
                            return item.getName().contains(lIIIIIIlIIIll[lIIIIIIlIIlII[38]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item2 -> {
                                return item2.getName().contains(lIIIIIIlIIIll[lIIIIIIlIIlII[37]]);
                            }).interact(lIIIIIIlIIIll[lIIIIIIlIIlII[26]]);
                            return lIIIIIIlIIlII[4];
                        }
                        int[] iArr2 = new int[lIIIIIIlIIlII[21]];
                        iArr2[lIIIIIIlIIlII[4]] = lIIIIIIlIIlII[27];
                        if (lIIlIlllIllIIIl(Equipment.contains(iArr2) ? 1 : 0) && lIIlIlllIllIlII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
                            return lIIIIIIlIIlII[4];
                        }
                        nearest2.interact(lIIIIIIlIIIll[lIIIIIIlIIlII[28]]);
                        return lIIIIIIlIIlII[21];
                    }
                }
            }
        }
        NPC nearest3 = NPCs.getNearest(npc2 -> {
            if (lIIlIlllIllIlIl(npc2.getId(), lIIIIIIlIIlII[36]) && lIIlIlllIllIIIl(a(npc2.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIIIIIIlIIlII[21];
                "".length();
                return (((((105 + 46) - 94) + 97) ^ (((95 + 147) - 126) + 78)) & (((12 ^ 95) ^ (175 ^ 164)) ^ (-" ".length()))) != 0 ? ((90 ^ 95) ^ (150 ^ 197)) & (((((47 + 211) - 249) + 203) ^ (((82 + 56) - 89) + 81)) ^ (-" ".length())) : r0;
            }
            return lIIIIIIlIIlII[4];
        });
        if (lIIlIlllIllIIlI(nearest3)) {
            if (lIIlIlllIllIIIl(nearest3.isMoving() ? 1 : 0)) {
                SquireMoonsOfPeril.g = lIIIIIIlIIIll[lIIIIIIlIIlII[29]];
                if (lIIlIlllIllIIII(Players.getLocal().getWorldLocation().equals(nearest3.getWorldLocation()) ? 1 : 0)) {
                    int i = lIIIIIIlIIlII[4];
                    int i2 = lIIIIIIlIIlII[4];
                    if (lIIlIlllIllIlIl(nearest3.getWorldLocation().getY(), lIIIIIIlIIlII[19]) && lIIlIlllIllIllI(nearest3.getWorldLocation().getX(), lIIIIIIlIIlII[15])) {
                        i = lIIIIIIlIIlII[30];
                    }
                    if (lIIlIlllIllIlIl(nearest3.getWorldLocation().getX(), lIIIIIIlIIlII[5])) {
                        i2 = lIIIIIIlIIlII[21];
                    }
                    if (lIIlIlllIllIlIl(nearest3.getWorldLocation().getY(), lIIIIIIlIIlII[10]) && lIIlIlllIllIllI(nearest3.getWorldLocation().getX(), lIIIIIIlIIlII[15])) {
                        i = lIIIIIIlIIlII[21];
                    }
                    if (lIIlIlllIllIlIl(nearest3.getWorldLocation().getX(), lIIIIIIlIIlII[15])) {
                        i2 = lIIIIIIlIIlII[30];
                    }
                    Movement.setDestination(new WorldPoint(nearest3.getWorldLocation().getX() + i, nearest3.getWorldLocation().getY() + i2, lIIIIIIlIIlII[4]));
                    return lIIIIIIlIIlII[21];
                }
            }
            if (lIIlIlllIllIIII(nearest3.isMoving() ? 1 : 0)) {
                if (lIIlIlllIllIIIl(nearest3.getWorldLocation().equals(new WorldPoint(lIIIIIIlIIlII[15], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4])) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(lIIIIIIlIIlII[16], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]);
                    if (lIIlIlllIllIIII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                        Movement.setDestination(worldPoint);
                        return lIIIIIIlIIlII[21];
                    }
                }
                if (lIIlIlllIllIIIl(nearest3.getWorldLocation().equals(new WorldPoint(lIIIIIIlIIlII[5], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4])) ? 1 : 0)) {
                    WorldPoint worldPoint2 = new WorldPoint(lIIIIIIlIIlII[7], lIIIIIIlIIlII[31], lIIIIIIlIIlII[4]);
                    if (lIIlIlllIllIIII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                        Movement.setDestination(worldPoint2);
                        return lIIIIIIlIIlII[21];
                    }
                }
                if (lIIlIlllIllIIIl(nearest3.getWorldLocation().equals(new WorldPoint(lIIIIIIlIIlII[5], lIIIIIIlIIlII[19], lIIIIIIlIIlII[4])) ? 1 : 0)) {
                    WorldPoint worldPoint3 = new WorldPoint(lIIIIIIlIIlII[32], lIIIIIIlIIlII[20], lIIIIIIlIIlII[4]);
                    if (lIIlIlllIllIIII(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                        Movement.setDestination(worldPoint3);
                        return lIIIIIIlIIlII[21];
                    }
                }
            }
        }
        if (lIIlIlllIllIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIIIIlIIlII[33], lIIIIIIlIIlII[34], lIIIIIIlIIlII[4])) ? 1 : 0)) {
            SquireMoonsOfPeril.g = lIIIIIIlIIIll[lIIIIIIlIIlII[35]];
            int[] iArr3 = new int[lIIIIIIlIIlII[21]];
            iArr3[lIIIIIIlIIlII[4]] = lIIIIIIlIIlII[24];
            NPC nearest4 = NPCs.getNearest(iArr3);
            if (lIIlIlllIllIIlI(nearest4)) {
                P.add(nearest4.getWorldLocation());
                "".length();
            }
            if (lIIlIlllIllIIII(SquireMoonsOfPeril.j.isEmpty() ? 1 : 0)) {
                Iterator<WorldPoint> it = SquireMoonsOfPeril.j.iterator();
                if (lIIlIlllIllIIIl(it.hasNext() ? 1 : 0)) {
                    Movement.setDestination(it.next());
                    it.remove();
                    Time.sleepTicks(lIIIIIIlIIlII[21]);
                    "".length();
                    return lIIIIIIlIIlII[21];
                }
            }
        }
        return lIIIIIIlIIlII[21];
    }

    private static boolean lIIlIlllIllIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.Q.contains(worldPoint);
    }

    private static boolean lIIlIlllIllIIll(int i) {
        return i <= 0;
    }

    private static void lIIlIlllIlIlllI() {
        lIIIIIIlIIIll = new String[lIIIIIIlIIlII[40]];
        lIIIIIIlIIIll[lIIIIIIlIIlII[4]] = lIIlIlllIlIlIll("90FvMC8zD+nEekdgRS1V7g==", "QGrvJ");
        lIIIIIIlIIIll[lIIIIIIlIIlII[21]] = lIIlIlllIlIlIll("+/63QeR55P+tIZHjnqjVmA==", "zDufE");
        lIIIIIIlIIIll[lIIIIIIlIIlII[22]] = lIIlIlllIlIlIll("3jaeNxJ5drg=", "GeYyP");
        lIIIIIIlIIIll[lIIIIIIlIIlII[23]] = lIIlIlllIlIllII("ChwxD2IzHGcZIyEWZxkyKAc=", "GsGjB");
        lIIIIIIlIIIll[lIIIIIIlIIlII[25]] = lIIlIlllIlIlIll("C7jCsP6Y6E2nRm+X/14C+Q==", "sbmYI");
        lIIIIIIlIIIll[lIIIIIIlIIlII[26]] = lIIlIlllIlIllIl("ZXwq4Gs4tbg=", "ZJqqy");
        lIIIIIIlIIIll[lIIIIIIlIIlII[28]] = lIIlIlllIlIllII("Aw0CNAQp", "ByvUg");
        lIIIIIIlIIIll[lIIIIIIlIIlII[29]] = lIIlIlllIlIllIl("nImUJQeSOkl1l5Qk+8d4RWOv2VgcrYK6", "McYOZ");
        lIIIIIIlIIIll[lIIIIIIlIIlII[35]] = lIIlIlllIlIllII("HzMwAgwlIWIfFS4l", "KFBle");
        lIIIIIIlIIIll[lIIIIIIlIIlII[37]] = lIIlIlllIlIlIll("1a4Md/ra0+H/n/WuTTY2/4KVqH2lZRaE", "GiTJe");
        lIIIIIIlIIIll[lIIIIIIlIIlII[38]] = lIIlIlllIlIlIll("OnJAxi/NZqJJusbjWIs/kc25YQu3Z7Jz", "IMXyL");
    }

    private static boolean lIIlIlllIllIlIl(int i, int i2) {
        return i == i2;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup) this.O.eclipseGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIlllIllIIlI(Object obj) {
        return obj != null;
    }

    private static String lIIlIlllIlIllIl(String lllllllllllllllIIIllllIIIlIllIII, String lllllllllllllllIIIllllIIIlIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIIlII[35]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIlIIlII[22], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllIIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIllllIIIlIllIIl) {
            lllllllllllllllIIIllllIIIlIllIIl.printStackTrace();
            return null;
        }
    }
}
