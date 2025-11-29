/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f_Unknown;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;

/* TASK: Killing zombified spawn -> KillingzombifiedspawnTask */
@TaskDesc(name="Killing zombified spawn", priority=50)
public class KillingZombifiedSpawnTask
extends w_Unknown {
    private static /* synthetic */ String[] lIlIlIlIIlIll;
    private static /* synthetic */ int[] lIlIlIlIIlllI;

    private static boolean lIlllllIllIIIll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected y(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static void lIlllllIllIIIII() {
        lIlIlIlIIlllI = new int[6];
        y.lIlIlIlIIlllI[0] = (0x5D ^ 0x47 ^ (5 ^ 0x38)) & (0x1D ^ 0x3E ^ (0x2B ^ 0x2F) ^ -1);
        y.lIlIlIlIIlllI[1] = 1;
        y.lIlIlIlIIlllI[2] = 0xFFFFDDCA & 0x327F;
        y.lIlIlIlIIlllI[3] = 2;
        y.lIlIlIlIIlllI[4] = 3;
        y.lIlIlIlIIlllI[5] = 0x7C ^ 0x74;
    }

    private static boolean lIlllllIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllllIlIlIIII(String var5, String var17) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIlIlIlIIlllI[3], var2);
            return new String(var19.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIllIIIIl(int n2) {
        return n2 == 0;
    }

    private static String lIlllllIlIlIlII(String var10, String var1) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var1.toCharArray();
        int var11 = lIlIlIlIIlllI[0];
        char[] var18 = var10.toCharArray();
        int var6 = var18.length;
        int var9 = lIlIlIlIIlllI[0];
        while (y.lIlllllIllIIlIl(var9, var6)) {
            char var21 = var18[var9];
            var15.append((char)(var21 ^ var16[var11 % var16.length]));
            0;
            ++var11;
            ++var9;
            0;
            if (((138 + 15 - 133 + 202 ^ 128 + 61 - 163 + 119) & (3 ^ 0x49 ^ (0x2B ^ 0x2E) ^ -1)) < 3) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static String lIlllllIlIlIlIl(String var3, String var12) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIlllI[5]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIlIlIlIIlllI[3], var8);
            return new String(var13.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    static {
        y.lIlllllIllIIIII();
        y.lIlllllIlIlIllI();
    }

    private static boolean lIlllllIllIIlII(Object object) {
        return object == null;
    }

    private static void lIlllllIlIlIllI() {
        lIlIlIlIIlIll = new String[lIlIlIlIIlllI[4]];
        y.lIlIlIlIIlIll[y.lIlIlIlIIlllI[0]] = y."Wield";
        y.lIlIlIlIIlIll[y.lIlIlIlIIlllI[1]] = y."Wield";
        y.lIlIlIlIIlIll[y.lIlIlIlIIlllI[3]] = y."staff";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        y var14;
        if (y.lIlllllIllIIIIl(this.cg.I() ? 1 : 0)) {
            return lIlIlIlIIlllI[0];
        }
        NPC var7 = var14.cg.A();
        if ((!y.lIlllllIllIIIlI(var7) || y.lIlllllIllIIIll(var7.isDead() ? 1 : 0)) && y.lIlllllIllIIIlI(Players.getLocal().getInteracting())) {
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return lIlIlIlIIlllI[0];
        }
        int[] nArray = new int[lIlIlIlIIlllI[1]];
        nArray[y.lIlIlIlIIlllI[0]] = lIlIlIlIIlllI[2];
        if (y.lIlllllIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIlIlIIlllI[1]];
            nArray2[y.lIlIlIlIIlllI[0]] = lIlIlIlIIlllI[2];
            Inventory.getFirst((int[])nArray2).interact(lIlIlIlIIlIll[lIlIlIlIIlllI[0]]);
            0;
            if (-1 >= 1) {
                return ((0xC0 ^ 0x82 ^ (0xDA ^ 0xBF)) & (0x45 ^ 0xC ^ (0xC ^ 0x62) ^ -1)) != 0;
            }
        } else {
            Inventory.interact(item -> item.getName().toLowerCase().contains(lIlIlIlIIlIll[lIlIlIlIIlllI[3]]), (String)lIlIlIlIIlIll[lIlIlIlIIlllI[1]]);
            0;
        }
        if (y.lIlllllIllIIlII(var7)) {
            return lIlIlIlIIlllI[1];
        }
        Magic.cast((Spell)SpellBook.Standard.CRUMBLE_UNDEAD, (NPC)var1_1);
        return lIlIlIlIIlllI[1];
    }

    private static boolean lIlllllIllIIIlI(Object object) {
        return object != null;
    }
}

