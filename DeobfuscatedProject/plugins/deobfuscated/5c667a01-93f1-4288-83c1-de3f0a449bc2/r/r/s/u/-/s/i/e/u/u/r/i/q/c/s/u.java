/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d;

@TaskDesc(name="Looting and burying bones", blocking=true, priority=10000)
public class u
extends Task {
    private final /* synthetic */ SquireScurriusConfig ah;
    private /* synthetic */ b c;
    private static /* synthetic */ String[] lIIlIllIIIIII;
    private static /* synthetic */ int[] lIIlIllIIIIIl;
    private final /* synthetic */ SquireScurrius ag;

    private static boolean lIlIllIIlIlIIlI(int n2) {
        return n2 != 0;
    }

    static {
        u.lIlIllIIlIIlllI();
        u.lIlIllIIlIIllIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        u llllllllllllllIllllIllIIIllllIII;
        if (u.lIlIllIIlIIllll(this.ah.lootBigBones() ? 1 : 0)) {
            return lIIlIllIIIIIl[0];
        }
        if (u.lIlIllIIlIIllll(llllllllllllllIllllIllIIIllllIII.ag.c() ? 1 : 0)) {
            return lIIlIllIIIIIl[0];
        }
        String[] stringArray = new String[lIIlIllIIIIIl[1]];
        stringArray[u.lIIlIllIIIIIl[0]] = lIIlIllIIIIII[lIIlIllIIIIIl[0]];
        NPC llllllllllllllIllllIllIIIlllIlll = NPCs.getNearest((String[])stringArray);
        if (u.lIlIllIIlIlIIII(llllllllllllllIllllIllIIIlllIlll)) {
            return lIIlIllIIIIIl[0];
        }
        int[] nArray = new int[lIIlIllIIIIIl[1]];
        nArray[u.lIIlIllIIIIIl[0]] = lIIlIllIIIIIl[2];
        Item llllllllllllllIllllIllIIIlllIllI = Inventory.getFirst((int[])nArray);
        if (u.lIlIllIIlIlIIII(llllllllllllllIllllIllIIIlllIllI)) {
            llllllllllllllIllllIllIIIlllIllI.interact(lIIlIllIIIIII[lIIlIllIIIIIl[1]]);
            return lIIlIllIIIIIl[1];
        }
        TileItem llllllllllllllIllllIllIIIlllIlIl = TileItems.getNearest(tileItem -> tileItem.getName().equals(lIIlIllIIIIII[lIIlIllIIIIIl[7]]));
        if (u.lIlIllIIlIlIIIl(llllllllllllllIllllIllIIIlllIlIl)) {
            return lIIlIllIIIIIl[0];
        }
        if (u.lIlIllIIlIlIIlI(Inventory.isFull() ? 1 : 0)) {
            Item llllllllllllllIllllIllIIIlllIlII = Inventory.getFirst(item -> d.z.contains(item.getName()));
            if (u.lIlIllIIlIlIIII(llllllllllllllIllllIllIIIlllIlII)) {
                llllllllllllllIllllIllIIIlllIlII.interact(lIIlIllIIIIII[lIIlIllIIIIIl[3]]);
                return lIIlIllIIIIIl[1];
            }
            Item llllllllllllllIllllIllIIIlllIIll = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIIlIllIIIIIl[1]];
                stringArray[u.lIIlIllIIIIIl[0]] = lIIlIllIIIIII[lIIlIllIIIIIl[6]];
                return item.hasAction(stringArray);
            });
            if (u.lIlIllIIlIlIIIl(llllllllllllllIllllIllIIIlllIIll)) {
                llllllllllllllIllllIllIIIllllIII.ag.e(lIIlIllIIIIIl[1]);
                return lIIlIllIIIIIl[0];
            }
            llllllllllllllIllllIllIIIlllIIll.interact(lIIlIllIIIIII[lIIlIllIIIIIl[4]]);
            return lIIlIllIIIIIl[1];
        }
        var3_3.interact(lIIlIllIIIIII[lIIlIllIIIIIl[5]]);
        return lIIlIllIIIIIl[1];
    }

    private static boolean lIlIllIIlIlIIII(Object object) {
        return object != null;
    }

    @Inject
    public u(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ah = squireScurriusConfig;
        this.ag = squireScurrius;
        this.c = squireScurrius.n();
    }

    private static boolean lIlIllIIlIIllll(int n2) {
        return n2 == 0;
    }

    private static void lIlIllIIlIIllIl() {
        lIIlIllIIIIII = new String[lIIlIllIIIIIl[8]];
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[0]] = u."Scurrius";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[1]] = u."Bury";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[3]] = u."Drop";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[4]] = u."Eat";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[5]] = u."Take";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[6]] = u."Eat";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[7]] = u."Big bones";
    }

    private static boolean lIlIllIIlIlIIIl(Object object) {
        return object == null;
    }

    private static void lIlIllIIlIIlllI() {
        lIIlIllIIIIIl = new int[10];
        u.lIIlIllIIIIIl[0] = (0x58 ^ 0x1D) & ~(0x50 ^ 0x15);
        u.lIIlIllIIIIIl[1] = 1;
        u.lIIlIllIIIIIl[2] = 0xFFFFF637 & 0xBDC;
        u.lIIlIllIIIIIl[3] = 2;
        u.lIIlIllIIIIIl[4] = 3;
        u.lIIlIllIIIIIl[5] = 0x41 ^ 0x45;
        u.lIIlIllIIIIIl[6] = 0x5E ^ 0x5B;
        u.lIIlIllIIIIIl[7] = 0x9D ^ 0x9B;
        u.lIIlIllIIIIIl[8] = 0x6D ^ 0x6A;
        u.lIIlIllIIIIIl[9] = 0x3C ^ 0x34;
    }

    private static String lIlIllIIlIIlIll(String llllllllllllllIllllIllIIIlIIIlII, String llllllllllllllIllllIllIIIlIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllllIllIIIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIlIllIIIIIl[9]), "DES");
            Cipher llllllllllllllIllllIllIIIlIIlIII = Cipher.getInstance("DES");
            llllllllllllllIllllIllIIIlIIlIII.init(lIIlIllIIIIIl[3], llllllllllllllIllllIllIIIlIIlIIl);
            return new String(llllllllllllllIllllIllIIIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIllIIIlIIIlll) {
            llllllllllllllIllllIllIIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIlIIllII(String llllllllllllllIllllIllIIIlIlIIIl, String llllllllllllllIllllIllIIIlIlIIII) {
        try {
            SecretKeySpec llllllllllllllIllllIllIIIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIIIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIllIIIlIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIllIIIlIlIlIl.init(lIIlIllIIIIIl[3], llllllllllllllIllllIllIIIlIlIllI);
            return new String(llllllllllllllIllllIllIIIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIllIIIlIlIlII) {
            llllllllllllllIllllIllIIIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIlIIlIlI(String llllllllllllllIllllIllIIIllIlIII, String llllllllllllllIllllIllIIIllIIlll) {
        llllllllllllllIllllIllIIIllIlIII = new String(Base64.getDecoder().decode(llllllllllllllIllllIllIIIllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIllIIIllIIllI = new StringBuilder();
        char[] llllllllllllllIllllIllIIIllIIlIl = llllllllllllllIllllIllIIIllIIlll.toCharArray();
        int llllllllllllllIllllIllIIIllIIlII = lIIlIllIIIIIl[0];
        char[] llllllllllllllIllllIllIIIlIllllI = llllllllllllllIllllIllIIIllIlIII.toCharArray();
        int llllllllllllllIllllIllIIIlIlllIl = llllllllllllllIllllIllIIIlIllllI.length;
        int llllllllllllllIllllIllIIIlIlllII = lIIlIllIIIIIl[0];
        while (u.lIlIllIIlIlIIll(llllllllllllllIllllIllIIIlIlllII, llllllllllllllIllllIllIIIlIlllIl)) {
            char llllllllllllllIllllIllIIIllIlIIl = llllllllllllllIllllIllIIIlIllllI[llllllllllllllIllllIllIIIlIlllII];
            llllllllllllllIllllIllIIIllIIllI.append((char)(llllllllllllllIllllIllIIIllIlIIl ^ llllllllllllllIllllIllIIIllIIlIl[llllllllllllllIllllIllIIIllIIlII % llllllllllllllIllllIllIIIllIIlIl.length]));
            0;
            ++llllllllllllllIllllIllIIIllIIlII;
            ++llllllllllllllIllllIllIIIlIlllII;
            0;
            if (1 < (0x6E ^ 0x6A)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIllIIIllIIllI);
    }

    private static boolean lIlIllIIlIlIIll(int n2, int n3) {
        return n2 < n3;
    }
}

