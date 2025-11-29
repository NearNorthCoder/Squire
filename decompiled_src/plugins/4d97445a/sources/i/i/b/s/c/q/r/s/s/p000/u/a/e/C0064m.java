package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Checking State", priority = 2147482310)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.m  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/m.class */
public class C0064m extends Task {
    private final /* synthetic */ C0000a aq;
    private static /* synthetic */ int[] llIllllII;
    private static /* synthetic */ String[] llIlllIll;
    private final /* synthetic */ SquireCerberus ao;
    private final /* synthetic */ SquireCerberusConfig ap;

    private static boolean lIlllllllll(int i2) {
        return i2 == 0;
    }

    @Inject
    public C0064m(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, C0000a c0000a) {
        this.ao = squireCerberus;
        this.ap = squireCerberusConfig;
        this.aq = c0000a;
    }

    private static void lIllllllIlI() {
        llIllllII = new int[12];
        llIllllII[0] = (36 ^ 105) & ((15 ^ 66) ^ (-1));
        llIllllII[1] = " ".length();
        llIllllII[2] = (-((-3555) & 32759)) & (-129) & 31645;
        llIllllII[3] = "  ".length();
        llIllllII[4] = "   ".length();
        llIllllII[5] = 161 ^ 165;
        llIllllII[6] = 97 ^ 100;
        llIllllII[7] = 96 ^ 102;
        llIllllII[8] = 163 ^ 164;
        llIllllII[9] = 93 ^ 85;
        llIllllII[10] = (41 ^ 97) ^ (47 ^ 110);
        llIllllII[11] = (103 ^ 86) ^ (142 ^ 181);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    public boolean run() {
        if (!lIllllllIll(Game.getState(), GameState.LOGGED_IN) && !lIlllllllII(Players.getLocal())) {
            int[] iArr = new int[llIllllII[1]];
            iArr[llIllllII[0]] = llIllllII[2];
            Item first = Inventory.getFirst(iArr);
            if (lIlllllllIl(first)) {
                first.interact(llIlllIll[llIllllII[0]]);
            }
            if (!lIllllllllI(this.ao.r() ? 1 : 0) && !lIlllllllIl(this.aq.k()) && !lIlllllllll(this.ao.p().isEmpty() ? 1 : 0)) {
                if (llIIIIIIIII(Inventory.getCount(item -> {
                    if (lIlllllllll(item.getName().contains(llIlllIll[llIllllII[9]]) ? 1 : 0)) {
                        String[] strArr = new String[llIllllII[1]];
                        strArr[llIllllII[0]] = llIlllIll[llIllllII[10]];
                        if (lIllllllllI(item.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = llIllllII[1];
                            "".length();
                            return (154 ^ 158) <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llIllllII[0];
                }), this.ap.bankUnderAmount())) {
                    Log.info(llIlllIll[llIllllII[1]]);
                    this.ao.b((boolean) llIllllII[1]);
                }
                Item first2 = Inventory.getFirst(item2 -> {
                    if (lIlllllllll(item2.getName().toLowerCase().contains(llIlllIll[llIllllII[6]]) ? 1 : 0)) {
                        if (lIllllllllI(item2.getName().toLowerCase().contains(llIlllIll[llIllllII[7]]) ? 1 : 0)) {
                            String[] strArr = new String[llIllllII[1]];
                            strArr[llIllllII[0]] = llIlllIll[llIllllII[8]];
                        }
                        return llIllllII[0];
                    }
                    ?? r0 = llIllllII[1];
                    "".length();
                    return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                });
                if (lIlllllllll(Prayers.getPoints()) && lIlllllllII(first2)) {
                    Log.info(llIlllIll[llIllllII[3]]);
                    this.ao.b((boolean) llIllllII[1]);
                }
                if (lIlllllllII(Inventory.getFirst(item3 -> {
                    String[] strArr = new String[llIllllII[1]];
                    strArr[llIllllII[0]] = llIlllIll[llIllllII[5]];
                    return item3.hasAction(strArr);
                })) && llIIIIIIIII(Combat.getCurrentHealth(), this.ap.eatAtHealth())) {
                    Log.info(llIlllIll[llIllllII[4]]);
                    this.ao.b((boolean) llIllllII[1]);
                }
                return llIllllII[0];
            }
            return llIllllII[0];
        }
        return llIllllII[0];
    }

    private static boolean lIllllllllI(int i2) {
        return i2 != 0;
    }

    private static boolean lIlllllllIl(Object obj) {
        return obj != null;
    }

    private static String lIlllllIllI(String lIlIllIlllIllII, String lIlIllIlllIlIll) {
        try {
            SecretKeySpec lIlIllIlllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIlllIlIll.getBytes(StandardCharsets.UTF_8)), llIllllII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllllII[3], lIlIllIlllIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIllIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIlllIllIl) {
            lIlIllIlllIllIl.printStackTrace();
            return null;
        }
    }

    private static void lIllllllIIl() {
        llIlllIll = new String[llIllllII[11]];
        llIlllIll[llIllllII[0]] = lIlllllIllI("Yn3uRRDyIGM=", "ciXkG");
        llIlllIll[llIllllII[1]] = lIlllllIlll("cWowJn9Ch8moRYqynwFy8NQ23RRc7tSwmhi8Id5aAPc=", "QdfUI");
        llIlllIll[llIllllII[3]] = lIlllllIlll("70Dz64E9/myvq6KWxTIn4bJy/yj7nSTuv7EUu55rD5Q=", "ZRDzd");
        llIlllIll[llIllllII[4]] = lIlllllIlll("Av94Wti60nQlrk3jLqhy6H0nYHB2H+A9+v1CnGWYY9s=", "ckzbw");
        llIlllIll[llIllllII[5]] = lIlllllIllI("3OoKdfCh8yA=", "VovSS");
        llIlllIll[llIllllII[6]] = lIllllllIII("KhAiNiwo", "ZbCOI");
        llIlllIll[llIllllII[7]] = lIlllllIllI("U0dkRKdmxxA=", "vHGSp");
        llIlllIll[llIllllII[8]] = lIllllllIII("Mzc4PQQ=", "wEQSo");
        llIlllIll[llIllllII[9]] = lIllllllIII("NAQXJTAVUQohMA==", "gqzHU");
        llIlllIll[llIllllII[10]] = lIlllllIlll("RtcehYtE9aE=", "uzhDu");
    }

    private static boolean lIllllllIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lIllllllIlI();
        lIllllllIIl();
    }

    private static boolean llIIIIIIIII(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlllllIlll(String lIlIlllIIIlIIIl, String lIlIlllIIIlIIII) {
        try {
            SecretKeySpec lIlIlllIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlllIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllllII[3], lIlIlllIIIlIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlllIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlllIIIlIIlI) {
            lIlIlllIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllllII(Object obj) {
        return obj == null;
    }

    private static String lIllllllIII(String lIlIlllIIIIIIIl, String lIlIlllIIIIIIII) {
        String str = new String(Base64.getDecoder().decode(lIlIlllIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIlllIIIIIIII.toCharArray();
        int lIlIllIllllllIl = llIllllII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llIllllII[0];
        while (llIIIIIIIII(i2, length)) {
            char lIlIlllIIIIIIlI = charArray2[i2];
            sb.append((char) (lIlIlllIIIIIIlI ^ charArray[lIlIllIllllllIl % charArray.length]));
            "".length();
            lIlIllIllllllIl++;
            i2++;
            "".length();
            if (((45 ^ 0) & ((86 ^ 123) ^ (-1))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
