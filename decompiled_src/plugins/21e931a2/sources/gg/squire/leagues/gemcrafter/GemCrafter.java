package gg.squire.leagues.gemcrafter;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.widgets.Production;
@PluginDescriptor(name = "[Leagues] Gem Crafter", enabledByDefault = false)
@SquireUtil
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:gg/squire/leagues/gemcrafter/GemCrafter.class */
public class GemCrafter extends SquirePlugin {
    private static /* synthetic */ int[] lIllI;
    private /* synthetic */ int e;
    private static /* synthetic */ String[] lIlIl;

    private static void lIIIlIl() {
        lIlIl = new String[lIllI[2]];
        lIlIl[lIllI[0]] = lIIIIll("b5Tni/FhQuUv7xJiZESdPg==", "EQdhc");
        lIlIl[lIllI[1]] = lIIIlII("MQgmIgc=", "ezGFb");
        lIlIl[lIllI[5]] = lIIIIll("H7nLIZDkfSrk2aq5dreuCQ==", "qALDk");
        lIlIl[lIllI[7]] = lIIIlII("AxcUPiY=", "WeuZC");
    }

    private static boolean lIIlIII(int i2) {
        return i2 != 0;
    }

    private static boolean lIIIlll(int i2) {
        return i2 > 0;
    }

    private static boolean lIIlIlI(int i2, int i3) {
        return i2 < i3;
    }

    protected void onStart() {
    }

    static {
        lIIIllI();
        lIIIlIl();
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int i2 = this.e;
        this.e = i2 - lIllI[1];
        if (lIIIlll(i2)) {
            return;
        }
        if (lIIlIII(Players.getLocal().isAnimating() ? 1 : 0)) {
            this.e = lIllI[2];
        } else if (!lIIlIII(Inventory.isFull() ? 1 : 0)) {
            if (lIIlIIl(Shop.isOpen() ? 1 : 0)) {
                String[] strArr = new String[lIllI[1]];
                strArr[lIllI[0]] = lIlIl[lIllI[5]];
                NPCs.getNearest(strArr).interact(lIlIl[lIllI[7]]);
                this.e = lIllI[2];
                return;
            }
            int llllllIIIIIllll = lIllI[0];
            while (lIIlIlI(llllllIIIIIllll, lIllI[8])) {
                Shop.buyOne(lIllI[3]);
                llllllIIIIIllll++;
                "".length();
                if ((((5 ^ 42) ^ (94 ^ 72)) & (((47 ^ 98) ^ (54 ^ 66)) ^ (-" ".length()))) != 0) {
                    return;
                }
            }
        } else {
            int[] iArr = new int[lIllI[1]];
            iArr[lIllI[0]] = lIllI[3];
            if (lIIlIII(Inventory.contains(iArr) ? 1 : 0)) {
                if (lIIlIII(Production.isOpen() ? 1 : 0)) {
                    Production.choosePreviousOption();
                    this.e = lIllI[2];
                    return;
                }
                Inventory.use(lIllI[4], lIllI[3]);
                "".length();
                this.e = lIllI[5];
            } else if (!lIIlIIl(Shop.isOpen() ? 1 : 0)) {
                Shop.sellFifty(lIllI[6]);
            } else {
                String[] strArr2 = new String[lIllI[1]];
                strArr2[lIllI[0]] = lIlIl[lIllI[0]];
                NPCs.getNearest(strArr2).interact(lIlIl[lIllI[1]]);
                this.e = lIllI[2];
            }
        }
    }

    private static String lIIIlII(String llllllIIIIIIlII, String llllllIIIIIIIll) {
        String str = new String(Base64.getDecoder().decode(llllllIIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIIIIIIIlI = new StringBuilder();
        char[] charArray = llllllIIIIIIIll.toCharArray();
        int lllllIllllllIll = lIllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lllllIllllllIII = lIllI[0];
        while (lIIlIlI(lllllIllllllIII, length)) {
            llllllIIIIIIIlI.append((char) (charArray2[lllllIllllllIII] ^ charArray[lllllIllllllIll % charArray.length]));
            "".length();
            lllllIllllllIll++;
            lllllIllllllIII++;
            "".length();
            if ((-" ".length()) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllIIIIIIIlI);
    }

    private static boolean lIIlIIl(int i2) {
        return i2 == 0;
    }

    protected Class<?>[] tasks() {
        return new Class[lIllI[0]];
    }

    private static void lIIIllI() {
        lIllI = new int[9];
        lIllI[0] = ((117 ^ 25) ^ (245 ^ 197)) & (((32 ^ 16) ^ (235 ^ 135)) ^ (-" ".length()));
        lIllI[1] = " ".length();
        lIllI[2] = (26 ^ 88) ^ (212 ^ 146);
        lIllI[3] = (-((-4673) & 31715)) & (-9) & 28671;
        lIllI[4] = (-8481) & 10235;
        lIllI[5] = "  ".length();
        lIllI[6] = (-((-12001) & 16115)) & (-8489) & 14207;
        lIllI[7] = "   ".length();
        lIllI[8] = (((117 + 101) - 145) + 61) ^ (((92 + 3) - (-26)) + 21);
    }

    private static String lIIIIll(String lllllIllllIllll, String lllllIllllIlllI) {
        try {
            SecretKeySpec lllllIlllllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIllllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIlllllIIIl = Cipher.getInstance("Blowfish");
            lllllIlllllIIIl.init(lIllI[5], lllllIlllllIIlI);
            return new String(lllllIlllllIIIl.doFinal(Base64.getDecoder().decode(lllllIllllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIlllllIIII) {
            lllllIlllllIIII.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }
}
