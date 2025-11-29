/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.o;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;

/* TASK: Entering portal -> EnterPortalTask */
@TaskDesc(name="Entering portal", priority=1000, blocking=true)
public class p
extends o {
    private static /* synthetic */ String[] lIlIlIlIIllII;
    private static /* synthetic */ int[] lIlIlIlIIllIl;

    private static boolean lIlllllIlIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllIlIllIll(Object object) {
        return object == null;
    }

    private static boolean lIlllllIlIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllllIlIllIlI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected p(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    private static String lIlllllIlIlIlll(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var1 = var9.toCharArray();
        int var11 = lIlIlIlIIllIl[0];
        char[] var10 = var8.toCharArray();
        int var5 = var10.length;
        int var3 = lIlIlIlIIllIl[0];
        while (p.lIlllllIlIlllll(var3, var5)) {
            char var2 = var10[var3];
            var4.append((char)(var2 ^ var1[var11 % var1.length]));
            0;
            ++var11;
            ++var3;
            0;
            if ((0x6F ^ 1 ^ (0xF2 ^ 0x99)) > 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean run() {
        void var1_1;
        p var12;
        if (!p.lIlllllIlIllIlI(this.bU.c() ? 1 : 0) || p.lIlllllIlIllIlI(this.R() ? 1 : 0)) {
            return lIlIlIlIIllIl[0];
        }
        int[] nArray = new int[lIlIlIlIIllIl[1]];
        nArray[p.lIlIlIlIIllIl[0]] = lIlIlIlIIllIl[2];
        TileObject var7 = TileObjects.getNearest((int[])nArray);
        if (p.lIlllllIlIllIll(var7)) {
            return lIlIlIlIIllIl[0];
        }
        BankLoadout var6 = var12.T();
        if (p.lIlllllIlIlllII(var6.needsToBank() ? 1 : 0)) {
            return lIlIlIlIIllIl[0];
        }
        if (p.lIlllllIlIlllIl(Combat.getMissingHealth()) && p.lIlllllIlIllllI(Skills.getBoostedLevel((Skill)Skill.PRAYER), Skills.getLevel((Skill)Skill.PRAYER))) {
            var12.bU.a(lIlIlIlIIllIl[0]);
            return lIlIlIlIIllIl[0];
        }
        var1_1.interact(lIlIlIlIIllII[lIlIlIlIIllIl[0]]);
        return lIlIlIlIIllIl[1];
    }

    private static boolean lIlllllIlIlllIl(int n2) {
        return n2 <= 0;
    }

    private static void lIlllllIlIllIII() {
        lIlIlIlIIllII = new String[lIlIlIlIIllIl[1]];
        p.lIlIlIlIIllII[p.lIlIlIlIIllIl[0]] = p."Enter";
    }

    @Override
    public boolean Q() {
        return lIlIlIlIIllIl[0];
    }

    private static void lIlllllIlIllIIl() {
        lIlIlIlIIllIl = new int[3];
        p.lIlIlIlIIllIl[0] = (0x80 ^ 0xA7) & ~(0x34 ^ 0x13);
        p.lIlIlIlIIllIl[1] = 1;
        p.lIlIlIlIIllIl[2] = 0xFFFFFF7F & 0x6895;
    }

    private static boolean lIlllllIlIlllll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        p.lIlllllIlIllIIl();
        p.lIlllllIlIllIII();
    }
}

