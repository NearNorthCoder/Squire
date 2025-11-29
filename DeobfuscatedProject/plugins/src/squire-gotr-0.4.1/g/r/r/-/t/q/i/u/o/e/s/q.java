/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
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
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Entering Altar", priority=2, blocking=true)
public class q
extends h {
    private static /* synthetic */ int[] llIIlllIIIlI;
    private static /* synthetic */ String[] llIIlllIIIIl;

    private static boolean lllllllIIIIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        int lllllllllllllllIlIIllIIIIlIIllIl;
        int n2;
        int lllllllllllllllIlIIllIIIIlIIlllI;
        int n3;
        q lllllllllllllllIlIIllIIIIlIlIIlI;
        void lllllllllllllllIlIIllIIIIlIlIIIl;
        d d2 = this.aV.h();
        if (q.lllllllIIIIlII((Object)d2)) {
            return llIIlllIIIlI[1];
        }
        if (!q.lllllllIIIIlIl(lllllllllllllllIlIIllIIIIlIlIIIl.V(), Skills.getLevel((Skill)Skill.RUNECRAFT)) || q.lllllllIIIIllI(lllllllllllllllIlIIllIIIIlIlIIlI.aV.p())) {
            return llIIlllIIIlI[1];
        }
        if (q.lllllllIIIIlll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllIIIlI[1];
        }
        Player lllllllllllllllIlIIllIIIIlIlIIII = Players.getLocal();
        int lllllllllllllllIlIIllIIIIlIIllll = lllllllllllllllIlIIllIIIIlIlIIlI.aV.q() - lllllllllllllllIlIIllIIIIlIlIIlI.aV.p();
        if (q.lllllllIIIIlll(lllllllllllllllIlIIllIIIIlIlIIlI.aV.E() ? 1 : 0) && !q.lllllllIIIIlIl(lllllllllllllllIlIIllIIIIlIlIIlI.aV.p(), llIIlllIIIlI[3]) || q.lllllllIIIlIII((Object)lllllllllllllllIlIIllIIIIlIlIIlI.aV.m(), (Object)c.FINISHING) && q.lllllllIIIlIIl(lllllllllllllllIlIIllIIIIlIlIIlI.aV.p())) {
            n3 = llIIlllIIIlI[2];
            "".length();
            if (null != null) {
                return ((0x5C ^ 0x19) & ~(0x3F ^ 0x7A)) != 0;
            }
        } else {
            n3 = llIIlllIIIlI[1];
        }
        if (q.lllllllIIIIllI(lllllllllllllllIlIIllIIIIlIIlllI = n3) && q.lllllllIIIlIlI(lllllllllllllllIlIIllIIIIlIIllll, Inventory.getFreeSlots()) && q.lllllllIIIlIll((Object)lllllllllllllllIlIIllIIIIlIlIIlI.aV.m(), (Object)c.FINISHING)) {
            return llIIlllIIIlI[1];
        }
        if (q.lllllllIIIlIlI(lllllllllllllllIlIIllIIIIlIIllll, llIIlllIIIlI[0]) && q.lllllllIIIlIIl(lllllllllllllllIlIIllIIIIlIlIIlI.aV.a())) {
            n2 = llIIlllIIIlI[2];
            "".length();
            if (-" ".length() > "   ".length()) {
                return ((0xF0 ^ 0xBC) & ~(3 ^ 0x4F)) != 0;
            }
        } else {
            n2 = lllllllllllllllIlIIllIIIIlIIllIl = llIIlllIIIlI[1];
        }
        if (q.lllllllIIIIllI(lllllllllllllllIlIIllIIIIlIIlllI) && (!q.lllllllIIIllII(lllllllllllllllIlIIllIIIIlIlIIII.getAnimation(), llIIlllIIIlI[4]) || q.lllllllIIIIlll(lllllllllllllllIlIIllIIIIlIIllIl))) {
            return llIIlllIIIlI[1];
        }
        String[] stringArray = new String[llIIlllIIIlI[2]];
        stringArray[q.llIIlllIIIlI[1]] = lllllllllllllllIlIIllIIIIlIlIIIl.T();
        TileObject lllllllllllllllIlIIllIIIIlIIllII = TileObjects.getNearest((String[])stringArray);
        if (q.lllllllIIIIlII(lllllllllllllllIlIIllIIIIlIIllII)) {
            return llIIlllIIIlI[1];
        }
        if (q.lllllllIIIIllI(lllllllllllllllIlIIllIIIIlIlIIlI.b((GameObject)lllllllllllllllIlIIllIIIIlIIllII) ? 1 : 0)) {
            lllllllllllllllIlIIllIIIIlIIllII.interact(llIIlllIIIIl[llIIlllIIIlI[1]]);
        }
        return llIIlllIIIlI[2];
    }

    private static boolean lllllllIIIlIII(Object object, Object object2) {
        return object == object2;
    }

    static {
        q.lllllllIIIIIll();
        q.lllllllIIIIIlI();
    }

    private static boolean lllllllIIIllII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllllllIIIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllllllIIIIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public q(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllIIIlI[0]];
        cArray[q.llIIlllIIIlI[1]] = c.ACTIVE;
        cArray[q.llIIlllIIIlI[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lllllllIIIlIIl(int n2) {
        return n2 > 0;
    }

    private static String lllllllIIIIIIl(String lllllllllllllllIlIIllIIIIlIIIIlI, String lllllllllllllllIlIIllIIIIlIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), llIIlllIIIlI[5]), "DES");
            Cipher lllllllllllllllIlIIllIIIIlIIIllI = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIIIIlIIIllI.init(llIIlllIIIlI[0], lllllllllllllllIlIIllIIIIlIIIlll);
            return new String(lllllllllllllllIlIIllIIIIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIIIIlIIIlIl) {
            lllllllllllllllIlIIllIIIIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lllllllIIIIIlI() {
        llIIlllIIIIl = new String[llIIlllIIIlI[2]];
        q.llIIlllIIIIl[q.llIIlllIIIlI[1]] = q.lllllllIIIIIIl("D+k7f0KpWHA=", "CwDFk");
    }

    private static void lllllllIIIIIll() {
        llIIlllIIIlI = new int[6];
        q.llIIlllIIIlI[0] = "  ".length();
        q.llIIlllIIIlI[1] = (0x58 ^ 6 ^ (5 ^ 0x1C)) & (155 + 168 - 226 + 99 ^ 80 + 45 - 78 + 84 ^ -" ".length());
        q.llIIlllIIIlI[2] = " ".length();
        q.llIIlllIIIlI[3] = 0xB2 ^ 0xA3 ^ (0xB2 ^ 0x91);
        q.llIIlllIIIlI[4] = -(0xFFFFCE6B & 0x7BBF) & (0xFFFFEFFF & 0x7EBF);
        q.llIIlllIIIlI[5] = 0x99 ^ 0x91;
    }

    private static boolean lllllllIIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllllllIIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllIIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }
}

