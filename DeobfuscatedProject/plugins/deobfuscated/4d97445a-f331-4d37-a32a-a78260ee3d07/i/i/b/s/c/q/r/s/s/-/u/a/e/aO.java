/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aH;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

@TaskDesc(name="Looting Valuables")
public class aO
extends Task {
    private final /* synthetic */ SquireLooter eG;
    private static /* synthetic */ int[] lIlIlIIlI;
    private static /* synthetic */ String[] lIlIlIIIl;
    private final /* synthetic */ LooterConfig eH;

    private static boolean lIIlIlIlIIl(int n2) {
        return n2 == 0;
    }

    private boolean b(TileItem tileItem) {
        String string = Static.getClient().getItemDefinition(tileItem.getId()).getName().toLowerCase();
        int n2 = Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity();
        return tileItem.getWorldLocation().equals((Object)this.eG.cj());
    }

    private static String lIIlIlIIIll(String llIIIIIIIIlIlll, String llIIIIIIIIlIllI) {
        llIIIIIIIIlIlll = new String(Base64.getDecoder().decode(llIIIIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIIIIIlIlIl = new StringBuilder();
        char[] llIIIIIIIIlIlII = llIIIIIIIIlIllI.toCharArray();
        int llIIIIIIIIlIIll = lIlIlIIlI[0];
        char[] llIIIIIIIIIllIl = llIIIIIIIIlIlll.toCharArray();
        int llIIIIIIIIIllII = llIIIIIIIIIllIl.length;
        int llIIIIIIIIIlIll = lIlIlIIlI[0];
        while (aO.lIIlIlIlIll(llIIIIIIIIIlIll, llIIIIIIIIIllII)) {
            char llIIIIIIIIllIII = llIIIIIIIIIllIl[llIIIIIIIIIlIll];
            llIIIIIIIIlIlIl.append((char)(llIIIIIIIIllIII ^ llIIIIIIIIlIlII[llIIIIIIIIlIIll % llIIIIIIIIlIlII.length]));
            0;
            ++llIIIIIIIIlIIll;
            ++llIIIIIIIIIlIll;
            0;
            if (1 < (0x4F ^ 0x4B)) continue;
            return null;
        }
        return String.valueOf(llIIIIIIIIlIlIl);
    }

    @Inject
    public aO(SquireLooter squireLooter, LooterConfig looterConfig) {
        this.eG = squireLooter;
        this.eH = looterConfig;
    }

    private static boolean lIIlIlIIllI(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        aO llIIIIIIIlIIllI;
        if (aO.lIIlIlIIllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlIlIIlI[0];
        }
        if (aO.lIIlIlIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIlIlIIlI[0];
        }
        Iterator<aH> llIIIIIIIlIIlIl = llIIIIIIIlIIllI.eG.p().iterator();
        while (aO.lIIlIlIIllI(llIIIIIIIlIIlIl.hasNext() ? 1 : 0)) {
            aH llIIIIIIIlIIlII = llIIIIIIIlIIlIl.next();
            int[] nArray = new int[lIlIlIIlI[1]];
            nArray[aO.lIlIlIIlI[0]] = llIIIIIIIlIIlII.P();
            TileItem llIIIIIIIlIIIll = TileItems.getFirstAt((WorldPoint)llIIIIIIIlIIlII.cd(), (int[])nArray);
            if (aO.lIIlIlIIlll(llIIIIIIIlIIIll)) {
                if (aO.lIIlIlIlIII(llIIIIIIIlIIIll.distanceTo(Players.getLocal().getWorldLocation()), llIIIIIIIlIIllI.eH.lootRange())) {
                    0;
                    if (-(0xB0 ^ 0xB5) < 0) continue;
                    return ((0x21 ^ 0x1D) & ~(0x1C ^ 0x20)) != 0;
                }
                if (aO.lIIlIlIlIIl(Inventory.isFull() ? 1 : 0)) {
                    llIIIIIIIlIIIll.interact(lIlIlIIIl[lIlIlIIlI[0]]);
                }
                if (aO.lIIlIlIIllI(Inventory.isFull() ? 1 : 0)) {
                    Item llIIIIIIIlIIIlI;
                    if (aO.lIIlIlIIllI(llIIIIIIIlIIIll.isStackable() ? 1 : 0)) {
                        int[] nArray2 = new int[lIlIlIIlI[1]];
                        nArray2[aO.lIlIlIIlI[0]] = llIIIIIIIlIIIll.getId();
                        if (aO.lIIlIlIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            llIIIIIIIlIIIll.interact(lIlIlIIIl[lIlIlIIlI[1]]);
                        }
                    }
                    if (aO.lIIlIlIlIlI(llIIIIIIIlIIIlI = Inventory.getFirst(item -> {
                        String[] stringArray = new String[lIlIlIIlI[1]];
                        stringArray[aO.lIlIlIIlI[0]] = lIlIlIIIl[lIlIlIIlI[3]];
                        return item.hasAction(stringArray);
                    }))) {
                        return lIlIlIIlI[0];
                    }
                    llIIIIIIIlIIIlI.interact(lIlIlIIIl[lIlIlIIlI[2]]);
                    return lIlIlIIlI[1];
                }
            }
            0;
            if (3 <= 3) continue;
            return ((0xD9 ^ 0x86 ^ (0x2C ^ 0x2B)) & (104 + 208 - 83 + 13 ^ 45 + 84 - 80 + 121 ^ -1)) != 0;
        }
        return lIlIlIIlI[1];
    }

    private static void lIIlIlIIlII() {
        lIlIlIIIl = new String[lIlIlIIlI[4]];
        aO.lIlIlIIIl[aO.lIlIlIIlI[0]] = aO."Take";
        aO.lIlIlIIIl[aO.lIlIlIIlI[1]] = aO."Take";
        aO.lIlIlIIIl[aO.lIlIlIIlI[2]] = aO."Eat";
        aO.lIlIlIIIl[aO.lIlIlIIlI[3]] = aO."Eat";
    }

    private static String lIIlIlIIIlI(String llIIIIIIIIIIIII, String llIIIIIIIIIIIIl) {
        try {
            SecretKeySpec llIIIIIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIIIIIIIlII = Cipher.getInstance("Blowfish");
            llIIIIIIIIIIlII.init(lIlIlIIlI[2], llIIIIIIIIIIlIl);
            return new String(llIIIIIIIIIIlII.doFinal(Base64.getDecoder().decode(llIIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIIIIIIIll) {
            llIIIIIIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlll(Object object) {
        return object != null;
    }

    private static void lIIlIlIIlIl() {
        lIlIlIIlI = new int[5];
        aO.lIlIlIIlI[0] = (215 + 210 - 390 + 187 ^ 149 + 134 - 111 + 21) & (7 + 36 - -86 + 19 ^ 23 + 2 - -46 + 68 ^ -1);
        aO.lIlIlIIlI[1] = 1;
        aO.lIlIlIIlI[2] = 2;
        aO.lIlIlIIlI[3] = 3;
        aO.lIlIlIIlI[4] = 0xBF ^ 0xBB;
    }

    private static boolean lIIlIlIlIII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        aO.lIIlIlIIlIl();
        aO.lIIlIlIIlII();
    }

    private static boolean lIIlIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIlIlI(Object object) {
        return object == null;
    }
}

