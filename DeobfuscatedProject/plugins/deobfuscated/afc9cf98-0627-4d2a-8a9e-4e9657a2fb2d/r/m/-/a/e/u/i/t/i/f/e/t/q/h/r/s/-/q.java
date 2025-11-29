/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Leaving Tithe Instance", priority=0x7FFFFFFF, blocking=true)
public class q
extends Task {
    private static final /* synthetic */ int W;
    private final /* synthetic */ SquireTitheConfig X;
    private final /* synthetic */ Client Y;
    private static /* synthetic */ String[] lIIlllllIllII;
    private static /* synthetic */ int[] lIIlllllIlllI;

    static {
        q.lIllIlIlllllIll();
        q.lIllIlIlllllIlI();
        W = lIIlllllIlllI[2];
    }

    private static String lIllIlIllllIlII(String llllllllllllllIlllIIllIIIIIIllll, String llllllllllllllIlllIIllIIIIIIlIIl) {
        llllllllllllllIlllIIllIIIIIIllll = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIllIIIIIIllIl = new StringBuilder();
        char[] llllllllllllllIlllIIllIIIIIIllII = llllllllllllllIlllIIllIIIIIIlIIl.toCharArray();
        int llllllllllllllIlllIIllIIIIIIlIll = lIIlllllIlllI[0];
        char[] llllllllllllllIlllIIllIIIIIIIlIl = llllllllllllllIlllIIllIIIIIIllll.toCharArray();
        int llllllllllllllIlllIIllIIIIIIIlII = llllllllllllllIlllIIllIIIIIIIlIl.length;
        int llllllllllllllIlllIIllIIIIIIIIll = lIIlllllIlllI[0];
        while (q.lIllIlIllllllIl(llllllllllllllIlllIIllIIIIIIIIll, llllllllllllllIlllIIllIIIIIIIlII)) {
            char llllllllllllllIlllIIllIIIIIlIIII = llllllllllllllIlllIIllIIIIIIIlIl[llllllllllllllIlllIIllIIIIIIIIll];
            llllllllllllllIlllIIllIIIIIIllIl.append((char)(llllllllllllllIlllIIllIIIIIlIIII ^ llllllllllllllIlllIIllIIIIIIllII[llllllllllllllIlllIIllIIIIIIlIll % llllllllllllllIlllIIllIIIIIIllII.length]));
            0;
            ++llllllllllllllIlllIIllIIIIIIlIll;
            ++llllllllllllllIlllIIllIIIIIIIIll;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIllIIIIIIllIl);
    }

    private static boolean lIllIlIlllllllI(int n2) {
        return n2 != 0;
    }

    private static String lIllIlIllllIIll(String llllllllllllllIlllIIllIIIIIlllIl, String llllllllllllllIlllIIllIIIIIlllII) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIIIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIIIIlllII.getBytes(StandardCharsets.UTF_8)), lIIlllllIlllI[10]), "DES");
            Cipher llllllllllllllIlllIIllIIIIlIIIIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIllIIIIlIIIIl.init(lIIlllllIlllI[4], llllllllllllllIlllIIllIIIIlIIIlI);
            return new String(llllllllllllllIlllIIllIIIIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllIIIIlIIIII) {
            llllllllllllllIlllIIllIIIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIllllIlIl(String llllllllllllllIlllIIllIIIIlIllII, String llllllllllllllIlllIIllIIIIlIlIll) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIIIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIllIIIIlIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIllIIIIlIlllI.init(lIIlllllIlllI[4], llllllllllllllIlllIIllIIIIlIllll);
            return new String(llllllllllllllIlllIIllIIIIlIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllIIIIlIllIl) {
            llllllllllllllIlllIIllIIIIlIllIl.printStackTrace();
            return null;
        }
    }

    private boolean y() {
        String[] stringArray = new String[lIIlllllIlllI[3]];
        stringArray[q.lIIlllllIlllI[0]] = lIIlllllIllII[lIIlllllIlllI[5]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (q.lIllIllIIIIIIII(tileObject)) {
            return lIIlllllIlllI[0];
        }
        tileObject.interact(lIIlllllIllII[lIIlllllIlllI[6]]);
        return lIIlllllIlllI[3];
    }

    private static boolean lIllIlIllllllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIlIllllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIlllllIlI() {
        lIIlllllIllII = new String[lIIlllllIlllI[10]];
        q.lIIlllllIllII[q.lIIlllllIlllI[0]] = q."Wear";
        q.lIIlllllIllII[q.lIIlllllIlllI[3]] = q."Sack";
        q.lIIlllllIllII[q.lIIlllllIlllI[4]] = q."Deposit";
        q.lIIlllllIllII[q.lIIlllllIlllI[5]] = q."Farm door";
        q.lIIlllllIllII[q.lIIlllllIlllI[6]] = q."Open";
        q.lIIlllllIllII[q.lIIlllllIlllI[7]] = q."Farmer's";
        q.lIIlllllIllII[q.lIIlllllIlllI[8]] = q."fruit";
        q.lIIlllllIllII[q.lIIlllllIlllI[9]] = q."seed";
    }

    private static boolean lIllIlIllllllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIIIIIIII(Object object) {
        return object == null;
    }

    @Inject
    public q(SquireTitheConfig squireTitheConfig, Client client) {
        this.X = squireTitheConfig;
        this.Y = client;
    }

    public boolean run() {
        q llllllllllllllIlllIIllIIIIlllIlI;
        if (q.lIllIlIllllllII(this.Y.isInInstancedRegion() ? 1 : 0)) {
            return lIIlllllIlllI[0];
        }
        Item llllllllllllllIlllIIllIIIIlllIIl = Inventory.getFirst(item -> item.getName().endsWith(lIIlllllIllII[lIIlllllIlllI[9]]));
        if (q.lIllIlIllllllIl(Vars.getBit((int)lIIlllllIlllI[1]), lIIlllllIlllI[2]) && q.lIllIlIllllllII(llllllllllllllIlllIIllIIIIlllIlI.X.fruit().a(llllllllllllllIlllIIllIIIIlllIIl) ? 1 : 0)) {
            return lIIlllllIlllI[0];
        }
        if (q.lIllIlIlllllllI(Inventory.contains(item -> item.getName().toLowerCase().contains(lIIlllllIllII[lIIlllllIlllI[8]])) ? 1 : 0)) {
            List llllllllllllllIlllIIllIIIIlllIII = Inventory.getAll(item -> item.getName().contains(lIIlllllIllII[lIIlllllIlllI[7]]));
            if (q.lIllIlIllllllll(llllllllllllllIlllIIllIIIIlllIII.size())) {
                Iterator llllllllllllllIlllIIllIIIIllIlll = llllllllllllllIlllIIllIIIIlllIII.iterator();
                while (q.lIllIlIlllllllI(llllllllllllllIlllIIllIIIIllIlll.hasNext() ? 1 : 0)) {
                    Item llllllllllllllIlllIIllIIIIllIllI = (Item)llllllllllllllIlllIIllIIIIllIlll.next();
                    llllllllllllllIlllIIllIIIIllIllI.interact(lIIlllllIllII[lIIlllllIlllI[0]]);
                    0;
                    if (((0x37 ^ 0xF ^ (0x5D ^ 0x6A)) & (0x30 ^ 0x43 ^ (0x26 ^ 0x5A) ^ -1)) == 0) continue;
                    return ((0x6B ^ 0x18 ^ (0xC0 ^ 0x98)) & (157 + 90 - 213 + 125 ^ 104 + 5 - -24 + 47 ^ -1)) != 0;
                }
                return lIIlllllIlllI[3];
            }
            String[] stringArray = new String[lIIlllllIlllI[3]];
            stringArray[q.lIIlllllIlllI[0]] = lIIlllllIllII[lIIlllllIlllI[3]];
            TileObject llllllllllllllIlllIIllIIIIllIlll = TileObjects.getNearest((String[])stringArray);
            if (q.lIllIllIIIIIIII(llllllllllllllIlllIIllIIIIllIlll)) {
                return lIIlllllIlllI[0];
            }
            llllllllllllllIlllIIllIIIIllIlll.interact(lIIlllllIllII[lIIlllllIlllI[4]]);
            return lIIlllllIlllI[3];
        }
        return this.y();
    }

    private static void lIllIlIlllllIll() {
        lIIlllllIlllI = new int[11];
        q.lIIlllllIlllI[0] = (0x6D ^ 0x36 ^ (0x16 ^ 0x7D)) & (13 + 26 - -68 + 65 ^ 142 + 6 - 61 + 69 ^ -1);
        q.lIIlllllIlllI[1] = 0xFFFFD3FD & 0x3F1F;
        q.lIIlllllIlllI[2] = 0xFFFFF4DF & 0x3F39;
        q.lIIlllllIlllI[3] = 1;
        q.lIIlllllIlllI[4] = 2;
        q.lIIlllllIlllI[5] = 3;
        q.lIIlllllIlllI[6] = 0x63 ^ 0x67;
        q.lIIlllllIlllI[7] = 0x5E ^ 0x5B;
        q.lIIlllllIlllI[8] = 153 + 0 - 28 + 72 ^ 46 + 82 - 102 + 169;
        q.lIIlllllIlllI[9] = 150 + 86 - 111 + 54 ^ 151 + 42 - 110 + 97;
        q.lIIlllllIlllI[10] = 115 + 75 - 2 + 13 ^ 98 + 144 - 125 + 76;
    }
}

