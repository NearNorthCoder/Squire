/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package i.i.-.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import i.i.-.h.u.s.e.r.q.r.s.f.e.FEnum;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Banking through butler -> BankingthroughbutlerTask */
@TaskDesc(name="Banking through butler", priority=100, blocking=true)
public class BankingThroughButlerTask
extends Task {
    private final /* synthetic */ SquireFisherConfig S;
    private static /* synthetic */ int[] lIlllIllIlIl;
    private final /* synthetic */ Client T;
    private static /* synthetic */ String[] lIlllIllIlII;

    private static void lllIlIllllIIIl() {
        lIlllIllIlII = new String[lIlllIllIlIl[4]];
        k.lIlllIllIlII[k.lIlllIllIlIl[0]] = k."Demon butler";
        k.lIlllIllIlII[k.lIlllIllIlIl[1]] = k."Call Servant";
        k.lIlllIllIlII[k.lIlllIllIlIl[8]] = k."View House Options";
    }

    private void p() {
    }

    private static boolean lllIlIllllIIll(int n) {
        return n != 0;
    }

    @Inject
    public k(SquireFisherConfig squireFisherConfig, Client client) {
        this.S = squireFisherConfig;
        this.T = client;
    }

    private static void lllIlIllllIIlI() {
        lIlllIllIlIl = new int[10];
        k.lIlllIllIlIl[0] = (0x72 ^ 0x3C ^ (0xDE ^ 0xB6)) & (0x23 ^ 0x2E ^ (0x9D ^ 0xB6) ^ -1);
        k.lIlllIllIlIl[1] = 1;
        k.lIlllIllIlIl[2] = 0x3F ^ 0x25;
        k.lIlllIllIlIl[3] = -(0xFFFFDEFF & 0x678E) & (0xFFFFD7FF & 0x6FFF);
        k.lIlllIllIlIl[4] = 3;
        k.lIlllIllIlIl[5] = 168 + 88 - 203 + 116 ^ 161 + 138 - 140 + 32;
        k.lIlllIllIlIl[6] = 0x31 ^ 0x45;
        k.lIlllIllIlIl[7] = 0x2B ^ 0x6C ^ (0x37 ^ 0x6F);
        k.lIlllIllIlIl[8] = 2;
        k.lIlllIllIlIl[9] = 0xFFFF8FCF & 0x7C76;
    }

    private static boolean lllIlIllllIlII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIlIlllllIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        k var6;
        if (!k.lllIlIllllIIll(this.S.butlerBanking() ? 1 : 0) || k.lllIlIllllIlII((Object)this.S.fish(), (Object)f.KARAMBWAN)) {
            return lIlllIllIlIl[0];
        }
        if (k.lllIlIllllIlIl(Inventory.isFull() ? 1 : 0)) {
            return lIlllIllIlIl[0];
        }
        if (k.lllIlIllllIlIl(var6.T.isInInstancedRegion() ? 1 : 0)) {
            TeleportLoader.enterHouse();
            0;
            return lIlllIllIlIl[1];
        }
        if (k.lllIlIllllIIll(Dialog.isOpen() ? 1 : 0)) {
            if (k.lllIlIllllIIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount((int)lIlllIllIlIl[2]);
                0;
                if (((0x68 ^ 0x4C) & ~(0x15 ^ 0x31)) != 0) {
                    return false;
                }
            } else if (k.lllIlIllllIIll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                0;
                
                }
            } else if (k.lllIlIllllIIll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIlllIllIlIl[1]);
                0;
            }
            return lIlllIllIlIl[1];
        }
        String[] stringArray = new String[lIlllIllIlIl[1]];
        stringArray[k.lIlllIllIlIl[0]] = lIlllIllIlII[lIlllIllIlIl[0]];
        NPC var3 = NPCs.getNearest((String[])stringArray);
        if (k.lllIlIllllIllI(Widgets.get((int)lIlllIllIlIl[3], (int)lIlllIllIlIl[0]))) {
            if (!k.lllIlIllllIllI(var3) || k.lllIlIllllIlll(var3.distanceTo((Locatable)Players.getLocal()), lIlllIllIlIl[4])) {
                Widgets.get((int)lIlllIllIlIl[3], (int)lIlllIllIlIl[5]).interact(lIlllIllIlII[lIlllIllIlIl[1]]);
                0;
                if (-2 >= 0) {
                    return ((158 + 219 - 206 + 65 ^ 139 + 3 - 94 + 129) & (0x4E ^ 0x5E ^ (0x73 ^ 0x3E) ^ -1)) != 0;
                }
            }
        } else {
            Widgets.get((int)lIlllIllIlIl[6], (int)lIlllIllIlIl[7]).interact(lIlllIllIlII[lIlllIllIlIl[8]]);
        }
        if (!k.lllIlIllllIllI(var3) || k.lllIlIllllIlll(var3.distanceTo((Locatable)Players.getLocal()), lIlllIllIlIl[4])) {
            return lIlllIllIlIl[1];
        }
        int[] nArray = new int[lIlllIllIlIl[1]];
        nArray[k.lIlllIllIlIl[0]] = lIlllIllIlIl[9];
        Item var2 = Inventory.getFirst((int[])nArray);
        if (k.lllIlIlllllIII(var2)) {
            return lIlllIllIlIl[0];
        }
        var2_2.useOn((Actor)var1_1);
        return lIlllIllIlIl[1];
    }

    static {
        k.lllIlIllllIIlI();
        k.lllIlIllllIIIl();
    }

    private static boolean lllIlIllllIllI(Object object) {
        return object != null;
    }

    private static boolean lllIlIllllIlll(int n, int n2) {
        return n > n2;
    }

    private static String lllIlIllllIIII(String var1, String var4) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlllIllIlIl[8], var8);
            return new String(var5.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIllllIlIl(int n) {
        return n == 0;
    }
}

