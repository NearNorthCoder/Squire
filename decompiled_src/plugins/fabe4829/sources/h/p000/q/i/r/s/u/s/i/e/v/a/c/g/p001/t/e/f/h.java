package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Bank Task", priority = 10)
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.h  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/h.class */
public class h extends Task {
    private final /* synthetic */ f T;
    private static /* synthetic */ String[] llIIIlllIlll;
    private final /* synthetic */ n V;
    private static /* synthetic */ int[] llIIIlllllII;
    private final /* synthetic */ SquireFightCavesConfig U;
    /* synthetic */ WorldArea R = new WorldArea(llIIIlllllII[0], llIIIlllllII[1], llIIIlllllII[2], llIIIlllllII[3], llIIIlllllII[4]);
    /* synthetic */ WorldPoint S = new WorldPoint(llIIIlllllII[5], llIIIlllllII[6], llIIIlllllII[4]);

    @Inject
    public h(f fVar, SquireFightCavesConfig squireFightCavesConfig, n nVar) {
        this.T = fVar;
        this.U = squireFightCavesConfig;
        this.V = nVar;
    }

    private static boolean llllIlllIllIII(Object obj) {
        return obj != null;
    }

    protected BankLoadout x() {
        return (BankLoadout) this.U.bankLoadout().selected(BankLoadout.class);
    }

    private static String llllIlllIIllII(String lllllllllllllllIlIlIIIIllllllIII, String lllllllllllllllIlIlIIIIlllllIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIllllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlIIIIlllllIlIl = lllllllllllllllIlIlIIIIlllllIlll.toCharArray();
        int lllllllllllllllIlIlIIIIlllllIlII = llIIIlllllII[4];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIlIlIIIIllllIllII = llIIIlllllII[4];
        while (llllIlllIlIlII(lllllllllllllllIlIlIIIIllllIllII, length)) {
            sb.append((char) (charArray[lllllllllllllllIlIlIIIIllllIllII] ^ lllllllllllllllIlIlIIIIlllllIlIl[lllllllllllllllIlIlIIIIlllllIlII % lllllllllllllllIlIlIIIIlllllIlIl.length]));
            "".length();
            lllllllllllllllIlIlIIIIlllllIlII++;
            lllllllllllllllIlIlIIIIllllIllII++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llllIlllIlIlII(int i, int i2) {
        return i < i2;
    }

    static {
        llllIlllIlIIlI();
        llllIlllIIllIl();
    }

    private static boolean llllIlllIllIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    public boolean run() {
        if (llllIlllIlIIll(this.R.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlllIlIIll(x().needsToBank() ? 1 : 0) && (!llllIlllIlIIll(SquireFightCavesPlugin.g ? 1 : 0) || !llllIlllIlIIll(this.U.stopAfterCape() ? 1 : 0))) {
            if (llllIlllIlIIll(SquireFightCavesPlugin.f ? 1 : 0) && llllIlllIlIlII(j.ab, llIIIlllllII[7])) {
                j.aa = System.currentTimeMillis();
                j.ab += llIIIlllllII[7];
            }
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            if (llllIlllIlIlIl(worldLocation.distanceTo(this.S), llIIIlllllII[8])) {
                SquireFightCavesPlugin.f0h = llIIIlllIlll[llIIIlllllII[4]];
                Movement.walkTo(this.S);
                "".length();
                return llIIIlllllII[4];
            }
            if (llllIlllIlIllI(worldLocation.distanceTo(this.S), llIIIlllllII[8])) {
                if (llllIlllIlIlll(Bank.isOpen() ? 1 : 0)) {
                    int[] iArr = new int[llIIIlllllII[7]];
                    iArr[llIIIlllllII[4]] = llIIIlllllII[9];
                    NPC nearest = NPCs.getNearest(iArr);
                    if (llllIlllIllIII(nearest)) {
                        SquireFightCavesPlugin.f0h = llIIIlllIlll[llIIIlllllII[7]];
                        nearest.interact(llIIIlllIlll[llIIIlllllII[10]]);
                        return llIIIlllllII[4];
                    }
                }
                if (llllIlllIllIIl(x())) {
                    Log.error(llIIIlllIlll[llIIIlllllII[11]]);
                    return llIIIlllllII[4];
                } else if (llllIlllIlIlll(x().needsToBank() ? 1 : 0)) {
                    SquireFightCavesPlugin.f0h = llIIIlllIlll[llIIIlllllII[12]];
                    Bank.close();
                    sleep(llIIIlllllII[11]);
                    return llIIIlllllII[4];
                } else if (llllIlllIlIlll(BankLoadouts.withdrawWithRetries(x(), llIIIlllllII[13]).booleanValue() ? 1 : 0)) {
                    Log.info(llIIIlllIlll[llIIIlllllII[13]]);
                    return llIIIlllllII[4];
                }
            }
            return llIIIlllllII[4];
        }
        return llIIIlllllII[4];
    }

    private static String llllIlllIIlIlI(String lllllllllllllllIlIlIIIIllllIIIll, String lllllllllllllllIlIlIIIIllllIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIllllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIllllIIIlI.getBytes(StandardCharsets.UTF_8)), llIIIlllllII[15]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIlllllII[10], lllllllllllllllIlIlIIIIllllIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIIllllIIlII) {
            lllllllllllllllIlIlIIIIllllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlllIlIlll(int i) {
        return i == 0;
    }

    private static void llllIlllIIllIl() {
        llIIIlllIlll = new String[llIIIlllllII[14]];
        llIIIlllIlll[llIIIlllllII[4]] = llllIlllIIlIlI("n35yb1CLtm8+f+UO8B/gBvx5yga7tqsB", "XRQyx");
        llIIIlllIlll[llIIIlllllII[7]] = llllIlllIIlIll("Sl/zkQ9YQKDxT3RetaMalw==", "zGMBM");
        llIIIlllIlll[llIIIlllllII[10]] = llllIlllIIllII("FgU5Aw==", "TdWhS");
        llIIIlllIlll[llIIIlllllII[11]] = llllIlllIIlIlI("WhRsrwlVU3a4gL32NjnNM3GeBD48BAXZ4OXyjogU4q0=", "dkBgC");
        llIIIlllIlll[llIIIlllllII[12]] = llllIlllIIlIlI("gjd8+FiWORanKuja2NxXrA==", "sDmju");
        llIIIlllIlll[llIIIlllllII[13]] = llllIlllIIlIll("2k03QDFkPocmqpQaGoqg+mBmtAg/FwjXLC93uyJi/uoSvdNmIHFqmfFrPygtb2w8", "AuKeJ");
    }

    private static boolean llllIlllIlIIll(int i) {
        return i != 0;
    }

    private static boolean llllIlllIlIllI(int i, int i2) {
        return i <= i2;
    }

    private static String llllIlllIIlIll(String lllllllllllllllIlIlIIIlIIIIIlIII, String lllllllllllllllIlIlIIIlIIIIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIlIIIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlIIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIlllllII[10], lllllllllllllllIlIlIIIlIIIIIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIlIIIIIlIIl) {
            lllllllllllllllIlIlIIIlIIIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlllIlIlIl(int i, int i2) {
        return i > i2;
    }

    private static void llllIlllIlIIlI() {
        llIIIlllllII = new int[16];
        llIIIlllllII[0] = (-9353) & 11726;
        llIIIlllllII[1] = (-((-33) & 2156)) & (-16433) & 23679;
        llIIIlllllII[2] = ((12 + 77) - 35) + 106;
        llIIIlllllII[3] = (36 ^ 27) ^ (239 ^ 155);
        llIIIlllllII[4] = ((((5 + 148) - 65) + 104) ^ (((115 + 79) - 115) + 62)) & (((((207 + 108) - 270) + 205) ^ (((14 + 6) - (-69)) + 94)) ^ (-" ".length()));
        llIIIlllllII[5] = (-((-19461) & 23639)) & (-25089) & 31711;
        llIIIlllllII[6] = (-((-17445) & 25829)) & (-16645) & 30206;
        llIIIlllllII[7] = " ".length();
        llIIIlllllII[8] = 100 ^ 107;
        llIIIlllllII[9] = (-((-6297) & 14491)) & (-1) & 15871;
        llIIIlllllII[10] = "  ".length();
        llIIIlllllII[11] = "   ".length();
        llIIIlllllII[12] = (235 ^ 174) ^ (208 ^ 145);
        llIIIlllllII[13] = (232 ^ 172) ^ (48 ^ 113);
        llIIIlllllII[14] = 141 ^ 139;
        llIIIlllllII[15] = 45 ^ 37;
    }
}
