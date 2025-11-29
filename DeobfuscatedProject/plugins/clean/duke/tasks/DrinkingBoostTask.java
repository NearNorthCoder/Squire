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
package gg.squire.duke.tasks;

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

@TaskDesc(name="Drinking boost", priority=9999)
public class DrinkingBoostTask
extends Task {
    private final  SquireDukeSucellus aK;

    private final  SquireDukeSucellusConfig aL;
    private final  Client aJ;

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
    public DrinkingBoostTask(Client client, SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aJ = client;
        this.aK = squireDukeSucellus;
        this.aL = squireDukeSucellusConfig;
    }

    private static void lllIIlIllIlIlI() {
        lIllIIlIllll = new String[lIllIIllIIII[3]];
        u.lIllIIlIllll[u.lIllIIllIIII[0]] = "Duke Sucellus";
        u.lIllIIlIllll[u.lIllIIllIIII[2]] = "Attack";
    }

    private static boolean lllIIlIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlIllIllII(Object object) {
        return object == null;
    }

    static {
        u.lllIIlIllIlIll();
        u.lllIIlIllIlIlI();
    }

        return String.valueOf(var1);
    }
}

