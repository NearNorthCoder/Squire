/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package u.r.i.l.a.e.c.t.-.q.s.c.n.a.c.u.o.e.-.e.r.n;

import com.google.inject.Inject;
import gg.squire.cleaner.SquireAccountCleanerConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="Banking")
public class a
extends Task {
    private static /* synthetic */ int[] lIlIlIIIIIl;
    private final /* synthetic */ SquireAccountCleanerConfig d;
    private static /* synthetic */ String[] lIlIlIIIIII;

    private static boolean lIIlIIIIllIlII(Object object) {
        return object != null;
    }

    private static String lIIlIIIIlIlllI(String llllllllllllllllIlIlllIllllIIlll, String llllllllllllllllIlIlllIllllIIllI) {
        llllllllllllllllIlIlllIllllIIlll = new String(Base64.getDecoder().decode(llllllllllllllllIlIlllIllllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlllIllllIlIlI = new StringBuilder();
        char[] llllllllllllllllIlIlllIllllIlIIl = llllllllllllllllIlIlllIllllIIllI.toCharArray();
        int llllllllllllllllIlIlllIllllIlIII = lIlIlIIIIIl[1];
        char[] llllllllllllllllIlIlllIllllIIIlI = llllllllllllllllIlIlllIllllIIlll.toCharArray();
        int llllllllllllllllIlIlllIllllIIIIl = llllllllllllllllIlIlllIllllIIIlI.length;
        int llllllllllllllllIlIlllIllllIIIII = lIlIlIIIIIl[1];
        while (a.lIIlIIIIllIllI(llllllllllllllllIlIlllIllllIIIII, llllllllllllllllIlIlllIllllIIIIl)) {
            char llllllllllllllllIlIlllIllllIllIl = llllllllllllllllIlIlllIllllIIIlI[llllllllllllllllIlIlllIllllIIIII];
            llllllllllllllllIlIlllIllllIlIlI.append((char)(llllllllllllllllIlIlllIllllIllIl ^ llllllllllllllllIlIlllIllllIlIIl[llllllllllllllllIlIlllIllllIlIII % llllllllllllllllIlIlllIllllIlIIl.length]));
            0;
            ++llllllllllllllllIlIlllIllllIlIII;
            ++llllllllllllllllIlIlllIllllIIIII;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlllIllllIlIlI);
    }

    private static void lIIlIIIIllIIIl() {
        lIlIlIIIIII = new String[lIlIlIIIIIl[6]];
        a.lIlIlIIIIII[a.lIlIlIIIIIl[1]] = a."Banker";
        a.lIlIlIIIIII[a.lIlIlIIIIIl[0]] = a."Bank";
        a.lIlIlIIIIII[a.lIlIlIIIIIl[2]] = a.",";
        a.lIlIlIIIIII[a.lIlIlIIIIIl[4]] = a."Members";
    }

    private static boolean lIIlIIIIlllIII(int n, int n2) {
        return n != n2;
    }

    private static String lIIlIIIIllIIII(String llllllllllllllllIlIlllIlllIIlIII, String llllllllllllllllIlIlllIlllIIIlll) {
        try {
            SecretKeySpec llllllllllllllllIlIlllIlllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlllIlllIIIlll.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIl[3]), "DES");
            Cipher llllllllllllllllIlIlllIlllIIllII = Cipher.getInstance("DES");
            llllllllllllllllIlIlllIlllIIllII.init(lIlIlIIIIIl[2], llllllllllllllllIlIlllIlllIIllIl);
            return new String(llllllllllllllllIlIlllIlllIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlllIlllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlllIlllIIlIll) {
            llllllllllllllllIlIlllIlllIIlIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public a(SquireAccountCleanerConfig squireAccountCleanerConfig) {
        this.d = squireAccountCleanerConfig;
    }

    private static void lIIlIIIIllIIlI() {
        lIlIlIIIIIl = new int[7];
        a.lIlIlIIIIIl[0] = 1;
        a.lIlIlIIIIIl[1] = (0x71 ^ 0x6D) & ~(0x98 ^ 0x84);
        a.lIlIlIIIIIl[2] = 2;
        a.lIlIlIIIIIl[3] = 113 + 62 - 137 + 131 ^ 118 + 58 - 78 + 63;
        a.lIlIlIIIIIl[4] = 3;
        a.lIlIlIIIIIl[5] = -(0xFFFFF99D & 0x6E6F) & (0xFFFFEFEF & 0x7BFF);
        a.lIlIlIIIIIl[6] = 3 ^ (0x5C ^ 0x5B);
    }

    private boolean a(Item item) {
        if (a.lIIlIIIIllIIll(item.getName().contains(lIlIlIIIIII[lIlIlIIIIIl[4]]) ? 1 : 0)) {
            return lIlIlIIIIIl[1];
        }
        ItemComposition itemComposition = Static.getClient().getItemComposition(item.getId());
        return itemComposition.isTradeable();
    }

    private int b(Item item) {
        ItemComposition itemComposition = Static.getClient().getItemDefinition(item.getId());
        String string = itemComposition.getName().toLowerCase();
        int n = Prices.getItemPrice((int)item.getId()) * item.getQuantity();
        return n;
    }

    public boolean run() {
        Object llllllllllllllllIlIllllIIIIIlIII;
        a llllllllllllllllIlIllllIIIIIlIll;
        if (a.lIIlIIIIllIIll(Inventory.contains(item -> {
            boolean bl;
            if (a.lIIlIIIIlllIII(item.getId(), lIlIlIIIIIl[5])) {
                bl = lIlIlIIIIIl[0];
                0;
                if ((0x55 ^ 0x5C ^ (0xCE ^ 0xC2)) <= 0) {
                    return ((0xA8 ^ 0xB7 ^ (0x54 ^ 0x28)) & (0xE2 ^ 0x8A ^ (0x50 ^ 0x5B) ^ -1)) != 0;
                }
            } else {
                bl = lIlIlIIIIIl[1];
            }
            return bl;
        }) ? 1 : 0) && a.lIIlIIIIllIIll(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIIIIIl[0]];
            stringArray[a.lIlIlIIIIIl[1]] = lIlIlIIIIII[lIlIlIIIIIl[1]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (a.lIIlIIIIllIlII(nPC) && a.lIIlIIIIllIlIl(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(lIlIlIIIIII[lIlIlIIIIIl[0]]);
                return lIlIlIIIIIl[1];
            }
        }
        String llllllllllllllllIlIllllIIIIIlIlI = llllllllllllllllIlIllllIIIIIlIll.d.ignoreList();
        ArrayList<Integer> llllllllllllllllIlIllllIIIIIlIIl = new ArrayList<Integer>();
        if (a.lIIlIIIIllIIll(llllllllllllllllIlIllllIIIIIlIlI.isEmpty() ? 1 : 0)) {
            llllllllllllllllIlIllllIIIIIlIII = llllllllllllllllIlIllllIIIIIlIlI.split(lIlIlIIIIII[lIlIlIIIIIl[2]]);
            String[] llllllllllllllllIlIllllIIIIIIlll = llllllllllllllllIlIllllIIIIIlIII;
            int llllllllllllllllIlIllllIIIIIIllI = llllllllllllllllIlIllllIIIIIIlll.length;
            int llllllllllllllllIlIllllIIIIIIlIl = lIlIlIIIIIl[1];
            while (a.lIIlIIIIllIllI(llllllllllllllllIlIllllIIIIIIlIl, llllllllllllllllIlIllllIIIIIIllI)) {
                String llllllllllllllllIlIllllIIIIIIlII = llllllllllllllllIlIllllIIIIIIlll[llllllllllllllllIlIllllIIIIIIlIl];
                Integer llllllllllllllllIlIllllIIIIIIIll = Integer.parseInt(llllllllllllllllIlIllllIIIIIIlII);
                llllllllllllllllIlIllllIIIIIlIIl.add(llllllllllllllllIlIllllIIIIIIIll);
                0;
                ++llllllllllllllllIlIllllIIIIIIlIl;
                0;
                if (3 == 3) continue;
                return ((0x2B ^ 0x38) & ~(0x4C ^ 0x5F)) != 0;
            }
        }
        if (a.lIIlIIIIllIlIl(Bank.isOpen() ? 1 : 0) && a.lIIlIIIIllIIll(Inventory.isFull() ? 1 : 0)) {
            llllllllllllllllIlIllllIIIIIlIII = Bank.getAll(item -> {
                int n;
                if (a.lIIlIIIIllIlll(this.b((Item)item), this.d.sellValue()) && a.lIIlIIIIllIIll(llllllllllllllllIlIllllIIIIIlIIl.contains(item.getId()) ? 1 : 0) && (!a.lIIlIIIIllIIll(item.isTradable() ? 1 : 0) || a.lIIlIIIIllIlIl(this.a((Item)item) ? 1 : 0))) {
                    n = lIlIlIIIIIl[0];
                    0;
                    if (2 <= 0) {
                        return ((167 + 117 - 246 + 130 ^ 62 + 76 - 38 + 34) & (63 + 17 - -29 + 31 ^ 147 + 59 - 70 + 26 ^ -1)) != 0;
                    }
                } else {
                    n = lIlIlIIIIIl[1];
                }
                return n != 0;
            });
            int llllllllllllllllIlIllllIIIIIIlll = lIlIlIIIIIl[1];
            Iterator llllllllllllllllIlIllllIIIIIIllI = llllllllllllllllIlIllllIIIIIlIII.iterator();
            while (a.lIIlIIIIllIlIl(llllllllllllllllIlIllllIIIIIIllI.hasNext() ? 1 : 0)) {
                Item llllllllllllllllIlIllllIIIIIIlIl = (Item)llllllllllllllllIlIllllIIIIIIllI.next();
                if (a.lIIlIIIIllIlll(llllllllllllllllIlIllllIIIIIIlll, lIlIlIIIIIl[3])) {
                    0;
                    if ((0x29 ^ 0x2C) > 0) break;
                    return ((0x8B ^ 0x98) & ~(0x65 ^ 0x76)) != 0;
                }
                ++llllllllllllllllIlIllllIIIIIIlll;
                Bank.withdrawAll((int)llllllllllllllllIlIllllIIIIIIlIl.getId(), (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                0;
                if (1 == 1) continue;
                return ((117 + 166 - 259 + 167 ^ 144 + 137 - 119 + 17) & (0x66 ^ 0x69 ^ 3 ^ -1)) != 0;
            }
        }
        return lIlIlIIIIIl[0];
    }

    private static boolean lIIlIIIIllIIll(int n) {
        return n == 0;
    }

    private static boolean lIIlIIIIllIlll(int n, int n2) {
        return n > n2;
    }

    private static String lIIlIIIIlIllll(String llllllllllllllllIlIlllIlllIlIlll, String llllllllllllllllIlIlllIlllIlIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIlllIlllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlllIlllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlllIlllIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlllIlllIllIIl.init(lIlIlIIIIIl[2], llllllllllllllllIlIlllIlllIllIlI);
            return new String(llllllllllllllllIlIlllIlllIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlllIlllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlllIlllIllIII) {
            llllllllllllllllIlIlllIlllIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIllIllI(int n, int n2) {
        return n < n2;
    }

    static {
        a.lIIlIIIIllIIlI();
        a.lIIlIIIIllIIIl();
    }

    private static boolean lIIlIIIIllIlIl(int n) {
        return n != 0;
    }
}

