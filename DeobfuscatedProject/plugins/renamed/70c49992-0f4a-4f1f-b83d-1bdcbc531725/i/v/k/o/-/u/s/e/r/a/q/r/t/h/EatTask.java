/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
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
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

/* TASK: Eat -> EatingTask */
@TaskDesc(name="Eat", priority=110)
public class EatTask
extends w_Unknown {
    private static /* synthetic */ int[] lIlIlIlIIIllI;
    private static /* synthetic */ String[] lIlIlIlIIIlII;

    private static void lIlllllIIlllllI() {
        lIlIlIlIIIllI = new int[6];
        G.lIlIlIlIIIllI[0] = 1;
        G.lIlIlIlIIIllI[1] = (0x2F ^ 0x1B) & ~(0x6C ^ 0x58);
        G.lIlIlIlIIIllI[2] = 3;
        G.lIlIlIlIIIllI[3] = -(0xFFFFEDB7 & 0x326F) & (0xFFFFF7EF & 0x2DFF);
        G.lIlIlIlIIIllI[4] = 2;
        G.lIlIlIlIIIllI[5] = 0x61 ^ 0x69;
    }

    private static boolean lIlllllIlIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllllIlIIIIIl(Object object) {
        return object != null;
    }

    static {
        G.lIlllllIIlllllI();
        G.lIlllllIIllllIl();
    }

    private static boolean lIlllllIIllllll(Object object) {
        return object == null;
    }

    private static String lIlllllIIlllIll(String var16, String var13) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIIllI[5]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIlIlIlIIIllI[4], var15);
            return new String(var1.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    @Inject
    protected G(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static String lIlllllIIllllII(String var7, String var2) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIlIlIIIllI[4], var10);
            return new String(var5.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIlIIIIlI(int n2) {
        return n2 != 0;
    }

    private static void lIlllllIIllllIl() {
        lIlIlIlIIIlII = new String[lIlIlIlIIIllI[4]];
        G.lIlIlIlIIIlII[G.lIlIlIlIIIllI[1]] = G."Eat";
        G.lIlIlIlIIIlII[G.lIlIlIlIIIllI[0]] = G."Eat";
    }

    @Override
    public boolean Q() {
        G var12;
        if (G.lIlllllIIllllll(this.cg.c(lIlIlIlIIIllI[0]))) {
            return lIlIlIlIIIllI[1];
        }
        if (G.lIlllllIlIIIIII(Math.abs(var12.cf.getTickCount() - var12.cg.G()), lIlIlIlIIIllI[2])) {
            return lIlIlIlIIIllI[1];
        }
        int[] nArray = new int[lIlIlIlIIIllI[0]];
        nArray[G.lIlIlIlIIIllI[1]] = lIlIlIlIIIllI[3];
        if (G.lIlllllIlIIIIIl(Projectiles.getNearest((int[])nArray))) {
            return lIlIlIlIIIllI[1];
        }
        Item var8 = Inventory.getFirst(item -> item.hasAction(lIlIlIlIIIlII[lIlIlIlIIIllI[0]]::equals));
        if (G.lIlllllIIllllll(var8)) {
            return lIlIlIlIIIllI[1];
        }
        NPC var3 = var12.cg.A();
        if (G.lIlllllIlIIIIIl(var3)) {
            return lIlIlIlIIIllI[1];
        }
        if (G.lIlllllIlIIIIIl(var12.cg.A())) {
            return lIlIlIlIIIllI[1];
        }
        int var4 = Skills.getLevel((Skill)Skill.HITPOINTS);
        int var14 = var12.ce.eatAtHP();
        int var9 = var4 - var14;
        if (G.lIlllllIlIIIIlI(var12.cg.I() ? 1 : 0)) {
            var14 += var9 / lIlIlIlIIIllI[4];
        }
        if (G.lIlllllIlIIIIll(Combat.getCurrentHealth(), var14)) {
            var8.interact(lIlIlIlIIIlII[lIlIlIlIIIllI[1]]);
            var12.cg.a(var12.cf.getTickCount());
            var12.cg.b(var12.cf.getTickCount());
            return lIlIlIlIIIllI[0];
        }
        return lIlIlIlIIIllI[1];
    }

    private static boolean lIlllllIlIIIIll(int n2, int n3) {
        return n2 <= n3;
    }
}

