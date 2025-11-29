package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
@TaskDesc(name = "Flee", priority = 108, register = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.x  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/x.class */
public class x extends w {
    public static final /* synthetic */ int ci;
    private static /* synthetic */ int[] lIlIllIIIIlIl;
    private static /* synthetic */ String[] lIlIllIIIIlII;
    public static final /* synthetic */ int cj;
    private /* synthetic */ int ck;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean Y() {
        return llIIIIIIIIlIlIl(this.cf.getBoostedSkillLevel(Skill.PRAYER), lIlIllIIIIlIl[6]) ? lIlIllIIIIlIl[0] : Inventory.contains(item -> {
            return item.getName().startsWith(lIlIllIIIIlII[lIlIllIIIIlIl[9]]);
        });
    }

    static {
        llIIIIIIIIlIIlI();
        llIIIIIIIIlIIIl();
        cj = lIlIllIIIIlIl[5];
        ci = lIlIllIIIIlIl[7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean Z() {
        int i2;
        int i3 = lIlIllIIIIlIl[7];
        if (llIIIIIIIIlIIll(Combat.isVenomed() ? 1 : 0)) {
            i2 = lIlIllIIIIlIl[6];
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i2 = lIlIllIIIIlIl[1];
        }
        int i4 = i3 + i2;
        String str = lIlIllIIIIlII[lIlIllIIIIlIl[8]];
        if (llIIIIIIIIlIlII(X() ? 1 : 0) && llIIIIIIIIlIIll(Combat.isVenomed() ? 1 : 0) && llIIIIIIIIlIlll(Combat.getCurrentHealth(), i4) && !llIIIIIIIIlIIll(Inventory.contains(item -> {
            return item.getName().startsWith(str);
        }) ? 1 : 0)) {
            return lIlIllIIIIlIl[1];
        }
        ?? r0 = lIlIllIIIIlIl[0];
        "".length();
        return " ".length() > "  ".length() ? ((((123 + 17) - 85) + 72) ^ (12 ^ 116)) & (((162 ^ 195) ^ (99 ^ 5)) ^ (-" ".length())) : r0;
    }

    private static boolean llIIIIIIIIlIlII(int i2) {
        return i2 == 0;
    }

    private static boolean llIIIIIIIIlIllI(int i2) {
        return i2 > 0;
    }

    private static boolean llIIIIIIIIllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIIIIIIIIIllll(String llllllllllllllIllIlIIlllIlIIlllI, String llllllllllllllIllIlIIlllIlIIllIl) {
        String llllllllllllllIllIlIIlllIlIIlllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIlllIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIlllIlIIllII = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIIlllIlIIllIl.toCharArray();
        int llllllllllllllIllIlIIlllIlIIlIlI = lIlIllIIIIlIl[1];
        char[] charArray2 = llllllllllllllIllIlIIlllIlIIlllI2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIllIIIIlIl[1];
        while (llIIIIIIIIllIIl(i2, length)) {
            llllllllllllllIllIlIIlllIlIIllII.append((char) (charArray2[i2] ^ charArray[llllllllllllllIllIlIIlllIlIIlIlI % charArray.length]));
            "".length();
            llllllllllllllIllIlIIlllIlIIlIlI++;
            i2++;
            "".length();
            if ((-" ".length()) > ((153 ^ 193) & ((233 ^ 177) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIIlllIlIIllII);
    }

    private static String llIIIIIIIIIlllI(String llllllllllllllIllIlIIlllIllIlIll, String llllllllllllllIllIlIIlllIllIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlllIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIlllIllIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIlllIllIllIl.init(lIlIllIIIIlIl[3], secretKeySpec);
            return new String(llllllllllllllIllIlIIlllIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlllIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIlllIllIllII) {
            llllllllllllllIllIlIIlllIllIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean X() {
        if (llIIIIIIIIlIlIl(Combat.getCurrentHealth(), this.ce.eatAtHP())) {
            return lIlIllIIIIlIl[0];
        }
        if (llIIIIIIIIlIllI(Inventory.getCount((boolean) lIlIllIIIIlIl[0], item -> {
            String[] strArr = new String[lIlIllIIIIlIl[0]];
            strArr[lIlIllIIIIlIl[1]] = lIlIllIIIIlII[lIlIllIIIIlIl[10]];
            return item.hasAction(strArr);
        }))) {
            ?? r0 = lIlIllIIIIlIl[0];
            "".length();
            return (-" ".length()) > ((212 ^ 169) ^ (58 ^ 67)) ? ((31 ^ 59) ^ (197 ^ 179)) & (((70 ^ 8) ^ (66 ^ 94)) ^ (-" ".length())) : r0;
        }
        return lIlIllIIIIlIl[1];
    }

    private static void llIIIIIIIIlIIlI() {
        lIlIllIIIIlIl = new int[12];
        lIlIllIIIIlIl[0] = " ".length();
        lIlIllIIIIlIl[1] = (75 ^ 22) & ((22 ^ 75) ^ (-1));
        lIlIllIIIIlIl[2] = (-2193) & 15324;
        lIlIllIIIIlIl[3] = "  ".length();
        lIlIllIIIIlIl[4] = "   ".length();
        lIlIllIIIIlIl[5] = 30 ^ 26;
        lIlIllIIIIlIl[6] = (82 ^ 52) ^ (68 ^ 40);
        lIlIllIIIIlIl[7] = 52 ^ 20;
        lIlIllIIIIlIl[8] = (((148 + 146) - 272) + 131) ^ (((15 + 147) - 125) + 119);
        lIlIllIIIIlIl[9] = 193 ^ 199;
        lIlIllIIIIlIl[10] = 10 ^ 13;
        lIlIllIIIIlIl[11] = (((97 + 71) - 44) + 40) ^ (((97 + 67) - 71) + 79);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    private boolean aa() {
        int i2;
        int i3;
        int i4;
        int i5 = lIlIllIIIIlIl[7];
        if (llIIIIIIIIlIIll(Combat.isVenomed() ? 1 : 0)) {
            i2 = lIlIllIIIIlIl[6];
            "".length();
            if ((-"   ".length()) >= 0) {
                return (!true) & ((true ^ true) ^ true);
            }
        } else {
            i2 = lIlIllIIIIlIl[1];
        }
        int i6 = i5 + i2;
        if (llIIIIIIIIlIlll(this.cf.getBoostedSkillLevel(Skill.HITPOINTS), lIlIllIIIIlIl[7])) {
            i3 = lIlIllIIIIlIl[0];
            "".length();
            if (!((true ^ true) ^ ((true ^ true) & ((true ^ true) ^ true)))) {
                return ((199 ^ 165) ^ (241 ^ 199)) & (((((56 + 148) - 4) + 7) ^ (((93 + 153) - 234) + 143)) ^ (-" ".length()));
            }
        } else {
            i3 = lIlIllIIIIlIl[1];
        }
        int i7 = i3;
        if (llIIIIIIIIlIlIl(this.cf.getTickCount() - this.cg.F(), lIlIllIIIIlIl[5])) {
            i4 = lIlIllIIIIlIl[0];
            "".length();
            if ("  ".length() < " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i4 = lIlIllIIIIlIl[1];
        }
        int i8 = i4;
        if (llIIIIIIIIlIIll(i7) && llIIIIIIIIlIlII(i8) && llIIIIIIIIlIIll(ab() ? 1 : 0)) {
            ?? r0 = lIlIllIIIIlIl[0];
            "".length();
            return (-" ".length()) >= " ".length() ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
        }
        return lIlIllIIIIlIl[1];
    }

    @Inject
    protected x(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    private static boolean llIIIIIIIIlIIll(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean ab() {
        if (llIIIIIIIIlIlIl(this.cf.getTickCount() - this.ck, lIlIllIIIIlIl[8])) {
            ?? r0 = lIlIllIIIIlIl[0];
            "".length();
            return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIllIIIIlIl[1];
    }

    private static void W() {
        if (llIIIIIIIIlIIll(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            TeleportLoader.enterHouse();
            "".length();
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
            return;
        }
        int[] iArr = new int[lIlIllIIIIlIl[0]];
        iArr[lIlIllIIIIlIl[1]] = lIlIllIIIIlIl[2];
        if (llIIIIIIIIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIllIIIIlIl[0]];
            iArr2[lIlIllIIIIlIl[1]] = lIlIllIIIIlIl[2];
            Inventory.getFirst(iArr2).interact(lIlIllIIIIlII[lIlIllIIIIlIl[1]]);
        }
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        if (llIIIIIIIIllIII(hitsplatApplied.getActor(), Players.getLocal())) {
            this.ck = this.cf.getTickCount();
        }
    }

    private static void llIIIIIIIIlIIIl() {
        lIlIllIIIIlII = new String[lIlIllIIIIlIl[11]];
        lIlIllIIIIlII[lIlIllIIIIlIl[1]] = llIIIIIIIIIlllI("i29/ThftPawWEQEwG2l/XQ==", "rPNJt");
        lIlIllIIIIlII[lIlIllIIIIlIl[0]] = llIIIIIIIIIllll("HCgRJCo0I1QyKjQnEWE0P2QQLi19MFQpIiwhVCcsNSBUNSs7MFQ2JnoqESQn", "ZDtAC");
        lIlIllIIIIlII[lIlIllIIIIlIl[3]] = llIIIIIIIIIlllI("BcMqhPK51Sh1ZrP67BX9YM44FOAn6CC6TCtQW/PtbH3b1LUTyJb4vP3KpRQvW5IL", "UbexJ");
        lIlIllIIIIlII[lIlIllIIIIlIl[4]] = llIIIIIIIIlIIII("6jQiWAxiTIv7P2EYtP/LArGv1Ir+m409rSq5ckpHCh5d6cQNGynrwA==", "XiExF");
        lIlIllIIIIlII[lIlIllIIIIlIl[5]] = llIIIIIIIIlIIII("gv97puEsoTGYV2Cwd478Bf1gC5ixB54DHjXncTXOlcpIn24bwkJZmpg60Fu7R6Zb", "lYChc");
        lIlIllIIIIlII[lIlIllIIIIlIl[8]] = llIIIIIIIIlIIII("7Uj/H982OEM=", "qJlUM");
        lIlIllIIIIlII[lIlIllIIIIlIl[9]] = llIIIIIIIIIlllI("vpRDlz0UhIT7E7S46qH0bg==", "yIakt");
        lIlIllIIIIlII[lIlIllIIIIlIl[10]] = llIIIIIIIIlIIII("MFeOVPTc+/k=", "fPMPv");
    }

    private static boolean llIIIIIIIIlIlIl(int i2, int i3) {
        return i2 > i3;
    }

    private static String llIIIIIIIIlIIII(String llllllllllllllIllIlIIlllIlIlllII, String llllllllllllllIllIlIIlllIlIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlllIlIlllIl.getBytes(StandardCharsets.UTF_8)), lIlIllIIIIlIl[11]), "DES");
            Cipher llllllllllllllIllIlIIlllIllIIIII = Cipher.getInstance("DES");
            llllllllllllllIllIlIIlllIllIIIII.init(lIlIllIIIIlIl[3], secretKeySpec);
            return new String(llllllllllllllIllIlIIlllIllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlllIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIlllIlIlllll) {
            llllllllllllllIllIlIIlllIlIlllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        int i2 = lIlIllIIIIlIl[1];
        if (llIIIIIIIIlIlII(X() ? 1 : 0)) {
            Log.info(lIlIllIIIIlII[lIlIllIIIIlIl[0]]);
            i2 = lIlIllIIIIlIl[0];
        }
        if (llIIIIIIIIlIlII(Y() ? 1 : 0)) {
            Log.info(lIlIllIIIIlII[lIlIllIIIIlIl[3]]);
            i2 = lIlIllIIIIlIl[0];
        }
        if (llIIIIIIIIlIlII(Z() ? 1 : 0)) {
            Log.info(lIlIllIIIIlII[lIlIllIIIIlIl[4]]);
            i2 = lIlIllIIIIlIl[0];
        }
        if (llIIIIIIIIlIIll(aa() ? 1 : 0)) {
            Log.info(lIlIllIIIIlII[lIlIllIIIIlIl[5]]);
            i2 = lIlIllIIIIlIl[0];
        }
        if (llIIIIIIIIlIlII(i2)) {
            return lIlIllIIIIlIl[1];
        }
        W();
        this.x.a((boolean) lIlIllIIIIlIl[0]);
        return lIlIllIIIIlIl[0];
    }

    private static boolean llIIIIIIIIlIlll(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean llIIIIIIIIllIIl(int i2, int i3) {
        return i2 < i3;
    }
}
