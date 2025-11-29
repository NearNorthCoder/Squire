/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.BEnum;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.FEnum;

/* TASK: Depositing seeds -> DepositingseedsTask */
@TaskDesc(name="Depositing seeds", priority=100, blocking=true)
public class DepositingSeedsTask
extends Task {
    private static final /* synthetic */ int ah;
    private final /* synthetic */ Client ak;
    private static /* synthetic */ String[] lIIlllIIllIll;
    private final /* synthetic */ SquireThievingConfig ai;
    private final /* synthetic */ SquireThieving aj;
    private static /* synthetic */ int[] lIIlllIIlllII;

    private static boolean lIllIIllIIlIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIllIIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIllIIlIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static void lIllIIllIIlIIll() {
        lIIlllIIllIll = new String[lIIlllIIlllII[2]];
        x.lIIlllIIllIll[x.lIIlllIIlllII[0]] = x."Open";
    }

    private static void lIllIIllIIlIlII() {
        lIIlllIIlllII = new int[6];
        x.lIIlllIIlllII[0] = (0x4E ^ 0x7C ^ (0x16 ^ 0x72)) & (150 + 192 - 154 + 29 ^ 75 + 64 - 76 + 80 ^ -1);
        x.lIIlllIIlllII[1] = -(0xFFFF97AF & 0x7B77) & (0xFFFFDF7F & 0x27733BF);
        x.lIIlllIIlllII[2] = 1;
        x.lIIlllIIlllII[3] = -(0xFFFF9FA2 & 0x787F) & (0xFFFFFF7F & 0x7EFF);
        x.lIIlllIIlllII[4] = 0x94 ^ 0xA7 ^ (9 ^ 0x3E);
        x.lIIlllIIlllII[5] = 2;
    }

    static {
        x.lIllIIllIIlIlII();
        x.lIllIIllIIlIIll();
        ah = lIIlllIIlllII[1];
    }

    private static boolean lIllIIllIIlIllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIllIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        x var4;
        if (!x.lIllIIllIIlIlIl((Object)this.ai.method(), (Object)b.PICKPOCKETING) || x.lIllIIllIIlIllI((Object)this.ai.pickpocketTarget(), (Object)f.MASTER_FARMER)) {
            return lIIlllIIlllII[0];
        }
        if (x.lIllIIllIIlIlll(var4.ai.depositSeedVault() ? 1 : 0)) {
            return lIIlllIIlllII[0];
        }
        if (x.lIllIIllIIlIlll(Inventory.isFull() ? 1 : 0)) {
            return lIIlllIIlllII[0];
        }
        Widget var12 = var4.ak.getWidget(lIIlllIIlllII[1]);
        if (!x.lIllIIllIIllIII(var12) || x.lIllIIllIIllIIl(var12.isHidden() ? 1 : 0)) {
            int[] nArray = new int[lIIlllIIlllII[2]];
            nArray[x.lIIlllIIlllII[0]] = lIIlllIIlllII[3];
            TileObject var8 = TileObjects.getNearest((int[])nArray);
            if (x.lIllIIllIIllIlI(var8)) {
                return lIIlllIIlllII[0];
            }
            var8.interact(lIIlllIIllIll[lIIlllIIlllII[0]]);
            var4.sleep(lIIlllIIlllII[4]);
            return lIIlllIIlllII[2];
        }
        var1_1.interact(lIIlllIIlllII[0]);
        this.sleep(lIIlllIIlllII[5]);
        return lIIlllIIlllII[2];
    }

    private static boolean lIllIIllIIllIlI(Object object) {
        return object == null;
    }

    @Inject
    public x(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving, Client client) {
        this.ai = squireThievingConfig;
        this.aj = squireThieving;
        this.ak = client;
    }

    private static String lIllIIllIIlIIlI(String var3, String var6) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var9 = var6.toCharArray();
        int var1 = lIIlllIIlllII[0];
        char[] var10 = var3.toCharArray();
        int var5 = var10.length;
        int var11 = lIIlllIIlllII[0];
        while (x.lIllIIllIIllIll(var11, var5)) {
            char var2 = var10[var11];
            var7.append((char)(var2 ^ var9[var1 % var9.length]));
            0;
            ++var1;
            ++var11;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean lIllIIllIIllIII(Object object) {
        return object != null;
    }
}

