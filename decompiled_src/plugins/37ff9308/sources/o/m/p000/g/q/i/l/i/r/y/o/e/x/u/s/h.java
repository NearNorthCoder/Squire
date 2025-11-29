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
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Bank for staminas")
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.h  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/h.class */
public class h extends Task {
    private static /* synthetic */ int[] llllllllIIlI;
    private final /* synthetic */ SquireMixologyConfig L;
    private static /* synthetic */ String[] llllllllIIIl;
    private /* synthetic */ int I = llllllllIIlI[0];
    private /* synthetic */ int J = llllllllIIlI[1];
    private /* synthetic */ int K = llllllllIIlI[2];

    private static String lIIlIlIllIIIlII(String lllllllllllllllIIlIIIIlllIIllIll, String lllllllllllllllIIlIIIIlllIIllIlI) {
        String lllllllllllllllIIlIIIIlllIIllIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIlllIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIIIlllIIllIII = lllllllllllllllIIlIIIIlllIIllIlI.toCharArray();
        int lllllllllllllllIIlIIIIlllIIlIlll = llllllllIIlI[3];
        char[] charArray = lllllllllllllllIIlIIIIlllIIllIll2.toCharArray();
        int length = charArray.length;
        int i = llllllllIIlI[3];
        while (lIIlIlIllIIllII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIlIIIIlllIIllIII[lllllllllllllllIIlIIIIlllIIlIlll % lllllllllllllllIIlIIIIlllIIllIII.length]));
            "".length();
            lllllllllllllllIIlIIIIlllIIlIlll++;
            i++;
            "".length();
            if ((((144 ^ 164) ^ (176 ^ 194)) & (((100 ^ 85) ^ (3 ^ 116)) ^ (-" ".length()))) != (((191 ^ 154) ^ "   ".length()) & (((((211 + 176) - 248) + 92) ^ (((6 + 18) - (-22)) + 147)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIlIllIIllIl(Object obj) {
        return obj != null;
    }

    private static void lIIlIlIllIIlIII() {
        llllllllIIlI = new int[22];
        llllllllIIlI[0] = (-((-4223) & 4735)) & (-4113) & 16055;
        llllllllIIlI[1] = (-((-25633) & 30577)) & (-7) & 16382;
        llllllllIIlI[2] = (-16967) & 28399;
        llllllllIIlI[3] = (90 ^ 64) & ((155 ^ 129) ^ (-1));
        llllllllIIlI[4] = (52 ^ 34) ^ (124 ^ 14);
        llllllllIIlI[5] = " ".length();
        llllllllIIlI[6] = "  ".length();
        llllllllIIlI[7] = "   ".length();
        llllllllIIlI[8] = (-16394) & 17791;
        llllllllIIlI[9] = (-6677) & 15989;
        llllllllIIlI[10] = (13 ^ 34) ^ (14 ^ 37);
        llllllllIIlI[11] = 110 ^ 107;
        llllllllIIlI[12] = 6 ^ 0;
        llllllllIIlI[13] = 55 ^ 48;
        llllllllIIlI[14] = (81 ^ 75) ^ (4 ^ 22);
        llllllllIIlI[15] = 91 ^ 82;
        llllllllIIlI[16] = -" ".length();
        llllllllIIlI[17] = 116 ^ 126;
        llllllllIIlI[18] = (((88 + 67) - (-7)) + 15) ^ (((167 + 88) - 203) + 134);
        llllllllIIlI[19] = 102 ^ 106;
        llllllllIIlI[20] = (((99 + 30) - 89) + 103) ^ (((59 + 21) - 23) + 73);
        llllllllIIlI[21] = (47 ^ 15) ^ (49 ^ 31);
    }

    private static boolean lIIlIlIllIIllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlIllIIlIIl(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIllIIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    public boolean run() {
        if (!lIIlIlIllIIlIIl(s.e() ? 1 : 0) && !lIIlIlIllIIlIIl(this.L.useStamina() ? 1 : 0) && !lIIlIlIllIIlIlI(Inventory.contains(item -> {
            return item.getName().contains(llllllllIIIl[llllllllIIlI[20]]);
        }) ? 1 : 0)) {
            if (lIIlIlIllIIlIll(Vars.getBit(this.I), llllllllIIlI[4]) && lIIlIlIllIIlIll(Vars.getBit(this.J), llllllllIIlI[4]) && !lIIlIlIllIIllII(Vars.getBit(this.K), llllllllIIlI[4])) {
                if (!lIIlIlIllIIlIlI(SquireMixology.j ? 1 : 0) && !lIIlIlIllIIlIlI(SquireMixology.k ? 1 : 0)) {
                    if (lIIlIlIllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[llllllllIIlI[5]];
                        strArr[llllllllIIlI[3]] = llllllllIIIl[llllllllIIlI[3]];
                        TileObject nearest = TileObjects.getNearest(strArr);
                        if (lIIlIlIllIIllIl(nearest)) {
                            SquireMixology.g = llllllllIIIl[llllllllIIlI[5]];
                            nearest.interact(llllllllIIIl[llllllllIIlI[6]]);
                            return llllllllIIlI[3];
                        } else if (lIIlIlIllIIlllI(nearest)) {
                            SquireMixology.g = llllllllIIIl[llllllllIIlI[7]];
                            Movement.setDestination(new WorldPoint(llllllllIIlI[8], llllllllIIlI[9], llllllllIIlI[3]));
                            return llllllllIIlI[3];
                        }
                    }
                    if (lIIlIlIllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        String[] strArr2 = new String[llllllllIIlI[7]];
                        strArr2[llllllllIIlI[3]] = llllllllIIIl[llllllllIIlI[10]];
                        strArr2[llllllllIIlI[5]] = llllllllIIIl[llllllllIIlI[11]];
                        strArr2[llllllllIIlI[6]] = llllllllIIIl[llllllllIIlI[12]];
                        Bank.depositAllExcept(strArr2);
                        if (lIIlIlIllIIlIIl(Bank.contains(item2 -> {
                            return item2.getName().contains(llllllllIIIl[llllllllIIlI[19]]);
                        }) ? 1 : 0)) {
                            SquireMixology.g = llllllllIIIl[llllllllIIlI[13]];
                            return llllllllIIlI[3];
                        } else if (lIIlIlIllIIlIlI(Bank.contains(item3 -> {
                            return item3.getName().contains(llllllllIIIl[llllllllIIlI[18]]);
                        }) ? 1 : 0)) {
                            SquireMixology.g = llllllllIIIl[llllllllIIlI[14]];
                            Bank.withdraw(item4 -> {
                                return item4.getName().contains(llllllllIIIl[llllllllIIlI[17]]);
                            }, llllllllIIlI[11], Bank.WithdrawMode.ITEM);
                            SquireMixology.m = llllllllIIIl[llllllllIIlI[15]];
                            SquireMixology.r = llllllllIIlI[16];
                            SquireMixology.A = llllllllIIlI[3];
                            SquireMixology.k = llllllllIIlI[3];
                            return llllllllIIlI[3];
                        }
                    }
                    return llllllllIIlI[3];
                }
                return llllllllIIlI[3];
            }
            return llllllllIIlI[3];
        }
        return llllllllIIlI[3];
    }

    private static boolean lIIlIlIllIIlIll(int i, int i2) {
        return i >= i2;
    }

    private static String lIIlIlIllIIIllI(String lllllllllllllllIIlIIIIlllIIIIllI, String lllllllllllllllIIlIIIIlllIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIlllIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIlllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIIlllIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIIlllIIIlIII.init(llllllllIIlI[6], lllllllllllllllIIlIIIIlllIIIlIIl);
            return new String(lllllllllllllllIIlIIIIlllIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIlllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIlllIIIIlll) {
            lllllllllllllllIIlIIIIlllIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIllIIlllI(Object obj) {
        return obj == null;
    }

    private static String lIIlIlIllIIIlIl(String lllllllllllllllIIlIIIIllIllllIIl, String lllllllllllllllIIlIIIIllIllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIllIllllIII.getBytes(StandardCharsets.UTF_8)), llllllllIIlI[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllllIIlI[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIllIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIllIllllIlI) {
            lllllllllllllllIIlIIIIllIllllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIllIIIlll() {
        llllllllIIIl = new String[llllllllIIlI[21]];
        llllllllIIIl[llllllllIIlI[3]] = lIIlIlIllIIIlII("JiAcG2cnKRcDMw==", "dArpG");
        llllllllIIIl[llllllllIIlI[5]] = lIIlIlIllIIIlIl("U0kpzyMJCtj+TqPJRKK4FA==", "vGxAR");
        llllllllIIIl[llllllllIIlI[6]] = lIIlIlIllIIIllI("w7bx8MoWHRU=", "AtZvH");
        llllllllIIIl[llllllllIIlI[7]] = lIIlIlIllIIIllI("1NymvRL4HrrDralrjQa8y7HwCntnPkcI", "SjrOa");
        llllllllIIIl[llllllllIIlI[10]] = lIIlIlIllIIIlII("GAQIdDM0GAQx", "UkpTC");
        llllllllIIIl[llllllllIIlI[11]] = lIIlIlIllIIIlII("PDArdDwROjox", "pINTL");
        llllllllIIIl[llllllllIIlI[12]] = lIIlIlIllIIIlII("GAUvaD04ETot", "YbNHM");
        llllllllIIIl[llllllllIIlI[13]] = lIIlIlIllIIIllI("XKLirGKe/1Ug+rqxYN5clg==", "bVGMR");
        llllllllIIIl[llllllllIIlI[14]] = lIIlIlIllIIIlIl("NiutquKTHucTa2RfclLq7R43sC9HK+gP", "ZtyRs");
        llllllllIIIl[llllllllIIlI[15]] = lIIlIlIllIIIlIl("iEoXMVpTS0c=", "GbMyo");
        llllllllIIIl[llllllllIIlI[17]] = lIIlIlIllIIIlII("IycqByUeMg==", "pSKjL");
        llllllllIIIl[llllllllIIlI[18]] = lIIlIlIllIIIlIl("bXAsFn4efTo=", "mFPbN");
        llllllllIIIl[llllllllIIlI[19]] = lIIlIlIllIIIllI("ca5oy3kNBCQ=", "fXCzA");
        llllllllIIIl[llllllllIIlI[20]] = lIIlIlIllIIIllI("M1+UQfV8PKk=", "DLPFL");
    }

    @Inject
    public h(SquireMixologyConfig squireMixologyConfig) {
        this.L = squireMixologyConfig;
    }

    static {
        lIIlIlIllIIlIII();
        lIIlIlIllIIIlll();
    }
}
