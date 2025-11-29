package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandos;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Teleporting out", priority = 100, blocking = true, register = true)
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.l  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/l.class */
public class l extends Task {
    private final /* synthetic */ SquireBandos K;
    private final /* synthetic */ e I;
    private static /* synthetic */ int[] lllIIlIIIII;
    private final /* synthetic */ SquireBandosConfig J;
    private /* synthetic */ boolean L;
    private static /* synthetic */ String[] lllIIIlllll;

    private static void lIlIlllIlIIIIl() {
        lllIIIlllll = new String[lllIIlIIIII[4]];
        lllIIIlllll[lllIIlIIIII[1]] = lIlIlllIIllllI("rKRhgHfVIIk=", "DhYPk");
        lllIIIlllll[lllIIlIIIII[0]] = lIlIlllIIllllI("pQ3oKnGBhm7Da5q2ZQBUmQ==", "oKaOh");
        lllIIIlllll[lllIIlIIIII[5]] = lIlIlllIIlllll("3HkGMS3TOmMZYLDJRYCLfw==", "kFRjI");
        lllIIIlllll[lllIIlIIIII[7]] = lIlIlllIIllllI("lX1xOJ34kCQ=", "YUgTp");
        lllIIIlllll[lllIIlIIIII[8]] = lIlIlllIlIIIII("GjQlHgQRKC9JGh09LhpUDDdqCxFYOyIIBh89Lg==", "xXJit");
        lllIIIlllll[lllIIlIIIII[9]] = lIlIlllIIllllI("DAoDo6qFF24=", "Dfiaq");
        lllIIIlllll[lllIIlIIIII[10]] = lIlIlllIlIIIII("BCwMHgY5OQ==", "WXmso");
    }

    private static boolean lIlIlllIlIIlII(int i) {
        return i != 0;
    }

    private static boolean lIlIlllIlIIllI(Object obj) {
        return obj == null;
    }

    private static String lIlIlllIIllllI(String llllllllllllllllIIlIIlIlllIIlIll, String llllllllllllllllIIlIIlIlllIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIlllIIlIlI.getBytes(StandardCharsets.UTF_8)), lllIIlIIIII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIlIIIII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIlllIIllII) {
            llllllllllllllllIIlIIlIlllIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private void K() {
        if (lIlIlllIlIIlII(this.J.pickupCannon() ? 1 : 0) && lIlIlllIlIIlII(this.I.y() ? 1 : 0)) {
            int[] iArr = new int[lllIIlIIIII[0]];
            iArr[lllIIlIIIII[1]] = lllIIlIIIII[4];
            TileObjects.getNearest(iArr).interact(lllIIIlllll[lllIIlIIIII[1]]);
        } else if (!lIlIlllIlIIlII(this.J.altarTeleport() ? 1 : 0)) {
            L();
        } else {
            String[] strArr = new String[lllIIlIIIII[0]];
            strArr[lllIIlIIIII[1]] = lllIIIlllll[lllIIlIIIII[0]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIlIlllIlIIllI(nearest)) {
                L();
                return;
            }
            nearest.interact(lllIIIlllll[lllIIlIIIII[5]]);
            "".length();
            if ((((240 ^ 149) ^ (125 ^ 87)) & (((((21 + 149) - 135) + 213) ^ (((150 + 44) - 164) + 153)) ^ (-" ".length()))) <= (-" ".length())) {
            }
        }
    }

    private static String lIlIlllIlIIIII(String llllllllllllllllIIlIIlIllIlllIll, String llllllllllllllllIIlIIlIllIlllIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlIIlIllIlllIII = llllllllllllllllIIlIIlIllIlllIlI.toCharArray();
        int llllllllllllllllIIlIIlIllIllIlll = lllIIlIIIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIlIIIII[1];
        while (lIlIlllIlIIlIl(i, length)) {
            char llllllllllllllllIIlIIlIllIllllII = charArray[i];
            sb.append((char) (llllllllllllllllIIlIIlIllIllllII ^ llllllllllllllllIIlIIlIllIlllIII[llllllllllllllllIIlIIlIllIllIlll % llllllllllllllllIIlIIlIllIlllIII.length]));
            "".length();
            llllllllllllllllIIlIIlIllIllIlll++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlIlllIlIIIlI();
        lIlIlllIlIIIIl();
    }

    private static String lIlIlllIIlllll(String llllllllllllllllIIlIIlIllIlIIllI, String llllllllllllllllIIlIIlIllIlIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlIllIlIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlIllIlIlIII.init(lllIIlIIIII[5], secretKeySpec);
            return new String(llllllllllllllllIIlIIlIllIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIllIlIIlll) {
            llllllllllllllllIIlIIlIllIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIIlIl(int i, int i2) {
        return i < i2;
    }

    private static void lIlIlllIlIIIlI() {
        lllIIlIIIII = new int[12];
        lllIIlIIIII[0] = " ".length();
        lllIIlIIIII[1] = ((18 ^ 6) ^ (248 ^ 177)) & (((65 ^ 74) ^ (243 ^ 165)) ^ (-" ".length()));
        lllIIlIIIII[2] = (((89 + 74) - 6) + 21) ^ (((108 + 49) - 127) + 112);
        lllIIlIIIII[3] = (12 ^ 107) ^ (110 ^ 30);
        lllIIlIIIII[4] = (199 ^ 164) ^ (114 ^ 22);
        lllIIlIIIII[5] = "  ".length();
        lllIIlIIIII[6] = (-8323) & 16335;
        lllIIlIIIII[7] = "   ".length();
        lllIIlIIIII[8] = 179 ^ 183;
        lllIIlIIIII[9] = 1 ^ 4;
        lllIIlIIIII[10] = 27 ^ 29;
        lllIIlIIIII[11] = 178 ^ 186;
    }

    private void L() {
        int[] iArr = new int[lllIIlIIIII[0]];
        iArr[lllIIlIIIII[1]] = lllIIlIIIII[6];
        Item first = Inventory.getFirst(iArr);
        if (lIlIlllIlIIllI(first)) {
            Magic.cast(SpellBook.Standard.TELEPORT_TO_HOUSE);
        } else {
            first.interact(lllIIIlllll[lllIIlIIIII[7]]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (!lIlIlllIlIIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lIlIlllIlIIlII(chatMessage.getMessage().contains(lllIIIlllll[lllIIlIIIII[8]]) ? 1 : 0)) {
            this.L = lllIIlIIIII[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    public boolean run() {
        boolean z;
        if (!lIlIlllIlIIIll(this.L ? 1 : 0) || lIlIlllIlIIIll(Inventory.contains(item -> {
            return item.getName().startsWith(lllIIIlllll[lllIIlIIIII[10]]);
        }) ? 1 : 0)) {
            int i = lllIIlIIIII[0];
            "".length();
            z = i;
            if (" ".length() < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            z = lllIIlIIIII[1];
        }
        this.L = z;
        if (lIlIlllIlIIIll(Inventory.contains(item2 -> {
            String str = lllIIIlllll[lllIIlIIIII[9]];
            return item2.hasAction((v1) -> {
                return r1.equals(v1);
            });
        }) ? 1 : 0)) {
            if (lIlIlllIlIIlII(this.I.s() ? 1 : 0) && lIlIlllIlIIlIl(Combat.getCurrentHealth(), lllIIlIIIII[2])) {
                this.L = lllIIlIIIII[0];
                "".length();
                if (((101 ^ 40) ^ (210 ^ 154)) <= 0) {
                    return ((((84 + 22) - (-2)) + 40) ^ (((73 + 153) - 187) + 133)) & (((50 ^ 43) ^ (41 ^ 8)) ^ (-" ".length()));
                }
            } else if (lIlIlllIlIIIll(this.I.s() ? 1 : 0) && lIlIlllIlIIlIl(Combat.getCurrentHealth(), lllIIlIIIII[3])) {
                this.L = lllIIlIIIII[0];
            }
        }
        if (lIlIlllIlIIlII(this.L ? 1 : 0)) {
            if (lIlIlllIlIIIll(this.I.t() ? 1 : 0)) {
                this.K.forceStop();
                "".length();
                if (" ".length() <= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                K();
            }
            return lllIIlIIIII[0];
        }
        return lllIIlIIIII[1];
    }

    private static boolean lIlIlllIlIIIll(int i) {
        return i == 0;
    }

    @Inject
    public l(e eVar, SquireBandosConfig squireBandosConfig, SquireBandos squireBandos) {
        this.I = eVar;
        this.J = squireBandosConfig;
        this.K = squireBandos;
    }
}
