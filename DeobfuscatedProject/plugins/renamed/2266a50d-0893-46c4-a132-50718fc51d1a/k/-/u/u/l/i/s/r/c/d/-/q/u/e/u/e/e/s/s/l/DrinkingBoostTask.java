/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Combat
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Combat;

/* TASK: Drinking boost -> DrinkingboostTask */
@TaskDesc(name="Drinking boost", priority=9999)
public class DrinkingBoostTask
extends Task {
    private final /* synthetic */ SquireDukeSucellus aK;
    private static /* synthetic */ String[] lIllIIlIllll;
    private static /* synthetic */ int[] lIllIIllIIII;
    private final /* synthetic */ SquireDukeSucellusConfig aL;
    private final /* synthetic */ Client aJ;

    private static boolean lllIIlIllIllIl(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (u.lllIIlIllIllIl(nPC.getName().equals(lIllIIlIllll[lIllIIllIIII[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIllIIII[2]];
                stringArray[u.lIllIIllIIII[0]] = lIllIIlIllll[lIllIIllIIII[2]];
                if (u.lllIIlIllIllIl(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIllIIII[2];
                    0;
                    if (((0xB9 ^ 0x85) & ~(0x4D ^ 0x71)) <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIIllIIII[0];
            return n2 != 0;
        });
        if (u.lllIIlIllIllII(nPC2)) {
            return lIllIIllIIII[0];
        }
        return Combat.drinkBoostingPotion((int)lIllIIllIIII[1]);
    }

    @Inject
    public u(Client client, SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aJ = client;
        this.aK = squireDukeSucellus;
        this.aL = squireDukeSucellusConfig;
    }

    private static void lllIIlIllIlIlI() {
        lIllIIlIllll = new String[lIllIIllIIII[3]];
        u.lIllIIlIllll[u.lIllIIllIIII[0]] = u."Duke Sucellus";
        u.lIllIIlIllll[u.lIllIIllIIII[2]] = u."Attack";
    }

    private static boolean lllIIlIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIIlIllIlIll() {
        lIllIIllIIII = new int[4];
        u.lIllIIllIIII[0] = (0xD ^ 0x16) & ~(0x76 ^ 0x6D);
        u.lIllIIllIIII[1] = 30 + 18 - -37 + 90 ^ 153 + 126 - 219 + 97;
        u.lIllIIllIIII[2] = 1;
        u.lIllIIllIIII[3] = 2;
    }

    private static boolean lllIIlIllIllII(Object object) {
        return object == null;
    }

    static {
        u.lllIIlIllIlIll();
        u.lllIIlIllIlIlI();
    }

    private static String lllIIlIllIlIIl(String var8, String var5) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var4 = var5.toCharArray();
        int var7 = lIllIIllIIII[0];
        char[] var3 = var8.toCharArray();
        int var1 = var3.length;
        int var6 = lIllIIllIIII[0];
        while (u.lllIIlIllIlllI(var6, var1)) {
            char var9 = var3[var6];
            var2.append((char)(var9 ^ var4[var7 % var4.length]));
            0;
            ++var7;
            ++var6;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }
}

