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
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.E_Unknown;

/* TASK: Grabbing death items [DEATH] -> Grabbingdeathitems[Death]Task */
@TaskDesc(name="Grabbing death items [DEATH]", priority=0x7FFFFFFF, blocking=true)
public class GrabbingDeathItemsDeathTask
extends E_Unknown {
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
        F.lIlIlIIIIIlll[0] = (2 ^ 0x2B ^ (0x13 ^ 0x7B)) & (5 ^ 0x77 ^ (0x12 ^ 0x21) ^ -1);
        F.lIlIlIIIIIlll[1] = 1;
        F.lIlIlIIIIIlll[2] = 0xFFFFB693 & 0x6FEC;
        F.lIlIlIIIIIlll[3] = 2;
    }

    private static void lIllllIIlIllIIl() {
        lIlIIlllllIlI = new String[lIlIlIIIIIlll[1]];
        F.lIlIIlllllIlI[F.lIlIlIIIIIlll[0]] = F."Loot";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var2_2;
        F var6;
        Player player = Players.getLocal();
        if (F.lIllllIlIIIIlIl(av.contains((Locatable)player) ? 1 : 0)) {
            return lIlIlIIIIIlll[0];
        }
        int[] nArray = new int[lIlIlIIIIIlll[1]];
        nArray[F.lIlIlIIIIIlll[0]] = lIlIlIIIIIlll[2];
        NPC var7 = NPCs.getNearest((int[])nArray);
        if (F.lIllllIlIIIIllI(var7)) {
            var6.aw.d(lIlIlIIIIIlll[0]);
            var6.aw.c(lIlIlIIIIIlll[1]);
            return lIlIlIIIIIlll[0];
        }
        if (F.lIllllIlIIIIlll(Inventory.isFull() ? 1 : 0)) {
            Gear.swapTo((EquipmentSetup)((BankLoadout)var6.t.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup());
            0;
            return lIlIlIIIIIlll[1];
        }
        var2_2.interact(lIlIIlllllIlI[lIlIlIIIIIlll[0]]);
        return lIlIlIIIIIlll[1];
    }

    private static String lIllllIIlIllIII(String var1, String var2) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIlIlIIIIIlll[3], var4);
            return new String(var3.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlIIIIllI(Object object) {
        return object == null;
    }
}

