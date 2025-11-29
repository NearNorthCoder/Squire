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
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
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

@TaskDesc(name="Eat", priority=110)
public class G
extends w {
    private static /* synthetic */ int[] lIlIlIlIIIllI;
    private static /* synthetic */ String[] lIlIlIlIIIlII;

    private static void lIlllllIIlllllI() {
        lIlIlIlIIIllI = new int[6];
        G.lIlIlIlIIIllI[0] = " ".length();
        G.lIlIlIlIIIllI[1] = (0x2F ^ 0x1B) & ~(0x6C ^ 0x58);
        G.lIlIlIlIIIllI[2] = "   ".length();
        G.lIlIlIlIIIllI[3] = -(0xFFFFEDB7 & 0x326F) & (0xFFFFF7EF & 0x2DFF);
        G.lIlIlIlIIIllI[4] = "  ".length();
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

    private static String lIlllllIIlllIll(String llllllllllllllIllIlIllIlIlIlIIIl, String llllllllllllllIllIlIllIlIlIIlllI) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIlIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIIllI[5]), "DES");
            Cipher llllllllllllllIllIlIllIlIlIlIIll = Cipher.getInstance("DES");
            llllllllllllllIllIlIllIlIlIlIIll.init(lIlIlIlIIIllI[4], llllllllllllllIllIlIllIlIlIlIlII);
            return new String(llllllllllllllIllIlIllIlIlIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllIlIlIlIIlI) {
            llllllllllllllIllIlIllIlIlIlIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected G(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static String lIlllllIIllllII(String llllllllllllllIllIlIllIlIlIlllII, String llllllllllllllIllIlIllIlIlIllIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIlIllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIlIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIllIlIllIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIllIlIllIIIII.init(lIlIlIlIIIllI[4], llllllllllllllIllIlIllIlIllIIIIl);
            return new String(llllllllllllllIllIlIllIlIllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIlIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllIlIlIlllll) {
            llllllllllllllIllIlIllIlIlIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIlIIIIlI(int n2) {
        return n2 != 0;
    }

    private static void lIlllllIIllllIl() {
        lIlIlIlIIIlII = new String[lIlIlIlIIIllI[4]];
        G.lIlIlIlIIIlII[G.lIlIlIlIIIllI[1]] = G.lIlllllIIlllIll("nElNtiJ1i7U=", "vLFHx");
        G.lIlIlIlIIIlII[G.lIlIlIlIIIllI[0]] = G.lIlllllIIllllII("kOOtU6w053A=", "HLobI");
    }

    @Override
    public boolean Q() {
        G llllllllllllllIllIlIllIlIllIlIll;
        if (G.lIlllllIIllllll(this.cg.c(lIlIlIlIIIllI[0]))) {
            return lIlIlIlIIIllI[1];
        }
        if (G.lIlllllIlIIIIII(Math.abs(llllllllllllllIllIlIllIlIllIlIll.cf.getTickCount() - llllllllllllllIllIlIllIlIllIlIll.cg.G()), lIlIlIlIIIllI[2])) {
            return lIlIlIlIIIllI[1];
        }
        int[] nArray = new int[lIlIlIlIIIllI[0]];
        nArray[G.lIlIlIlIIIllI[1]] = lIlIlIlIIIllI[3];
        if (G.lIlllllIlIIIIIl(Projectiles.getNearest((int[])nArray))) {
            return lIlIlIlIIIllI[1];
        }
        Item llllllllllllllIllIlIllIlIllIlIlI = Inventory.getFirst(item -> item.hasAction(lIlIlIlIIIlII[lIlIlIlIIIllI[0]]::equals));
        if (G.lIlllllIIllllll(llllllllllllllIllIlIllIlIllIlIlI)) {
            return lIlIlIlIIIllI[1];
        }
        NPC llllllllllllllIllIlIllIlIllIlIIl = llllllllllllllIllIlIllIlIllIlIll.cg.A();
        if (G.lIlllllIlIIIIIl(llllllllllllllIllIlIllIlIllIlIIl)) {
            return lIlIlIlIIIllI[1];
        }
        if (G.lIlllllIlIIIIIl(llllllllllllllIllIlIllIlIllIlIll.cg.A())) {
            return lIlIlIlIIIllI[1];
        }
        int llllllllllllllIllIlIllIlIllIlIII = Skills.getLevel((Skill)Skill.HITPOINTS);
        int llllllllllllllIllIlIllIlIllIIlll = llllllllllllllIllIlIllIlIllIlIll.ce.eatAtHP();
        int llllllllllllllIllIlIllIlIllIIllI = llllllllllllllIllIlIllIlIllIlIII - llllllllllllllIllIlIllIlIllIIlll;
        if (G.lIlllllIlIIIIlI(llllllllllllllIllIlIllIlIllIlIll.cg.I() ? 1 : 0)) {
            llllllllllllllIllIlIllIlIllIIlll += llllllllllllllIllIlIllIlIllIIllI / lIlIlIlIIIllI[4];
        }
        if (G.lIlllllIlIIIIll(Combat.getCurrentHealth(), llllllllllllllIllIlIllIlIllIIlll)) {
            llllllllllllllIllIlIllIlIllIlIlI.interact(lIlIlIlIIIlII[lIlIlIlIIIllI[1]]);
            llllllllllllllIllIlIllIlIllIlIll.cg.a(llllllllllllllIllIlIllIlIllIlIll.cf.getTickCount());
            llllllllllllllIllIlIllIlIllIlIll.cg.b(llllllllllllllIllIlIllIlIllIlIll.cf.getTickCount());
            return lIlIlIlIIIllI[0];
        }
        return lIlIlIlIIIllI[1];
    }

    private static boolean lIlllllIlIIIIll(int n2, int n3) {
        return n2 <= n3;
    }
}

