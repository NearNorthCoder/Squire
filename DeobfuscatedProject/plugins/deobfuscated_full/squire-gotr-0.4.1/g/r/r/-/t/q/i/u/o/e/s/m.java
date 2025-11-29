/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.d;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

/* TASK: Crafting a guardian -> CraftingaguardianTask */
@TaskDesc(name="Crafting a guardian", priority=10, blocking=true)
public class m
extends h {
    private static /* synthetic */ String[] llIIlllIlIll;
    private static /* synthetic */ int[] llIIlllIllIl;

    private static String lllllllIlIlIlI(String var9, String var7) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llIIlllIllIl[0], var2);
            return new String(var3.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lllllllIllIlII(Object object) {
        return object == null;
    }

    private static void lllllllIlIllII() {
        llIIlllIlIll = new String[llIIlllIllIl[2]];
        m.llIIlllIlIll[m.llIIlllIllIl[1]] = m."Assemble";
    }

    private static boolean lllllllIllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllllIllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllIllIllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var3_3;
        GameObject var6;
        GameObject gameObject;
        m var5;
        block15: {
            block14: {
                if (!m.lllllllIllIIll(this.aV.g() ? 1 : 0) || !m.lllllllIllIIll(this.aW.craftGuardian() ? 1 : 0)) break block14;
                int[] nArray = new int[llIIlllIllIl[2]];
                nArray[m.llIIlllIllIl[1]] = llIIlllIllIl[3];
                if (m.lllllllIllIIll(Inventory.contains((int[])nArray) ? 1 : 0) && !m.lllllllIllIIll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) break block15;
            }
            return llIIlllIllIl[1];
        }
        if (m.lllllllIllIIll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllIllIl[1];
        }
        Item var4 = var5.aV.e();
        if (m.lllllllIllIlII(var4)) {
            return llIIlllIllIl[1];
        }
        if (m.lllllllIllIlIl(var4.getId(), llIIlllIllIl[4])) {
            return llIIlllIllIl[1];
        }
        if (m.lllllllIllIllI(var5.aV.O() ? 1 : 0)) {
            return llIIlllIllIl[1];
        }
        d var1 = var5.aV.h();
        if (m.lllllllIllIlII((Object)var1)) {
            return llIIlllIllIl[1];
        }
        if (m.lllllllIllIIll(var1.Z() ? 1 : 0)) {
            gameObject = var5.aV.A();
            0;
            if (1 >= 3) {
                return false;
            }
        } else {
            gameObject = var5.aV.B();
        }
        if (m.lllllllIllIlII(var6 = gameObject)) {
            return llIIlllIllIl[1];
        }
        if (m.lllllllIllIlll(var6.distanceTo((Locatable)Players.getLocal()), llIIlllIllIl[5]) && m.lllllllIllIIll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIIlllIllIl[2];
        }
        var3_3.interact(llIIlllIlIll[llIIlllIllIl[1]]);
        return llIIlllIllIl[2];
    }

    @Inject
    public m(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllIllIl[0]];
        cArray[m.llIIlllIllIl[1]] = c.ACTIVE;
        cArray[m.llIIlllIllIl[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    static {
        m.lllllllIllIIII();
        m.lllllllIlIllII();
    }

    private static void lllllllIllIIII() {
        llIIlllIllIl = new int[6];
        m.llIIlllIllIl[0] = 2;
        m.llIIlllIllIl[1] = (81 + 185 - 126 + 46 ^ 142 + 115 - 216 + 119) & (0x1C ^ 0x79 ^ 126 + 76 - 132 + 57 ^ -1);
        m.llIIlllIllIl[2] = 1;
        m.llIIlllIllIl[3] = -(0xFFFFC127 & 0x3FFD) & (0xFFFFF7FF & 0xFFF);
        m.llIIlllIllIl[4] = 0xFFFFEFBE & 0x7947;
        m.llIIlllIllIl[5] = 0x10 ^ 0x14;
    }

    private static boolean lllllllIllIlIl(int n2, int n3) {
        return n2 != n3;
    }
}

