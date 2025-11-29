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
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a;

@TaskDesc(name="Looting Sceptre", priority=650, register=true, blocking=true)
public class f
extends Task {
    private final /* synthetic */ a y;
    private static /* synthetic */ int[] llllllIlllIl;
    private final /* synthetic */ Client z;
    private static /* synthetic */ String[] llllllIlllII;

    private static String lIIlIlIIlIIlllI(String lllllllllllllllIIlIIllIlIlIlIIlI, String lllllllllllllllIIlIIllIlIlIIllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIlIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIlIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllIlIlIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllIlIlIlIlII.init(llllllIlllIl[2], lllllllllllllllIIlIIllIlIlIlIlIl);
            return new String(lllllllllllllllIIlIIllIlIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIlIlIlIIll) {
            lllllllllllllllIIlIIllIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIlIlIIIl() {
        llllllIlllIl = new int[11];
        f.llllllIlllIl[0] = (31 + 115 - -63 + 9 ^ 80 + 55 - 78 + 75) & (104 + 184 - 165 + 82 ^ 103 + 26 - 120 + 138 ^ -" ".length());
        f.llllllIlllIl[1] = " ".length();
        f.llllllIlllIl[2] = "  ".length();
        f.llllllIlllIl[3] = "   ".length();
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
        f.llllllIlllII[f.llllllIlllIl[0]] = f.lIIlIlIIlIIllIl("AzsmOQ==", "GIIIt");
        f.llllllIlllII[f.llllllIlllIl[1]] = f.lIIlIlIIlIIlllI("KEWTQBiXcv0=", "lyWEP");
        f.llllllIlllII[f.llllllIlllIl[2]] = f.lIIlIlIIlIIllll("Co+GxIm5G8M=", "Wuagp");
        f.llllllIlllII[f.llllllIlllIl[3]] = f.lIIlIlIIlIIllll("zqn2xI2Z3oQ=", "RiYxv");
        f.llllllIlllII[f.llllllIlllIl[4]] = f.lIIlIlIIlIIllll("CDEwjoRibwOt21hLQOZxYEZFoWcdF2mc", "Xebxq");
        f.llllllIlllII[f.llllllIlllIl[5]] = f.lIIlIlIIlIIlllI("UBUdGI+pCDx6ZCu8NIhzqD27L7SjiHMj", "oBZGx");
        f.llllllIlllII[f.llllllIlllIl[6]] = f.lIIlIlIIlIIllll("Xmy0UBYREho=", "aXyAI");
        f.llllllIlllII[f.llllllIlllIl[7]] = f.lIIlIlIIlIIllll("qpkyw0tFE/c=", "cXvdE");
        f.llllllIlllII[f.llllllIlllIl[8]] = f.lIIlIlIIlIIllll("yyPIEOjWD1A=", "CSMlC");
        f.llllllIlllII[f.llllllIlllIl[9]] = f.lIIlIlIIlIIllIl("Bw0SFCk4DVQVaCQGFhY8JQA=", "WesfH");
    }

    private static boolean lIIlIlIIlIlIlII(Object object) {
        return object != null;
    }

    private static String lIIlIlIIlIIllIl(String lllllllllllllllIIlIIllIlIIllIlIl, String lllllllllllllllIIlIIllIlIIllIlII) {
        lllllllllllllllIIlIIllIlIIllIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllIlIIllIIll = new StringBuilder();
        char[] lllllllllllllllIIlIIllIlIIllIIlI = lllllllllllllllIIlIIllIlIIllIlII.toCharArray();
        int lllllllllllllllIIlIIllIlIIllIIIl = llllllIlllIl[0];
        char[] lllllllllllllllIIlIIllIlIIlIlIll = lllllllllllllllIIlIIllIlIIllIlIl.toCharArray();
        int lllllllllllllllIIlIIllIlIIlIlIlI = lllllllllllllllIIlIIllIlIIlIlIll.length;
        int lllllllllllllllIIlIIllIlIIlIlIIl = llllllIlllIl[0];
        while (f.lIIlIlIIlIlIlIl(lllllllllllllllIIlIIllIlIIlIlIIl, lllllllllllllllIIlIIllIlIIlIlIlI)) {
            char lllllllllllllllIIlIIllIlIIllIllI = lllllllllllllllIIlIIllIlIIlIlIll[lllllllllllllllIIlIIllIlIIlIlIIl];
            lllllllllllllllIIlIIllIlIIllIIll.append((char)(lllllllllllllllIIlIIllIlIIllIllI ^ lllllllllllllllIIlIIllIlIIllIIlI[lllllllllllllllIIlIIllIlIIllIIIl % lllllllllllllllIIlIIllIlIIllIIlI.length]));
            "".length();
            ++lllllllllllllllIIlIIllIlIIllIIIl;
            ++lllllllllllllllIIlIIllIlIIlIlIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIllIlIIllIIll);
    }

    public boolean run() {
        TileItem tileItem2 = TileItems.getNearest(tileItem -> tileItem.getName().contains(llllllIlllII[llllllIlllIl[9]]));
        if (f.lIIlIlIIlIlIIlI(tileItem2)) {
            return llllllIlllIl[0];
        }
        if (f.lIIlIlIIlIlIIll(Inventory.isFull() ? 1 : 0)) {
            Item lllllllllllllllIIlIIllIlIllIIIII = Inventory.getFirst(item -> item.getName().contains(llllllIlllII[llllllIlllIl[8]]));
            if (f.lIIlIlIIlIlIlII(lllllllllllllllIIlIIllIlIllIIIII)) {
                lllllllllllllllIIlIIllIlIllIIIII.interact(llllllIlllII[llllllIlllIl[0]]);
                return llllllIlllIl[1];
            }
            Item lllllllllllllllIIlIIllIlIlIlllll = Inventory.getFirst(item -> item.getName().contains(llllllIlllII[llllllIlllIl[7]]));
            if (f.lIIlIlIIlIlIlII(lllllllllllllllIIlIIllIlIlIlllll)) {
                lllllllllllllllIIlIIllIlIlIlllll.interact(llllllIlllII[llllllIlllIl[1]]);
                return llllllIlllIl[1];
            }
            Item lllllllllllllllIIlIIllIlIlIllllI = Inventory.getFirst(item -> {
                String[] stringArray = new String[llllllIlllIl[1]];
                stringArray[f.llllllIlllIl[0]] = llllllIlllII[llllllIlllIl[6]];
                return item.hasAction(stringArray);
            });
            if (f.lIIlIlIIlIlIlII(lllllllllllllllIIlIIllIlIlIllllI)) {
                lllllllllllllllIIlIIllIlIlIllllI.interact(llllllIlllII[llllllIlllIl[2]]);
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

    private static String lIIlIlIIlIIllll(String lllllllllllllllIIlIIllIlIlIIIlIl, String lllllllllllllllIIlIIllIlIlIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIlIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), llllllIlllIl[8]), "DES");
            Cipher lllllllllllllllIIlIIllIlIlIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllIlIlIIIlll.init(llllllIlllIl[2], lllllllllllllllIIlIIllIlIlIIlIII);
            return new String(lllllllllllllllIIlIIllIlIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIlIlIIIllI) {
            lllllllllllllllIIlIIllIlIlIIIllI.printStackTrace();
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

