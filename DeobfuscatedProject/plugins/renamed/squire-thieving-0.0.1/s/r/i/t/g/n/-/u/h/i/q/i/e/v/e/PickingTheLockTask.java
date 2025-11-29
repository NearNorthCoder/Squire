/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.s_Unknown;

/* TASK: Picking the lock -> PickingthelockTask */
@TaskDesc(name="Picking the lock")
public class PickingTheLockTask
extends s_Unknown {
    private static /* synthetic */ int[] lIIllIllIlIlI;
    /* synthetic */ WorldArea ag;
    private static /* synthetic */ String[] lIIllIllIlIIl;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var2_2;
        w var3;
        void var8;
        Player player = Players.getLocal();
        if (w.lIllIIIlIllIIIl(player)) {
            return lIIllIllIlIlI[3];
        }
        if (w.lIllIIIlIllIIlI(Dialog.isOpen() ? 1 : 0)) {
            return lIIllIllIlIlI[3];
        }
        if (w.lIllIIIlIllIIlI(Inventory.isFull() ? 1 : 0)) {
            return lIIllIllIlIlI[3];
        }
        if (!w.lIllIIIlIllIIll(var8.isAnimating() ? 1 : 0) || w.lIllIIIlIllIIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIllIlIlI[3];
        }
        if (w.lIllIIIlIllIIlI(var3.ag.contains((Locatable)var8) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIIllIllIlIlI[4], lIIllIllIlIlI[5], lIIllIllIlIlI[3]), (boolean)lIIllIllIlIlI[3]);
            0;
            return lIIllIllIlIlI[6];
        }
        String[] stringArray = new String[lIIllIllIlIlI[6]];
        stringArray[w.lIIllIllIlIlI[3]] = lIIllIllIlIIl[lIIllIllIlIlI[3]];
        TileObject var2 = TileObjects.getNearest((String[])stringArray);
        if (w.lIllIIIlIllIIIl(var2)) {
            return lIIllIllIlIlI[3];
        }
        var2_2.interact(lIIllIllIlIIl[lIIllIllIlIlI[6]]);
        return lIIllIllIlIlI[6];
    }

    @Inject
    public w(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
        this.ag = new WorldArea(lIIllIllIlIlI[0], lIIllIllIlIlI[1], lIIllIllIlIlI[2], lIIllIllIlIlI[2], lIIllIllIlIlI[3]);
    }

    private static boolean lIllIIIlIllIIlI(int n2) {
        return n2 != 0;
    }

    private static void lIllIIIlIlIllll() {
        lIIllIllIlIIl = new String[lIIllIllIlIlI[7]];
        w.lIIllIllIlIIl[w.lIIllIllIlIlI[3]] = w."Stone chest";
        w.lIIllIllIlIIl[w.lIIllIllIlIlI[6]] = w."Picklock";
    }

    private static String lIllIIIlIlIlllI(String var4, String var9) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIIllIllIlIlI[8]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIIllIllIlIlI[7], var5);
            return new String(var10.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIllIIll(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIlIllIIII() {
        lIIllIllIlIlI = new int[9];
        w.lIIllIllIlIlI[0] = 0xFFFFC71F & 0x3DFC;
        w.lIIllIllIlIlI[1] = 0xFFFFAF6B & 0x77F6;
        w.lIIllIllIlIlI[2] = 0x1D ^ 0x76 ^ (0xF0 ^ 0x91);
        w.lIIllIllIlIlI[3] = (0x29 ^ 0xA ^ (0x2F ^ 0x41)) & (74 + 105 - 157 + 221 ^ 11 + 97 - 76 + 158 ^ -1);
        w.lIIllIllIlIlI[4] = -(0xFFFFFDFC & 0x6AC7) & (0xFFFFEDDF & 0x7FF7);
        w.lIIllIllIlIlI[5] = 0xFFFFF7F7 & 0x2F6F;
        w.lIIllIllIlIlI[6] = 1;
        w.lIIllIllIlIlI[7] = 2;
        w.lIIllIllIlIlI[8] = 0xEC ^ 0xB2 ^ (0x33 ^ 0x65);
    }

    private static boolean lIllIIIlIllIIIl(Object object) {
        return object == null;
    }

    static {
        w.lIllIIIlIllIIII();
        w.lIllIIIlIlIllll();
    }

    private static String lIllIIIlIlIllIl(String var12, String var11) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var15 = lIIllIllIlIlI[3];
        char[] var6 = var12.toCharArray();
        int var16 = var6.length;
        int var7 = lIIllIllIlIlI[3];
        while (w.lIllIIIlIllIlII(var7, var16)) {
            char var17 = var6[var7];
            var1.append((char)(var17 ^ var13[var15 % var13.length]));
            0;
            ++var15;
            ++var7;
            0;
            if (((0x28 ^ 0x27) & ~(0x43 ^ 0x4C)) >= 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean lIllIIIlIllIlII(int n2, int n3) {
        return n2 < n3;
    }
}

