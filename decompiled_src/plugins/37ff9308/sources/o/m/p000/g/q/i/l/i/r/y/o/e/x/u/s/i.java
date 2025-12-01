package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Deposit hopper")
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.i  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/i.class */
public class i extends Task {
    private static /* synthetic */ int[] lIIIIIIIIIlII;
    private static /* synthetic */ String[] lIIIIIIIIIIll;
    private final /* synthetic */ SquireMixologyConfig M;
    private /* synthetic */ int I = lIIIIIIIIIlII[0];
    private /* synthetic */ int J = lIIIIIIIIIlII[1];
    private /* synthetic */ int K = lIIIIIIIIIlII[2];
    private /* synthetic */ int N = lIIIIIIIIIlII[3];
    private /* synthetic */ int O = lIIIIIIIIIlII[4];
    private /* synthetic */ int P = lIIIIIIIIIlII[5];

    private static String lIIlIllIIIlIIII(String lllllllllllllllIIlIIIIIIlIlIllIl, String lllllllllllllllIIlIIIIIIlIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIIIIlIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIIIIlIlIllll.init(lIIIIIIIIIlII[11], secretKeySpec);
            return new String(lllllllllllllllIIlIIIIIIlIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIIlIlIlllI) {
            lllllllllllllllIIlIIIIIIlIlIlllI.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIllIIIllIIl();
        lIIlIllIIIlIIlI();
    }

    private static boolean lIIlIllIIlIIIlI(Object obj) {
        return obj == null;
    }

    private static String lIIlIllIIIIllll(String lllllllllllllllIIlIIIIIIllIIllll, String lllllllllllllllIIlIIIIIIllIIlllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIllIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIIIIIllIIlllI.toCharArray();
        int lllllllllllllllIIlIIIIIIllIIlIll = lIIIIIIIIIlII[6];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIIIIIIIlII[6];
        while (lIIlIllIIIllllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIIIIIIllIIlIll % charArray.length]));
            "".length();
            lllllllllllllllIIlIIIIIIllIIlIll++;
            i++;
            "".length();
            if (((32 ^ 76) ^ (81 ^ 57)) < " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIllIIIllIlI(int i) {
        return i == 0;
    }

    private static void lIIlIllIIIlIIlI() {
        lIIIIIIIIIIll = new String[lIIIIIIIIIlII[41]];
        lIIIIIIIIIIll[lIIIIIIIIIlII[6]] = lIIlIllIIIIllll("OAg3G3o5ATwDLg==", "ziYpZ");
        lIIIIIIIIIIll[lIIIIIIIIIlII[9]] = lIIlIllIIIIllll("OB4xUhoUAj0X", "uqIrj");
        lIIIIIIIIIIll[lIIIIIIIIIlII[11]] = lIIlIllIIIIllll("ICcCBFEhLgkcBQ==", "bFloq");
        lIIIIIIIIIIll[lIIIIIIIIIlII[12]] = lIIlIllIIIIllll("LiIvFysPNWobIw85", "aRJyB");
        lIIIIIIIIIIll[lIIIIIIIIIlII[13]] = lIIlIllIIIlIIII("whXwvTt/eBk=", "Huctw");
        lIIIIIIIIIIll[lIIIIIIIIIlII[10]] = lIIlIllIIIlIIIl("3wUUImeRYi+SlJk9R2Ewr1EaP5h0IYXz", "pjWwv");
        lIIIIIIIIIIll[lIIIIIIIIIlII[16]] = lIIlIllIIIIllll("NwkuZjQbFSIj", "zfVFD");
        lIIIIIIIIIIll[lIIIIIIIIIlII[17]] = lIIlIllIIIlIIII("WGQhpynQsP8=", "IokiG");
        lIIIIIIIIIIll[lIIIIIIIIIlII[18]] = lIIlIllIIIlIIIl("KL5r6jP03469Y8rsl1eMpNOJLc4CXSzG", "nPnKa");
        lIIIIIIIIIIll[lIIIIIIIIIlII[19]] = lIIlIllIIIIllll("Gy0HPxwh", "SBwOy");
        lIIIIIIIIIIll[lIIIIIIIIIlII[20]] = lIIlIllIIIlIIII("Hf7J50KGJa0=", "rhMvD");
        lIIIIIIIIIIll[lIIIIIIIIIlII[21]] = lIIlIllIIIlIIII("M/QKWdrhrDo=", "uCDtm");
        lIIIIIIIIIIll[lIIIIIIIIIlII[23]] = lIIlIllIIIIllll("FwUvCUoWDCQRHg==", "UdAbj");
        lIIIIIIIIIIll[lIIIIIIIIIlII[24]] = lIIlIllIIIIllll("CxwcOzkqC1k3MSoH", "DlyUP");
        lIIIIIIIIIIll[lIIIIIIIIIlII[25]] = lIIlIllIIIIllll("OxAg", "ncECH");
        lIIIIIIIIIIll[lIIIIIIIIIlII[26]] = lIIlIllIIIIllll("LjE1AkQaPDYaAQtwLQZEGzE3Ag==", "yPYid");
        lIIIIIIIIIIll[lIIIIIIIIIlII[27]] = lIIlIllIIIlIIIl("PgqB9rBWxhg=", "zgeUF");
        lIIIIIIIIIIll[lIIIIIIIIIlII[28]] = lIIlIllIIIlIIII("Vx5Y0wes/LUlMIvbFWvSqcL904kFpX8H", "dOvzA");
        lIIIIIIIIIIll[lIIIIIIIIIlII[29]] = lIIlIllIIIIllll("HzwiHzUl", "WSRoP");
        lIIIIIIIIIIll[lIIIIIIIIIlII[30]] = lIIlIllIIIlIIII("trGq5jpY4B8=", "ugcVq");
        lIIIIIIIIIIll[lIIIIIIIIIlII[31]] = lIIlIllIIIlIIIl("sQjT9rz2sUk=", "uasuN");
        lIIIIIIIIIIll[lIIIIIIIIIlII[32]] = lIIlIllIIIIllll("Iy4mBXYiJy0dIg==", "aOHnV");
        lIIIIIIIIIIll[lIIIIIIIIIlII[33]] = lIIlIllIIIlIIIl("7UERElkfhIcDPNhrlcsMfA==", "UAutv");
        lIIIIIIIIIIll[lIIIIIIIIIlII[34]] = lIIlIllIIIlIIII("v38uZzv02s0=", "NFzYF");
        lIIIIIIIIIIll[lIIIIIIIIIlII[35]] = lIIlIllIIIIllll("ICkCLnEUJAE2NAVoGipxFSkALg==", "wHnEQ");
        lIIIIIIIIIIll[lIIIIIIIIIlII[36]] = lIIlIllIIIlIIII("jPwN5esOp3I=", "DRsFp");
        lIIIIIIIIIIll[lIIIIIIIIIlII[37]] = lIIlIllIIIlIIII("2ZcOFtXXuakSmx3OsnpEu8yR5BNwINS0", "ZOiGb");
        lIIIIIIIIIIll[lIIIIIIIIIlII[38]] = lIIlIllIIIIllll("Eg4WEwko", "Zafcl");
        lIIIIIIIIIIll[lIIIIIIIIIlII[39]] = lIIlIllIIIlIIIl("nxx7qvOSFdU=", "uAlVQ");
        lIIIIIIIIIIll[lIIIIIIIIIlII[40]] = lIIlIllIIIlIIII("TQJRfTKOXSQ=", "umGcR");
    }

    private static String lIIlIllIIIlIIIl(String lllllllllllllllIIlIIIIIIlIlllIlI, String lllllllllllllllIIlIIIIIIlIlllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIIlIlllIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIIlII[18]), "DES");
            Cipher lllllllllllllllIIlIIIIIIlIllllII = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIIIlIllllII.init(lIIIIIIIIIlII[11], secretKeySpec);
            return new String(lllllllllllllllIIlIIIIIIlIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIlIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIIlIlllIll) {
            lllllllllllllllIIlIIIIIIlIlllIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public i(SquireMixologyConfig squireMixologyConfig) {
        this.M = squireMixologyConfig;
    }

    private static boolean lIIlIllIIlIIIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIllIIlIIIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIllIIIllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIllIIIllIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
        if (lIIlIllIIlIIIII(net.unethicalite.api.entities.TileObjects.getNearest(r0).getWorldLocation().distanceTo(net.unethicalite.api.entities.Players.getLocal().getWorldLocation()), o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.i.lIIIIIIIIIlII[10]) != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012f, code lost:
        if (lIIlIllIIIlllll(o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.s.i() ? 1 : 0) == false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v145, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v147, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v149, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v174, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v178, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v192, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v197, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v219, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v221, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v241, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v248, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v252, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v266, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v271, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v273, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v298, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v300, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v302, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v304, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        if (!lIIlIllIIIllIlI(s.e() ? 1 : 0) && !lIIlIllIIIllIll(this.M.pluginMode(), d.MINIGAME) && !lIIlIllIIIlllII(Vars.getBit(lIIIIIIIIIlII[7]))) {
            if (lIIlIllIIIlllIl(Vars.getBit(this.I), lIIIIIIIIIlII[8]) && lIIlIllIIIlllIl(Vars.getBit(this.J), lIIIIIIIIIlII[8]) && lIIlIllIIIlllIl(Vars.getBit(this.K), lIIIIIIIIIlII[8]) && lIIlIllIIIllIlI(Players.getLocal().isAnimating() ? 1 : 0) && lIIlIllIIIllIlI(s.f() ? 1 : 0) && lIIlIllIIIllIlI(s.i() ? 1 : 0)) {
                return lIIIIIIIIIlII[6];
            }
            if (!lIIlIllIIIlllIl(Vars.getBit(this.I), lIIIIIIIIIlII[8]) || !lIIlIllIIIlllIl(Vars.getBit(this.J), lIIIIIIIIIlII[8]) || lIIlIllIIIllllI(Vars.getBit(this.K), lIIIIIIIIIlII[8])) {
                if (lIIlIllIIIlllll(Players.getLocal().isAnimating() ? 1 : 0)) {
                    String[] strArr = new String[lIIIIIIIIIlII[9]];
                    strArr[lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[6]];
                }
                if (lIIlIllIIIllIlI(s.f() ? 1 : 0)) {
                }
                return lIIIIIIIIIlII[6];
            }
            if (lIIlIllIIIlllll(SquireMixology.j ? 1 : 0)) {
                return lIIIIIIIIIlII[6];
            }
            if (lIIlIllIIIllllI(Vars.getBit(this.I), lIIIIIIIIIlII[8])) {
                String[] strArr2 = new String[lIIIIIIIIIlII[9]];
                strArr2[lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[9]];
                if (lIIlIllIIIllIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                    if (lIIlIllIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        String[] strArr3 = new String[lIIIIIIIIIlII[9]];
                        strArr3[lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[11]];
                        TileObject nearest = TileObjects.getNearest(strArr3);
                        if (lIIlIllIIlIIIIl(nearest)) {
                            SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[12]];
                            nearest.interact(lIIIIIIIIIIll[lIIIIIIIIIlII[13]]);
                            return lIIIIIIIIIlII[6];
                        } else if (lIIlIllIIlIIIlI(nearest)) {
                            SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[10]];
                            Movement.setDestination(new WorldPoint(lIIIIIIIIIlII[14], lIIIIIIIIIlII[15], lIIIIIIIIIlII[6]));
                            return lIIIIIIIIIlII[6];
                        }
                    }
                    if (lIIlIllIIIlllll(Bank.isOpen() ? 1 : 0)) {
                        int[] iArr = new int[lIIIIIIIIIlII[9]];
                        iArr[lIIIIIIIIIlII[6]] = this.N;
                        if (lIIlIllIIIllIlI(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr4 = new String[lIIIIIIIIIlII[9]];
                            strArr4[lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[16]];
                            if (lIIlIllIIIllIlI(Inventory.contains(strArr4) ? 1 : 0)) {
                                SquireMixology.j = lIIIIIIIIIlII[9];
                                SquireMixology.q = lIIIIIIIIIIll[lIIIIIIIIIlII[17]];
                                return lIIIIIIIIIlII[6];
                            }
                        }
                        int[] iArr2 = new int[lIIIIIIIIIlII[9]];
                        iArr2[lIIIIIIIIIlII[6]] = this.N;
                        if (lIIlIllIIIlllll(Bank.contains(iArr2) ? 1 : 0)) {
                            Bank.withdrawAll(this.N, Bank.WithdrawMode.ITEM);
                            return lIIIIIIIIIlII[6];
                        }
                    }
                }
                int[] iArr3 = new int[lIIIIIIIIIlII[9]];
                iArr3[lIIIIIIIIIlII[6]] = this.N;
                if (lIIlIllIIIlllll(Inventory.contains(iArr3) ? 1 : 0)) {
                    SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[18]];
                    String[] strArr5 = new String[lIIIIIIIIIlII[9]];
                    strArr5[lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[19]];
                    TileObjects.getNearest(strArr5).interact(lIIIIIIIIIIll[lIIIIIIIIIlII[20]]);
                    SquireMixology.m = lIIIIIIIIIIll[lIIIIIIIIIlII[21]];
                    SquireMixology.r = lIIIIIIIIIlII[22];
                    SquireMixology.A = lIIIIIIIIIlII[6];
                    SquireMixology.k = lIIIIIIIIIlII[6];
                    return lIIIIIIIIIlII[6];
                }
            }
            if (lIIlIllIIIllllI(Vars.getBit(this.J), lIIIIIIIIIlII[8])) {
                int[] iArr4 = new int[lIIIIIIIIIlII[9]];
                iArr4[lIIIIIIIIIlII[6]] = this.P;
                if (lIIlIllIIIllIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                    if (lIIlIllIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        String[] strArr6 = new String[lIIIIIIIIIlII[9]];
                        strArr6[lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[23]];
                        TileObject nearest2 = TileObjects.getNearest(strArr6);
                        if (lIIlIllIIlIIIIl(nearest2)) {
                            SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[24]];
                            nearest2.interact(lIIIIIIIIIIll[lIIIIIIIIIlII[25]]);
                            return lIIIIIIIIIlII[6];
                        } else if (lIIlIllIIlIIIlI(nearest2)) {
                            SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[26]];
                            Movement.setDestination(new WorldPoint(lIIIIIIIIIlII[14], lIIIIIIIIIlII[15], lIIIIIIIIIlII[6]));
                            return lIIIIIIIIIlII[6];
                        }
                    }
                    if (lIIlIllIIIlllll(Bank.isOpen() ? 1 : 0)) {
                        int[] iArr5 = new int[lIIIIIIIIIlII[9]];
                        iArr5[lIIIIIIIIIlII[6]] = this.P;
                        if (lIIlIllIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIIIIIIIlII[9]];
                            iArr6[lIIIIIIIIIlII[6]] = this.P;
                            if (lIIlIllIIIllIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                                SquireMixology.j = lIIIIIIIIIlII[9];
                                SquireMixology.q = lIIIIIIIIIIll[lIIIIIIIIIlII[27]];
                                return lIIIIIIIIIlII[6];
                            }
                        }
                        int[] iArr7 = new int[lIIIIIIIIIlII[9]];
                        iArr7[lIIIIIIIIIlII[6]] = this.P;
                        if (lIIlIllIIIlllll(Bank.contains(iArr7) ? 1 : 0)) {
                            Bank.withdrawAll(this.P, Bank.WithdrawMode.ITEM);
                            return lIIIIIIIIIlII[6];
                        }
                    }
                }
                int[] iArr8 = new int[lIIIIIIIIIlII[9]];
                iArr8[lIIIIIIIIIlII[6]] = this.P;
                if (lIIlIllIIIlllll(Inventory.contains(iArr8) ? 1 : 0)) {
                    SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[28]];
                    String[] strArr7 = new String[lIIIIIIIIIlII[9]];
                    strArr7[lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[29]];
                    TileObjects.getNearest(strArr7).interact(lIIIIIIIIIIll[lIIIIIIIIIlII[30]]);
                    SquireMixology.m = lIIIIIIIIIIll[lIIIIIIIIIlII[31]];
                    SquireMixology.r = lIIIIIIIIIlII[22];
                    SquireMixology.A = lIIIIIIIIIlII[6];
                    SquireMixology.k = lIIIIIIIIIlII[6];
                    return lIIIIIIIIIlII[6];
                }
            }
            if (lIIlIllIIIllllI(Vars.getBit(this.K), lIIIIIIIIIlII[8])) {
                int[] iArr9 = new int[lIIIIIIIIIlII[9]];
                iArr9[lIIIIIIIIIlII[6]] = this.O;
                if (lIIlIllIIIllIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                    if (lIIlIllIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                        String[] strArr8 = new String[lIIIIIIIIIlII[9]];
                        strArr8[lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[32]];
                        TileObject nearest3 = TileObjects.getNearest(strArr8);
                        if (lIIlIllIIlIIIIl(nearest3)) {
                            SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[33]];
                            nearest3.interact(lIIIIIIIIIIll[lIIIIIIIIIlII[34]]);
                            return lIIIIIIIIIlII[6];
                        } else if (lIIlIllIIlIIIlI(nearest3)) {
                            SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[35]];
                            Movement.setDestination(new WorldPoint(lIIIIIIIIIlII[14], lIIIIIIIIIlII[15], lIIIIIIIIIlII[6]));
                            return lIIIIIIIIIlII[6];
                        }
                    }
                    if (lIIlIllIIIlllll(Bank.isOpen() ? 1 : 0)) {
                        int[] iArr10 = new int[lIIIIIIIIIlII[9]];
                        iArr10[lIIIIIIIIIlII[6]] = this.O;
                        if (lIIlIllIIIllIlI(Bank.contains(iArr10) ? 1 : 0)) {
                            int[] iArr11 = new int[lIIIIIIIIIlII[9]];
                            iArr11[lIIIIIIIIIlII[6]] = this.O;
                            if (lIIlIllIIIllIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                                SquireMixology.j = lIIIIIIIIIlII[9];
                                SquireMixology.q = lIIIIIIIIIIll[lIIIIIIIIIlII[36]];
                                return lIIIIIIIIIlII[6];
                            }
                        }
                        int[] iArr12 = new int[lIIIIIIIIIlII[9]];
                        iArr12[lIIIIIIIIIlII[6]] = this.O;
                        if (lIIlIllIIIlllll(Bank.contains(iArr12) ? 1 : 0)) {
                            Bank.withdrawAll(this.O, Bank.WithdrawMode.ITEM);
                            return lIIIIIIIIIlII[6];
                        }
                    }
                }
                int[] iArr13 = new int[lIIIIIIIIIlII[9]];
                iArr13[lIIIIIIIIIlII[6]] = this.O;
                if (lIIlIllIIIlllll(Inventory.contains(iArr13) ? 1 : 0)) {
                    SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[37]];
                    String[] strArr9 = new String[lIIIIIIIIIlII[9]];
                    strArr9[lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[38]];
                    TileObjects.getNearest(strArr9).interact(lIIIIIIIIIIll[lIIIIIIIIIlII[39]]);
                    SquireMixology.m = lIIIIIIIIIIll[lIIIIIIIIIlII[40]];
                    SquireMixology.r = lIIIIIIIIIlII[22];
                    SquireMixology.A = lIIIIIIIIIlII[6];
                    SquireMixology.k = lIIIIIIIIIlII[6];
                    return lIIIIIIIIIlII[6];
                }
            }
            return lIIIIIIIIIlII[6];
        }
        return lIIIIIIIIIlII[6];
    }

    private static boolean lIIlIllIIIlllll(int i) {
        return i != 0;
    }

    private static void lIIlIllIIIllIIl() {
        lIIIIIIIIIlII = new int[42];
        lIIIIIIIIIlII[0] = (-((-5505) & 22409)) & (-65) & 28399;
        lIIIIIIIIIlII[1] = (-4163) & 15594;
        lIIIIIIIIIlII[2] = (-4865) & 16297;
        lIIIIIIIIIlII[3] = (-2635) & 32639;
        lIIIIIIIIIlII[4] = (-2565) & 32573;
        lIIIIIIIIIlII[5] = (-2241) & 32247;
        lIIIIIIIIIlII[6] = (201 ^ 169) & ((247 ^ 151) ^ (-1));
        lIIIIIIIIIlII[7] = (-933) & 12271;
        lIIIIIIIIIlII[8] = 118 ^ 18;
        lIIIIIIIIIlII[9] = " ".length();
        lIIIIIIIIIlII[10] = (184 ^ 176) ^ (173 ^ 160);
        lIIIIIIIIIlII[11] = "  ".length();
        lIIIIIIIIIlII[12] = "   ".length();
        lIIIIIIIIIlII[13] = (8 ^ 76) ^ (5 ^ 69);
        lIIIIIIIIIlII[14] = (-((-689) & 23225)) & (-514) & 24447;
        lIIIIIIIIIlII[15] = (-((-3585) & 24459)) & (-5) & 30191;
        lIIIIIIIIIlII[16] = 124 ^ 122;
        lIIIIIIIIIlII[17] = (14 ^ 112) ^ (111 ^ 22);
        lIIIIIIIIIlII[18] = 153 ^ 145;
        lIIIIIIIIIlII[19] = (167 ^ 160) ^ (146 ^ 156);
        lIIIIIIIIIlII[20] = 84 ^ 94;
        lIIIIIIIIIlII[21] = 177 ^ 186;
        lIIIIIIIIIlII[22] = -" ".length();
        lIIIIIIIIIlII[23] = (177 ^ 197) ^ (83 ^ 43);
        lIIIIIIIIIlII[24] = (118 ^ 24) ^ (23 ^ 116);
        lIIIIIIIIIlII[25] = (34 ^ 73) ^ (0 ^ 101);
        lIIIIIIIIIlII[26] = 67 ^ 76;
        lIIIIIIIIIlII[27] = (250 ^ 172) ^ (75 ^ 13);
        lIIIIIIIIIlII[28] = 21 ^ 4;
        lIIIIIIIIIlII[29] = (102 ^ 38) ^ (238 ^ 188);
        lIIIIIIIIIlII[30] = 85 ^ 70;
        lIIIIIIIIIlII[31] = (((30 + 149) - 66) + 70) ^ (((59 + 97) - 39) + 46);
        lIIIIIIIIIlII[32] = 169 ^ 188;
        lIIIIIIIIIlII[33] = (158 ^ 189) ^ (124 ^ 73);
        lIIIIIIIIIlII[34] = (46 ^ 31) ^ (83 ^ 117);
        lIIIIIIIIIlII[35] = (100 ^ 44) ^ (9 ^ 89);
        lIIIIIIIIIlII[36] = 45 ^ 52;
        lIIIIIIIIIlII[37] = 158 ^ 132;
        lIIIIIIIIIlII[38] = (72 ^ 24) ^ (89 ^ 18);
        lIIIIIIIIIlII[39] = (200 ^ 189) ^ (194 ^ 171);
        lIIIIIIIIIlII[40] = 121 ^ 100;
        lIIIIIIIIIlII[41] = (144 ^ 184) ^ (88 ^ 110);
    }

    private static boolean lIIlIllIIIlllII(int i) {
        return i > 0;
    }

    private static boolean lIIlIllIIIlllIl(int i, int i2) {
        return i >= i2;
    }
}
