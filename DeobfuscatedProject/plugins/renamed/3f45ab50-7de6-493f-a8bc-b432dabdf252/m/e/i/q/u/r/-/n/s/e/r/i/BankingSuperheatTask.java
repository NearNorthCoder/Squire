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
import m.e.i.q.u.r.-.n.s.e.r.i.AEnum;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

/* TASK: Banking (Superheat) -> Banking(Superheat)Task */
@TaskDesc(name="Banking (Superheat)", priority=150, blocking=true)
public class BankingSuperheatTask
extends Task {
    private final /* synthetic */ int[] al;
    private static /* synthetic */ int[] llllllIllIII;
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private final /* synthetic */ int[] am;
    private static /* synthetic */ String[] llllllIlIlll;

    private static String lIIlIlIIlIllIIl(String var9, String var13) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(llllllIllIII[5], var8);
            return new String(var6.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
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

    private static String lIIlIlIIlIllIlI(String var15, String var10) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), llllllIllIII[12]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(llllllIllIII[5], var2);
            return new String(var11.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIlllIl(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        BankLocation var12;
        WorldPoint var5;
        K var7;
        if (K.lIIlIlIIlIlllIl((Object)this.f.activity(), (Object)a.SUPERHEAT_MINE)) {
            return llllllIllIII[1];
        }
        if (K.lIIlIlIIlIllllI(Inventory.isFull() ? 1 : 0)) {
            return llllllIllIII[1];
        }
        String var16 = var7.f.bankLoadout().getSelected();
        if (!K.lIIlIlIIlIlllll(var16) || K.lIIlIlIIllIIIII(var16.equals(llllllIlIlll[llllllIllIII[1]]) ? 1 : 0)) {
            return llllllIllIII[1];
        }
        BankLoadout var14 = (BankLoadout)var7.f.bankLoadout().selected(BankLoadout.class);
        if (K.lIIlIlIIllIIIII(Bank.isOpen() ? 1 : 0) && K.lIIlIlIIlIllllI(BankLoadouts.withdrawWithRetries((BankLoadout)var14, (int)llllllIllIII[11]).booleanValue() ? 1 : 0)) {
            Log.info((String)llllllIlIlll[llllllIllIII[3]]);
            return llllllIllIII[3];
        }
        Player var4 = Players.getLocal();
        if (K.lIIlIlIIllIIIIl(var4.distanceTo(var5 = (var12 = BankLocation.ARDOUGNE_SOUTH_BANK).getArea().getCenter()), llllllIllIII[12])) {
            Movement.walkTo((WorldPoint)var5, (boolean)llllllIllIII[1]);
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

