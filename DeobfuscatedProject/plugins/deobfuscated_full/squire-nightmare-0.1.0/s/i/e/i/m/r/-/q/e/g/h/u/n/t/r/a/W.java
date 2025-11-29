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

/* TASK: Collecting items -> CollectingitemsTask */
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

    private static String lIIlIIIlIlIlIIl(String var27, String var12) {
        try {
            SecretKeySpec var33 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(llllIllIIIll[4], var33);
            return new String(var16.doFinal(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIlIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIlIlIllll(Object object) {
        return object == null;
    }

    private static String lIIlIIIlIlIlIII(String var6, String var8) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var1 = var8.toCharArray();
        int var22 = llllIllIIIll[0];
        char[] var17 = var6.toCharArray();
        int var23 = var17.length;
        int var10 = llllIllIIIll[0];
        while (W.lIIlIIIlIllIIIl(var10, var23)) {
            char var20 = var17[var10];
            var4.append((char)(var20 ^ var1[var22 % var1.length]));
            0;
            ++var22;
            ++var10;
            0;
            
            return null;
        }
        return String.valueOf(var4);
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
        W var18;
        void var7;
        if (W.lIIlIIIlIllIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var30 = var7.getMessage();
        if (W.lIIlIIIlIlIllII(var30.contains(llllIllIIIlI[llllIllIIIll[21]]) ? 1 : 0)) {
            var18.cW.k(llllIllIIIll[1]);
            return;
        }
        if (W.lIIlIIIlIlIllII(var30.contains(llllIllIIIlI[llllIllIIIll[22]]) ? 1 : 0) && W.lIIlIIIlIlIllII(Inventory.isFull() ? 1 : 0)) {
            var18.dA.bi();
            0;
            if (W.lIIlIIIlIlIllIl(Inventory.isFull() ? 1 : 0)) {
                return;
            }
            EquipmentSetup var14 = ((BankLoadout)var18.cV.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
            if (W.lIIlIIIlIlIllIl(var14.isFullyEquipped() ? 1 : 0)) {
                Log.info((String)llllIllIIIlI[llllIllIIIll[23]]);
                var14.swap();
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
        W var2;
        if (W.lIIlIIIlIlIllII(this.cV.useFireSpells() ? 1 : 0)) {
            this.cW.t(llllIllIIIll[1]);
        }
        var2.cW.k(llllIllIIIll[0]);
        int[] nArray = new int[llllIllIIIll[1]];
        nArray[W.llllIllIIIll[0]] = llllIllIIIll[17];
        Item var21 = Inventory.getFirst((int[])nArray);
        if (W.lIIlIIIlIlIllll(var21)) {
            int[] nArray2 = new int[llllIllIIIll[1]];
            nArray2[W.llllIllIIIll[0]] = llllIllIIIll[18];
            var21 = Inventory.getFirst((int[])nArray2);
        }
        var2.cW.b(llllIllIIIll[1]);
        if (W.lIIlIIIlIlIlllI(var21)) {
            String[] stringArray = new String[llllIllIIIll[4]];
            stringArray[W.llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[19]];
            stringArray[W.llllIllIIIll[1]] = llllIllIIIlI[llllIllIIIll[20]];
            var21.interact(stringArray);
        }
        return llllIllIIIll[1];
    }

    private static String lIIlIIIlIlIIlll(String var26, String var19) {
        try {
            SecretKeySpec var28 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), llllIllIIIll[10]), "DES");
            Cipher var32 = Cipher.getInstance("DES");
            var32.init(llllIllIIIll[4], var28);
            return new String(var32.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
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
        String var29;
        EquipmentSetup var9;
        W var5;
        if (W.lIIlIIIlIlIllII(Dialog.isOpen() ? 1 : 0) && W.lIIlIIIlIlIllII(Dialog.getName().contains(llllIllIIIlI[llllIllIIIll[0]]) ? 1 : 0)) {
            this.cW.k(llllIllIIIll[1]);
        }
        if (W.lIIlIIIlIlIllIl(var5.cW.ad() ? 1 : 0)) {
            return llllIllIIIll[0];
        }
        if (W.lIIlIIIlIlIllII(Bank.isPinWindowOpen() ? 1 : 0)) {
            return Bank.enterBankPin();
        }
        if (W.lIIlIIIlIlIllIl(Movement.shouldWalk() ? 1 : 0)) {
            return llllIllIIIll[0];
        }
        Widget var25 = var5.dz.getWidget(llllIllIIIll[2]);
        Widget var3 = var5.dz.getWidget(llllIllIIIll[3]);
        Widget var31 = Static.getClient().getWidget(WidgetInfo.DIALOG_NPC_TEXT);
        NPC var11 = NPCs.getNearest(nPC -> {
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
        if (!W.lIIlIIIlIlIlllI(var11) || W.lIIlIIIlIlIllIl(Reachable.isInteractable((Locatable)var11) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)dy);
            0;
            return llllIllIIIll[1];
        }
        if (W.lIIlIIIlIlIllIl(Widgets.isVisible((Widget)var3) ? 1 : 0) && W.lIIlIIIlIlIllIl(Widgets.isVisible((Widget)var25) ? 1 : 0) && W.lIIlIIIlIlIllIl(Widgets.isVisible((Widget)var31) ? 1 : 0) && W.lIIlIIIlIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            var11.interact(llllIllIIIlI[llllIllIIIll[1]]);
        }
        if (W.lIIlIIIlIlIllll(var9 = ((BankLoadout)var5.cV.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup())) {
            dv.info(llllIllIIIlI[llllIllIIIll[4]]);
            return llllIllIIIll[0];
        }
        if (W.lIIlIIIlIlIllIl(var9.isFullyEquipped() ? 1 : 0)) {
            Log.info((String)llllIllIIIlI[llllIllIIIll[5]]);
            var9.swap();
            var5.sleep(llllIllIIIll[4]);
        }
        if (W.lIIlIIIlIlIllII(var5.dA.bi() ? 1 : 0)) {
            var5.sleep(llllIllIIIll[1]);
            return llllIllIIIll[1];
        }
        if (W.lIIlIIIlIlIllII(Widgets.isVisible((Widget)var25) ? 1 : 0)) {
            var29 = var25.getText();
            String[] var15 = var29.split(llllIllIIIlI[llllIllIIIll[6]]);
            dv.debug(llllIllIIIlI[llllIllIIIll[7]], (Object)var29);
            dv.debug(llllIllIIIlI[llllIllIIIll[8]], Arrays.stream(var15).collect(Collectors.toList()));
            if (W.lIIlIIIlIlIllII(var15[llllIllIIIll[0]].contains(llllIllIIIlI[llllIllIIIll[9]]) ? 1 : 0)) {
                dv.debug(llllIllIIIlI[llllIllIIIll[10]]);
                var5.m();
                0;
                return llllIllIIIll[1];
            }
        }
        if (W.lIIlIIIlIlIllII(Inventory.isFull() ? 1 : 0)) {
            var29 = Inventory.getFirst(item -> {
                String[] stringArray = new String[llllIllIIIll[1]];
                stringArray[W.llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[24]];
                return item.hasAction(stringArray);
            });
            Object[] objectArray = new Object[llllIllIIIll[1]];
            objectArray[W.llllIllIIIll[0]] = var29;
            Log.info((String)llllIllIIIlI[llllIllIIIll[11]], (Object[])objectArray);
            if (W.lIIlIIIlIlIlllI(var29)) {
                var29.interact(llllIllIIIlI[llllIllIIIll[12]]);
            }
        }
        if (W.lIIlIIIlIlIllII(Widgets.isVisible((Widget)var3) ? 1 : 0)) {
            String[] stringArray = new String[llllIllIIIll[4]];
            stringArray[W.llllIllIIIll[0]] = llllIllIIIlI[llllIllIIIll[13]];
            stringArray[W.llllIllIIIll[1]] = llllIllIIIlI[llllIllIIIll[14]];
            var3.interact(stringArray);
            if (W.lIIlIIIlIlIllII(Bank.isPinWindowOpen() ? 1 : 0)) {
                return Bank.enterBankPin();
            }
            return llllIllIIIll[1];
        }
        return llllIllIIIll[1];
    }
}

