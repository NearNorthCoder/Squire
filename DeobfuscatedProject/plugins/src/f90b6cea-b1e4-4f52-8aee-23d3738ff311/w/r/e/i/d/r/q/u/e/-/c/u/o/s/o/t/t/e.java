/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;

@TaskDesc(name="Fletching Logs", priority=10)
public class e
extends Task {
    private static /* synthetic */ int[] lIllIIIIIlIII;
    private final /* synthetic */ SquireWoodcutterConfig B;
    private static /* synthetic */ String[] lIllIIIIIIlll;

    private static boolean llIIIIlllllIIlI(int n) {
        return n != 0;
    }

    static {
        e.llIIIIlllllIIII();
        e.llIIIIllllIllll();
    }

    private static boolean llIIIIlllllIIIl(int n) {
        return n == 0;
    }

    private static void llIIIIlllllIIII() {
        lIllIIIIIlIII = new int[6];
        e.lIllIIIIIlIII[0] = (220 + 155 - 159 + 27 ^ 146 + 48 - 188 + 154) & (0xB2 ^ 0xB9 ^ (0x35 ^ 0x6D) ^ -" ".length());
        e.lIllIIIIIlIII[1] = " ".length();
        e.lIllIIIIIlIII[2] = -(0xFFFFA706 & 0x7CFF) & (0xFFFFEFB7 & 0x37FF);
        e.lIllIIIIIlIII[3] = 0x44 ^ 0x17 ^ (0xA ^ 0x5D);
        e.lIllIIIIIlIII[4] = "  ".length();
        e.lIllIIIIIlIII[5] = 0x62 ^ 0x6A;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var1_1;
        if (e.llIIIIlllllIIIl(this.B.cutLogs() ? 1 : 0)) {
            return lIllIIIIIlIII[0];
        }
        int[] nArray = new int[lIllIIIIIlIII[1]];
        nArray[e.lIllIIIIIlIII[0]] = lIllIIIIIlIII[2];
        if (e.llIIIIlllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIllIIIIIlIII[0];
        }
        if (e.llIIIIlllllIIIl(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIIIlIII[0];
        }
        if (e.llIIIIlllllIIlI(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lIllIIIIIlIII[1];
        }
        if (e.llIIIIlllllIIIl(Tabs.isOpen((Tab)Tab.INVENTORY) ? 1 : 0)) {
            Tabs.open((Tab)Tab.INVENTORY);
            return lIllIIIIIlIII[1];
        }
        Item llllllllllllllIllIIllIllIIIllllI = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(lIllIIIIIIlll[lIllIIIIIlIII[0]]));
        if (e.llIIIIlllllIIll(llllllllllllllIllIIllIllIIIllllI)) {
            return lIllIIIIIlIII[0];
        }
        int[] nArray2 = new int[lIllIIIIIlIII[1]];
        nArray2[e.lIllIIIIIlIII[0]] = lIllIIIIIlIII[2];
        Item llllllllllllllIllIIllIllIIIlllIl = Inventory.getFirst((int[])nArray2);
        if (e.llIIIIlllllIIlI(Production.isOpen() ? 1 : 0)) {
            e llllllllllllllIllIIllIllIIIlllll;
            Production.choosePreviousOption();
            llllllllllllllIllIIllIllIIIlllll.sleep(lIllIIIIIlIII[3]);
            return lIllIIIIIlIII[1];
        }
        var1_1.useOn((Item)var2_2);
        this.sleep(lIllIIIIIlIII[4]);
        return lIllIIIIIlIII[1];
    }

    private static void llIIIIllllIllll() {
        lIllIIIIIIlll = new String[lIllIIIIIlIII[1]];
        e.lIllIIIIIIlll[e.lIllIIIIIlIII[0]] = e.llIIIIllllIlllI("mrinWTiRVzU=", "xjSXS");
    }

    private static boolean llIIIIlllllIIll(Object object) {
        return object == null;
    }

    private static String llIIIIllllIlllI(String llllllllllllllIllIIllIllIIIlIIll, String llllllllllllllIllIIllIllIIIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIllIllIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIllIIIIIlIII[5]), "DES");
            Cipher llllllllllllllIllIIllIllIIIlIlll = Cipher.getInstance("DES");
            llllllllllllllIllIIllIllIIIlIlll.init(lIllIIIIIlIII[4], llllllllllllllIllIIllIllIIIllIII);
            return new String(llllllllllllllIllIIllIllIIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIllIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIllIIIlIllI) {
            llllllllllllllIllIIllIllIIIlIllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public e(SquireWoodcutterConfig squireWoodcutterConfig) {
        this.B = squireWoodcutterConfig;
    }
}

