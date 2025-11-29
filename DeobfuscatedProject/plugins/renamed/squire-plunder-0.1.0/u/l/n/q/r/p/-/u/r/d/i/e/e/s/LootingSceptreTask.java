/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a_Unknown;

/* TASK: Looting Sceptre -> LootingsceptreTask */
@TaskDesc(name="Looting Sceptre", priority=650, register=true, blocking=true)
public class LootingSceptreTask
extends Task {
    private final /* synthetic */ a y;
    private static /* synthetic */ int[] llllllIlllIl;
    private final /* synthetic */ Client z;
    private static /* synthetic */ String[] llllllIlllII;

    private static String lIIlIlIIlIIlllI(String var2, String var16) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(llllllIlllIl[2], var9);
            return new String(var15.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIlIlIIIl() {
        llllllIlllIl = new int[11];
        f.llllllIlllIl[0] = (31 + 115 - -63 + 9 ^ 80 + 55 - 78 + 75) & (104 + 184 - 165 + 82 ^ 103 + 26 - 120 + 138 ^ -1);
        f.llllllIlllIl[1] = 1;
        f.llllllIlllIl[2] = 2;
        f.llllllIlllIl[3] = 3;
        f.llllllIlllIl[4] = 0xC3 ^ 0xA5 ^ (0xCE ^ 0xAC);
        f.llllllIlllIl[5] = 0x7F ^ 0x7A;
        f.llllllIlllIl[6] = 0xA2 ^ 0xA4;
        f.llllllIlllIl[7] = 0x8A ^ 0x8D;
        f.llllllIlllIl[8] = 0x64 ^ 0x6C;
        f.llllllIlllIl[9] = 0xB7 ^ 0xBE;
        f.llllllIlllIl[10] = 0x52 ^ 0x58;
    }

    private static void lIIlIlIIlIlIIII() {
        llllllIlllII = new String[llllllIlllIl[10]];
        f.llllllIlllII[f.llllllIlllIl[0]] = f."Drop";
        f.llllllIlllII[f.llllllIlllIl[1]] = f."Drop";
        f.llllllIlllII[f.llllllIlllIl[2]] = f."Eat";
        f.llllllIlllII[f.llllllIlllIl[3]] = f."Take";
        f.llllllIlllII[f.llllllIlllIl[4]] = f."Pharaoh's sceptre";
        f.llllllIlllII[f.llllllIlllIl[5]] = f."Pharaoh's sceptre";
        f.llllllIlllII[f.llllllIlllIl[6]] = f."Eat";
        f.llllllIlllII[f.llllllIlllIl[7]] = f."Golden";
        f.llllllIlllII[f.llllllIlllIl[8]] = f."Stone";
        f.llllllIlllII[f.llllllIlllIl[9]] = f."Pharaoh's sceptre";
    }

    private static boolean lIIlIlIIlIlIlII(Object object) {
        return object != null;
    }

    private static String lIIlIlIIlIIllIl(String var17, String var10) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var21 = var10.toCharArray();
        int var11 = llllllIlllIl[0];
        char[] var1 = var17.toCharArray();
        int var3 = var1.length;
        int var19 = llllllIlllIl[0];
        while (f.lIIlIlIIlIlIlIl(var19, var3)) {
            char var6 = var1[var19];
            var13.append((char)(var6 ^ var21[var11 % var21.length]));
            0;
            ++var11;
            ++var19;
            0;
            
            return null;
        }
        return String.valueOf(var13);
    }

    public boolean run() {
        TileItem tileItem2 = TileItems.getNearest(tileItem -> tileItem.getName().contains(llllllIlllII[llllllIlllIl[9]]));
        if (f.lIIlIlIIlIlIIlI(tileItem2)) {
            return llllllIlllIl[0];
        }
        if (f.lIIlIlIIlIlIIll(Inventory.isFull() ? 1 : 0)) {
            Item var22 = Inventory.getFirst(item -> item.getName().contains(llllllIlllII[llllllIlllIl[8]]));
            if (f.lIIlIlIIlIlIlII(var22)) {
                var22.interact(llllllIlllII[llllllIlllIl[0]]);
                return llllllIlllIl[1];
            }
            Item var5 = Inventory.getFirst(item -> item.getName().contains(llllllIlllII[llllllIlllIl[7]]));
            if (f.lIIlIlIIlIlIlII(var5)) {
                var5.interact(llllllIlllII[llllllIlllIl[1]]);
                return llllllIlllIl[1];
            }
            Item var12 = Inventory.getFirst(item -> {
                String[] stringArray = new String[llllllIlllIl[1]];
                stringArray[f.llllllIlllIl[0]] = llllllIlllII[llllllIlllIl[6]];
                return item.hasAction(stringArray);
            });
            if (f.lIIlIlIIlIlIlII(var12)) {
                var12.interact(llllllIlllII[llllllIlllIl[2]]);
                return llllllIlllIl[1];
            }
            return llllllIlllIl[0];
        }
        TileItems.getNearest(tileItem -> tileItem.getName().contains(llllllIlllII[llllllIlllIl[5]])).interact(llllllIlllII[llllllIlllIl[3]]);
        return llllllIlllIl[1];
    }

    private static boolean lIIlIlIIlIlIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIlIlIIlI(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIlIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIlIIlIIllll(String var14, String var20) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), llllllIlllIl[8]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(llllllIlllIl[2], var4);
            return new String(var7.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        if (f.lIIlIlIIlIlIIll(itemSpawned.getItem().getName().contains(llllllIlllII[llllllIlllIl[4]]) ? 1 : 0)) {
            this.y.b(this.y.e() + llllllIlllIl[1]);
        }
    }

    static {
        f.lIIlIlIIlIlIIIl();
        f.lIIlIlIIlIlIIII();
    }

    @Inject
    public f(a a2, Client client) {
        this.y = a2;
        this.z = client;
    }
}

