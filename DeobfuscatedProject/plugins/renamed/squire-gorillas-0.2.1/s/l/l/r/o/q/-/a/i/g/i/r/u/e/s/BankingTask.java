/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.gorillas.SquireGorillaConfig;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.j_Unknown;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=100, blocking=true)
public class BankingTask
extends j_Unknown {
    private static /* synthetic */ String[] llIIlIllllll;
    @Inject
    private /* synthetic */ SquireGorillaPlugin P;
    private static /* synthetic */ int[] llIIllIIIIII;

    private static boolean lllllIllllIlIl(int n2) {
        return n2 == 0;
    }

    private static void lllllIllllIlII() {
        llIIllIIIIII = new int[6];
        l.llIIllIIIIII[0] = -(0xFFFFD99F & 0x6EE2) & (0xFFFFFEBF & 0x6FF7);
        l.llIIllIIIIII[1] = (0xD5 ^ 0xC0) & ~(0x22 ^ 0x37);
        l.llIIllIIIIII[2] = 1;
        l.llIIllIIIIII[3] = 0x40 ^ 0x38 ^ (0x2C ^ 0x4D);
        l.llIIllIIIIII[4] = 2;
        l.llIIllIIIIII[5] = 3;
    }

    private static boolean lllllIllllIllI(Object object) {
        return object == null;
    }

    private static String lllllIllllIIlI(String var12, String var3) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(llIIllIIIIII[4], var5);
            return new String(var8.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    @Inject
    public l(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    static {
        l.lllllIllllIlII();
        l.lllllIllllIIll();
    }

    private static String lllllIllllIIIl(String var16, String var2) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var2.toCharArray();
        int var4 = llIIllIIIIII[1];
        char[] var13 = var16.toCharArray();
        int var17 = var13.length;
        int var14 = llIIllIIIIII[1];
        while (l.lllllIllllIlll(var14, var17)) {
            char var11 = var13[var14];
            var9.append((char)(var11 ^ var10[var4 % var10.length]));
            0;
            ++var4;
            ++var14;
            0;
            
            return null;
        }
        return String.valueOf(var9);
    }

    private static void lllllIllllIIll() {
        llIIlIllllll = new String[llIIllIIIIII[5]];
        l.llIIlIllllll[l.llIIllIIIIII[1]] = l."Bank booth";
        l.llIIlIllllll[l.llIIllIIIIII[2]] = l."Bank";
        l.llIIlIllllll[l.llIIllIIIIII[4]] = l."Something going wrong banking stopping plugin";
    }

    public boolean run() {
        l var6;
        if (l.lllllIllllIlIl(Locations.isRegionLoaded((int)llIIllIIIIII[0]) ? 1 : 0)) {
            return llIIllIIIIII[1];
        }
        BankLoadout var7 = (BankLoadout)var6.T.bankLoadout().selected(BankLoadout.class);
        if (l.lllllIllllIlIl(var6.J() ? 1 : 0)) {
            return llIIllIIIIII[1];
        }
        if (l.lllllIllllIlIl(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llIIllIIIIII[2]];
            stringArray[l.llIIllIIIIII[1]] = llIIlIllllll[llIIllIIIIII[1]];
            TileObject var15 = TileObjects.getNearest((String[])stringArray);
            if (l.lllllIllllIllI(var15)) {
                Movement.walkTo((WorldPoint)R);
                0;
                return llIIllIIIIII[2];
            }
            if (l.lllllIllllIlIl(Reachable.isInteractable((Locatable)var15) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var15.getWorldLocation());
                0;
                return llIIllIIIIII[2];
            }
            var15.interact(llIIlIllllll[llIIllIIIIII[2]]);
            return llIIllIIIIII[2];
        }
        if (l.lllllIllllIlIl(BankLoadouts.withdrawWithRetries((BankLoadout)var7, (int)llIIllIIIIII[3]).booleanValue() ? 1 : 0)) {
            Log.info((String)llIIlIllllll[llIIllIIIIII[4]]);
            return llIIllIIIIII[1];
        }
        return llIIllIIIIII[2];
    }

    private static boolean lllllIllllIlll(int n2, int n3) {
        return n2 < n3;
    }
}

