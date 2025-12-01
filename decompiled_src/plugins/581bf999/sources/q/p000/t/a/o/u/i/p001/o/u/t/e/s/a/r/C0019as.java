package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
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
import net.runelite.api.NPC;
import net.runelite.api.coords.Angle;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Attacking Akkha")
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.as  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/as.class */
public class C0019as extends AbstractC0016ap {
    private static /* synthetic */ String[] lIllIIllllI;
    private static /* synthetic */ int[] lIllIIlllll;
    private final /* synthetic */ C0064m dh;
    private /* synthetic */ int di;

    private List<WorldPoint> bz() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[lIllIIlllll[2]];
        iArr[lIllIIlllll[0]] = lIllIIlllll[6];
        for (NPC npc : NPCs.getAll(iArr)) {
            int i = lIllIIlllll[0];
            while (lIIlIllIlIlIII(i, lIllIIlllll[7])) {
                WorldPoint worldLocation = npc.getWorldLocation();
                if (lIIlIllIlIIlII(worldLocation)) {
                    "".length();
                    if ("  ".length() > "   ".length()) {
                        return null;
                    }
                } else {
                    int angle = (new Angle(npc.getOrientation()).getAngle() + lIllIIlllll[2]) / lIllIIlllll[8];
                    if (lIIlIllIlIIlIl(angle)) {
                        arrayList.add(worldLocation.dy(-i));
                        "".length();
                        "".length();
                        if ((((((56 + 214) - 238) + 191) ^ (((144 + 53) - 119) + 79)) & (((188 ^ 157) ^ (200 ^ 171)) ^ (-" ".length()))) < 0) {
                            return null;
                        }
                    } else if (lIIlIllIlIIlll(angle, lIllIIlllll[2])) {
                        arrayList.add(worldLocation.dy(i).dx(-i));
                        "".length();
                        "".length();
                        if ((((122 ^ 53) ^ (234 ^ 150)) & (((0 ^ 94) ^ (242 ^ 159)) ^ (-" ".length()))) != 0) {
                            return null;
                        }
                    } else if (lIIlIllIlIIlll(angle, lIllIIlllll[3])) {
                        arrayList.add(worldLocation.dx(-i));
                        "".length();
                        "".length();
                        if ((33 ^ 37) > (113 ^ 117)) {
                            return null;
                        }
                    } else if (lIIlIllIlIIlll(angle, lIllIIlllll[9])) {
                        arrayList.add(worldLocation.dx(-i).dy(i));
                        "".length();
                        "".length();
                        if (0 != 0) {
                            return null;
                        }
                    } else if (lIIlIllIlIIlll(angle, lIllIIlllll[7])) {
                        arrayList.add(worldLocation.dy(i));
                        "".length();
                        "".length();
                        if (("   ".length() & ("   ".length() ^ (-1))) >= " ".length()) {
                            return null;
                        }
                    } else if (lIIlIllIlIIlll(angle, lIllIIlllll[10])) {
                        arrayList.add(worldLocation.dy(i).dx(i));
                        "".length();
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return null;
                        }
                    } else if (lIIlIllIlIIlll(angle, lIllIIlllll[11])) {
                        arrayList.add(worldLocation.dx(i));
                        "".length();
                        "".length();
                        if ("   ".length() == "  ".length()) {
                            return null;
                        }
                    } else {
                        arrayList.add(worldLocation.dx(i).dy(-i));
                        "".length();
                    }
                }
                i++;
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        return arrayList;
    }

    private static boolean lIIlIllIlIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIllIlIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIllIlIIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIllIlIIIll(int i) {
        return i != 0;
    }

    static {
        lIIlIllIlIIIlI();
        lIIlIllIlIIIII();
    }

    private static void lIIlIllIlIIIII() {
        lIllIIllllI = new String[lIllIIlllll[2]];
        lIllIIllllI[lIllIIlllll[0]] = lIIlIllIIlllll("1iakt/oR7eY=", "SOvQS");
    }

    private static String lIIlIllIIlllll(String llllllllllllllllIlIlIIlIllIIIlII, String llllllllllllllllIlIlIIlIllIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIlIllIIIIll.getBytes(StandardCharsets.UTF_8)), lIllIIlllll[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIlllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIlIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIlIllIIIlIl) {
            llllllllllllllllIlIlIIlIllIIIlIl.printStackTrace();
            return null;
        }
    }

    @Inject
    protected C0019as(Client client, C0077z c0077z, TOAConfig tOAConfig, C0064m c0064m) {
        super(client, c0077z, tOAConfig);
        this.dh = c0064m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v31, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v90, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        boolean z;
        int i;
        if (lIIlIllIlIIIll(bu() ? 1 : 0)) {
            return lIllIIlllll[0];
        }
        NPC J = J();
        if (!lIIlIllIlIIlII(J) && !lIIlIllIlIIlIl(g(J) ? 1 : 0)) {
            if (lIIlIllIlIIIll(this.dh.K() ? 1 : 0) && lIIlIllIlIIllI(super.br(), this.cW.meleeGearAkkha()) && lIIlIllIlIIlIl(J.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIllIlIIlIl(bw() ? 1 : 0)) {
                return lIllIIlllll[0];
            }
            if (lIIlIllIlIIlll(J.getId(), lIllIIlllll[1])) {
                ?? r0 = lIllIIlllll[2];
                "".length();
                z = r0;
                if (((41 ^ 27) & ((11 ^ 57) ^ (-1))) >= "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                z = lIllIIlllll[0];
            }
            boolean llllllllllllllllIlIlIIlIlllIlIll = z;
            if (lIIlIllIlIIIll(llllllllllllllllIlIlIIlIlllIlIll ? 1 : 0)) {
                WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                List<WorldPoint> bz = bz();
                if (lIIlIllIlIIIll(bz.contains(worldLocation) ? 1 : 0)) {
                    WorldPoint worldPoint = (WorldPoint) worldLocation.createWorldArea(lIllIIlllll[3]).toWorldPointList().stream().filter(worldPoint2 -> {
                        if (lIIlIllIlIIlIl(bz.contains(worldPoint2) ? 1 : 0)) {
                            ?? r02 = lIllIIlllll[2];
                            "".length();
                            return ((231 ^ 196) & ((122 ^ 89) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                        return lIllIIlllll[0];
                    }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint3 -> {
                        return worldPoint3.distanceTo(J);
                    })).orElse(null);
                    if (lIIlIllIlIIlII(worldPoint)) {
                        return lIllIIlllll[0];
                    }
                    Movement.setDestination(worldPoint);
                    return lIllIIlllll[2];
                } else if (lIIlIllIlIIlIl(J.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint4 = (WorldPoint) worldLocation.createWorldArea(lIllIIlllll[3]).toWorldPointList().stream().filter(worldPoint5 -> {
                        if (lIIlIllIlIIlIl(worldPoint5.equals(worldLocation) ? 1 : 0)) {
                            ?? r02 = lIllIIlllll[2];
                            "".length();
                            return (((((168 + 114) - 109) + 14) ^ (((104 + 100) - 90) + 18)) & (((147 ^ 198) ^ (83 ^ 57)) ^ (-" ".length()))) != 0 ? ((15 ^ 28) ^ (133 ^ 167)) & (((7 ^ 67) ^ (222 ^ 171)) ^ (-" ".length())) : r02;
                        }
                        return lIllIIlllll[0];
                    }).filter(Reachable::isWalkable).filter(worldPoint6 -> {
                        if (lIIlIllIlIIlIl(bz.contains(worldPoint6) ? 1 : 0)) {
                            ?? r02 = lIllIIlllll[2];
                            "".length();
                            return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                        return lIllIIlllll[0];
                    }).min(Comparator.comparingInt(worldPoint7 -> {
                        return worldPoint7.distanceTo(J);
                    })).orElse(null);
                    if (lIIlIllIlIIlII(worldPoint4)) {
                        return lIllIIlllll[0];
                    }
                    Movement.setDestination(worldPoint4);
                    return lIllIIlllll[2];
                }
            }
            SquireAutoTOA squireAutoTOA = this.aY;
            if (lIIlIllIlIIIll(llllllllllllllllIlIlIIlIlllIlIll ? 1 : 0)) {
                i = lIllIIlllll[4];
                "".length();
                if (" ".length() < 0) {
                    return ((247 ^ 184) ^ "  ".length()) & (((49 ^ 74) ^ (65 ^ 119)) ^ (-" ".length()));
                }
            } else {
                i = lIllIIlllll[5];
            }
            squireAutoTOA.a(i);
            e(llllllllllllllllIlIlIIlIlllIlIll);
            "".length();
            J.interact(lIllIIllllI[lIllIIlllll[0]]);
            if (lIIlIllIlIIIll(J.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                this.di = this.cu.getTickCount();
            }
            return lIllIIlllll[2];
        }
        return lIllIIlllll[0];
    }

    private static boolean lIIlIllIlIIlII(Object obj) {
        return obj == null;
    }

    private static void lIIlIllIlIIIlI() {
        lIllIIlllll = new int[13];
        lIllIIlllll[0] = ((((94 + 14) - (-49)) + 23) ^ (((82 + 31) - (-2)) + 44)) & (((((42 + 15) - 17) + 101) ^ (((117 + 107) - 213) + 155)) ^ (-" ".length()));
        lIllIIlllll[1] = (-20617) & 32411;
        lIllIIlllll[2] = " ".length();
        lIllIIlllll[3] = "  ".length();
        lIllIIlllll[4] = (8 ^ 117) ^ (63 ^ 88);
        lIllIIlllll[5] = 4 ^ 41;
        lIllIIlllll[6] = (-16769) & 28572;
        lIllIIlllll[7] = (((45 + 80) - 30) + 60) ^ (((19 + 131) - (-5)) + 4);
        lIllIIlllll[8] = (-((-4421) & 14335)) & (-6150) & 16319;
        lIllIIlllll[9] = "   ".length();
        lIllIIlllll[10] = (((176 + 103) - 135) + 36) ^ (((124 + 59) - 133) + 127);
        lIllIIlllll[11] = 72 ^ 78;
        lIllIIlllll[12] = (166 ^ 149) ^ (19 ^ 40);
    }

    private static boolean lIIlIllIlIIlIl(int i) {
        return i == 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> bs() {
        if (lIIlIllIlIIIll(bw() ? 1 : 0)) {
            ConfigStorageBox<EquipmentSetup> akkhaFinalSpec = this.cW.akkhaFinalSpec();
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
            return akkhaFinalSpec;
        }
        return null;
    }
}
