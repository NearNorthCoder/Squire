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
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bL  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bL.class */
public class bL extends Task {
    private static /* synthetic */ String[] llIIIllll;
    private static /* synthetic */ int[] llIIlIIII;
    private final /* synthetic */ C0000a gF;

    @Inject
    private bL(C0000a c0000a) {
        this.gF = c0000a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    private boolean U() {
        Spell spell = (Spell) Arrays.stream(SpellBook.Standard.values()).filter(standard -> {
            if (lIlIlllIIIl(standard.canCast() ? 1 : 0) && lIlIlllIIIl(standard.toString().toLowerCase().contains(llIIIllll[llIIlIIII[1]]) ? 1 : 0)) {
                ?? r0 = llIIlIIII[0];
                "".length();
                return ((212 ^ 132) ^ (112 ^ 36)) != ((((144 + 72) - 46) + 16) ^ (((21 + 158) - 121) + 132)) ? ((((131 + 54) - 124) + 88) ^ (((120 + 75) - 143) + 116)) & (((((11 + 141) - 41) + 71) ^ (((66 + 64) - 40) + 49)) ^ (-" ".length())) : r0;
            }
            return llIIlIIII[1];
        }).findFirst().orElse(null);
        if (lIlIllIllll(spell)) {
            return llIIlIIII[1];
        }
        Magic.cast(spell);
        return llIIlIIII[0];
    }

    private static String lIlIllIlIll(String lIllIllIIIllIIl, String lIllIllIIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIllIIIllIII.getBytes(StandardCharsets.UTF_8)), llIIlIIII[11]), "DES");
            Cipher lIllIllIIIllIll = Cipher.getInstance("DES");
            lIllIllIIIllIll.init(llIIlIIII[8], secretKeySpec);
            return new String(lIllIllIIIllIll.doFinal(Base64.getDecoder().decode(lIllIllIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIllIIIlIlIl) {
            lIllIllIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlllIIIl(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[llIIlIIII[0]];
        iArr[llIIlIIII[1]] = llIIlIIII[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIllIlllI(new WorldArea(llIIlIIII[3], llIIlIIII[4], llIIlIIII[5], llIIlIIII[6], llIIlIIII[1]).contains(Players.getLocal()) ? 1 : 0) && !lIlIllIllll(nearest)) {
            return (lIlIlllIIII(Combat.getCurrentHealth(), llIIlIIII[7]) && lIlIllIlllI(Inventory.contains(item -> {
                String str = llIIIllll[llIIlIIII[9]];
                return item.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            }) ? 1 : 0)) ? U() : (lIlIllIlllI(Prayers.getPoints()) && lIlIllIlllI(Inventory.contains(item2 -> {
                if (!lIlIllIlllI(item2.getName().startsWith(llIIIllll[llIIlIIII[0]]) ? 1 : 0) || lIlIlllIIIl(item2.getName().startsWith(llIIIllll[llIIlIIII[8]]) ? 1 : 0)) {
                    ?? r0 = llIIlIIII[0];
                    "".length();
                    return (-" ".length()) > ((((146 + 106) - 181) + 99) ^ (((32 + 84) - 80) + 138)) ? ((((118 + 125) - 172) + 61) ^ (((78 + 94) - 42) + 8)) & (((68 ^ 75) ^ " ".length()) ^ (-" ".length())) : r0;
                }
                return llIIlIIII[1];
            }) ? 1 : 0)) ? U() : llIIlIIII[1];
        }
        return llIIlIIII[1];
    }

    private static String lIlIllIlIlI(String lIllIllIIIIllII, String lIllIllIIIIlIll) {
        try {
            SecretKeySpec lIllIllIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIllIIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIllIIIIlllI = Cipher.getInstance("Blowfish");
            lIllIllIIIIlllI.init(llIIlIIII[8], lIllIllIIIIllll);
            return new String(lIllIllIIIIlllI.doFinal(Base64.getDecoder().decode(lIllIllIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIllIIIIllIl) {
            lIllIllIIIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllI(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIlllIIII(int i2, int i3) {
        return i2 <= i3;
    }

    private static void lIlIllIllIl() {
        llIIlIIII = new int[12];
        llIIlIIII[0] = " ".length();
        llIIlIIII[1] = ((145 ^ 189) ^ (106 ^ 30)) & (((((192 + 130) - 183) + 79) ^ (((102 + 41) - 15) + 2)) ^ (-" ".length()));
        llIIlIIII[2] = (-3169) & 11881;
        llIIlIIII[3] = (-((-1109) & 21597)) & (-10258) & 32575;
        llIIlIIII[4] = (-275) & 10163;
        llIIlIIII[5] = (113 ^ 104) ^ " ".length();
        llIIlIIII[6] = (89 ^ 28) ^ (253 ^ 175);
        llIIlIIII[7] = (117 ^ 65) ^ (154 ^ 176);
        llIIlIIII[8] = "  ".length();
        llIIlIIII[9] = "   ".length();
        llIIlIIII[10] = (((85 + 43) - 50) + 56) ^ (((49 + 76) - 81) + 86);
        llIIlIIII[11] = (3 ^ 49) ^ (69 ^ 127);
    }

    static {
        lIlIllIllIl();
        lIlIllIllII();
    }

    private static void lIlIllIllII() {
        llIIIllll = new String[llIIlIIII[10]];
        llIIIllll[llIIlIIII[1]] = lIlIllIlIlI("UDw/GOAQ1zDjV5QcPB80YA==", "UAAKO");
        llIIIllll[llIIlIIII[0]] = lIlIllIlIll("YdBZMApHTX8=", "EfIgh");
        llIIIllll[llIIlIIII[8]] = lIlIllIlIll("/1mdXD6fJhrxkoJHb7h7BA==", "ckidj");
        llIIIllll[llIIlIIII[9]] = lIlIllIlIll("3LEifjfhd6k=", "cpCvb");
    }
}
