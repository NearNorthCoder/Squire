/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.api.events.MenuEntryAdded
 *  net.runelite.api.util.Text
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.concurrent.ExecutorService;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Harvesting/Replanting", register=true)
public class HarvestingreplantingTask
extends Task {
    private final  Client gh;
    private final  ExecutorService gi;
    private  String gg;
    private static  String[] lIIIlIII;
    private static  int[] lIIIlIll;

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        if (!bD.var1(lIIIlIII[lIIIlIll[0]].equals(menuEntryAdded.getOption()) ? 1 : 0) || bD.var2(menuEntryAdded.getTarget().contains(lIIIlIII[lIIIlIll[1]]) ? 1 : 0)) {
            return;
        }
        this.gh.createMenuEntry(this.gh.getMenuOptionCount()).setOption(lIIIlIII[lIIIlIll[2]]).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            this.gg = Text.removeTags((String)menuEntryAdded.getTarget());
        });
        0;
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        return lIIIlIll[0];
    }

    @Inject
    public HarvestingreplantingTask(Client client, ExecutorService executorService) {
        this.gh = client;
        this.gi = executorService;
    }

    static {
        bD.var4();
        bD.var5();
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = lIIIlIll[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = lIIIlIll[0];
        while (bD.var3(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (((0xCF ^ 0x8E) & ~(0x20 ^ 0x61)) == 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static void var5() {
        lIIIlIII = new String[lIIIlIll[3]];
        bD.lIIIlIII[bD.lIIIlIll[0]] = "Open";
        bD.lIIIlIII[bD.lIIIlIll[1]] = "pack";
        bD.lIIIlIII[bD.lIIIlIll[2]] = "<col=ffcf40>Bulk open";
    }

    private static boolean var1(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        lIIIlIll = new int[4];
        bD.lIIIlIll[0] = (0x55 ^ 0x48) & ~(0x8E ^ 0x93);
        bD.lIIIlIll[1] = 1;
        bD.lIIIlIll[2] = 2;
        bD.lIIIlIll[3] = 3;
    }
}

