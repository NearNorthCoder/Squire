package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking range potion", priority = 20)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.q  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/q.class */
public class q extends Task {
    private static /* synthetic */ String[] llllIIlIIIll;
    private static /* synthetic */ int[] llllIIlIlIll;
    private final /* synthetic */ C0000a at;
    private final /* synthetic */ SquireAlchemicalHydraConfig au;

    private static String lIIIlllllIIlIlI(String lllllllllllllllIIlIlIlIlIlIIIlll, String lllllllllllllllIIlIlIlIlIlIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIlIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIlIlIlIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIlIlIlIIlIll.init(llllIIlIlIll[4], secretKeySpec);
            return new String(lllllllllllllllIIlIlIlIlIlIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIlIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlIlIlIIlIlI) {
            lllllllllllllllIIlIlIlIlIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllllllIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIllllllIlllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    public boolean run() {
        if (!lIIIllllllIlllI(this.at.g() ? 1 : 0) && !lIIIllllllIllll(Skills.getBoostedLevel(Skill.RANGED) - Skills.getLevel(Skill.RANGED), llllIIlIlIll[1])) {
            Item first = Inventory.getFirst(item -> {
                if (!lIIIllllllIlllI(item.getName().toLowerCase().contains(llllIIlIIIll[llllIIlIlIll[5]]) ? 1 : 0) || lIIIlllllllIIIl(item.getName().toLowerCase().contains(llllIIlIIIll[llllIIlIlIll[6]]) ? 1 : 0)) {
                    ?? r0 = llllIIlIlIll[2];
                    "".length();
                    return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIIlIlIll[0];
            });
            if (lIIIlllllllIIII(first)) {
                return llllIIlIlIll[0];
            }
            if (lIIIllllllIlllI(first.getName().contains(llllIIlIIIll[llllIIlIlIll[0]]) ? 1 : 0) && lIIIlllllllIIIl(this.au.makeDivines() ? 1 : 0)) {
                ?? r0 = llllIIlIlIll[2];
                String[] strArr = new String[llllIIlIlIll[2]];
                strArr[llllIIlIlIll[0]] = llllIIlIIIll[llllIIlIlIll[2]];
                if (lIIIlllllllIIlI(Inventory.getCount((boolean) r0, strArr), llllIIlIlIll[3])) {
                    String[] strArr2 = new String[llllIIlIlIll[2]];
                    strArr2[llllIIlIlIll[0]] = llllIIlIIIll[llllIIlIlIll[4]];
                    Inventory.getFirst(strArr2).useOn(first);
                    return llllIIlIlIll[2];
                }
            }
            first.interact(llllIIlIIIll[llllIIlIlIll[3]]);
            return llllIIlIlIll[2];
        }
        return llllIIlIlIll[0];
    }

    private static boolean lIIIllllllIllll(int i, int i2) {
        return i > i2;
    }

    private static String lIIIlllllIIlIIl(String lllllllllllllllIIlIlIlIlIIllllII, String lllllllllllllllIIlIlIlIlIIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlIlIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIlIIlllIll.getBytes(StandardCharsets.UTF_8)), llllIIlIlIll[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlIlIll[4], lllllllllllllllIIlIlIlIlIIllllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIlIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlIlIIllllIl) {
            lllllllllllllllIIlIlIlIlIIllllIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public q(C0000a c0000a, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.at = c0000a;
        this.au = squireAlchemicalHydraConfig;
    }

    private static boolean lIIIlllllllIIIl(int i) {
        return i != 0;
    }

    static {
        lIIIllllllIllIl();
        lIIIlllllIIlIll();
    }

    private static void lIIIlllllIIlIll() {
        llllIIlIIIll = new String[llllIIlIlIll[1]];
        llllIIlIIIll[llllIIlIlIll[0]] = lIIIlllllIIlIIl("6osUl1gKqwg=", "qspxS");
        llllIIlIIIll[llllIIlIlIll[2]] = lIIIlllllIIlIlI("n7yHVD2M6pC5wyxxcMj/5A==", "Xlodm");
        llllIIlIIIll[llllIIlIlIll[4]] = lIIIlllllIIlIIl("meQio7e/UeQUGTbSWsIcXQ==", "HFKuv");
        llllIIlIIIll[llllIIlIlIll[3]] = lIIIlllllIIlIIl("S6D26e9qlGw=", "cxRAO");
        llllIIlIIIll[llllIIlIlIll[5]] = lIIIlllllIIlIIl("HEOcfTUkZWzViMlp/CAvvA==", "vZnta");
        llllIIlIIIll[llllIIlIlIll[6]] = lIIIlllllIIlIlI("3CTpM5RprvEmNkEDWrU4mg==", "tbcAZ");
    }

    private static boolean lIIIlllllllIIII(Object obj) {
        return obj == null;
    }

    private static void lIIIllllllIllIl() {
        llllIIlIlIll = new int[8];
        llllIIlIlIll[0] = (87 ^ 125) & ((117 ^ 95) ^ (-1));
        llllIIlIlIll[1] = 85 ^ 83;
        llllIIlIlIll[2] = " ".length();
        llllIIlIlIll[3] = "   ".length();
        llllIIlIlIll[4] = "  ".length();
        llllIIlIlIll[5] = (55 ^ 45) ^ (216 ^ 198);
        llllIIlIlIll[6] = 86 ^ 83;
        llllIIlIlIll[7] = (178 ^ 130) ^ (116 ^ 76);
    }
}
