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
package gg.squire.vardorvis.tasks;

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
import gg.squire.vardorvis.tasks.VardorvisTaskBase;

@TaskDesc(name="Walking to vardorvis [DEATH]", priority=0x7FFFFFFF, blocking=true)
public class WalkingToVardorvisDeathTask
extends VardorvisTaskBase {
    private static  WorldPoint ai;
    private static final  int az;
    
    private final  int aA = 4661;

    @Override
    public boolean l() {
        H var1;
        if (H.lIllllIllIIIllI(this.X() ? 1 : 0)) {
            return lIlIlIIIllIlI[1];
        }
        Player var2 = Players.getLocal();
        if (H.lIllllIllIIIlll(av.contains((Locatable)var2) ? 1 : 0)) {
            return lIlIlIIIllIlI[1];
        }
        if (H.lIllllIllIIIlll(var1.S() ? 1 : 0)) {
            if (H.lIllllIllIIIlll(Dialog.isOpen() ? 1 : 0) && H.lIllllIllIIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIlIlIIIllIlI[2]);

            }
            String[] stringArray = new String[lIlIlIIIllIlI[3]];
            stringArray[H.lIlIlIIIllIlI[1]] = lIlIlIIIllIIl[lIlIlIIIllIlI[1]];
            Item var3 = Inventory.getFirst((String[])stringArray);
            var3.interact(lIlIlIIIllIIl[lIlIlIIIllIlI[3]]);
            return lIlIlIIIllIlI[3];
        }
        Movement.walkTo((WorldPoint)ai);

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

                if (3 <= (0x4B ^ 0x4F)) return n3 != 0;
                return false;
            }
        }
        n3 = lIlIlIIIllIlI[1];
        return n3 != 0;
    }

    public WalkingToVardorvisDeathTask() {
        this.aA = lIlIlIIIllIlI[0];
    }

    private static void lIllllIllIIIlII() {
        lIlIlIIIllIIl = new String[lIlIlIIIllIlI[8]];
        H.lIlIlIIIllIIl[H.lIlIlIIIllIlI[1]] = "Ring of shadows";
        H.lIlIlIIIllIIl[H.lIlIlIIIllIlI[3]] = "Teleport";
        H.lIlIlIIIllIIl[H.lIlIlIIIllIlI[5]] = "Ring of shadows";
    }

    static {
        H.lIllllIllIIIlIl();
        H.lIllllIllIIIlII();
        az = lIlIlIIIllIlI[4];
        ai = new WorldPoint(lIlIlIIIllIlI[6], lIlIlIIIllIlI[7], lIlIlIIIllIlI[1]);
    }
}

