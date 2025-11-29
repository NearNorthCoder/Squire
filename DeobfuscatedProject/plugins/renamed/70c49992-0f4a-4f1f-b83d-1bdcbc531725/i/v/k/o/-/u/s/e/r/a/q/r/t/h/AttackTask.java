/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f_Unknown;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

/* TASK: Attack -> AttackTask */
@TaskDesc(name="Attack", priority=10, register=true)
public class AttackTask
extends w_Unknown {
    private static final /* synthetic */ int cb;
    private static /* synthetic */ int[] lIlIlIllIIIIl;
    private static final /* synthetic */ String ca;
    private static /* synthetic */ String[] lIlIlIllIIIII;
    private static final /* synthetic */ int bZ;

    private static boolean lIllllllIllllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllllIlllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllIllllIl(Object object) {
        return object != null;
    }

    @Override
    public boolean Q() {
        u var7;
        NPC nPC = this.cg.c(lIlIlIllIIIIl[0]);
        if (u.lIllllllIllllII(nPC)) {
            return lIlIlIllIIIIl[1];
        }
        String[] stringArray = new String[lIlIlIllIIIIl[0]];
        stringArray[u.lIlIlIllIIIIl[1]] = lIlIlIllIIIII[lIlIlIllIIIIl[1]];
        NPC var12 = NPCs.getNearest((String[])stringArray);
        if (u.lIllllllIllllIl(var12) && u.lIllllllIlllllI(var12.isDead() ? 1 : 0)) {
            int[] nArray = new int[lIlIlIllIIIIl[0]];
            nArray[u.lIlIlIllIIIIl[1]] = lIlIlIllIIIIl[2];
            if (u.lIllllllIllllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIlIllIIIIl[0]];
                nArray2[u.lIlIlIllIIIIl[1]] = lIlIlIllIIIIl[2];
                Inventory.getFirst((int[])nArray2).interact(lIlIlIllIIIII[lIlIlIllIIIIl[0]]);
            }
            Magic.cast((Spell)SpellBook.Standard.CRUMBLE_UNDEAD, (NPC)var12);
            return lIlIlIllIIIIl[1];
        }
        if (u.lIllllllIllllll(var7.cg.I() ? 1 : 0)) {
            return lIlIlIllIIIIl[1];
        }
        if (u.lIllllllIlllllI(Combat.isSpecEnabled() ? 1 : 0)) {
            EquipmentSetup var17 = var7.cg.D();
            Gear.swapTo((int[])var17.getIds());
            0;
        }
        nPC.interact(lIlIlIllIIIII[lIlIlIllIIIIl[3]]);
        return lIlIlIllIIIIl[1];
    }

    private static void lIllllllIlllIll() {
        lIlIlIllIIIIl = new int[8];
        u.lIlIlIllIIIIl[0] = 1;
        u.lIlIlIllIIIIl[1] = (0x7F ^ 0x34) & ~(0x53 ^ 0x18);
        u.lIlIlIllIIIIl[2] = -(0xFFFFB7BE & 0x4DE7) & (0xFFFFF7FF & 0x1DEF);
        u.lIlIlIllIIIIl[3] = 2;
        u.lIlIlIllIIIIl[4] = -(32 + 17 - 43 + 183) & (0xFFFFFFFE & 0x7DBD);
        u.lIlIlIllIIIIl[5] = -(9 ^ 0xD) & (0xFFFFBF9B & 0x5F7F);
        u.lIlIlIllIIIIl[6] = 3;
        u.lIlIlIllIIIIl[7] = 91 + 120 - 137 + 95 ^ 34 + 101 - 9 + 47;
    }

    private static void lIllllllIlllIlI() {
        lIlIlIllIIIII = new String[lIlIlIllIIIIl[7]];
        u.lIlIlIllIIIII[u.lIlIlIllIIIIl[1]] = u."Zombified Spawn";
        u.lIlIlIllIIIII[u.lIlIlIllIIIIl[0]] = u."Wield";
        u.lIlIlIllIIIII[u.lIlIlIllIIIIl[3]] = u."Attack";
        u.lIlIlIllIIIII[u.lIlIlIllIIIIl[6]] = u."Zombified Spawn";
    }

    private static boolean lIlllllllIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllllllIlllIII(String var1, String var6) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var10 = var6.toCharArray();
        int var16 = lIlIlIllIIIIl[1];
        char[] var11 = var1.toCharArray();
        int var8 = var11.length;
        int var4 = lIlIlIllIIIIl[1];
        while (u.lIlllllllIIIIII(var4, var8)) {
            char var5 = var11[var4];
            var2.append((char)(var5 ^ var10[var16 % var10.length]));
            0;
            ++var16;
            ++var4;
            0;
            
            return null;
        }
        return String.valueOf(var2);
    }

    @Inject
    protected u(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static String lIllllllIlllIIl(String var15, String var13) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIlIlIllIIIIl[3], var14);
            return new String(var3.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        u.lIllllllIlllIll();
        u.lIllllllIlllIlI();
        bZ = lIlIlIllIIIIl[4];
        cb = lIlIlIllIIIIl[5];
        ca = lIlIlIllIIIII[lIlIlIllIIIIl[6]];
    }

    private static boolean lIllllllIllllII(Object object) {
        return object == null;
    }
}

