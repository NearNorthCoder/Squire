package gg.squire.basics.combat.AutoEater;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@PluginDescriptor(name = "Squire Auto Eater", description = "Auto eats", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/combat/AutoEater/AutoEat.class */
public class AutoEat extends SquirePlugin {
    private static /* synthetic */ String[] llIIllIl;
    @Inject
    /* synthetic */ ClientThread bB;
    @Inject
    /* synthetic */ AutoEatConfig bF;
    @Inject
    /* synthetic */ ConfigManager bA;
    private /* synthetic */ int bD = llIIlllI[0];
    /* synthetic */ WorldPoint bC;
    private static /* synthetic */ int[] llIIlllI;

    protected Class<?>[] tasks() {
        return new Class[llIIlllI[1]];
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int i2;
        if (lIlllIIIII(this.bF.eatHP(), Combat.getCurrentHealth())) {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[llIIlllI[2]];
                strArr[llIIlllI[1]] = llIIllIl[llIIlllI[5]];
                return item.hasAction(strArr);
            });
            if (lIlllIIIIl(first)) {
                first.interact(llIIllIl[llIIlllI[1]]);
                Time.sleep(1L);
                "".length();
            }
        }
        if (lIlllIIIII(this.bF.drinkPrayAt(), Prayers.getPoints())) {
            Item first2 = Inventory.getFirst(item2 -> {
                if (!lIlllIIlIl(item2.getName().contains(llIIllIl[llIIlllI[3]]) ? 1 : 0) || lIlllIIIll(item2.getName().contains(llIIllIl[llIIlllI[4]]) ? 1 : 0)) {
                    ?? r0 = llIIlllI[2];
                    "".length();
                    return " ".length() == 0 ? ((110 ^ 67) ^ (14 ^ 58)) & (((116 ^ 69) ^ (99 ^ 75)) ^ (-" ".length())) : r0;
                }
                return llIIlllI[1];
            });
            if (lIlllIIIIl(first2)) {
                first2.interact(llIIllIl[llIIlllI[2]]);
            }
        }
        if (!lIlllIIIlI(Players.getLocal().getInteracting()) || lIlllIIIIl(NPCs.getNearest(npc -> {
            if (lIlllIIlII(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = llIIlllI[2];
                "".length();
                return (-(((58 ^ 106) & ((28 ^ 76) ^ (-1))) ^ (59 ^ 63))) >= 0 ? ((((106 + 10) - 7) + 22) ^ (((181 + 152) - 313) + 177)) & (((139 ^ 188) ^ (16 ^ 97)) ^ (-" ".length())) & ((((92 ^ 64) ^ (7 ^ 49)) & (((((83 + 54) - 50) + 58) ^ (((20 + 83) - 77) + 161)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
            }
            return llIIlllI[1];
        }))) {
            i2 = llIIlllI[2];
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        } else {
            i2 = llIIlllI[1];
        }
        int i3 = i2;
        if (lIlllIIIll(this.bF.drinkBoostPotions() ? 1 : 0) && lIlllIIIll(i3)) {
            Combat.drinkBoostingPotion(this.bF.boostAtPercentage());
            "".length();
        }
    }

    private static boolean lIlllIIIIl(Object obj) {
        return obj != null;
    }

    protected void onStart() {
    }

    private static void lIllIlllll() {
        llIIlllI = new int[8];
        llIIlllI[0] = -" ".length();
        llIIlllI[1] = ((((125 + 56) - 177) + 124) ^ (((113 + 93) - 64) + 57)) & (((9 ^ 56) ^ (113 ^ 7)) ^ (-" ".length()));
        llIIlllI[2] = " ".length();
        llIIlllI[3] = "  ".length();
        llIIlllI[4] = "   ".length();
        llIIlllI[5] = (((157 + 92) - 93) + 13) ^ (((3 + 126) - 31) + 75);
        llIIlllI[6] = (((62 + 38) - (-27)) + 71) ^ (((27 + 135) - 36) + 69);
        llIIlllI[7] = 60 ^ 52;
    }

    private static boolean lIlllIIlIl(int i2) {
        return i2 == 0;
    }

    @Provides
    AutoEatConfig d(ConfigManager configManager) {
        return (AutoEatConfig) configManager.getConfig(AutoEatConfig.class);
    }

    static {
        lIllIlllll();
        lIllIllllI();
    }

    private static String lIllIlllII(String llIlIllllIIIIIl, String llIlIllllIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIllllIIIIII.getBytes(StandardCharsets.UTF_8)), llIIlllI[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIllllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIllllIIIIlI) {
            llIlIllllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIllIlllIl(String llIlIlllIllIlII, String llIlIlllIllIIll) {
        try {
            SecretKeySpec llIlIlllIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIlllIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlllI[3], llIlIlllIllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIlllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIlllIllIlIl) {
            llIlIlllIllIlIl.printStackTrace();
            return null;
        }
    }

    public int ap() {
        return this.bD;
    }

    private static boolean lIlllIIIlI(Object obj) {
        return obj == null;
    }

    protected void onStop() {
    }

    public void k(int i2) {
        this.bD = i2;
    }

    private static boolean lIlllIIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
    }

    private static void lIllIllllI() {
        llIIllIl = new String[llIIlllI[6]];
        llIIllIl[llIIlllI[1]] = lIllIlllII("q4vLgJY+oaI=", "KJeHV");
        llIIllIl[llIIlllI[2]] = lIllIlllII("QodcqwnujcA=", "RfCgi");
        llIIllIl[llIIlllI[3]] = lIllIlllII("0zcZo0HgE+A=", "Sjgjx");
        llIIllIl[llIIlllI[4]] = lIllIlllII("xSkH9a+MxvhpbBw+Yw9zEA==", "Vqhps");
        llIIllIl[llIIlllI[5]] = lIllIlllIl("1k1Htgq7C5g=", "xgbND");
    }

    private static boolean lIlllIIIII(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlllIIIll(int i2) {
        return i2 != 0;
    }
}
