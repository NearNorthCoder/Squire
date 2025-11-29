package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
@TaskDesc(name = "Entering room", register = true)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.x  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/x.class */
public class x extends Task {
    private final /* synthetic */ C0006g ar;
    private static /* synthetic */ String[] lIIlIlIIIlIlI;
    private static /* synthetic */ int[] lIIlIlIIIlIll;
    private /* synthetic */ boolean as;

    @Inject
    public x(C0006g c0006g) {
        this.ar = c0006g;
    }

    private static boolean lIlIlIllIIlIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIllIIlIlII(Object obj) {
        return obj == null;
    }

    private static String lIlIlIllIIIllll(String llllllllllllllIlllllIIIlIlIIllIl, String llllllllllllllIlllllIIIlIlIIllII) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIlIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIlIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIlIIIlIll[4], llllllllllllllIlllllIIIlIlIlIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIlIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIlIlIIlllI) {
            llllllllllllllIlllllIIIlIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIIllIII(int i, int i2) {
        return i == i2;
    }

    private static String lIlIlIllIIIlllI(String llllllllllllllIlllllIIIlIIllIIII, String llllllllllllllIlllllIIIlIIlIlIlI) {
        String llllllllllllllIlllllIIIlIIllIIII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIIlIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllIIIlIIlIlllI = new StringBuilder();
        char[] llllllllllllllIlllllIIIlIIlIllIl = llllllllllllllIlllllIIIlIIlIlIlI.toCharArray();
        int llllllllllllllIlllllIIIlIIlIllII = lIIlIlIIIlIll[0];
        char[] charArray = llllllllllllllIlllllIIIlIIllIIII2.toCharArray();
        int length = charArray.length;
        int i = lIIlIlIIIlIll[0];
        while (lIlIlIllIIlIIll(i, length)) {
            char llllllllllllllIlllllIIIlIIllIIIl = charArray[i];
            llllllllllllllIlllllIIIlIIlIlllI.append((char) (llllllllllllllIlllllIIIlIIllIIIl ^ llllllllllllllIlllllIIIlIIlIllIl[llllllllllllllIlllllIIIlIIlIllII % llllllllllllllIlllllIIIlIIlIllIl.length]));
            "".length();
            llllllllllllllIlllllIIIlIIlIllII++;
            i++;
            "".length();
            if ((((20 ^ 83) ^ (37 ^ 83)) & (((18 ^ 125) ^ (67 ^ 29)) ^ (-" ".length()))) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllllIIIlIIlIlllI);
    }

    private static boolean lIlIlIllIIlIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlIllIIlIllI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlIllIIlIlll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIlIllIIlIIlI(chatMessage.getMessage().contains(lIIlIlIIIlIlI[lIIlIlIIIlIll[7]]) ? 1 : 0)) {
            this.as = lIIlIlIIIlIll[1];
        }
    }

    private static void lIlIlIllIIlIIII() {
        lIIlIlIIIlIlI = new String[lIIlIlIIIlIll[11]];
        lIIlIlIIIlIlI[lIIlIlIIIlIll[0]] = lIlIlIllIIIllIl("4AUi7aWO+bFabuTHH7D9tg==", "YIDVY");
        lIIlIlIIIlIlI[lIIlIlIIIlIll[1]] = lIlIlIllIIIlllI("NTUSG3FSNQUcJxsxElw=", "zEwuQ");
        lIIlIlIIIlIlI[lIIlIlIIIlIll[4]] = lIlIlIllIIIlllI("OCcPDw==", "wWjaf");
        lIIlIlIIIlIlI[lIIlIlIIIlIll[5]] = lIlIlIllIIIllll("rUzgq537VnSjZfr20t10Pg==", "thhQW");
        lIIlIlIIIlIlI[lIIlIlIIIlIll[6]] = lIlIlIllIIIllll("UHf1sKMsYISykEXFAhI95Q==", "fCRLd");
        lIIlIlIIIlIlI[lIIlIlIIIlIll[7]] = lIlIlIllIIIllll("j4VbdkkkUOmMO4xKVgWmdTNBHXNrdlYDVZNI97YgN90=", "icFtg");
        lIIlIlIIIlIlI[lIIlIlIIIlIll[8]] = lIlIlIllIIIllll("D+r2IpzgHKC0aTwMz2OPTg==", "estHJ");
        lIIlIlIIIlIlI[lIIlIlIIIlIll[9]] = lIlIlIllIIIllIl("+j6X948ziS+Ba7APg5Q77g==", "XYJfI");
        lIIlIlIIIlIlI[lIIlIlIIIlIll[10]] = lIlIlIllIIIllll("+W/xGjXVzRA=", "NRnKt");
    }

    private static String lIlIlIllIIIllIl(String llllllllllllllIlllllIIIlIlIIIIII, String llllllllllllllIlllllIIIlIIllllll) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIlIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIlIIllllll.getBytes(StandardCharsets.UTF_8)), lIIlIlIIIlIll[10]), "DES");
            Cipher llllllllllllllIlllllIIIlIlIIIIlI = Cipher.getInstance("DES");
            llllllllllllllIlllllIIIlIlIIIIlI.init(lIIlIlIIIlIll[4], llllllllllllllIlllllIIIlIlIIIIll);
            return new String(llllllllllllllIlllllIIIlIlIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIlIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIlIlIIIIIl) {
            llllllllllllllIlllllIIIlIlIIIIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIllIIlIIIl();
        lIlIlIllIIlIIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v44, types: [boolean] */
    public boolean run() {
        if (!lIlIlIllIIlIIlI(this.ar.m() ? 1 : 0) && !lIlIlIllIIlIIll(this.ar.q(), this.ar.r())) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                String[] strArr = new String[lIIlIlIIIlIll[1]];
                strArr[lIIlIlIIIlIll[0]] = lIIlIlIIIlIlI[lIIlIlIIIlIll[9]];
                if (lIlIlIllIIlIIlI(tileObject.hasAction(strArr) ? 1 : 0) && lIlIlIllIIlIIlI(tileObject.getName().equals(lIIlIlIIIlIlI[lIIlIlIIIlIll[10]]) ? 1 : 0) && lIlIlIllIIllIII(tileObject.getPlane(), Static.getClient().getPlane()) && lIlIlIllIIlIIlI(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                    ?? r0 = lIIlIlIIIlIll[1];
                    "".length();
                    return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIlIlIIIlIll[0];
            });
            if (!lIlIlIllIIlIlII(nearest)) {
                nearest.interact(lIIlIlIIIlIlI[lIIlIlIIIlIll[6]]);
                return lIIlIlIIIlIll[1];
            }
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                if (lIlIlIllIIlIIlI(tileObject2.getName().equals(lIIlIlIIIlIlI[lIIlIlIIIlIll[8]]) ? 1 : 0) && lIlIlIllIIlIIlI(Reachable.isInteractable(tileObject2) ? 1 : 0) && lIlIlIllIIllIII(tileObject2.getPlane(), Static.getClient().getPlane())) {
                    ?? r0 = lIIlIlIIIlIll[1];
                    "".length();
                    return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIlIlIIIlIll[0];
            });
            if (lIlIlIllIIlIlIl(nearest2)) {
                if (lIlIlIllIIlIIlI(V() ? 1 : 0)) {
                    Worlds.hopTo(Worlds.getRandom(world -> {
                        if (lIlIlIllIIlIIlI(world.isNormal() ? 1 : 0) && lIlIlIllIIlIIlI(world.isMembers() ? 1 : 0)) {
                            ?? r0 = lIIlIlIIIlIll[1];
                            "".length();
                            return 0 != 0 ? ((73 ^ 20) ^ (22 ^ 79)) & (((((174 + 72) - 125) + 73) ^ (((187 + 87) - 217) + 141)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIIIlIll[0];
                    }));
                    this.as = lIIlIlIIIlIll[0];
                    return lIIlIlIIIlIll[1];
                }
                String[] strArr = new String[lIIlIlIIIlIll[1]];
                strArr[lIIlIlIIIlIll[0]] = lIIlIlIIIlIlI[lIIlIlIIIlIll[0]];
                if (lIlIlIllIIlIIlI(nearest2.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIlIlIIIlIll[1];
                    int[] iArr = new int[lIIlIlIIIlIll[1]];
                    iArr[lIIlIlIIIlIll[0]] = lIIlIlIIIlIll[2];
                    if (lIlIlIllIIlIllI(Inventory.getCount((boolean) r0, iArr), lIIlIlIIIlIll[3])) {
                        nearest2.interact(lIIlIlIIIlIlI[lIIlIlIIIlIll[1]]);
                        "".length();
                        if ((((((85 + 37) - 56) + 83) ^ (((129 + 20) - 116) + 124)) & (((27 ^ 125) ^ (61 ^ 83)) ^ (-" ".length()))) <= (-" ".length())) {
                            return ((41 ^ 99) ^ (77 ^ 2)) & (((81 ^ 57) ^ (109 ^ 0)) ^ (-" ".length()));
                        }
                        return lIIlIlIIIlIll[1];
                    }
                }
                String[] strArr2 = new String[lIIlIlIIIlIll[4]];
                strArr2[lIIlIlIIIlIll[0]] = lIIlIlIIIlIlI[lIIlIlIIIlIll[4]];
                strArr2[lIIlIlIIIlIll[1]] = lIIlIlIIIlIlI[lIIlIlIIIlIll[5]];
                nearest2.interact(strArr2);
                return lIIlIlIIIlIll[1];
            }
            return lIIlIlIIIlIll[0];
        }
        return lIIlIlIIIlIll[0];
    }

    private static void lIlIlIllIIlIIIl() {
        lIIlIlIIIlIll = new int[12];
        lIIlIlIIIlIll[0] = (156 ^ 199) & ((214 ^ 141) ^ (-1));
        lIIlIlIIIlIll[1] = " ".length();
        lIIlIlIIIlIll[2] = (-30737) & 31731;
        lIIlIlIIIlIll[3] = (-((-2449) & 6559)) & (-9218) & 163327;
        lIIlIlIIIlIll[4] = "  ".length();
        lIIlIlIIIlIll[5] = "   ".length();
        lIIlIlIIIlIll[6] = (121 ^ 88) ^ (26 ^ 63);
        lIIlIlIIIlIll[7] = 38 ^ 35;
        lIIlIlIIIlIll[8] = 153 ^ 159;
        lIIlIlIIIlIll[9] = (32 ^ 3) ^ (17 ^ 53);
        lIIlIlIIIlIll[10] = (61 ^ 41) ^ (0 ^ 28);
        lIIlIlIIIlIll[11] = (91 ^ 92) ^ (105 ^ 103);
    }

    private static boolean lIlIlIllIIlIIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean V() {
        if (!lIlIlIllIIlIlll(this.as ? 1 : 0) || lIlIlIllIIlIlll(Players.getAll(player -> {
            return this.ar.a(player.getWorldLocation());
        }).isEmpty() ? 1 : 0)) {
            ?? r0 = lIIlIlIIIlIll[1];
            "".length();
            return ((((105 + 136) - 131) + 41) ^ (((76 + 10) - 53) + 113)) == 0 ? ((79 ^ 52) ^ (104 ^ 88)) & (((219 ^ 175) ^ (188 ^ 131)) ^ (-" ".length())) : r0;
        }
        return lIIlIlIIIlIll[0];
    }
}
