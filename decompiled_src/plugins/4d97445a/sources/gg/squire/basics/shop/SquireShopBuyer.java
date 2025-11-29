package gg.squire.basics.shop;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bU;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bV;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bW;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;
@PluginDescriptor(name = "Squire Shop Buyer", description = "Automatically buys items from the shop", tags = {"squire", "shop", "buy", "auto", "auto-buy", "auto buy", "auto shop", "auto shop buy"}, enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/shop/SquireShopBuyer.class */
public class SquireShopBuyer extends SquirePlugin {
    private static /* synthetic */ String[] lllIlIIlI;
    private /* synthetic */ WorldPoint he;
    private static /* synthetic */ int[] lllIlIlII;

    private static void llIIlIIIllI() {
        lllIlIlII = new int[5];
        lllIlIlII[0] = "   ".length();
        lllIlIlII[1] = ((85 ^ 106) ^ (73 ^ 103)) & (((42 ^ 84) ^ (70 ^ 41)) ^ (-" ".length()));
        lllIlIlII[2] = " ".length();
        lllIlIlII[3] = "  ".length();
        lllIlIlII[4] = 115 ^ 123;
    }

    protected void onStop() {
    }

    private static void llIIlIIIlIl() {
        lllIlIIlI = new String[lllIlIlII[2]];
        lllIlIIlI[lllIlIlII[1]] = llIIlIIIIll("vVT8b+cnOAEVv047TawiRLykMsLW+qdC", "LRcnh");
    }

    public void n(WorldPoint worldPoint) {
        this.he = worldPoint;
    }

    public WorldPoint cW() {
        return this.he;
    }

    private static boolean llIIlIIIlll(Object obj) {
        return obj == null;
    }

    @Provides
    SquireShopConfig x(ConfigManager configManager) {
        return (SquireShopConfig) configManager.getConfig(SquireShopConfig.class);
    }

    private static String llIIlIIIIll(String lIlIlIlIIIlIlIl, String lIlIlIlIIIlIlII) {
        try {
            SecretKeySpec lIlIlIlIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIlIIIlIlII.getBytes(StandardCharsets.UTF_8)), lllIlIlII[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIlII[3], lIlIlIlIIIllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIlIIIlIllI) {
            lIlIlIlIIIlIllI.printStackTrace();
            return null;
        }
    }

    static {
        llIIlIIIllI();
        llIIlIIIlIl();
    }

    protected void onStart() {
        if (llIIlIIIlll(this.he) && llIIlIIlIII(Players.getLocal())) {
            this.he = Players.getLocal().getWorldLocation();
        }
    }

    private static boolean llIIlIIlIIl(int i2) {
        return i2 != 0;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lllIlIlII[0]];
        clsArr[lllIlIlII[1]] = bV.class;
        clsArr[lllIlIlII[2]] = bW.class;
        clsArr[lllIlIlII[3]] = bU.class;
        return clsArr;
    }

    @Subscribe
    private void a(ChatMessage chatMessage) {
        if (llIIlIIlIIl(chatMessage.getMessage().contains(lllIlIIlI[lllIlIlII[1]]) ? 1 : 0)) {
            forceStop();
        }
    }

    private static boolean llIIlIIlIII(Object obj) {
        return obj != null;
    }
}
