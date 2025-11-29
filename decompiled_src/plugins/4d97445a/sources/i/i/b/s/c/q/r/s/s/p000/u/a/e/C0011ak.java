package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Teleporting out", priority = 20, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ak  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ak.class */
public class C0011ak extends Task {
    private static /* synthetic */ String[] llIIIlIll;
    private final /* synthetic */ C0000a cP;
    private static /* synthetic */ int[] llIIIllII;

    private static void lIlIlIlllll() {
        llIIIlIll = new String[llIIIllII[10]];
        llIIIlIll[llIIIllII[1]] = lIlIlIlllII("h8yuvmrUhq4t+jLGantQKA==", "Oafql");
        llIIIlIll[llIIIllII[0]] = lIlIlIlllIl("d2LXeSRzi1M=", "cHkTJ");
        llIIIlIll[llIIIllII[8]] = lIlIlIlllIl("X1J5jmID6pjDgAeM6gEAFw==", "vnFKg");
        llIIIlIll[llIIIllII[9]] = lIlIlIllllI("Kykt", "nHYYz");
    }

    private static boolean lIlIllIIIll(int i2, int i3) {
        return i2 <= i3;
    }

    static {
        lIlIllIIIII();
        lIlIlIlllll();
    }

    private static boolean lIlIllIIIlI(Object obj) {
        return obj == null;
    }

    private static void lIlIllIIIII() {
        llIIIllII = new int[12];
        llIIIllII[0] = " ".length();
        llIIIllII[1] = ((22 ^ 73) ^ (99 ^ 110)) & (((0 ^ 10) ^ (251 ^ 163)) ^ (-" ".length()));
        llIIIllII[2] = (-7219) & 15931;
        llIIIllII[3] = (-26625) & 28454;
        llIIIllII[4] = (-((-12721) & 31167)) & (-257) & 28591;
        llIIIllII[5] = (14 ^ 11) ^ (1 ^ 28);
        llIIIllII[6] = (((137 + 70) - 80) + 34) ^ (((36 + 139) - 46) + 53);
        llIIIllII[7] = 58 ^ 36;
        llIIIllII[8] = "  ".length();
        llIIIllII[9] = "   ".length();
        llIIIllII[10] = 176 ^ 180;
        llIIIllII[11] = (207 ^ 167) ^ (162 ^ 194);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    private boolean U() {
        Spell spell = (Spell) Arrays.stream(SpellBook.Standard.values()).filter(standard -> {
            if (lIlIllIIlII(standard.canCast() ? 1 : 0) && lIlIllIIlII(standard.toString().toLowerCase().contains(llIIIlIll[llIIIllII[1]]) ? 1 : 0)) {
                ?? r0 = llIIIllII[0];
                "".length();
                return 0 != 0 ? ((84 ^ 75) ^ (12 ^ 42)) & (((16 ^ 24) ^ (189 ^ 140)) ^ (-" ".length())) : r0;
            }
            return llIIIllII[1];
        }).findFirst().orElse(null);
        if (lIlIllIIIlI(spell)) {
            return llIIIllII[1];
        }
        Magic.cast(spell);
        return llIIIllII[0];
    }

    private static boolean lIlIllIIlIl(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[llIIIllII[0]];
        iArr[llIIIllII[1]] = llIIIllII[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIllIIIIl(new WorldArea(llIIIllII[3], llIIIllII[4], llIIIllII[5], llIIIllII[6], llIIIllII[1]).contains(Players.getLocal()) ? 1 : 0) && !lIlIllIIIlI(nearest)) {
            return (lIlIllIIIll(Combat.getCurrentHealth(), llIIIllII[7]) && lIlIllIIIIl(Inventory.contains(item -> {
                String str = llIIIlIll[llIIIllII[9]];
                return item.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            }) ? 1 : 0)) ? U() : (lIlIllIIIIl(Prayers.getPoints()) && lIlIllIIIIl(Inventory.contains(item2 -> {
                if (!lIlIllIIIIl(item2.getName().startsWith(llIIIlIll[llIIIllII[0]]) ? 1 : 0) || lIlIllIIlII(item2.getName().startsWith(llIIIlIll[llIIIllII[8]]) ? 1 : 0)) {
                    ?? r0 = llIIIllII[0];
                    "".length();
                    return (-" ".length()) > 0 ? ((250 ^ 135) ^ (227 ^ 167)) & (((101 ^ 50) ^ (127 ^ 17)) ^ (-" ".length())) : r0;
                }
                return llIIIllII[1];
            }) ? 1 : 0)) ? U() : llIIIllII[1];
        }
        return llIIIllII[1];
    }

    @Inject
    private C0011ak(C0000a c0000a) {
        this.cP = c0000a;
    }

    private static boolean lIlIllIIlII(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIllIIIIl(int i2) {
        return i2 == 0;
    }

    private static String lIlIlIllllI(String lIllIllIllIllII, String lIllIllIllIlIll) {
        String str = new String(Base64.getDecoder().decode(lIllIllIllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIllIllIllIlIIl = lIllIllIllIlIll.toCharArray();
        int lIllIllIllIlIII = llIIIllII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = llIIIllII[1];
        while (lIlIllIIlIl(i2, length)) {
            char lIllIllIllIllIl = charArray[i2];
            sb.append((char) (lIllIllIllIllIl ^ lIllIllIllIlIIl[lIllIllIllIlIII % lIllIllIllIlIIl.length]));
            "".length();
            lIllIllIllIlIII++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIlIlllIl(String lIllIllIlIIlIlI, String lIllIllIlIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), llIIIllII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIllII[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIllIlIIlIll) {
            lIllIllIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlllII(String lIllIllIlIlIlll, String lIllIllIlIlIllI) {
        try {
            SecretKeySpec lIllIllIlIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIllIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIllIlIllIIl = Cipher.getInstance("Blowfish");
            lIllIllIlIllIIl.init(llIIIllII[8], lIllIllIlIllIlI);
            return new String(lIllIllIlIllIIl.doFinal(Base64.getDecoder().decode(lIllIllIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIllIlIllIII) {
            lIllIllIlIllIII.printStackTrace();
            return null;
        }
    }
}
