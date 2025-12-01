package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
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
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Claiming chest", priority = 150, blocking = true, register = true)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.w  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/w.class */
public class w extends Task {
    private final /* synthetic */ SquireBarrows ak;
    private static /* synthetic */ String[] llllIIIlIlI;
    private static /* synthetic */ int[] llllIIIlIll;

    private static boolean lIllIIlllIlIll(Object obj) {
        return obj == null;
    }

    private static String lIllIIlllIIlII(String llllllllllllllllIIIlllIlIlIlIIll, String llllllllllllllllIIIlllIlIlIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIlIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIlIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIlllIlIlIIllll) {
            llllllllllllllllIIIlllIlIlIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlllIlIlI(int i) {
        return i == 0;
    }

    @Inject
    public w(SquireBarrows squireBarrows) {
        this.ak = squireBarrows;
    }

    private static boolean lIllIIlllIllII(int i, int i2) {
        return i < i2;
    }

    private static void lIllIIlllIlIII() {
        llllIIIlIll = new int[9];
        llllIIIlIll[0] = ((((92 + 58) - 3) + 29) ^ (((113 + 143) - 196) + 85)) & (((((181 + 186) - 182) + 5) ^ (((107 + 78) - 117) + 91)) ^ (-" ".length()));
        llllIIIlIll[1] = " ".length();
        llllIIIlIll[2] = "   ".length();
        llllIIIlIll[3] = "  ".length();
        llllIIIlIll[4] = 175 ^ 167;
        llllIIIlIll[5] = (100 ^ 36) ^ (2 ^ 68);
        llllIIIlIll[6] = (((67 + 120) - 165) + 139) ^ (((110 + 69) - 141) + 127);
        llllIIIlIll[7] = 123 ^ 126;
        llllIIIlIll[8] = (232 ^ 149) ^ (28 ^ 102);
    }

    static {
        lIllIIlllIlIII();
        lIllIIlllIIlll();
    }

    private static boolean lIllIIlllIllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIllIIlllIllll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (!lIllIIlllIlIlI(chatMessage.getMessage().contains(llllIIIlIlI[llllIIIlIll[6]]) ? 1 : 0) || lIllIIlllIlIIl(chatMessage.getMessage().contains(llllIIIlIlI[llllIIIlIll[7]]) ? 1 : 0)) {
            Log.info(llllIIIlIlI[llllIIIlIll[5]]);
            this.ak.b((boolean) llllIIIlIll[1]);
        }
    }

    private static boolean lIllIIlllIllIl(Object obj) {
        return obj != null;
    }

    private static void lIllIIlllIIlll() {
        llllIIIlIlI = new String[llllIIIlIll[4]];
        llllIIIlIlI[llllIIIlIll[0]] = lIllIIlllIIlII("ihbuJOZwrJA=", "VKBRd");
        llllIIIlIlI[llllIIIlIll[1]] = lIllIIlllIIlIl("NBQ+", "quJAf");
        llllIIIlIlI[llllIIIlIll[3]] = lIllIIlllIIlII("0gCE0ff63fQ=", "Svmkn");
        llllIIIlIlI[llllIIIlIll[2]] = lIllIIlllIIlII("AblDIQG6iXM=", "hlAFR");
        llllIIIlIlI[llllIIIlIll[6]] = lIllIIlllIIlIl("LTYAKwMYJFI6BAokBnkPACIcLQ==", "oWrYl");
        llllIIIlIlI[llllIIIlIll[7]] = lIllIIlllIIlIl("JhEJTgAaHB8aQxsKTAsOAg0V", "rylnc");
        llllIIIlIlI[llllIIIlIll[5]] = lIllIIlllIIllI("9I+PgJK3Dtskpihxrbvh3E+/bcDqrXvzpg8DQ4qY1cA=", "DnNNL");
        llllIIIlIlI[llllIIIlIll[8]] = lIllIIlllIIlIl("AxIm", "FsRxA");
    }

    private static boolean lIllIIlllIlIIl(int i) {
        return i != 0;
    }

    private static String lIllIIlllIIlIl(String llllllllllllllllIIIlllIlIlIIIIll, String llllllllllllllllIIIlllIlIlIIIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIlllIlIlIIIIIl = new StringBuilder();
        char[] charArray = llllllllllllllllIIIlllIlIlIIIIlI.toCharArray();
        int llllllllllllllllIIIlllIlIIllllll = llllIIIlIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIIIlIll[0];
        while (lIllIIlllIllII(i, length)) {
            char llllllllllllllllIIIlllIlIlIIIlII = charArray2[i];
            llllllllllllllllIIIlllIlIlIIIIIl.append((char) (llllllllllllllllIIIlllIlIlIIIlII ^ charArray[llllllllllllllllIIIlllIlIIllllll % charArray.length]));
            "".length();
            llllllllllllllllIIIlllIlIIllllll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIIlllIlIlIIIIIl);
    }

    private static String lIllIIlllIIllI(String llllllllllllllllIIIlllIlIIlIlllI, String llllllllllllllllIIIlllIlIIlIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), llllIIIlIll[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIlIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIlIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIlllIlIIlIllll) {
            llllllllllllllllIIIlllIlIIlIllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    public boolean run() {
        if (!lIllIIlllIlIIl(this.ak.h() ? 1 : 0) || lIllIIlllIlIIl(this.ak.v() ? 1 : 0)) {
            return llllIIIlIll[0];
        }
        if (lIllIIlllIlIlI(this.ak.g() ? 1 : 0)) {
            return llllIIIlIll[0];
        }
        String[] strArr = new String[llllIIIlIll[1]];
        strArr[llllIIIlIll[0]] = llllIIIlIlI[llllIIIlIll[0]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIllIIlllIlIll(nearest)) {
            return llllIIIlIll[0];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr2 = new String[llllIIIlIll[1]];
            strArr2[llllIIIlIll[0]] = llllIIIlIlI[llllIIIlIll[8]];
            return item.hasAction(strArr2);
        });
        if (lIllIIlllIllII(Inventory.getFreeSlots(), llllIIIlIll[2]) && lIllIIlllIllIl(first)) {
            first.interact(llllIIIlIlI[llllIIIlIll[1]]);
            sleep(llllIIIlIll[2]);
            return llllIIIlIll[1];
        }
        String[] strArr2 = new String[llllIIIlIll[1]];
        strArr2[llllIIIlIll[0]] = llllIIIlIlI[llllIIIlIll[3]];
        if (lIllIIlllIlIlI(nearest.hasAction(strArr2) ? 1 : 0) && lIllIIlllIlIIl(Reachable.isInteractable(nearest) ? 1 : 0) && !lIllIIlllIlllI(nearest.distanceTo(Players.getLocal().getWorldLocation()), llllIIIlIll[4])) {
            if (lIllIIlllIllII(this.ak.e(), llllIIIlIll[5])) {
                return llllIIIlIll[0];
            }
            NPC y = this.ak.y();
            if (lIllIIlllIllIl(y) && lIllIIlllIlIlI(y.isDead() ? 1 : 0)) {
                return llllIIIlIll[0];
            }
            nearest.interact(llllIIIlIlI[llllIIIlIll[2]]);
            return llllIIIlIll[1];
        }
        return llllIIIlIll[0];
    }

    private static boolean lIllIIlllIlllI(int i, int i2) {
        return i > i2;
    }
}
