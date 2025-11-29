/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.kitten.SquireKittenConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

/* TASK: Hunt Cat -> HuntcatTask */
@TaskDesc(name="Hunt Cat")
public class az
extends Task {
    private static /* synthetic */ String[] lIIIlII;
    private static /* synthetic */ int[] lIIIlIl;
    private final /* synthetic */ SquireKittenConfig dM;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        az llllIIIllllIIII;
        if (az.lIIIlIlII(this.dM.huntSpice() ? 1 : 0)) {
            return lIIIlIl[0];
        }
        if (az.lIIIlIlIl(Inventory.isFull() ? 1 : 0)) {
            return lIIIlIl[0];
        }
        TileItem llllIIIlllIllll = TileItems.getNearest(tileItem -> {
            int n2;
            if (az.lIIIlIlII(tileItem.getName().contains(lIIIlII[lIIIlIl[4]]) ? 1 : 0) && az.lIIIlIlIl(tileItem.getName().contains(this.dM.spiceType().ax()) ? 1 : 0)) {
                n2 = lIIIlIl[1];
                0;
                if (((60 + 41 - -4 + 38 ^ 99 + 60 - 42 + 61) & (0xCD ^ 0xA7 ^ (0x23 ^ 0x74) ^ -1)) != 0) {
                    return ((0x8F ^ 0x83 ^ (0xBA ^ 0x99)) & (166 + 11 - 130 + 128 ^ 122 + 76 - 76 + 6 ^ -1)) != 0;
                }
            } else {
                n2 = lIIIlIl[0];
            }
            return n2 != 0;
        });
        if (az.lIIIlIllI(llllIIIlllIllll)) {
            llllIIIlllIllll.interact(lIIIlII[lIIIlIl[0]]);
            return lIIIlIl[1];
        }
        NPC llllIIIlllIlllI = NPCs.getNearest(nPC -> {
            boolean bl2;
            NPC llllIIIlllIllII;
            if ((!az.lIIIlIlII(nPC.getName().toLowerCase().contains(lIIIlII[lIIIlIl[2]]) ? 1 : 0) || az.lIIIlIlIl(nPC.getName().toLowerCase().contains(lIIIlII[lIIIlIl[3]]) ? 1 : 0)) && az.lIIIllIII(llllIIIlllIllII.getInteracting(), Players.getLocal())) {
                bl2 = lIIIlIl[1];
                0;
                if ((0x92 ^ 0x96) < 0) {
                    return false;
                }
            } else {
                bl2 = lIIIlIl[0];
            }
            return bl2;
        });
        if (az.lIIIlIlll(llllIIIlllIlllI)) {
            return lIIIlIl[0];
        }
        var2_2.interact(lIIIlII[lIIIlIl[1]]);
        return lIIIlIl[1];
    }

    private static String lIIIIlllI(String llllIIIllIlIIII, String llllIIIllIIllll) {
        llllIIIllIlIIII = new String(Base64.getDecoder().decode(llllIIIllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIIIllIIlllI = new StringBuilder();
        char[] llllIIIllIIllIl = llllIIIllIIllll.toCharArray();
        int llllIIIllIIllII = lIIIlIl[0];
        char[] llllIIIllIIIllI = llllIIIllIlIIII.toCharArray();
        int llllIIIllIIIlIl = llllIIIllIIIllI.length;
        int llllIIIllIIIlII = lIIIlIl[0];
        while (az.lIIIllIIl(llllIIIllIIIlII, llllIIIllIIIlIl)) {
            char llllIIIllIlIIIl = llllIIIllIIIllI[llllIIIllIIIlII];
            llllIIIllIIlllI.append((char)(llllIIIllIlIIIl ^ llllIIIllIIllIl[llllIIIllIIllII % llllIIIllIIllIl.length]));
            0;
            ++llllIIIllIIllII;
            ++llllIIIllIIIlII;
            0;
            if (-(0x6D ^ 0x63 ^ (0x67 ^ 0x6C)) < 0) continue;
            return null;
        }
        return String.valueOf(llllIIIllIIlllI);
    }

    private static void lIIIlIIlI() {
        lIIIlII = new String[lIIIlIl[5]];
        az.lIIIlII[az.lIIIlIl[0]] = az."Take";
        az.lIIIlII[az.lIIIlIl[1]] = az."Chase";
        az.lIIIlII[az.lIIIlIl[2]] = az."kitten";
        az.lIIIlII[az.lIIIlIl[3]] = az."cat";
        az.lIIIlII[az.lIIIlIl[4]] = az."Empty";
    }

    @Inject
    public az(SquireKittenConfig squireKittenConfig) {
        this.dM = squireKittenConfig;
    }

    static {
        az.lIIIlIIll();
        az.lIIIlIIlI();
    }

    private static void lIIIlIIll() {
        lIIIlIl = new int[7];
        az.lIIIlIl[0] = (0x3E ^ 0x2F ^ (0xD8 ^ 0x92)) & (0x40 ^ 0x38 ^ (0x18 ^ 0x3B) ^ -1);
        az.lIIIlIl[1] = 1;
        az.lIIIlIl[2] = 2;
        az.lIIIlIl[3] = 3;
        az.lIIIlIl[4] = 0x5B ^ 0x17 ^ (0x43 ^ 0xB);
        az.lIIIlIl[5] = 73 + 43 - 33 + 74 ^ 75 + 144 - 145 + 78;
        az.lIIIlIl[6] = 0x22 ^ 0x2B ^ 1;
    }

    private static boolean lIIIllIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIlII(int n2) {
        return n2 == 0;
    }

    private static String lIIIIllll(String llllIIIllIllllI, String llllIIIllIlllIl) {
        try {
            SecretKeySpec llllIIIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIIllIlllIl.getBytes(StandardCharsets.UTF_8)), lIIIlIl[6]), "DES");
            Cipher llllIIIlllIIIlI = Cipher.getInstance("DES");
            llllIIIlllIIIlI.init(lIIIlIl[2], llllIIIlllIIIll);
            return new String(llllIIIlllIIIlI.doFinal(Base64.getDecoder().decode(llllIIIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIIlllIIIIl) {
            llllIIIlllIIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIII(String llllIIIlIlllIll, String llllIIIlIlllIlI) {
        try {
            SecretKeySpec llllIIIlIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIIlIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIIIlIllllIl = Cipher.getInstance("Blowfish");
            llllIIIlIllllIl.init(lIIIlIl[2], llllIIIlIlllllI);
            return new String(llllIIIlIllllIl.doFinal(Base64.getDecoder().decode(llllIIIlIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIIlIllllII) {
            llllIIIlIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIllI(Object object) {
        return object != null;
    }

    private static boolean lIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIlll(Object object) {
        return object == null;
    }
}

