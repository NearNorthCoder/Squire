/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Cooking fish", priority=5, blocking=true)
public class CookingFishTask
extends TemporossTaskBase {

    @Inject
    protected CookingFishTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIllIIIIII(Object object) {
        return object != null;
    }

    private int d() {
        int[] nArray = new int[lIIllIlllIIII[0]];
        nArray[e.lIIllIlllIIII[1]] = lIIllIlllIIII[6];
        return Inventory.getCount((int[])nArray);
    }

    private static boolean lIllIIIlIllllll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIIlIllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIlIllllII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var1;
        e var2;
        void var3;
        void var4;
        c c2 = this.ar.N();
        TileObject tileObject = c2.V();
        int[] nArray = new int[lIIllIlllIIII[0]];
        nArray[e.lIIllIlllIIII[1]] = lIIllIlllIIII[2];
        TileObject tileObject2 = TileObjects.getNearest((int[])nArray);
        Player player = Players.getLocal();
        if ((!e.lIllIIIlIllllll(player.getAnimation(), lIIllIlllIIII[3]) || e.lIllIIIlIllllIl(player.isMoving() ? 1 : 0)) && e.lIllIIIlIllllII(Dialog.isOpen() ? 1 : 0)) {
            return lIIllIlllIIII[0];
        }
        if (e.lIllIIIlIllllIl(var4 instanceof GameObject) && e.lIllIIIlIllllIl(((GameObject)var4).getWorldArea().contains(var3.getWorldLocation()) ? 1 : 0)) {
            System.out.println(lIIllIllIllll[lIIllIlllIIII[1]]);
            NPC var5 = var2.au.a((SceneEntity)var1);
            if (e.lIllIIIllIIIIII(var5)) {
                return var2.au.b((SceneEntity)var1);
            }
            var1.interact(lIIllIllIllll[lIIllIlllIIII[0]]);
            return lIIllIlllIIII[1];
        }
        if (e.lIllIIIllIIIIIl(var1)) {
            void var6;
            System.out.println(lIIllIllIllll[lIIllIlllIIII[4]]);
            return var2.ar.f(var6.ah());
        }
        if (e.lIllIIIlIllllIl(var2.au.a((Locatable)var1) ? 1 : 0)) {
            return var2.au.b((SceneEntity)var1);
        }
        tileObject.interact(lIIllIllIllll[lIIllIlllIIII[5]]);
        this.sleep(lIIllIlllIIII[4]);
        return lIIllIlllIIII[0];
    }

    private static boolean lIllIIIlIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIllIIIlIlllIlI() {
        lIIllIllIllll = new String[lIIllIlllIIII[7]];
        e.lIIllIllIllll[e.lIIllIlllIIII[1]] = "Dodging fire!";
        e.lIIllIllIllll[e.lIIllIlllIIII[0]] = "Cook-at";
        e.lIIllIllIllll[e.lIIllIlllIIII[4]] = "range is null";
        e.lIIllIllIllll[e.lIIllIlllIIII[5]] = "Cook-at";
    }

    static {
        e.lIllIIIlIlllIll();
        e.lIllIIIlIlllIlI();
    }

    @Override
    public boolean ak() {
        int n2;
        e var7;
        if ((!e.lIllIIIlIllllII(this.as.cookFish() ? 1 : 0) || e.lIllIIIlIllllIl(this.as.solo() ? 1 : 0)) && e.lIllIIIlIllllII(var7.ar.L() ? 1 : 0) && e.lIllIIIlIllllIl(var7.d()) && e.lIllIIIlIlllllI(var7.au.f(), var7.as.numberOfFish())) {
            n2 = lIIllIlllIIII[0];

        } else {
            n2 = lIIllIlllIIII[1];
        }
        return n2 != 0;
    }

    private static boolean lIllIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIllIIIIIl(Object object) {
        return object == null;
    }

        return String.valueOf(var8);
    }
}

