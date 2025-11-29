package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Dropping spare items", priority = 30000)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ad  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/ad.class */
public class C0004ad extends Task {
    private static /* synthetic */ String[] lIlIlIIIllll;
    private final /* synthetic */ SquireChambersPlugin cF;
    private static /* synthetic */ int[] lIlIlIIlIIII;
    /* synthetic */ int cD = lIlIlIIlIIII[0];
    /* synthetic */ boolean cE = lIlIlIIlIIII[0];

    private static String llIlllIIlIIIlI(String lllllllllllllllIllIlIIllIlIllllI, String lllllllllllllllIllIlIIllIlIlllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIIllIlIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIlIIllIlIllIll = lllllllllllllllIllIlIIllIlIlllIl.toCharArray();
        int lllllllllllllllIllIlIIllIlIllIlI = lIlIlIIlIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlIIlIIII[0];
        while (llIlllIIlIllIl(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIllIlIIllIlIllIll[lllllllllllllllIllIlIIllIlIllIlI % lllllllllllllllIllIlIIllIlIllIll.length]));
            "".length();
            lllllllllllllllIllIlIIllIlIllIlI++;
            i++;
            "".length();
            if ((114 ^ 118) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    protected boolean cv() {
        Item first = Inventory.getFirst(item -> {
            if (llIlllIIlIIllI(item.getName().startsWith(lIlIlIIIllll[lIlIlIIlIIII[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIIlIIII[1]];
                strArr[lIlIlIIlIIII[0]] = lIlIlIIIllll[lIlIlIIlIIII[13]];
                if (llIlllIIlIIllI(item.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIIlIIII[1];
                    "".length();
                    return " ".length() < " ".length() ? ((((15 + 18) - (-53)) + 50) ^ (((29 + 122) - 3) + 29)) & (((((84 + 9) - 80) + 175) ^ (((108 + 1) - 95) + 119)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIIlIIII[0];
        });
        if (llIlllIIlIlIII(first)) {
            return lIlIlIIlIIII[0];
        }
        first.interact(lIlIlIIIllll[lIlIlIIlIIII[0]]);
        sleep(lIlIlIIlIIII[13]);
        return lIlIlIIlIIII[1];
    }

    private static boolean llIlllIIlIlIIl(Object obj) {
        return obj != null;
    }

    private static void llIlllIIlIIlII() {
        lIlIlIIIllll = new String[lIlIlIIlIIII[10]];
        lIlIlIIIllll[lIlIlIIlIIII[0]] = llIlllIIlIIIlI("EjoDKSM=", "VHjGH");
        lIlIlIIIllll[lIlIlIIlIIII[1]] = llIlllIIlIIIlI("KjszDiQXLnITIg0mPQ0=", "yORcM");
        lIlIlIIIllll[lIlIlIIlIIII[13]] = llIlllIIlIIIll("G//CQFgnma8=", "EXyCS");
    }

    private static boolean llIlllIIlIIlll(int i) {
        return i == 0;
    }

    private static boolean llIlllIIlIlIll(int i) {
        return i <= 0;
    }

    private static boolean llIlllIIlIllIl(int i, int i2) {
        return i < i2;
    }

    private static String llIlllIIlIIIll(String lllllllllllllllIllIlIIllIlIIlIIl, String lllllllllllllllIllIlIIllIlIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIllIlIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIllIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIlIIII[13], lllllllllllllllIllIlIIllIlIIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIllIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIllIlIIlIlI) {
            lllllllllllllllIllIlIIllIlIIlIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Inject
    public C0004ad(SquireChambersPlugin squireChambersPlugin) {
        this.cF = squireChambersPlugin;
    }

    private static boolean llIlllIIlIlIII(Object obj) {
        return obj == null;
    }

    private static void llIlllIIlIIlIl() {
        lIlIlIIlIIII = new int[18];
        lIlIlIIlIIII[0] = (55 ^ 122) & ((94 ^ 19) ^ (-1));
        lIlIlIIlIIII[1] = " ".length();
        lIlIlIIlIIII[2] = (((39 ^ 3) + (((35 + 162) - 94) + 73)) - (59 ^ 112)) + (154 ^ 198);
        lIlIlIIlIIII[3] = (-4258) & 4847;
        lIlIlIIlIIII[4] = 186 ^ 140;
        lIlIlIIlIIII[5] = (41 ^ 91) ^ (159 ^ 137);
        lIlIlIIlIIII[6] = (124 ^ 34) ^ (64 ^ 27);
        lIlIlIIlIIII[7] = (-((-4151) & 5879)) & (-2049) & 24575;
        lIlIlIIlIIII[8] = (-31249) & 32599;
        lIlIlIIlIIII[9] = (-((-20945) & 32249)) & (-577) & 32765;
        lIlIlIIlIIII[10] = "   ".length();
        lIlIlIIlIIII[11] = (-3529) & 24523;
        lIlIlIIlIIII[12] = (-9386) & 30379;
        lIlIlIIlIIII[13] = "  ".length();
        lIlIlIIlIIII[14] = (-((-23171) & 32699)) & (-2053) & 32573;
        lIlIlIIlIIII[15] = (-9793) & 30698;
        lIlIlIIlIIII[16] = (-((-12651) & 15739)) & (-585) & 24575;
        lIlIlIIlIIII[17] = (-25617) & 27963;
    }

    private static boolean llIlllIIlIlIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIlllIIlIIllI(int i) {
        return i != 0;
    }

    static {
        llIlllIIlIIlIl();
        llIlllIIlIIlII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v124, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v133, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v154, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v160, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v162, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    public boolean run() {
        if (!llIlllIIlIIllI(C0046u.be() ? 1 : 0) || llIlllIIlIIlll(C0046u.bf() ? 1 : 0)) {
            return lIlIlIIlIIII[0];
        }
        Locatable local = Players.getLocal();
        if (llIlllIIlIlIII(local)) {
            return lIlIlIIlIIII[0];
        }
        C0039n L = this.cF.L();
        if (!llIlllIIlIlIIl(this.cF.L()) || llIlllIIlIIlll(this.cF.L().a(local) ? 1 : 0)) {
            return lIlIlIIlIIII[0];
        }
        int[] iArr = new int[lIlIlIIlIIII[1]];
        iArr[lIlIlIIlIIII[0]] = lIlIlIIlIIII[2];
        if (llIlllIIlIIllI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIlIIlIIII[1]];
            iArr2[lIlIlIIlIIII[0]] = lIlIlIIlIIII[2];
            Inventory.dropAll(iArr2);
            "".length();
            return lIlIlIIlIIII[1];
        }
        int[] iArr3 = new int[lIlIlIIlIIII[1]];
        iArr3[lIlIlIIlIIII[0]] = lIlIlIIlIIII[3];
        if (llIlllIIlIIllI(Inventory.contains(iArr3) ? 1 : 0)) {
            if (llIlllIIlIlIlI(L.aM(), N.ICE_DEMON)) {
                int[] iArr4 = new int[lIlIlIIlIIII[1]];
                iArr4[lIlIlIIlIIII[0]] = lIlIlIIlIIII[3];
                Inventory.dropAll(iArr4);
                "".length();
                return lIlIlIIlIIII[1];
            } else if (llIlllIIlIlIll((lIlIlIIlIIII[4] - this.cF.K()) + ((lIlIlIIlIIII[5] - Skills.getLevel(Skill.WOODCUTTING)) / lIlIlIIlIIII[6]))) {
                int[] iArr5 = new int[lIlIlIIlIIII[1]];
                iArr5[lIlIlIIlIIII[0]] = lIlIlIIlIIII[3];
                Inventory.dropAll(iArr5);
                "".length();
                return lIlIlIIlIIII[1];
            }
        }
        int[] iArr6 = new int[lIlIlIIlIIII[1]];
        iArr6[lIlIlIIlIIII[0]] = lIlIlIIlIIII[7];
        if (llIlllIIlIIllI(Inventory.contains(iArr6) ? 1 : 0) && llIlllIIlIlIlI(L.aM(), N.ICE_DEMON)) {
            int[] iArr7 = new int[lIlIlIIlIIII[1]];
            iArr7[lIlIlIIlIIII[0]] = lIlIlIIlIIII[7];
            Inventory.dropAll(iArr7);
            "".length();
            return lIlIlIIlIIII[1];
        }
        int[] iArr8 = new int[lIlIlIIlIIII[1]];
        iArr8[lIlIlIIlIIII[0]] = lIlIlIIlIIII[8];
        if (llIlllIIlIIllI(Inventory.contains(iArr8) ? 1 : 0)) {
            if (llIlllIIlIlIlI(L.aM(), N.ICE_DEMON) && llIlllIIlIlIlI(L.aM(), N.MUTTADILES)) {
                int[] iArr9 = new int[lIlIlIIlIIII[1]];
                iArr9[lIlIlIIlIIII[0]] = lIlIlIIlIIII[8];
                Inventory.dropAll(iArr9);
                "".length();
                return lIlIlIIlIIII[1];
            } else if (llIlllIIlIllII(L.aM(), N.ICE_DEMON) && llIlllIIlIlIll((lIlIlIIlIIII[4] - this.cF.K()) + ((lIlIlIIlIIII[5] - Skills.getLevel(Skill.WOODCUTTING)) / lIlIlIIlIIII[6]))) {
                int[] iArr10 = new int[lIlIlIIlIIII[1]];
                iArr10[lIlIlIIlIIII[0]] = lIlIlIIlIIII[8];
                Inventory.dropAll(iArr10);
                "".length();
                return lIlIlIIlIIII[1];
            }
        }
        int[] iArr11 = new int[lIlIlIIlIIII[1]];
        iArr11[lIlIlIIlIIII[0]] = lIlIlIIlIIII[9];
        if (llIlllIIlIIllI(Inventory.contains(iArr11) ? 1 : 0) && llIlllIIlIlIlI(L.aM(), N.THIEVING)) {
            int[] iArr12 = new int[lIlIlIIlIIII[1]];
            iArr12[lIlIlIIlIIII[0]] = lIlIlIIlIIII[9];
            Inventory.dropAll(iArr12);
            "".length();
            return lIlIlIIlIIII[1];
        }
        int[] iArr13 = new int[lIlIlIIlIIII[10]];
        iArr13[lIlIlIIlIIII[0]] = lIlIlIIlIIII[11];
        iArr13[lIlIlIIlIIII[1]] = lIlIlIIlIIII[12];
        iArr13[lIlIlIIlIIII[13]] = lIlIlIIlIIII[14];
        if (llIlllIIlIIllI(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIlIlIIlIIII[10]];
            iArr14[lIlIlIIlIIII[0]] = lIlIlIIlIIII[11];
            iArr14[lIlIlIIlIIII[1]] = lIlIlIIlIIII[12];
            iArr14[lIlIlIIlIIII[13]] = lIlIlIIlIIII[14];
            Inventory.dropAll(iArr14);
            "".length();
            return lIlIlIIlIIII[1];
        }
        int[] iArr15 = new int[lIlIlIIlIIII[13]];
        iArr15[lIlIlIIlIIII[0]] = lIlIlIIlIIII[15];
        iArr15[lIlIlIIlIIII[1]] = lIlIlIIlIIII[16];
        if (llIlllIIlIIllI(Inventory.contains(iArr15) ? 1 : 0) && llIlllIIlIlIlI(L.aM(), N.END)) {
            int[] iArr16 = new int[lIlIlIIlIIII[13]];
            iArr16[lIlIlIIlIIII[0]] = lIlIlIIlIIII[15];
            iArr16[lIlIlIIlIIII[1]] = lIlIlIIlIIII[16];
            Inventory.dropAll(iArr16);
            "".length();
            return lIlIlIIlIIII[1];
        }
        int[] iArr17 = new int[lIlIlIIlIIII[1]];
        iArr17[lIlIlIIlIIII[0]] = lIlIlIIlIIII[17];
        if (llIlllIIlIIllI(Inventory.contains(iArr17) ? 1 : 0) && llIlllIIlIlIlI(L.aM(), N.CRABS)) {
            int[] iArr18 = new int[lIlIlIIlIIII[1]];
            iArr18[lIlIlIIlIIII[0]] = lIlIlIIlIIII[17];
            Inventory.dropAll(iArr18);
            "".length();
            return lIlIlIIlIIII[1];
        }
        return lIlIlIIlIIII[0];
    }

    private static boolean llIlllIIlIllII(Object obj, Object obj2) {
        return obj == obj2;
    }
}
