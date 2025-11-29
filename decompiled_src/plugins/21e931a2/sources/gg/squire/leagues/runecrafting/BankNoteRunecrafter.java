package gg.squire.leagues.runecrafting;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.e.u.e.s.r.a.l.q.p000.p0010.s.p0022.p0032.u.e.p004.g.p0055.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@PluginDescriptor(name = "[Leagues] Runecrafter", enabledByDefault = false)
@SquireUtil
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:gg/squire/leagues/runecrafting/BankNoteRunecrafter.class */
public class BankNoteRunecrafter extends SquirePlugin {
    private static /* synthetic */ String[] lIIll;
    private static /* synthetic */ int[] lIlII;

    private static String lllIlI(String llllllIIIlIIlII, String llllllIIIlIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIIIlIIllI = Cipher.getInstance("Blowfish");
            llllllIIIlIIllI.init(lIlII[2], secretKeySpec);
            return new String(llllllIIIlIIllI.doFinal(Base64.getDecoder().decode(llllllIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIIIlIIlIl) {
            llllllIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lllllI() {
        lIlII = new int[6];
        lIlII[0] = ((128 ^ 139) ^ (134 ^ 178)) & (((178 ^ 162) ^ (131 ^ 172)) ^ (-" ".length()));
        lIlII[1] = " ".length();
        lIlII[2] = "  ".length();
        lIlII[3] = "   ".length();
        lIlII[4] = 178 ^ 182;
        lIlII[5] = 200 ^ 192;
    }

    private static String lllIll(String llllllIIlIIlIIl, String llllllIIlIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIIlIIIllI.getBytes(StandardCharsets.UTF_8)), lIlII[5]), "DES");
            Cipher llllllIIlIIlIll = Cipher.getInstance("DES");
            llllllIIlIIlIll.init(lIlII[2], secretKeySpec);
            return new String(llllllIIlIIlIll.doFinal(Base64.getDecoder().decode(llllllIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIIlIIlIlI) {
            llllllIIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static void llllIl() {
        lIIll = new String[lIlII[4]];
        lIIll[lIlII[0]] = lllIlI("Ak0AhQT4SDQ8HT0ArWIfQA==", "MMQAL");
        lIIll[lIlII[1]] = lllIll("PQnbm3E51Lfaed4r2GZUpA==", "ruBLS");
        lIIll[lIlII[2]] = lllIlI("X5wG8MTEaoo=", "LchJY");
        lIIll[lIlII[3]] = llllII("CgAjFSMMFg==", "osPpM");
    }

    private static String llllII(String llllllIIIlllIIl, String llllllIIIlllIII) {
        String llllllIIIlllIIl2 = new String(Base64.getDecoder().decode(llllllIIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIIIllIlll = new StringBuilder();
        char[] llllllIIIllIllI = llllllIIIlllIII.toCharArray();
        int llllllIIIllIlIl = lIlII[0];
        char[] charArray = llllllIIIlllIIl2.toCharArray();
        int length = charArray.length;
        int llllllIIIlIllIl = lIlII[0];
        while (lIIIIlI(llllllIIIlIllIl, length)) {
            char llllllIIIlllIlI = charArray[llllllIIIlIllIl];
            llllllIIIllIlll.append((char) (llllllIIIlllIlI ^ llllllIIIllIllI[llllllIIIllIlIl % llllllIIIllIllI.length]));
            "".length();
            llllllIIIllIlIl++;
            llllllIIIlIllIl++;
            "".length();
            if ((69 ^ 65) < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllIIIllIlll);
    }

    protected Class<?>[] tasks() {
        return new Class[lIlII[0]];
    }

    private static boolean lIIIIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llllll(int i2) {
        return i2 == 0;
    }

    private static boolean lIIIIII(int i2, int i3) {
        return i2 == i3;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (llllll(Inventory.contains(item -> {
            return item.getName().contains(lIIll[lIlII[3]]);
        }) ? 1 : 0)) {
            return;
        }
        if (llllll(Inventory.isFull() ? 1 : 0)) {
            Inventory.use(item2 -> {
                if (lIIIIIl(item2.getName().contains(lIIll[lIlII[2]]) ? 1 : 0) && lIIIIIl(item2.isNoted() ? 1 : 0)) {
                    ?? r0 = lIlII[1];
                    "".length();
                    return (-" ".length()) > 0 ? ((98 ^ 52) ^ (29 ^ 64)) & (((228 ^ 177) ^ (66 ^ 28)) ^ (-" ".length())) : r0;
                }
                return lIlII[0];
            }, item3 -> {
                if (lIIIIII(item3.getId(), a.a)) {
                    ?? r0 = lIlII[1];
                    "".length();
                    return (-" ".length()) >= 0 ? ((((65 + 158) - 36) + 7) ^ (((96 + 72) - 98) + 58)) & (((207 ^ 134) ^ (0 ^ 11)) ^ (-" ".length())) : r0;
                }
                return lIlII[0];
            });
            "".length();
        }
        TileObjects.getNearest(tileObject -> {
            String[] strArr = new String[lIlII[1]];
            strArr[lIlII[0]] = lIIll[lIlII[1]];
            return tileObject.hasAction(strArr);
        }).interact(lIIll[lIlII[0]]);
    }

    protected void onStart() {
    }

    protected void onStop() {
    }

    static {
        lllllI();
        llllIl();
    }

    private static boolean lIIIIIl(int i2) {
        return i2 != 0;
    }
}
