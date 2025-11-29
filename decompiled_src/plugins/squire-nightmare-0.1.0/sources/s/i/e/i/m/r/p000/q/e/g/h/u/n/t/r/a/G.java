package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Emergency Teleport out", priority = Integer.MAX_VALUE)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.G  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/G.class */
public class G extends Task {
    private static final /* synthetic */ Logger da;
    private static /* synthetic */ int[] llllIllIllII;
    private final /* synthetic */ C0011h de;
    private static final /* synthetic */ int db;
    private static /* synthetic */ String[] llllIllIlIll;
    private final /* synthetic */ SquireNightmareConfig dd;
    private final /* synthetic */ SquireNightmarePlugin dc;

    private static void lIIlIIIllIlIIlI() {
        llllIllIlIll = new String[llllIllIllII[13]];
        llllIllIlIll[llllIllIllII[0]] = lIIlIIIllIIllll("axLrRSxXh90=", "MpKPe");
        llllIllIlIll[llllIllIllII[2]] = lIIlIIIllIIllll("aHie2S5HEA3rjqGl4LL0DBqf3nSOGMDvL/aRXJKJfw9VwR53+tFBzRiUhILG5+HR3QyMdX33YHuxx7QGZv0wr60cyVHdHlsUwQuJ4lDfC7Wx4LQ1sSQepyF7WK6Sme8eb1xFxo6bkosoOy2cgmYBoA==", "FKXNI");
        llllIllIlIll[llllIllIllII[6]] = lIIlIIIllIlIIII("HQ0EKCshLQcuIBItBSgpKTodEGNmHwxqKyNoBjgtZicPbT8pJw1tOCgsSTo8YToMbTcpPEkoLyMmSSQ3ZjwBKHkgIQcsNWY4ASwqI2RJOTwqLRkiKzIhByp5KT0dYw==", "FHiMY");
        llllIllIlIll[llllIllIllII[1]] = lIIlIIIllIlIIII("JRxEKicqCiEoTks2CR8HDDYKGQxLJwEWEBs8Fg4cBTREFQAfcxAVVQkyChE=", "kSdzu");
        llllIllIlIll[llllIllIllII[7]] = lIIlIIIllIlIIIl("FXfOURNQshU=", "zFggQ");
        llllIllIlIll[llllIllIllII[8]] = lIIlIIIllIIllll("3jg50o37sP4=", "oCaty");
        llllIllIlIll[llllIllIllII[9]] = lIIlIIIllIlIIII("NDMdHAAw", "GRsze");
        llllIllIlIll[llllIllIllII[10]] = lIIlIIIllIlIIII("Bh0KDj4iEAMAKyc=", "UqokN");
        llllIllIlIll[llllIllIllII[12]] = lIIlIIIllIlIIII("AjgN", "GYyct");
    }

    private static void lIIlIIIllIlIIll() {
        llllIllIllII = new int[14];
        llllIllIllII[0] = ((77 ^ 71) ^ (100 ^ 56)) & (((211 ^ 160) ^ (35 ^ 6)) ^ (-" ".length()));
        llllIllIllII[1] = "   ".length();
        llllIllIllII[2] = " ".length();
        llllIllIllII[3] = (-18499) & 27110;
        llllIllIllII[4] = (-((-13257) & 32747)) & (-4673) & 32766;
        llllIllIllII[5] = (-17518) & 28671;
        llllIllIllII[6] = "  ".length();
        llllIllIllII[7] = (154 ^ 137) ^ (92 ^ 75);
        llllIllIllII[8] = (((112 + 77) - 149) + 157) ^ (((80 + 127) - 98) + 83);
        llllIllIllII[9] = (91 ^ 18) ^ (70 ^ 9);
        llllIllIllII[10] = (162 ^ 185) ^ (107 ^ 119);
        llllIllIllII[11] = (-((-87) & 18647)) & (-4101) & 31231;
        llllIllIllII[12] = 94 ^ 86;
        llllIllIllII[13] = (((82 + 40) - 28) + 48) ^ (((77 + 126) - 125) + 57);
    }

    private static boolean lIIlIIIllIllIlI(int i) {
        return i <= 0;
    }

    private static String lIIlIIIllIlIIIl(String lllllllllllllllIIlIlIllIlllllIIl, String lllllllllllllllIIlIlIllIlllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIlllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIllIllII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIllIlllllIlI) {
            lllllllllllllllIIlIlIllIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIllIllIIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIIlIIIllIlIIII(String lllllllllllllllIIlIlIllIlllIlIIl, String lllllllllllllllIIlIlIllIlllIlIII) {
        String lllllllllllllllIIlIlIllIlllIlIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIllIlllIIlll = new StringBuilder();
        char[] lllllllllllllllIIlIlIllIlllIIllI = lllllllllllllllIIlIlIllIlllIlIII.toCharArray();
        int lllllllllllllllIIlIlIllIlllIIlIl = llllIllIllII[0];
        char[] charArray = lllllllllllllllIIlIlIllIlllIlIIl2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIIlIlIllIllIlllIl = llllIllIllII[0];
        while (lIIlIIIllIlllII(lllllllllllllllIIlIlIllIllIlllIl, length)) {
            char lllllllllllllllIIlIlIllIllIlllII = charArray[lllllllllllllllIIlIlIllIllIlllIl];
            lllllllllllllllIIlIlIllIlllIIlll.append((char) (lllllllllllllllIIlIlIllIllIlllII ^ lllllllllllllllIIlIlIllIlllIIllI[lllllllllllllllIIlIlIllIlllIIlIl % lllllllllllllllIIlIlIllIlllIIllI.length]));
            "".length();
            lllllllllllllllIIlIlIllIlllIIlIl++;
            lllllllllllllllIIlIlIllIllIlllIl++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIllIlllIIlll);
    }

    private static boolean lIIlIIIllIlIlll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIIllIlIlIl(int i) {
        return i == 0;
    }

    static {
        lIIlIIIllIlIIll();
        lIIlIIIllIlIIlI();
        db = llllIllIllII[3];
        da = LoggerFactory.getLogger(G.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    public boolean run() {
        if (!lIIlIIIllIlIlII(this.dd.assistantMode() ? 1 : 0) && !lIIlIIIllIlIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0) && !lIIlIIIllIlIllI(Players.getLocal().getWorldLocation().getPlane(), llllIllIllII[1]) && !lIIlIIIllIlIlII(this.dc.s() ? 1 : 0)) {
            NPC d = SquireNightmarePlugin.d();
            if (lIIlIIIllIlIlll(d)) {
                return llllIllIllII[0];
            }
            String[] strArr = new String[llllIllIllII[2]];
            strArr[llllIllIllII[0]] = llllIllIlIll[llllIllIllII[0]];
            if (!lIIlIIIllIlIlII(d.hasAction(strArr) ? 1 : 0) && !lIIlIIIllIllIII(d.getAnimation(), llllIllIllII[3]) && !lIIlIIIllIllIII(d.getAnimation(), llllIllIllII[4]) && !lIIlIIIllIlIlII(d.isDead() ? 1 : 0)) {
                int count = Inventory.getCount((boolean) llllIllIllII[2], item -> {
                    String[] strArr2 = new String[llllIllIllII[2]];
                    strArr2[llllIllIllII[0]] = llllIllIlIll[llllIllIllII[12]];
                    return item.hasAction(strArr2);
                });
                if (!lIIlIIIllIllIIl(Combat.getCurrentHealth(), this.dd.hpToTeleportOut()) || !lIIlIIIllIllIlI(count)) {
                    if (lIIlIIIllIlIlll(Inventory.getFirst(item2 -> {
                        String lowerCase = item2.getName().toLowerCase();
                        if (lIIlIIIllIlIlIl(lowerCase.contains(llllIllIlIll[llllIllIllII[7]]) ? 1 : 0) && lIIlIIIllIlIlIl(lowerCase.contains(llllIllIlIll[llllIllIllII[8]]) ? 1 : 0) && !lIIlIIIllIlIlII(lowerCase.contains(llllIllIlIll[llllIllIllII[9]]) ? 1 : 0)) {
                            return llllIllIllII[0];
                        }
                        ?? r0 = llllIllIllII[2];
                        "".length();
                        return ("  ".length() & ("  ".length() ^ (-1))) != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    })) && lIIlIIIllIllIlI(Skills.getBoostedLevel(Skill.PRAYER)) && lIIlIIIllIlIllI(d.getId(), llllIllIllII[5])) {
                        Log.warn(llllIllIlIll[llllIllIllII[1]]);
                        return this.dc.m();
                    }
                    return llllIllIllII[0];
                } else if (!lIIlIIIllIllIII(d.getId(), llllIllIllII[5])) {
                    Log.warn(llllIllIlIll[llllIllIllII[6]]);
                    return this.dc.m();
                } else if (lIIlIIIllIllIll(NPCs.getNearest(npc -> {
                    if (lIIlIIIllIlIlII(npc.getName().equals(llllIllIlIll[llllIllIllII[10]]) ? 1 : 0) && lIIlIIIllIllIII(npc.getAnimation(), llllIllIllII[11])) {
                        ?? r0 = llllIllIllII[2];
                        "".length();
                        return (((173 ^ 164) ^ (141 ^ 155)) & (((36 ^ 31) ^ (3 ^ 39)) ^ (-" ".length()))) == (-" ".length()) ? ((((126 + 32) - 103) + 90) ^ (((0 + 18) - (-32)) + 131)) & (((((131 + 162) - 264) + 160) ^ (((119 + 15) - 62) + 81)) ^ (-" ".length())) : r0;
                    }
                    return llllIllIllII[0];
                }))) {
                    Log.warn(llllIllIlIll[llllIllIllII[2]]);
                    return this.dc.m();
                } else {
                    return llllIllIllII[0];
                }
            }
            return llllIllIllII[0];
        }
        return llllIllIllII[0];
    }

    private static boolean lIIlIIIllIllIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIIIllIlllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIIllIlIllI(int i, int i2) {
        return i != i2;
    }

    @Inject
    public G(SquireNightmarePlugin squireNightmarePlugin, SquireNightmareConfig squireNightmareConfig, C0011h c0011h) {
        this.dc = squireNightmarePlugin;
        this.dd = squireNightmareConfig;
        this.de = c0011h;
    }

    private static String lIIlIIIllIIllll(String lllllllllllllllIIlIlIlllIIIIIllI, String lllllllllllllllIIlIlIlllIIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlllIIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllIIIIIlIl.getBytes(StandardCharsets.UTF_8)), llllIllIllII[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIllIllII[6], lllllllllllllllIIlIlIlllIIIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlllIIIIIlll) {
            lllllllllllllllIIlIlIlllIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIllIlIlII(int i) {
        return i != 0;
    }

    private static boolean lIIlIIIllIllIll(Object obj) {
        return obj != null;
    }
}
