package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Enter cave Task", priority = 10)
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.j  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/j.class */
public class j extends Task {
    private final /* synthetic */ SquireFightCavesConfig X;
    private static /* synthetic */ String[] llIIlIIIlIIl;
    private final /* synthetic */ f W;
    private static /* synthetic */ int[] llIIlIIIlIlI;
    public static /* synthetic */ long aa;
    public static /* synthetic */ int ab;
    private final /* synthetic */ n Y;
    /* synthetic */ WorldArea R = new WorldArea(llIIlIIIlIlI[0], llIIlIIIlIlI[1], llIIlIIIlIlI[2], llIIlIIIlIlI[3], llIIlIIIlIlI[4]);
    /* synthetic */ WorldPoint Z = new WorldPoint(llIIlIIIlIlI[5], llIIlIIIlIlI[6], llIIlIIIlIlI[4]);

    private static boolean lllllIIIIlllIl(int i, int i2) {
        return i <= i2;
    }

    private static void lllllIIIIlIlll() {
        llIIlIIIlIlI = new int[14];
        llIIlIIIlIlI[0] = (-690) & 3063;
        llIIlIIIlIlI[1] = (-((-1542) & 12215)) & (-16449) & 32245;
        llIIlIIIlIlI[2] = (((225 ^ 193) + (65 ^ 92)) - (-(51 ^ 37))) + (17 ^ 92);
        llIIlIIIlIlI[3] = 221 ^ 150;
        llIIlIIIlIlI[4] = ((((91 + 54) - 125) + 108) ^ (((104 + 23) - 79) + 109)) & (((1 ^ 95) ^ (57 ^ 122)) ^ (-" ".length()));
        llIIlIIIlIlI[5] = (-29289) & 31727;
        llIIlIIIlIlI[6] = (-18885) & 24053;
        llIIlIIIlIlI[7] = " ".length();
        llIIlIIIlIlI[8] = "  ".length();
        llIIlIIIlIlI[9] = "   ".length();
        llIIlIIIlIlI[10] = 26 ^ 30;
        llIIlIIIlIlI[11] = (((85 + 32) - 71) + 116) ^ (((32 + 84) - (-44)) + 8);
        llIIlIIIlIlI[12] = (27 ^ 123) ^ (79 ^ 42);
        llIIlIIIlIlI[13] = (200 ^ 146) ^ (28 ^ 78);
    }

    private static boolean lllllIIIIllIIl(int i) {
        return i != 0;
    }

    private static boolean lllllIIIIlllII(Object obj) {
        return obj != null;
    }

    private static String lllllIIIIlIlIl(String lllllllllllllllIlIIllllllIIIIlll, String lllllllllllllllIlIIllllllIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllllIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllllIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIIIlIlI[8], lllllllllllllllIlIIllllllIIIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllllIIIlIII) {
            lllllllllllllllIlIIllllllIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIIllIlI(int i) {
        return i == 0;
    }

    private static String lllllIIIIlIlII(String lllllllllllllllIlIIlllllIllllIlI, String lllllllllllllllIlIIlllllIllllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllllIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllllIllllIIl.getBytes(StandardCharsets.UTF_8)), llIIlIIIlIlI[13]), "DES");
            Cipher lllllllllllllllIlIIlllllIlllllII = Cipher.getInstance("DES");
            lllllllllllllllIlIIlllllIlllllII.init(llIIlIIIlIlI[8], lllllllllllllllIlIIlllllIlllllIl);
            return new String(lllllllllllllllIlIIlllllIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllllIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllllIllllIll) {
            lllllllllllllllIlIIlllllIllllIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (lllllIIIIllIIl(this.R.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIIllIlI(x().needsToBank() ? 1 : 0) && (!lllllIIIIllIIl(SquireFightCavesPlugin.g ? 1 : 0) || !lllllIIIIllIIl(this.X.stopAfterCape() ? 1 : 0))) {
            if (lllllIIIIllIll(lllllIIIIllIII(System.currentTimeMillis(), aa + 120000)) && lllllIIIIllIIl(SquireFightCavesPlugin.f ? 1 : 0)) {
                SquireFightCavesPlugin.f0h = llIIlIIIlIIl[llIIlIIIlIlI[4]];
                return llIIlIIIlIlI[4];
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lllllIIIIllIIl(tileObject.getName().contains(llIIlIIIlIIl[llIIlIIIlIlI[9]]) ? 1 : 0)) {
                    String[] strArr = new String[llIIlIIIlIlI[7]];
                    strArr[llIIlIIIlIlI[4]] = llIIlIIIlIIl[llIIlIIIlIlI[10]];
                    if (lllllIIIIllIIl(tileObject.hasAction(strArr) ? 1 : 0) && lllllIIIIlllIl(tileObject.getWorldLocation().distanceTo(this.Z), llIIlIIIlIlI[11])) {
                        ?? r0 = llIIlIIIlIlI[7];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return llIIlIIIlIlI[4];
            });
            if (lllllIIIIlllII(nearest)) {
                SquireFightCavesPlugin.f0h = llIIlIIIlIIl[llIIlIIIlIlI[7]];
                nearest.interact(llIIlIIIlIIl[llIIlIIIlIlI[8]]);
                n.al = null;
                SquireFightCavesPlugin.f = llIIlIIIlIlI[4];
                ab = llIIlIIIlIlI[4];
                return llIIlIIIlIlI[4];
            }
            return llIIlIIIlIlI[4];
        }
        return llIIlIIIlIlI[4];
    }

    protected BankLoadout x() {
        return (BankLoadout) this.X.bankLoadout().selected(BankLoadout.class);
    }

    private static boolean lllllIIIIllIll(int i) {
        return i > 0;
    }

    private static void lllllIIIIlIllI() {
        llIIlIIIlIIl = new String[llIIlIIIlIlI[12]];
        llIIlIIIlIIl[llIIlIIIlIlI[4]] = lllllIIIIlIIll("JCkMLSJBJBk+NUEkFyc8QSMXPz4=", "aGxHP");
        llIIlIIIlIIl[llIIlIIIlIlI[7]] = lllllIIIIlIlII("uafkadn4gxHrkyHhhXNsvg==", "trDeg");
        llIIlIIIlIIl[llIIlIIIlIlI[8]] = lllllIIIIlIlIl("3xmHGNA4FZ8=", "aXAAP");
        llIIlIIIlIIl[llIIlIIIlIlI[9]] = lllllIIIIlIlII("uXhHFytSblovlPd0cGZiRA==", "Crxli");
        llIIlIIIlIIl[llIIlIIIlIlI[10]] = lllllIIIIlIlIl("AOFke7HA7Mk=", "YFtjy");
    }

    private static int lllllIIIIllIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    static {
        lllllIIIIlIlll();
        lllllIIIIlIllI();
        aa = System.currentTimeMillis();
    }

    private static String lllllIIIIlIIll(String lllllllllllllllIlIIlllllIllIlIlI, String lllllllllllllllIlIIlllllIllIlIIl) {
        String lllllllllllllllIlIIlllllIllIlIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllllIllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlllllIllIlIIl.toCharArray();
        int lllllllllllllllIlIIlllllIllIIllI = llIIlIIIlIlI[4];
        char[] charArray2 = lllllllllllllllIlIIlllllIllIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIIlIlI[4];
        while (lllllIIIIllllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIlllllIllIIllI % charArray.length]));
            "".length();
            lllllllllllllllIlIIlllllIllIIllI++;
            i++;
            "".length();
            if ("   ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public j(f fVar, SquireFightCavesConfig squireFightCavesConfig, n nVar) {
        this.W = fVar;
        this.X = squireFightCavesConfig;
        this.Y = nVar;
    }

    private static boolean lllllIIIIllllI(int i, int i2) {
        return i < i2;
    }
}
