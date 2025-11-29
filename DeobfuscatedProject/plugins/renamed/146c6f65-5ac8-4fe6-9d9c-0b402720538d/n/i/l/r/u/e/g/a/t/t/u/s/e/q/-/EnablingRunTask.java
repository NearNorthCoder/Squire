/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Enabling Run -> EnablingrunTask */
@TaskDesc(name="Enabling Run", priority=5)
public class EnablingRunTask
extends Task {
    private static /* synthetic */ String[] llIIlllIlllI;
    private static /* synthetic */ int[] llIIlllIllll;

    private static boolean lIIIIIIIIIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIIIIIIIIll(Object object) {
        return object != null;
    }

    static {
        S.lIIIIIIIIIIIIII();
        S.llllllllllllll();
    }

    private static void llllllllllllll() {
        llIIlllIlllI = new String[llIIlllIllll[2]];
        S.llIIlllIlllI[S.llIIlllIllll[1]] = S."Drink";
    }

    private static boolean lIIIIIIIIIIIlII(Object object) {
        return object == null;
    }

    public boolean run() {
        Item item2;
        if (S.lIIIIIIIIIIIIIl(Movement.isStaminaBoosted() ? 1 : 0) && S.lIIIIIIIIIIIIlI(Movement.getRunEnergy(), llIIlllIllll[0]) && S.lIIIIIIIIIIIIll(item2 = Inventory.getFirst(item -> e.aa.contains(item.getId())))) {
            item2.interact(llIIlllIlllI[llIIlllIllll[1]]);
            return llIIlllIllll[2];
        }
        if (S.lIIIIIIIIIIIIlI(Movement.getRunEnergy(), llIIlllIllll[3])) {
            return llIIlllIllll[1];
        }
        if (S.lIIIIIIIIIIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
            Widget var1 = Widgets.get((WidgetInfo)WidgetInfo.MINIMAP_TOGGLE_RUN_ORB);
            if (S.lIIIIIIIIIIIlII(var1)) {
                return llIIlllIllll[1];
            }
            Movement.toggleRun();
            return llIIlllIllll[2];
        }
        return llIIlllIllll[1];
    }

    private static boolean lIIIIIIIIIIIIIl(int n2) {
        return n2 == 0;
    }

    private static String lllllllllllllI(String var2, String var6) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIIlllIllll[4]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llIIlllIllll[5], var3);
            return new String(var5.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIIIIIIIIII() {
        llIIlllIllll = new int[6];
        S.llIIlllIllll[0] = 0xB8 ^ 0xB2;
        S.llIIlllIllll[1] = (0xF ^ 0x51) & ~(0x64 ^ 0x3A);
        S.llIIlllIllll[2] = 1;
        S.llIIlllIllll[3] = 0x62 ^ 0x6D;
        S.llIIlllIllll[4] = 0xF2 ^ 0xBE ^ (0xFC ^ 0xB8);
        S.llIIlllIllll[5] = 2;
    }
}

