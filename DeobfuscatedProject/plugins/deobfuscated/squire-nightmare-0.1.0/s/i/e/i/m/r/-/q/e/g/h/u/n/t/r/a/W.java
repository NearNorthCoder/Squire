/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.WidgetHiddenChanged
 *  net.runelite.api.util.Text
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.WidgetHiddenChanged;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.Y;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.l;

@TaskDesc(name="Collecting items", priority=0x7FFFFFFE, blocking=true, register=true)
public class W
extends Y {
    private final /* synthetic */ Client dz;
    private static final /* synthetic */ WorldPoint dy;
    private static final /* synthetic */ Logger dv;
    private final /* synthetic */ l dA;
    private static final /* synthetic */ int dx;
    private static /* synthetic */ String[] llllIllIIIlI;
    private static /* synthetic */ int[] llllIllIIIll;
    private static final /* synthetic */ int dw;

    private static String lIIlIIIlIlIlIIl(String lllllllllllllllIIlIllIIIIlIIlIll, String lllllllllllllllIIlIllIIIIlIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIIIlIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIIIlIIllIl.init(llllIllIIIll[4], lllllllllllllllIIlIllIIIIlIIlllI);
            return new String(lllllllllllllllIIlIllIIIIlIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIIIlIIllII) {
            lllllllllllllllIIlIllIIIIlIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIlIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIlIlIllll(Object object) {
        return object == null;
    }

    private static String lIIlIIIlIlIlIII(String lllllllllllllllIIlIllIIIIllIIIII, String lllllllllllllllIIlIllIIIIlIllIlI) {
        lllllllllllllllIIlIllIIIIllIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIIIlIllllI = new StringBuilder();
        char[] lllllllllllllllIIlIllIIIIlIlllIl = lllllllllllllllIIlIllIIIIlIllIlI.toCharArray();
        int lllllllllllllllIIlIllIIIIlIlllII = llllIllIIIll[0];
        char[] lllllllllllllllIIlIllIIIIlIlIllI = lllllllllllllllIIlIllIIIIllIIIII.toCharArray();
        int lllllllllllllllIIlIllIIIIlIlIlIl = lllllllllllllllIIlIllIIIIlIlIllI.length;
        int lllllllllllllllIIlIllIIIIlIlIlII = llllIllIIIll[0];
        while (W.lIIlIIIlIllIIIl(lllllllllllllllIIlIllIIIIlIlIlII, lllllllllllllllIIlIllIIIIlIlIlIl)) {
            char lllllllllllllllIIlIllIIIIllIIIIl = lllllllllllllllIIlIllIIIIlIlIllI[lllllllllllllllIIlIllIIIIlIlIlII];
            lllllllllllllllIIlIllIIIIlIllllI.append((char)(lllllllllllllllIIlIllIIIIllIIIIl ^ lllllllllllllllIIlIllIIIIlIlllIl[lllllllllllllllIIlIllIIIIlIlllII % lllllllllllllllIIlIllIIIIlIlllIl.length]));
            0;
            ++lllllllllllllllIIlIllIIIIlIlllII;
            ++lllllllllllllllIIlIllIIIIlIlIlII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIIIIlIllllI);
    }

    private static void lIIlIIIlIlIlIll() {
        llllIllIIIll = new int[30];
        W.llllIllIIIll[0] = (6 ^ 0x52) & ~(0xF2 ^ 0xA6);
        W.llllIllIIIll[1] = 1;
        W.llllIllIIIll[2] = 0xFFFFDB0F & 0x25A24FA;
        W.llllIllIIIll[3] = 0xFFFF927F & 0x25A6D86;
        W.llllIllIIIll[4] = 2;
        W.llllIllIIIll[5] = 3;
        W.llllIllIIIll[6] = 0x64 ^ 0x60;
        W.llllIllIIIll[7] = 0xAD ^ 0xA8;
        W.llllIllIIIll[8] = 0xA9 ^ 0xAF;
        W.llllIllIIIll[9] = 0x53 ^ 0x14 ^ (0x76 ^ 0x36);
        W.llllIllIIIll[10] = 0x60 ^ 0x68;
        W.llllIllIIIll[11] = 41 + 58 - 27 + 56 ^ 73 + 55 - 118 + 127;
        W.llllIllIIIll[12] = 0x4B ^ 0x41;
        W.llllIllIIIll[13] = 0xAE ^ 0x89 ^ (0x2A ^ 6);
        W.llllIllIIIll[14] = 0xB2 ^ 0xBE;
        W.llllIllIIIll[15] = 39 + 106 - 69 + 60 ^ 50 + 117 - 83 + 49;
        W.llllIllIIIll[16] = 0x2F ^ 0x6E ^ (0x27 ^ 0x68);
        W.llllIllIIIll[17] = 0xFFFFD0BF & 0x3FDB;
        W.llllIllIIIll[18] = 0xFFFFF7DC & 0x5FA3;
        W.llllIllIIIll[19] = 0x8D ^ 0x82;
        W.llllIllIIIll[20] = 0xE1 ^ 0xAE ^ (0xC5 ^ 0x9A);
        W.llllIllIIIll[21] = 7 ^ 0x16;
        W.llllIllIIIll[22] = 0x91 ^ 0x83;
        W.llllIllIIIll[23] = 2 + 57 - -84 + 34 ^ 82 + 48 - 37 + 69;
        W.llllIllIIIll[24] = 100 + 30 - 81 + 82 ^ 137 + 58 - 176 + 132;
        W.llllIllIIIll[25] = 0x65 ^ 0x46 ^ (0x5D ^ 0x6B);
        W.llllIllIIIll[26] = 0xD3 ^ 0xC5;
        W.llllIllIIIll[27] = -(0xFFFFDD91 & 0x737F) & (0xFFFFDFFB & 0x7FF7);
        W.llllIllIIIll[28] = 0xFFFFFEB3 & 0x277D;
        W.llllIllIIIll[29] = 0x5C ^ 0x4B;
    }

    private static boolean lIIlIIIlIllIIII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        W lllllllllllllllIIlIllIIIIlllllIl;
        void lllllllllllllllIIlIllIIIIlllllII;
        if (W.lIIlIIIlIllIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String lllllllllllllllIIlIllIIIIllllIll = lllllllllllllllIIlIllIIIIlllllII.getMessage();
        if (W.lIIlIIIlIlIllII(lllllllllllllllIIlIllIIIIllllIll.contains(llllIllIIIlI[llllIllIIIll[21]]) ? 1 : 0)) {
            lllllllllllllllIIlIllIIIIlllllIl.cW.k(llllIllIIIll[1]);
            return;
        }
        if (W.lIIlIIIlIlIllII(lllllllllllllllIIlIllIIIIllllIll.contains(llllIllIIIlI[llllIllIIIll[22]]) ? 1 : 0) && W.lIIlIIIlIlIllII(Inventory.isFull() ? 1 : 0)) {
            lllllllllllllllIIlIllIIIIlllllIl.dA.bi();
            0;
            if (W.lIIlIIIlIlIllIl(Inventory.isFull() ? 1 : 0)) {
                return;
            }
            EquipmentSetup lllllllllllllllIIlIllIIIIllllIlI = ((BankLoadout)lllllllllllllllIIlIllIIIIlllllIl.cV.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
            if (W.lIIlIIIlIlIllIl(lllllllllllllllIIlIllIIIIllllIlI.isFullyEquipped() ? 1 : 0)) {
                Log.info((String)llllIllIIIlI[llllIllIIIll[23]]);
                lllllllllllllllIIlIllIIIIllllIlI.swap();
            }
        }
    }

    private static void lIIlIIIlIlIlIlI() {
        llllIllIIIlI = new String[llllIllIIIll[29]];
        W.llllIllIIIlI[W.llllIllIIIll[0]] = W."Sister Senga has some of your items";
        W.llllIllIIIlI[W.llllIllIIIll[1]] = W."Collect";
        W.llllIllIIIlI[W.llllIllIIIll[4]] = W."[DEATH COLLECTION] no melee gear selected, cannot collect items!";
        W.llllIllIIIlI[W.llllIllIIIll[5]] = W."[DEATH COLLECTION] Equipping melee gear";
        W.llllIllIIIlI[W.llllIllIIIll[6]] = W."<br>";
        W.llllIllIIIlI[W.llllIllIIIll[7]] = W."[death collection]loot collection widget text = {}";
        W.llllIllIIIlI[W.llllIllIIIll[8]] = W."[death collection]loot collection widget lines = {}";
        W.llllIllIIIlI[W.llllIllIIIll[9]] = W.">0<";
        W.llllIllIIIlI[W.llllIllIIIll[10]] = W."[DEATH COLLECTION] finished collection items...triggered by >0<";
        W.llllIllIIIlI[W.llllIllIIIll[11]] = W."Inventory is still full after equipping gear. Found: {}";
        W.llllIllIIIlI[W.llllIllIIIll[12]] = W."Drop";
        W.llllIllIIIlI[W.llllIllIIIll[13]] = W."Unlock";
        W.llllIllIIIlI[W.llllIllIIIll[14]] = W."Take-All";
        W.llllIllIIIlI[W.llllIllIIIll[15]] = W."don't have anything for you";
        W.llllIllIIIlI[W.llllIllIIIll[16]] = W."[DEATH COLLECTION] (onWidgetHiddenChanged) finished collection items...";
        W.llllIllIIIlI[W.llllIllIIIll[19]] = W."Ver Sinhaza";
        W.llllIllIIIlI[W.llllIllIIIll[20]] = W."Empty";
        W.llllIllIIIlI[W.llllIllIIIll[21]] = W."has retrieved some of your items";
        W.llllIllIIIlI[W.llllIllIIIll[22]] = W."inventory is too full";
        W.llllIllIIIlI[W.llllIllIIIll[23]] = W."[DEATH COLLECTION] Equipping melee gear";
        W.llllIllIIIlI[W.llllIllIIIll[24]] = W."Eat";
        W.llllIllIIIlI[W.llllIllIIIll[25]] = W."Senga";
        W.llllIllIIIlI[W.llllIllIIIll[26]] = W."Collect";
    }

    private static boolean lIIlIIIlIlIlllI(Object object) {
        return object != null;
    }

    static {
        W.lIIlIIIlIlIlIll();
        W.lIIlIIIlIlIlIlI();
        dw = llllIllIIIll[3];
        dx = llllIllIIIll[2];
        dv = LoggerFactory.getLogger(W.class);
        dy = new WorldPoint(llllIllIIIll[27], llllIllIIIll[28], llllIllIIIll[1]);
    }

    private static boolean lIIlIIIlIlIllII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected W(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2, l l2, Client client) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dz = client;
        this.dA = l2;
    }

    public boolean m() {
        W lllllllllllllllIIlIllIIIlIIIIIll;
        if (W.lIIlIIIlIlIllII(this.cV.useFireSpells() ? 1 : 0)) {
            this.cW.t(llllIllIIIll[1]);
        }
        lllllllllllllllIIlIllIIIlIIIIIll.cW.k(llllIllIIIll[0]);
        int[] nArray = new int[llllIllIIIll[1]];
        nArray[W.llllIllIIIll[0]] = llllIllIIIll[17];
        Item lllllllllllllllIIlIllIIIlIIIIIlI = Inventory.getFirst((int[])nArray);
        if (W.lIIlIIIlIlIllll(lllllllllllllllIIlIllIIIlIIIIIlI)) {
            int[] nArray2 = new int[llllIllIIIll[1]];
            nArray2[W.llllIllIIIll[0]] = llllIllIIIll[18];
            lllllllllllllllIIlIllIIIlIIIIIlI = Inventory.getFirst((int[])nArray2);
        }
        lllllllllllllllIIlIllIIIlIIIIIll.cW.b(llllIllIIIll[1]);
        if (W.lIIlIIIlIlIlllI(lllllllllllllllIIlIllIIIlIIIIIlI)) {
            String[] stringArray = new String[llllIllIIIll[4]];
            stringArray[W.llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[19]];
            stringArray[W.llllIllIIIll[1]] = llllIllIIIlI[llllIllIIIll[20]];
            lllllllllllllllIIlIllIIIlIIIIIlI.interact(stringArray);
        }
        return llllIllIIIll[1];
    }

    private static String lIIlIIIlIlIIlll(String lllllllllllllllIIlIllIIIIlllIIII, String lllllllllllllllIIlIllIIIIllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIIllIllIl.getBytes(StandardCharsets.UTF_8)), llllIllIIIll[10]), "DES");
            Cipher lllllllllllllllIIlIllIIIIlllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIIIlllIIlI.init(llllIllIIIll[4], lllllllllllllllIIlIllIIIIlllIIll);
            return new String(lllllllllllllllIIlIllIIIIlllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIIIlllIIIl) {
            lllllllllllllllIIlIllIIIIlllIIIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(WidgetHiddenChanged widgetHiddenChanged) {
        if (W.lIIlIIIlIlIlllI(widgetHiddenChanged.getWidget().getText()) && W.lIIlIIIlIlIllII(Text.sanitizeMultilineText((String)widgetHiddenChanged.getWidget().getText().toLowerCase()).contains(llllIllIIIlI[llllIllIIIll[15]]) ? 1 : 0)) {
            dv.info(llllIllIIIlI[llllIllIIIll[16]]);
            this.m();
            0;
        }
    }

    private static boolean lIIlIIIlIlIllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean bY() {
        String lllllllllllllllIIlIllIIIlIIIlIll;
        EquipmentSetup lllllllllllllllIIlIllIIIlIIIllII;
        W lllllllllllllllIIlIllIIIlIIlIIIl;
        if (W.lIIlIIIlIlIllII(Dialog.isOpen() ? 1 : 0) && W.lIIlIIIlIlIllII(Dialog.getName().contains(llllIllIIIlI[llllIllIIIll[0]]) ? 1 : 0)) {
            this.cW.k(llllIllIIIll[1]);
        }
        if (W.lIIlIIIlIlIllIl(lllllllllllllllIIlIllIIIlIIlIIIl.cW.ad() ? 1 : 0)) {
            return llllIllIIIll[0];
        }
        if (W.lIIlIIIlIlIllII(Bank.isPinWindowOpen() ? 1 : 0)) {
            return Bank.enterBankPin();
        }
        if (W.lIIlIIIlIlIllIl(Movement.shouldWalk() ? 1 : 0)) {
            return llllIllIIIll[0];
        }
        Widget lllllllllllllllIIlIllIIIlIIlIIII = lllllllllllllllIIlIllIIIlIIlIIIl.dz.getWidget(llllIllIIIll[2]);
        Widget lllllllllllllllIIlIllIIIlIIIllll = lllllllllllllllIIlIllIIIlIIlIIIl.dz.getWidget(llllIllIIIll[3]);
        Widget lllllllllllllllIIlIllIIIlIIIlllI = Static.getClient().getWidget(WidgetInfo.DIALOG_NPC_TEXT);
        NPC lllllllllllllllIIlIllIIIlIIIllIl = NPCs.getNearest(nPC -> {
            int n2;
            if (W.lIIlIIIlIlIllII(nPC.getName().contains(llllIllIIIlI[llllIllIIIll[25]]) ? 1 : 0)) {
                String[] stringArray = new String[llllIllIIIll[1]];
                stringArray[W.llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[26]];
                if (W.lIIlIIIlIlIllII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llllIllIIIll[1];
                    0;
                    if (3 != -1) return n2 != 0;
                    return ((0xD3 ^ 0xA8 ^ (0x4D ^ 0x19)) & (35 + 59 - -56 + 28 ^ 99 + 18 - -8 + 32 ^ -1)) != 0;
                }
            }
            n2 = llllIllIIIll[0];
            return n2 != 0;
        });
        if (!W.lIIlIIIlIlIlllI(lllllllllllllllIIlIllIIIlIIIllIl) || W.lIIlIIIlIlIllIl(Reachable.isInteractable((Locatable)lllllllllllllllIIlIllIIIlIIIllIl) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)dy);
            0;
            return llllIllIIIll[1];
        }
        if (W.lIIlIIIlIlIllIl(Widgets.isVisible((Widget)lllllllllllllllIIlIllIIIlIIIllll) ? 1 : 0) && W.lIIlIIIlIlIllIl(Widgets.isVisible((Widget)lllllllllllllllIIlIllIIIlIIlIIII) ? 1 : 0) && W.lIIlIIIlIlIllIl(Widgets.isVisible((Widget)lllllllllllllllIIlIllIIIlIIIlllI) ? 1 : 0) && W.lIIlIIIlIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            lllllllllllllllIIlIllIIIlIIIllIl.interact(llllIllIIIlI[llllIllIIIll[1]]);
        }
        if (W.lIIlIIIlIlIllll(lllllllllllllllIIlIllIIIlIIIllII = ((BankLoadout)lllllllllllllllIIlIllIIIlIIlIIIl.cV.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup())) {
            dv.info(llllIllIIIlI[llllIllIIIll[4]]);
            return llllIllIIIll[0];
        }
        if (W.lIIlIIIlIlIllIl(lllllllllllllllIIlIllIIIlIIIllII.isFullyEquipped() ? 1 : 0)) {
            Log.info((String)llllIllIIIlI[llllIllIIIll[5]]);
            lllllllllllllllIIlIllIIIlIIIllII.swap();
            lllllllllllllllIIlIllIIIlIIlIIIl.sleep(llllIllIIIll[4]);
        }
        if (W.lIIlIIIlIlIllII(lllllllllllllllIIlIllIIIlIIlIIIl.dA.bi() ? 1 : 0)) {
            lllllllllllllllIIlIllIIIlIIlIIIl.sleep(llllIllIIIll[1]);
            return llllIllIIIll[1];
        }
        if (W.lIIlIIIlIlIllII(Widgets.isVisible((Widget)lllllllllllllllIIlIllIIIlIIlIIII) ? 1 : 0)) {
            lllllllllllllllIIlIllIIIlIIIlIll = lllllllllllllllIIlIllIIIlIIlIIII.getText();
            String[] lllllllllllllllIIlIllIIIlIIIlIlI = lllllllllllllllIIlIllIIIlIIIlIll.split(llllIllIIIlI[llllIllIIIll[6]]);
            dv.debug(llllIllIIIlI[llllIllIIIll[7]], (Object)lllllllllllllllIIlIllIIIlIIIlIll);
            dv.debug(llllIllIIIlI[llllIllIIIll[8]], Arrays.stream(lllllllllllllllIIlIllIIIlIIIlIlI).collect(Collectors.toList()));
            if (W.lIIlIIIlIlIllII(lllllllllllllllIIlIllIIIlIIIlIlI[llllIllIIIll[0]].contains(llllIllIIIlI[llllIllIIIll[9]]) ? 1 : 0)) {
                dv.debug(llllIllIIIlI[llllIllIIIll[10]]);
                lllllllllllllllIIlIllIIIlIIlIIIl.m();
                0;
                return llllIllIIIll[1];
            }
        }
        if (W.lIIlIIIlIlIllII(Inventory.isFull() ? 1 : 0)) {
            lllllllllllllllIIlIllIIIlIIIlIll = Inventory.getFirst(item -> {
                String[] stringArray = new String[llllIllIIIll[1]];
                stringArray[W.llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[24]];
                return item.hasAction(stringArray);
            });
            Object[] objectArray = new Object[llllIllIIIll[1]];
            objectArray[W.llllIllIIIll[0]] = lllllllllllllllIIlIllIIIlIIIlIll;
            Log.info((String)llllIllIIIlI[llllIllIIIll[11]], (Object[])objectArray);
            if (W.lIIlIIIlIlIlllI(lllllllllllllllIIlIllIIIlIIIlIll)) {
                lllllllllllllllIIlIllIIIlIIIlIll.interact(llllIllIIIlI[llllIllIIIll[12]]);
            }
        }
        if (W.lIIlIIIlIlIllII(Widgets.isVisible((Widget)lllllllllllllllIIlIllIIIlIIIllll) ? 1 : 0)) {
            String[] stringArray = new String[llllIllIIIll[4]];
            stringArray[W.llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[13]];
            stringArray[W.llllIllIIIll[1]] = llllIllIIIlI[llllIllIIIll[14]];
            lllllllllllllllIIlIllIIIlIIIllll.interact(stringArray);
            if (W.lIIlIIIlIlIllII(Bank.isPinWindowOpen() ? 1 : 0)) {
                return Bank.enterBankPin();
            }
            return llllIllIIIll[1];
        }
        return llllIllIIIll[1];
    }
}

