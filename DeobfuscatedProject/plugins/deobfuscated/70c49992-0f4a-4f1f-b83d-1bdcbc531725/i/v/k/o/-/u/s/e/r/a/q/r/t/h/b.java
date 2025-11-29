/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.RunePouch
 *  net.unethicalite.api.magic.RunePouch$RuneSlot
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.RunePouch;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Claiming death items", priority=125, register=true, blocking=true)
public class b
extends Task {
    private final /* synthetic */ SquireVorkathPlugin x;
    private static /* synthetic */ int[] lIlIlIlIlIllI;
    private static final /* synthetic */ int u;
    private final /* synthetic */ SquireVorkathConfig y;
    private static final /* synthetic */ int w;
    private static final /* synthetic */ int t;
    private static /* synthetic */ String[] lIlIlIlIlIIll;
    private static final /* synthetic */ int v;

    private static String lIllllllIIIIIII(String llllllllllllllIllIlIlIlIlIIllIll, String llllllllllllllIllIlIlIlIlIIllIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIlIlIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlIlIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIlIlIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIlIlIIlllll.init(lIlIlIlIlIllI[2], llllllllllllllIllIlIlIlIlIlIIIII);
            return new String(llllllllllllllIllIlIlIlIlIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIlIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIlIlIIllllI) {
            llllllllllllllIllIlIlIlIlIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIlIllI(Object object) {
        return object != null;
    }

    private static boolean lIllllllIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllIIllIII(int n2) {
        return n2 > 0;
    }

    @Inject
    public b(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig) {
        this.x = squireVorkathPlugin;
        this.y = squireVorkathConfig;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (b.lIllllllIIlIlII(chatMessage.getMessage().contains(lIlIlIlIlIIll[lIlIlIlIlIllI[14]]) ? 1 : 0)) {
            this.x.b(lIlIlIlIlIllI[1]);
        }
    }

    private static String lIllllllIIIIIlI(String llllllllllllllIllIlIlIlIlIIIlIII, String llllllllllllllIllIlIlIlIlIIIIlll) {
        llllllllllllllIllIlIlIlIlIIIlIII = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIlIlIIIlIll = new StringBuilder();
        char[] llllllllllllllIllIlIlIlIlIIIlIlI = llllllllllllllIllIlIlIlIlIIIIlll.toCharArray();
        int llllllllllllllIllIlIlIlIlIIIlIIl = lIlIlIlIlIllI[0];
        char[] llllllllllllllIllIlIlIlIlIIIIIll = llllllllllllllIllIlIlIlIlIIIlIII.toCharArray();
        int llllllllllllllIllIlIlIlIlIIIIIlI = llllllllllllllIllIlIlIlIlIIIIIll.length;
        int llllllllllllllIllIlIlIlIlIIIIIIl = lIlIlIlIlIllI[0];
        while (b.lIllllllIIlIlll(llllllllllllllIllIlIlIlIlIIIIIIl, llllllllllllllIllIlIlIlIlIIIIIlI)) {
            char llllllllllllllIllIlIlIlIlIIIlllI = llllllllllllllIllIlIlIlIlIIIIIll[llllllllllllllIllIlIlIlIlIIIIIIl];
            llllllllllllllIllIlIlIlIlIIIlIll.append((char)(llllllllllllllIllIlIlIlIlIIIlllI ^ llllllllllllllIllIlIlIlIlIIIlIlI[llllllllllllllIllIlIlIlIlIIIlIIl % llllllllllllllIllIlIlIlIlIIIlIlI.length]));
            0;
            ++llllllllllllllIllIlIlIlIlIIIlIIl;
            ++llllllllllllllIllIlIlIlIlIIIIIIl;
            0;
            if ((0x11 ^ 0xF ^ (0x5D ^ 0x46)) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlIlIlIIIlIll);
    }

    private static boolean lIllllllIIlIlIl(Object object) {
        return object == null;
    }

    private void h() {
        int n2;
        if (b.lIllllllIIlIIll(RunePouch.hasPouch() ? 1 : 0)) {
            return;
        }
        if (b.lIllllllIIlIIll(Inventory.contains(item -> item.getName().toLowerCase().endsWith(lIlIlIlIlIIll[lIlIlIlIlIllI[17]])) ? 1 : 0)) {
            return;
        }
        Item llllllllllllllIllIlIlIlIlIlllIIl = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIlIlIlIIll[lIlIlIlIlIllI[16]]));
        String[] stringArray = new String[lIlIlIlIlIllI[1]];
        stringArray[b.lIlIlIlIlIllI[0]] = lIlIlIlIlIIll[lIlIlIlIlIllI[13]];
        if (b.lIllllllIIlIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            n2 = lIlIlIlIlIllI[5];
            0;
            if (((47 + 131 - 89 + 54 ^ 155 + 91 - 157 + 78) & (0x68 ^ 0x4E ^ (0x8E ^ 0x80) ^ -1)) != 0) {
                return;
            }
        } else {
            n2 = lIlIlIlIlIllI[4];
        }
        int llllllllllllllIllIlIlIlIlIlllIII = n2;
        int llllllllllllllIllIlIlIlIlIllIlll = lIlIlIlIlIllI[0];
        while (b.lIllllllIIlIlll(llllllllllllllIllIlIlIlIlIllIlll, llllllllllllllIllIlIlIlIlIlllIII)) {
            RunePouch.RuneSlot llllllllllllllIllIlIlIlIlIllIllI = RunePouch.RuneSlot.values()[llllllllllllllIllIlIlIlIlIllIlll];
            if (b.lIllllllIIllIII(llllllllllllllIllIlIlIlIlIllIllI.getQuantity())) {
                0;
                if (null != null) {
                    return;
                }
            } else {
                Item llllllllllllllIllIlIlIlIlIllIlIl = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(lIlIlIlIlIIll[lIlIlIlIlIllI[15]]));
                if (b.lIllllllIIlIlIl(llllllllllllllIllIlIlIlIlIllIlIl)) {
                    return;
                }
                llllllllllllllIllIlIlIlIlIllIlIl.useOn(llllllllllllllIllIlIlIlIlIlllIIl);
                return;
            }
            ++llllllllllllllIllIlIlIlIlIllIlll;
            0;
            if (-1 != 2) continue;
            return;
        }
    }

    private static void lIllllllIIlIIlI() {
        lIlIlIlIlIllI = new int[22];
        b.lIlIlIlIlIllI[0] = (0x4C ^ 0x7B ^ 2) & (0xCC ^ 0x99 ^ (0x44 ^ 0x24) ^ -1);
        b.lIlIlIlIlIllI[1] = 1;
        b.lIlIlIlIlIllI[2] = 2;
        b.lIlIlIlIlIllI[3] = -(0xFFFFEBE6 & 0x7D9F) & (0xFFFFEFDF & 0x7BFF);
        b.lIlIlIlIlIllI[4] = 3;
        b.lIlIlIlIlIllI[5] = 0x3C ^ 0x38;
        b.lIlIlIlIlIllI[6] = 0xBF ^ 0xBA;
        b.lIlIlIlIlIllI[7] = 0x1C ^ 0x41 ^ (0x22 ^ 0x79);
        b.lIlIlIlIlIllI[8] = 0x3A ^ 0x3D;
        b.lIlIlIlIlIllI[9] = 0x61 ^ 0x69;
        b.lIlIlIlIlIllI[10] = 0x68 ^ 0x61;
        b.lIlIlIlIlIllI[11] = 0x4C ^ 0x46;
        b.lIlIlIlIlIllI[12] = 90 + 156 - 144 + 89 ^ 131 + 18 - 56 + 87;
        b.lIlIlIlIlIllI[13] = 0xCD ^ 0xC1;
        b.lIlIlIlIlIllI[14] = 0xB5 ^ 0x8C ^ (0x8B ^ 0xBF);
        b.lIlIlIlIlIllI[15] = 33 + 102 - 100 + 104 ^ 102 + 55 - 59 + 35;
        b.lIlIlIlIlIllI[16] = 0xCD ^ 0xC2;
        b.lIlIlIlIlIllI[17] = 0xD ^ 0x1D;
        b.lIlIlIlIlIllI[18] = 0xD4 ^ 0x9C ^ (0x35 ^ 0x6C);
        b.lIlIlIlIlIllI[19] = 35 + 184 - 125 + 115 ^ 81 + 168 - 89 + 35;
        b.lIlIlIlIlIllI[20] = 0xFFFFBBFF & 0xF7FE;
        b.lIlIlIlIlIllI[21] = 0xAF ^ 0xBC;
    }

    private static void lIllllllIIIIlll() {
        lIlIlIlIlIIll = new String[lIlIlIlIlIllI[21]];
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[0]] = b."in window is open, waiting...";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[1]] = b."Equipping gear for space";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[2]] = b."Trying to fill rune pouch for space";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[4]] = b."Opening death torfih";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[5]] = b."Collect";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[6]] = b."Setting died to false";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[7]] = b."Unlock";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[8]] = b."Unlocking death chest";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[9]] = b."Unlock";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[10]] = b."Take-All";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[11]] = b."Taking all items from death chest";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[12]] = b."Take-All";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[13]] = b."Divine rune pouch";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[14]] = b."You have items stored in an item retrieval";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[15]] = b."rune";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[16]] = b."rune pouch";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[17]] = b."rune";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[18]] = b."Collect";
        b.lIlIlIlIlIIll[b.lIlIlIlIlIllI[19]] = b."Torfinn";
    }

    private static String lIllllllIIIIIIl(String llllllllllllllIllIlIlIlIIllllIII, String llllllllllllllIllIlIlIlIIlllIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIlIIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlIIlllIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIllI[9]), "DES");
            Cipher llllllllllllllIllIlIlIlIIllllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIlIIllllIlI.init(lIlIlIlIlIllI[2], llllllllllllllIllIlIlIlIIllllIll);
            return new String(llllllllllllllIllIlIlIlIIllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIlIIllllIIl) {
            llllllllllllllIllIlIlIlIIllllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllllIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        b.lIllllllIIlIIlI();
        b.lIllllllIIIIlll();
        w = lIlIlIlIlIllI[20];
        v = lIlIlIlIlIllI[7];
        u = lIlIlIlIlIllI[4];
        t = lIlIlIlIlIllI[3];
    }

    public boolean run() {
        b llllllllllllllIllIlIlIlIllIIIIlI;
        if (b.lIllllllIIlIIll(this.x.f() ? 1 : 0)) {
            return lIlIlIlIlIllI[0];
        }
        if (b.lIllllllIIlIlII(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[0]]);
            return lIlIlIlIlIllI[1];
        }
        if (b.lIllllllIIlIlII(Dialog.canContinue() ? 1 : 0)) {
            llllllllllllllIllIlIlIlIllIIIIlI.x.b(lIlIlIlIlIllI[0]);
            return lIlIlIlIlIllI[0];
        }
        if (b.lIllllllIIlIlII(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption((int)lIlIlIlIlIllI[2]);
            0;
            return lIlIlIlIlIllI[1];
        }
        if (b.lIllllllIIlIlII(Inventory.isFull() ? 1 : 0)) {
            EquipmentSetup llllllllllllllIllIlIlIlIllIIIIIl = ((BankLoadout)llllllllllllllIllIlIlIlIllIIIIlI.y.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
            int[] llllllllllllllIllIlIlIlIllIIIIII = llllllllllllllIllIlIlIlIllIIIIIl.getIds();
            if (b.lIllllllIIlIlII(Inventory.contains((int[])llllllllllllllIllIlIlIlIllIIIIII) ? 1 : 0)) {
                Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[1]]);
                Gear.swapTo((int[])llllllllllllllIllIlIlIlIllIIIIII);
                0;
                0;
                if (null != null) {
                    return ((2 + 74 - -52 + 13 ^ 74 + 16 - 32 + 92) & (133 + 94 - 151 + 65 ^ 131 + 133 - 174 + 60 ^ -1)) != 0;
                }
            } else {
                Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[2]]);
                llllllllllllllIllIlIlIlIllIIIIlI.h();
            }
            return lIlIlIlIlIllI[1];
        }
        Widget llllllllllllllIllIlIlIlIllIIIIIl = Widgets.get((int)lIlIlIlIlIllI[3], (int)lIlIlIlIlIllI[4]);
        if (b.lIllllllIIlIIll(Widgets.isVisible((Widget)llllllllllllllIllIlIlIlIllIIIIIl) ? 1 : 0)) {
            Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[4]]);
            NPC llllllllllllllIllIlIlIlIllIIIIII = NPCs.getNearest(nPC -> {
                int n2;
                String[] stringArray = new String[lIlIlIlIlIllI[1]];
                stringArray[b.lIlIlIlIlIllI[0]] = lIlIlIlIlIIll[lIlIlIlIlIllI[18]];
                if (b.lIllllllIIlIlII(nPC.hasAction(stringArray) ? 1 : 0) && b.lIllllllIIlIlII(nPC.getName().equals(lIlIlIlIlIIll[lIlIlIlIlIllI[19]]) ? 1 : 0)) {
                    n2 = lIlIlIlIlIllI[1];
                    0;
                    if ((2 ^ (0x99 ^ 0x9F)) < 0) {
                        return ((210 + 242 - 447 + 246 ^ 146 + 130 - 189 + 94) & (126 + 80 - 175 + 187 ^ 75 + 142 - 88 + 19 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIlIlIlIllI[0];
                }
                return n2 != 0;
            });
            if (b.lIllllllIIlIlIl(llllllllllllllIllIlIlIlIllIIIIII)) {
                return lIlIlIlIlIllI[0];
            }
            llllllllllllllIllIlIlIlIllIIIIII.interact(lIlIlIlIlIIll[lIlIlIlIlIllI[5]]);
            return lIlIlIlIlIllI[1];
        }
        Widget[] llllllllllllllIllIlIlIlIllIIIIII = llllllllllllllIllIlIlIlIllIIIIIl.getChildren();
        if (!b.lIllllllIIlIllI(llllllllllllllIllIlIlIlIllIIIIII) || !b.lIllllllIIlIlII(llllllllllllllIllIlIlIlIllIIIIII.length) || b.lIllllllIIlIlII(llllllllllllllIllIlIlIlIllIIIIlI.a(llllllllllllllIllIlIlIlIllIIIIII) ? 1 : 0)) {
            Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[6]]);
            llllllllllllllIllIlIlIlIllIIIIlI.x.b(lIlIlIlIlIllI[0]);
            return lIlIlIlIlIllI[1];
        }
        Widget llllllllllllllIllIlIlIlIlIllllll = Widgets.get((int)lIlIlIlIlIllI[3], (int)lIlIlIlIlIllI[7]);
        if (b.lIllllllIIlIlII(Widgets.isVisible((Widget)llllllllllllllIllIlIlIlIlIllllll) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIlIlIllI[1]];
            stringArray[b.lIlIlIlIlIllI[0]] = lIlIlIlIlIIll[lIlIlIlIlIllI[7]];
            if (b.lIllllllIIlIlII(llllllllllllllIllIlIlIlIlIllllll.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[8]]);
                llllllllllllllIllIlIlIlIlIllllll.interact(lIlIlIlIlIIll[lIlIlIlIlIllI[9]]);
                return lIlIlIlIlIllI[1];
            }
        }
        if (b.lIllllllIIlIlII(Widgets.isVisible((Widget)llllllllllllllIllIlIlIlIlIllllll) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIlIlIllI[1]];
            stringArray[b.lIlIlIlIlIllI[0]] = lIlIlIlIlIIll[lIlIlIlIlIllI[10]];
            if (b.lIllllllIIlIlII(llllllllllllllIllIlIlIlIlIllllll.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)lIlIlIlIlIIll[lIlIlIlIlIllI[11]]);
                llllllllllllllIllIlIlIlIlIllllll.interact(lIlIlIlIlIIll[lIlIlIlIlIllI[12]]);
                return lIlIlIlIlIllI[1];
            }
        }
        return lIlIlIlIlIllI[0];
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Widget[] widgetArray) {
        void llllllllllllllIllIlIlIlIlIlIllIl;
        Widget[] widgetArray2 = widgetArray;
        int n2 = widgetArray2.length;
        int llllllllllllllIllIlIlIlIlIlIllII = lIlIlIlIlIllI[0];
        while (b.lIllllllIIlIlll(llllllllllllllIllIlIlIlIlIlIllII, (int)llllllllllllllIllIlIlIlIlIlIllIl)) {
            void llllllllllllllIllIlIlIlIlIlIlllI;
            void llllllllllllllIllIlIlIlIlIlIlIll = llllllllllllllIllIlIlIlIlIlIlllI[llllllllllllllIllIlIlIlIlIlIllII];
            if (b.lIllllllIIlIlII(Widgets.isVisible((Widget)llllllllllllllIllIlIlIlIlIlIlIll) ? 1 : 0)) {
                return lIlIlIlIlIllI[0];
            }
            ++llllllllllllllIllIlIlIlIlIlIllII;
            0;
            if ((0x13 ^ 0x70 ^ (0x47 ^ 0x20)) >= 0) continue;
            return ((50 + 132 - 166 + 125 ^ 24 + 113 - 16 + 62) & (0x93 ^ 0x95 ^ (0x25 ^ 0x19) ^ -1)) != 0;
        }
        return lIlIlIlIlIllI[1];
    }
}

