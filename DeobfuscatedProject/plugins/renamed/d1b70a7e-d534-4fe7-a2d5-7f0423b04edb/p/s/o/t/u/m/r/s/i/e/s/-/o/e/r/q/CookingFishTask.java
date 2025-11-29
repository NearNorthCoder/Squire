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
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

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
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l_Unknown;

/* TASK: Cooking fish -> CookingfishTask */
@TaskDesc(name="Cooking fish", priority=5, blocking=true)
public class CookingFishTask
extends l_Unknown {
    private static /* synthetic */ int[] lIIllIlllIIII;
    private static /* synthetic */ String[] lIIllIllIllll;

    @Inject
    protected e(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static String lIllIIIlIlllIIl(String var26, String var4) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIllIlllIIII[8]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIIllIlllIIII[4], var13);
            return new String(var9.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIllIlll(String var24, String var16) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lIIllIlllIIII[4], var10);
            return new String(var23.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
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
        void var7;
        e var1;
        void var14;
        void var22;
        c c2 = this.ar.N();
        TileObject tileObject = c2.V();
        int[] nArray = new int[lIIllIlllIIII[0]];
        nArray[e.lIIllIlllIIII[1]] = lIIllIlllIIII[2];
        TileObject tileObject2 = TileObjects.getNearest((int[])nArray);
        Player player = Players.getLocal();
        if ((!e.lIllIIIlIllllll(player.getAnimation(), lIIllIlllIIII[3]) || e.lIllIIIlIllllIl(player.isMoving() ? 1 : 0)) && e.lIllIIIlIllllII(Dialog.isOpen() ? 1 : 0)) {
            return lIIllIlllIIII[0];
        }
        if (e.lIllIIIlIllllIl(var22 instanceof GameObject) && e.lIllIIIlIllllIl(((GameObject)var22).getWorldArea().contains(var14.getWorldLocation()) ? 1 : 0)) {
            System.out.println(lIIllIllIllll[lIIllIlllIIII[1]]);
            NPC var2 = var1.au.a((SceneEntity)var7);
            if (e.lIllIIIllIIIIII(var2)) {
                return var1.au.b((SceneEntity)var7);
            }
            var7.interact(lIIllIllIllll[lIIllIlllIIII[0]]);
            return lIIllIlllIIII[1];
        }
        if (e.lIllIIIllIIIIIl(var7)) {
            void var12;
            System.out.println(lIIllIllIllll[lIIllIlllIIII[4]]);
            return var1.ar.f(var12.ah());
        }
        if (e.lIllIIIlIllllIl(var1.au.a((Locatable)var7) ? 1 : 0)) {
            return var1.au.b((SceneEntity)var7);
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
        e.lIIllIllIllll[e.lIIllIlllIIII[1]] = e."Dodging fire!";
        e.lIIllIllIllll[e.lIIllIlllIIII[0]] = e."Cook-at";
        e.lIIllIllIllll[e.lIIllIlllIIII[4]] = e."range is null";
        e.lIIllIllIllll[e.lIIllIlllIIII[5]] = e."Cook-at";
    }

    static {
        e.lIllIIIlIlllIll();
        e.lIllIIIlIlllIlI();
    }

    @Override
    public boolean ak() {
        int n2;
        e var21;
        if ((!e.lIllIIIlIllllII(this.as.cookFish() ? 1 : 0) || e.lIllIIIlIllllIl(this.as.solo() ? 1 : 0)) && e.lIllIIIlIllllII(var21.ar.L() ? 1 : 0) && e.lIllIIIlIllllIl(var21.d()) && e.lIllIIIlIlllllI(var21.au.f(), var21.as.numberOfFish())) {
            n2 = lIIllIlllIIII[0];
            0;
            if (-1 >= 0) {
                return ((112 + 90 - 75 + 10 ^ 84 + 33 - 87 + 103) & (0x49 ^ 0x73 ^ (0x98 ^ 0xAE) ^ -1)) != 0;
            }
        } else {
            n2 = lIIllIlllIIII[1];
        }
        return n2 != 0;
    }

    private static boolean lIllIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIIlIlllIll() {
        lIIllIlllIIII = new int[9];
        e.lIIllIlllIIII[0] = 1;
        e.lIIllIlllIIII[1] = (0x1D ^ 0x1B) & ~(0x5A ^ 0x5C);
        e.lIIllIlllIIII[2] = 0xFFFFFE7F & 0xA1AE;
        e.lIIllIlllIIII[3] = -(0xFFFFF176 & 0x7E9F) & (0xFFFFFFB7 & 0x73DD);
        e.lIIllIlllIIII[4] = 2;
        e.lIIllIlllIIII[5] = 3;
        e.lIIllIlllIIII[6] = 0xFFFFEFDF & 0x73FC;
        e.lIIllIlllIIII[7] = 0x1A ^ 0x5C ^ (0x17 ^ 0x55);
        e.lIIllIlllIIII[8] = 0x8A ^ 0xB7 ^ (0 ^ 0x35);
    }

    private static boolean lIllIIIllIIIIIl(Object object) {
        return object == null;
    }

    private static String lIllIIIlIlllIII(String var15, String var20) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var19 = var20.toCharArray();
        int var8 = lIIllIlllIIII[1];
        char[] var25 = var15.toCharArray();
        int var3 = var25.length;
        int var11 = lIIllIlllIIII[1];
        while (e.lIllIIIllIIIIlI(var11, var3)) {
            char var18 = var25[var11];
            var17.append((char)(var18 ^ var19[var8 % var19.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0x1E ^ 0x1A) > 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }
}

