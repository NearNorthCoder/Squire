/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.E;

/* TASK: Walking to vardorvis [DEATH] -> Walkingtovardorvis[Death]Task */
@TaskDesc(name="Walking to vardorvis [DEATH]", priority=0x7FFFFFFF, blocking=true)
public class H
extends E {
    private static /* synthetic */ WorldPoint ai;
    private static final /* synthetic */ int az;
    private static /* synthetic */ String[] lIlIlIIIllIIl;
    private final /* synthetic */ int aA = 4661;
    private static /* synthetic */ int[] lIlIlIIIllIlI;

    private static String lIllllIllIIIIll(String var1, String var5) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlIlIIIllIlI[9]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIlIlIIIllIlI[5], var7);
            return new String(var11.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String lIllllIllIIIIlI(String var13, String var9) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIlIlIIIllIlI[5], var3);
            return new String(var12.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean l() {
        H var8;
        if (H.lIllllIllIIIllI(this.X() ? 1 : 0)) {
            return lIlIlIIIllIlI[1];
        }
        Player var4 = Players.getLocal();
        if (H.lIllllIllIIIlll(av.contains((Locatable)var4) ? 1 : 0)) {
            return lIlIlIIIllIlI[1];
        }
        if (H.lIllllIllIIIlll(var8.S() ? 1 : 0)) {
            if (H.lIllllIllIIIlll(Dialog.isOpen() ? 1 : 0) && H.lIllllIllIIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIlIlIIIllIlI[2]);
                0;
            }
            String[] stringArray = new String[lIlIlIIIllIlI[3]];
            stringArray[H.lIlIlIIIllIlI[1]] = lIlIlIIIllIIl[lIlIlIIIllIlI[1]];
            Item var6 = Inventory.getFirst((String[])stringArray);
            var6.interact(lIlIlIIIllIIl[lIlIlIIIllIlI[3]]);
            return lIlIlIIIllIlI[3];
        }
        Movement.walkTo((WorldPoint)ai);
        0;
        return lIlIlIIIllIlI[3];
    }

    private static boolean lIllllIllIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllIllIIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllllIllIIIllI(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean S() {
        int n3;
        Client client = Static.getClient();
        int[] nArray = client.getMapRegions();
        if (H.lIllllIllIIIlll(IntStream.of(nArray).noneMatch(n2 -> {
            boolean bl;
            if (H.lIllllIllIIlIII(n2, lIlIlIIIllIlI[0])) {
                bl = lIlIlIIIllIlI[3];
                0;
                if (((0x44 ^ 0x49 ^ (0xD4 ^ 0x84)) & (99 + 162 - 160 + 132 ^ 64 + 165 - 65 + 16 ^ -1)) >= 3) {
                    return ((0x32 ^ 0x4E ^ (0xB0 ^ 0x87)) & (0x64 ^ 0x2E ^ 1 ^ -1)) != 0;
                }
            } else {
                bl = lIlIlIIIllIlI[1];
            }
            return bl;
        }) ? 1 : 0) && H.lIllllIllIIlIII(client.getVarbitValue(lIlIlIIIllIlI[4]), lIlIlIIIllIlI[3])) {
            String[] stringArray = new String[lIlIlIIIllIlI[3]];
            stringArray[H.lIlIlIIIllIlI[1]] = lIlIlIIIllIIl[lIlIlIIIllIlI[5]];
            if (H.lIllllIllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n3 = lIlIlIIIllIlI[3];
                0;
                if (3 <= (0x4B ^ 0x4F)) return n3 != 0;
                return false;
            }
        }
        n3 = lIlIlIIIllIlI[1];
        return n3 != 0;
    }

    public H() {
        this.aA = lIlIlIIIllIlI[0];
    }

    private static void lIllllIllIIIlIl() {
        lIlIlIIIllIlI = new int[10];
        H.lIlIlIIIllIlI[0] = -(0xFFFFD7DF & 0x6DE9) & (0xFFFFF7FD & 0x5FFF);
        H.lIlIlIIIllIlI[1] = (118 + 92 - 143 + 61 ^ 34 + 47 - 55 + 115) & (42 + 71 - -65 + 1 ^ 45 + 178 - 206 + 173 ^ -1);
        H.lIlIlIIIllIlI[2] = 1 ^ 4;
        H.lIlIlIIIllIlI[3] = 1;
        H.lIlIlIIIllIlI[4] = -(0xFFFFCBBE & 0x745B) & (0xFFFFFBBF & 0x7F7D);
        H.lIlIlIIIllIlI[5] = 2;
        H.lIlIlIIIllIlI[6] = 0xFFFFF6FF & 0xD5D;
        H.lIlIlIIIllIlI[7] = -(0xFFFFFBDE & 0x762D) & (0xFFFFFF7F & 0x7FEF);
        H.lIlIlIIIllIlI[8] = 3;
        H.lIlIlIIIllIlI[9] = 149 + 101 - 149 + 53 ^ 38 + 103 - 21 + 26;
    }

    private static void lIllllIllIIIlII() {
        lIlIlIIIllIIl = new String[lIlIlIIIllIlI[8]];
        H.lIlIlIIIllIIl[H.lIlIlIIIllIlI[1]] = H."Ring of shadows";
        H.lIlIlIIIllIIl[H.lIlIlIIIllIlI[3]] = H."Teleport";
        H.lIlIlIIIllIIl[H.lIlIlIIIllIlI[5]] = H."Ring of shadows";
    }

    static {
        H.lIllllIllIIIlIl();
        H.lIllllIllIIIlII();
        az = lIlIlIIIllIlI[4];
        ai = new WorldPoint(lIlIlIIIllIlI[6], lIlIlIIIllIlI[7], lIlIlIIIllIlI[1]);
    }
}

