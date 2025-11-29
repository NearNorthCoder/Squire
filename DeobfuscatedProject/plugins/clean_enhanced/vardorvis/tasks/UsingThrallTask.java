/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.Thralls
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Thralls;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Using thrall", priority=4999)
public class UsingThrallTask
extends VardorvisTaskBase {

    private static void var3() {
        var1 = new String[var2[2]];
        D.var1[D.var2[0]] = "Vardorvis";
        D.var1[D.var2[1]] = "Attack";
    }

    @Inject
    protected UsingThrallTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        D.var10();
        D.var3();
    }

    @Override
    public boolean l() {
        if (D.var11(Thralls.canUse() ? 1 : 0)) {
            return var2[0];
        }
        NPC var12 = NPCs.getNearest(nPC -> {
            int n2;
            if (D.var13(nPC.getName().equalsIgnoreCase(var1[var2[0]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[1]];
                stringArray[D.var2[0]] = var1[var2[1]];
                if (D.var13(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if null == null return n2 != 0;
                    return ((0xB9 ^ 0xAE) & ~(0xBF ^ 0xA8)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        });
        if (D.var14(var12)) {
            return var2[0];
        }
        Player var15 = Players.getLocal();
        if (D.var14(var15)) {
            return var2[0];
        }
        return Thralls.useBestThrall();
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    private static void var10() {
        var2 = new int[4];
        D.var2[0] = (0x7D ^ 0x66) & ~(0x93 ^ 0x88);
        D.var2[1] = 1;
        D.var2[2] = 2;
        D.var2[3] = 65 + 7 - 12 + 76 ^ 37 + 117 - 143 + 117;
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }
}

