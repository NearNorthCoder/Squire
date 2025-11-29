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
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
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

public abstract class a
extends Task {
    protected final /* synthetic */ SquireBankStander i;
    protected final /* synthetic */ BankStanderConfig j;
    protected final /* synthetic */ b k;
    protected /* synthetic */ InventorySetup l;
    private static /* synthetic */ int[] lllIIIIllIl;
    private static /* synthetic */ String[] lllIIIIllII;

    public boolean run() {
        a llllllllllllllllIIlIlIlIlIIIIlll;
        if (a.lIlIllIIlIlIIl((Object)this.j.activity(), (Object)this.k)) {
            return lllIIIIllIl[0];
        }
        llllllllllllllllIIlIlIlIlIIIIlll.l = llllllllllllllllIIlIlIlIlIIIIlll.i.a();
        if (a.lIlIllIIlIlIlI(llllllllllllllllIIlIlIlIlIIIIlll.l)) {
            return lllIIIIllIl[0];
        }
        if (a.lIlIllIIlIlIll(Bank.isOpen() ? 1 : 0)) {
            return lllIIIIllIl[0];
        }
        if (a.lIlIllIIlIllII(Movement.shouldWalk() ? 1 : 0)) {
            return lllIIIIllIl[0];
        }
        if (a.lIlIllIIlIlIIl((Object)llllllllllllllllIIlIlIlIlIIIIlll.j.activity(), (Object)b.GLASS_MAKE)) {
            if (a.lIlIllIIlIllII(llllllllllllllllIIlIlIlIlIIIIlll.g().isEmpty() ? 1 : 0)) {
                Iterator<Map.Entry<Integer, Integer>> llllllllllllllllIIlIlIlIlIIIIllI = llllllllllllllllIIlIlIlIlIIIIlll.g().entrySet().iterator();
                while (a.lIlIllIIlIlIll(llllllllllllllllIIlIlIlIlIIIIllI.hasNext() ? 1 : 0)) {
                    Map.Entry<Integer, Integer> llllllllllllllllIIlIlIlIlIIIIlIl = llllllllllllllllIIlIlIlIlIIIIllI.next();
                    int[] nArray = new int[lllIIIIllIl[1]];
                    nArray[a.lllIIIIllIl[0]] = llllllllllllllllIIlIlIlIlIIIIlIl.getKey();
                    if (a.lIlIllIIlIllIl(Inventory.getCount((boolean)lllIIIIllIl[1], (int[])nArray), llllllllllllllllIIlIlIlIlIIIIlIl.getValue())) {
                        llllllllllllllllIIlIlIlIlIIIIlll.f();
                        return lllIIIIllIl[1];
                    }
                    0;
                    if (-1 < 0) continue;
                    return ((0x21 ^ 0x18 ^ (0x2A ^ 0x14)) & (0x1B ^ 0x79 ^ (0x4C ^ 0x29) ^ -1)) != 0;
                }
            }
            if (a.lIlIllIIlIllIl(llllllllllllllllIIlIlIlIlIIIIlll.i.e(), llllllllllllllllIIlIlIlIlIIIIlll.i())) {
                return lllIIIIllIl[0];
            }
        }
        return this.h();
    }

    private static String lIlIllIIlIIllI(String llllllllllllllllIIlIlIlIIlIIlllI, String llllllllllllllllIIlIlIlIIlIIllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIIlIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIIlIIllIl.getBytes(StandardCharsets.UTF_8)), lllIIIIllIl[8]), "DES");
            Cipher llllllllllllllllIIlIlIlIIlIlIIlI = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIlIIlIlIIlI.init(lllIIIIllIl[3], llllllllllllllllIIlIlIlIIlIlIIll);
            return new String(llllllllllllllllIIlIlIlIIlIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIlIIlIlIIIl) {
            llllllllllllllllIIlIlIlIIlIlIIIl.printStackTrace();
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
        ArrayList llllllllllllllllIIlIlIlIlIIIIIII = new ArrayList(TileObjects.getAll((String[])stringArray));
        String[] stringArray2 = new String[lllIIIIllIl[2]];
        stringArray2[a.lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[2]];
        stringArray2[a.lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[6]];
        stringArray2[a.lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[7]];
        stringArray2[a.lllIIIIllIl[4]] = lllIIIIllII[lllIIIIllIl[8]];
        stringArray2[a.lllIIIIllIl[5]] = lllIIIIllII[lllIIIIllIl[9]];
        llllllllllllllllIIlIlIlIlIIIIIII.addAll(NPCs.getAll((String[])stringArray2));
        0;
        Player llllllllllllllllIIlIlIlIIlllllll = Players.getLocal();
        Interactable llllllllllllllllIIlIlIlIIllllllI = llllllllllllllllIIlIlIlIlIIIIIII.stream().sorted(Comparator.comparingInt(interactable -> ((Locatable)interactable).distanceTo((Locatable)llllllllllllllllIIlIlIlIIlllllll))).limit(5L).filter(interactable -> {
            String[] stringArray = new String[lllIIIIllIl[4]];
            stringArray[a.lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[13]];
            stringArray[a.lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[14]];
            stringArray[a.lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[15]];
            return interactable.hasAction(stringArray);
        }).filter(interactable -> Reachable.isInteractable((Locatable)((Locatable)interactable))).min(Comparator.comparingInt(interactable -> ((Locatable)interactable).distanceTo((Locatable)llllllllllllllllIIlIlIlIIlllllll))).orElse(null);
        if (a.lIlIllIIlIlIlI(llllllllllllllllIIlIlIlIIllllllI)) {
            return;
        }
        Locatable llllllllllllllllIIlIlIlIIlllllIl = (Locatable)llllllllllllllllIIlIlIlIIllllllI;
        if (a.lIlIllIIlIlllI(llllllllllllllllIIlIlIlIIlllllIl.distanceTo((Locatable)llllllllllllllllIIlIlIlIIlllllll), lllIIIIllIl[8])) {
            Movement.setDestination((WorldPoint)llllllllllllllllIIlIlIlIIlllllIl.getWorldLocation());
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

    private static String lIlIllIIlIIlIl(String llllllllllllllllIIlIlIlIIllIIIII, String llllllllllllllllIIlIlIlIIllIIlII) {
        llllllllllllllllIIlIlIlIIllIIIII = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIlIIllIIIll = new StringBuilder();
        char[] llllllllllllllllIIlIlIlIIllIIIlI = llllllllllllllllIIlIlIlIIllIIlII.toCharArray();
        int llllllllllllllllIIlIlIlIIllIIIIl = lllIIIIllIl[0];
        char[] llllllllllllllllIIlIlIlIIlIllIll = llllllllllllllllIIlIlIlIIllIIIII.toCharArray();
        int llllllllllllllllIIlIlIlIIlIllIlI = llllllllllllllllIIlIlIlIIlIllIll.length;
        int llllllllllllllllIIlIlIlIIlIllIIl = lllIIIIllIl[0];
        while (a.lIlIllIIlIllIl(llllllllllllllllIIlIlIlIIlIllIIl, llllllllllllllllIIlIlIlIIlIllIlI)) {
            char llllllllllllllllIIlIlIlIIllIIllI = llllllllllllllllIIlIlIlIIlIllIll[llllllllllllllllIIlIlIlIIlIllIIl];
            llllllllllllllllIIlIlIlIIllIIIll.append((char)(llllllllllllllllIIlIlIlIIllIIllI ^ llllllllllllllllIIlIlIlIIllIIIlI[llllllllllllllllIIlIlIlIIllIIIIl % llllllllllllllllIIlIlIlIIllIIIlI.length]));
            0;
            ++llllllllllllllllIIlIlIlIIllIIIIl;
            ++llllllllllllllllIIlIlIlIIlIllIIl;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIlIIllIIIll);
    }

    public abstract boolean h();

    private static boolean lIlIllIIlIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIlIlIlI(Object object) {
        return object == null;
    }

    private static String lIlIllIIlIIlII(String llllllllllllllllIIlIlIlIIlllIIll, String llllllllllllllllIIlIlIlIIlllIlII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIlIIlllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIlIIlllIlll.init(lllIIIIllIl[3], llllllllllllllllIIlIlIlIIllllIII);
            return new String(llllllllllllllllIIlIlIlIIlllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIlIIlllIllI) {
            llllllllllllllllIIlIlIlIIlllIllI.printStackTrace();
            return null;
        }
    }
}

