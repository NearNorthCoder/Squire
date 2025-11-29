/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.RunePouch
 *  net.unethicalite.api.magic.RunePouch$RuneSlot
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.RunePouch;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ck;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Claiming Death Items", priority=100, blocking=true, register=true)
public class cf
extends ck {
    private static /* synthetic */ String[] lIlllllllIl;
    private static final /* synthetic */ int hL;
    private final /* synthetic */ z hM;
    private static /* synthetic */ int[] lIlllllllll;
    private /* synthetic */ boolean hN;

    private static void lIIllIllllllll() {
        lIlllllllIl = new String[lIlllllllll[19]];
        cf.lIlllllllIl[cf.lIlllllllll[0]] = cf."[ClaimDeathItems] Pin window is open, waiting...";
        cf.lIlllllllIl[cf.lIlllllllll[1]] = cf."[ClaimDeathItems] Equipping kephri melee gear for space";
        cf.lIlllllllIl[cf.lIlllllllll[2]] = cf."[ClaimDeathItems] Trying to fill rune pouch for space";
        cf.lIlllllllIl[cf.lIlllllllll[4]] = cf."[ClaimDeathItems] Opening death chest";
        cf.lIlllllllIl[cf.lIlllllllll[6]] = cf."Claim";
        cf.lIlllllllIl[cf.lIlllllllll[7]] = cf."[ClaimDeathItems] Setting died to false";
        cf.lIlllllllIl[cf.lIlllllllll[8]] = cf."Unlock";
        cf.lIlllllllIl[cf.lIlllllllll[9]] = cf."[ClaimDeathItems] Unlocking death chest";
        cf.lIlllllllIl[cf.lIlllllllll[10]] = cf."Unlock";
        cf.lIlllllllIl[cf.lIlllllllll[11]] = cf."Take-All";
        cf.lIlllllllIl[cf.lIlllllllll[12]] = cf."[ClaimDeathItems] Taking all items from death chest";
        cf.lIlllllllIl[cf.lIlllllllll[13]] = cf."Take-All";
        cf.lIlllllllIl[cf.lIlllllllll[14]] = cf."Divine rune pouch";
        cf.lIlllllllIl[cf.lIlllllllll[15]] = cf."You failed to survive the Tombs";
        cf.lIlllllllIl[cf.lIlllllllll[16]] = cf."rune";
        cf.lIlllllllIl[cf.lIlllllllll[17]] = cf."rune pouch";
        cf.lIlllllllIl[cf.lIlllllllll[18]] = cf."rune";
    }

    @Override
    public boolean bl() {
        cf llllllllllllllllIlIIlIIIIllllIll;
        if (cf.lIIlllIIIIlIIl(this.hN ? 1 : 0)) {
            return lIlllllllll[0];
        }
        if (cf.lIIlllIIIIlIlI(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info((String)lIlllllllIl[lIlllllllll[0]]);
            return lIlllllllll[1];
        }
        if (cf.lIIlllIIIIlIlI(Dialog.canContinue() ? 1 : 0)) {
            llllllllllllllllIlIIlIIIIllllIll.hN = lIlllllllll[0];
            return lIlllllllll[0];
        }
        if (cf.lIIlllIIIIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption((int)lIlllllllll[2]);
            0;
            return lIlllllllll[1];
        }
        if (cf.lIIlllIIIIlIlI(Inventory.isFull() ? 1 : 0)) {
            ConfigStorageBox<EquipmentSetup> llllllllllllllllIlIIlIIIIllllIlI = llllllllllllllllIlIIlIIIIllllIll.hY.kephriMelee();
            int[] llllllllllllllllIlIIlIIIIllllIIl = llllllllllllllllIlIIlIIIIllllIll.hM.a(llllllllllllllllIlIIlIIIIllllIlI);
            if (cf.lIIlllIIIIlIlI(Inventory.contains((int[])llllllllllllllllIlIIlIIIIllllIIl) ? 1 : 0)) {
                Log.info((String)lIlllllllIl[lIlllllllll[1]]);
                llllllllllllllllIlIIlIIIIllllIll.hM.c(llllllllllllllllIlIIlIIIIllllIIl);
                0;
                0;
                if (2 >= (0x17 ^ 0x13)) {
                    return ((0x14 ^ 0x25) & ~(0x38 ^ 9)) != 0;
                }
            } else {
                Log.info((String)lIlllllllIl[lIlllllllll[2]]);
                llllllllllllllllIlIIlIIIIllllIll.cL();
            }
            return lIlllllllll[1];
        }
        Widget llllllllllllllllIlIIlIIIIllllIlI = Widgets.get((int)lIlllllllll[3], (int)lIlllllllll[4]);
        if (cf.lIIlllIIIIlIIl(Widgets.isVisible((Widget)llllllllllllllllIlIIlIIIIllllIlI) ? 1 : 0)) {
            Log.info((String)lIlllllllIl[lIlllllllll[4]]);
            int[] nArray = new int[lIlllllllll[1]];
            nArray[cf.lIlllllllll[0]] = lIlllllllll[5];
            TileObject llllllllllllllllIlIIlIIIIllllIIl = TileObjects.getNearest((int[])nArray);
            if (cf.lIIlllIIIIlIll(llllllllllllllllIlIIlIIIIllllIIl)) {
                return lIlllllllll[0];
            }
            llllllllllllllllIlIIlIIIIllllIIl.interact(lIlllllllIl[lIlllllllll[6]]);
            return lIlllllllll[1];
        }
        Widget[] llllllllllllllllIlIIlIIIIllllIIl = llllllllllllllllIlIIlIIIIllllIlI.getChildren();
        if (!cf.lIIlllIIIIllII(llllllllllllllllIlIIlIIIIllllIIl) || !cf.lIIlllIIIIlIlI(llllllllllllllllIlIIlIIIIllllIIl.length) || cf.lIIlllIIIIlIlI(llllllllllllllllIlIIlIIIIllllIll.a(llllllllllllllllIlIIlIIIIllllIIl) ? 1 : 0)) {
            Log.info((String)lIlllllllIl[lIlllllllll[7]]);
            llllllllllllllllIlIIlIIIIllllIll.hN = lIlllllllll[0];
            return lIlllllllll[1];
        }
        Widget llllllllllllllllIlIIlIIIIllllIII = Widgets.get((int)lIlllllllll[3], (int)lIlllllllll[8]);
        if (cf.lIIlllIIIIlIlI(Widgets.isVisible((Widget)llllllllllllllllIlIIlIIIIllllIII) ? 1 : 0)) {
            String[] stringArray = new String[lIlllllllll[1]];
            stringArray[cf.lIlllllllll[0]] = lIlllllllIl[lIlllllllll[8]];
            if (cf.lIIlllIIIIlIlI(llllllllllllllllIlIIlIIIIllllIII.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)lIlllllllIl[lIlllllllll[9]]);
                llllllllllllllllIlIIlIIIIllllIII.interact(lIlllllllIl[lIlllllllll[10]]);
                return lIlllllllll[1];
            }
        }
        if (cf.lIIlllIIIIlIlI(Widgets.isVisible((Widget)llllllllllllllllIlIIlIIIIllllIII) ? 1 : 0)) {
            String[] stringArray = new String[lIlllllllll[1]];
            stringArray[cf.lIlllllllll[0]] = lIlllllllIl[lIlllllllll[11]];
            if (cf.lIIlllIIIIlIlI(llllllllllllllllIlIIlIIIIllllIII.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)lIlllllllIl[lIlllllllll[12]]);
                llllllllllllllllIlIIlIIIIllllIII.interact(lIlllllllIl[lIlllllllll[13]]);
                return lIlllllllll[1];
            }
        }
        return lIlllllllll[0];
    }

    private static String lIIllIlllllllI(String llllllllllllllllIlIIlIIIIlIIIIll, String llllllllllllllllIlIIlIIIIlIIIlll) {
        llllllllllllllllIlIIlIIIIlIIIIll = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIlIIIIlIIIllI = new StringBuilder();
        char[] llllllllllllllllIlIIlIIIIlIIIlIl = llllllllllllllllIlIIlIIIIlIIIlll.toCharArray();
        int llllllllllllllllIlIIlIIIIlIIIlII = lIlllllllll[0];
        char[] llllllllllllllllIlIIlIIIIIlllllI = llllllllllllllllIlIIlIIIIlIIIIll.toCharArray();
        int llllllllllllllllIlIIlIIIIIllllIl = llllllllllllllllIlIIlIIIIIlllllI.length;
        int llllllllllllllllIlIIlIIIIIllllII = lIlllllllll[0];
        while (cf.lIIlllIIIIllIl(llllllllllllllllIlIIlIIIIIllllII, llllllllllllllllIlIIlIIIIIllllIl)) {
            char llllllllllllllllIlIIlIIIIlIIlIIl = llllllllllllllllIlIIlIIIIIlllllI[llllllllllllllllIlIIlIIIIIllllII];
            llllllllllllllllIlIIlIIIIlIIIllI.append((char)(llllllllllllllllIlIIlIIIIlIIlIIl ^ llllllllllllllllIlIIlIIIIlIIIlIl[llllllllllllllllIlIIlIIIIlIIIlII % llllllllllllllllIlIIlIIIIlIIIlIl.length]));
            0;
            ++llllllllllllllllIlIIlIIIIlIIIlII;
            ++llllllllllllllllIlIIlIIIIIllllII;
            0;
            if ((0x7D ^ 0x79) != 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIlIIIIlIIIllI);
    }

    private static String lIIllIllllllII(String llllllllllllllllIlIIlIIIIIllIIll, String llllllllllllllllIlIIlIIIIIllIIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIIIIIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), lIlllllllll[10]), "DES");
            Cipher llllllllllllllllIlIIlIIIIIllIlIl = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIIIIIllIlIl.init(lIlllllllll[2], llllllllllllllllIlIIlIIIIIllIllI);
            return new String(llllllllllllllllIlIIlIIIIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIIIIIllIlII) {
            llllllllllllllllIlIIlIIIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIllIllllllIl(String llllllllllllllllIlIIlIIIIlIlIllI, String llllllllllllllllIlIIlIIIIlIlIlIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIIIIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlIIIIlIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlIIIIlIllIlI.init(lIlllllllll[2], llllllllllllllllIlIIlIIIIlIllIll);
            return new String(llllllllllllllllIlIIlIIIIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIIIIlIllIIl) {
            llllllllllllllllIlIIlIIIIlIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIIIIlllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlllIIIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlllIIIIIllI() {
        lIlllllllll = new int[20];
        cf.lIlllllllll[0] = (189 + 13 - 127 + 169 ^ 123 + 158 - 259 + 145) & (53 + 24 - 28 + 193 ^ 108 + 76 - 91 + 68 ^ -1);
        cf.lIlllllllll[1] = 1;
        cf.lIlllllllll[2] = 2;
        cf.lIlllllllll[3] = -(0xFFFFF4E5 & 0x7B3F) & (0xFFFFFA7F & 0x77FE);
        cf.lIlllllllll[4] = 3;
        cf.lIlllllllll[5] = 0xFFFFF7FE & 0xBBFF;
        cf.lIlllllllll[6] = 0x70 ^ 0x74;
        cf.lIlllllllll[7] = 0x8E ^ 0x8B;
        cf.lIlllllllll[8] = 0x32 ^ 0x34;
        cf.lIlllllllll[9] = 0x1F ^ 0x29 ^ (0x4E ^ 0x7F);
        cf.lIlllllllll[10] = 141 + 106 - 136 + 75 ^ 16 + 72 - -12 + 78;
        cf.lIlllllllll[11] = 75 + 25 - 99 + 144 ^ 75 + 17 - -23 + 37;
        cf.lIlllllllll[12] = 0x94 ^ 0x9E;
        cf.lIlllllllll[13] = 0xB9 ^ 0xB2;
        cf.lIlllllllll[14] = 0x95 ^ 0x99;
        cf.lIlllllllll[15] = 0xBA ^ 0xB7;
        cf.lIlllllllll[16] = 0x3E ^ 0x30;
        cf.lIlllllllll[17] = 0x84 ^ 0xBC ^ (0x65 ^ 0x52);
        cf.lIlllllllll[18] = 47 + 109 - 72 + 62 ^ 24 + 64 - 8 + 50;
        cf.lIlllllllll[19] = 0xBB ^ 0xAA;
    }

    @Inject
    protected cf(Client client, TOAConfig tOAConfig, z z2) {
        super(client, tOAConfig);
        this.hM = z2;
    }

    private void cL() {
        int n2;
        if (cf.lIIlllIIIIlIIl(RunePouch.hasPouch() ? 1 : 0)) {
            return;
        }
        if (cf.lIIlllIIIIlIIl(Inventory.contains(item -> item.getName().toLowerCase().endsWith(lIlllllllIl[lIlllllllll[18]])) ? 1 : 0)) {
            return;
        }
        Item llllllllllllllllIlIIlIIIIlllIIlI = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlllllllIl[lIlllllllll[17]]));
        String[] stringArray = new String[lIlllllllll[1]];
        stringArray[cf.lIlllllllll[0]] = lIlllllllIl[lIlllllllll[14]];
        if (cf.lIIlllIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            n2 = lIlllllllll[6];
            0;
            if (3 <= 0) {
                return;
            }
        } else {
            n2 = lIlllllllll[4];
        }
        int llllllllllllllllIlIIlIIIIlllIIIl = n2;
        int llllllllllllllllIlIIlIIIIlllIIII = lIlllllllll[0];
        while (cf.lIIlllIIIIllIl(llllllllllllllllIlIIlIIIIlllIIII, llllllllllllllllIlIIlIIIIlllIIIl)) {
            RunePouch.RuneSlot llllllllllllllllIlIIlIIIIllIllll = RunePouch.RuneSlot.values()[llllllllllllllllIlIIlIIIIlllIIII];
            if (cf.lIIlllIIIIlllI(llllllllllllllllIlIIlIIIIllIllll.getQuantity())) {
                0;
                if (-3 > 0) {
                    return;
                }
            } else {
                Item llllllllllllllllIlIIlIIIIllIlllI = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(lIlllllllIl[lIlllllllll[16]]));
                if (cf.lIIlllIIIIlIll(llllllllllllllllIlIIlIIIIllIlllI)) {
                    return;
                }
                llllllllllllllllIlIIlIIIIllIlllI.useOn(llllllllllllllllIlIIlIIIIlllIIlI);
                return;
            }
            ++llllllllllllllllIlIIlIIIIlllIIII;
            0;
            if (1 > ((210 + 44 - 176 + 172 ^ 100 + 122 - 158 + 115) & (0x91 ^ 0x8D ^ (0x52 ^ 7) ^ -1))) continue;
            return;
        }
    }

    static {
        cf.lIIlllIIIIIllI();
        cf.lIIllIllllllll();
        hL = lIlllllllll[5];
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (cf.lIIlllIIIIlIlI(chatMessage.getMessage().contains(lIlllllllIl[lIlllllllll[15]]) ? 1 : 0)) {
            this.hN = lIlllllllll[1];
        }
    }

    private static boolean lIIlllIIIIlIll(Object object) {
        return object == null;
    }

    private static boolean lIIlllIIIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIIIIllII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Widget[] widgetArray) {
        void llllllllllllllllIlIIlIIIIllIIllI;
        Widget[] widgetArray2 = widgetArray;
        int n2 = widgetArray2.length;
        int llllllllllllllllIlIIlIIIIllIIlIl = lIlllllllll[0];
        while (cf.lIIlllIIIIllIl(llllllllllllllllIlIIlIIIIllIIlIl, (int)llllllllllllllllIlIIlIIIIllIIllI)) {
            void llllllllllllllllIlIIlIIIIllIIlll;
            void llllllllllllllllIlIIlIIIIllIIlII = llllllllllllllllIlIIlIIIIllIIlll[llllllllllllllllIlIIlIIIIllIIlIl];
            if (cf.lIIlllIIIIlIlI(Widgets.isVisible((Widget)llllllllllllllllIlIIlIIIIllIIlII) ? 1 : 0)) {
                return lIlllllllll[0];
            }
            ++llllllllllllllllIlIIlIIIIllIIlIl;
            0;
            if (null == null) continue;
            return ((0x8E ^ 0xC0) & ~(0xB ^ 0x45)) != 0;
        }
        return lIlllllllll[1];
    }
}

