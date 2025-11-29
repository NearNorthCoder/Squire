/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.account.LocalPlayer
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.g;

@TaskDesc(name="Looting", blocking=true, priority=50000)
public class B
extends Task {
    private final /* synthetic */ SquireVardorvis at;
    private static /* synthetic */ String[] lIlIlIIlIlllI;
    private /* synthetic */ e l;
    private final /* synthetic */ SquireVardorvisConfig au;
    private static /* synthetic */ int[] lIlIlIIlIllll;

    private static void lIlllllIIIIlIII() {
        lIlIlIIlIllll = new int[6];
        B.lIlIlIIlIllll[0] = (0xF7 ^ 0xC4) & ~(0x5B ^ 0x68);
        B.lIlIlIIlIllll[1] = 1;
        B.lIlIlIIlIllll[2] = 2;
        B.lIlIlIIlIllll[3] = 3;
        B.lIlIlIIlIllll[4] = 0 ^ 0x5F ^ (0xDB ^ 0x80);
        B.lIlIlIIlIllll[5] = 0x62 ^ 0x57 ^ (0x3B ^ 6);
    }

    @Inject
    public B(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.au = squireVardorvisConfig;
        this.at = squireVardorvis;
        this.l = squireVardorvis.j();
    }

    private static boolean lIlllllIIIIlIIl(int n2) {
        return n2 == 0;
    }

    private static String lIlllllIIIIIlIl(String llllllllllllllIllIlIlllIllIIIIII, String llllllllllllllIllIlIlllIlIllllIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllIllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllIlIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlllIllIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlllIllIIIIlI.init(lIlIlIIlIllll[2], llllllllllllllIllIlIlllIllIIIIll);
            return new String(llllllllllllllIllIlIlllIllIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlllIllIIIIIl) {
            llllllllllllllIllIlIlllIllIIIIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (B.lIlllllIIIIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIIlIllll[0];
        }
        TileItem llllllllllllllIllIlIlllIllIlIllI = TileItems.getNearest(tileItem -> g.Q.contains(tileItem.getName()));
        if (B.lIlllllIIIIlIlI(llllllllllllllIllIlIlllIllIlIllI)) {
            if (B.lIlllllIIIIlIIl(LocalPlayer.getAccountType().isIronman() ? 1 : 0) && B.lIlllllIIIIlIIl(LocalPlayer.getAccountType().isGroupIronman() ? 1 : 0)) {
                return lIlIlIIlIllll[0];
            }
            llllllllllllllIllIlIlllIllIlIllI = TileItems.getNearest(tileItem -> tileItem.getName().startsWith(lIlIlIIlIlllI[lIlIlIIlIllll[3]]));
            if (B.lIlllllIIIIlIlI(llllllllllllllIllIlIlllIllIlIllI)) {
                return lIlIlIIlIllll[0];
            }
        }
        if (B.lIlllllIIIIlIll(Inventory.isFull() ? 1 : 0)) {
            Item llllllllllllllIllIlIlllIllIlIlIl = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIlIlIIlIllll[1]];
                stringArray[B.lIlIlIIlIllll[0]] = lIlIlIIlIlllI[lIlIlIIlIllll[2]];
                return item.hasAction(stringArray);
            });
            if (B.lIlllllIIIIlIlI(llllllllllllllIllIlIlllIllIlIlIl)) {
                B llllllllllllllIllIlIlllIllIlIlll;
                llllllllllllllIllIlIlllIllIlIlll.at.c(lIlIlIIlIllll[1]);
                return lIlIlIIlIllll[0];
            }
            llllllllllllllIllIlIlllIllIlIlIl.interact(lIlIlIIlIlllI[lIlIlIIlIllll[0]]);
            return lIlIlIIlIllll[1];
        }
        var1_1.interact(lIlIlIIlIlllI[lIlIlIIlIllll[1]]);
        return lIlIlIIlIllll[1];
    }

    private static boolean lIlllllIIIIlIll(int n2) {
        return n2 != 0;
    }

    private static void lIlllllIIIIIlll() {
        lIlIlIIlIlllI = new String[lIlIlIIlIllll[4]];
        B.lIlIlIIlIlllI[B.lIlIlIIlIllll[0]] = B."Eat";
        B.lIlIlIIlIlllI[B.lIlIlIIlIllll[1]] = B."Take";
        B.lIlIlIIlIlllI[B.lIlIlIIlIllll[2]] = B."Eat";
        B.lIlIlIIlIlllI[B.lIlIlIIlIllll[3]] = B."Super combat potion";
    }

    private static boolean lIlllllIIIIlIlI(Object object) {
        return object == null;
    }

    static {
        B.lIlllllIIIIlIII();
        B.lIlllllIIIIIlll();
    }

    private static String lIlllllIIIIIllI(String llllllllllllllIllIlIlllIllIIlIll, String llllllllllllllIllIlIlllIllIIllII) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllIllIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllIllIIllII.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIllll[5]), "DES");
            Cipher llllllllllllllIllIlIlllIllIIllll = Cipher.getInstance("DES");
            llllllllllllllIllIlIlllIllIIllll.init(lIlIlIIlIllll[2], llllllllllllllIllIlIlllIllIlIIII);
            return new String(llllllllllllllIllIlIlllIllIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlllIllIIlllI) {
            llllllllllllllIllIlIlllIllIIlllI.printStackTrace();
            return null;
        }
    }
}

