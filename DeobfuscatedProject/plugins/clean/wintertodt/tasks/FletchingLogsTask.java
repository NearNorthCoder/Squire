/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum8;
import gg.squire.wintertodt.tasks.BHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Fletching Logs", priority=1, blocking=true, register=true)
public class FletchingLogsTask
extends Task {
    private static final  int U;

    private final  SquireWintertodtConfig W;
    private final  b V;
    private  int X;

    private static boolean llIIIIlIlllIllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var4_4;
        n var1;
        if (!n.llIIIIlIlllIlIl(this.V.i() ? 1 : 0) || !n.llIIIIlIlllIllI(this.V.u() ? 1 : 0) || n.llIIIIlIlllIlIl(this.V.j() ? 1 : 0)) {
            return lIlIllllIlIIl[0];
        }
        int[] nArray = new int[lIlIllllIlIIl[1]];
        nArray[n.lIlIllllIlIIl[0]] = lIlIllllIlIIl[2];
        int var2 = Inventory.getCount((int[])nArray);
        if (!n.llIIIIlIlllIlIl(var1.W.fletch() ? 1 : 0) || n.llIIIIlIlllIlll(var1.V.f(), lIlIllllIlIIl[3] - var2 * lIlIllllIlIIl[4])) {
            return lIlIllllIlIIl[0];
        }
        int[] nArray2 = new int[lIlIllllIlIIl[1]];
        nArray2[n.lIlIllllIlIIl[0]] = lIlIllllIlIIl[5];
        if (n.llIIIIlIllllIII(var2 + Inventory.getCount((int[])nArray2), var1.V.g())) {
            return lIlIllllIlIIl[0];
        }
        Player var3 = Players.getLocal();
        a var4 = var1.V.q();
        if (n.llIIIIlIllllIII(var4.b().distanceTo((Locatable)var3), lIlIllllIlIIl[6]) && n.llIIIIlIlllIllI(var3.isMoving() ? 1 : 0)) {
            return lIlIllllIlIIl[0];
        }
        int[] nArray3 = new int[lIlIllllIlIIl[1]];
        nArray3[n.lIlIllllIlIIl[0]] = lIlIllllIlIIl[2];
        Item var5 = Inventory.getFirst((int[])nArray3);
        int[] nArray4 = new int[lIlIllllIlIIl[1]];
        nArray4[n.lIlIllllIlIIl[0]] = lIlIllllIlIIl[7];
        Item var6 = Inventory.getFirst((int[])nArray4);
        if (!n.llIIIIlIllllIIl(var5) || n.llIIIIlIllllIlI(var6)) {
            return lIlIllllIlIIl[0];
        }
        if (n.llIIIIlIllllIll(Players.getLocal().getAnimation(), lIlIllllIlIIl[8])) {
            int n2 = var1.X;
            var1.X = n2 - lIlIllllIlIIl[1];
            if (n.llIIIIlIlllllII(n2)) {
                var1.X = lIlIllllIlIIl[6];
                return lIlIllllIlIIl[0];
            }
        }
        var4_4.useOn((Item)var5_5);
        this.X = lIlIllllIlIIl[6];
        this.V.FletchingLogsTask();
        return lIlIllllIlIIl[1];
    }

    private static boolean llIIIIlIllllIlI(Object object) {
        return object == null;
    }

    private static boolean llIIIIlIllllIll(int n2, int n3) {
        return n2 == n3;
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!n.llIIIIlIlllIllI(string.contains(lIlIllllIIlll[lIlIllllIlIIl[0]]) ? 1 : 0) || n.llIIIIlIlllIlIl(string.contains(lIlIllllIIlll[lIlIllllIlIIl[1]]) ? 1 : 0)) {
            var7.X = lIlIllllIlIIl[0];
        }
    }

    @Inject
    public FletchingLogsTask(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.V = b2;
        this.W = squireWintertodtConfig;
    }

    private static boolean llIIIIlIllllIIl(Object object) {
        return object != null;
    }

    private static void llIIIIlIlllIIII() {
        lIlIllllIIlll = new String[lIlIllllIlIIl[6]];
        n.lIlIllllIIlll[n.lIlIllllIlIIl[0]] = "seeps into your bones";
        n.lIlIllllIIlll[n.lIlIllllIlIIl[1]] = "Congratulations";
    }

    private static boolean llIIIIlIlllIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIlIllllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIIlIlllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIlIlllllII(int n2) {
        return n2 >= 0;
    }

    static {
        n.llIIIIlIlllIlII();
        n.llIIIIlIlllIIII();
        U = lIlIllllIlIIl[8];
    }

}

