/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.basics.favor;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
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

@PluginDescriptor(name="Squire Shayzien Soldier Healer", description="Heals Shayzien Soldiers for favor", enabledByDefault=false)
@SquireUtil
public class SoldierHealer
extends SquirePlugin {
    private static final  int dn;

    private static boolean llIIlIlIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIlIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIllII() {
        lllIlIlIl = new String[lllIlIllI[6]];
        SoldierHealer.lllIlIlIl[SoldierHealer.lllIlIllI[1]] = "Shayzien medpack";
        SoldierHealer.lllIlIlIl[SoldierHealer.lllIlIllI[0]] = "Pack is null";
        SoldierHealer.lllIlIlIl[SoldierHealer.lllIlIllI[2]] = "Medpack Box";
        SoldierHealer.lllIlIlIl[SoldierHealer.lllIlIllI[3]] = "Take-many";
        SoldierHealer.lllIlIlIl[SoldierHealer.lllIlIllI[4]] = "Wounded soldier";
    }

    private static boolean llIIlIIllll(Object object) {
        return object == null;
    }

    private static boolean llIIlIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIlIIII(Object object) {
        return object != null;
    }

    protected Class<?>[] tasks() {
        return new Class[lllIlIllI[1]];
    }

    static {
        SoldierHealer.llIIlIIllIl();
        SoldierHealer.llIIlIIllII();
        dn = lllIlIllI[5];
    }

        return String.valueOf(lIlIlIIllllIlll);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        void var3_4;
        void var2_2;
        if (SoldierHealer.llIIlIIlllI(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lllIlIllI[0]];
        stringArray[SoldierHealer.lllIlIllI[1]] = lllIlIlIl[lllIlIllI[1]];
        Item lIlIlIlIIIIIlll = Inventory.getFirst((String[])stringArray);
        if (SoldierHealer.llIIlIIllll(lIlIlIlIIIIIlll)) {
            System.out.println(lllIlIlIl[lllIlIllI[0]]);
            String[] stringArray2 = new String[lllIlIllI[0]];
            stringArray2[SoldierHealer.lllIlIllI[1]] = lllIlIlIl[lllIlIllI[2]];
            TileObject lIlIlIlIIIIIllI = TileObjects.getNearest((String[])stringArray2);
            if (SoldierHealer.llIIlIlIIII(lIlIlIlIIIIIllI)) {
                lIlIlIlIIIIIllI.interact(lllIlIlIl[lllIlIllI[3]]);
            }
            return;
        }
        NPC lIlIlIlIIIIIllI = NPCs.getNearest(nPC -> {
            int n2;
            if (SoldierHealer.llIIlIlIIIl(nPC.getName().contains(lllIlIlIl[lllIlIllI[4]]) ? 1 : 0) && SoldierHealer.llIIlIlIIlI(nPC.getPoseAnimation(), lllIlIllI[5])) {
                n2 = lllIlIllI[0];

                if ((0x57 ^ 0x53) <= 2) {
                    return false;
                }
            } else {
                n2 = lllIlIllI[1];
            }
            return n2 != 0;
        });
        if (SoldierHealer.llIIlIIllll(lIlIlIlIIIIIllI)) {
            return;
        }
        var2_2.useOn((Actor)var3_4);
    }

    protected void onStart() {
    }

    protected void onStop() {
    }
}

