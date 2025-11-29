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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        if (!bD.lIIIIllIII(lIIIlIII[lIIIlIll[0]].equals(menuEntryAdded.getOption()) ? 1 : 0) || bD.lIIIIllIIl(menuEntryAdded.getTarget().contains(lIIIlIII[lIIIlIll[1]]) ? 1 : 0)) {
            return;
        }
        this.gh.createMenuEntry(this.gh.getMenuOptionCount()).setOption(lIIIlIII[lIIIlIll[2]]).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            this.gg = Text.removeTags((String)menuEntryAdded.getTarget());
        });

    }

    private static boolean lIIIIllIlI(int n2, int n3) {
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
        bD.lIIIIlIlll();
        bD.lIIIIlIIII();
    }

        return String.valueOf(lllIIIllIIlIllI);
    }

    private static boolean lIIIIllIIl(int n2) {
        return n2 == 0;
    }

    private static void lIIIIlIIII() {
        lIIIlIII = new String[lIIIlIll[3]];
        bD.lIIIlIII[bD.lIIIlIll[0]] = "Open";
        bD.lIIIlIII[bD.lIIIlIll[1]] = "pack";
        bD.lIIIlIII[bD.lIIIlIll[2]] = "<col=ffcf40>Bulk open";
    }

    private static boolean lIIIIllIII(int n2) {
        return n2 != 0;
    }

}

