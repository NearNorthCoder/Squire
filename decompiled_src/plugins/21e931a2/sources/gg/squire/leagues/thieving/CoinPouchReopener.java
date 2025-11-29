package gg.squire.leagues.thieving;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@PluginDescriptor(name = "[Leagues] Pickpocket nearest", enabledByDefault = false)
@SquireUtil
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:gg/squire/leagues/thieving/CoinPouchReopener.class */
public class CoinPouchReopener extends SquirePlugin {
    private static /* synthetic */ int[] lIlI;
    private static /* synthetic */ String[] lIII;

    private static boolean llIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIll(int i2, int i3) {
        return i2 >= i3;
    }

    static {
        llIII();
        lIlll();
    }

    private static String lIlIl(String lllllllIlIIIIlI, String lllllllIlIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), lIlI[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllIlIIIIll) {
            lllllllIlIIIIll.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Actor interacting = Players.getLocal().getInteracting();
        if (llIIl(interacting)) {
            NPC nearest = NPCs.getNearest(npc -> {
                String[] strArr = new String[lIlI[1]];
                strArr[lIlI[0]] = lIII[lIlI[5]];
                return npc.hasAction(strArr);
            });
            if (llIIl(nearest)) {
                return;
            }
            nearest.interact(lIII[lIlI[0]]);
            return;
        }
        String[] strArr = new String[lIlI[1]];
        strArr[lIlI[0]] = lIII[lIlI[1]];
        Item first = Inventory.getFirst(strArr);
        if (llIlI(first) && llIll(first.getQuantity(), lIlI[2])) {
            first.interact(lIII[lIlI[3]]);
            interacting.interact(lIII[lIlI[4]]);
        }
    }

    private static void llIII() {
        lIlI = new int[8];
        lIlI[0] = (57 ^ 113) & ((197 ^ 141) ^ (-1));
        lIlI[1] = " ".length();
        lIlI[2] = 1 ^ 21;
        lIlI[3] = "  ".length();
        lIlI[4] = "   ".length();
        lIlI[5] = 139 ^ 143;
        lIlI[6] = 141 ^ 136;
        lIlI[7] = (((170 + 5) - 98) + 106) ^ (((77 + 173) - 92) + 33);
    }

    private static boolean lllII(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llIIl(Object obj) {
        return obj == null;
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIlI[0]];
    }

    private static String lIllI(String lllllllIllIIlII, String lllllllIlIllllI) {
        String lllllllIllIIlII2 = new String(Base64.getDecoder().decode(lllllllIllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllIllIIIlI = new StringBuilder();
        char[] charArray = lllllllIlIllllI.toCharArray();
        int lllllllIllIIIII = lIlI[0];
        char[] charArray2 = lllllllIllIIlII2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlI[0];
        while (lllII(i2, length)) {
            lllllllIllIIIlI.append((char) (charArray2[i2] ^ charArray[lllllllIllIIIII % charArray.length]));
            "".length();
            lllllllIllIIIII++;
            i2++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(lllllllIllIIIlI);
    }

    private static void lIlll() {
        lIII = new String[lIlI[6]];
        lIII[lIlI[0]] = lIll("FShJtTDU1c+IMvY4+ToYdA==", "NImAu");
        lIII[lIlI[1]] = lIlIl("DU7nlWvSk4pcHLl/Ga2qqQ==", "rDErm");
        lIII[lIlI[3]] = lIllI("KiQQOHQEOBk=", "eTuVY");
        lIII[lIlI[4]] = lIllI("NCYoOjkLLCA0PQ==", "dOKQI");
        lIII[lIlI[5]] = lIllI("NS8LPAgKJQMyDA==", "eFhWx");
    }

    private static String lIll(String lllllllIlIIllll, String lllllllIlIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllIlIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllIlIlIIIl = Cipher.getInstance("Blowfish");
            lllllllIlIlIIIl.init(lIlI[3], secretKeySpec);
            return new String(lllllllIlIlIIIl.doFinal(Base64.getDecoder().decode(lllllllIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllIlIlIIII) {
            lllllllIlIlIIII.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }
}
