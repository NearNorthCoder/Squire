package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Attacking a baboon", priority = 10)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aQ  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aQ.class */
public class aQ extends aT {
    private final /* synthetic */ Set<NPC> ei;
    private static /* synthetic */ int[] llIllIIIlll;
    private /* synthetic */ String ej;
    private static /* synthetic */ String[] llIllIIIIlI;

    private static String lIlIlIIIlIlIII(String llllllllllllllllIIlIlllIlllllIIl, String llllllllllllllllIIlIlllIlllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlllIlllllIII.getBytes(StandardCharsets.UTF_8)), llIllIIIlll[12]), "DES");
            Cipher llllllllllllllllIIlIlllIlllllIll = Cipher.getInstance("DES");
            llllllllllllllllIIlIlllIlllllIll.init(llIllIIIlll[4], secretKeySpec);
            return new String(llllllllllllllllIIlIlllIlllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlllIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlllIlllllIlI) {
            llllllllllllllllIIlIlllIlllllIlI.printStackTrace();
            return null;
        }
    }

    private Predicate<NPC> a(String... strArr) {
        return npc -> {
            if (lIlIlIIlIIIllI(Stream.of((Object[]) strArr).anyMatch(str -> {
                return str.equals(npc.getName());
            }) ? 1 : 0) && lIlIlIIlIIlIII(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIllIIIlll[1];
                "".length();
                return 0 != 0 ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
            }
            return llIllIIIlll[0];
        };
    }

    private static void lIlIlIIIlIlIlI() {
        llIllIIIIlI = new String[llIllIIIlll[3]];
        llIllIIIIlI[llIllIIIlll[0]] = lIlIlIIIlIIlll("bCQytJOXsIk=", "dWzAS");
        llIllIIIIlI[llIllIIIlll[1]] = lIlIlIIIlIlIII("29AHS+agYZ0=", "sIhlP");
        llIllIIIIlI[llIllIIIlll[4]] = lIlIlIIIlIIlll("M7ulymWz7f1cvE9zu09O+g==", "KPsBM");
        llIllIIIIlI[llIllIIIlll[2]] = lIlIlIIIlIlIIl("BRUuHCUpVBgbOCYYIA==", "GtLsJ");
        llIllIIIIlI[llIllIIIlll[6]] = lIlIlIIIlIlIIl("MjAgJBsecQA5FQc9Jzk=", "pQBKt");
        llIllIIIIlI[llIllIIIlll[8]] = lIlIlIIIlIlIII("HlwnyZQs6b60N/RILLkuFw==", "juhvt");
        llIllIIIIlI[llIllIIIlll[9]] = lIlIlIIIlIIlll("UlZtNlpEY9Q=", "TBFbQ");
        llIllIIIIlI[llIllIIIlll[10]] = lIlIlIIIlIIlll("Uc4k4wXL/mVnwl3Wfxzx2A==", "HAPBU");
        llIllIIIIlI[llIllIIIlll[12]] = lIlIlIIIlIIlll("/UYzEVO2o+fW4o6M6GP54A==", "spYVO");
        llIllIIIIlI[llIllIIIlll[13]] = lIlIlIIIlIIlll("nVao+ixZEjNsAVPVhOrlgg==", "VTetc");
        llIllIIIIlI[llIllIIIlll[14]] = lIlIlIIIlIlIII("+QOFZR9YRA/jsdk3ubBEWw==", "hEixA");
        llIllIIIIlI[llIllIIIlll[15]] = lIlIlIIIlIlIII("yqr2kEmorJcVE8UprKKSSA==", "EcXxu");
        llIllIIIIlI[llIllIIIlll[16]] = lIlIlIIIlIlIII("sqyTbrQruBOjVRgE7ph45A==", "zlXyR");
        llIllIIIIlI[llIllIIIlll[17]] = lIlIlIIIlIIlll("kXNuy7cjHjBfId7tjDWwUw==", "tjfZO");
        llIllIIIIlI[llIllIIIlll[18]] = lIlIlIIIlIlIIl("CD4wMisvawAgLCQkLA==", "KKBAN");
        llIllIIIIlI[llIllIIIlll[19]] = lIlIlIIIlIIlll("dN6+RqpjfzWAAOc4i1iDmw==", "GmWJu");
        llIllIIIIlI[llIllIIIlll[20]] = lIlIlIIIlIlIII("tjaWY1FQv5WHalEseI5mQg==", "PIPOC");
        llIllIIIIlI[llIllIIIlll[22]] = lIlIlIIIlIIlll("cMiavvhCf12cGA/8kVhICg==", "PTksv");
        llIllIIIIlI[llIllIIIlll[23]] = lIlIlIIIlIlIII("QS3epBL9wIs8URMyxfHuyQ==", "NDwgN");
        llIllIIIIlI[llIllIIIlll[24]] = lIlIlIIIlIlIII("yu8WOvATzGViSgJ1Wy1WlA==", "Lisok");
        llIllIIIIlI[llIllIIIlll[25]] = lIlIlIIIlIlIIl("JzQkBBgLdRIDBQoiIxk=", "eUFkw");
        llIllIIIIlI[llIllIIIlll[26]] = lIlIlIIIlIlIII("f7cL1+KeqkkgBmFVIHZq/A==", "SOJBg");
        llIllIIIIlI[llIllIIIlll[27]] = lIlIlIIIlIlIIl("FzkzNzo7eAIwNDg5Pw==", "UXQXU");
        llIllIIIIlI[llIllIIIlll[28]] = lIlIlIIIlIIlll("Y5ufYBbSLxH4z5/6ddqo/Q==", "wyjjJ");
        llIllIIIIlI[llIllIIIlll[29]] = lIlIlIIIlIlIII("qtuyiYFpEVnhs9QbUTnpoQ==", "Tfbhd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aT
    public boolean bC() {
        SpellBook.Ancient ancient;
        int i;
        SpellBook.Ancient ancient2;
        int i2;
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (lIlIlIIlIIIllI(p(worldLocation) ? 1 : 0)) {
            WorldPoint worldPoint = (WorldPoint) worldLocation.createWorldArea(llIllIIIlll[2]).toWorldPointList().stream().filter(worldPoint2 -> {
                if (lIlIlIIlIIlIII(p(worldPoint2) ? 1 : 0)) {
                    ?? r0 = llIllIIIlll[1];
                    "".length();
                    return (((180 ^ 168) ^ (29 ^ 76)) & (((40 ^ 47) ^ (91 ^ 17)) ^ (-" ".length()))) > (((115 ^ 42) ^ (43 ^ 103)) & (((80 ^ 2) ^ (104 ^ 47)) ^ (-" ".length()))) ? ((((164 + 24) - 64) + 81) ^ (((113 + 47) - 96) + 89)) & (((((129 + 180) - 131) + 59) ^ (((81 + 111) - 140) + 133)) ^ (-" ".length())) : r0;
                }
                return llIllIIIlll[0];
            }).filter(Reachable::isWalkable).findFirst().orElse(null);
            if (lIlIlIIlIIIlll(worldPoint)) {
                Movement.setDestination(worldPoint);
                return llIllIIIlll[1];
            }
        }
        NPC bG = bG();
        if (lIlIlIIlIIIlIl(bG)) {
            return llIllIIIlll[0];
        }
        this.aY.a(llIllIIIlll[3]);
        this.ej = bG.getName();
        bp();
        String[] strArr = new String[llIllIIIlll[1]];
        strArr[llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[4]];
        if (lIlIlIIlIIlIII(TileObjects.getAll(strArr).isEmpty() ? 1 : 0) && (!lIlIlIIlIIlIIl(bG.distanceTo(Players.getLocal()), bg()) || lIlIlIIlIIlIII(Players.getLocal().getWorldArea().hasLineOfSightTo(this.cu.getTopLevelWorldView(), bG.getWorldLocation()) ? 1 : 0))) {
            WorldPoint worldLocation2 = bG.getWorldLocation();
            if (lIlIlIIlIIlIIl(bg(), llIllIIIlll[4])) {
                i2 = llIllIIIlll[1];
                "".length();
                if ("  ".length() <= 0) {
                    return ((104 ^ 39) ^ (32 ^ 82)) & ((" ".length() ^ (31 ^ 35)) ^ (-" ".length()));
                }
            } else {
                i2 = llIllIIIlll[4];
            }
            WorldPoint worldPoint3 = (WorldPoint) worldLocation2.createWorldArea(i2).toWorldPointList().stream().filter(worldPoint4 -> {
                if (lIlIlIIlIIIllI(Reachable.isWalkable(worldPoint4) ? 1 : 0) && lIlIlIIlIIlIII(p(worldPoint4) ? 1 : 0)) {
                    ?? r0 = llIllIIIlll[1];
                    "".length();
                    return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIllIIIlll[0];
            }).findFirst().orElse(null);
            if (lIlIlIIlIIIlIl(worldPoint3)) {
                return llIllIIIlll[0];
            }
            g(worldPoint3);
            return llIllIIIlll[1];
        }
        if (lIlIlIIlIIlIlI(Skills.getBoostedLevel(Skill.MAGIC), llIllIIIlll[5])) {
            ancient = SpellBook.Ancient.BLOOD_BURST;
            "".length();
            if (((225 ^ 171) & ((72 ^ 2) ^ (-1))) > "   ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            ancient = SpellBook.Ancient.BLOOD_BARRAGE;
        }
        SpellBook.Ancient ancient3 = ancient;
        if (!lIlIlIIlIIlIII(this.ej.equals(llIllIIIIlI[llIllIIIlll[2]]) ? 1 : 0) || lIlIlIIlIIIllI(this.ej.equals(llIllIIIIlI[llIllIIIlll[6]]) ? 1 : 0)) {
            i = llIllIIIlll[1];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((((89 + 78) - 123) + 108) ^ (((130 + 159) - 275) + 159)) & (((161 ^ 176) ^ (133 ^ 161)) ^ (-" ".length()));
            }
        } else {
            i = llIllIIIlll[0];
        }
        if (lIlIlIIlIIIllI(i) && lIlIlIIlIIIllI(ancient3.canCast() ? 1 : 0)) {
            Magic.cast(ancient3, bG);
            "".length();
            if ((-"   ".length()) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            if (lIlIlIIlIIlIlI(Skills.getBoostedLevel(Skill.MAGIC), llIllIIIlll[7])) {
                ancient2 = SpellBook.Ancient.ICE_BLITZ;
                "".length();
                if ((-((39 ^ 54) ^ (60 ^ 41))) >= 0) {
                    return (((101 ^ 66) & ((99 ^ 68) ^ (-1))) ^ (9 ^ 94)) & (((((225 + 153) - 353) + 211) ^ (((34 + 155) - 28) + 26)) ^ (-" ".length()));
                }
            } else {
                ancient2 = SpellBook.Ancient.ICE_BARRAGE;
            }
            SpellBook.Ancient ancient4 = ancient2;
            if (lIlIlIIlIIIllI(this.ej.equals(llIllIIIIlI[llIllIIIlll[8]]) ? 1 : 0) && lIlIlIIlIIIllI(ancient4.canCast() ? 1 : 0)) {
                Magic.cast(ancient4, bG);
                "".length();
                if ("   ".length() == " ".length()) {
                    return ((107 ^ 65) ^ (46 ^ 0)) & (((91 ^ 111) ^ (137 ^ 185)) ^ (-" ".length()));
                }
            } else {
                bG.interact(llIllIIIIlI[llIllIIIlll[9]]);
            }
        }
        return llIllIIIlll[1];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.ei.clear();
        this.ej = llIllIIIIlI[llIllIIIlll[1]];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        ConfigStorageBox<EquipmentSetup> l = l(this.ej);
        if (lIlIlIIlIIIlIl(l)) {
            ConfigStorageBox<EquipmentSetup> mageGearAkkha = this.cW.mageGearAkkha();
            "".length();
            if (" ".length() == 0) {
                return null;
            }
            return mageGearAkkha;
        }
        return l;
    }

    private static boolean lIlIlIIlIIlIII(int i) {
        return i == 0;
    }

    private static boolean lIlIlIIlIIIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIIlIIllII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlIIlIIlIll(int i, int i2) {
        return i == i2;
    }

    private static String lIlIlIIIlIIlll(String llllllllllllllllIIlIllllIIIIIllI, String llllllllllllllllIIlIllllIIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllllIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllIIIlll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllllIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllllIIIIIlll) {
            llllllllllllllllIIlIllllIIIIIlll.printStackTrace();
            return null;
        }
    }

    @Inject
    protected aQ(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
        this.ei = new HashSet();
        this.ej = llIllIIIIlI[llIllIIIlll[0]];
    }

    public ConfigStorageBox<EquipmentSetup> l(String str) {
        int i = llIllIIIlll[21];
        switch (str.hashCode()) {
            case -857618786:
                if (lIlIlIIlIIIllI(str.equals(llIllIIIIlI[llIllIIIlll[25]]) ? 1 : 0)) {
                    i = llIllIIIlll[2];
                    "".length();
                    if ((((121 ^ 71) ^ (104 ^ 92)) & (((153 ^ 137) ^ (146 ^ 136)) ^ (-" ".length()))) != 0) {
                        return null;
                    }
                }
                break;
            case 556951929:
                if (lIlIlIIlIIIllI(str.equals(llIllIIIIlI[llIllIIIlll[24]]) ? 1 : 0)) {
                    i = llIllIIIlll[4];
                    "".length();
                    if ((true ^ true) & ((true ^ true) ^ true)) {
                        return null;
                    }
                }
                break;
            case 618003550:
                if (lIlIlIIlIIIllI(str.equals(llIllIIIIlI[llIllIIIlll[23]]) ? 1 : 0)) {
                    i = llIllIIIlll[1];
                    "".length();
                    if ("   ".length() == 0) {
                        return null;
                    }
                }
                break;
            case 1829704903:
                if (lIlIlIIlIIIllI(str.equals(llIllIIIIlI[llIllIIIlll[26]]) ? 1 : 0)) {
                    i = llIllIIIlll[6];
                    "".length();
                    if ((99 ^ 103) < " ".length()) {
                        return null;
                    }
                }
                break;
            case 1882859331:
                if (lIlIlIIlIIIllI(str.equals(llIllIIIIlI[llIllIIIlll[27]]) ? 1 : 0)) {
                    i = llIllIIIlll[8];
                    break;
                }
                break;
            case 1911983736:
                if (lIlIlIIlIIIllI(str.equals(llIllIIIIlI[llIllIIIlll[22]]) ? 1 : 0)) {
                    i = llIllIIIlll[0];
                    "".length();
                    if ("  ".length() <= ((124 ^ 35) & ((103 ^ 56) ^ (-1)))) {
                        return null;
                    }
                }
                break;
        }
        switch (i) {
            case 0:
                return this.cW.mageGearBaboons();
            case 1:
            case 2:
                return this.cW.mageGearBaboons();
            case 3:
                return this.cW.meleeGearBaboons();
            case 4:
            case 5:
                return this.cW.rangeGearBaboons();
            default:
                return null;
        }
    }

    private static void lIlIlIIlIIIlII() {
        llIllIIIlll = new int[30];
        llIllIIIlll[0] = " ".length() & (" ".length() ^ (-" ".length()));
        llIllIIIlll[1] = " ".length();
        llIllIIIlll[2] = "   ".length();
        llIllIIIlll[3] = (247 ^ 140) ^ (227 ^ 129);
        llIllIIIlll[4] = "  ".length();
        llIllIIIlll[5] = 100 ^ 56;
        llIllIIIlll[6] = 12 ^ 8;
        llIllIIIlll[7] = (56 ^ 3) ^ (68 ^ 33);
        llIllIIIlll[8] = (((140 + 158) - 234) + 129) ^ (((127 + 107) - 106) + 68);
        llIllIIIlll[9] = (((27 + 47) - (-7)) + 63) ^ (((69 + 127) - 185) + 139);
        llIllIIIlll[10] = (175 ^ 128) ^ (104 ^ 64);
        llIllIIIlll[11] = (-((-3281) & 11995)) & (-1029) & 10111;
        llIllIIIlll[12] = (54 ^ 48) ^ (123 ^ 117);
        llIllIIIlll[13] = 51 ^ 58;
        llIllIIIlll[14] = (63 ^ 38) ^ (101 ^ 118);
        llIllIIIlll[15] = 61 ^ 54;
        llIllIIIlll[16] = "   ".length() ^ (73 ^ 70);
        llIllIIIlll[17] = (106 ^ 109) ^ (131 ^ 137);
        llIllIIIlll[18] = 147 ^ 157;
        llIllIIIlll[19] = 24 ^ 23;
        llIllIIIlll[20] = 38 ^ 54;
        llIllIIIlll[21] = -" ".length();
        llIllIIIlll[22] = (((7 + 96) - 5) + 71) ^ (((91 + 113) - 183) + 163);
        llIllIIIlll[23] = (((145 + 98) - 116) + 59) ^ (((116 + 21) - (-12)) + 19);
        llIllIIIlll[24] = (((30 + 113) - 127) + 165) ^ (((54 + 122) - 91) + 81);
        llIllIIIlll[25] = (((59 + 62) - 17) + 45) ^ (((110 + 90) - 127) + 56);
        llIllIIIlll[26] = (((32 + 103) - 124) + 141) ^ (((44 + 109) - 110) + 98);
        llIllIIIlll[27] = "  ".length() ^ (212 ^ 192);
        llIllIIIlll[28] = 8 ^ 31;
        llIllIIIlll[29] = 114 ^ 106;
    }

    static {
        lIlIlIIlIIIlII();
        lIlIlIIIlIlIlI();
    }

    private NPC bG() {
        String[] strArr = new String[llIllIIIlll[1]];
        strArr[llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[10]];
        NPC nearest = NPCs.getNearest(a(strArr).and(npc -> {
            if (lIlIlIIlIIlIII(this.ei.contains(npc) ? 1 : 0)) {
                ?? r0 = llIllIIIlll[1];
                "".length();
                return "  ".length() >= ((((151 + 118) - 207) + 92) ^ (((35 + 6) - (-115)) + 2)) ? ((163 ^ 190) ^ (178 ^ 155)) & (((((2 + 167) - 17) + 39) ^ (((47 + 119) - 33) + 6)) ^ (-" ".length())) : r0;
            }
            return llIllIIIlll[0];
        }));
        if (lIlIlIIlIIIlll(nearest)) {
            if (!lIlIlIIlIIlIll(nearest.getGraphic(), llIllIIIlll[11])) {
                return nearest;
            }
            this.ei.add(nearest);
            "".length();
            "".length();
            if ((-" ".length()) == " ".length()) {
                return null;
            }
        }
        String[] strArr2 = new String[llIllIIIlll[1]];
        strArr2[llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[12]];
        Predicate<NPC> a = a(strArr2);
        Set<NPC> set = this.ei;
        Objects.requireNonNull(set);
        "".length();
        NPC nearest2 = NPCs.getNearest(a.and((v1) -> {
            return r1.contains(v1);
        }).and((v0) -> {
            return v0.isMoving();
        }));
        if (lIlIlIIlIIIlll(nearest2)) {
            this.ei.remove(nearest2);
            "".length();
            return nearest2;
        }
        String[] strArr3 = new String[llIllIIIlll[1]];
        strArr3[llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[13]];
        NPC nearest3 = NPCs.getNearest(a(strArr3));
        if (lIlIlIIlIIIlll(nearest3)) {
            return nearest3;
        }
        String[] strArr4 = new String[llIllIIIlll[1]];
        strArr4[llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[14]];
        List all = NPCs.getAll(a(strArr4));
        if (lIlIlIIlIIllII(all.size(), llIllIIIlll[8])) {
            return (NPC) all.stream().max(Comparator.comparingInt(npc2 -> {
                String[] strArr5 = new String[llIllIIIlll[1]];
                strArr5[llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[29]];
                return NPCs.getAll(a(strArr5).and(npc2 -> {
                    if (lIlIlIIlIIlIlI(npc2.getWorldLocation().distanceTo(npc2.getWorldLocation()), llIllIIIlll[4])) {
                        ?? r0 = llIllIIIlll[1];
                        "".length();
                        return (-" ".length()) >= 0 ? ((((73 + 74) - 105) + 112) ^ (((119 + 64) - 177) + 136)) & (((((135 + 147) - 249) + 148) ^ (((149 + 121) - 203) + 94)) ^ (-" ".length())) : r0;
                    }
                    return llIllIIIlll[0];
                })).size();
            })).get();
        }
        String[] strArr5 = new String[llIllIIIlll[1]];
        strArr5[llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[15]];
        List all2 = NPCs.getAll(a(strArr5).and((v0) -> {
            return v0.isMoving();
        }));
        if (lIlIlIIlIIllII(all2.size(), llIllIIIlll[1])) {
            return (NPC) all2.get(llIllIIIlll[0]);
        }
        String[] strArr6 = new String[llIllIIIlll[4]];
        strArr6[llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[16]];
        strArr6[llIllIIIlll[1]] = llIllIIIIlI[llIllIIIlll[17]];
        NPC nearest4 = NPCs.getNearest(a(strArr6));
        if (lIlIlIIlIIIlll(nearest4)) {
            return nearest4;
        }
        if (lIlIlIIlIIllII(all.size(), llIllIIIlll[2])) {
            return (NPC) all.stream().max(Comparator.comparingInt(npc3 -> {
                String[] strArr7 = new String[llIllIIIlll[1]];
                strArr7[llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[28]];
                return NPCs.getAll(a(strArr7).and(npc3 -> {
                    if (lIlIlIIlIIlIlI(npc3.getWorldLocation().distanceTo(npc3.getWorldLocation()), llIllIIIlll[4])) {
                        ?? r0 = llIllIIIlll[1];
                        "".length();
                        return "   ".length() == 0 ? ((((15 + 153) - 85) + 72) ^ (((112 + 118) - 226) + 171)) & (((16 ^ 71) ^ (20 ^ 119)) ^ (-" ".length())) : r0;
                    }
                    return llIllIIIlll[0];
                })).size();
            })).get();
        }
        String[] strArr7 = new String[llIllIIIlll[4]];
        strArr7[llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[18]];
        strArr7[llIllIIIlll[1]] = llIllIIIIlI[llIllIIIlll[19]];
        NPC nearest5 = NPCs.getNearest(a(strArr7));
        if (lIlIlIIlIIIlll(nearest5)) {
            return nearest5;
        }
        String[] strArr8 = new String[llIllIIIlll[1]];
        strArr8[llIllIIIlll[0]] = llIllIIIIlI[llIllIIIlll[20]];
        return NPCs.getNearest(a(strArr8));
    }

    private static boolean lIlIlIIlIIIllI(int i) {
        return i != 0;
    }

    private static boolean lIlIlIIlIIIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIIlIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlIIIlIlIIl(String llllllllllllllllIIlIlllIlllIlIIl, String llllllllllllllllIIlIlllIlllIlIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlllIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIlllIlllIlIII.toCharArray();
        int llllllllllllllllIIlIlllIlllIIlIl = llIllIIIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIllIIIlll[0];
        while (lIlIlIIlIIlIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIlIlllIlllIIlIl % charArray.length]));
            "".length();
            llllllllllllllllIIlIlllIlllIIlIl++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlIIlIIlIIl(int i, int i2) {
        return i <= i2;
    }
}
