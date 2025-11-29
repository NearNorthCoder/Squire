/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 */
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
@PluginDescriptor(name="Squire Sandworm Digger", description="Collects sandworms", enabledByDefault=false)
public class SandWorms
extends SquirePlugin {
    private static /* synthetic */ int[] lIllIII;
    private static /* synthetic */ String[] lIlIlll;

    protected void onStart() {
    }

    private static boolean lIllIIIlI(Object object) {
        return object != null;
    }

    private static void lIllIIIIl() {
        lIllIII = new int[13];
        SandWorms.lIllIII[0] = 1;
        SandWorms.lIllIII[1] = (0xE6 ^ 0xAF) & ~(0xF7 ^ 0xBE);
        SandWorms.lIllIII[2] = -(0xFFFFBB9D & 0x747B) & (0xFFFFFFDF & 0x37BD);
        SandWorms.lIllIII[3] = -(0xFFFFBB5F & 0x5CA9) & (0xFFFF9EFF & Short.MAX_VALUE);
        SandWorms.lIllIII[4] = -(0xFFFFBB9F & 0x4FE9) & (0xFFFFFFFE & 0x3FFF);
        SandWorms.lIllIII[5] = 2;
        SandWorms.lIllIII[6] = 3;
        SandWorms.lIllIII[7] = 0xFFFFD76F & 0x2FBF;
        SandWorms.lIllIII[8] = -(0xFFFFE5BF & 0x7B75) & (0xFFFFFFFF & 0x6FFD);
        SandWorms.lIllIII[9] = 0x19 ^ 0x71 ^ (0xAE ^ 0xC2);
        SandWorms.lIllIII[10] = 35 + 2 - 7 + 139 ^ 112 + 106 - 173 + 127;
        SandWorms.lIllIII[11] = 97 + 95 - 170 + 161 ^ 84 + 171 - 160 + 82;
        SandWorms.lIllIII[12] = 0xBE ^ 0xC3 ^ (0x2B ^ 0x5E);
    }

    static {
        SandWorms.lIllIIIIl();
        SandWorms.lIllIIIII();
    }

    private static String lIlIlllIl(String lllIllIlIIllIII, String lllIllIlIIlIlIl) {
        try {
            SecretKeySpec lllIllIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), lIllIII[12]), "DES");
            Cipher lllIllIlIIllIlI = Cipher.getInstance("DES");
            lllIllIlIIllIlI.init(lIllIII[5], lllIllIlIIllIll);
            return new String(lllIllIlIIllIlI.doFinal(Base64.getDecoder().decode(lllIllIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIlIIllIIl) {
            lllIllIlIIllIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        void lllIllIllIIIllI;
        void lllIllIllIIlIIl;
        int[] nArray = new int[lIllIII[0]];
        nArray[SandWorms.lIllIII[1]] = lIllIII[2];
        Item item = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[lIllIII[0]];
        nArray2[SandWorms.lIllIII[1]] = lIllIII[3];
        Item item2 = Inventory.getFirst((int[])nArray2);
        int[] nArray3 = new int[lIllIII[0]];
        nArray3[SandWorms.lIllIII[1]] = lIllIII[4];
        Item item3 = Inventory.getFirst((int[])nArray3);
        String[] stringArray = new String[lIllIII[0]];
        stringArray[SandWorms.lIllIII[1]] = lIlIlll[lIllIII[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (SandWorms.lIllIIIlI(item2)) {
            item2.interact(lIlIlll[lIllIII[0]]);
        }
        if (SandWorms.lIllIIIll(Shop.isOpen() ? 1 : 0)) {
            Shop.buyFifty((int)lIllIII[2]);
        }
        String[] stringArray2 = new String[lIllIII[0]];
        stringArray2[SandWorms.lIllIII[1]] = lIlIlll[lIllIII[5]];
        NPC lllIllIllIIIlIl = NPCs.getNearest((String[])stringArray2);
        if (SandWorms.lIllIIlII(lllIllIllIIlIIl)) {
            void lllIllIllIIlIII;
            void lllIllIllIIIlll;
            if (SandWorms.lIllIIIlI(lllIllIllIIIlll)) {
                if (SandWorms.lIllIIIlI(lllIllIllIIIlIl)) {
                    lllIllIllIIIlIl.interact(lIlIlll[lIllIII[6]]);
                }
                if (SandWorms.lIllIIlII(lllIllIllIIIlIl)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(lIllIII[7], lIllIII[8], lIllIII[1]));
                    0;
                    Time.sleep((long)2L);
                    0;
                }
            }
            if (SandWorms.lIllIIlII(lllIllIllIIlIII) && SandWorms.lIllIIlII(lllIllIllIIIlll) && SandWorms.lIllIIlIl(Shop.isOpen() ? 1 : 0)) {
                lllIllIllIIIlIl.interact(lIlIlll[lIllIII[9]]);
            }
        }
        if (SandWorms.lIllIIIlI(lllIllIllIIlIIl) && SandWorms.lIllIIIlI(lllIllIllIIIllI) && SandWorms.lIllIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            lllIllIllIIIllI.interact(lIlIlll[lIllIII[10]]);
            Time.sleep((long)1L);
            0;
        }
    }

    private static boolean lIllIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlII(Object object) {
        return object == null;
    }

    private static boolean lIllIIlIl(int n2) {
        return n2 == 0;
    }

    protected void onStop() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIllIII[1]];
    }

    private static boolean lIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllllI(String lllIllIlIlIlIII, String lllIllIlIlIllII) {
        lllIllIlIlIlIII = new String(Base64.getDecoder().decode(lllIllIlIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIllIlIlIlIll = new StringBuilder();
        char[] lllIllIlIlIlIlI = lllIllIlIlIllII.toCharArray();
        int lllIllIlIlIlIIl = lIllIII[1];
        char[] lllIllIlIlIIIll = lllIllIlIlIlIII.toCharArray();
        int lllIllIlIlIIIlI = lllIllIlIlIIIll.length;
        int lllIllIlIlIIIIl = lIllIII[1];
        while (SandWorms.lIllIIllI(lllIllIlIlIIIIl, lllIllIlIlIIIlI)) {
            char lllIllIlIlIlllI = lllIllIlIlIIIll[lllIllIlIlIIIIl];
            lllIllIlIlIlIll.append((char)(lllIllIlIlIlllI ^ lllIllIlIlIlIlI[lllIllIlIlIlIIl % lllIllIlIlIlIlI.length]));
            0;
            ++lllIllIlIlIlIIl;
            ++lllIllIlIlIIIIl;
            0;
            if ((0x64 ^ 0x61) > 0) continue;
            return null;
        }
        return String.valueOf(lllIllIlIlIlIll);
    }

    private static String lIlIlllll(String lllIllIlIllllIl, String lllIllIlIllllII) {
        try {
            SecretKeySpec lllIllIllIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIlIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIllIlIllllll = Cipher.getInstance("Blowfish");
            lllIllIlIllllll.init(lIllIII[5], lllIllIllIIIIII);
            return new String(lllIllIlIllllll.doFinal(Base64.getDecoder().decode(lllIllIlIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIlIlllllI) {
            lllIllIlIlllllI.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIII() {
        lIlIlll = new String[lIllIII[11]];
        SandWorms.lIlIlll[SandWorms.lIllIII[1]] = SandWorms."Sandworm castings";
        SandWorms.lIlIlll[SandWorms.lIllIII[0]] = SandWorms."Empty";
        SandWorms.lIlIlll[SandWorms.lIllIII[5]] = SandWorms."Tynan";
        SandWorms.lIlIlll[SandWorms.lIllIII[6]] = SandWorms."Talk-to";
        SandWorms.lIlIlll[SandWorms.lIllIII[9]] = SandWorms."Trade";
        SandWorms.lIlIlll[SandWorms.lIllIII[10]] = SandWorms."Dig";
    }
}

