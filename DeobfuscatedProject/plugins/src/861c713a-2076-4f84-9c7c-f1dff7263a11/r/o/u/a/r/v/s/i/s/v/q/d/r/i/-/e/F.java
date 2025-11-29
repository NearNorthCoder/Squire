/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.E;

@TaskDesc(name="Grabbing death items [DEATH]", priority=0x7FFFFFFF, blocking=true)
public class F
extends E {
    @Inject
    private /* synthetic */ SquireVardorvisConfig t;
    private static /* synthetic */ int[] lIlIlIIIIIlll;
    private static final /* synthetic */ int ax;
    private static /* synthetic */ String[] lIlIIlllllIlI;

    private static boolean lIllllIlIIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllIlIIIIlIl(int n2) {
        return n2 == 0;
    }

    static {
        F.lIllllIlIIIIlII();
        F.lIllllIIlIllIIl();
        ax = lIlIlIIIIIlll[2];
    }

    private static void lIllllIlIIIIlII() {
        lIlIlIIIIIlll = new int[4];
        F.lIlIlIIIIIlll[0] = (2 ^ 0x2B ^ (0x13 ^ 0x7B)) & (5 ^ 0x77 ^ (0x12 ^ 0x21) ^ -" ".length());
        F.lIlIlIIIIIlll[1] = " ".length();
        F.lIlIlIIIIIlll[2] = 0xFFFFB693 & 0x6FEC;
        F.lIlIlIIIIIlll[3] = "  ".length();
    }

    private static void lIllllIIlIllIIl() {
        lIlIIlllllIlI = new String[lIlIlIIIIIlll[1]];
        F.lIlIIlllllIlI[F.lIlIlIIIIIlll[0]] = F.lIllllIIlIllIII("GdQrW8K5kqM=", "wccyD");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var2_2;
        F llllllllllllllIllIllIIlIIlIllIIl;
        Player player = Players.getLocal();
        if (F.lIllllIlIIIIlIl(av.contains((Locatable)player) ? 1 : 0)) {
            return lIlIlIIIIIlll[0];
        }
        int[] nArray = new int[lIlIlIIIIIlll[1]];
        nArray[F.lIlIlIIIIIlll[0]] = lIlIlIIIIIlll[2];
        NPC llllllllllllllIllIllIIlIIlIlIlll = NPCs.getNearest((int[])nArray);
        if (F.lIllllIlIIIIllI(llllllllllllllIllIllIIlIIlIlIlll)) {
            llllllllllllllIllIllIIlIIlIllIIl.aw.d(lIlIlIIIIIlll[0]);
            llllllllllllllIllIllIIlIIlIllIIl.aw.c(lIlIlIIIIIlll[1]);
            return lIlIlIIIIIlll[0];
        }
        if (F.lIllllIlIIIIlll(Inventory.isFull() ? 1 : 0)) {
            Gear.swapTo((EquipmentSetup)((BankLoadout)llllllllllllllIllIllIIlIIlIllIIl.t.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup());
            "".length();
            return lIlIlIIIIIlll[1];
        }
        var2_2.interact(lIlIIlllllIlI[lIlIlIIIIIlll[0]]);
        return lIlIlIIIIIlll[1];
    }

    private static String lIllllIIlIllIII(String llllllllllllllIllIllIIlIIlIIllll, String llllllllllllllIllIllIIlIIlIIllII) {
        try {
            SecretKeySpec llllllllllllllIllIllIIlIIlIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIlIIlIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIlIIlIlIIIl.init(lIlIlIIIIIlll[3], llllllllllllllIllIllIIlIIlIlIIlI);
            return new String(llllllllllllllIllIllIIlIIlIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIlIIlIlIIII) {
            llllllllllllllIllIllIIlIIlIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlIIIIllI(Object object) {
        return object == null;
    }
}

