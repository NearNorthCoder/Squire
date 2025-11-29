package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquirePlunderConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Consuming", priority = 500, register = true)
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.e  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/e.class */
public class e extends Task {
    private final /* synthetic */ SquirePlunderConfig v;
    private static /* synthetic */ int[] lllllllIIIlI;
    private /* synthetic */ Instant x;
    private final /* synthetic */ Duration w = Duration.ofSeconds(12);
    private static /* synthetic */ String[] lllllllIIIIl;

    private static void lIIlIlIIllIlIII() {
        lllllllIIIIl = new String[lllllllIIIlI[7]];
        lllllllIIIIl[lllllllIIIlI[0]] = lIIlIlIIllIIlIl("K1wvENgedqkKCDRhIH2C7WUL6tgZxTpRvgXFJZLTUMc=", "uvVgm");
        lllllllIIIIl[lllllllIIIlI[1]] = lIIlIlIIllIIllI("FEa2W2j9ZZ8=", "jpnAU");
        lllllllIIIIl[lllllllIIIlI[3]] = lIIlIlIIllIIllI("pXN4arrgxjtP/W2OJaSc+FmXuFQWGiSjra4AZn66gTA=", "RiiHz");
        lllllllIIIIl[lllllllIIIlI[4]] = lIIlIlIIllIIlll("Ago5AiQ=", "FxPlO");
        lllllllIIIIl[lllllllIIIlI[2]] = lIIlIlIIllIIllI("YOUXt6w8NXw=", "VjNeY");
        lllllllIIIIl[lllllllIIIlI[6]] = lIIlIlIIllIIllI("3XdaJEwP8Ws=", "oWLuN");
    }

    @Inject
    public e(SquirePlunderConfig squirePlunderConfig) {
        this.v = squirePlunderConfig;
    }

    private static String lIIlIlIIllIIllI(String lllllllllllllllIIlIIllIIlIIlllIl, String lllllllllllllllIIlIIllIIlIIlllII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIlIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIlIIlllII.getBytes(StandardCharsets.UTF_8)), lllllllIIIlI[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllllIIIlI[3], lllllllllllllllIIlIIllIIlIlIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIIlIIllllI) {
            lllllllllllllllIIlIIllIIlIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlllIIII(int i) {
        return i != 0;
    }

    private static int lIIlIlIIllIlIlI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static String lIIlIlIIllIIlIl(String lllllllllllllllIIlIIllIIIllllIII, String lllllllllllllllIIlIIllIIIlllIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllllIIIlI[3], lllllllllllllllIIlIIllIIIllllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIIIllllIIl) {
            lllllllllllllllIIlIIllIIIllllIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIllIlIIl() {
        lllllllIIIlI = new int[9];
        lllllllIIIlI[0] = (183 ^ 172) & ((76 ^ 87) ^ (-1));
        lllllllIIIlI[1] = " ".length();
        lllllllIIIlI[2] = 82 ^ 86;
        lllllllIIIlI[3] = "  ".length();
        lllllllIIIlI[4] = "   ".length();
        lllllllIIIlI[5] = (128 ^ 140) ^ (119 ^ 29);
        lllllllIIIlI[6] = 81 ^ 84;
        lllllllIIIlI[7] = 174 ^ 168;
        lllllllIIIlI[8] = 38 ^ 46;
    }

    static {
        lIIlIlIIllIlIIl();
        lIIlIlIIllIlIII();
    }

    private static boolean lIIlIlIIllIlIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIlIIllIlllI(int i) {
        return i > 0;
    }

    private static String lIIlIlIIllIIlll(String lllllllllllllllIIlIIllIIlIIIllIl, String lllllllllllllllIIlIIllIIlIIIllII) {
        String lllllllllllllllIIlIIllIIlIIIllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIllIIlIIIlIlI = lllllllllllllllIIlIIllIIlIIIllII.toCharArray();
        int lllllllllllllllIIlIIllIIlIIIlIIl = lllllllIIIlI[0];
        char[] charArray = lllllllllllllllIIlIIllIIlIIIllIl2.toCharArray();
        int length = charArray.length;
        int i = lllllllIIIlI[0];
        while (lIIlIlIIlllIIIl(i, length)) {
            char lllllllllllllllIIlIIllIIlIIIlllI = charArray[i];
            sb.append((char) (lllllllllllllllIIlIIllIIlIIIlllI ^ lllllllllllllllIIlIIllIIlIIIlIlI[lllllllllllllllIIlIIllIIlIIIlIIl % lllllllllllllllIIlIIllIIlIIIlIlI.length]));
            "".length();
            lllllllllllllllIIlIIllIIlIIIlIIl++;
            i++;
            "".length();
            if ("  ".length() == (((69 ^ 41) ^ (25 ^ 22)) & (((106 ^ 46) ^ (11 ^ 44)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIlIIlllIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlIIllIllII(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIIllIllll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIlIIllIllIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    public boolean run() {
        if (lIIlIlIIllIlIll(Combat.getCurrentHealth(), this.v.eatAt()) && lIIlIlIIllIllII(Combat.isPoisoned() ? 1 : 0)) {
            return lllllllIIIlI[0];
        }
        if (lIIlIlIIllIlIll(this.v.eatAt(), Combat.getCurrentHealth())) {
            Item first = Inventory.getFirst(item -> {
                if (lIIlIlIIllIllll(item.getId(), this.v.foodID())) {
                    String[] strArr = new String[lllllllIIIlI[1]];
                    strArr[lllllllIIIlI[0]] = lllllllIIIIl[lllllllIIIlI[6]];
                    if (lIIlIlIIlllIIII(item.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllllllIIIlI[1];
                        "".length();
                        return "  ".length() < " ".length() ? ((139 ^ 143) ^ (126 ^ 70)) & (((31 ^ 115) ^ (76 ^ 28)) ^ (-" ".length())) : r0;
                    }
                }
                return lllllllIIIlI[0];
            });
            if (lIIlIlIIllIllIl(first)) {
                Log.info(lllllllIIIIl[lllllllIIIlI[0]]);
                return lllllllIIIlI[0];
            }
            first.interact(lllllllIIIIl[lllllllIIIlI[1]]);
            sleep(lllllllIIIlI[2]);
            return lllllllIIIlI[1];
        } else if (lIIlIlIIllIllII(Combat.isPoisoned() ? 1 : 0)) {
            return lllllllIIIlI[0];
        } else {
            System.out.println("time until anti: " + Duration.between(this.x, Instant.now()).toSeconds());
            if (lIIlIlIIllIlllI(lIIlIlIIllIlIlI(Duration.between(this.x, Instant.now()).toSeconds(), this.w.toSeconds()))) {
                Item first2 = Inventory.getFirst(item2 -> {
                    if (lIIlIlIIlllIIII(item2.getName().startsWith(this.v.antiPoison()) ? 1 : 0)) {
                        String[] strArr = new String[lllllllIIIlI[1]];
                        strArr[lllllllIIIlI[0]] = lllllllIIIIl[lllllllIIIlI[2]];
                        if (lIIlIlIIlllIIII(item2.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = lllllllIIIlI[1];
                            "".length();
                            return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lllllllIIIlI[0];
                });
                if (lIIlIlIIllIllIl(first2)) {
                    Log.info(lllllllIIIIl[lllllllIIIlI[3]]);
                    return lllllllIIIlI[0];
                }
                first2.interact(lllllllIIIIl[lllllllIIIlI[4]]);
                sleep(lllllllIIIlI[3]);
                return lllllllIIIlI[1];
            }
            return lllllllIIIlI[0];
        }
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (lIIlIlIIllIllll(varbitChanged.getVarpId(), lllllllIIIlI[5])) {
            this.x = Instant.now();
        }
    }
}
