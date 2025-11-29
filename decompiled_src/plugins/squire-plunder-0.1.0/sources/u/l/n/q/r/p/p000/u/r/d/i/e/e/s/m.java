package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquirePlunderConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Finding Mummy", priority = 15, register = true)
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.m  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/m.class */
public class m extends Task {
    private static /* synthetic */ String[] llllllIlIllI;
    private final /* synthetic */ Client H;
    private static /* synthetic */ int[] llllllIlIlll;
    private final /* synthetic */ a F;
    private final /* synthetic */ SquirePlunderConfig G;

    private static void lIIlIlIIIlllIII() {
        llllllIlIllI = new String[llllllIlIlll[15]];
        llllllIlIllI[llllllIlIlll[1]] = lIIlIlIIIllIllI("ITUXKXcxNRU5", "uZzKW");
        llllllIlIllI[llllllIlIlll[2]] = lIIlIlIIIllIlll("zI3V2bsO7ORONjkxF8Helw==", "OQYCL");
        llllllIlIllI[llllllIlIlll[4]] = lIIlIlIIIllIllI("EAU7CkYABTka", "DjVhf");
        llllllIlIllI[llllllIlIlll[5]] = lIIlIlIIIllIllI("NSwyETZZHTwKMQ==", "yISgS");
        llllllIlIllI[llllllIlIlll[6]] = lIIlIlIIIllIllI("KzptJCEFOjQoIB8nbSkgBT8kKyhKMCIqPQ==", "jTMEO");
        llllllIlIllI[llllllIlIlll[13]] = lIIlIlIIIllIlll("OaOk5ddf/hOaD3FGmS8G8InC77DePKiMmlTM8HSaZmc=", "QbkaS");
        llllllIlIllI[llllllIlIlll[14]] = lIIlIlIIIllIlll("jLQKsWEF+cI=", "uqpBd");
    }

    private static boolean lIIlIlIIIllllll(Object obj) {
        return obj == null;
    }

    private static void lIIlIlIIIlllIIl() {
        llllllIlIlll = new int[17];
        llllllIlIlll[0] = (-((-19529) & 32489)) & (-1) & 15335;
        llllllIlIlll[1] = ((((109 + 72) - 56) + 71) ^ (((123 + 91) - 166) + 94)) & (((172 ^ 187) ^ (15 ^ 82)) ^ (-" ".length()));
        llllllIlIlll[2] = " ".length();
        llllllIlIlll[3] = (-((-1251) & 30187)) & (-2049) & 32763;
        llllllIlIlll[4] = "  ".length();
        llllllIlIlll[5] = "   ".length();
        llllllIlIlll[6] = 188 ^ 184;
        llllllIlIlll[7] = (-((-28889) & 29181)) & (-29185) & 32765;
        llllllIlIlll[8] = (-28938) & 31739;
        llllllIlIlll[9] = (-1025) & 21998;
        llllllIlIlll[10] = (-3593) & 24569;
        llllllIlIlll[11] = (-2227) & 23479;
        llllllIlIlll[12] = (-3077) & 24063;
        llllllIlIlll[13] = 185 ^ 188;
        llllllIlIlll[14] = (176 ^ 148) ^ (122 ^ 88);
        llllllIlIlll[15] = 77 ^ 74;
        llllllIlIlll[16] = (154 ^ 134) ^ (95 ^ 75);
    }

    private static boolean lIIlIlIIIlllIll(int i, int i2) {
        return i >= i2;
    }

    private static String lIIlIlIIIllIlll(String lllllllllllllllIIlIIllIlllIIIlll, String lllllllllllllllIIlIIllIlllIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIlllIIIllI.getBytes(StandardCharsets.UTF_8)), llllllIlIlll[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllIlIlll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIlllIIIIll) {
            lllllllllllllllIIlIIllIlllIIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIIIllIllI(String lllllllllllllllIIlIIllIlllIlllII, String lllllllllllllllIIlIIllIlllIllIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllIlllIllIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIllIlllIllIll.toCharArray();
        int lllllllllllllllIIlIIllIlllIlIIll = llllllIlIlll[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllllIlIlll[1];
        while (lIIlIlIIIllllII(i, length)) {
            lllllllllllllllIIlIIllIlllIllIlI.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIIllIlllIlIIll % charArray.length]));
            "".length();
            lllllllllllllllIIlIIllIlllIlIIll++;
            i++;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIllIlllIllIlI);
    }

    private void c(int i) {
        int[] iArr = new int[llllllIlIlll[2]];
        iArr[llllllIlIlll[1]] = i;
        if (lIIlIlIIIllllll(TileObjects.getNearest(iArr))) {
            return;
        }
        int[] iArr2 = new int[llllllIlIlll[2]];
        iArr2[llllllIlIlll[1]] = i;
        TileObjects.getNearest(iArr2).interact(llllllIlIllI[llllllIlIlll[14]]);
    }

    private static boolean lIIlIlIIIllllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlIIIlllllI(int i) {
        return i == 0;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIlIlIIIlllIlI(chatMessage.getMessage().equals(llllllIlIllI[llllllIlIlll[13]]) ? 1 : 0)) {
            this.F.a(this.F.d() + llllllIlIlll[2]);
        }
    }

    static {
        lIIlIlIIIlllIIl();
        lIIlIlIIIlllIII();
    }

    private static boolean lIIlIlIIIllllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    public boolean run() {
        if (lIIlIlIIIlllIlI(this.H.getVarbitValue(llllllIlIlll[0]))) {
            return llllllIlIlll[1];
        }
        int[] iArr = new int[llllllIlIlll[2]];
        iArr[llllllIlIlll[1]] = this.G.foodID();
        if (!lIIlIlIIIlllIll(Inventory.getCount(iArr), this.G.minFoodAmount()) || lIIlIlIIIllllII(Inventory.getCount(item -> {
            return item.getName().startsWith(this.G.antiPoison());
        }), this.G.minAntiAmount())) {
            return llllllIlIlll[1];
        }
        int[] iArr2 = new int[llllllIlIlll[2]];
        iArr2[llllllIlIlll[1]] = llllllIlIlll[3];
        if (!lIIlIlIIIllllIl(NPCs.getNearest(iArr2)) && !lIIlIlIIIlllllI(Movement.shouldWalk() ? 1 : 0)) {
            String[] strArr = new String[llllllIlIlll[2]];
            strArr[llllllIlIlll[1]] = llllllIlIllI[llllllIlIlll[1]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIIlIlIIIllllIl(nearest)) {
                String[] strArr2 = new String[llllllIlIlll[2]];
                strArr2[llllllIlIlll[1]] = llllllIlIllI[llllllIlIlll[2]];
                if (lIIlIlIIIlllIlI(nearest.hasAction(strArr2) ? 1 : 0)) {
                    return llllllIlIlll[1];
                }
                String[] strArr3 = new String[llllllIlIlll[2]];
                strArr3[llllllIlIlll[1]] = llllllIlIllI[llllllIlIlll[4]];
                TileObjects.getNearest(strArr3).interact(llllllIlIllI[llllllIlIlll[5]]);
                return llllllIlIlll[2];
            }
            if (lIIlIlIIIlllIlI(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            String[] strArr4 = new String[llllllIlIlll[2]];
            strArr4[llllllIlIlll[1]] = llllllIlIllI[llllllIlIlll[6]];
            if (lIIlIlIIIllllll(TileObjects.getNearest(strArr4))) {
                Movement.walkTo(new WorldPoint(llllllIlIlll[7], llllllIlIlll[8], llllllIlIlll[1]), (boolean) llllllIlIlll[1]);
                "".length();
                return llllllIlIlll[2];
            }
            int[] iArr3 = new int[llllllIlIlll[6]];
            iArr3[llllllIlIlll[1]] = llllllIlIlll[9];
            iArr3[llllllIlIlll[2]] = llllllIlIlll[10];
            iArr3[llllllIlIlll[4]] = llllllIlIlll[11];
            iArr3[llllllIlIlll[5]] = llllllIlIlll[12];
            c(iArr3[this.F.d()]);
            return llllllIlIlll[2];
        }
        return llllllIlIlll[1];
    }

    @Inject
    public m(a aVar, SquirePlunderConfig squirePlunderConfig, Client client) {
        this.F = aVar;
        this.G = squirePlunderConfig;
        this.H = client;
    }

    private static boolean lIIlIlIIIlllIlI(int i) {
        return i != 0;
    }
}
