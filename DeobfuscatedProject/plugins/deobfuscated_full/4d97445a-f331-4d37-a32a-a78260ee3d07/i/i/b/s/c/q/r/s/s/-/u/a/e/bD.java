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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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

/* TASK: Harvesting/Replanting -> Harvesting/ReplantingTask */
@TaskDesc(name="Harvesting/Replanting", register=true)
public class bD
extends Task {
    private final /* synthetic */ Client gh;
    private final /* synthetic */ ExecutorService gi;
    private /* synthetic */ String gg;
    private static /* synthetic */ String[] lIIIlIII;
    private static /* synthetic */ int[] lIIIlIll;

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        if (!bD.lIIIIllIII(lIIIlIII[lIIIlIll[0]].equals(menuEntryAdded.getOption()) ? 1 : 0) || bD.lIIIIllIIl(menuEntryAdded.getTarget().contains(lIIIlIII[lIIIlIll[1]]) ? 1 : 0)) {
            return;
        }
        this.gh.createMenuEntry(this.gh.getMenuOptionCount()).setOption(lIIIlIII[lIIIlIll[2]]).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            this.gg = Text.removeTags((String)menuEntryAdded.getTarget());
        });
        0;
    }

    private static boolean lIIIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        return lIIIlIll[0];
    }

    @Inject
    public bD(Client client, ExecutorService executorService) {
        this.gh = client;
        this.gi = executorService;
    }

    static {
        bD.lIIIIlIlll();
        bD.lIIIIlIIII();
    }

    private static String lIIIIIllIl(String lllIIIllIIlIIll, String lllIIIllIIlIIlI) {
        lllIIIllIIlIIll = new String(Base64.getDecoder().decode(lllIIIllIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIllIIlIllI = new StringBuilder();
        char[] lllIIIllIIlIlIl = lllIIIllIIlIIlI.toCharArray();
        int lllIIIllIIlIlII = lIIIlIll[0];
        char[] lllIIIllIIIlllI = lllIIIllIIlIIll.toCharArray();
        int lllIIIllIIIllIl = lllIIIllIIIlllI.length;
        int lllIIIllIIIllII = lIIIlIll[0];
        while (bD.lIIIIllIlI(lllIIIllIIIllII, lllIIIllIIIllIl)) {
            char lllIIIllIIllIIl = lllIIIllIIIlllI[lllIIIllIIIllII];
            lllIIIllIIlIllI.append((char)(lllIIIllIIllIIl ^ lllIIIllIIlIlIl[lllIIIllIIlIlII % lllIIIllIIlIlIl.length]));
            0;
            ++lllIIIllIIlIlII;
            ++lllIIIllIIIllII;
            0;
            if (((0xCF ^ 0x8E) & ~(0x20 ^ 0x61)) == 0) continue;
            return null;
        }
        return String.valueOf(lllIIIllIIlIllI);
    }

    private static String lIIIIIllII(String lllIIIllIlIIllI, String lllIIIllIlIIlIl) {
        try {
            SecretKeySpec lllIIIllIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIllIlIlIlI = Cipher.getInstance("Blowfish");
            lllIIIllIlIlIlI.init(lIIIlIll[2], lllIIIllIlIlIll);
            return new String(lllIIIllIlIlIlI.doFinal(Base64.getDecoder().decode(lllIIIllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIllIlIlIIl) {
            lllIIIllIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIllIIl(int n2) {
        return n2 == 0;
    }

    private static void lIIIIlIIII() {
        lIIIlIII = new String[lIIIlIll[3]];
        bD.lIIIlIII[bD.lIIIlIll[0]] = bD."Open";
        bD.lIIIlIII[bD.lIIIlIll[1]] = bD."pack";
        bD.lIIIlIII[bD.lIIIlIll[2]] = bD."<col=ffcf40>Bulk open";
    }

    private static boolean lIIIIllIII(int n2) {
        return n2 != 0;
    }

    private static void lIIIIlIlll() {
        lIIIlIll = new int[4];
        bD.lIIIlIll[0] = (0x55 ^ 0x48) & ~(0x8E ^ 0x93);
        bD.lIIIlIll[1] = 1;
        bD.lIIIlIll[2] = 2;
        bD.lIIIlIll[3] = 3;
    }
}

