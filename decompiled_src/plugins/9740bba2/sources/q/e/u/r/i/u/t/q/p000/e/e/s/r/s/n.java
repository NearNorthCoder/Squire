package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuester;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Trade;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Upgrading to members", register = true)
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.n  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/n.class */
public class n extends Task {
    private static /* synthetic */ String[] lIIIllIllllIl;
    private final /* synthetic */ SquireQuesterConfig am;
    private static /* synthetic */ int[] lIIIllIlllllI;
    private final /* synthetic */ ConfigManager ao;
    private final /* synthetic */ SquireQuester an;

    private static String lIlIIIllIllIllI(String lllllllllllllllIIIIIlllIIlIllIIl, String lllllllllllllllIIIIIlllIIlIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlllIIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlllIIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIlllIIlIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIlllIIlIllIll.init(lIIIllIlllllI[6], lllllllllllllllIIIIIlllIIlIlllII);
            return new String(lllllllllllllllIIIIIlllIIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlllIIlIllIlI) {
            lllllllllllllllIIIIIlllIIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIllIlllIlI(int i) {
        return i == 0;
    }

    private static void lIlIIIllIlllIII() {
        lIIIllIllllIl = new String[lIIIllIlllllI[19]];
        lIIIllIllllIl[lIIIllIlllllI[0]] = lIlIIIllIllIlIl("k0ymtM9/OmJnjKEzTfKEGw==", "mjKcg");
        lIIIllIllllIl[lIIIllIlllllI[3]] = lIlIIIllIllIlIl("GAoQmzfTGcw=", "nDggW");
        lIIIllIllllIl[lIIIllIlllllI[6]] = lIlIIIllIllIlIl("XalgFjFn3/Y=", "KzFun");
        lIIIllIllllIl[lIIIllIlllllI[7]] = lIlIIIllIllIlIl("8R9OJZlFIX803cgIENIr4Q==", "XzKTt");
        lIIIllIllllIl[lIIIllIlllllI[9]] = lIlIIIllIllIllI("tdFqGD5CP0dBYWnp0+EdjV5f4mzmYspZic+ZYpaa5uhBxAcsL15+LCZO4YWw74GBDpwguHH6msOJlt1vmP6cJRYkIGGOrWG1Q31SF+tuJOB9+90a/mJJ+EDOKy5Yl8jDoTOytZ29aRo=", "ioIMs");
        lIIIllIllllIl[lIIIllIlllllI[4]] = lIlIIIllIllIlIl("ySxS+7hERHc=", "Sryzw");
        lIIIllIllllIl[lIIIllIlllllI[14]] = lIlIIIllIllIllI("7deGjvC6HiQ=", "zGURc");
        lIIIllIllllIl[lIIIllIlllllI[11]] = lIlIIIllIllIlIl("aqTKoJFXJ7E=", "cQBFy");
        lIIIllIllllIl[lIIIllIlllllI[15]] = lIlIIIllIllIllI("+gX1LnlGkzM=", "ZDtUy");
        lIIIllIllllIl[lIIIllIlllllI[16]] = lIlIIIllIllIllI("aT1qs9dkugk=", "LMGVZ");
        lIIIllIllllIl[lIIIllIlllllI[13]] = lIlIIIllIllIlIl("JR+S+OchtvLxCggt6Rs1LndtIFi0Gnvn4v8K0mHPpdw=", "atumk");
        lIIIllIllllIl[lIIIllIlllllI[17]] = lIlIIIllIllIlll("QzU5NBAGMQ==", "cBPGx");
        lIIIllIllllIl[lIIIllIlllllI[18]] = lIlIIIllIllIlll("OTsWIxoMPRFmHgo5ESNE", "xXuFj");
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIlIIIllIlllllI(message.contains(lIIIllIllllIl[lIIIllIlllllI[13]]) ? 1 : 0)) {
            this.an.a(Text.sanitize(message.split(lIIIllIllllIl[lIIIllIlllllI[17]])[lIIIllIlllllI[0]]));
        }
        if (lIlIIIllIlllllI(message.contains(lIIIllIllllIl[lIIIllIlllllI[18]]) ? 1 : 0)) {
            this.an.a((String) null);
        }
    }

    private static String lIlIIIllIllIlll(String lllllllllllllllIIIIIlllIIllllIll, String lllllllllllllllIIIIIlllIIllllIlI) {
        String lllllllllllllllIIIIIlllIIllllIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIIllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIIlllIIllllIII = lllllllllllllllIIIIIlllIIllllIlI.toCharArray();
        int lllllllllllllllIIIIIlllIIlllIlll = lIIIllIlllllI[0];
        char[] charArray = lllllllllllllllIIIIIlllIIllllIll2.toCharArray();
        int length = charArray.length;
        int i = lIIIllIlllllI[0];
        while (lIlIIIllIllllII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIIIIlllIIllllIII[lllllllllllllllIIIIIlllIIlllIlll % lllllllllllllllIIIIIlllIIllllIII.length]));
            "".length();
            lllllllllllllllIIIIIlllIIlllIlll++;
            i++;
            "".length();
            if (((239 ^ 171) & ((204 ^ 136) ^ (-1))) >= (147 ^ 151)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public n(SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, ConfigManager configManager) {
        this.am = squireQuesterConfig;
        this.an = squireQuester;
        this.ao = configManager;
    }

    private static boolean lIlIIIllIlllllI(int i) {
        return i != 0;
    }

    private static String lIlIIIllIllIlIl(String lllllllllllllllIIIIIlllIIllIIllI, String lllllllllllllllIIIIIlllIIllIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIllIlllllI[15]), "DES");
            Cipher lllllllllllllllIIIIIlllIIllIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIIIIlllIIllIlIII.init(lIIIllIlllllI[6], secretKeySpec);
            return new String(lllllllllllllllIIIIIlllIIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlllIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlllIIllIIlll) {
            lllllllllllllllIIIIIlllIIllIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIllIlllIIl() {
        lIIIllIlllllI = new int[20];
        lIIIllIlllllI[0] = (6 ^ 3) & ((180 ^ 177) ^ (-1));
        lIIIllIlllllI[1] = (-11431) & 11711;
        lIIIllIlllllI[2] = (-4363) & 6142;
        lIIIllIlllllI[3] = " ".length();
        lIIIllIlllllI[4] = (58 ^ 90) ^ (248 ^ 157);
        lIIIllIlllllI[5] = (-18519) & 31710;
        lIIIllIlllllI[6] = "  ".length();
        lIIIllIlllllI[7] = "   ".length();
        lIIIllIlllllI[8] = ((33 + 177) - 143) + 162;
        lIIIllIlllllI[9] = (73 ^ 63) ^ (83 ^ 33);
        lIIIllIlllllI[10] = (32 ^ 57) ^ (37 ^ 126);
        lIIIllIlllllI[11] = 177 ^ 182;
        lIIIllIlllllI[12] = 109 ^ 117;
        lIIIllIlllllI[13] = (29 ^ 47) ^ (153 ^ 161);
        lIIIllIlllllI[14] = (11 ^ 114) ^ (((66 + 100) - 151) + 112);
        lIIIllIlllllI[15] = 104 ^ 96;
        lIIIllIlllllI[16] = 143 ^ 134;
        lIIIllIlllllI[17] = (83 ^ 102) ^ (4 ^ 58);
        lIIIllIlllllI[18] = 56 ^ 52;
        lIIIllIlllllI[19] = (177 ^ 172) ^ (109 ^ 125);
    }

    private static boolean lIlIIIllIllllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIllIllllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIllIlllIll(int i, int i2) {
        return i >= i2;
    }

    static {
        lIlIIIllIlllIIl();
        lIlIIIllIlllIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v24, types: [boolean] */
    public boolean run() {
        if (lIlIIIllIlllIlI(this.am.bond() ? 1 : 0)) {
            return lIIIllIlllllI[0];
        }
        int varp = Vars.getVarp(lIIIllIlllllI[1]);
        int varp2 = Vars.getVarp(lIIIllIlllllI[2]);
        if (lIlIIIllIlllIll(varp2, lIIIllIlllllI[3])) {
            System.out.println("You have " + varp2 + " days of members left. You do not need a bond.");
            this.ao.setConfiguration(lIIIllIllllIl[lIIIllIlllllI[0]], lIIIllIllllIl[lIIIllIlllllI[3]], Boolean.valueOf((boolean) lIIIllIlllllI[0]));
            return lIIIllIlllllI[0];
        } else if (lIlIIIllIllllII(varp, lIIIllIlllllI[4])) {
            return lIIIllIlllllI[0];
        } else {
            if (lIlIIIllIlllIlI(Trade.isOpen() ? 1 : 0)) {
                int[] iArr = new int[lIIIllIlllllI[3]];
                iArr[lIIIllIlllllI[0]] = lIIIllIlllllI[5];
                if (lIlIIIllIlllIlI(Inventory.contains(iArr) ? 1 : 0) && lIlIIIllIllllIl(this.an.b())) {
                    System.out.println(lIIIllIllllIl[lIIIllIlllllI[6]]);
                    String[] strArr = new String[lIIIllIlllllI[3]];
                    strArr[lIIIllIlllllI[0]] = this.an.b();
                    Players.getNearest(strArr).interact(lIIIllIllllIl[lIIIllIlllllI[7]]);
                }
            }
            if (lIlIIIllIlllllI(Trade.isFirstScreenOpen() ? 1 : 0)) {
                Trade.acceptFirstScreen();
            }
            if (lIlIIIllIlllllI(Trade.isSecondScreenOpen() ? 1 : 0)) {
                Trade.acceptSecondScreen();
            }
            if (lIlIIIllIllllIl(Widgets.get(lIIIllIlllllI[8], lIIIllIlllllI[3])) && lIlIIIllIlllllI(Widgets.get(lIIIllIlllllI[8], lIIIllIlllllI[3]).getText().equals(lIIIllIllllIl[lIIIllIlllllI[9]]) ? 1 : 0)) {
                Game.logout();
            }
            if (lIlIIIllIllllIl(Widgets.get(lIIIllIlllllI[10], lIIIllIlllllI[11]))) {
                if (lIlIIIllIlllllI(Widgets.get(lIIIllIlllllI[10], lIIIllIlllllI[12], lIIIllIlllllI[13]).getText().equals(lIIIllIllllIl[lIIIllIlllllI[4]]) ? 1 : 0)) {
                    Widgets.get(lIIIllIlllllI[10], lIIIllIlllllI[11]).interact(lIIIllIllllIl[lIIIllIlllllI[14]]);
                }
                if (lIlIIIllIlllllI(Widgets.get(lIIIllIlllllI[10], lIIIllIlllllI[12], lIIIllIlllllI[13]).getText().equals(lIIIllIllllIl[lIIIllIlllllI[11]]) ? 1 : 0)) {
                    Widgets.get(lIIIllIlllllI[10], lIIIllIlllllI[12]).interact(lIIIllIllllIl[lIIIllIlllllI[15]]);
                    "".length();
                    if ("  ".length() <= 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            } else {
                int[] iArr2 = new int[lIIIllIlllllI[3]];
                iArr2[lIIIllIlllllI[0]] = lIIIllIlllllI[5];
                Inventory.getFirst(iArr2).interact(lIIIllIllllIl[lIIIllIlllllI[16]]);
            }
            return lIIIllIlllllI[3];
        }
    }
}
