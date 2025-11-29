/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.basics.combat.Lure.LureConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.M;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@Singleton
@TaskDesc(name="Attacking lurable", priority=2, blocking=true)
public class P
extends Task {
    private static /* synthetic */ String[] lIIIllI;
    private final /* synthetic */ LureConfig cb;
    private static /* synthetic */ int[] lIIIlll;
    private final /* synthetic */ M ca;

    static {
        P.lIIIlllII();
        P.lIIIllIll();
    }

    @Inject
    public P(M m2, LureConfig lureConfig) {
        this.ca = m2;
        this.cb = lureConfig;
    }

    private static boolean lIIIlllIl(int n2) {
        return n2 == 0;
    }

    private static void lIIIlllII() {
        lIIIlll = new int[4];
        P.lIIIlll[0] = (0x35 ^ 0x5B ^ (0x46 ^ 0x2F)) & (0xA6 ^ 0x8B ^ (0xA4 ^ 0x8E) ^ -1);
        P.lIIIlll[1] = 1;
        P.lIIIlll[2] = 2;
        P.lIIIlll[3] = 0x42 ^ 0x5E ^ (0x18 ^ 0xC);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        P llllIIIlIlIIIIl;
        if (P.lIIIlllIl(this.ca.aI() ? 1 : 0)) {
            return lIIIlll[0];
        }
        Player llllIIIlIlIIIII = Players.getLocal();
        if (P.lIIIllllI(llllIIIlIlIIIII)) {
            return lIIIlll[0];
        }
        NPC llllIIIlIIlllll = llllIIIlIlIIIIl.ca.a(lIIIlll[1], (NPC)llllIIIlIlIIIII.getInteracting());
        if (P.lIIIllllI(llllIIIlIIlllll)) {
            return lIIIlll[0];
        }
        int[] nArray = new int[lIIIlll[1]];
        nArray[P.lIIIlll[0]] = llllIIIlIlIIIIl.cb.tagging();
        if (P.lIIIlllIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIlll[1]];
            nArray2[P.lIIIlll[0]] = llllIIIlIlIIIIl.cb.tagging();
            Item llllIIIlIIllllI = Inventory.getFirst((int[])nArray2);
            llllIIIlIIllllI.interact(lIIIllI[lIIIlll[0]]);
            return lIIIlll[0];
        }
        var2_2.interact(lIIIllI[lIIIlll[1]]);
        return lIIIlll[1];
    }

    private static String lIIIllIlI(String llllIIIlIIlIllI, String llllIIIlIIlIIll) {
        try {
            SecretKeySpec llllIIIlIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), lIIIlll[3]), "DES");
            Cipher llllIIIlIIllIII = Cipher.getInstance("DES");
            llllIIIlIIllIII.init(lIIIlll[2], llllIIIlIIllIIl);
            return new String(llllIIIlIIllIII.doFinal(Base64.getDecoder().decode(llllIIIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIIlIIlIlll) {
            llllIIIlIIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllI(Object object) {
        return object == null;
    }

    private static void lIIIllIll() {
        lIIIllI = new String[lIIIlll[2]];
        P.lIIIllI[P.lIIIlll[0]] = P."Wield";
        P.lIIIllI[P.lIIIlll[1]] = P."Attack";
    }
}

