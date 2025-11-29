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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ap;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.o;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

/* TASK: Attacking Akkha (Butterfly) -> Attackingakkha(Butterfly)Task */
@TaskDesc(name="Attacking Akkha (Butterfly)")
public class ay
extends ap {
    private static /* synthetic */ int[] lIllIIllIlI;
    private /* synthetic */ int dr;
    private static /* synthetic */ String[] lIllIIllIIl;

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

    private static String lIIlIllIIIlIlI(String var8, String var11) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var2 = var11.toCharArray();
        int var7 = lIllIIllIlI[0];
        char[] var14 = var8.toCharArray();
        int var18 = var14.length;
        int var1 = lIllIIllIlI[0];
        while (ay.lIIlIllIIlIIII(var1, var18)) {
            char var19 = var14[var1];
            var10.append((char)(var19 ^ var2[var7 % var2.length]));
            0;
            ++var7;
            ++var1;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static void lIIlIllIIIllII() {
        lIllIIllIlI = new int[3];
        ay.lIllIIllIlI[0] = (0xD ^ 2 ^ (0x6E ^ 0x34)) & (0x58 ^ 0x57 ^ (0x7F ^ 0x25) ^ -1);
        ay.lIllIIllIlI[1] = 1;
        ay.lIllIIllIlI[2] = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        NPC llllllllllllllllIlIlIIllIlllllll2;
        WorldPoint var13;
        o var5;
        ay var16;
        if (ay.lIIlIllIIIllIl(this.bu() ? 1 : 0)) {
            return lIllIIllIlI[0];
        }
        if (ay.lIIlIllIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
            var16.bp();
        }
        if (ay.lIIlIllIIIllll((Object)(var5 = var16.bv()))) {
            return lIllIIllIlI[0];
        }
        WorldPoint var4 = null;
        int llllllllllllllllIlIlIIllIlllllll2 = lIllIIllIlI[0];
        while (ay.lIIlIllIIlIIII(llllllllllllllllIlIlIIllIlllllll2, var5.M().size())) {
            var13 = var16.a(var5.M().get(llllllllllllllllIlIlIIllIlllllll2));
            if (ay.lIIlIllIIIlllI(var13.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var4 = var16.a(var5.M().get((llllllllllllllllIlIlIIllIlllllll2 + lIllIIllIlI[1]) % var5.M().size()));
                0;
                if (null == null) break;
                return false;
            }
            ++llllllllllllllllIlIlIIllIlllllll2;
            0;
            if ((0xF7 ^ 0xBC ^ (0x48 ^ 7)) == (44 + 59 - 44 + 91 ^ 37 + 22 - 29 + 116)) continue;
            return ((0x25 ^ 0x5D ^ (0x5D ^ 4)) & (0xE2 ^ 0x90 ^ (0x55 ^ 6) ^ -1)) != 0;
        }
        if (ay.lIIlIllIIIllIl(var16.g(llllllllllllllllIlIlIIllIlllllll2 = var16.J()) ? 1 : 0)) {
            var13 = var16.bx().a(var16.cu);
            String[] stringArray = new String[lIllIIllIlI[1]];
            stringArray[ay.lIllIIllIlI[0]] = lIllIIllIIl[lIllIIllIlI[0]];
            llllllllllllllllIlIlIIllIlllllll2 = NPCs.getNearest((WorldPoint)var13, (String[])stringArray);
        }
        if (ay.lIIlIllIIIllll(llllllllllllllllIlIlIIllIlllllll2)) {
            return lIllIIllIlI[0];
        }
        var13 = Players.getLocal().getWorldLocation();
        NPC var3 = var5.N().iterator();
        while (ay.lIIlIllIIIlllI(var3.hasNext() ? 1 : 0)) {
            Point var17 = var3.next();
            if (ay.lIIlIllIIIlllI(var13.equals((Object)var16.a(var17)) ? 1 : 0)) {
                llllllllllllllllIlIlIIllIlllllll2.interact(lIllIIllIIl[lIllIIllIlI[1]]);
            }
            0;
            if ((89 + 130 - 89 + 1 ^ 112 + 111 - 201 + 113) != -1) continue;
            return ((0xA4 ^ 0x82 ^ (0x44 ^ 0x20)) & (110 + 78 - 142 + 82 ^ 187 + 118 - 186 + 75 ^ -1)) != 0;
        }
        if (ay.lIIlIllIIIllll(var4) && ay.lIIlIllIIIllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            var16.g(var16.a(var5.M().get(lIllIIllIlI[0])));
            return lIllIIllIlI[1];
        }
        var3 = var16.J();
        if (ay.lIIlIllIIlIIIl(var3.getWorldArea().distanceTo((Locatable)Players.getLocal()), lIllIIllIlI[2])) {
            return lIllIIllIlI[0];
        }
        if (ay.lIIlIllIIIllll(var4)) {
            return lIllIIllIlI[0];
        }
        Movement.setDestination((WorldPoint)var2_2);
        return lIllIIllIlI[1];
    }

    private static void lIIlIllIIIlIll() {
        lIllIIllIIl = new String[lIllIIllIlI[2]];
        ay.lIllIIllIIl[ay.lIllIIllIlI[0]] = ay."Akkha's Shadow";
        ay.lIllIIllIIl[ay.lIllIIllIlI[1]] = ay."Attack";
    }

    private static String lIIlIllIIIlIIl(String var12, String var15) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lIllIIllIlI[2], var9);
            return new String(var20.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
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
    protected ay(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.dr = lIllIIllIlI[0];
    }
}

