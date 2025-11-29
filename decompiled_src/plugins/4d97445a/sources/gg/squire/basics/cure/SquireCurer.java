package gg.squire.basics.cure;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@SquireUtil
@PluginDescriptor(name = "Squire Cure", description = "Cures Poison", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/cure/SquireCurer.class */
public class SquireCurer extends SquirePlugin {
    private static /* synthetic */ String[] lIllIIlIl;
    private static /* synthetic */ int[] lIllIIllI;

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (lIIlllIIlll(Combat.isPoisoned() ? 1 : 0)) {
            return;
        }
        Item first = Inventory.getFirst(item -> {
            if (!lIIlllIIlll(item.getName().contains(lIllIIlIl[lIllIIllI[1]]) ? 1 : 0) || lIIlllIlIIl(item.getName().contains(lIllIIlIl[lIllIIllI[2]]) ? 1 : 0)) {
                ?? r0 = lIllIIllI[1];
                "".length();
                return (-" ".length()) >= 0 ? ((13 ^ 36) ^ (25 ^ 57)) & (((154 ^ 175) ^ (80 ^ 108)) ^ (-" ".length())) : r0;
            }
            return lIllIIllI[0];
        });
        if (lIIlllIlIII(first)) {
            return;
        }
        first.interact(lIllIIlIl[lIllIIllI[0]]);
    }

    private static String lIIlllIIIlI(String lIllllIlIlIllll, String lIllllIlIlIlllI) {
        String lIllllIlIlIllll2 = new String(Base64.getDecoder().decode(lIllllIlIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIllllIlIlIllII = lIllllIlIlIlllI.toCharArray();
        int lIllllIlIlIlIll = lIllIIllI[0];
        char[] charArray = lIllllIlIlIllll2.toCharArray();
        int length = charArray.length;
        int i2 = lIllIIllI[0];
        while (lIIlllIlIlI(i2, length)) {
            sb.append((char) (charArray[i2] ^ lIllllIlIlIllII[lIllllIlIlIlIll % lIllllIlIlIllII.length]));
            "".length();
            lIllllIlIlIlIll++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIlllIIlII(String lIllllIlIIIllIl, String lIllllIlIIIllII) {
        try {
            SecretKeySpec lIllllIlIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllIlIIIllII.getBytes(StandardCharsets.UTF_8)), lIllIIllI[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIllI[2], lIllllIlIIlIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllllIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllllIlIIIlllI) {
            lIllllIlIIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIIlIl() {
        lIllIIlIl = new String[lIllIIllI[3]];
        lIllIIlIl[lIllIIllI[0]] = lIIlllIIIlI("NREtKB8=", "qcDFt");
        lIllIIlIl[lIllIIllI[1]] = lIIlllIIIll("e8VLzBI8fzLbU/genq0sHg==", "ipGez");
        lIllIIlIl[lIllIIllI[2]] = lIIlllIIlII("3IWS+OO9DMQ=", "BYYdf");
    }

    private static boolean lIIlllIlIII(Object obj) {
        return obj == null;
    }

    private static boolean lIIlllIIlll(int i2) {
        return i2 == 0;
    }

    protected void onStop() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIllIIllI[0]];
    }

    private static String lIIlllIIIll(String lIllllIlIIllIlI, String lIllllIlIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIlIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllllIlIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllllIlIIllIll) {
            lIllllIlIIllIll.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIIllI() {
        lIllIIllI = new int[5];
        lIllIIllI[0] = "   ".length() & ("   ".length() ^ (-" ".length()));
        lIllIIllI[1] = " ".length();
        lIllIIllI[2] = "  ".length();
        lIllIIllI[3] = "   ".length();
        lIllIIllI[4] = 152 ^ 144;
    }

    private static boolean lIIlllIlIlI(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lIIlllIIllI();
        lIIlllIIlIl();
    }

    protected void onStart() {
    }

    private static boolean lIIlllIlIIl(int i2) {
        return i2 != 0;
    }
}
