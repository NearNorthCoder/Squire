/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum33;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking Akkha (Butterfly)")
public class AttackingAkkhaButterflyTask
extends AutotoaTaskBase {
    
    private  int dr;

    private static boolean lIIlIllIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        ay.lIIlIllIIIllII();
        ay.lIIlIllIIIlIll();
    }

    private static boolean lIIlIllIIIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIllIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        NPC llllllllllllllllIlIlIIllIlllllll2;
        WorldPoint var2;
        o var3;
        ay var4;
        if (ay.lIIlIllIIIllIl(this.bu() ? 1 : 0)) {
            return lIllIIllIlI[0];
        }
        if (ay.lIIlIllIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
            var4.bp();
        }
        if (ay.lIIlIllIIIllll((Object)(var3 = var4.bv()))) {
            return lIllIIllIlI[0];
        }
        WorldPoint var5 = null;
        int llllllllllllllllIlIlIIllIlllllll2 = lIllIIllIlI[0];
        while (ay.lIIlIllIIlIIII(llllllllllllllllIlIlIIllIlllllll2, var3.M().size())) {
            var2 = var4.a(var3.M().get(llllllllllllllllIlIlIIllIlllllll2));
            if (ay.lIIlIllIIIlllI(var2.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var5 = var4.a(var3.M().get((llllllllllllllllIlIlIIllIlllllll2 + lIllIIllIlI[1]) % var3.M().size()));

                if (null == null) break;
                return false;
            }
            ++llllllllllllllllIlIlIIllIlllllll2;

            if ((0xF7 ^ 0xBC ^ (0x48 ^ 7)) == (44 + 59 - 44 + 91 ^ 37 + 22 - 29 + 116)) continue;
            return ((0x25 ^ 0x5D ^ (0x5D ^ 4)) & (0xE2 ^ 0x90 ^ (0x55 ^ 6) ^ -1)) != 0;
        }
        if (ay.lIIlIllIIIllIl(var4.g(llllllllllllllllIlIlIIllIlllllll2 = var4.J()) ? 1 : 0)) {
            var2 = var4.bx().a(var4.cu);
            String[] stringArray = new String[lIllIIllIlI[1]];
            stringArray[ay.lIllIIllIlI[0]] = lIllIIllIIl[lIllIIllIlI[0]];
            llllllllllllllllIlIlIIllIlllllll2 = NPCs.getNearest((WorldPoint)var2, (String[])stringArray);
        }
        if (ay.lIIlIllIIIllll(llllllllllllllllIlIlIIllIlllllll2)) {
            return lIllIIllIlI[0];
        }
        var2 = Players.getLocal().getWorldLocation();
        NPC var6 = var3.N().iterator();
        while (ay.lIIlIllIIIlllI(var6.hasNext() ? 1 : 0)) {
            Point var7 = var6.next();
            if (ay.lIIlIllIIIlllI(var2.equals((Object)var4.a(var7)) ? 1 : 0)) {
                llllllllllllllllIlIlIIllIlllllll2.interact(lIllIIllIIl[lIllIIllIlI[1]]);
            }

            if ((89 + 130 - 89 + 1 ^ 112 + 111 - 201 + 113) != -1) continue;
            return ((0xA4 ^ 0x82 ^ (0x44 ^ 0x20)) & (110 + 78 - 142 + 82 ^ 187 + 118 - 186 + 75 ^ -1)) != 0;
        }
        if (ay.lIIlIllIIIllll(var5) && ay.lIIlIllIIIllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            var4.g(var4.a(var3.M().get(lIllIIllIlI[0])));
            return lIllIIllIlI[1];
        }
        var6 = var4.J();
        if (ay.lIIlIllIIlIIIl(var6.getWorldArea().distanceTo((Locatable)Players.getLocal()), lIllIIllIlI[2])) {
            return lIllIIllIlI[0];
        }
        if (ay.lIIlIllIIIllll(var5)) {
            return lIllIIllIlI[0];
        }
        Movement.setDestination((WorldPoint)var2_2);
        return lIllIIllIlI[1];
    }

    private static void lIIlIllIIIlIll() {
        lIllIIllIIl = new String[lIllIIllIlI[2]];
        ay.lIllIIllIIl[ay.lIllIIllIlI[0]] = "Akkha's Shadow";
        ay.lIllIIllIIl[ay.lIllIIllIlI[1]] = "Attack";
    }

    private static boolean lIIlIllIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIIlIllIIIlllI(int n2) {
        return n2 != 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        if (ay.lIIlIllIIIllIl(this.g(this.J()) ? 1 : 0)) {
            return this.cW.shadowAttackStyle();
        }
        return super.br();
    }

    @Inject
    protected AttackingAkkhaButterflyTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.dr = lIllIIllIlI[0];
    }
}

