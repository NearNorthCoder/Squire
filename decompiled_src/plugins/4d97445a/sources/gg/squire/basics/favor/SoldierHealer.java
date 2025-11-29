package gg.squire.basics.favor;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@PluginDescriptor(name = "Squire Shayzien Soldier Healer", description = "Heals Shayzien Soldiers for favor", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/favor/SoldierHealer.class */
public class SoldierHealer extends SquirePlugin {
    private static final /* synthetic */ int dn;
    private static /* synthetic */ int[] lllIlIllI;
    private static /* synthetic */ String[] lllIlIlIl;

    private static boolean llIIlIlIIIl(int i2) {
        return i2 != 0;
    }

    private static void llIIlIIllIl() {
        lllIlIllI = new int[7];
        lllIlIllI[0] = " ".length();
        lllIlIllI[1] = (29 ^ 77) & ((106 ^ 58) ^ (-1));
        lllIlIllI[2] = "  ".length();
        lllIlIllI[3] = "   ".length();
        lllIlIllI[4] = (178 ^ 192) ^ (8 ^ 126);
        lllIlIllI[5] = (-614) & 6895;
        lllIlIllI[6] = (161 ^ 150) ^ (95 ^ 109);
    }

    private static boolean llIIlIlIIlI(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean llIIlIlIIll(int i2, int i3) {
        return i2 < i3;
    }

    private static void llIIlIIllII() {
        lllIlIlIl = new String[lllIlIllI[6]];
        lllIlIlIl[lllIlIllI[1]] = llIIlIIlIlI("KxwyLhgRET13Dx0QIzYBEw==", "xtSWb");
        lllIlIlIl[lllIlIllI[0]] = llIIlIIlIlI("HSU5H2IkN3oaNyEo", "MDZtB");
        lllIlIlIl[lllIlIllI[2]] = llIIlIIlIll("USXU649jKXUDXiorgYpwCw==", "hWdFS");
        lllIlIlIl[lllIlIllI[3]] = llIIlIIlIlI("GBITJ0ghEhY7", "LsxBe");
        lllIlIlIl[lllIlIllI[4]] = llIIlIIlIll("KQ7LQ8m9djmS3paJX9cLgw==", "HaoRM");
    }

    private static boolean llIIlIIllll(Object obj) {
        return obj == null;
    }

    private static boolean llIIlIIlllI(int i2) {
        return i2 == 0;
    }

    private static boolean llIIlIlIIII(Object obj) {
        return obj != null;
    }

    protected Class<?>[] tasks() {
        return new Class[lllIlIllI[1]];
    }

    static {
        llIIlIIllIl();
        llIIlIIllII();
        dn = lllIlIllI[5];
    }

    private static String llIIlIIlIll(String lIlIlIIlllIIlII, String lIlIlIIlllIIIll) {
        try {
            SecretKeySpec lIlIlIIlllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIlllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIlllIIllI = Cipher.getInstance("Blowfish");
            lIlIlIIlllIIllI.init(lllIlIllI[2], lIlIlIIlllIIlll);
            return new String(lIlIlIIlllIIllI.doFinal(Base64.getDecoder().decode(lIlIlIIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIlllIIlIl) {
            lIlIlIIlllIIlIl.printStackTrace();
            return null;
        }
    }

    private static String llIIlIIlIlI(String lIlIlIIlllllIIl, String lIlIlIIlllllIII) {
        String str = new String(Base64.getDecoder().decode(lIlIlIIlllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIlIIlllllIII.toCharArray();
        int lIlIlIIllllIlIl = lllIlIllI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lllIlIllI[1];
        while (llIIlIlIIll(i2, length)) {
            char lIlIlIIlllllIlI = charArray2[i2];
            sb.append((char) (lIlIlIIlllllIlI ^ charArray[lIlIlIIllllIlIl % charArray.length]));
            "".length();
            lIlIlIIllllIlIl++;
            i2++;
            "".length();
            if ((-" ".length()) >= ((106 ^ 118) & ((54 ^ 42) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (llIIlIIlllI(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        String[] strArr = new String[lllIlIllI[0]];
        strArr[lllIlIllI[1]] = lllIlIlIl[lllIlIllI[1]];
        Item first = Inventory.getFirst(strArr);
        if (!llIIlIIllll(first)) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (llIIlIlIIIl(npc.getName().contains(lllIlIlIl[lllIlIllI[4]]) ? 1 : 0) && llIIlIlIIlI(npc.getPoseAnimation(), lllIlIllI[5])) {
                    ?? r0 = lllIlIllI[0];
                    "".length();
                    return (87 ^ 83) <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIlIllI[1];
            });
            if (llIIlIIllll(nearest)) {
                return;
            }
            first.useOn(nearest);
            return;
        }
        System.out.println(lllIlIlIl[lllIlIllI[0]]);
        String[] strArr2 = new String[lllIlIllI[0]];
        strArr2[lllIlIllI[1]] = lllIlIlIl[lllIlIllI[2]];
        TileObject nearest2 = TileObjects.getNearest(strArr2);
        if (llIIlIlIIII(nearest2)) {
            nearest2.interact(lllIlIlIl[lllIlIllI[3]]);
        }
    }

    protected void onStart() {
    }

    protected void onStop() {
    }
}
