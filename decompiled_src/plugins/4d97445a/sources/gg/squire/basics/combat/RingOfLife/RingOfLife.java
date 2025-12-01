package gg.squire.basics.combat.RingOfLife;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.Squire;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.H;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.I;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
@PluginDescriptor(name = "Squire Ring Of Life", description = "Auto teleports at hp", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/combat/RingOfLife/RingOfLife.class */
public class RingOfLife extends SquirePlugin {
    private /* synthetic */ boolean cg;
    private /* synthetic */ WorldPoint bw;
    private /* synthetic */ boolean cf;
    @Inject
    /* synthetic */ RingOfLifeConfig ce;
    private static /* synthetic */ String[] lIIIIlI;
    private static /* synthetic */ int[] lIIlIlI;

    private static boolean lIIlIllll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIIlIlIll(int i2) {
        return i2 != 0;
    }

    private static void lIIIlIIIl() {
        lIIIIlI = new String[lIIlIlI[5]];
        lIIIIlI[lIIlIlI[0]] = lIIIIIIll("FSA8BTEvOjRVICo4cyYwMz0hEGEWOCYSKCgncxQyZiM2VSYpIHMnKCgzcxonZhg6EyQieg==", "FTSuA");
        lIIIIlI[lIIlIlI[1]] = lIIIIIlII("bvTH3OkC560=", "rVnMg");
        lIIIIlI[lIIlIlI[3]] = lIIIIIlIl("eHxsMSqBnOo=", "Qfkhd");
        lIIIIlI[lIIlIlI[2]] = lIIIIIIll("IyoDKhI=", "tCfFv");
        lIIIIlI[lIIlIlI[4]] = lIIIIIlIl("QPk4f3w77R6mGb1ER7DdT3zFu3mom6kXsn54mpvpwNiKm5y7XnSuRlE0YNq+MYZSlRqJPu2am54U8Nzq4irloGAEAOluutHa", "XaEHY");
    }

    private static boolean lIIlIlIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIllII(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v57, types: [boolean] */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Player local = Players.getLocal();
        if (lIIlIlIIl(local)) {
            return;
        }
        if (lIIlIlIlI(Combat.getCurrentHealth(), this.ce.teleHP())) {
            this.cf = lIIlIlI[0];
        }
        if (lIIlIlIll(this.cf ? 1 : 0) && lIIlIlIll(this.ce.logOutOnTrigger() ? 1 : 0)) {
            Log.info(lIIIIlI[lIIlIlI[0]]);
            Squire.stop();
        }
        WorldPoint worldLocation = local.getWorldLocation();
        if (lIIlIllII(Combat.getCurrentHealth(), this.ce.teleHP()) && lIIlIllIl(this.cf ? 1 : 0)) {
            this.cg = lIIlIlI[1];
            this.bw = worldLocation;
            if (lIIlIlllI(this.ce.teleportType(), I.SPELL) && lIIlIlIll(Magic.canCast(this.ce.teleportSpell().getSpell()) ? 1 : 0)) {
                Magic.cast(this.ce.teleportSpell().getSpell());
                "".length();
                if ("  ".length() > (125 ^ 121)) {
                    return;
                }
            } else if (!lIIlIllIl(Inventory.contains(this.ce.teleportItem().av()) ? 1 : 0) || lIIlIlIll(Equipment.contains(this.ce.teleportItem().av()) ? 1 : 0)) {
                if (lIIlIlIll(this.ce.teleportItem().aw() ? 1 : 0) && lIIlIllIl(Equipment.contains(this.ce.teleportItem().av()) ? 1 : 0) && lIIlIlIll(Inventory.contains(this.ce.teleportItem().av()) ? 1 : 0)) {
                    Item first = Inventory.getFirst(this.ce.teleportItem().av());
                    String[] strArr = new String[lIIlIlI[2]];
                    strArr[lIIlIlI[0]] = lIIIIlI[lIIlIlI[1]];
                    strArr[lIIlIlI[1]] = lIIIIlI[lIIlIlI[3]];
                    strArr[lIIlIlI[3]] = lIIIIlI[lIIlIlI[2]];
                    first.interact(strArr);
                }
                if (lIIlIlIll(Equipment.contains(this.ce.teleportItem().av()) ? 1 : 0)) {
                    Equipment.getFirst(this.ce.teleportItem().av()).interact(this.ce.teleportItem().au());
                }
                if (lIIlIlIll(Inventory.contains(this.ce.teleportItem().av()) ? 1 : 0)) {
                    Inventory.getFirst(this.ce.teleportItem().av()).interact(this.ce.teleportItem().au());
                    "".length();
                    if ((-" ".length()) >= 0) {
                        return;
                    }
                }
            } else {
                H[] values = H.values();
                int llllIIIIIllIlIl = values.length;
                int i2 = lIIlIlI[0];
                while (lIIlIllll(i2, llllIIIIIllIlIl)) {
                    H h = values[i2];
                    if (lIIlIllIl(Equipment.contains(h.av()) ? 1 : 0) && !lIIlIlIll(Inventory.contains(h.av()) ? 1 : 0)) {
                        i2++;
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                    } else if (lIIlIlIll(Equipment.contains(h.av()) ? 1 : 0)) {
                        Equipment.getFirst(h.av()).interact(h.au());
                        "".length();
                        if (((218 ^ 189) ^ (237 ^ 142)) < "   ".length()) {
                            return;
                        }
                    } else {
                        Inventory.getFirst(h.av()).interact(h.au());
                        Log.info(lIIIIlI[lIIlIlI[4]]);
                        "".length();
                        if (((226 ^ 149) ^ (2 ^ 113)) <= (((((14 + 21) - (-63)) + 53) ^ (((131 + 118) - 167) + 105)) & (((((169 + 14) - 110) + 100) ^ (((93 + 58) - 64) + 42)) ^ (-" ".length())))) {
                            return;
                        }
                    }
                }
            }
        }
        if (lIIllIIII(this.bw) && lIIllIIIl(worldLocation.getRegionID(), this.bw.getRegionID()) && lIIlIlIll(this.cg ? 1 : 0)) {
            this.cf = lIIlIlI[1];
            this.cg = lIIlIlI[0];
            this.bw = worldLocation;
        }
    }

    private static boolean lIIlIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIIIIIlII(String llllIIIIIIIIIlI, String llllIIIIIIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIIIIIIIIll) {
            llllIIIIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIII() {
        lIIlIlI = new int[7];
        lIIlIlI[0] = ((51 ^ 65) ^ (132 ^ 175)) & (((((202 + 16) - 189) + 180) ^ (((66 + 107) - 117) + 80)) ^ (-" ".length()));
        lIIlIlI[1] = " ".length();
        lIIlIlI[2] = "   ".length();
        lIIlIlI[3] = "  ".length();
        lIIlIlI[4] = 79 ^ 75;
        lIIlIlI[5] = (46 ^ 7) ^ (94 ^ 114);
        lIIlIlI[6] = (16 ^ 7) ^ (101 ^ 122);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        if (!lIIllIIlI(gameStateChanged.getGameState(), GameState.LOADING) && lIIlIlIll(this.cg ? 1 : 0)) {
            this.cg = lIIlIlI[0];
            this.cf = lIIlIlI[1];
        }
    }

    @Provides
    RingOfLifeConfig f(ConfigManager configManager) {
        return (RingOfLifeConfig) configManager.getConfig(RingOfLifeConfig.class);
    }

    private static boolean lIIlIllIl(int i2) {
        return i2 == 0;
    }

    protected Class<?>[] tasks() {
        return new Class[lIIlIlI[0]];
    }

    private static String lIIIIIIll(String llllIIIIIlIIlII, String llllIIIIIlIIIll) {
        String str = new String(Base64.getDecoder().decode(llllIIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIIIIIlIIIlI = new StringBuilder();
        char[] charArray = llllIIIIIlIIIll.toCharArray();
        int llllIIIIIlIIIII = lIIlIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIIlIlI[0];
        while (lIIlIllll(i2, length)) {
            char llllIIIIIlIIlIl = charArray2[i2];
            llllIIIIIlIIIlI.append((char) (llllIIIIIlIIlIl ^ charArray[llllIIIIIlIIIII % charArray.length]));
            "".length();
            llllIIIIIlIIIII++;
            i2++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllIIIIIlIIIlI);
    }

    private static boolean lIIllIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    protected void onStop() {
    }

    private static boolean lIIllIIIl(int i2, int i3) {
        return i2 != i3;
    }

    private static String lIIIIIlIl(String llllIIIIIIIllll, String llllIIIIIIIlllI) {
        try {
            SecretKeySpec llllIIIIIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIIIIIIlllI.getBytes(StandardCharsets.UTF_8)), lIIlIlI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIlI[3], llllIIIIIIlIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIIIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIIIIIlIIII) {
            llllIIIIIIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlI(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIIllIIII(Object obj) {
        return obj != null;
    }

    protected void onStart() {
    }

    static {
        lIIlIlIII();
        lIIIlIIIl();
    }
}
