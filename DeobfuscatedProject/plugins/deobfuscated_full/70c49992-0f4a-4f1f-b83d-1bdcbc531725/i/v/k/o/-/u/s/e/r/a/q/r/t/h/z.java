/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;

/* TASK: Poke -> PokeTask */
@TaskDesc(name="Poke", priority=250, blocking=true)
public class z
extends w {
    private static /* synthetic */ String[] lIlIlIlIllIIl;
    private static /* synthetic */ int[] lIlIlIlIllIlI;

    private static boolean lIllllllIlIIlII(Object object) {
        return object == null;
    }

    private static void lIllllllIlIIIlI() {
        lIlIlIlIllIIl = new String[lIlIlIlIllIlI[1]];
        z.lIlIlIlIllIIl[z.lIlIlIlIllIlI[0]] = z."Poke";
    }

    private static String lIllllllIlIIIIl(String var6, String var10) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var5 = var10.toCharArray();
        int var9 = lIlIlIlIllIlI[0];
        char[] var8 = var6.toCharArray();
        int var4 = var8.length;
        int var7 = lIlIlIlIllIlI[0];
        while (z.lIllllllIlIIlll(var7, var4)) {
            char var1 = var8[var7];
            var2.append((char)(var1 ^ var5[var9 % var5.length]));
            0;
            ++var9;
            ++var7;
            0;
            
            return null;
        }
        return String.valueOf(var2);
    }

    @Override
    public boolean Q() {
        z var3;
        NPC nPC = this.cg.c(lIlIlIlIllIlI[0]);
        if (z.lIllllllIlIIlII(nPC)) {
            return lIlIlIlIllIlI[0];
        }
        if (z.lIllllllIlIIlIl(var3.V() ? 1 : 0)) {
            var3.x.a(lIlIlIlIllIlI[1]);
            return lIlIlIlIllIlI[0];
        }
        if (z.lIllllllIlIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIlIlIlIllIlI[0];
        }
        nPC.interact(lIlIlIlIllIIl[lIlIlIlIllIlI[0]]);
        return lIlIlIlIllIlI[1];
    }

    private static boolean lIllllllIlIIllI(int n2) {
        return n2 != 0;
    }

    private static void lIllllllIlIIIll() {
        lIlIlIlIllIlI = new int[2];
        z.lIlIlIlIllIlI[0] = (0x94 ^ 0x8C) & ~(2 ^ 0x1A);
        z.lIlIlIlIllIlI[1] = 1;
    }

    @Inject
    protected z(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean lIllllllIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        z.lIllllllIlIIIll();
        z.lIllllllIlIIIlI();
    }
}

