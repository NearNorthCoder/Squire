/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.AEnum;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Leaving essence mine -> LeavingessencemineTask */
@TaskDesc(name="Leaving essence mine", priority=10, blocking=true)
public class LeavingEssenceMineTask
extends Task {
    private static /* synthetic */ int[] llllllIlllII;
    private static /* synthetic */ String[] llllllIllIll;
    @Inject
    private /* synthetic */ SquireMinerConfig f;

    /*
     * WARNING - void declaration
     */
    private Interactable q() {
        TileObject tileObject;
        void var12;
        void var2;
        String[] stringArray = new String[llllllIlllII[2]];
        stringArray[o.llllllIlllII[0]] = llllllIllIll[llllllIlllII[2]];
        TileObject tileObject2 = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[llllllIlllII[2]];
        stringArray2[o.llllllIlllII[0]] = llllllIllIll[llllllIlllII[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray2);
        if (o.lIIlIlIIllIllll(nPC)) {
            return var2;
        }
        if (o.lIIlIlIIllIllll(var2)) {
            return var12;
        }
        if (o.lIIlIlIIlllIIII(var12.distanceTo((Locatable)Players.getLocal()), var2.distanceTo((Locatable)Players.getLocal()))) {
            tileObject = var12;
            0;
            
            }
        } else {
            tileObject = tileObject2;
        }
        return tileObject;
    }

    private static boolean lIIlIlIIlllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIlIIllIlIIl(String var16, String var3) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var15 = var3.toCharArray();
        int var6 = llllllIlllII[0];
        char[] var10 = var16.toCharArray();
        int var13 = var10.length;
        int var4 = llllllIlllII[0];
        while (o.lIIlIlIIlllIIII(var4, var13)) {
            char var18 = var10[var4];
            var11.append((char)(var18 ^ var15[var6 % var15.length]));
            0;
            ++var6;
            ++var4;
            0;
            if (3 != 2) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean lIIlIlIIllIllll(Object object) {
        return object == null;
    }

    private static void lIIlIlIIllIllII() {
        llllllIlllII = new int[6];
        o.llllllIlllII[0] = (0x66 ^ 0x5C) & ~(1 ^ 0x3B);
        o.llllllIlllII[1] = -(0xFFFFCFF1 & 0x723F) & (0xFFFFEFFF & 0x7F7B);
        o.llllllIlllII[2] = 1;
        o.llllllIlllII[3] = 2;
        o.llllllIlllII[4] = 3;
        o.llllllIlllII[5] = 77 + 26 - -22 + 28 ^ 124 + 92 - 94 + 23;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        o var5;
        if (o.lIIlIlIIllIllIl((Object)this.f.activity(), (Object)a.ESSENCE)) {
            return llllllIlllII[0];
        }
        if (o.lIIlIlIIllIlllI(Inventory.isFull() ? 1 : 0)) {
            return llllllIlllII[0];
        }
        Interactable var1 = var5.q();
        if (o.lIIlIlIIllIllll(var1)) {
            return llllllIlllII[0];
        }
        if (o.lIIlIlIIllIlllI(Locations.isRegionLoaded((int)llllllIlllII[1]) ? 1 : 0)) {
            return llllllIlllII[0];
        }
        var1_1.interact(llllllIllIll[llllllIlllII[0]]);
        return llllllIlllII[2];
    }

    private static boolean lIIlIlIIllIlllI(int n2) {
        return n2 == 0;
    }

    private static String lIIlIlIIllIlIlI(String var7, String var8) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), llllllIlllII[5]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llllllIlllII[3], var17);
            return new String(var14.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIllIlIll() {
        llllllIllIll = new String[llllllIlllII[4]];
        o.llllllIllIll[o.llllllIlllII[0]] = o."Use";
        o.llllllIllIll[o.llllllIlllII[2]] = o."Portal";
        o.llllllIllIll[o.llllllIlllII[3]] = o."Portal";
    }

    private static boolean lIIlIlIIllIllIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        o.lIIlIlIIllIllII();
        o.lIIlIlIIllIlIll();
    }
}

