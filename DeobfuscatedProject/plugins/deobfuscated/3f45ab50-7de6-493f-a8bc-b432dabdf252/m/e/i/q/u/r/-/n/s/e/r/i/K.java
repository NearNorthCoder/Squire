/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Banking (Superheat)", priority=150, blocking=true)
public class K
extends Task {
    private final /* synthetic */ int[] al;
    private static /* synthetic */ int[] llllllIllIII;
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private final /* synthetic */ int[] am;
    private static /* synthetic */ String[] llllllIlIlll;

    private static String lIIlIlIIlIllIIl(String lllllllllllllllIIlIIIllIIIlIlIll, String lllllllllllllllIIlIIIllIIIlIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIllIIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllIIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIllIIIlIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIllIIIlIllIl.init(llllllIllIII[5], lllllllllllllllIIlIIIllIIIlIlllI);
            return new String(lllllllllllllllIIlIIIllIIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIllIIIlIllII) {
            lllllllllllllllIIlIIIllIIIlIllII.printStackTrace();
            return null;
        }
    }

    static {
        K.lIIlIlIIlIlllII();
        K.lIIlIlIIlIllIll();
    }

    private static boolean lIIlIlIIllIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIlIllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIlIlllll(Object object) {
        return object != null;
    }

    public K() {
        int[] nArray = new int[llllllIllIII[0]];
        nArray[K.llllllIllIII[1]] = llllllIllIII[2];
        nArray[K.llllllIllIII[3]] = llllllIllIII[4];
        nArray[K.llllllIllIII[5]] = llllllIllIII[6];
        nArray[K.llllllIllIII[7]] = llllllIllIII[8];
        this.al = nArray;
        int[] nArray2 = new int[llllllIllIII[5]];
        nArray2[K.llllllIllIII[1]] = llllllIllIII[9];
        nArray2[K.llllllIllIII[3]] = llllllIllIII[10];
        this.am = nArray2;
    }

    private static boolean lIIlIlIIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIlIlIIlIllIlI(String lllllllllllllllIIlIIIllIIIIllllI, String lllllllllllllllIIlIIIllIIIIllIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIllIIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllIIIIllIll.getBytes(StandardCharsets.UTF_8)), llllllIllIII[12]), "DES");
            Cipher lllllllllllllllIIlIIIllIIIlIIIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIllIIIlIIIII.init(llllllIllIII[5], lllllllllllllllIIlIIIllIIIlIIIIl);
            return new String(lllllllllllllllIIlIIIllIIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIllIIIIlllll) {
            lllllllllllllllIIlIIIllIIIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIlllIl(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        BankLocation lllllllllllllllIIlIIIllIIIllIlII;
        WorldPoint lllllllllllllllIIlIIIllIIIllIIll;
        K lllllllllllllllIIlIIIllIIIlllIII;
        if (K.lIIlIlIIlIlllIl((Object)this.f.activity(), (Object)a.SUPERHEAT_MINE)) {
            return llllllIllIII[1];
        }
        if (K.lIIlIlIIlIllllI(Inventory.isFull() ? 1 : 0)) {
            return llllllIllIII[1];
        }
        String lllllllllllllllIIlIIIllIIIllIlll = lllllllllllllllIIlIIIllIIIlllIII.f.bankLoadout().getSelected();
        if (!K.lIIlIlIIlIlllll(lllllllllllllllIIlIIIllIIIllIlll) || K.lIIlIlIIllIIIII(lllllllllllllllIIlIIIllIIIllIlll.equals(llllllIlIlll[llllllIllIII[1]]) ? 1 : 0)) {
            return llllllIllIII[1];
        }
        BankLoadout lllllllllllllllIIlIIIllIIIllIllI = (BankLoadout)lllllllllllllllIIlIIIllIIIlllIII.f.bankLoadout().selected(BankLoadout.class);
        if (K.lIIlIlIIllIIIII(Bank.isOpen() ? 1 : 0) && K.lIIlIlIIlIllllI(BankLoadouts.withdrawWithRetries((BankLoadout)lllllllllllllllIIlIIIllIIIllIllI, (int)llllllIllIII[11]).booleanValue() ? 1 : 0)) {
            Log.info((String)llllllIlIlll[llllllIllIII[3]]);
            return llllllIllIII[3];
        }
        Player lllllllllllllllIIlIIIllIIIllIlIl = Players.getLocal();
        if (K.lIIlIlIIllIIIIl(lllllllllllllllIIlIIIllIIIllIlIl.distanceTo(lllllllllllllllIIlIIIllIIIllIIll = (lllllllllllllllIIlIIIllIIIllIlII = BankLocation.ARDOUGNE_SOUTH_BANK).getArea().getCenter()), llllllIllIII[12])) {
            Movement.walkTo((WorldPoint)lllllllllllllllIIlIIIllIIIllIIll, (boolean)llllllIllIII[1]);
            0;
            return llllllIllIII[3];
        }
        Bank.open();
        0;
        return llllllIllIII[3];
    }

    private static void lIIlIlIIlIllIll() {
        llllllIlIlll = new String[llllllIllIII[5]];
        K.llllllIlIlll[K.llllllIllIII[1]] = K."None";
        K.llllllIlIlll[K.llllllIllIII[3]] = K."Failed banking more than 5 times.";
    }

    private static void lIIlIlIIlIlllII() {
        llllllIllIII = new int[13];
        K.llllllIllIII[0] = 0xC8 ^ 0xB6 ^ (0xF9 ^ 0x83);
        K.llllllIllIII[1] = (0x6E ^ 0x51) & ~(0x75 ^ 0x4A);
        K.llllllIllIII[2] = 174 + 79 - 188 + 184;
        K.llllllIllIII[3] = 1;
        K.llllllIllIII[4] = 130 + 146 - 74 + 49;
        K.llllllIllIII[5] = 2;
        K.llllllIllIII[6] = 220 + 129 - 213 + 117;
        K.llllllIllIII[7] = 3;
        K.llllllIllIII[8] = 209 + 28 - 60 + 78;
        K.llllllIllIII[9] = -(0xFFFFEECA & 0x5577) & (0xFFFFDDFF & 0x7EFD);
        K.llllllIllIII[10] = -(0xFFFFCE2F & 0x71D1) & (0xFFFFD8FD & 0x7FBF);
        K.llllllIllIII[11] = 88 + 46 - 125 + 127 ^ 116 + 96 - 163 + 92;
        K.llllllIllIII[12] = 5 ^ 0x4C ^ (0x49 ^ 8);
    }
}

