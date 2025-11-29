/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.az_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Grabbing Pickaxe -> GrabbingpickaxeTask */
@TaskDesc(name="Grabbing Pickaxe", priority=100, blocking=true)
public class GrabbingPickaxeTask
extends az_Unknown {
    private static /* synthetic */ String[] llIIIlllIII;
    private static /* synthetic */ int[] llIIIlllIIl;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        int n2 = Vars.getBit((int)llIIIlllIIl[0]);
        if (aA.lIIlllllIlIIIl(n2)) {
            return llIIIlllIIl[1];
        }
        TileObject var13 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aA.lIIlllllIlIlIl(tileObject.getId(), llIIIlllIIl[9]) && aA.lIIlllllIlIIll(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llIIIlllIIl[3];
                0;
                if (2 <= 0) {
                    return ((215 + 12 - 73 + 76 ^ 152 + 90 - 105 + 43) & (0xC9 ^ 0xA6 ^ (0xFF ^ 0xC2) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIlllIIl[1];
            }
            return n2 != 0;
        });
        if (aA.lIIlllllIlIIlI(var13)) {
            return llIIIlllIIl[1];
        }
        if (aA.lIIlllllIlIIll(Inventory.isFull() ? 1 : 0)) {
            int var6 = llIIIlllIIl[1];
            List var3 = Inventory.getAll(item -> {
                int n2;
                if (aA.lIIlllllIlIIll(item.hasAction(llIIIlllIII[llIIIlllIIl[7]]::equals) ? 1 : 0) && aA.lIIlllllIlIIll(item.hasAction(llIIIlllIII[llIIIlllIIl[8]]::equals) ? 1 : 0)) {
                    n2 = llIIIlllIIl[3];
                    0;
                    if (-(0x13 ^ 0x17) >= 0) {
                        return false;
                    }
                } else {
                    n2 = llIIIlllIIl[1];
                }
                return n2 != 0;
            });
            if (aA.lIIlllllIlIIIl(var3.isEmpty() ? 1 : 0)) {
                int var11 = llIIIlllIIl[1];
                while (aA.lIIlllllIlIlII(var11, Math.min(llIIIlllIIl[2], var3.size() - llIIIlllIIl[3]))) {
                    ((Item)var3.get(var11)).interact(llIIIlllIII[llIIIlllIIl[1]]);
                    var6 = llIIIlllIIl[3];
                    Object[] objectArray = new Object[llIIIlllIIl[3]];
                    objectArray[aA.llIIIlllIIl[1]] = ((Item)var3.get(var11)).getName();
                    Log.info((String)llIIIlllIII[llIIIlllIIl[3]], (Object[])objectArray);
                    ++var11;
                    0;
                    
                    return (1 & (1 ^ -1)) != 0;
                }
            }
            if (aA.lIIlllllIlIIll(var6)) {
                return llIIIlllIIl[3];
            }
            List var11 = Inventory.getAll(item -> {
                int n2;
                if (aA.lIIlllllIlIIll(item.hasAction(llIIIlllIII[llIIIlllIIl[5]]::equals) ? 1 : 0) && aA.lIIlllllIlIIll(item.hasAction(llIIIlllIII[llIIIlllIIl[6]]::equals) ? 1 : 0)) {
                    n2 = llIIIlllIIl[3];
                    0;
                    if (2 < 0) {
                        return ((51 + 18 - -45 + 13 ^ (0xA7 ^ 0xC1)) & (0x43 ^ 0x54 ^ (0x3A ^ 0x34) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIlllIIl[1];
                }
                return n2 != 0;
            });
            if (aA.lIIlllllIlIIIl(var11.isEmpty() ? 1 : 0)) {
                int var7 = llIIIlllIIl[1];
                while (aA.lIIlllllIlIlII(var7, Math.min(llIIIlllIIl[2], var11.size() - llIIIlllIIl[3]))) {
                    ((Item)var11.get(var7)).interact(llIIIlllIII[llIIIlllIIl[4]]);
                    ++var7;
                    0;
                    if (2 != 1) continue;
                    return false;
                }
                return llIIIlllIIl[3];
            }
        }
        var2_2.interact(llIIIlllIII[llIIIlllIIl[2]]);
        return llIIIlllIIl[3];
    }

    private static boolean lIIlllllIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlllllIIlllI(String var2, String var19) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var1 = var19.toCharArray();
        int var9 = llIIIlllIIl[1];
        char[] var23 = var2.toCharArray();
        int var22 = var23.length;
        int var16 = llIIIlllIIl[1];
        while (aA.lIIlllllIlIlII(var16, var22)) {
            char var12 = var23[var16];
            var8.append((char)(var12 ^ var1[var9 % var1.length]));
            0;
            ++var9;
            ++var16;
            0;
            if ((0xEF ^ 0xB8 ^ (0xF4 ^ 0xA7)) == (0x25 ^ 0x18 ^ (0xBC ^ 0x85))) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean lIIlllllIlIIlI(Object object) {
        return object == null;
    }

    private static void lIIlllllIIllll() {
        llIIIlllIII = new String[llIIIlllIIl[10]];
        aA.llIIIlllIII[aA.llIIIlllIIl[1]] = aA."Drop";
        aA.llIIIlllIII[aA.llIIIlllIIl[3]] = aA."Dropped food {}";
        aA.llIIIlllIII[aA.llIIIlllIIl[4]] = aA."Drop";
        aA.llIIIlllIII[aA.llIIIlllIIl[2]] = aA."Take-pickaxe";
        aA.llIIIlllIII[aA.llIIIlllIIl[5]] = aA."Empty";
        aA.llIIIlllIII[aA.llIIIlllIIl[6]] = aA."Drop";
        aA.llIIIlllIII[aA.llIIIlllIIl[7]] = aA."Eat";
        aA.llIIIlllIII[aA.llIIIlllIIl[8]] = aA."Drop";
    }

    private static String lIIlllllIIllII(String var4, String var5) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(llIIIlllIIl[4], var20);
            return new String(var18.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lIIlllllIIllIl(String var10, String var21) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), llIIIlllIIl[10]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(llIIIlllIIl[4], var17);
            return new String(var15.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static void lIIlllllIlIIII() {
        llIIIlllIIl = new int[11];
        aA.llIIIlllIIl[0] = -(0xFFFFADD5 & 0x53BE) & (0xFFFFB9FB & Short.MAX_VALUE);
        aA.llIIIlllIIl[1] = (121 + 103 - 174 + 148 ^ 93 + 60 - 12 + 18) & (0x22 ^ 0x13 ^ (5 ^ 0x6D) ^ -1);
        aA.llIIIlllIIl[2] = 3;
        aA.llIIIlllIIl[3] = 1;
        aA.llIIIlllIIl[4] = 2;
        aA.llIIIlllIIl[5] = 81 + 12 - 56 + 125 ^ 135 + 97 - 117 + 51;
        aA.llIIIlllIIl[6] = 145 + 120 - 209 + 126 ^ 120 + 133 - 206 + 132;
        aA.llIIIlllIIl[7] = 0x4F ^ 0x65 ^ (0x41 ^ 0x6D);
        aA.llIIIlllIIl[8] = 0x91 ^ 0x96;
        aA.llIIIlllIIl[9] = -(0xFFFFDE22 & 0x6DDF) & (0xFFFFFFDF & 0xFDBD);
        aA.llIIIlllIIl[10] = 0xA4 ^ 0x94 ^ (0xB8 ^ 0x80);
    }

    private static boolean lIIlllllIlIIll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected aA(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        aA.lIIlllllIlIIII();
        aA.lIIlllllIIllll();
    }

    private static boolean lIIlllllIlIlIl(int n2, int n3) {
        return n2 == n3;
    }
}

