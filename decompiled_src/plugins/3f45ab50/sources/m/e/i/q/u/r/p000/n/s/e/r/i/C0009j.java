package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Logging out")
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.j  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/j.class */
public class C0009j extends Task {
    private final /* synthetic */ SquireMinerConfig q;
    private final /* synthetic */ SquireMiner p;
    private static /* synthetic */ String[] lllllIlIlIll;
    private final /* synthetic */ int[] r;
    private static /* synthetic */ int[] lllllIlIllII;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
        if (lIIlIIllIllIlII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (lIIlIIllIllIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean n() {
        if (lIIlIIllIllIlII(Inventory.contains(this.r) ? 1 : 0)) {
            int[] iArr = new int[lllllIlIllII[3]];
            iArr[lllllIlIllII[1]] = lllllIlIllII[15];
            if (lIIlIIllIllIlII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllllIlIllII[3]];
                iArr2[lllllIlIllII[1]] = lllllIlIllII[16];
            }
        }
        int[] iArr3 = new int[lllllIlIllII[3]];
        iArr3[lllllIlIllII[1]] = lllllIlIllII[17];
        if (lIIlIIllIllIlII(Inventory.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lllllIlIllII[3]];
            iArr4[lllllIlIllII[1]] = lllllIlIllII[18];
            if (lIIlIIllIllIlIl(Inventory.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lllllIlIllII[3]];
                iArr5[lllllIlIllII[1]] = lllllIlIllII[19];
            }
            ?? r0 = lllllIlIllII[3];
            "".length();
            return (((((96 + 88) - 152) + 103) ^ (((68 + 120) - 60) + 11)) & (((174 ^ 131) ^ (180 ^ 149)) ^ (-" ".length()))) != 0 ? ((134 ^ 187) ^ (151 ^ 161)) & (((10 ^ 6) ^ (19 ^ 20)) ^ (-" ".length())) : r0;
        }
        return lllllIlIllII[1];
    }

    private static boolean lIIlIIllIllIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Inject
    public C0009j(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        int[] iArr = new int[lllllIlIllII[0]];
        iArr[lllllIlIllII[1]] = lllllIlIllII[2];
        iArr[lllllIlIllII[3]] = lllllIlIllII[4];
        iArr[lllllIlIllII[5]] = lllllIlIllII[6];
        iArr[lllllIlIllII[7]] = lllllIlIllII[8];
        this.r = iArr;
        this.p = squireMiner;
        this.q = squireMinerConfig;
    }

    private static boolean lIIlIIllIllIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    public boolean run() {
        if (lIIlIIllIllIIll(Game.getState(), GameState.LOGGED_IN)) {
            return lllllIlIllII[1];
        }
        if (lIIlIIllIllIIll(this.q.activity(), EnumC0000a.GRANITE) && lIIlIIllIllIIll(this.q.activity(), EnumC0000a.SANDSTONE)) {
            return lllllIlIllII[1];
        }
        if (lIIlIIllIllIlII(this.q.waterskins())) {
            int[] iArr = new int[lllllIlIllII[3]];
            iArr[lllllIlIllII[1]] = lllllIlIllII[9];
            if (!lIIlIIllIllIlII(Equipment.contains(iArr) ? 1 : 0)) {
                if (lIIlIIllIllIlIl(n() ? 1 : 0)) {
                    System.out.println(lllllIlIlIll[lllllIlIllII[1]]);
                    return lllllIlIllII[1];
                } else if (lIIlIIllIllIlII(this.q.humidify() ? 1 : 0) && lIIlIIllIllIlIl(Magic.canCast(SpellBook.Lunar.HUMIDIFY) ? 1 : 0)) {
                    System.out.println(lllllIlIlIll[lllllIlIllII[3]]);
                    Game.logout();
                    return lllllIlIllII[3];
                } else {
                    if (lIIlIIllIllIlIl(this.q.humidify() ? 1 : 0)) {
                        int[] iArr2 = new int[lllllIlIllII[3]];
                        iArr2[lllllIlIllII[1]] = lllllIlIllII[10];
                        if (lIIlIIllIllIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lllllIlIllII[0]];
                            iArr3[lllllIlIllII[1]] = lllllIlIllII[11];
                            iArr3[lllllIlIllII[3]] = lllllIlIllII[12];
                            iArr3[lllllIlIllII[5]] = lllllIlIllII[13];
                            iArr3[lllllIlIllII[7]] = lllllIlIllII[14];
                            if (lIIlIIllIllIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                                System.out.println(lllllIlIlIll[lllllIlIllII[5]]);
                                Game.logout();
                                return lllllIlIllII[3];
                            }
                        }
                    }
                    return lllllIlIllII[1];
                }
            }
        }
        return lllllIlIllII[1];
    }

    private static String lIIlIIllIlIllll(String lllllllllllllllIIlIIlIlIIlIllllI, String lllllllllllllllIIlIIlIlIIlIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIlIIlIlllIl.getBytes(StandardCharsets.UTF_8)), lllllIlIllII[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIlIllII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIlIIlIlllll) {
            lllllllllllllllIIlIIlIlIIlIlllll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllIllIIII(String lllllllllllllllIIlIIlIlIIlIlIIIl, String lllllllllllllllIIlIIlIlIIlIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIlIIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlIlIIlIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlIlIIlIlIIll.init(lllllIlIllII[5], secretKeySpec);
            return new String(lllllllllllllllIIlIIlIlIIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIlIIlIlIIlI) {
            lllllllllllllllIIlIIlIlIIlIlIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIllIllIIlI() {
        lllllIlIllII = new int[21];
        lllllIlIllII[0] = (14 ^ 117) ^ (((5 + 102) - (-20)) + 0);
        lllllIlIllII[1] = ((101 ^ 51) ^ (47 ^ 109)) & (((((104 + 188) - 252) + 172) ^ (((17 + 89) - 31) + 117)) ^ (-" ".length()));
        lllllIlIllII[2] = (((143 ^ 129) + (((186 + 72) - 81) + 32)) - (241 ^ 198)) + (38 ^ 119);
        lllllIlIllII[3] = " ".length();
        lllllIlIllII[4] = (((((57 + 22) - 39) + 90) + (((43 + 53) - (-54)) + 2)) - (((85 + 146) - 65) + 23)) + ((107 + 129) - 89) + 11;
        lllllIlIllII[5] = "  ".length();
        lllllIlIllII[6] = (((130 ^ 177) + (183 ^ 139)) - (-(132 ^ 144))) + (193 ^ 187);
        lllllIlIllII[7] = "   ".length();
        lllllIlIllII[8] = ((243 + 110) - 231) + 133;
        lllllIlIllII[9] = (-((-32217) & 32735)) & (-5281) & 32767;
        lllllIlIllII[10] = (-((-16469) & 30813)) & (-1029) & 16367;
        lllllIlIllII[11] = (-((-11811) & 32499)) & (-8201) & 30717;
        lllllIlIllII[12] = (-14405) & 16231;
        lllllIlIllII[13] = (-19) & 1843;
        lllllIlIllII[14] = (-26657) & 28479;
        lllllIlIllII[15] = (-26697) & 28635;
        lllllIlIllII[16] = ((94 + 46) - 104) + 197;
        lllllIlIllII[17] = (-4170) & 5115;
        lllllIlIllII[18] = (-((-5285) & 6055)) & (-17473) & 24575;
        lllllIlIllII[19] = (-((-2493) & 19454)) & (-1025) & 24317;
        lllllIlIllII[20] = 162 ^ 170;
    }

    private static boolean lIIlIIllIllIlIl(int i) {
        return i == 0;
    }

    static {
        lIIlIIllIllIIlI();
        lIIlIIllIllIIIl();
    }

    private static void lIIlIIllIllIIIl() {
        lllllIlIlIll = new String[lllllIlIllII[7]];
        lllllIlIlIll[lllllIlIllII[1]] = lIIlIIllIlIllll("dscArUnxuVu4uY9q/bUSs24KmMf65OsXYPi7KC6gMUapbrCwaqpaSg==", "YbsxO");
        lllllIlIlIll[lllllIlIllII[3]] = lIIlIIllIllIIII("26mUL9tjeLJhBf5oApObVAhihGkWvDGiN008hxC4uSSESgcOWv+c1Ko34uD2cMMd", "WRapT");
        lllllIlIlIll[lllllIlIllII[5]] = lIIlIIllIllIIII("a4uUzxMmq8DQmTAQ5ErL3y77p+JQ42SarUTsEjN7xP6bNNlt5qvhJeVOnZ6TN5s5sp6ZDHrdaVj/8t1z6De10g==", "dEYEm");
    }
}
