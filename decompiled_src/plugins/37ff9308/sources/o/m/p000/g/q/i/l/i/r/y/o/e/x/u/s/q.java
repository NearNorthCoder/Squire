package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Turning in potion task")
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.q  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/q.class */
public class q extends Task {
    private final /* synthetic */ SquireMixologyConfig Z;
    private static /* synthetic */ String[] lllllllIlIIl;
    private static /* synthetic */ int[] lllllllIllII;

    static {
        lIIlIlIlIlIIlll();
        lIIlIlIlIlIIIII();
    }

    @Inject
    public q(SquireMixologyConfig squireMixologyConfig) {
        this.Z = squireMixologyConfig;
    }

    private static boolean lIIlIlIlIlIlIll(Object obj) {
        return obj != null;
    }

    private static String lIIlIlIlIIllIll(String lllllllllllllllIIlIIIlIIIllIlIIl, String lllllllllllllllIIlIIIlIIIllIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlIIIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIIIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllllIllII[4], lllllllllllllllIIlIIIlIIIllIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIIIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIIIllIlIlI) {
            lllllllllllllllIIlIIIlIIIllIlIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIlIIlllII(String lllllllllllllllIIlIIIlIIIlllIllI, String lllllllllllllllIIlIIIlIIIlllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIIIlllIlIl.getBytes(StandardCharsets.UTF_8)), lllllllIllII[12]), "DES");
            Cipher lllllllllllllllIIlIIIlIIIllllIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIlIIIllllIII.init(lllllllIllII[4], secretKeySpec);
            return new String(lllllllllllllllIIlIIIlIIIllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIIIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIIIlllIlll) {
            lllllllllllllllIIlIIIlIIIlllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIlIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIlIlIllIIII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIlIlIlIlIllll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIlIlIlIlIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIlIlIlIllIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIIlIlIlIIlllIl(String lllllllllllllllIIlIIIlIIIlIllIIl, String lllllllllllllllIIlIIIlIIIlIllIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIIIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIlIIIlIlIlll = new StringBuilder();
        char[] lllllllllllllllIIlIIIlIIIlIlIllI = lllllllllllllllIIlIIIlIIIlIllIII.toCharArray();
        int lllllllllllllllIIlIIIlIIIlIlIlIl = lllllllIllII[0];
        char[] charArray = str.toCharArray();
        int lllllllllllllllIIlIIIlIIIlIIlllI = charArray.length;
        int i = lllllllIllII[0];
        while (lIIlIlIlIllIIIl(i, lllllllllllllllIIlIIIlIIIlIIlllI)) {
            lllllllllllllllIIlIIIlIIIlIlIlll.append((char) (charArray[i] ^ lllllllllllllllIIlIIIlIIIlIlIllI[lllllllllllllllIIlIIIlIIIlIlIlIl % lllllllllllllllIIlIIIlIIIlIlIllI.length]));
            "".length();
            lllllllllllllllIIlIIIlIIIlIlIlIl++;
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIIlIIIlIlIlll);
    }

    private static boolean lIIlIlIlIlIlIII(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIlIlIlIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIlIlIllIIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x031e, code lost:
        if (lIIlIlIlIlIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v138, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v140, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v158, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v160, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v183, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v187, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v189, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v191, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        if (!lIIlIlIlIlIlIII(s.e() ? 1 : 0) && !lIIlIlIlIlIlIIl(this.Z.pluginMode(), d.MINIGAME)) {
            if (lIIlIlIlIlIlIlI(Movement.getRunEnergy(), lllllllIllII[1]) && lIIlIlIlIlIlIII(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
                return lllllllIllII[0];
            }
            int[] iArr = new int[lllllllIllII[2]];
            iArr[lllllllIllII[0]] = lllllllIllII[3];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIIlIlIlIlIlIll(nearest) && lIIlIlIlIlIllII(s.h() ? 1 : 0) && lIIlIlIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(nearest.getWorldLocation()), lllllllIllII[2])) {
                nearest.interact(lllllllIllII[0]);
                return lllllllIllII[0];
            }
            if (lIIlIlIlIlIlIll(nearest) && lIIlIlIlIlIlIII(s.f() ? 1 : 0) && lIIlIlIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(nearest.getWorldLocation()), lllllllIllII[2])) {
                SquireMixology.m = lllllllIlIIl[lllllllIllII[0]];
                SquireMixology.f0o = lllllllIlIIl[lllllllIllII[2]];
                SquireMixology.n = lllllllIlIIl[lllllllIllII[4]];
                SquireMixology.p = lllllllIlIIl[lllllllIllII[5]];
                SquireMixology.r = lllllllIllII[6];
                SquireMixology.A = lllllllIllII[0];
                SquireMixology.k = lllllllIllII[0];
                SquireMixology.u = lllllllIllII[2];
                SquireMixology.v = lllllllIllII[2];
                SquireMixology.w = lllllllIllII[2];
                SquireMixology.s = lllllllIllII[6];
                SquireMixology.t = lllllllIllII[6];
                SquireMixology.x = lllllllIllII[6];
                Integer[] numArr = new Integer[lllllllIllII[5]];
                numArr[lllllllIllII[0]] = Integer.valueOf(lllllllIllII[6]);
                numArr[lllllllIllII[2]] = Integer.valueOf(lllllllIllII[6]);
                numArr[lllllllIllII[4]] = Integer.valueOf(lllllllIllII[6]);
                SquireMixology.z = new ArrayList(Arrays.asList(numArr));
                String[] strArr = new String[lllllllIllII[5]];
                strArr[lllllllIllII[0]] = null;
                strArr[lllllllIllII[2]] = null;
                strArr[lllllllIllII[4]] = null;
                SquireMixology.y = new ArrayList(Arrays.asList(strArr));
            }
            if (lIIlIlIlIlIlIII(s.h() ? 1 : 0)) {
                return lllllllIllII[0];
            }
            String[] strArr2 = new String[lllllllIllII[2]];
            strArr2[lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[7]];
            TileObject nearest2 = TileObjects.getNearest(strArr2);
            if (lIIlIlIlIlIlIll(nearest2)) {
                SquireMixology.g = lllllllIlIIl[lllllllIllII[8]];
                nearest2.interact(lllllllIlIIl[lllllllIllII[9]]);
                return lllllllIllII[0];
            }
            if (lIIlIlIlIlIlllI(this.Z.potionStrategy(), f.MULTI_ORDER)) {
                int e = s.e(SquireMixology.m);
                int e2 = s.e(SquireMixology.n);
                int e3 = s.e(SquireMixology.f0o);
                int[] iArr2 = new int[lllllllIllII[2]];
                iArr2[lllllllIllII[0]] = e;
                if (lIIlIlIlIlIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllllllIllII[2]];
                    iArr3[lllllllIllII[0]] = e;
                    if (lIIlIlIlIlIllll(Inventory.getCount(iArr3), SquireMixology.u)) {
                        int[] iArr4 = new int[lllllllIllII[2]];
                        iArr4[lllllllIllII[0]] = e2;
                        if (lIIlIlIlIlIllII(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lllllllIllII[2]];
                            iArr5[lllllllIllII[0]] = e2;
                            if (lIIlIlIlIlIllll(Inventory.getCount(iArr5), SquireMixology.v)) {
                                int[] iArr6 = new int[lllllllIllII[2]];
                                iArr6[lllllllIllII[0]] = e3;
                                if (lIIlIlIlIlIllII(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lllllllIllII[2]];
                                    iArr7[lllllllIllII[0]] = e3;
                                    if (!lIIlIlIlIllIIII(Inventory.getCount(iArr7), SquireMixology.w)) {
                                        int[] iArr8 = new int[lllllllIllII[2]];
                                        iArr8[lllllllIllII[0]] = e;
                                        if (lIIlIlIlIlIllII(Inventory.contains(iArr8) ? 1 : 0)) {
                                            int[] iArr9 = new int[lllllllIllII[2]];
                                            iArr9[lllllllIllII[0]] = e2;
                                            if (lIIlIlIlIlIllII(Inventory.contains(iArr9) ? 1 : 0)) {
                                                int[] iArr10 = new int[lllllllIllII[2]];
                                                iArr10[lllllllIllII[0]] = e3;
                                            }
                                        }
                                        return lllllllIllII[0];
                                    }
                                }
                            }
                        }
                    }
                }
                return lllllllIllII[0];
            }
            String[] strArr3 = new String[lllllllIllII[2]];
            strArr3[lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[10]];
            if (lIIlIlIlIlIllII(Inventory.contains(strArr3) ? 1 : 0)) {
                if (lIIlIlIlIllIIIl(Skills.getLevel(Skill.HERBLORE), lllllllIllII[11])) {
                    String[] strArr4 = new String[lllllllIllII[2]];
                    strArr4[lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[12]];
                    Item first = Inventory.getFirst(strArr4);
                    int[] iArr11 = new int[lllllllIllII[2]];
                    iArr11[lllllllIllII[0]] = s.e(SquireMixology.m);
                    first.useOn(Inventory.getFirst(iArr11));
                }
                if (lIIlIlIlIlIlIlI(Skills.getLevel(Skill.HERBLORE), lllllllIllII[11])) {
                    String[] strArr5 = new String[lllllllIllII[2]];
                    strArr5[lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[13]];
                    if (lIIlIlIlIlIllII(Inventory.contains(strArr5) ? 1 : 0)) {
                        String[] strArr6 = new String[lllllllIllII[2]];
                        strArr6[lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[14]];
                        Item first2 = Inventory.getFirst(strArr6);
                        int[] iArr12 = new int[lllllllIllII[2]];
                        iArr12[lllllllIllII[0]] = s.e(lllllllIlIIl[lllllllIllII[15]]);
                        first2.useOn(Inventory.getFirst(iArr12));
                    }
                }
            }
            String[] strArr7 = new String[lllllllIllII[2]];
            strArr7[lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[16]];
            if (lIIlIlIlIlIllII(Inventory.contains(strArr7) ? 1 : 0)) {
                String[] strArr8 = new String[lllllllIllII[2]];
                strArr8[lllllllIllII[0]] = lllllllIlIIl[lllllllIllII[17]];
                Inventory.getFirst(strArr8).interact(lllllllIlIIl[lllllllIllII[18]]);
            }
            if (lIIlIlIlIlIllII(this.Z.useStamina() ? 1 : 0) && lIIlIlIlIllIIIl(Movement.getRunEnergy(), lllllllIllII[19]) && lIIlIlIlIlIllII(Inventory.contains(item -> {
                return item.getName().contains(lllllllIlIIl[lllllllIllII[23]]);
            }) ? 1 : 0) && lIIlIlIlIlIlIII(Movement.isStaminaBoosted() ? 1 : 0)) {
                Inventory.getFirst(item2 -> {
                    return item2.getName().contains(lllllllIlIIl[lllllllIllII[22]]);
                }).interact(lllllllIlIIl[lllllllIllII[20]]);
            }
            SquireMixology.g = lllllllIlIIl[lllllllIllII[21]];
            nearest.interact(lllllllIllII[0]);
            return lllllllIllII[0];
        }
        return lllllllIllII[0];
    }

    private static void lIIlIlIlIlIIlll() {
        lllllllIllII = new int[25];
        lllllllIllII[0] = ((223 ^ 157) ^ (38 ^ 113)) & (((27 ^ 102) ^ (242 ^ 154)) ^ (-" ".length()));
        lllllllIllII[1] = 143 ^ 155;
        lllllllIllII[2] = " ".length();
        lllllllIllII[3] = (-((-10887) & 11215)) & (-8211) & 63455;
        lllllllIllII[4] = "  ".length();
        lllllllIllII[5] = "   ".length();
        lllllllIllII[6] = -" ".length();
        lllllllIllII[7] = 170 ^ 174;
        lllllllIllII[8] = (((44 + 142) - 76) + 40) ^ (((68 + 65) - 120) + 134);
        lllllllIllII[9] = 9 ^ 15;
        lllllllIllII[10] = (228 ^ 147) ^ (249 ^ 137);
        lllllllIllII[11] = 224 ^ 177;
        lllllllIllII[12] = 201 ^ 193;
        lllllllIllII[13] = 184 ^ 177;
        lllllllIllII[14] = (16 ^ 76) ^ (223 ^ 137);
        lllllllIllII[15] = (((146 + 143) - 116) + 14) ^ (((93 + 50) - 108) + 141);
        lllllllIllII[16] = 24 ^ 20;
        lllllllIllII[17] = 93 ^ 80;
        lllllllIllII[18] = (200 ^ 151) ^ (229 ^ 180);
        lllllllIllII[19] = 47 ^ 110;
        lllllllIllII[20] = (39 ^ 117) ^ (247 ^ 170);
        lllllllIllII[21] = (((23 + 3) - 1) + 159) ^ (((96 + 33) - 49) + 88);
        lllllllIllII[22] = (170 ^ 167) ^ (101 ^ 121);
        lllllllIllII[23] = 23 ^ 5;
        lllllllIllII[24] = 11 ^ 24;
    }

    private static void lIIlIlIlIlIIIII() {
        lllllllIlIIl = new String[lllllllIllII[24]];
        lllllllIlIIl[lllllllIllII[0]] = lIIlIlIlIIllIll("ekpr5k9LL+k=", "YCeey");
        lllllllIlIIl[lllllllIllII[2]] = lIIlIlIlIIlllII("lMHTAnoAOUA=", "ujcGb");
        lllllllIlIIl[lllllllIllII[4]] = lIIlIlIlIIlllII("glP5svoEXeA=", "SvvAP");
        lllllllIlIIl[lllllllIllII[5]] = lIIlIlIlIIlllII("RAMS7DLIhnw=", "UqnpV");
        lllllllIlIIl[lllllllIllII[7]] = lIIlIlIlIIllIll("IcO+NcE4WaFSXsBt9t5V6g==", "vknOo");
        lllllllIlIIl[lllllllIllII[8]] = lIIlIlIlIIllIll("p9i+/TTnEKftSfMEwpxsVakhg6rdD9QX", "BgodF");
        lllllllIlIIl[lllllllIllII[9]] = lIIlIlIlIIlllIl("AQ0qAighFg==", "BbFnM");
        lllllllIlIIl[lllllllIllII[10]] = lIIlIlIlIIlllII("rGCOtv/OTOs=", "vVQmn");
        lllllllIlIIl[lllllllIllII[12]] = lIIlIlIlIIlllIl("PAsrMz8dBg==", "xbLDZ");
        lllllllIlIIl[lllllllIllII[13]] = lIIlIlIlIIlllIl("AioTGzsgNw==", "OCkzW");
        lllllllIlIIl[lllllllIllII[14]] = lIIlIlIlIIllIll("+8EcJk9gIfo=", "xWTuq");
        lllllllIlIIl[lllllllIllII[15]] = lIIlIlIlIIlllII("pKmcblCFRlc=", "FEZbB");
        lllllllIlIIl[lllllllIllII[16]] = lIIlIlIlIIlllII("X+raoOXGrPA=", "MaIZf");
        lllllllIlIIl[lllllllIllII[17]] = lIIlIlIlIIllIll("bS0iQ+wetEw=", "mzImF");
        lllllllIlIIl[lllllllIllII[18]] = lIIlIlIlIIlllIl("PQAVBA==", "yrztB");
        lllllllIlIIl[lllllllIllII[20]] = lIIlIlIlIIlllII("fChc7OPnUI4=", "OGMzF");
        lllllllIlIIl[lllllllIllII[21]] = lIIlIlIlIIlllII("B5tUwq6sdBBbzArSnZOf3K/IHe6RoeWD", "vcHvH");
        lllllllIlIIl[lllllllIllII[22]] = lIIlIlIlIIllIll("GVyjIPaHgcI=", "aIwwt");
        lllllllIlIIl[lllllllIllII[23]] = lIIlIlIlIIllIll("sv6XYxu66QU=", "rqoOD");
    }

    private static boolean lIIlIlIlIlIllII(int i) {
        return i != 0;
    }
}
