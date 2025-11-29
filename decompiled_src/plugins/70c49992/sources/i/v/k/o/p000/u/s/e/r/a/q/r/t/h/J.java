package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Venom", priority = 110, register = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.J  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/J.class */
public class J extends w {
    private static /* synthetic */ int[] lIlIllIIlllIl;
    private static /* synthetic */ String[] lIlIllIIlllII;
    private static final /* synthetic */ Duration co;
    private /* synthetic */ Instant cp;

    @Inject
    protected J(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (llIIIIIIlllIIlI(varbitChanged.getVarpId(), lIlIllIIlllIl[3])) {
            this.cp = Instant.now();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        int i2;
        if (!llIIIIIIllIllIl(Combat.isVenomed() ? 1 : 0) || llIIIIIIllIlllI(Combat.isPoisoned() ? 1 : 0)) {
            i2 = lIlIllIIlllIl[0];
            "".length();
            if (0 != 0) {
                return ((218 ^ 146) ^ (187 ^ 190)) & (((((157 + 22) - (-8)) + 8) ^ (((73 + 126) - 197) + 140)) ^ (-" ".length()));
            }
        } else {
            i2 = lIlIllIIlllIl[1];
        }
        if (!llIIIIIIllIlllI(i2) || llIIIIIIllIllll(this.cp)) {
            return lIlIllIIlllIl[1];
        }
        if (llIIIIIIlllIIII(llIIIIIIllIllII(Duration.between(this.cp, Instant.now()).toSeconds(), co.toSeconds()))) {
            return lIlIllIIlllIl[1];
        }
        int[] iArr = new int[lIlIllIIlllIl[0]];
        iArr[lIlIllIIlllIl[1]] = lIlIllIIlllIl[2];
        if (llIIIIIIlllIIIl(Projectiles.getNearest(iArr))) {
            return lIlIllIIlllIl[1];
        }
        Item first = Inventory.getFirst(item -> {
            if (!llIIIIIIllIllIl(item.getName().toLowerCase().contains(lIlIllIIlllII[lIlIllIIlllIl[0]]) ? 1 : 0) || !llIIIIIIllIllIl(item.getName().contains(lIlIllIIlllII[lIlIllIIlllIl[4]]) ? 1 : 0) || llIIIIIIllIlllI(item.getName().toLowerCase().contains(lIlIllIIlllII[lIlIllIIlllIl[5]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIllIIlllIl[0]];
                strArr[lIlIllIIlllIl[1]] = lIlIllIIlllII[lIlIllIIlllIl[6]];
                if (llIIIIIIllIlllI(item.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIllIIlllIl[0];
                    "".length();
                    return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIllIIlllIl[1];
        });
        if (llIIIIIIllIllll(first)) {
            return lIlIllIIlllIl[1];
        }
        first.interact(lIlIllIIlllII[lIlIllIIlllIl[1]]);
        this.cg.a(this.cf.getTickCount());
        return lIlIllIIlllIl[0];
    }

    private static boolean llIIIIIIllIllll(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIIIlllIIlI(int i2, int i3) {
        return i2 == i3;
    }

    private static String llIIIIIIllIIlll(String llllllllllllllIllIlIIlIIllIlIIll, String llllllllllllllIllIlIIlIIllIlIlII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlIIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIlIIllIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIlIIllIlIlll.init(lIlIllIIlllIl[4], llllllllllllllIllIlIIlIIllIllIII);
            return new String(llllllllllllllIllIlIIlIIllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIlIIllIlIllI) {
            llllllllllllllIllIlIIlIIllIlIllI.printStackTrace();
            return null;
        }
    }

    private static String llIIIIIIllIlIII(String llllllllllllllIllIlIIlIIllIIlIII, String llllllllllllllIllIlIIlIIllIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIIllIIIlll.getBytes(StandardCharsets.UTF_8)), lIlIllIIlllIl[8]), "DES");
            Cipher llllllllllllllIllIlIIlIIllIIlIlI = Cipher.getInstance("DES");
            llllllllllllllIllIlIIlIIllIIlIlI.init(lIlIllIIlllIl[4], secretKeySpec);
            return new String(llllllllllllllIllIlIIlIIllIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIlIIllIIlIIl) {
            llllllllllllllIllIlIIlIIllIIlIIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIIIIllIlIIl(String llllllllllllllIllIlIIlIIlllIIlIl, String llllllllllllllIllIlIIlIIlllIlIIl) {
        String llllllllllllllIllIlIIlIIlllIIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIlIIlllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIlIIlllIlIII = new StringBuilder();
        char[] llllllllllllllIllIlIIlIIlllIIlll = llllllllllllllIllIlIIlIIlllIlIIl.toCharArray();
        int llllllllllllllIllIlIIlIIlllIIllI = lIlIllIIlllIl[1];
        char[] charArray = llllllllllllllIllIlIIlIIlllIIlIl2.toCharArray();
        int length = charArray.length;
        int i2 = lIlIllIIlllIl[1];
        while (llIIIIIIlllIIll(i2, length)) {
            llllllllllllllIllIlIIlIIlllIlIII.append((char) (charArray[i2] ^ llllllllllllllIllIlIIlIIlllIIlll[llllllllllllllIllIlIIlIIlllIIllI % llllllllllllllIllIlIIlIIlllIIlll.length]));
            "".length();
            llllllllllllllIllIlIIlIIlllIIllI++;
            i2++;
            "".length();
            if ((((77 ^ 58) ^ (51 ^ 82)) & (((88 ^ 58) ^ (78 ^ 58)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIIlIIlllIlIII);
    }

    private static boolean llIIIIIIlllIIIl(Object obj) {
        return obj != null;
    }

    static {
        llIIIIIIllIlIll();
        llIIIIIIllIlIlI();
        co = Duration.ofSeconds(5L);
    }

    private static boolean llIIIIIIllIllIl(int i2) {
        return i2 == 0;
    }

    private static boolean llIIIIIIlllIIII(int i2) {
        return i2 < 0;
    }

    private static void llIIIIIIllIlIlI() {
        lIlIllIIlllII = new String[lIlIllIIlllIl[7]];
        lIlIllIIlllII[lIlIllIIlllIl[1]] = llIIIIIIllIIlll("ry3sTcBsobA=", "hIYLR");
        lIlIllIIlllII[lIlIllIIlllIl[0]] = llIIIIIIllIIlll("Ops9qhskek4=", "bKSAB");
        lIlIllIIlllII[lIlIllIIlllIl[4]] = llIIIIIIllIIlll("u49h4vYXu3Q=", "WEiQb");
        lIlIllIIlllII[lIlIllIIlllIl[5]] = llIIIIIIllIlIII("VKyox8/4Va8=", "eHmUQ");
        lIlIllIIlllII[lIlIllIIlllIl[6]] = llIIIIIIllIlIIl("KTUiHwA=", "mGKqk");
    }

    private static void llIIIIIIllIlIll() {
        lIlIllIIlllIl = new int[9];
        lIlIllIIlllIl[0] = " ".length();
        lIlIllIIlllIl[1] = (243 ^ 177) & ((203 ^ 137) ^ (-1));
        lIlIllIIlllIl[2] = (-28709) & 30189;
        lIlIllIIlllIl[3] = (188 ^ 178) ^ (110 ^ 6);
        lIlIllIIlllIl[4] = "  ".length();
        lIlIllIIlllIl[5] = "   ".length();
        lIlIllIIlllIl[6] = 196 ^ 192;
        lIlIllIIlllIl[7] = (38 ^ 68) ^ (203 ^ 172);
        lIlIllIIlllIl[8] = 110 ^ 102;
    }

    private static boolean llIIIIIIlllIIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llIIIIIIllIlllI(int i2) {
        return i2 != 0;
    }

    private static int llIIIIIIllIllII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
