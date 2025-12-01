package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import com.google.common.collect.Iterables;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;
@TaskDesc(name = "Finding Herbiboar")
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/n.class */
public class n extends Task {
    private static /* synthetic */ int[] lllIIllIIllI;
    private static final /* synthetic */ Logger aj;
    private final /* synthetic */ d an;
    private final /* synthetic */ SquireHerbiboarPlugin ak;
    private final /* synthetic */ SquireHerbiboarConfig al;
    @Inject
    private /* synthetic */ i n;
    private static /* synthetic */ String[] lllIIlIlllII;
    private final /* synthetic */ b am;

    private static String lIIIlIlIIllllll(String lllllllllllllllIIllIlIIIlIlIIIll, String lllllllllllllllIIllIlIIIlIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIIlIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIIlIlIIlIl.init(lllIIllIIllI[5], secretKeySpec);
            return new String(lllllllllllllllIIllIlIIIlIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIlIlIIlII) {
            lllllllllllllllIIllIlIIIlIlIIlII.printStackTrace();
            return null;
        }
    }

    static {
        lIIIlIlIlIIIlIl();
        lIIIlIlIlIIIlII();
        aj = LoggerFactory.getLogger(n.class);
    }

    private static boolean lIIIlIlIlIIIlll(int i) {
        return i == 0;
    }

    private static void lIIIlIlIlIIIlII() {
        lllIIlIlllII = new String[lllIIllIIllI[16]];
        lllIIlIlllII[lllIIllIIllI[0]] = lIIIlIlIIlIlIIl("HTUmOQ==", "RECWC");
        lllIIlIlllII[lllIIllIIllI[1]] = lIIIlIlIIlIlIIl("LD40MioGJA==", "ePGBO");
        lllIIlIlllII[lllIIllIIllI[5]] = lIIIlIlIIlIlIIl("Bwg8LAlkED0zBDEDPQ==", "DdUAk");
        lllIIlIlllII[lllIIllIIllI[6]] = lIIIlIlIIllllll("qVypXgB/uRM=", "SBjDM");
        lllIIlIlllII[lllIIllIIllI[8]] = lIIIlIlIlIIIIIl("pUC1MxG7MRg=", "qjxHz");
        lllIIlIlllII[lllIIllIIllI[3]] = lIIIlIlIIllllll("DfqHTxFVsio=", "XLocy");
        lllIIlIlllII[lllIIllIIllI[9]] = lIIIlIlIIllllll("XRU0e4h26HM8HdIyKSmpAw==", "PUocE");
        lllIIlIlllII[lllIIllIIllI[2]] = lIIIlIlIlIIIIIl("8zZeqdEuZUI=", "myEXE");
        lllIIlIlllII[lllIIllIIllI[10]] = lIIIlIlIlIIIIIl("bWOohBR/AjKDNsloowhyGQ==", "nwVKF");
        lllIIlIlllII[lllIIllIIllI[11]] = lIIIlIlIIllllll("UNhgygeBUNs=", "DLxOQ");
        lllIIlIlllII[lllIIllIIllI[12]] = lIIIlIlIIllllll("BSGcUPfYb2M=", "BvrwM");
        lllIIlIlllII[lllIIllIIllI[13]] = lIIIlIlIIllllll("zsyE468YB6I=", "DdeUq");
        lllIIlIlllII[lllIIllIIllI[14]] = lIIIlIlIIlIlIIl("CzAaCA==", "xQycO");
        lllIIlIlllII[lllIIllIIllI[15]] = lIIIlIlIlIIIIIl("ntQ2qgyWJhs=", "VfECw");
    }

    @Inject
    public n(SquireHerbiboarPlugin squireHerbiboarPlugin, SquireHerbiboarConfig squireHerbiboarConfig, b bVar, d dVar) {
        this.ak = squireHerbiboarPlugin;
        this.al = squireHerbiboarConfig;
        this.am = bVar;
        this.an = dVar;
    }

    private void a(TileObject tileObject, String str) {
        if (lIIIlIlIlIIlIII(tileObject)) {
            tileObject.interact(str);
        }
    }

    private static boolean lIIIlIlIlIIlIII(Object obj) {
        return obj != null;
    }

    private static String lIIIlIlIlIIIIIl(String lllllllllllllllIIllIlIIIlIllIIII, String lllllllllllllllIIllIlIIIlIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIlIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlIlIllll.getBytes(StandardCharsets.UTF_8)), lllIIllIIllI[10]), "DES");
            Cipher lllllllllllllllIIllIlIIIlIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIIlIllIIlI.init(lllIIllIIllI[5], lllllllllllllllIIllIlIIIlIllIIll);
            return new String(lllllllllllllllIIllIlIIIlIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIlIllIIIl) {
            lllllllllllllllIIllIlIIIlIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIlIIllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIlIlIlIIIllI(int i) {
        return i != 0;
    }

    private static void lIIIlIlIlIIIlIl() {
        lllIIllIIllI = new int[17];
        lllIIllIIllI[0] = (25 ^ 123) & ((201 ^ 171) ^ (-1));
        lllIIllIIllI[1] = " ".length();
        lllIIllIIllI[2] = (81 ^ 53) ^ (63 ^ 92);
        lllIIllIIllI[3] = (83 ^ 98) ^ (189 ^ 137);
        lllIIllIIllI[4] = (((117 + 126) - 42) + 10) ^ (((13 + 45) - (-73)) + 18);
        lllIIllIIllI[5] = "  ".length();
        lllIIllIIllI[6] = "   ".length();
        lllIIllIIllI[7] = (-10338) & 16103;
        lllIIllIIllI[8] = 45 ^ 41;
        lllIIllIIllI[9] = (((88 + 141) - 186) + 105) ^ (((33 + 122) - 49) + 40);
        lllIIllIIllI[10] = 160 ^ 168;
        lllIIllIIllI[11] = 79 ^ 70;
        lllIIllIIllI[12] = 49 ^ 59;
        lllIIllIIllI[13] = 171 ^ 160;
        lllIIllIIllI[14] = (((36 + 23) - 0) + 75) ^ (((16 + 39) - 47) + 130);
        lllIIllIIllI[15] = 147 ^ 158;
        lllIIllIIllI[16] = (((101 + 122) - 113) + 60) ^ (((90 + 18) - (-50)) + 6);
    }

    private static boolean lIIIlIlIlIIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIlIlIlIIlIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0207  */
    /* JADX WARN: Type inference failed for: r0v124, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v161, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        TileObject nearest;
        if (!lIIIlIlIlIIIllI(this.ak.f() ? 1 : 0) && !lIIIlIlIlIIIllI(Bank.isOpen() ? 1 : 0)) {
            if (lIIIlIlIlIIIllI(this.al.useHerbSack() ? 1 : 0) && lIIIlIlIlIIIllI(Inventory.contains(item -> {
                if (lIIIlIlIlIIIllI(item.getName().toLowerCase().contains(lllIIlIlllII[lllIIllIIllI[14]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIllIIllI[1]];
                    strArr[lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[15]];
                    if (lIIIlIlIlIIIllI(item.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIllIIllI[1];
                        "".length();
                        return (-(128 ^ 132)) > 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                    }
                }
                return lllIIllIIllI[0];
            }) ? 1 : 0)) {
                Inventory.getFirst(item2 -> {
                    return item2.getName().toLowerCase().contains(lllIIlIlllII[lllIIllIIllI[13]]);
                }).interact(lllIIlIlllII[lllIIllIIllI[0]]);
                return lllIIllIIllI[1];
            } else if (lIIIlIlIlIIIlll(Movement.shouldWalk() ? 1 : 0)) {
                return lllIIllIIllI[0];
            } else {
                c i = this.am.i();
                List<f> z = this.n.z();
                switch (o.ao[i.ordinal()]) {
                    case 1:
                        TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                            if (lIIIlIlIlIIIllI(b.l.contains(Integer.valueOf(tileObject.getId())) ? 1 : 0)) {
                                String[] strArr = new String[lllIIllIIllI[1]];
                                strArr[lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[12]];
                                if (lIIIlIlIlIIIllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                                    ?? r0 = lllIIllIIllI[1];
                                    "".length();
                                    return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                            return lllIIllIIllI[0];
                        });
                        if (lIIIlIlIlIIlIII(nearest2)) {
                            WorldPoint worldLocation = nearest2.getWorldLocation();
                            if (lIIIlIlIlIIlIIl(worldLocation.distanceTo(Players.getLocal()), lllIIllIIllI[2])) {
                                a(nearest2, lllIIlIlllII[lllIIllIIllI[1]]);
                                "".length();
                                if ((((((106 + 15) - 63) + 81) ^ (((182 + 110) - 179) + 80)) & (((((87 + 75) - 141) + 191) ^ (((67 + 136) - 138) + 93)) ^ (-" ".length()))) != 0) {
                                    return ((((178 + 145) - 195) + 120) ^ (((10 + 115) - 70) + 123)) & (((94 ^ 110) ^ (81 ^ 43)) ^ (-" ".length()));
                                }
                            } else {
                                Movement.walkTo(worldLocation);
                                "".length();
                            }
                        }
                        WorldPoint l = ((f) Iterables.getLast(z)).l();
                        TileObject tileObject2 = this.n.w().get(l);
                        if (lIIIlIlIlIIlIlI(this.n.F(), g.J) && lIIIlIlIlIIlIll(tileObject2.distanceTo(Players.getLocal()), lllIIllIIllI[3])) {
                            nearest = TileObjects.getNearest(tileObject3 -> {
                                String[] strArr = new String[lllIIllIIllI[1]];
                                strArr[lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[10]];
                                if (lIIIlIlIlIIIllI(tileObject3.hasAction(strArr) ? 1 : 0) && lIIIlIlIlIIIllI(tileObject3.getName().equals(lllIIlIlllII[lllIIllIIllI[11]]) ? 1 : 0)) {
                                    ?? r0 = lllIIllIIllI[1];
                                    "".length();
                                    return (-" ".length()) > (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lllIIllIIllI[0];
                            });
                            if (lIIIlIlIlIIlIII(nearest) && lIIIlIlIlIIllII(Skills.getBoostedLevel(Skill.AGILITY), lllIIllIIllI[4]) && lIIIlIlIlIIlIIl(nearest.distanceTo(tileObject2), tileObject2.distanceTo(Players.getLocal()))) {
                                nearest.interact(lllIIlIlllII[lllIIllIIllI[5]]);
                                return lllIIllIIllI[1];
                            }
                        }
                        Movement.setDestination(l);
                        "".length();
                        if (" ".length() <= 0) {
                            return ((71 ^ 55) ^ (97 ^ 11)) & (((161 ^ 177) ^ (163 ^ 169)) ^ (-" ".length()));
                        }
                        return lllIIllIIllI[1];
                    case 2:
                        WorldPoint l2 = ((f) Iterables.getLast(z)).l();
                        TileObject tileObject22 = this.n.w().get(l2);
                        if (lIIIlIlIlIIlIlI(this.n.F(), g.J)) {
                            nearest = TileObjects.getNearest(tileObject32 -> {
                                String[] strArr = new String[lllIIllIIllI[1]];
                                strArr[lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[10]];
                                if (lIIIlIlIlIIIllI(tileObject32.hasAction(strArr) ? 1 : 0) && lIIIlIlIlIIIllI(tileObject32.getName().equals(lllIIlIlllII[lllIIllIIllI[11]]) ? 1 : 0)) {
                                    ?? r0 = lllIIllIIllI[1];
                                    "".length();
                                    return (-" ".length()) > (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lllIIllIIllI[0];
                            });
                            if (lIIIlIlIlIIlIII(nearest)) {
                                nearest.interact(lllIIlIlllII[lllIIllIIllI[5]]);
                                return lllIIllIIllI[1];
                            }
                            break;
                        }
                        Movement.setDestination(l2);
                        "".length();
                        if (" ".length() <= 0) {
                        }
                        return lllIIllIIllI[1];
                    case 3:
                        TileObject nearest3 = TileObjects.getNearest(((f) Iterables.getLast(z)).l(), tileObject4 -> {
                            String[] strArr = new String[lllIIllIIllI[1]];
                            strArr[lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[2]];
                            return tileObject4.hasAction(strArr);
                        });
                        System.out.println(nearest3.getWorldLocation());
                        nearest3.interact(lllIIlIlllII[lllIIllIIllI[6]]);
                        "".length();
                        if (0 != 0) {
                            return ((73 ^ 114) ^ (36 ^ 20)) & (((154 ^ 138) ^ (129 ^ 154)) ^ (-" ".length()));
                        }
                        return lllIIllIIllI[1];
                    case 4:
                        WorldPoint worldPoint = b.m.get(Vars.getBit(lllIIllIIllI[7]) - lllIIllIIllI[1]);
                        TileObject a = this.am.a(worldPoint);
                        if (lIIIlIlIlIIlIIl(worldPoint.distanceTo(Players.getLocal()), lllIIllIIllI[2])) {
                            a(a, lllIIlIlllII[lllIIllIIllI[8]]);
                            "".length();
                            if ((((((54 + 199) - 22) + 3) ^ (((168 + 54) - 172) + 146)) & (((185 ^ 181) ^ (76 ^ 110)) ^ (-" ".length()))) < (-" ".length())) {
                                return ((((117 + 154) - 142) + 103) ^ (((5 + 68) - 51) + 158)) & (((64 ^ 7) ^ (179 ^ 168)) ^ (-" ".length()));
                            }
                        } else {
                            Movement.setDestination(worldPoint);
                            "".length();
                            if ((((((20 + 152) - 101) + 135) ^ (((73 + 7) - 11) + 62)) & (((213 ^ 130) ^ (191 ^ 165)) ^ (-" ".length()))) >= " ".length()) {
                                return ((((186 + 137) - 174) + 43) ^ (((195 + 126) - 265) + 140)) & (((31 ^ 47) ^ (16 ^ 36)) ^ (-" ".length()));
                            }
                        }
                        return lllIIllIIllI[1];
                    case 5:
                        NPC nearest4 = NPCs.getNearest(npc -> {
                            return npc.getName().equals(lllIIlIlllII[lllIIllIIllI[9]]);
                        });
                        if (lIIIlIlIlIIlIII(nearest4)) {
                            nearest4.interact(lllIIlIlllII[lllIIllIIllI[3]]);
                            "".length();
                            if (0 != 0) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        }
                        return lllIIllIIllI[1];
                    default:
                        return lllIIllIIllI[1];
                }
            }
        }
        return lllIIllIIllI[0];
    }

    private static boolean lIIIlIlIlIIlIll(int i, int i2) {
        return i > i2;
    }

    private static String lIIIlIlIIlIlIIl(String lllllllllllllllIIllIlIIIlIIlIIll, String lllllllllllllllIIllIlIIIlIIlIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIIlIIlIIIl = new StringBuilder();
        char[] lllllllllllllllIIllIlIIIlIIlIIII = lllllllllllllllIIllIlIIIlIIlIIlI.toCharArray();
        int lllllllllllllllIIllIlIIIlIIIllll = lllIIllIIllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIllIIllI[0];
        while (lIIIlIlIlIIlIIl(i, length)) {
            char lllllllllllllllIIllIlIIIlIIlIlII = charArray[i];
            lllllllllllllllIIllIlIIIlIIlIIIl.append((char) (lllllllllllllllIIllIlIIIlIIlIlII ^ lllllllllllllllIIllIlIIIlIIlIIII[lllllllllllllllIIllIlIIIlIIIllll % lllllllllllllllIIllIlIIIlIIlIIII.length]));
            "".length();
            lllllllllllllllIIllIlIIIlIIIllll++;
            i++;
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlIIIlIIlIIIl);
    }
}
