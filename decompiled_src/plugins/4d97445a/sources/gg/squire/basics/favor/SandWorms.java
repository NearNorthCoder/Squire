package gg.squire.basics.favor;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
@SquireUtil
@PluginDescriptor(name = "Squire Sandworm Digger", description = "Collects sandworms", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/favor/SandWorms.class */
public class SandWorms extends SquirePlugin {
    private static /* synthetic */ int[] lIllIII;
    private static /* synthetic */ String[] lIlIlll;

    protected void onStart() {
    }

    private static boolean lIllIIIlI(Object obj) {
        return obj != null;
    }

    private static void lIllIIIIl() {
        lIllIII = new int[13];
        lIllIII[0] = " ".length();
        lIllIII[1] = (230 ^ 175) & ((247 ^ 190) ^ (-1));
        lIllIII[2] = (-((-17507) & 29819)) & (-33) & 14269;
        lIllIII[3] = (-((-17569) & 23721)) & (-24833) & 32767;
        lIllIII[4] = (-((-17505) & 20457)) & (-2) & 16383;
        lIllIII[5] = "  ".length();
        lIllIII[6] = "   ".length();
        lIllIII[7] = (-10385) & 12223;
        lIllIII[8] = (-((-6721) & 31605)) & (-1) & 28669;
        lIllIII[9] = (25 ^ 113) ^ (174 ^ 194);
        lIllIII[10] = (((35 + 2) - 7) + 139) ^ (((112 + 106) - 173) + 127);
        lIllIII[11] = (((97 + 95) - 170) + 161) ^ (((84 + 171) - 160) + 82);
        lIllIII[12] = (190 ^ 195) ^ (43 ^ 94);
    }

    static {
        lIllIIIIl();
        lIllIIIII();
    }

    private static String lIlIlllIl(String lllIllIlIIllIII, String lllIllIlIIlIlll) {
        try {
            SecretKeySpec lllIllIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIlIIlIlll.getBytes(StandardCharsets.UTF_8)), lIllIII[12]), "DES");
            Cipher lllIllIlIIllIlI = Cipher.getInstance("DES");
            lllIllIlIIllIlI.init(lIllIII[5], lllIllIlIIllIll);
            return new String(lllIllIlIIllIlI.doFinal(Base64.getDecoder().decode(lllIllIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIlIIllIIl) {
            lllIllIlIIllIIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int[] iArr = new int[lIllIII[0]];
        iArr[lIllIII[1]] = lIllIII[2];
        Item first = Inventory.getFirst(iArr);
        int[] iArr2 = new int[lIllIII[0]];
        iArr2[lIllIII[1]] = lIllIII[3];
        Item first2 = Inventory.getFirst(iArr2);
        int[] iArr3 = new int[lIllIII[0]];
        iArr3[lIllIII[1]] = lIllIII[4];
        Item first3 = Inventory.getFirst(iArr3);
        String[] strArr = new String[lIllIII[0]];
        strArr[lIllIII[1]] = lIlIlll[lIllIII[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIllIIIlI(first2)) {
            first2.interact(lIlIlll[lIllIII[0]]);
        }
        if (lIllIIIll(Shop.isOpen() ? 1 : 0)) {
            Shop.buyFifty(lIllIII[2]);
        }
        String[] strArr2 = new String[lIllIII[0]];
        strArr2[lIllIII[1]] = lIlIlll[lIllIII[5]];
        NPC nearest2 = NPCs.getNearest(strArr2);
        if (lIllIIlII(first)) {
            if (lIllIIIlI(first3)) {
                if (lIllIIIlI(nearest2)) {
                    nearest2.interact(lIlIlll[lIllIII[6]]);
                }
                if (lIllIIlII(nearest2)) {
                    Movement.walkTo(new WorldPoint(lIllIII[7], lIllIII[8], lIllIII[1]));
                    "".length();
                    Time.sleep(2L);
                    "".length();
                }
            }
            if (lIllIIlII(first2) && lIllIIlII(first3) && lIllIIlIl(Shop.isOpen() ? 1 : 0)) {
                nearest2.interact(lIlIlll[lIllIII[9]]);
            }
        }
        if (lIllIIIlI(first) && lIllIIIlI(nearest) && lIllIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            nearest.interact(lIlIlll[lIllIII[10]]);
            Time.sleep(1L);
            "".length();
        }
    }

    private static boolean lIllIIIll(int i2) {
        return i2 != 0;
    }

    private static boolean lIllIIlII(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIlIl(int i2) {
        return i2 == 0;
    }

    protected void onStop() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIllIII[1]];
    }

    private static boolean lIllIIllI(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlIllllI(String lllIllIlIlIllIl, String lllIllIlIlIllII) {
        String lllIllIlIlIllIl2 = new String(Base64.getDecoder().decode(lllIllIlIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllIllIlIlIllII.toCharArray();
        int lllIllIlIlIlIIl = lIllIII[1];
        char[] charArray2 = lllIllIlIlIllIl2.toCharArray();
        int lllIllIlIlIIIlI = charArray2.length;
        int lllIllIlIlIIIIl = lIllIII[1];
        while (lIllIIllI(lllIllIlIlIIIIl, lllIllIlIlIIIlI)) {
            sb.append((char) (charArray2[lllIllIlIlIIIIl] ^ charArray[lllIllIlIlIlIIl % charArray.length]));
            "".length();
            lllIllIlIlIlIIl++;
            lllIllIlIlIIIIl++;
            "".length();
            if ((100 ^ 97) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIlllll(String lllIllIlIllllIl, String lllIllIlIllllII) {
        try {
            SecretKeySpec lllIllIllIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIlIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIII[5], lllIllIllIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIllIlIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIlIlllllI) {
            lllIllIlIlllllI.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIII() {
        lIlIlll = new String[lIllIII[11]];
        lIlIlll[lIllIII[1]] = lIlIlllIl("A4hS+paTn14BKjrhoBy9N2dZKWHEjAt4", "PKVAN");
        lIlIlll[lIllIII[0]] = lIlIlllIl("Nntsk+0BgjM=", "evjaQ");
        lIlIlll[lIllIII[5]] = lIlIlllIl("I/ymyuEeyRU=", "qfPoO");
        lIlIlll[lIllIII[6]] = lIlIllllI("GS4bBlQ5IA==", "MOwmy");
        lIlIlll[lIllIII[9]] = lIlIlllll("FQSNhoqLMY4=", "ddIeq");
        lIlIlll[lIllIII[10]] = lIlIlllll("c+OQkTfuGvk=", "rPjuw");
    }
}
