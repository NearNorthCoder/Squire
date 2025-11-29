/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.BEnum;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

public abstract class a_Unknown
extends Task {
    protected final /* synthetic */ SquireBankStander i;
    protected final /* synthetic */ BankStanderConfig j;
    protected final /* synthetic */ b k;
    protected /* synthetic */ InventorySetup l;
    private static /* synthetic */ int[] lllIIIIllIl;
    private static /* synthetic */ String[] lllIIIIllII;

    public boolean run() {
        a var23;
        if (a.lIlIllIIlIlIIl((Object)this.j.activity(), (Object)this.k)) {
            return lllIIIIllIl[0];
        }
        var23.l = var23.i.a();
        if (a.lIlIllIIlIlIlI(var23.l)) {
            return lllIIIIllIl[0];
        }
        if (a.lIlIllIIlIlIll(Bank.isOpen() ? 1 : 0)) {
            return lllIIIIllIl[0];
        }
        if (a.lIlIllIIlIllII(Movement.shouldWalk() ? 1 : 0)) {
            return lllIIIIllIl[0];
        }
        if (a.lIlIllIIlIlIIl((Object)var23.j.activity(), (Object)b.GLASS_MAKE)) {
            if (a.lIlIllIIlIllII(var23.g().isEmpty() ? 1 : 0)) {
                Iterator<Map.Entry<Integer, Integer>> var20 = var23.g().entrySet().iterator();
                while (a.lIlIllIIlIlIll(var20.hasNext() ? 1 : 0)) {
                    Map.Entry<Integer, Integer> var16 = var20.next();
                    int[] nArray = new int[lllIIIIllIl[1]];
                    nArray[a.lllIIIIllIl[0]] = var16.getKey();
                    if (a.lIlIllIIlIllIl(Inventory.getCount((boolean)lllIIIIllIl[1], (int[])nArray), var16.getValue())) {
                        var23.f();
                        return lllIIIIllIl[1];
                    }
                    0;
                    if (-1 < 0) continue;
                    return ((0x21 ^ 0x18 ^ (0x2A ^ 0x14)) & (0x1B ^ 0x79 ^ (0x4C ^ 0x29) ^ -1)) != 0;
                }
            }
            if (a.lIlIllIIlIllIl(var23.i.e(), var23.i())) {
                return lllIIIIllIl[0];
            }
        }
        return this.h();
    }

    private static String lIlIllIIlIIllI(String var8, String var12) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lllIIIIllIl[8]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lllIIIIllIl[3], var19);
            return new String(var17.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    static {
        a.lIlIllIIlIlIII();
        a.lIlIllIIlIIlll();
    }

    public abstract int i();

    public abstract Map<Integer, Integer> g();

    private static void lIlIllIIlIIlll() {
        lllIIIIllII = new String[lllIIIIllIl[16]];
        a.lllIIIIllII[a.lllIIIIllIl[0]] = a."Bank booth";
        a.lllIIIIllII[a.lllIIIIllIl[1]] = a."Grand Exchange booth";
        a.lllIIIIllII[a.lllIIIIllIl[3]] = a."Bank chest";
        a.lllIIIIllII[a.lllIIIIllIl[4]] = a."Bank Chest-wreck";
        a.lllIIIIllII[a.lllIIIIllIl[5]] = a."Bank Camel";
        a.lllIIIIllII[a.lllIIIIllIl[2]] = a."Banker";
        a.lllIIIIllII[a.lllIIIIllIl[6]] = a."Grand Exchange clerk";
        a.lllIIIIllII[a.lllIIIIllIl[7]] = a."Emerald Benedict";
        a.lllIIIIllII[a.lllIIIIllIl[8]] = a."Arnold Lydspor";
        a.lllIIIIllII[a.lllIIIIllIl[9]] = a."Ashuelot Reis";
        a.lllIIIIllII[a.lllIIIIllIl[10]] = a."Bank";
        a.lllIIIIllII[a.lllIIIIllIl[11]] = a."Use";
        a.lllIIIIllII[a.lllIIIIllIl[12]] = a."Open";
        a.lllIIIIllII[a.lllIIIIllIl[13]] = a."Bank";
        a.lllIIIIllII[a.lllIIIIllIl[14]] = a."Use";
        a.lllIIIIllII[a.lllIIIIllIl[15]] = a."Open";
    }

    private static boolean lIlIllIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIIlIlIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIllIIlIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIlIllII(int n2) {
        return n2 == 0;
    }

    public a(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig, b b2) {
        this.i = squireBankStander;
        this.j = bankStanderConfig;
        this.k = b2;
    }

    /*
     * WARNING - void declaration
     */
    private void f() {
        void var3_3;
        if (a.lIlIllIIlIlIll(Bank.isOpen() ? 1 : 0)) {
            Bank.openMainTab();
            return;
        }
        if (a.lIlIllIIlIlIll(Bank.isPinWindowOpen() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lllIIIIllIl[2]];
        stringArray[a.lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[0]];
        stringArray[a.lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[1]];
        stringArray[a.lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[3]];
        stringArray[a.lllIIIIllIl[4]] = lllIIIIllII[lllIIIIllIl[4]];
        stringArray[a.lllIIIIllIl[5]] = lllIIIIllII[lllIIIIllIl[5]];
        ArrayList var5 = new ArrayList(TileObjects.getAll((String[])stringArray));
        String[] stringArray2 = new String[lllIIIIllIl[2]];
        stringArray2[a.lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[2]];
        stringArray2[a.lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[6]];
        stringArray2[a.lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[7]];
        stringArray2[a.lllIIIIllIl[4]] = lllIIIIllII[lllIIIIllIl[8]];
        stringArray2[a.lllIIIIllIl[5]] = lllIIIIllII[lllIIIIllIl[9]];
        var5.addAll(NPCs.getAll((String[])stringArray2));
        0;
        Player var11 = Players.getLocal();
        Interactable var7 = var5.stream().sorted(Comparator.comparingInt(interactable -> ((Locatable)interactable).distanceTo((Locatable)var11))).limit(5L).filter(interactable -> {
            String[] stringArray = new String[lllIIIIllIl[4]];
            stringArray[a.lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[13]];
            stringArray[a.lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[14]];
            stringArray[a.lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[15]];
            return interactable.hasAction(stringArray);
        }).filter(interactable -> Reachable.isInteractable((Locatable)((Locatable)interactable))).min(Comparator.comparingInt(interactable -> ((Locatable)interactable).distanceTo((Locatable)var11))).orElse(null);
        if (a.lIlIllIIlIlIlI(var7)) {
            return;
        }
        Locatable var21 = (Locatable)var7;
        if (a.lIlIllIIlIlllI(var21.distanceTo((Locatable)var11), lllIIIIllIl[8])) {
            Movement.setDestination((WorldPoint)var21.getWorldLocation());
            return;
        }
        String[] stringArray3 = new String[lllIIIIllIl[4]];
        stringArray3[a.lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[10]];
        stringArray3[a.lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[11]];
        stringArray3[a.lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[12]];
        var3_3.interact(stringArray3);
    }

    private static void lIlIllIIlIlIII() {
        lllIIIIllIl = new int[17];
        a.lllIIIIllIl[0] = (0xE8 ^ 0x8E ^ (0xBB ^ 0xBC)) & (114 + 89 - -5 + 38 ^ 58 + 121 - 36 + 8 ^ -1);
        a.lllIIIIllIl[1] = 1;
        a.lllIIIIllIl[2] = 0x12 ^ 4 ^ (0x3A ^ 0x29);
        a.lllIIIIllIl[3] = 2;
        a.lllIIIIllIl[4] = 3;
        a.lllIIIIllIl[5] = 3 + 15 - -69 + 76 ^ 133 + 20 - 32 + 46;
        a.lllIIIIllIl[6] = 0x76 ^ 0x4A ^ (0x2A ^ 0x10);
        a.lllIIIIllIl[7] = 0x29 ^ 0x2E;
        a.lllIIIIllIl[8] = 0x10 ^ 0x63 ^ (0x63 ^ 0x18);
        a.lllIIIIllIl[9] = 0x33 ^ 0x3A;
        a.lllIIIIllIl[10] = 0x1D ^ 0x17;
        a.lllIIIIllIl[11] = 21 + 72 - -83 + 8 ^ 170 + 70 - 200 + 139;
        a.lllIIIIllIl[12] = 0x85 ^ 0x89;
        a.lllIIIIllIl[13] = 13 + 108 - 31 + 116 ^ 34 + 79 - -52 + 30;
        a.lllIIIIllIl[14] = 0xCA ^ 0xC4;
        a.lllIIIIllIl[15] = 0x6A ^ 0x65;
        a.lllIIIIllIl[16] = 0x7F ^ 0x6F;
    }

    private static String lIlIllIIlIIlIl(String var9, String var25) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var15 = var25.toCharArray();
        int var18 = lllIIIIllIl[0];
        char[] var10 = var9.toCharArray();
        int var14 = var10.length;
        int var4 = lllIIIIllIl[0];
        while (a.lIlIllIIlIllIl(var4, var14)) {
            char var22 = var10[var4];
            var1.append((char)(var22 ^ var15[var18 % var15.length]));
            0;
            ++var18;
            ++var4;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    public abstract boolean h();

    private static boolean lIlIllIIlIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIlIlIlI(Object object) {
        return object == null;
    }

    private static String lIlIllIIlIIlII(String var2, String var6) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var26 = Cipher.getInstance("Blowfish");
            var26.init(lllIIIIllIl[3], var3);
            return new String(var26.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }
}

